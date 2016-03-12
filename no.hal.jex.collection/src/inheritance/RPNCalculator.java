package inheritance;

import java.util.Stack;

public class RPNCalculator extends SimpleCalculator {
	
	private Stack<Double> stack = new Stack<>();
	private boolean calculated = false;

	@Override
	public void takeInputNumber(double number) {
		stack.push(number);
		calculated = false;
	}

	@Override
	public void takeInputOperator(char operator) {
		if(stack.size() < 2)
			throw new IllegalStateException();
		double a = stack.pop();
		double b = stack.pop();
		setLeftOperand(b);
		setOperator(operator);
		setRightOperand(a);
		stack.push(getResult());
		calculated = true;
	}

	@Override
	public boolean hasOutput() {
		return calculated;
	}
	
	
}
