package no.hal.learning.sharing.emfs;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.ImportSpec;
import no.hal.learning.sharing.runtime.PublishingAdapter;

public class EmfsPublishingAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return PublishingAdapter.class.equals(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof ImportSpec || target instanceof EmfsResource) {
			return new EmfsPublishingAdapter();
		}
		return null;
	}
}
