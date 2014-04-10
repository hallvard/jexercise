package no.hal.jex.jextest.extensions;

import java.util.Collection;
import java.util.Iterator;

import junit.framework.TestCase;

public class JextestExtensions {

	public static boolean operator_assertEquals(int actual, int expected) {
		TestCase.assertEquals(expected, actual);
		return true;
	}
	public static boolean operator_assertEquals(char actual, char expected) {
		TestCase.assertEquals(expected, actual);
		return true;
	}
	public static boolean operator_assertEquals(boolean actual, boolean expected) {
		TestCase.assertEquals(expected, actual);
		return true;
	}	
	public static boolean operator_assertEquals(Object actual, Object expected) {
		TestCase.assertEquals(expected, actual);
		return true;
	}
	
	private static double epsilon = 0.0000001d;
	
	public static boolean operator_assertEquals(double actual, double expected) {
		TestCase.assertEquals(expected, actual, epsilon);
		return true;
	}

	private static boolean approximatelyEquals_trim = true;
	private static boolean approximatelyEquals_ignoreCase = true;
	
	public static boolean operator_assertEquals(String actual, String expected) {
		if (approximatelyEquals_trim) {
			actual = actual.trim();
			expected = expected.trim();
		}
		if (approximatelyEquals_ignoreCase) {
			actual = actual.toLowerCase();
			expected = expected.toLowerCase();
		}
		TestCase.assertEquals(expected, actual);
		return true;
	}
	
	public static <T> boolean operator_assertEquals(Iterator<? extends T> actual, Iterable<? extends T> expected) {
		return operator_assertEquals(actual, expected.iterator());
	}

	public static <T> boolean operator_assertEquals(Iterable<? extends T> actual, Iterator<? extends T> expected) {
		return operator_assertEquals(actual.iterator(), expected);
	}
	
	public static <T> boolean operator_assertEquals(Iterable<? extends T> actual, Iterable<? extends T> expected) {
		return operator_assertEquals(actual.iterator(), expected);
	}
	
	public static <T> boolean operator_assertEquals(Collection<? extends T> actual, Collection<? extends T> expected) {
		if (actual.size() != expected.size()) {
			throw new AssertionError("The collection is not of the expected length: " + expected.size());
		}
		return operator_assertEquals(actual.iterator(), expected.iterator());
	}

	public static <T> boolean operator_assertEquals(Iterator<T> actual, Iterator<T> expected) {
		int count = 0;
		while (true) {
			if (actual.hasNext() != expected.hasNext()) {
				throw new AssertionError("The iterator is not of the expected length: " + count);
			}
			if (! actual.hasNext()) {
				break;
			}
			TestCase.assertEquals("Objects at position " + count + " differed", expected.next(), actual.next());
		}
		return true;
	}
}
