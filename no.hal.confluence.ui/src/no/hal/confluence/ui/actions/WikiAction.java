package no.hal.confluence.ui.actions;

import no.hal.confluence.ui.views.BrowserView;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;

public abstract class WikiAction extends Action {

	protected String urlPattern = null;
	
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	
	protected IProgressMonitor progressMonitor = null;
	
	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.progressMonitor = progressMonitor;
	}

	protected BrowserView browserView;
	
	public void update(BrowserView browserView) {
		this.browserView = browserView;
		update(browserView.getLocation());
	}
	
	protected void update(String urlString) {
		setEnabled(urlPattern == null || matchUrl(urlString));
	}

	protected boolean matchUrl(String urlString) {
		return urlString != null && urlString.matches(urlPattern);
	}
}
