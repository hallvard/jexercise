package no.hal.learning.exercise.adm;

import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.util.Util;

public class TaskEventsValueAdapter extends AdapterImpl implements ITaskEventsProvider {
	
	private AbstractTaskEventsValueProvider<?> taskEventsValueProvider;
	
	public AbstractTaskEventsValueProvider<?> getTaskEventsValueProvider() {
		return taskEventsValueProvider;
	}
	
	public void setValueProvider(AbstractTaskEventsValueProvider<?> taskEventsValueProvider) {
		this.taskEventsValueProvider = taskEventsValueProvider;
	}

	@Override
	public boolean isAdapterForType(Object type) {
		if (type instanceof AbstractTaskEventsValueProvider<?>) {
			type = type.getClass();
		}
		return taskEventsValueProvider != null && type.equals(taskEventsValueProvider.getClass());
	}
	
	private Object taskEventsValue;
	
	public List<? extends TaskEvent> getTaskEvents(Object target) {
		if (target instanceof Resource) {
			return Util.getAllEObjects(((Resource) getTarget()).getAllContents(), TaskEvent.class);
		} else if (target instanceof TaskProposal<?>) {
			return ((TaskProposal<?>) getTarget()).getAttempts();
		}
		return null;
	}
	
	public Object getTaskEventsValue() {
		if (taskEventsValue == null) {
			List<? extends TaskEvent> taskEvents = getTaskEvents(getTarget());
			if (taskEvents != null) {
				taskEventsValue = taskEventsValueProvider.getTaskEventsValue(taskEvents);
			}
		}
		return taskEventsValue;
	}
}
