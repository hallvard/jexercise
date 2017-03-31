package no.hal.learning.exercise.adm.plots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import no.hal.learning.exercise.adm.ExResourcesChartView;

public class ExerciseCombinationsComputer {

	private Collection<Resource> resources;

	public ExerciseCombinationsComputer(Collection<Resource> resources) {
		this.resources = resources;
	}

	public final static Comparator<Resource> resourceExerciseComparator = new Comparator<Resource>() {
		@Override
		public int compare(Resource res1, Resource res2) {
			return ExResourcesChartView.getExerciseId(res1).compareTo(ExResourcesChartView.getExerciseId(res2));
		}
	};

	private Map<String, ? extends Collection<Resource>> studentExercises;

	public Map<String, ? extends Collection<Resource>> getStudentExercises() {
		if (studentExercises == null) {
			Map<String, List<Resource>> studentExercises = new HashMap<String, List<Resource>>();
			for (Resource resource : resources) {
				String studentId = ExResourcesChartView.getStudentId(resource);
				List<Resource> exercises = studentExercises.get(studentId);
				if (exercises == null) {
					exercises = new ArrayList<Resource>();
					studentExercises.put(studentId, exercises);
				}
				int pos = exercises.size();
				while (pos > 0) {
					if (resourceExerciseComparator.compare(resource, exercises.get(pos - 1)) > 0) {
						break;
					}
					pos--;
				}
				exercises.add(pos, resource);
			}
			this.studentExercises = studentExercises;
		}
		return studentExercises;
	}

	private Collection<String> allExerciseNames;

	public Collection<String> getAllExerciseNames() {
		if (allExerciseNames == null) {
			allExerciseNames = new ArrayList<String>();
			for (Resource resource : resources) {
				String ex = ExResourcesChartView.getExerciseId(resource);
				if (!allExerciseNames.contains(ex)) {
					allExerciseNames.add(ex);
				}
			}
		}
		return allExerciseNames;
	}

	public Map<Object, ? extends Collection<String>> getExerciseCombinationStudents(boolean includeIndividual, boolean includeCombinations) {
		Map<String, ? extends Collection<Resource>> studentExercises = getStudentExercises();
		Map<Object, Collection<String>> combinations = new HashMap<Object, Collection<String>>();
		for (String studentId : studentExercises.keySet()) {
			Collection<Resource> exercises = studentExercises.get(studentId);
			Collection<String> exerciseNames = new ArrayList<String>(exercises.size());
			for (Resource res : exercises) {
				String ex = ExResourcesChartView.getExerciseId(res);
				if (includeIndividual) {
					updateMapCollection(ex, studentId, combinations);
				}
				exerciseNames.add(ex);
			}
			if (includeCombinations) {
				updateMapCollection(exerciseNames, studentId, combinations);
			}
		}
		return combinations;
	}

	private <T> void updateMapCollection(Object key, T t, Map<Object, Collection<T>> map) {
		Collection<T> current = map.get(key);
		if (current == null) {
			current = new ArrayList<T>();
			map.put(key, current);
		}
		current.add(t);
	}
}
