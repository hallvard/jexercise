package no.hal.emf.ui.utils;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class Names {

	public static String getName(EObject eObject) {
		EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
		if (nameFeature == null || nameFeature.isMany() || nameFeature.getEType() != EcorePackage.eINSTANCE.getEString()) {
			return null;
		}
		return (String) eObject.eGet(nameFeature);
	}

	public final static Comparator<EObject> NAME_COMPARATOR = new Comparator<EObject>() {
		public int compare(EObject eo1, EObject eo2) {
			String name1 = getName(eo1), name2 = getName(eo2);
			if (name1 != null && name2 != null) {
				return name1.compareTo(name2);
			} else if (name1 == null) {
				return 1;
			} else if (name2 == null) {
				return -1;
			} else {
				return eo1.hashCode() - eo2.hashCode();
			}
		}
	};
}
