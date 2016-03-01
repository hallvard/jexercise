package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Control;

public abstract class EObjectEditorAdapterImpl<E extends EObject, V extends Control> extends EObjectUIAdapterImpl<E, V> implements EObjectUIAdapter<E, V> {

	public EObjectEditorAdapterImpl(E eObject) {
		super(eObject);
	}
}
