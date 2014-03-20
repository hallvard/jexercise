package inheritance;

public abstract class AbstractCalculator {

	protected abstract double[] provideArguments(int arity);
	protected abstract void acceptValues(double... results);
	
	protected int getArity(String operator) {
		switch(operator) {
		case "+":
		case "-":
		case "*":
		case "/":
		case "swap":
			return 2;
		case "drop":
		case "dup":
		case "sin":
			return 1;
		case "pi":
			return 0;
		default:
			throw new IllegalArgumentException(operator + " is not supported");
		}
	}	

	protected double[] values(double... values) {
		return values;
	}
	
	protected int doCalculation(String operator) {
		double[] arguments = provideArguments(getArity(operator));
		switch(operator) {
		case "+":
			acceptValues(arguments[0] + arguments[1]);
			return 1;
		case "-":
			acceptValues(arguments[0] - arguments[1]);
			return 1;
		case "*":
			acceptValues(arguments[0] * arguments[1]);
			return 1;
		case "/":
			acceptValues(arguments[0] / arguments[1]);
			return 1;
		case "drop":
			acceptValues();
			return 0;
		case "dup":
			acceptValues(arguments[0], arguments[0]);
			return 2;
		case "swap":
			acceptValues(arguments[1], arguments[0]);
			return 2;
		case "pi":
			acceptValues(Math.PI);
			return 1;
		case "sin":
			acceptValues(Math.sin(arguments[0]));
			return 1;
		}

		throw new IllegalArgumentException(
				"Unsupported opperator.");
	}
}
