package no.hal.emf.ui.parts.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class EventExpressionValueProvider<E extends EObject> extends ExpressionValueProvider<E> {

	public EventExpressionValueProvider(String name, String expression) {
		super(name, expression);
	}

	private Map<EClass, Collection<EAttribute>> eClassAttributes = new HashMap<EClass, Collection<EAttribute>>();

	protected Collection<EAttribute> getEAttributes(E event) {
		Collection<EAttribute> attributes = eClassAttributes.get(event.eClass());
		if (attributes == null) {
			attributes = new ArrayList<EAttribute>();
			for (EAttribute attribute : event.eClass().getEAllAttributes()) {
				Object value = event.eGet(attribute);
				if (value instanceof Number) {
					attributes.add(attribute);
				}			
			}
			eClassAttributes.put(event.eClass(), attributes);
		}
		return attributes;
	}
	
	@Override
	protected void provideVariables(ExpressionBuilder builder, E event) {
		for (EAttribute attribute : getEAttributes(event)) {
			builder.variable(attribute.getName());
		}
	}
	
	@Override
	protected void provideVariableValues(Expression expression, E event) {
		for (EAttribute attribute : getEAttributes(event)) {
			expression.setVariable(attribute.getName(), ((Number) event.eGet(attribute)).doubleValue());
		}		
	}
}
