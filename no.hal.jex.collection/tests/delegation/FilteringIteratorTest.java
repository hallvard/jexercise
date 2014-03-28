package delegation;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

public class FilteringIteratorTest extends TestCase {

	private List<Integer> list18, list19;
	
	protected void setUp() throws Exception {
		list18 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		list19 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	}

	public void testCaseEmpty() {
		testIterator(Collections.<Integer>emptyList());
	}
	
	public void testCase1() {
		testIterator(Arrays.asList(1), 1);
	}
	public void testCase12() {
		testIterator(Arrays.asList(1, 2), 1);
	}
	public void testCase18() {
		testIterator(list18, 1, 3, 5, 7);
	}
	public void testCase19() {
		testIterator(list19, 1, 3, 5, 7, 9);
	}

	private void testIterator(Collection<Integer> col, int... values) {
		testIterator(new FilteringIterator<Integer>(col.iterator()) {
			@Override
			protected boolean shouldSkip(Integer next) {
				return (next % 2) == 0;
			}
		}, values);
	}

	private void testIterator(Iterator<Integer> iterator, int... values) {
		for (int value : values) {
			assertTrue(iterator.hasNext());
			assertEquals(value, iterator.next().intValue());
		}
		assertFalse(iterator.hasNext());
	}


}
