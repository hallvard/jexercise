package no.hal.learning.exercise.adm.util;

import java.util.List;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;

public abstract class AbstractTaskEventValueReducer extends AbstractTaskEventsValueProvider<Long> {

	protected long value;
	
	public void init() {
		value = 0;
	}
	
	public Long getTaskEventsValue(List<? extends TaskEvent> taskEvents) {
		if (taskEvents == null) {
			return null;
		}
		init();
		for (TaskEvent taskEvent : getSortedTaskEvents(taskEvents)) {
			reduce(taskEvent);
		}
		return getValue();
	}

	protected List<? extends TaskEvent> getSortedTaskEvents(List<? extends TaskEvent> taskEvents) {
		return getTaskEvents(taskEvents, TaskEvent.class, true);
	}

	public abstract void reduce(TaskEvent event);
	
	public long getValue() {
		return value;
	}
	
	@Override
	public int compareTaskEventsValues(Long v1, Long v2) {
		return compareValues(v1, v2);
	}
}
