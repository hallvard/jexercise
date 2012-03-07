package mycollection;

import junit.framework.TestCase;
import no.hal.jex.eval.JExercise;

@JExercise(
		tests="MyArrayList implements MyList",
		description="The MyArrayList class is an implementation of the MyCollection and MyList interfaces," +
				"which are simplied versions of the standard (raw) Collection and List interfaces, respectively."
		)
public class MyArrayListTest extends TestCase {

	private MyList list, list2;
	
	protected void setUp() {
		list = new MyArrayList(2);
		list2 = new MyArrayList(2);
	}

	private String[] strings = {"null", "en", "to", "tre", "fire", "fem", "seks", "syv", "�tte", "ni", "ti"};
	
	private void addStrings() {
		int size = list.size();
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
			assertEquals(size + i + 1, list.size());
		}
	}

	@JExercise(
			tests="int size()",
			description="The size method returns the size of this List."
			)
	public void testSize() {
		assertEquals(0, list.size());
		addStrings();
	}

	@JExercise(
			tests="int indexOf(Object)",
			description="The indexOf method takes an object as its only argument and returns the index of the <em>first</em> occurrence of the argument in this List." +
					"If the argument does not occur in this List, -1 must be returned. Comparison must use equals and support null."
			)
	public void testIndexOf() {
		for (int i = 0; i < strings.length; i++) {
			assertEquals(-1, list.indexOf(strings[i]));
		}
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertEquals(i, list.indexOf(strings[i]));
		}
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertEquals(i, list.indexOf(strings[i]));
		}
		assertEquals(-1, list.indexOf("does-not-contain-me"));
		assertEquals(-1, list.indexOf(null));
		list.add(null);
		assertEquals(list.size() - 1, list.indexOf(null));
	}
	
	@JExercise(
			tests="int lastIndexOf(Object)",
			description="The lastIndexOf method takes an object as its only argument and returns the index of the <em>last</em> occurrence of the argument in this List." +
					"If the argument does not occur in this List, -1 must be returned. Comparison must use equals and support null."
			)
	public void testLastIndexOf() {
		for (int i = 0; i < strings.length; i++) {
			assertEquals(-1, list.indexOf(strings[i]));
		}
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertEquals(i, list.lastIndexOf(strings[i]));
		}
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertEquals(strings.length + i, list.lastIndexOf(strings[i]));
		}
		assertEquals(-1, list.lastIndexOf("does-not-contain-me"));
		assertEquals(-1, list.lastIndexOf(null));
		list.add(null);
		assertEquals(list.size() - 1, list.lastIndexOf(null));
	}
	
	@JExercise(
			tests="boolean contains(Object)",
			description="The contains method takes an object as its only argument and returns true of it occurs in this List, and false otherwise." +
					"Comparison must use equals and support null."
			)
	public void testContains() {
		for (int i = 0; i < strings.length; i++) {
			assertFalse(list.contains(strings[i]));
		}
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertTrue(list.contains(strings[i]));
		}
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertTrue(list.contains(strings[i]));
		}
		assertFalse(list.contains("does-not-contain-me"));
	}
	
	@JExercise(
			tests="Object get(int) throws IndexOutOfBoundsException",
			description="The get method takes an int as its only argument and returns the element at that position in this List." +
					"The method should throw an IndexOutOfBoundsException if the position is out of bounds."
			)
	public void testGet() {
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			assertEquals(strings[i], list.get(i));
		}
	}

	@JExercise(
			tests="void set(int,Object) throws IndexOutOfBoundsException",
			description="The set method takes an int and an Object as its arguments and sets the element at that position in this List to the provided object." +
					"The method should throw an IndexOutOfBoundsException if the position is out of bounds."
			)
	public void testSet() {
		addStrings();
		for (int i = 0; i < strings.length; i++) {
			list.set(strings.length - i - 1, strings[i]);
		}
		for (int i = 0; i < strings.length; i++) {
			assertEquals(strings[strings.length - i - 1], list.get(i));
		}
	}
	
	@JExercise(
			tests="MyIterator iterator()",
			description="The iterator method returns an instance of MyIterator that iterates over all the elements in this List."
			)
	public void testIterator() {
		addStrings();
		MyIterator it = list.iterator();
		for (int i = 0; i < strings.length; i++) {
			boolean isLast = (i == strings.length - 1);
			assertTrue(it.hasNext());
			assertEquals(list.get(i), it.next());
			assertEquals(! isLast, it.hasNext());
		}
		assertFalse(it.hasNext());
	}

	@JExercise(
			tests="void add(int,Object)",
			description="The add method takes an int and an Object as its arguments and adds the Object to this list at the provided position." +
					"Elements before that position remain in place, while elements from that position and onward are shifted to the right to make room for the new element."
			)
	public void testAdd() {
		for (int i = strings.length - 1; i >= 0; i -= 2) {
			list.add(0, strings[i]);
			for (int j = 0; j < list.size(); j++) {
				assertEquals(strings[i + j * 2], list.get(j));
			}
		}
		for (int i = 1; i < strings.length; i += 2) {
			list.add(i, strings[i]);
			for (int j = 0; j <= i + 1; j++) {
				assertEquals(strings[j], list.get(j));
			}
		}
	}
}
