package no.hal.sharing.exercise;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.sharing.SelfPublishingAdapter;

public class ExercisePublishingAdapter extends SelfPublishingAdapter {

	@Override
	public Resource getSharedResource(EObject eObject) {
		if (eObject instanceof ExerciseProposals) {
			return super.getSharedResource(eObject);
		} else if (eObject instanceof Exercise) {
			Exercise ex = (Exercise) eObject;
			ExerciseProposals proposals = null;
			if (ex.eResource() != null) {
				proposals = (ExerciseProposals) EcoreUtil.getObjectByType(ex.eResource().getContents(), ExercisePackage.eINSTANCE.getExerciseProposals());
			}
			if (proposals == null || proposals.getExercise() != ex) {
				proposals = ex.createProposals();
				eObject.eResource().getContents().add(proposals);
			}
			return super.getSharedResource(proposals);
		}
		return null;
	}
}
