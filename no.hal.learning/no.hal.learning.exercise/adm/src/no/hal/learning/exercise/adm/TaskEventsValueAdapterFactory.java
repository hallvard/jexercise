package no.hal.learning.exercise.adm;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

public class TaskEventsValueAdapterFactory extends AdapterFactoryImpl {
	
	public static TaskEventsValueAdapterFactory INSTANCE = new TaskEventsValueAdapterFactory();
	
	@Override
	public boolean isFactoryForType(Object type) {
		if (type instanceof AbstractTaskEventsValueProvider) {
			type = type.getClass();
		}
		if (type instanceof Class<?> && AbstractTaskEventsValueProvider.class.isAssignableFrom((Class<?>) type)) {
			return true;
		}
		return super.isFactoryForType(type);
	}
	
	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		AbstractTaskEventsValueProvider<?> taskEventsValueProvider = null;
		if (type instanceof AbstractTaskEventsValueProvider<?>) {
			taskEventsValueProvider = (AbstractTaskEventsValueProvider<?>) type;
		} else if (type instanceof Class<?> && AbstractTaskEventsValueProvider.class.isAssignableFrom((Class<?>) type)) {
			try {
				taskEventsValueProvider = ((AbstractTaskEventsValueProvider<?>) ((Class<?>) type).newInstance());
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			}
		}
		if (taskEventsValueProvider == null) {
			TaskEventsValueAdapter taskEventsValueAdapter = new TaskEventsValueAdapter();
			taskEventsValueAdapter.setValueProvider(taskEventsValueProvider);
			return taskEventsValueAdapter;
		}
		return null;
	}
}
