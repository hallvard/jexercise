package no.hal.confluence.ui.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.internal.browser.BrowserViewer;

public class WikiBrowserViewer extends BrowserViewer {

	public WikiBrowserViewer(Composite parent, int style) {
		super(parent, style);
	}

    public void setURL(String url, String xEclipseViewHeader) {
        if (browser!=null) {
        	browser.setUrl(url, null, new String[] {"Cache-Control: no-cache", "x-eclipse-view: " + xEclipseViewHeader});
        }
        addToHistory(url);
        updateHistory();
    }
}
