package delegation.office;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Printer {

	private HashMap<Employee, Collection<String>> documentHistories;

	public Printer(){
		this.documentHistories = new HashMap<Employee, Collection<String>>();
	}
	
	public void printDocument(String document, Employee employee) {
		if (! documentHistories.containsKey(employee)){
			documentHistories.put(employee, new ArrayList<String>());
		}
		this.documentHistories.get(employee).add(document);
	}
	
	public Collection<String> getPrintHistory(Employee employee) {
		if (! documentHistories.containsKey(employee)){
			return Collections.emptyList();
		}
		return new ArrayList<String>(documentHistories.get(employee));
	}
}
