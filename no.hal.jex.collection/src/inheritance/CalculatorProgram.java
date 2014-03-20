package inheritance;

import java.util.Scanner;
import java.util.Stack;

public class CalculatorProgram {

	private AbstractCalculator calculator;
	
	public void init(AbstractCalculator calculator) {
		this.calculator = calculator;
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		int argumentCount = 0;
		Stack<String> operators = new Stack<String>();
		while (scanner.hasNext()) {
			if (scanner.hasNextDouble()) {
				calculator.acceptValues(scanner.nextDouble());
				argumentCount++;
			} else {
				operators.push(scanner.next());
			}
			if (operators.size() > 0) {
				int arity = calculator.getArity(operators.peek());
				if (arity <= argumentCount) {
					int resultCount = calculator.doCalculation(operators.pop());
					argumentCount += resultCount - arity;
				}
			}
			System.out.println("Operands: " + calculator.toString());
			System.out.println("Operator: " + operators);
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		String calculatorType = (args.length > 0 ? args[0] : "simple");
		CalculatorProgram program = new CalculatorProgram();
		switch(calculatorType) {
		case "simple":
			program.init(new SimpleCalculator());
			break;
		case "rpn":
			program.init(new RPNCalculator());
			break;
		default:
			throw new IllegalArgumentException(calculatorType + " not implemented");
		}
		program.run();
	}
}
