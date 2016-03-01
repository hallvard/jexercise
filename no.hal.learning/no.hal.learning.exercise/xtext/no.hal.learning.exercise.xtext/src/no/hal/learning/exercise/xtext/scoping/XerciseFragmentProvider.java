package no.hal.learning.exercise.xtext.scoping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IFragmentProvider;

import no.hal.learning.exercise.AbstractExercisePart;
import no.hal.learning.exercise.AbstractTask;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ExercisePart;

/**
 * Support fragments of the form <partNum>-<qaNum>, e.g. 1-1 question 1 in part 1.
 * Both parts are 1-based, optional and default to 1.
 * 
 * @author hal
 *
 */
public class XerciseFragmentProvider implements IFragmentProvider {

	public String getFragment(EObject obj, Fallback fallback) {
		if (obj instanceof AbstractExercisePart) {
			return Integer.toString(indexOf(obj));
		} else if (obj instanceof AbstractTask) {
			return Integer.toString(indexOf(obj.eContainer())) + "-" + Integer.toString(indexOf(obj));
		}
		return fallback.getFragment(obj);
	}

	private int indexOf(EObject eObject) {
		return ((EList<?>) eObject.eContainer().eGet(eObject.eContainingFeature())).indexOf(eObject) + 1;
	}
	
	private int num(String s) {
		int num = 0;
		if (s.length() == 0) {
			num = 1;
		} else {
			try {
				num = Integer.valueOf(s);
			} catch (NumberFormatException e) {
			}
		}
		return num;
	}

	public EObject getEObject(Resource resource, String fragment, Fallback fallback) {
		EList<EObject> contents = resource.getContents();
		Exercise exercise = (Exercise) EcoreUtil.getObjectByType(contents, ExercisePackage.eINSTANCE.getExercise());
		if (exercise != null && fragment != null) {
			String[] split = fragment.split("-");
			if (split.length >= 1) {
				int partNum = num(split[0]);
				if (partNum > 0 && partNum <= exercise.getParts().size()) {
					AbstractExercisePart part = exercise.getParts().get(partNum - 1);
					if (split.length == 1) {
						return part;
					} else if (part instanceof ExercisePart) {
						ExercisePart exercisePart = (ExercisePart) part;
						if (split.length == 2) {
							int taskNum = num(split[1]);
							EList<AbstractTask> tasks = exercisePart.getTasks();
							if (taskNum > 0 && taskNum <= tasks.size()) {
								return tasks.get(taskNum - 1);
							}
						} else {
							return exercisePart;
						}
					}
				}
			}
		}
		return fallback.getEObject(fragment);
	}
}
