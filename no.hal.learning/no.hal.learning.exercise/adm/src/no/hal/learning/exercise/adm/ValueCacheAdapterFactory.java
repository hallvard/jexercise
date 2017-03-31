package no.hal.learning.exercise.adm;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class ValueCacheAdapterFactory extends AdapterFactoryImpl {
	
	public final static AdapterFactory INSTANCE = new ValueCacheAdapterFactory();

	@Override
	public boolean isFactoryForType(Object type) {
		return ValueCacheAdapter.class.equals(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		if (ValueCacheAdapter.class.equals(type)) {
			return new ValueCacheAdapter();
		}
		return super.createAdapter(target, type);
	}
}
