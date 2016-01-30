package no.hal.learning.sharing.ui.views.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.sharing.ShareModel;

public class SharingViewerAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ShareModel) {
			return new ShareModelViewerAdapter((ShareModel) target);
		}
		return null;
	}
}
