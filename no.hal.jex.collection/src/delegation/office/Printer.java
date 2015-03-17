package delegation.office;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	
	private List<String> documents;

	public Printer(){
		this.documents = new ArrayList<>();
	}
	
	public void printDocument(String document){
		this.documents.add(document);
	}
	
	public List<String> getPrintHistory(){
		return new ArrayList<>(documents);
	}

}
