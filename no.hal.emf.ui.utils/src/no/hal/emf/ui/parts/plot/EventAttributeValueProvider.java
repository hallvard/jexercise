package no.hal.emf.ui.parts.plot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class EventAttributeValueProvider<E extends EObject> implements IValueProvider<E, Number> {
	
	private EAttribute attribute;

	public EventAttributeValueProvider(EAttribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public String getName() {
		return attribute.getName();
	}
	
	@Override
	public Number getValue(E event) {
		try {
			return (Number) event.eGet(attribute);
		} catch (Exception e) {
		}
		return null;
	}
}
