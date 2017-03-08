package no.hal.learning.exercise.adm.util;

import no.hal.learning.exercise.TaskEvent;

public class TaskEventTimeAccumulatorReducer extends AbstractTaskEventValueReducer {

	public final static AbstractTaskEventValueReducer INSTANCE = new TaskEventTimeAccumulatorReducer();

	private final long maxDiff;

	public TaskEventTimeAccumulatorReducer(long maxDiffInMinutes) {
		this.maxDiff = 1000 * 60 * maxDiffInMinutes;
	}

	public TaskEventTimeAccumulatorReducer() {
		this(5); // default five minutes
	}

	private long lastValue; 
	
	@Override
	public void init() {
		value = 0;
		lastValue = 0;
	}
	
	@Override
	public void reduce(TaskEvent event) {
		long next = event.getTimestamp(), diff = next - lastValue;
		value += (diff > maxDiff ? maxDiff : diff);
		lastValue = next;
	}
}
