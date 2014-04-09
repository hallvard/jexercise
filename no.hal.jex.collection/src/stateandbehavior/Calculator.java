package stateandbehavior;

public class Calculator {
	
	double firstOperand;
	double secondOperand;
	char operator;
	
	public void setFirstOperand(double operand) {
		this.firstOperand = operand;
	}
	
	public void setSecondOperand(double operand) {
		this.secondOperand = operand;
	}
	
	public void setOperator(char operator) {
		if ("+-*/%".contains(""+ operator)) {
			this.operator = operator;
		} else {
			throw new IllegalArgumentException("Illegal operand");
		}
	}
	
	public double calculateResult() {
		if (operator == '+') {
			return firstOperand + secondOperand;
		} else if (operator == '-') {
			return firstOperand - secondOperand;
		} else if (operator == '*') {
			return firstOperand * secondOperand;
		} else if (operator == '/') {
			if (secondOperand == 0) {
				throw new IllegalArgumentException("Cannot divide by zero");
			} else {
				return firstOperand / secondOperand;
			}
		} else if (operator == '%') {
			return firstOperand % secondOperand;
		} else {
			throw new IllegalArgumentException("Illegal operand");
		}
	}	
}
