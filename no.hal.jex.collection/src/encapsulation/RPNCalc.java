package encapsulation;

import java.util.ArrayList;

public class RPNCalc {
	
private ArrayList<Double> stack = new ArrayList<Double>();
	
	public void push(double d) {
		stack.add(d);
	}
	
	public double pop() {
		if (stack.size() >= 1) {
			double d = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return d;
		} else {
			return Double.NaN;
		}
	}
	
	public double peek(int i) {
		if (0 <= i && i <= stack.size()-1) {
			return stack.get(stack.size()-1-i);			
		} else {
			return Double.NaN;
		}
	}
	
	
	public int getSize() {
		return stack.size();
	}
	
	public String toString() {
		String returnStr = "[";
		for (Double d : stack) {
			returnStr += d + ", ";
		}
		return returnStr.substring(0, returnStr.length()-2) + "]";
	}
	
	public void performOperation(char operation) {
		if (stack.size() >= 2) {
			double operand1 = pop();
			double operand2 = pop();
			if (operation == '+') {
				push(operand2 + operand1);
			} else if (operation == '-') {
				push(operand2 - operand1);
			} else if (operation == '*') {
				push(operand2 * operand1);
			} else if (operation == '/') {
				push(operand2 / operand1);
			} else if (operation == '~') {
				push(operand1);
				push(operand2);
			}
		}
	}

	public static void main(String[] args) {
		RPNCalc rpncalc = new RPNCalc();
		rpncalc.push(4.0);
		rpncalc.push(3.0);
		System.out.println(rpncalc);
		rpncalc.performOperation('+');
		System.out.println(rpncalc);
	}
}