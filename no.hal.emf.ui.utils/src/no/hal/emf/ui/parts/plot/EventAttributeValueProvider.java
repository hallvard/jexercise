package no.hal.emf.ui.parts.plot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EventAttributeValueProvider<E extends EObject> implements IValueProvider<E, Number>, IPriority {
	
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

	@Override
	public int getPriority() {
		String priority = EcoreUtil.getAnnotation(attribute, IValueProvider.class.getName(), "priority");
		if (priority != null) {
			try {
				return Integer.valueOf(priority);
			} catch (NumberFormatException e) {
			}
		}
		return 0;
	}
}
