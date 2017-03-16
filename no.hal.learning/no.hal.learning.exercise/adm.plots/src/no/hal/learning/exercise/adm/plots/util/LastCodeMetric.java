package no.hal.learning.exercise.adm.plots.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;

public abstract class LastCodeMetric extends AbstractTaskEventsValueProvider<Integer> {

	@Override
	public Integer getTaskEventsValue(List<? extends TaskEvent> taskEvents) {
		if (taskEvents == null || taskEvents.isEmpty()) {
			return null;
		}
		Map<Object, Integer> lineCounts = new HashMap<Object, Integer>(); 
		List<AbstractStringEditEvent> editEvents = getTaskEvents(taskEvents, AbstractStringEditEvent.class, true);
		for (int i = editEvents.size() - 1; i >= 0; i--) {
			AbstractStringEditEvent editEvent = editEvents.get(i);
			TaskProposal<?> key = editEvent.getProposal();
			if (! lineCounts.containsKey(key)) {
				Integer measure = getMeasure(editEvent);
				if (measure != null) {
					lineCounts.put(key, measure);
				}
			}
		}
		int sum = 0;
		for (int lineCount : lineCounts.values()) {
			sum += lineCount;
		}
		return sum;
	}

	protected Integer getMeasure(AbstractStringEditEvent editEvent) {
		String codeSource = editEvent.getString();
		if (codeSource == null) {
			return null;
		}
		return measure(editEvent);
	}
	
	public abstract int measure(AbstractStringEditEvent editEvent);

	@Override
	public int compareTaskEventsValues(Integer v1, Integer v2) {
		return -compareValues(v1, v2);
	}
}
