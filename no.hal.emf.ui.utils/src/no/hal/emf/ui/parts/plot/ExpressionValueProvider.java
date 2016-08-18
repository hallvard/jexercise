package no.hal.emf.ui.parts.plot;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public abstract class ExpressionValueProvider<T> implements IValueProvider<T, Number> {

	private String name, expression;
	
	public ExpressionValueProvider(String name, String expression) {
		setExpression(expression);
	}
	
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}

	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected abstract void provideVariables(ExpressionBuilder builder, T context);

	protected abstract void provideVariableValues(Expression expression, T context);
	
	public Number evaluateExpression(T context) {
		ExpressionBuilder builder = new ExpressionBuilder(getExpression());
		provideVariables(builder, context);
		Expression expr = builder.build();
		provideVariableValues(expr, context);
		try {
			return expr.evaluate();
		} catch (Exception e) {
		}
		return null;
	}
	
	@Override
	public Number getValue(T t) {
		return evaluateExpression(t);
	}
}
