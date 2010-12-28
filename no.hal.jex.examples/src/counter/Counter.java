package counter;

public class Counter {

	private int end, counter;

	public Counter(int start, int end) {
		this.counter = start;
		this.end = end;
	}

	public void count() {
		if (counter < end) {
			counter++;
		}
	}
	
	public int getCounter() {
		return counter;
	}
}
