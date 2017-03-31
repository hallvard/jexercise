package no.hal.learning.exercise.adm;

import java.util.List;

import org.eclipse.emf.common.notify.Notifier;

import no.hal.learning.exercise.TaskEvent;

public class TaskEventsValueCellLabel<V> extends AbstractTaskEventsCellLabel<V> {

	private AbstractTaskEventsValueProvider<V> taskEventsValue;

	public void setTaskEventsValue(AbstractTaskEventsValueProvider<V> taskEventsValue) {
		this.taskEventsValue = taskEventsValue;
	}

	protected V getTaskEventsValue(Object o) {
		ValueCacheAdapter valueCache = null;
		if (o instanceof Notifier) {
			valueCache = (ValueCacheAdapter) ValueCacheAdapterFactory.INSTANCE.adapt((Notifier) o, ValueCacheAdapter.class);
		}
		if (valueCache != null) {
			Object value = valueCache.getValue(getCacheKey());
			if (value != null) {
				return (V) value;
			}
		}
		List<? extends TaskEvent> taskEvents = getTaskEvents(o);
		if (taskEvents != null) {
			V value = taskEventsValue.getTaskEventsValue(taskEvents);
			if (value != null && valueCache != null) {
				valueCache.putValue(getCacheKey(), value);
			}
			return value;
		}
		return null;
	}

	public Object getCacheKey() {
		return taskEventsValue;
	}

	public String getTaskEventsText(Object o) {
		V value = getTaskEventsValue(o);
		return (value != null ? String.format(getLabelFormat(), value) : null);
	}
	
	public int compareTaskEventsValues(Object o1, Object o2) {
		V v1 = getTaskEventsValue(o1);
		V v2 = getTaskEventsValue(o2);
		return taskEventsValue.compareTaskEventsValues(v1, v2);
	}
}
