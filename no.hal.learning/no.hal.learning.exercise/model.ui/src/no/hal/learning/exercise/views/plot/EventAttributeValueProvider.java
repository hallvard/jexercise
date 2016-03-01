package no.hal.learning.exercise.views.plot;

import org.eclipse.emf.ecore.EAttribute;

import no.hal.learning.exercise.TaskEvent;

public class EventAttributeValueProvider implements IEventValueProvider {
	
	private EAttribute attribute;

	public EventAttributeValueProvider(EAttribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public Number getValue(TaskEvent event) {
		try {
			return (Number) event.eGet(attribute);
		} catch (Exception e) {
		}
		return null;
	}
}
