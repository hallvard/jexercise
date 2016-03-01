package no.hal.emf.ui.utils;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;

public class ActionButtonController extends SelectionAdapter implements IPropertyChangeListener {

	private final Button button;
	private Action action;
	
	public ActionButtonController(Button button, Action action) {
		this.button = button;
		setAction(action);
		button.addSelectionListener(this);
	}

	protected void setAction(Action action) {
		if (this.action != null) {
			this.action.removePropertyChangeListener(this);
		}
		this.action = action;
		if (this.action != null) {
			action.addPropertyChangeListener(this);			
		}
		updateButton(null);
	}
	
	protected void updateButton(Object property) {
		if (property == null || Action.IMAGE.equals(property)) {
			ImageRegistry imageRegistry = Activator.getDefault().getImageRegistry();
			Image image = imageRegistry.get(action.getId());
			if (image == null) {
				imageRegistry.put(action.getId(), action.getImageDescriptor());
				image = imageRegistry.get(action.getId());
			}
			button.setImage(image);
		}
		if (property == null || Action.ENABLED.equals(property)) {
			button.setEnabled(action.isEnabled());
		}
		if (property == null || Action.TEXT.equals(property)) {
			button.setText(action.getText());
		}
		if (property == null || Action.TOOL_TIP_TEXT.equals(property)) {
			button.setToolTipText(action.getToolTipText());
		}
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		action.run();
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {
		updateButton(event.getProperty());
	}
}
