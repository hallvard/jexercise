package encapsulation;

import java.util.Stack;

/*
 * @startuml
 * class RPN {
 * 	Stack<Double> operandStack
 *  String toString()
 * 	void push(double value)
 * 	void performOperation(char operator)
 * }
 * @enduml
 */

public class RPNCalc {
	
	private Stack<Double> operandStack;
	
	public RPNCalc() {
		operandStack = new Stack<Double>();
	}
	
	@Override
	public String toString() {
		return operandStack.toString();
	}

	public void push(double value) {
		operandStack.push(value);
	}

	public int getSize() {
		return operandStack.size();
	}

	public double peek(int n) {
		return peek(n, Double.NaN);
	}

	public double peek(int n, double def) {
		if (n < 0 || operandStack.size() <= n) {
			return def;
		}
		return operandStack.get(operandStack.size() - n - 1);
	}

	public double pop(double def) {
		if (operandStack.isEmpty()) {
			return def;
		}
		return operandStack.pop();
	}

	public double pop() {
		return pop(Double.NaN);
	}

	// perform the operation denoted by op
	// each operation pops and pushes values off and onto the operand stack,
	public void performOperation(char op) { 
		switch(op) {
		case '+': { 
			// pop two operands and push the sum, missing values default to 0.0
			double d1 = pop(0.0), d2 = pop(0.0);
			push(d2 + d1);
			break;
		} 
		case '-': { 
			// pop two operands and push the difference, missing values default to 0.0
			double d1 = pop(0.0), d2 = pop(0.0);
			push(d2 - d1);
			break;
		} 
		case '*': {
			// pop two operands and push the product, missing values default to 1.0
			double d1 = pop(1.0), d2 = pop(1.0);
			push(d2 * d1);
			break;
		} 
		case '/': { 
			// pop two operands and push the quotient, missing values default to 1.0
			double d1 = pop(1.0), d2 = pop(1.0);
			push(d2 / d1);
			break;
		} 
		// dup
		case ',': { 
			double d = pop(0.0);
			// push back twice
			push(d);
			push(d);
			break;
		} 
		// pop
		case '.': { 
			// remove the topmost value
			pop(0.0);
			break;
		} 
		// swap
		case '~': { 
			// swap the two topmost values, by popping them and pushing them in reverse order
			double d1 = pop(0.0), d2 = pop(0.0);
			push(d1);
			push(d2);
			break;
		} 
		// extra operators
		// remainder
		case '%': { 
			double d1 = pop(1.0), d2 = pop(1.0);
			push(d2 % d1);
			break;
		} 
		// absolute
		case '|': { 
			double d = pop(0.0);
			push(Math.abs(d));
			break;
		} 
		// square root
		case 'v': { 
			double d = pop(1.0);
			push(Math.sqrt(d));
			break;
			// no break, fall through into power!!!
		} 
		// power of
		case '^': { 
			double d1 = pop(1.0), d2 = pop(1.0);
			push(Math.pow(d2, d1));
			break;
		} 
		// floor
		case '_': {
			double d = pop(0.0);
			push(Math.floor(d));
			break;
		} 
		// compare
		case '=': { 
			double d1 = pop(1.0), d2 = pop(1.0);
			push(Double.compare(d2, d1));
			break;
		} 
		// signum
		case '?': {
			double d = pop(0.0);
			push(Math.signum(d));
			break;
		} 
		// pi
		case 'p': case 'π': { 
			push(Math.PI);
			break;
		} 
		// e
		case 'e': { 
			push(Math.exp(1.0));
			break;
		}
		}
	} 
}
