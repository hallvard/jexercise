package no.hal.learning.exercise.views.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

public class TaskData implements Comparator<TaskEvent> {

	Collection<TaskProposal<?>> taskProposals;
	Map<TaskProposal<?>, Collection<TaskEvent>> filteredTaskEvents = null;
	List<TaskEvent> taskEvents;
	long minT = Long.MAX_VALUE, maxT = Long.MIN_VALUE;
	long gapWidth, gaps[], gapsDiff = 0;
	
	@Override
	public int compare(TaskEvent taskEvent1, TaskEvent taskEvent2) {
		long diff = taskEvent1.getTimestamp() - taskEvent2.getTimestamp();
		return (int) diff;
	}

	TaskData(Collection<TaskProposal<?>> taskProposals) {
		this.taskProposals = new ArrayList<TaskProposal<?>>(taskProposals);
		this.taskEvents = new ArrayList<TaskEvent>();
		for (TaskProposal<?> taskProposal : taskProposals) {
			this.taskEvents.addAll(taskProposal.getAttempts());
		}
		Collections.sort(taskEvents, this);
		if (taskEvents.size() > 0) {
			minT = taskEvents.get(0).getTimestamp();
			maxT = taskEvents.get(taskEvents.size() - 1).getTimestamp();
		}
	}

	Collection<TaskEvent> getTaskEvents(TaskProposal<?> proposal) {
		Collection<TaskEvent> taskEvents = (filteredTaskEvents != null ? filteredTaskEvents.get(proposal) : null);
		return (taskEvents != null ? taskEvents : proposal.getAttempts());
	}

	long getTimeSpan() {
		return Math.max(0,  maxT - minT);
	}
	
	void initGapData(int gapWidth) {
		int gapCount = 0;
		this.gapWidth = gapWidth;
		for (int i = 1; i < taskEvents.size(); i++) {
			long diff = taskEvents.get(i).getTimestamp() - taskEvents.get(i - 1).getTimestamp();
			if (isGap(diff)) {
				gapCount++;
			}
		}
		this.gaps = new long[gapCount * 2];
		gapCount = 0;
		for (int i = 1; i < taskEvents.size(); i++) {
			long prevTime = taskEvents.get(i - 1).getTimestamp();
			long nextTime = taskEvents.get(i).getTimestamp();
			if (isGap(nextTime - prevTime)) {
				this.gaps[(gapCount * 2) + 0] = prevTime;
				this.gaps[(gapCount * 2) + 1] = nextTime;
				this.gapsDiff += (nextTime - prevTime - gapWidth);
				gapCount++;
			}
		}
	}

	protected boolean isGap(long diff) {
		return diff > this.gapWidth;
	}
	
	long getPlotWidth() {
		return getTimeSpan() - gapsDiff;
	}
}