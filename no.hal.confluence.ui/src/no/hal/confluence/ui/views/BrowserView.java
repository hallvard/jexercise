package no.hal.confluence.ui.views;

import org.eclipse.swt.widgets.Control;

public interface BrowserView {
	public Control getControl();
	public String getLocation();
	public String getContent();
}
