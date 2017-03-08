package no.hal.learning.exercise.adm;

import java.util.Collection;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.util.AbstractTaskEventValueReducer;

public class TaskEventsValueReducerCellLabel extends AbstractTaskEventsCellLabel {

	protected final AbstractTaskEventValueReducer reducer;
	protected final String format;
	
	public TaskEventsValueReducerCellLabel(AbstractTaskEventValueReducer reducer, String format) {
		this.format = format;
		this.reducer = reducer;
	}

	@Override
	public String getTaskEventsText(Object o) {
		Long value = getTaskEventsValue(o);
		return (value != null ? String.format(format, value) : null);
	}

	public Long getTaskEventsValue(Object o) {
		if (o == null) {
			return null;
		}
		Collection<TaskEvent> taskEvents = getAllTaskEvents(o);
		if (taskEvents == null) {
			return null;
		}
		reducer.init();
		for (TaskEvent taskEvent : taskEvents) {
			reducer.reduce(taskEvent);
		}
		return reducer.getValue();
	}
	
	public int compareTaskEventsValues(Object o1, Object o2) {
		return compareValues(getTaskEventsValue(o1), getTaskEventsValue(o2));
	}
}
