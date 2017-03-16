package no.hal.learning.exercise.adm.util;

import java.util.List;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;

public class EditTimeAccumulator extends TaskEventTimeAccumulator {

	protected List<AbstractStringEditEvent> getSortedTaskEvents(List<? extends TaskEvent> taskEvents) {
		return getTaskEvents(taskEvents, AbstractStringEditEvent.class, true);
	}
	
	@Override
	public long getValue() {
		// convert to minutes
		return value / (1000 * 60);
	}
}
