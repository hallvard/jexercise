package no.hal.quiz.junit.examples;

import junit.framework.TestCase;

public class CounterTest extends TestCase {

	public void testCounter() {
		Counter counter = new Counter(3);
		assertEquals(0, counter.getCounter());
	}
	
	public void testCount() {
		Counter counter = new Counter(3);
		assertEquals(0, counter.getCounter());
		assertEquals(1, counter.count());
		assertEquals(1, counter.getCounter());
		assertEquals(2, counter.count());
		assertEquals(2, counter.getCounter());
		assertEquals(3, counter.count());
		assertEquals(3, counter.getCounter());
	}
}
