package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.TaskEvent;

public abstract class AbstractTaskEventValueReducer {

	protected long value;
	
	public void init() {
		value = 0;
	}
	
	public abstract void reduce(TaskEvent event);
	
	public long getValue() {
		return value;
	}
}
