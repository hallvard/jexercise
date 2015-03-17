package delegation.office;

import java.util.function.BinaryOperator;

public class Clerk implements Employee {

	private Printer printer;
	private int calculationCount = 0;

	public Clerk(Printer printer){
		this.printer = printer;
	}
	
	@Override
	public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
		calculationCount++;
		return operation.apply(value1, value2);
	}

	@Override
	public void printDocument(String document) {
		printer.printDocument(document);
	}

	@Override
	public int taskCount() {
		return printer.getPrintHistory().size() + calculationCount;
	}

	@Override
	public int resourceCount() {
		return 1;
	}

}
