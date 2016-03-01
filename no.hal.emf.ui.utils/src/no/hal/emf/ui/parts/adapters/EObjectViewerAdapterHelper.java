package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class EObjectViewerAdapterHelper extends EObjectAdapterHelper {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	public EObjectViewerAdapter<?, ?> getViewerAdapter(EObject eObject, Class<?> adapterClass) {
		return (EObjectViewerAdapter<?, ?>) adapterFactory.adapt(eObject, adapterClass);
	}

	public Control initView(EObject eObject, Class<?> adapterClass, Composite parent) {
		EObjectViewerAdapter<?, ?> adapter = getViewerAdapter(eObject, adapterClass);
		if (adapter != null) {
			adapter.setAdapterHelper(this);
			return adapter.initView(parent);
		}
		return null;
	}

	public boolean updateView(EObject eObject, Class<? extends EObjectViewerAdapter<?, ?>> adapterClass) {
		EObjectViewerAdapter<?, ?> adapter = getAdapter(eObject, adapterClass);
		if (adapter != null) {
			adapter.updateView();
			return true;
		}
		return false;
	}

	public void updateView(Iterable<? extends EObject> eObjects, Class<? extends EObjectViewerAdapter<?, ?>> adapterClass) {
		for (EObject eObject : eObjects) {
			updateView(eObject, adapterClass);
		}
	}
}
