package interfaces;

import java.util.Iterator;

public class StringMergingIterator implements Iterator<String> {

	private Iterator<String> first;
	private Iterator<String> second;
	
	private String firstCurrent = null;
	private String secondCurrent = null;

	public StringMergingIterator(Iterator<String> first, Iterator<String> second){
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean hasNext() {
		return first.hasNext() || second.hasNext() || firstCurrent != null || secondCurrent != null; //her kan vi legge feil ved å kun ha de to første.
	}

	@Override
	public String next() {
		if(first.hasNext() && firstCurrent == null){
			firstCurrent = first.next();
		}
		if(second.hasNext() && secondCurrent == null){
			secondCurrent = second.next();
		}
		
		String result;

		if(firstCurrent == null){
			result =  secondCurrent;
			secondCurrent = null;
		}
		else if(secondCurrent == null){
			result = firstCurrent;
			firstCurrent = null;
		}
		else{
			if(firstCurrent.compareTo(secondCurrent) > 0){
				result = secondCurrent;                     //legg inn feil ved å endre til null før retur?
				secondCurrent = null;
			}
			else{
				result = firstCurrent;
				firstCurrent = null;
			}
		}
		
		return result;
		
	}
	
	
	
}
