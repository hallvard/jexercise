package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import no.hal.learning.exercise.AbstractStringEditEvent;

public abstract class StringEditAdapter<T> extends AdapterImpl {

	private final Class<T> clazz;
	
	protected StringEditAdapter(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type.equals(clazz);
	}
	
	protected T adapter;
	
	public abstract T getStringEditAdapter(AbstractStringEditEvent editEvent);

	public T getStringEditAdapter() {
		if (adapter == null) {
			adapter = getStringEditAdapter((AbstractStringEditEvent) getTarget());
		}
		return adapter;
	}
}
