package no.hal.learning.exercise.views.adapters;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskProposal;

public class TaskAttemptsUIAdapter extends TaskCounterUIAdapter {

	public TaskAttemptsUIAdapter(TaskProposal<?> proposal) {
		super(proposal, ExercisePackage.eINSTANCE.getTaskProposal_AttemptCount(), "Times: %2s");
	}
}
