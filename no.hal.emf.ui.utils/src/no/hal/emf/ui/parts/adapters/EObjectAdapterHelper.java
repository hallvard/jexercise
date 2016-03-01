package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class EObjectAdapterHelper {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	public ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public <T> T getAdapter(EObject eObject, Class<T> adapterClass) {
		return (T) EcoreUtil.getAdapter(eObject.eAdapters(), adapterClass);
	}
	
	public <T> T adapt(EObject eObject, Class<T> adapterClass) {
		return (T) getAdapterFactory().adapt(eObject, adapterClass);
	}
}
