package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Control;

public interface EObjectUIAdapter<E extends EObject, V extends Control> extends EObjectViewerAdapter<E, V> {

	public void updateModel();
}
