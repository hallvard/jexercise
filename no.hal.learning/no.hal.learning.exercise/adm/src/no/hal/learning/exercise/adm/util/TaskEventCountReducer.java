package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.TaskEvent;

public class TaskEventCountReducer extends AbstractTaskEventValueReducer {

	public final static AbstractTaskEventValueReducer INSTANCE = new TaskEventCountReducer(null);
	
	private Class<? extends TaskEvent> eventClass;
	
	public TaskEventCountReducer(Class<? extends TaskEvent> eventClass) {
		this.eventClass = eventClass;
	}

	@Override
	public void reduce(TaskEvent event) {
		if (eventClass == null || eventClass.isInstance(event)) {
			value++;
		}
	}
}
