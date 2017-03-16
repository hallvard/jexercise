package no.hal.learning.exercise.adm.plots.util;

import java.util.List;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;
import no.hal.learning.exercise.adm.util.TaskEventTimeAccumulator;
import no.hal.learning.exercise.util.Util;

public class EditSizeTimeIntegral extends AbstractTaskEventsValueProvider<Long> {

	private TaskEventTimeAccumulator taskEventTimeAccumulator = new TaskEventTimeAccumulator(5);

	@Override
	public Long getTaskEventsValue(List<? extends TaskEvent> taskEvents) {
		if (taskEvents == null || taskEvents.isEmpty()) {
			return null;
		}
		List<AbstractStringEditEvent> editEvents = getTaskEvents(taskEvents, AbstractStringEditEvent.class, true);
		long editTime = 0;
		taskEventTimeAccumulator.init();
		for (AbstractStringEditEvent editEvent : editEvents) {
			taskEventTimeAccumulator.reduce(editEvent);
			int editSize = Util.getEditSize(editEvent);
			editTime += editSize * taskEventTimeAccumulator.getValue() / (1000 * 60);
		}
		return editTime;
	}
	
	public int compareTaskEventsValues(Long v1, Long v2) {
		return -compareValues(v1, v2);
	}
}
