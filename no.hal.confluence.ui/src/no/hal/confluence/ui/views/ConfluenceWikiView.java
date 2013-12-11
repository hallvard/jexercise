package no.hal.confluence.ui.views;

import no.hal.confluence.ui.Activator;
import no.hal.confluence.ui.preferences.WikiPreferencePage;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.internal.browser.BrowserViewer;
import org.eclipse.ui.part.ViewPart;

public class ConfluenceWikiView extends ViewPart implements BrowserView, LocationListener, ProgressListener {

	public final static String VIEW_ID = "no.hal.jex.views.ExerciseWikiView";
	
	private BrowserViewer browserViewer;
		
	public ConfluenceWikiView() {
	}
	
	public void createPartControl(final Composite parent) {
		browserViewer = new BrowserViewer(parent, BrowserViewer.BUTTON_BAR | BrowserViewer.LOCATION_BAR);
		addActions();
		browserViewer.getBrowser().addProgressListener(this);
		Preferences pluginPreferences = Activator.getDefault().getPluginPreferences();
		browserViewer.setURL(pluginPreferences.getString(WikiPreferencePage.WIKI_URL));
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
	
	protected void addActions() {
		IActionBars actionBars = getViewSite().getActionBars();
		IMenuManager menuManager = actionBars.getMenuManager();
		for (Action wikiAction : Activator.getDefault().getWikiActions()) {
			menuManager.add(wikiAction);
		}
//		IToolBarManager toolBarManager = actionBars.getToolBarManager();
	}
	
	// location listener, notified when URL changes
	
	@Override
	public void changed(LocationEvent locationEvent) {
	}
	
	@Override
	public void changing(LocationEvent locationEvent) {
		String wikiActionUrlPrefix = "wikiAction:";
		String location = locationEvent.location;
		if (location.startsWith(wikiActionUrlPrefix)) {
			String wikiActionName = location.substring(wikiActionUrlPrefix.length());
			int count = 1, fragmentPos = wikiActionName.indexOf('#');
			if (fragmentPos >= 0) {
				count = Integer.valueOf(wikiActionName.substring(fragmentPos + 1));
				wikiActionName = wikiActionName.substring(0, fragmentPos);
			}
			locationEvent.doit = false;
			for (Action wikiAction : Activator.getDefault().getWikiActions()) {
				if (wikiActionName.equals(wikiAction.getText())) {
					System.out.println(location);
				}
			}
		} else {
			setWikiActionsEnablement(false);
		}
	}

	private void setWikiActionsEnablement(boolean enabled) {
		for (WikiAction wikiAction : Activator.getDefault().getWikiActions()) {
			wikiAction.setEnabled(enabled);
		}
	}

	// progress listener, notified during/after loading page

	@Override
	public void changed(ProgressEvent arg0) {
	}

	@Override
	public void completed(ProgressEvent progressEvent) {
		for (WikiAction wikiAction : Activator.getDefault().getWikiActions()) {
			wikiAction.update(ConfluenceWikiView.this);
		}
	}
}
