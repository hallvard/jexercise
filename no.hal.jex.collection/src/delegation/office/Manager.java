package delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BinaryOperator;

public class Manager implements Employee{

	private int nextEmployee = 0;
	private ArrayList<Employee> employees;
	private int taskCount = 0;
	
	public Manager(Collection<Employee> employees){
		if(employees.size() == 0){
			throw new IllegalArgumentException();
		}
		
		this.employees = new ArrayList<Employee>(employees);
	}
	
	private Employee getEmployee() {
		Employee employee = this.employees.get(nextEmployee);
		nextEmployee = (nextEmployee + 1) % this.employees.size();
		return employee;
	}
	
	@Override
	public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
		Employee employee = getEmployee();
		taskCount++;
		return employee.doCalculations(operation, value1, value2);
	}


	@Override
	public void printDocument(String document) {
		taskCount++;
		Employee employee = getEmployee();
		employee.printDocument(document);
	}

	@Override
	public int taskCount() {
		return taskCount;
	}

	@Override
	public int resourceCount() {
		return employees.stream()
				.mapToInt(employee -> employee.resourceCount())
				.sum() + 1;
	}

}
