package inheritance;

import java.util.Scanner;

public class CalculatorProgram {

	private SimpleCalculator calculator;
	private Scanner scanner;
	
	public void init() {
		System.out.println("Please enter the desired type of calculator: 'simple' or 'rpn'");
		this.scanner = new Scanner(System.in);
		String calculatorType = scanner.nextLine();
		switch(calculatorType) {
			case "simple":
				this.calculator = new SimpleCalculator();
				break;
			case "rpn":
				this.calculator = new RPNCalculator();
				break;
			default:
				throw new IllegalArgumentException(calculatorType + " not implemented");
		}
	}

	public void run() {
		System.out.println("Enter each operator/operand on its own line.");
		System.out.println("Enter 'exit' to quit.");
		while (true) {
			String input = scanner.nextLine();
			if (isDouble(input)) {
				calculator.takeInputNumber(Double.parseDouble(input));
			} else if (input.equalsIgnoreCase("exit")) {
				break;

			} else {
				calculator.takeInputOperator(input.charAt(0));
			}
			if(calculator.hasOutput()) {
				System.out.println("Result: " + String.valueOf(calculator.getOutput()));
			}
		}
		scanner.close();
	}

	private boolean isDouble(String str){
		try{
			Double.parseDouble(str);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
	
	public static void main(String[] args) {
		CalculatorProgram program = new CalculatorProgram();
		program.init();
		program.run();
	}
}
