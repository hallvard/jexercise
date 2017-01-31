package no.hal.learning.exercise.views.plot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ValueNumberProvider<E extends EObject> implements IValueProvider<E, Number> {
	
	public ValueNumberProvider() {
	}

	@Override
	public String getName() {
		return "#";
	}
	
	private EList<?> lastList = null;
	private int lastIndex = -1;
	
	@Override
	public Number getValue(E event) {
		EObject cont = event.eContainer();
		EStructuralFeature containingFeature = event.eContainingFeature();
		if (cont != null && containingFeature != null && containingFeature.isMany()) {
			EList<?> list = (EList<?>) cont.eGet(containingFeature);
			int index = -1;
			if (list == lastList && lastIndex >= 0 && (lastIndex + 1) < list.size() && list.get(lastIndex + 1) == event) {
				index = lastIndex + 1;
			}
			if (index < 0) {
				index = list.indexOf(event);
			}
			lastList = list;
			lastIndex = index;
			return index;
		}
		return null;
	}
}
