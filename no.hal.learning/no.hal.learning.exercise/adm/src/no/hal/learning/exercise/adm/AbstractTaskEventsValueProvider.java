package no.hal.learning.exercise.adm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.util.Util;

public abstract class AbstractTaskEventsValueProvider<V> {

	public static <T extends TaskEvent> List<T> getTaskEvents(Iterable<? extends TaskEvent> taskEvents, Class<T> clazz, boolean sort) {
		List<T> result = new ArrayList<T>();
		for (TaskEvent taskEvent : taskEvents) {
			if (clazz.isInstance(taskEvent)) {
				result.add((T) taskEvent);
			}
		}
		if (sort) {
			Collections.sort(result, Util.TASK_EVENT_TIMESTAMP_COMPARATOR);
		}
		return result;
	}

	public abstract V getTaskEventsValue(List<? extends TaskEvent> taskEvents);
	
	public abstract int compareTaskEventsValues(V v1, V v2);
	
	protected <T extends Comparable<T>> int compareValues(T v1, T v2) {
		if (v1 != null && v2 != null) {
			return -v1.compareTo(v2);
		} else if (v1 == null && v2 == null) {
			return 0;
		} else if (v1 != null) {
			return -1;
		} else if (v2 != null) {
			return 1;
		}
		return 0;
	}	
}
