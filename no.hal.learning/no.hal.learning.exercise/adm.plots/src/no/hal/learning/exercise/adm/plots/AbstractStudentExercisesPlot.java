package no.hal.learning.exercise.adm.plots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.util.AbstractTaskEventValueReducer;
import no.hal.learning.exercise.util.Util;

public abstract class AbstractStudentExercisesPlot<E, S> extends AbstractExerciseCombinationsPlot implements Comparator<TaskEvent> {

	protected boolean acceptExercise(Object exerciseCombination, Resource resource) {
		if (exerciseCombination instanceof Collection<?>) {
			for (Object element : (Collection<?>) exerciseCombination) {
				if (acceptExercise(element, resource)) {
					return true;
				}
			}
		} else {
			if (resource.getURI().path().contains(exerciseCombination + ".ex")) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected double computeExercisesValue(int seriesNum, Object exerciseCombination, Collection<String> students, ExerciseCombinationsComputer computer) {
		Collection<S> studentValues = new ArrayList<S>(students.size());
		for (String student : students) {
			Collection<Resource> exercises = computer.getStudentExercises().get(student);
			Collection<E> exerciseValues = new ArrayList<E>(exercises.size());
			for (Resource resource : exercises) {
				if (acceptExercise(exerciseCombination, resource)) {
					addExerciseValues(seriesNum, resource, exerciseValues);
				}
			}
			S studentValue = computeStudentValue(seriesNum, exerciseValues);
//			System.out.println("Value for " + student + " is " + studentValue);
			if (studentValue != null) {
				studentValues.add(studentValue);
			}
		}
		double studentsValue = (studentValues.isEmpty() ? 0.0 : computeStudentsValue(seriesNum, studentValues));
//		System.out.println("Value for " + exerciseCombination + " is " + studentsValue);
		return studentsValue;
	}

	protected Long getEventsValue(Resource resource, AbstractTaskEventValueReducer reducer, Class<? extends TaskEvent> eventClass) {
		List<? extends TaskEvent> events = getAllTaskEvents(resource, eventClass, this);
		if (events == null) {
			return null;
		}
		reducer.init();
		for (TaskEvent taskEvent : events) {
			reducer.reduce(taskEvent);
		}
		return reducer.getValue();
	}

	@Override
	public int compare(TaskEvent event1, TaskEvent event2) {
		long diff = event1.getTimestamp() - event2.getTimestamp();
		return (diff < 0 ? -1 : (diff > 0 ? 1 : 0));
	}
	
	protected List<? extends TaskEvent> getAllTaskEvents(Resource resource, Class<? extends TaskEvent> eventClass, Comparator<TaskEvent> sorter) {
		List<? extends TaskEvent> events = Util.getAllEObjects(resource.getAllContents(), eventClass != null ? eventClass : TaskEvent.class);
		if (sorter != null) {
			Collections.sort(events, sorter);
		}
		return events;
	}

	protected abstract void addExerciseValues(int seriesNum, Resource resource, Collection<E> values);
	protected abstract S computeStudentValue(int seriesNum, Collection<E> values);
	protected abstract double computeStudentsValue(int seriesNum, Collection<S> studentValues);
}
