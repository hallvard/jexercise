package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public interface EObjectViewerAdapter<E extends EObject, V extends Control> extends Adapter {
	
	public V initView(Composite parent);
	public V getView();
	public void updateView();
	public void dispose();
	
	public void setAdapterHelper(EObjectViewerAdapterHelper adapterHelper);
}
