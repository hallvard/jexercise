package counter;

/* 
 * @startuml
 * class Counter {
 * 	-int counter
 * 	-int end
 * 	+Counter(start, end)
 * 	+count()
 * 	+getCounter()
 * }
 * @enduml
 */

public class Counter {

	private int counter, end;

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
