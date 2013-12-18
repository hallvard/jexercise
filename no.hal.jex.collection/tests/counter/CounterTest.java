package counter;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(
		description="A class that counts from a <b>start</b> to an <b>end</b> value. " +
				"The counting is limited by the constructor and performed by the <b>count()</b> method."
)
public class CounterTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	private void testCounter(Counter counter, int end) {
		while (counter.getCounter() < end) {
			int i = counter.getCounter();
			counter.count();
			assertEquals(i + 1, counter.getCounter());
		}
		assertEquals(end, counter.getCounter());
		counter.count();
		assertEquals(end, counter.getCounter());
	}
	
	@JExercise(
			tests="Counter(int,int)",
			description="A constructor that initializes class named Counter with the provided start and end value."
	)
	public void testCounter() {
		Counter counter = new Counter(1, 3);
		assertEquals(1, counter.getCounter());
	}

	@JExercise(
			tests="int getCounter()",
			description="A method that returns the current counter value."
	)
	public void testGetCounter() {
		Counter counter = new Counter(1, 3);
		assertEquals(1, counter.getCounter());
	}
	
	@JExercise(
			tests="count()",
			description="A method that steps the counter, unless it has reached the end value."
	)
	public void testCount() {
		Counter counter = new Counter(1, 3);
		testCounter(counter, 3);
	}
}
