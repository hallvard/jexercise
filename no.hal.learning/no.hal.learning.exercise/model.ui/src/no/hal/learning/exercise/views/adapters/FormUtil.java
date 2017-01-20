package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class FormUtil {

	public static FormToolkit getFormToolkit(Composite parent) {
		Composite composite = parent;
		while (composite != null) {
			Object data = composite.getData("toolkit");
			if (data instanceof FormToolkit) {
				return (FormToolkit) data;
			}
			composite = composite.getParent();
		}
		FormToolkit formToolkit = new FormToolkit(parent.getDisplay());
		parent.setData("toolkit", formToolkit);
		return formToolkit;
	}
	
	public static void relayoutForm(Control control) {
		Composite composite = control.getParent();
		while (composite != null) {
			if (composite instanceof Form) {
				((Form) composite).layout(true);
				break;
			}
			composite = composite.getParent();
		}
	}
}
