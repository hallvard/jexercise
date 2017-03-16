package no.hal.learning.exercise.adm;

import java.util.List;

import no.hal.learning.exercise.TaskEvent;

public class TaskEventsValueCellLabel<V> extends AbstractTaskEventsCellLabel<V> {

	private AbstractTaskEventsValueProvider<V> taskEventsValue;

	public void setTaskEventsValue(AbstractTaskEventsValueProvider<V> taskEventsValue) {
		this.taskEventsValue = taskEventsValue;
	}

	protected V getTaskEventsValue(Object o) {
		List<? extends TaskEvent> taskEvents = getTaskEvents(o);
		return (taskEvents != null ? taskEventsValue.getTaskEventsValue(taskEvents) : null);
	}

	public String getTaskEventsText(Object o) {
		V value = getTaskEventsValue(o);
		return (value != null ? String.format(getLabelFormat(), value) : null);
	}
	
	public int compareTaskEventsValues(Object o1, Object o2) {
		V v1 = taskEventsValue.getTaskEventsValue(getTaskEvents(o1));
		V v2 = taskEventsValue.getTaskEventsValue(getTaskEvents(o2));
		return taskEventsValue.compareTaskEventsValues(v1, v2);
	}
}
