package mycollection;

import junit.framework.TestCase;
import no.hal.jex.eval.JExercise;

@JExercise(
		// tests="MyListIterator implements MyIterator",
		description="The MyListIteratorTest class is an implementation of the MyIterator interface," +
				"which is a simplied versions of the standard (raw) Iterator interface for the MyList class."
		)
public class MyListIteratorTest extends TestCase {

	private MyList list;
	
	protected void setUp() {
		list = new MyArrayList();
	}
	
	private String[] strings = {"null", "en", "to", "tre", "fire", "fem", "seks", "syv", "åtte", "ni", "ti"};
	
	private void addStrings() {
		int size = list.size();
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
			assertEquals(size + i + 1, list.size());
		}
	}

	@JExercise(
			tests="MyListIterator(MyList); boolean hasNext(); Object next()",
			description="The MyListIterator constructor must take a List as its only argument, and iterator over that list.<br>" +
					"The hasNext() method returns whether there are more elements to iterate over.<br>" +
					"The next() method returns and steps across the next element in the list."
			)
	public void testIterator() {
		MyIterator it1 = new MyListIterator(list);
		assertFalse(it1.hasNext());
		addStrings();
		MyIterator it2 = new MyListIterator(list);
		for (int i = 0; i < strings.length; i++) {
			boolean isLast = (i == strings.length - 1);
			assertTrue(it2.hasNext());
			assertEquals(list.get(i), it2.next());
			assertEquals(! isLast, it2.hasNext());
		}
		assertFalse(it2.hasNext());
	}
}
