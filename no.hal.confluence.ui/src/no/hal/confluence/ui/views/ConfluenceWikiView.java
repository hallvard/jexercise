package no.hal.confluence.ui.views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import no.hal.confluence.ui.Activator;
import no.hal.confluence.ui.preferences.WikiPreferencePage;
import no.hal.confluence.ui.resources.EmfsResourceExtractor;
import no.hal.confluence.ui.resources.util.AbstractResourceExtractor;
import no.hal.emfs.EmfsResource;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.internal.UIPlugin;
import org.eclipse.ui.part.ViewPart;

public class ConfluenceWikiView extends ViewPart implements BrowserView, LocationListener, ProgressListener {

	public final static String VIEW_ID = "no.hal.jex.views.ExerciseWikiView";
	
	private WikiBrowserViewer browserViewer;
		
	private EmfsImportView emfsImportView;
	
	private String initialUrl = null;
	
	public void createPartControl(final Composite parent) {
		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		emfsImportView = new EmfsImportView();
		emfsImportView.createControls(sashForm);
		browserViewer = new WikiBrowserViewer(sashForm, WikiBrowserViewer.BUTTON_BAR | WikiBrowserViewer.LOCATION_BAR);
		sashForm.setWeights(new int[]{10, 90});
//		sashForm.setMaximizedControl(browserViewer);
		addActions();
		browserViewer.getBrowser().addProgressListener(this);
		if (initialUrl != null) {
			browserViewer.setURL(initialUrl, VIEW_ID);
		}
	}
	
	public String getLocation() {
		return browserViewer.getBrowser().getUrl();
	}
	
	public String getContent() {
		return browserViewer.getBrowser().getText();
	}

	public Control getControl() {
		return browserViewer.getBrowser();
	}
	
	//
	
	public void saveState(IMemento memento) {
		super.saveState(memento);
		memento.putString(WikiPreferencePage.WIKI_URL, browserViewer.getURL());
	}

	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		if (memento != null) {
			initialUrl = memento.getString(WikiPreferencePage.WIKI_URL);
		}
		if (initialUrl == null) {
			IPreferenceStore pluginPreferences = Activator.getDefault().getPreferenceStore();
			initialUrl = pluginPreferences.getString(WikiPreferencePage.WIKI_URL);
		}
	}

	//

	@Override
	public void dispose() {
		super.dispose();
		if (browserViewer != null && (! browserViewer.isDisposed())) {
			browserViewer.getBrowser().removeProgressListener(this);
			browserViewer.dispose();
			browserViewer = null;
		}
	}

	@Override
	public void setFocus() {
		browserViewer.setFocus();
	}
	
	private int debugLoggingMask = IStatus.INFO | IStatus.WARNING;
	
	protected void addActions() {
		IActionBars actionBars = getViewSite().getActionBars();
		IMenuManager menuManager = actionBars.getMenuManager();
		menuManager.add(new Action("Toggle debug logging") {
			@Override
			public void run() {
				if (Activator.isLogging(debugLoggingMask)) {
					Activator.logOff(debugLoggingMask);
				} else {
					Activator.logOn(debugLoggingMask);
				}
			}
		});
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		toolBarManager.add(emfsImportView.getImportAction());
		Action refreshAction = new Action("Refresh", ImageDescriptor.createFromFile(UIPlugin.class, "/icons/full/elcl16/refresh_nav.png")) {
			@Override
			public void run() {
				updateEmfsResource(false);
			}
		};
		toolBarManager.add(refreshAction);
		Action clearAction = emfsImportView.getClearAction();
		if (clearAction != null) {
			clearEmfsResourceOnChange = false;
			toolBarManager.add(clearAction);
		}
	}
	
	// location listener, notified when URL changes
	
	@Override
	public void changed(LocationEvent locationEvent) {
	}
	
	@Override
	public void changing(LocationEvent locationEvent) {
	}

	// progress listener, notified during/after loading page

	@Override
	public void changed(ProgressEvent progressEvent) {
//		updateEmfsResource(true);
	}

	@Override
	public void completed(ProgressEvent progressEvent) {
		updateEmfsResource(false);
	}

	private boolean clearEmfsResourceOnChange = true; 
	
	private static String domScript = "return new XMLSerializer().serializeToString(document);";

	public void updateEmfsResource(boolean domOnly) {
		String content = null, domContent = null;
		Collection<EmfsResource> extractedResources = new ArrayList<EmfsResource>();
		Collection<EmfsResourceExtractor> resourceExtractors = Activator.getDefault().getEmfsResourceExtractors();
		Activator.logInfo("Updating emfs resource for " + getLocation() + " using " + resourceExtractors);
		for (EmfsResourceExtractor resourceExtractor : resourceExtractors) {
			String s = null;
			try {
				if (resourceExtractor.useDomAsSource()) {
					if (domContent == null) {
						domContent = String.valueOf(browserViewer.getBrowser().evaluate(domScript));
					}
					s = domContent;
				} else if (! domOnly) {
					if (content == null) {
						// content = getContent();
						// the following workaround is needed because when using IE as the
						// internal browser, the HTML we receive from getContent() is not as expected
						// thus we have to get it manually
						try {
							URL url = new URL(getLocation());
							BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
							StringBuilder contentBuilder = new StringBuilder();
							String line = null;
							while ((line = bufferedReader.readLine()) != null) {
								contentBuilder.append(line);
								contentBuilder.append('\n');
							}
							bufferedReader.close();
							content = contentBuilder.toString();
						} catch (IOException e) {
							Activator.logError("Exception when getting web page source using a stream for " + resourceExtractor, e);
						}
					}
					s = content;
				}
			} catch (SWTException e) {
				Activator.logError("Exception when getting web page " + (resourceExtractor.useDomAsSource() ? "DOM" : "source") + " for " + resourceExtractor, e);
			}
			if (s != null) {
				try {
					boolean added = resourceExtractor.addResources(s, extractedResources);
					Activator.logInfo(resourceExtractor + (added ? " added" : " did not add") + " emfs resources");
				} catch (Exception e) {
					Activator.logError("Exception when calling addResource method of " + resourceExtractor, e);
				}
			} else {
				Activator.logWarning("No web page contents for " + resourceExtractor, null);
			}
		}
		emfsImportView.updateEmfsResource(extractedResources, clearEmfsResourceOnChange && (! domOnly));
	}
}