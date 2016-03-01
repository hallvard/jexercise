package no.hal.emf.ui.utils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ToggleButtonGroup implements Listener {

	private final Control[] controls;
	
	public ToggleButtonGroup(Control... controls) {
		this.controls = controls;
		for (int i = 0; i < controls.length; i++) {
			Control child = controls[i];
			if (isToggleButton(child)) {
				((Button) child).addListener(SWT.Selection, this);
			}
		}
	}

	public ToggleButtonGroup(Composite composite) {
		this(composite.getChildren());
	}

	@Override
	public void handleEvent(Event e) {
		for (int i = 0; i < controls.length; i++) {
			Control child = controls[i];
			if (e.widget != child && isToggleButton(child)) {
				((Button) child).setSelection(false);
			}
		}
		((Button) e.widget).setSelection(true);
	}
	
	protected boolean isToggleButton(Control control) {
		return control instanceof Button && (control.getStyle() & SWT.TOGGLE) != 0;
	}
}
