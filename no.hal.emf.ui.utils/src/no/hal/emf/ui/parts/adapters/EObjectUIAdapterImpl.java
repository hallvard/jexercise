package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Control;

public abstract class EObjectUIAdapterImpl<E extends EObject, V extends Control> extends EObjectViewerAdapterImpl<E, V> implements EObjectUIAdapter<E, V> {

	public EObjectUIAdapterImpl(E eObject) {
		super(eObject);
	}
}
