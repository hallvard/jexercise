package no.hal.learning.exercise.adm.plots.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsCellLabel;
import no.hal.learning.exercise.junit.JunitTestEvent;

public class TestCompletionCellLabel extends AbstractTaskEventsCellLabel {

	@Override
	public String getTaskEventsText(Object o) {
		Double value = getTaskEventsValue(o);
		return (value != null ? Double.toString(value) : null);
	}
	
	protected Double getTaskEventsValue(Object o) {
		if (o == null) {
			return null;
		}
		Collection<TaskEvent> taskEvents = super.getAllTaskEvents(o);
		if (taskEvents == null) {
			return null;
		}
		Map<EObject, Double> completions = new HashMap<EObject, Double>();
		for (TaskEvent taskEvent : taskEvents) {
			if (taskEvent instanceof JunitTestEvent) {
				double completion = taskEvent.getCompletion();
				completions.put(taskEvent.eContainer(), completion);
			}
		}
		Collection<Double> values = completions.values();
		if (values.isEmpty()) {
			return null;
		}
		double sum = 0.0;
		for (double completion : values) {
			sum += completion;
		}
		return sum / values.size();
	}
	
	public int compareTaskEventsValues(Object o1, Object o2) {
		return -compareValues(getTaskEventsValue(o1), getTaskEventsValue(o2));
	}
}
