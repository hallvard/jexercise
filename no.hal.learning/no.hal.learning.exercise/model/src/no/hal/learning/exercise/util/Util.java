package no.hal.learning.exercise.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.learning.diff.PatchStringEdit;
import no.hal.learning.exercise.AbstractExercisePart;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.Exercise;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.StringEdit;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.quiz.Option;
import no.hal.learning.quiz.OptionsAnswer;

public class Util {

	public static ExerciseProposals ensureExerciseProposals(Exercise ex, ExerciseProposals exerciseProposals) {
		if (exerciseProposals == null) {
			exerciseProposals = ExerciseFactory.eINSTANCE.createExerciseProposals();
			exerciseProposals.setExercise(ex);
		}
		EList<ExercisePartProposals> proposals = exerciseProposals.getProposals();
		// add missing ExerciseProposals
		exercisePart: for (AbstractExercisePart exercisePart : ex.getParts()) {
			for (ExercisePartProposals proposal : proposals) {
				if (proposal.getExercisePart() == exercisePart) {
					continue exercisePart;
				}
			}
			proposals.add(exercisePart.createProposals());
		}
		return exerciseProposals;
	}

	public static void migrateExerciseProposals(ExerciseProposals source, ExerciseProposals target) {
		Collection<Proposal<?>> targetProposals = target.getAllProposals();
		for (Proposal<?> sourceProposal : source.getAllProposals()) {
			if (sourceProposal instanceof TaskProposal<?>) {
				TaskProposal<?> currentProposal = null;
				for (TaskEvent taskEvent : ((TaskProposal<?>) sourceProposal).getAttempts()) {
					if (currentProposal == null || (! currentProposal.getAnswer().acceptEvent(taskEvent))) {
						currentProposal = findProposal(taskEvent, targetProposals);
					}
					if (currentProposal != null) {
						currentProposal.addTaskEvent(taskEvent);
					}
				}
			}
		}
	}

	private static TaskProposal<?> findProposal(TaskEvent taskEvent, Collection<Proposal<?>> proposals) {
		for (Proposal<?> proposal : proposals) {
			if (proposal instanceof TaskProposal<?>) {
				TaskAnswer targetAnswer = ((TaskProposal<?>) proposal).getAnswer();
				if (targetAnswer.acceptEvent(taskEvent)) {
					return (TaskProposal<?>) proposal; 
				}
			}
		}
		return null;
	}

	public static <T> String relativeName(EObject eObject, Class<T> c) {
		String name = "";
   		EObject e = eObject;
		while (e != null) {
			EObject child = e;
			e = e.eContainer();
			String childName = null;
			EStructuralFeature nameFeature = child.eClass().getEStructuralFeature("name");
			if (nameFeature != null && nameFeature.getEType() == EcorePackage.eINSTANCE.getEString()) {
				childName = (String) child.eGet(nameFeature);
			}
			if (childName == null) {
				EStructuralFeature feature = child.eContainingFeature();
				if (feature != null && e != null) {
					childName = feature.getName();
					if (feature.isMany()) {
						childName = childName + ((EList<?>) e.eGet(feature)).indexOf(child);
					}
				}
			}
			if (childName != null) {
				name = "_" + childName + name;
			}
			if (c != null && c.isInstance(child)) {
				return name;
			}
   		}
		return (c == null ? name : null);
	}
	
	private static int findOptionNum(OptionsAnswer answer, Object proposal) {
		int num = 0;
		for (Option option : answer.getOptions()) {
			if (Boolean.TRUE.equals(option.getOption().accept(proposal))) {
				return num;
			}
			num++;
		}
		return -1;
	}

	public static int[] proposalOptions(OptionsAnswer answer, Object proposal) {
		if (proposal == null) {
			return null;
		} else if (proposal instanceof String) {
			proposal = ((String) proposal).split(",");
		} else if (proposal instanceof Collection) {
			proposal = ((Collection<?>) proposal).toArray();
		}
		if (! (proposal.getClass().isArray())) {
			proposal = new Object[]{proposal};
		}
		int[] optionNums = new int[Array.getLength(proposal)];
		for (int i = 0; i < optionNums.length; i++) {
			Object optionProposal = Array.get(proposal, i);
			int num = (optionProposal instanceof Integer ? (Integer) optionProposal : findOptionNum(answer, optionProposal));
			if (num < 0 && optionProposal instanceof String) {
				try {
					num = Integer.valueOf((String) optionProposal);
				} catch (NumberFormatException e) {
					return null;
				}
			}
			// check if num is legal
			if (num < 0 || num >= answer.getOptions().size()) {
				return null;
			}
			// check for duplicate
			for (int j = 0; j < i; j++) {
				if (optionNums[j] == num) {
					return null;
				}
			}
			optionNums[i] = num;
		}
		return optionNums;
	}
	
	public static List<TaskEvent> getEventsSince(long lastTimestamp, TaskProposal<?>... proposals) {
		return getEventsSince(lastTimestamp, Arrays.asList(proposals));
	}

	public static List<TaskEvent> getEventsSince(long lastTimestamp, Iterable<TaskProposal<?>> proposals) {
		List<TaskEvent> allTaskEvents = new ArrayList<TaskEvent>();
		for (TaskProposal<?> taskProposal : proposals) {
			EList<TaskEvent> taskAttempts = taskProposal.getAttempts();
			int pos = taskAttempts.size() - 1;
			while (pos >= 0) {
				TaskEvent taskEvent = taskAttempts.get(pos);
				if (taskEvent.getTimestamp() > lastTimestamp) {
					allTaskEvents.add(taskEvent);
				}
				pos--;
			}
		}
		Collections.sort(allTaskEvents, new Comparator<TaskEvent>() {
			@Override
			public int compare(TaskEvent ev1, TaskEvent ev2) {
				return Long.compare(ev1.getTimestamp(), ev2.getTimestamp());
			}
		});
		return allTaskEvents;
	}

	public static Field getMarkerInfoField(EObject eObject, EStructuralFeature feature, Class<?> context) {
		String valueClassName = EcoreUtil.getAnnotation(feature, MarkerInfo.class.getName(), "valueClass");
		Class<?> valueClass = null;
		try {
			valueClass = context.getClassLoader().loadClass(valueClassName);
		} catch (Exception e) {
			System.err.println();
		}
		if (valueClass != null) {
			String fieldPattern = EcoreUtil.getAnnotation(feature, MarkerInfo.class.getName(), "fieldPattern");
			Object featureValue = eObject.eGet(feature);
			for (Field field : valueClass.getFields()) {
				if (fieldPattern != null && (! field.getName().matches(fieldPattern))) {
					continue;
				}
				try {
					Object fieldValue = field.get(null);
					if (featureValue.equals(fieldValue)) {
						return field;
					}
				} catch (IllegalArgumentException e) {
					System.err.println();
				} catch (IllegalAccessException e) {
					System.err.println(e);
				}
			}
		}
		return null;
	}
	
	public final static Comparator<TaskEvent> TASK_EVENT_TIMESTAMP_COMPARATOR = new Comparator<TaskEvent>() {
		@Override
		public int compare(TaskEvent o1, TaskEvent o2) {
			long diff = o1.getTimestamp() - o2.getTimestamp();
			return (diff < 0 ? -1 : (diff > 0 ? 1 : 0));
		}
	};
	
	public static List<String> splitLines(String s) {
		return split(s, "\n");
	}
	public static int countLines(String s) {
		return count(s, "\n");
	}

	public static List<String> split(String s, String separator) {
		int count = count(s, separator);
		List<String> result = new ArrayList<String>(count);
		split(s, separator, result);
		return result;
	}
	
	public static int count(String s, String separator) {
		return split(s, separator, null);
	}

	public static int split(String s, String separator, List<String> result) {
		int count = 0, start = 0;
		while (s != null && start < s.length()) {
			int pos = s.indexOf(separator, start);
			if (pos < 0) {
				if (result != null) {
					result.add(s.substring(start));
				}
				return count + 1;
			} else {
				if (result != null) {
					result.add(s.substring(start, pos));
				}
			}
			start = pos + separator.length();
			count++;
		}
		if (s != null && result != null) {
			result.add("");
		}
		return count;
	}
	
	public static int getEditSize(AbstractStringEditEvent editEvent) {
		AbstractStringEdit edit = editEvent.getEdit();
		if (edit instanceof StringEdit) {
			String storedString = ((StringEdit) edit).getStoredString();
			return (storedString != null ? Util.countLines(storedString) : 1);			
		} else if (edit instanceof PatchStringEdit) {
			return ((PatchStringEdit) edit).getPatches().size() / 2;						
		}
		return 1;
	}

	public static <T> List<T> getAllEObjects(TreeIterator<EObject> objects, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		while (objects.hasNext()) {
			EObject next = objects.next();
			if (clazz.isInstance(next)) {
				result.add((T) next);
			}
		}
		return result;
	}
	
	// methods used by TaskAnswer subclasses for matching TaskEvents
	
	public static boolean isEmpty(String s) {
		return s == null || "".equals(s);
	}
	
	public static boolean accept(String pattern, String s) {
		if (pattern == null) {
			return true;
		} else if (pattern.startsWith("*")) {
			return s.endsWith(pattern.substring(1));
		} else if (pattern.endsWith("*")) {
			return s.startsWith(pattern.substring(0, pattern.length() - 1));
		} else {
			return pattern.equals("*") || pattern.equals(s);
		}
	}
	
	public static boolean acceptSegmented(String pattern, String segmented, String separator) {
		if (isEmpty(pattern)) {
			return true;
		}
		int pPos = 0, sPos = 0;
		while (pPos < pattern.length()) {
			int pEnd = pattern.indexOf(separator, pPos);
			String pSub = pattern.substring(pPos, (pEnd < 0 ? pattern.length() : pEnd));
//			System.out.println("pPos=" + pPos + ", pEnd=" + pEnd + ", " + pSub);
			int sEnd = segmented.indexOf(separator, sPos);
			String sSub = segmented.substring(sPos, (sEnd < 0 ? segmented.length() : sEnd));
//			System.out.println("sPos=" + sPos + ", sEnd=" + sEnd + ", " + sSub);
			if (! accept(pSub, sSub)) {
				return false;
			}
			if (pEnd < 0 && (sEnd < 0 || pSub.equals("*"))) {
				return true;
			} else if (! (pEnd >= 0 && sEnd >= 0)) {
				return false;
			}
			pPos = pEnd + separator.length();
			sPos = sEnd + separator.length();
		}
		return true;
	}

	public static boolean acceptQName(String pattern, String qName) {
		return acceptSegmented(pattern, qName, ".");
	}

	public static boolean acceptClass(String pattern, Class<?> c, boolean includeExtends, boolean includeImplements) {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(c);
		int pos = 0;
		while (pos < classes.size()) {
			Class<?> next = classes.get(pos);
			if (acceptQName(pattern, next.getName())) {
				return true;
			}
			if (includeExtends) {
				Class<?> extendsClass = next.getSuperclass();
				if (extendsClass != null && extendsClass != Object.class && (! classes.contains(extendsClass))) {
					classes.add(extendsClass);
				}
			}
			if (includeImplements) {
				for (Class<?> implementsClass : c.getInterfaces()) {
					if (! classes.contains(implementsClass)) {
						classes.add(implementsClass);
					}
				}
			}
			pos++;
		}
		return false;
	}
	
	public static boolean acceptPath(String pattern, String path) {
		return acceptSegmented(pattern, path, "/");
	}

	public static boolean acceptPath(String pattern, IPath path) {
		return acceptPath(pattern, path.toString());
	}
}
