package encapsulation;

public class Calculator {
	
	private double firstOperand;
	private double secondOperand;
	private char operator;
	
	public Calculator() {
		firstOperand = Double.NaN;
		secondOperand = Double.NaN;
		operator = ' ';
	}
	
	public void setFirstOperand(double operand) {
		this.firstOperand = operand;
	}
	
	public double getFirstOperand() {
		return this.firstOperand;
	}
	
	public void setSecondOperand(double operand) {
		this.secondOperand = operand;
	}

	public double getSecondOperand() {
		return this.secondOperand;
	}
	
	public void setOperator(char operator) {
		if (validateOperator(operator)) {
			this.operator = operator;
		} else {
			throw new IllegalArgumentException("Illegal operand");
		}
	}
	
	private boolean validateOperator(char operator) {
		if ("+-*/%".contains(""+ operator)) {
			return true;
		} else {
			return false;
		}
	}
	
	public char getOperator() {
		return this.operator;
	}
	
	public double calculateResult() {
		if (validateCalculation()) {
			if (operator == '+') {
				return firstOperand + secondOperand;
			} else if (operator == '-') {
				return firstOperand - secondOperand;
			} else if (operator == '*') {
				return firstOperand * secondOperand;
			} else if (operator == '/') {
					return firstOperand / secondOperand;
			} else if (operator == '%') {
				return firstOperand % secondOperand;
			} else {
				throw new IllegalStateException("Cannot perform operation");
			}
		} else {
			throw new IllegalStateException("Cannot perform operation");
		}
	}
	
	private boolean validateCalculation() {
		if (firstOperand != Double.NaN && secondOperand != Double.NaN && validateOperator(getOperator())) {
			if ("+-*%".contains(""+ operator)) {
				return true;
			} else if (getOperator() == '/' && getSecondOperand() != 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}