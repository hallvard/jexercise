package delegation.office;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Printer {
	

	private HashMap<Employee, ArrayList<String>> documentHistories;

	public Printer(){
		this.documentHistories = new HashMap<Employee, ArrayList<String>>();
	}
	
	public void printDocument(String document, Employee employee){
		if(!documentHistories.containsKey(employee)){
			documentHistories.put(employee, new ArrayList<String>());
		}
		this.documentHistories.get(employee).add(document);
	}
	
	public List<String> getPrintHistory(Employee employee){
		if(!documentHistories.containsKey(employee)){
			return new ArrayList<>();
		}
		return new ArrayList<>(documentHistories.get(employee));
	}

}
