package delegation;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

public class ComputingIteratorTest extends TestCase {

	private List<Integer> list86, list13;
	
	protected void setUp() throws Exception {
		list86 = Arrays.asList(8, 7, 6);
		list13 = Arrays.asList(1, 2, 3);
	}

	public void testCaseEmpty() {
		testIterator(Collections.<Integer>emptyList(), Collections.<Integer>emptyList());
	}
	
	public void testCase1122() {
		testIterator(Arrays.asList(1), Arrays.asList(2), 3);
	}
	public void testCase8613() {
		testIterator(list86, list13, 9, 9, 9);
	}

	private void testIterator(Collection<Integer> col1, Collection<Integer> col2, int... values) {
		testIterator(new ComputingIterator<Integer, Integer, Integer>(col1.iterator(), col2.iterator()) {
			@Override
			protected Integer compute(Integer n1, Integer n2) {
				return n1 + n2;
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
