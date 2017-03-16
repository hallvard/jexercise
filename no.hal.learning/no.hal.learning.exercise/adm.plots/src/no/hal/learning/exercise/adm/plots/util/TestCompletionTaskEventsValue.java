package no.hal.learning.exercise.adm.plots.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;
import no.hal.learning.exercise.junit.JunitTestEvent;

public class TestCompletionTaskEventsValue extends AbstractTaskEventsValueProvider<Double> {

	@Override
	public Double getTaskEventsValue(List<? extends TaskEvent> taskEvents) {
		List<JunitTestEvent> testEvents = getTaskEvents(taskEvents, JunitTestEvent.class, true);
		Map<EObject, Double> completions = new HashMap<EObject, Double>();
		for (int i = testEvents.size() - 1; i >= 0; i--) {
			JunitTestEvent testEvent = testEvents.get(i);
			TaskProposal<?> key = testEvent.getProposal();
			if (! completions.containsKey(key)) {
				completions.put(key, testEvent.getCompletion());
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
	
	@Override
	public int compareTaskEventsValues(Double v1, Double v2) {
		return -compareValues(v1, v2);
	}
}
