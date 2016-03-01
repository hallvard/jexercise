package no.hal.quiz.junit.examples;

public class Counter {

	private int counter, end;
	
	public Counter(int end) {
		this.end = end;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public int count() {
		if (counter < end) {
			counter++;
		}
		return counter;
	}
}
