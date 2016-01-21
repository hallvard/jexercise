package no.hal.learning.sharing.ui.views.util;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

public class IdAction extends Action {

	public IdAction(String text, String id, ImageDescriptor image) {
		super(text, image);
		setId(id);
	}
}
