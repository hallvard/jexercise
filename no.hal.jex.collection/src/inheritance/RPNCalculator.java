package inheritance;

import java.util.Stack;

public class RPNCalculator extends AbstractCalculator {

	private Stack<Double> stack = new Stack<Double>();

	@Override
	public String toString() {
		return stack.toString();
	}

	@Override
	protected double[] provideArguments(int arity) {
		if (arity > stack.size()) {
			throw new IllegalStateException("The stack only has " + stack.size() + " values, but " + arity + " were requested");
		}
		double[] arguments = new double[arity];
		for (int pos = arity - 1; pos >= 0; pos--) {
			arguments[pos] = stack.pop();
		}
		return arguments;
	}

	@Override
	protected void acceptValues(double... values) {
		for (int i = 0; i < values.length; i++) {
			stack.push(values[i]);
		}
	}
}
