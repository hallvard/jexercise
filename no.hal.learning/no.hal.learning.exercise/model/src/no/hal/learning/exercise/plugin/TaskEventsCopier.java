package no.hal.learning.exercise.plugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.util.Util;

public class TaskEventsCopier extends AdapterImpl {

	private TaskProposal<?> targetProposal, recordingProposals[];
	
	private TaskEventsCopier(TaskProposal<?> proposal, TaskProposal<?>... recordingProposals) {
		this.targetProposal = proposal;
		this.recordingProposals = recordingProposals;
	}

	private TaskEventsCopier(TaskProposal<?> proposal, Collection<TaskProposal<?>> recordingProposals) {
		this(proposal, recordingProposals.toArray(new TaskProposal<?>[0]));
	}

	public TaskEventsCopier(TaskProposal<?> proposal) {
		this(proposal, Activator.getInstance().getTaskEventsRecorder().getRecordingProposals(proposal));
	}

	private TaskProposal<? extends TaskAnswer> getTaskProposal() {
		return targetProposal;
	}
	
	public void startCopying(boolean catchUp) {
		if (catchUp) {
			catchUp();
		}
		for (TaskProposal<?> taskProposal : recordingProposals) {
			taskProposal.eAdapters().add(this);
		}
	}
	
	protected void catchUp() {
		long lastTimestamp = 0;
		EList<TaskEvent> attempts = getTaskProposal().getAttempts();
		if (! attempts.isEmpty()) {
			lastTimestamp = attempts.get(attempts.size() - 1).getTimestamp();
		}
		List<TaskEvent> allTaskEvents = Util.getEventsSince(lastTimestamp, recordingProposals);
		for (TaskEvent taskEvent : allTaskEvents) {
			addTaskEvent(taskEvent);
		}
	}

	protected boolean addTaskEvent(TaskEvent taskEvent) {
		return getTaskProposal().addTaskEvent(taskEvent);
	}

	public void stopCopying() {
		for (TaskProposal<?> taskProposal : recordingProposals) {
			taskProposal.eAdapters().remove(this);
		}
	}
	
	protected boolean acceptNotification(Notification notification) {
		if (notification.getNotifier() == targetProposal) {
			return false;
		}
		if (notification.getFeature() != ExercisePackage.eINSTANCE.getTaskProposal_Attempts()) {
			return false;
		}
		if (notification.getEventType() == Notification.ADD || notification.getEventType() == Notification.ADD_MANY) {
			if (notification.getNewValue() instanceof TaskEvent) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void notifyChanged(Notification notification) {
		if (acceptNotification(notification)) {
			TaskEvent taskEvent = (TaskEvent) notification.getNewValue();
			addTaskEvent(taskEvent);
		}
	}
}
