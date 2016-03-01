package no.hal.learning.exercise.util;

import java.lang.reflect.Array;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import no.hal.learning.exercise.Option;
import no.hal.learning.exercise.OptionsAnswer;

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
}
