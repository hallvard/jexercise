package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.TaskEvent;

public class TaskEventMinTimeReducer extends AbstractTaskEventValueReducer {

	public final static AbstractTaskEventValueReducer INSTANCE = new TaskEventMinTimeReducer();

	@Override
	public void init() {
		value = Long.MAX_VALUE;
	}
	
	@Override
	public void reduce(TaskEvent event) {
		if (event.getTimestamp() < value) {
			value = event.getTimestamp();
		}
	}
}
