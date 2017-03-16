package no.hal.learning.exercise.adm.plots.util;

import java.util.List;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;
import no.hal.learning.exercise.util.Util;

public class EditSizeTaskEventsValue extends AbstractTaskEventsValueProvider<Integer> {

	@Override
	public Integer getTaskEventsValue(List<? extends TaskEvent> taskEvents) {
		if (taskEvents == null) {
			return null;
		}
		int sum = 0;
		for (AbstractStringEditEvent editEvent : getTaskEvents(taskEvents, AbstractStringEditEvent.class, true)) {
			int editSize = Util.getEditSize(editEvent);
			sum += editSize;
		}
		return sum;
	}

	@Override
	public int compareTaskEventsValues(Integer v1, Integer v2) {
		return -compareValues(v1, v2);
	}
}
