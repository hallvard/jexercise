package no.hal.confluence.ui.views;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchSite;

public interface BrowserView {
	public IWorkbenchSite getSite();
	public Control getControl();
	public String getLocation();
	public String getContent();
}
