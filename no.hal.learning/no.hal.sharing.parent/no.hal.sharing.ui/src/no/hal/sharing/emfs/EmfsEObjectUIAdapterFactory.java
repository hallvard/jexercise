package no.hal.sharing.emfs;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emfs.sync.PortSpec;

public class EmfsEObjectUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof PortSpec) {
			return new EmfsEObjectUIAdapter((PortSpec<?>) target);
		}
		return null;
	}
}
