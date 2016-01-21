package no.hal.learning.sharing.exercise;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.sharing.runtime.PublishingAdapter;

public class ExercisePublishingAdapter extends AdapterImpl implements PublishingAdapter {

	protected Collection<? extends EObject> getShareObjects(ExerciseProposals quizProposals) {
		return Arrays.asList(quizProposals, quizProposals.getExercise());
	}
	
	@Override
	public Collection<? extends EObject> getShareObjects(EObject eObject) {
		if (eObject instanceof ExerciseProposals) {
			return getShareObjects((ExerciseProposals) eObject);
		} else if (eObject instanceof Exercise) {
			return getShareObjects(((Exercise) eObject).createProposals());
		}
		return null;
	}
}
