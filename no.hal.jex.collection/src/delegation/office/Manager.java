package delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;

public class Manager implements Employee {

	private List<Employee> employees;
	private int taskCount = 0;
	
	public Manager(Collection<Employee> employees) {
		if (employees.isEmpty()) {
			throw new IllegalArgumentException("A Manager must have someone to delegate to!");
		}
		this.employees = new ArrayList<Employee>(employees);
	}
	
	private Employee getTaskDelegate() {
		return this.employees.get(taskCount++ % employees.size());
	}
	
	@Override
	public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
		return getTaskDelegate().doCalculations(operation, value1, value2);
	}

	@Override
	public void printDocument(String document) {
		getTaskDelegate().printDocument(document);
	}

	@Override
	public int getTaskCount() {
		return taskCount;
	}

	@Override
	public int getResourceCount() {
		int sum = 1;
		for (Employee employee : employees) {
			sum += employee.getResourceCount();
		}
		return sum;
	}
}
