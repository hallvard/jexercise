package no.hal.confluence.ui.views;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class ConfluenceWikiOverView extends ViewPart implements BrowserView, LocationListener, ProgressListener {

	public final static String VIEW_ID = "no.hal.jex.views.WikiOverView";
	
	private Browser browser;
		
	private WikiPageView wikiPageView;

	public void createPartControl(final Composite parent) {
		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
		wikiPageView = new WikiPageView();
		wikiPageView.createControls(sashForm);
		browser = new Browser(sashForm, SWT.BORDER);
		sashForm.setWeights(new int[]{10, 90});
		addActions();
		browser.addProgressListener(this);
		wikiPageView.setBrowser(browser);
	}
	
	public String getLocation() {
		return browser.getUrl();
	}
	
	public String getContent() {
		return browser.getText();
	}

	public Control getControl() {
		return browser;
	}

	//

	@Override
	public void dispose() {
		super.dispose();
		if (browser != null && (! browser.isDisposed())) {
			browser.removeProgressListener(this);
			browser.dispose();
			browser = null;
		}
	}

	@Override
	public void setFocus() {
		wikiPageView.setFocus();
	}
	
	protected void addActions() {
		IActionBars actionBars = getViewSite().getActionBars();
		IMenuManager menuManager = actionBars.getMenuManager();
		menuManager.add(new Action("Refresh") {
			@Override
			public void run() {
				wikiPageView.refresh();
			}
		});
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
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
	}

	@Override
	public void completed(ProgressEvent progressEvent) {
	}
}