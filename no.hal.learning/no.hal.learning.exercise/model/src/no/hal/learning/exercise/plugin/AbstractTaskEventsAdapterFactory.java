package no.hal.learning.exercise.plugin;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEventsAdapter;

public abstract class AbstractTaskEventsAdapterFactory extends AdapterFactoryImpl {

	public boolean isFactoryForType(Object type, Class<? extends TaskAnswer>... answerClasses) {
		if (TaskEventsAdapter.class == type || contains(answerClasses, type)) {
			return true;
		} else if (type instanceof Object[]) {
			Object[] types = (Object[]) type;
			if (! contains(types, TaskEventsAdapter.class)) {
				return false;
			}
			for (int i = 0; i < answerClasses.length; i++) {
				if (contains(types, answerClasses[i])) {
					return true;
				}				
			}
			return false;
		}
		return false;
	}
	
	private boolean contains(Object[] array, Object o) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == o) {
				return true;
			}
		}
		return false;
	}
}
