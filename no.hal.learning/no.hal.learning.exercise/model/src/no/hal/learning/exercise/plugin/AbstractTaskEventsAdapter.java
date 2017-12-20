package no.hal.learning.exercise.plugin;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskEventsAdapter;
import no.hal.learning.exercise.TaskProposal;

public abstract class AbstractTaskEventsAdapter<A extends TaskAnswer> extends AdapterImpl implements TaskEventsAdapter<A> {

	@Override
	public void setTarget(Notifier newTarget) {
		if (newTarget != null) {
			if (! (newTarget instanceof TaskProposal<?>)) {
				throw new IllegalArgumentException("Can only attach this adapter to a TaskProposal");
			}
			registerListeners();
		}
		super.setTarget(newTarget);
	}
	
	public TaskProposal<A> getTaskProposal() {
		return (TaskProposal<A>) getTarget();
	}
	
	protected abstract void registerListeners();

	@Override
	public void unsetTarget(Notifier oldTarget) {
		unregisterListeners();
		super.unsetTarget(oldTarget);
	}
	
	protected abstract void unregisterListeners();
	
	@Override
	public boolean isAdapterForType(Object type) {
		if (type instanceof TaskAnswer) {
			return supportsTaskAnswer((TaskAnswer) type);
		} else if (type == TaskEventsAdapter.class) {
			return true;
		} else if (type instanceof Object[]) {
			for (Object type2 : (Object[]) type) {
				if (! isAdapterForType(type2)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public abstract boolean supportsTaskAnswer(TaskAnswer type);
	
	protected boolean supportsTaskAnswer(TaskAnswer type, Class<? extends TaskAnswer> specificClass) {
		if (type.getClass() == specificClass) {
			return true;
		}
		for (Class<?> interfaceClass : type.getClass().getInterfaces()) {
			if (interfaceClass == specificClass) {
				return true;
			}
		}
		return false;
	}

	protected boolean provideTaskEvent(TaskEvent taskEvent) {
		TaskProposal<A> taskProposal = getTaskProposal();
		if (taskProposal.getAnswer().acceptEvent(taskEvent)) {
			taskProposal.addTaskEvent(taskEvent);
			return true;
		}
		return false;
	}
	
	protected long getTimestamp() {
		return System.currentTimeMillis();
	}
}
