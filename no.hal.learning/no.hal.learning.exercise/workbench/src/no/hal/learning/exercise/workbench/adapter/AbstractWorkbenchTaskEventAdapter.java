package no.hal.learning.exercise.workbench.adapter;

import no.hal.learning.exercise.plugin.AbstractTaskEventsAdapter;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchTaskAnswer;
import no.hal.learning.exercise.workbench.WorkbenchTaskEvent;

public abstract class AbstractWorkbenchTaskEventAdapter<A extends WorkbenchTaskAnswer> extends AbstractTaskEventsAdapter<A> {

	protected boolean taskPerformed(String id, String action) {
		WorkbenchTaskEvent taskEvent = createWorkbenchTaskEvent();
		initTaskEvent(taskEvent, id, action);
		return provideTaskEvent(taskEvent);
	}

	protected void initTaskEvent(WorkbenchTaskEvent taskEvent, String id, String action) {
		taskEvent.setTimestamp(getTimestamp());
		taskEvent.setElementId(id);
		taskEvent.setAction(action);
	}

	protected WorkbenchTaskEvent createWorkbenchTaskEvent() {
		return WorkbenchFactory.eINSTANCE.createWorkbenchTaskEvent();
	}
}
