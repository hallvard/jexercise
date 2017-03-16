package no.hal.learning.exercise.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.learning.diff.PatchStringEdit;
import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.StringEdit;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.quiz.Option;
import no.hal.learning.quiz.OptionsAnswer;

public class Util {

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
}
