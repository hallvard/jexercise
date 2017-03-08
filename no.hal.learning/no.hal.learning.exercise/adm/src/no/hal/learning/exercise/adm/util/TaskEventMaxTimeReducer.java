package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.TaskEvent;

public class TaskEventMaxTimeReducer extends AbstractTaskEventValueReducer {

	public final static AbstractTaskEventValueReducer INSTANCE = new TaskEventMaxTimeReducer();

	@Override
	public void init() {
		value = Long.MIN_VALUE;
	}
	
	@Override
	public void reduce(TaskEvent event) {
		if (event.getTimestamp() > value) {
			value = event.getTimestamp();
		}
	}
}
