package inheritance;

public class SimpleCalculator {
	
	private Double leftOperand, rightOperand;
	private Character operator;
	
	protected void setLeftOperand(double operand) {
		leftOperand = operand;
		operator = null;
		rightOperand = null;
	}
	
	protected void setRightOperand(double operand) {
		if(leftOperand == null || operator == null)
			throw new IllegalStateException();
		
		rightOperand = operand;
	}
	
	protected void setOperator(char operator) {
		if("+-*/".indexOf(operator) == -1)
			throw new IllegalArgumentException();
		if(leftOperand == null)
			throw new IllegalStateException();
		
		this.operator = operator;
		rightOperand = null;
	}
	
	protected double getResult() {
		switch(operator) {
		case '+': return leftOperand + rightOperand;
		case '-': return leftOperand - rightOperand;
		case '*': return leftOperand * rightOperand;
		case '/': return leftOperand / rightOperand;
		default: throw new IllegalStateException();
		}
	}
	
	public void takeInputNumber(double number) {
		if(leftOperand == null || hasOutput()) {
			setLeftOperand(number);
		}
		else {
			setRightOperand(number);
		}
	}
	
	public void takeInputOperator(char operator) {
		if(hasOutput())
			setLeftOperand(getResult());
		setOperator(operator);
	}
	
	public boolean hasOutput() {
		return rightOperand != null;
	}
	
	public double getOutput() {
		if(!hasOutput())
			throw new IllegalStateException();
		
		return getResult();
	}
	
}
