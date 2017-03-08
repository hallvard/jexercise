package no.hal.learning.exercise.adm.util;

import java.util.Collections;
import java.util.List;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsCellLabel;
import no.hal.learning.exercise.util.Util;

public class TimeUsageCellLabel extends AbstractTaskEventsCellLabel {

	@Override
	public String getTaskEventsText(Object o) {
		Long value = getTaskEventsValue(o);
		return (value != null ? Long.toString(value) : null);
	}

	private TaskEventTimeAccumulatorReducer taskEventTimeAccumulator = new TaskEventTimeAccumulatorReducer(5);
	
	protected Long getTaskEventsValue(Object o) {
		if (o == null) {
			return null;
		}
		List<TaskEvent> taskEvents = super.getAllTaskEvents(o);
		if (taskEvents == null) {
			return null;
		}
		Collections.sort(taskEvents, Util.TASK_EVENT_TIMESTAMP_COMPARATOR);
		taskEventTimeAccumulator.init();
		for (TaskEvent taskEvent : taskEvents) {
			taskEventTimeAccumulator.reduce(taskEvent);
		}
		return taskEventTimeAccumulator.getValue() / (1000 * 60);
	}
	
	public int compareTaskEventsValues(Object o1, Object o2) {
		return -compareValues(getTaskEventsValue(o1), getTaskEventsValue(o2));
	}
}
