package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(
		description="The ArrayMethods1 class should contain a set of helper methods for querying arrays.",
		comment="Helper methods usually have a specific modifier, which one?",
		tags={"array", "iteration"}
		)
public class ListMethods1Test extends TestCase {

	@JExercise(
			tests="static int indexOf(int[],int)",
			description="The indexOf method should take an int array and an int value as arguments." +
					"The method should return the index of the <em>first</em> occurrence of the value within the array.",
			comment="If the value does not occur in the array the method should return the standard illegal index -1."
	)
	public void testIndexOf() {
		testIndexOf(0, new int[]{0, 1, 2, 3, 4, 5}, 0);
		testIndexOf(3, new int[]{5, 4, 3, 0, 1, 2, 3, 4}, 0);
		testIndexOf(5, new int[]{5, 4, 3, 2, 1, 0}, 0);
		testIndexOf(3, new int[]{0, 1, 2, 3, 4, 5}, 3);
		testIndexOf(2, new int[]{5, 4, 3, 0, 1, 2, 3, 4}, 3);
		testIndexOf(-1, new int[]{5, 4, 3, 2, 1, 0}, -1);
	}
	private void testIndexOf(int expected, int array[], int value) {
		assertEquals(String.format("Testing ArrayMethod1.indexOf(%s,%s)", Arrays.asList(array), value), expected, ListMethods1.indexOf(asList(array), value));
	}
	private List<Integer> asList(int[] array) {
		List<Integer> list = new ArrayList<Integer>(array.length);
		for (int i = 0; i < array.length; i++) {
			list.add(Integer.valueOf(array[i]));
		}
		return list;
	}

	@JExercise(
			tests="static int lastIndexOf(String[],String)",
			description="The lastIndexOf method should take a String array and a String reference as arguments." +
					"The method should return the index of the <em>last</em> occurrence of the String within the array.",
			comment="If the value does not occur in the array the method should return the standard illegal index -1."
	)
	public void testLastIndexOf() {
		testLastIndexOf(0, "0", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(14, "4", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(5, new String("5"), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(9, new String("9"), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(-1, "-1", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(-1, "10", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
	}
	private void testLastIndexOf(int expected, String value, String array[]) {
		assertEquals(String.format("Testing ArrayMethod1.lastIndexOf(%s,%s)", Arrays.asList(array), value), expected, ListMethods1.lastIndexOf(Arrays.asList(array), value));
	}

	@JExercise(
			tests="static int indexOfSmallest(int[],int)",
			description="The indexOfSmallest method should take an int array and an index (into the same array) as arguments." +
					"The method should return the index of the <em>smallest</em> value, among the values from the provided index to the end of the array.",
			comment="If the array is empty or the index is out of range the method should return the standard illegal index -1."
	)
	public void testIndexOfSmallest() {
		testIndexOfSmallest(0, new int[]{0, 1, 2, 3, 4, 5}, 0);
		testIndexOfSmallest(3, new int[]{5, 4, 3, 0, 1, 2, 3, 4}, 0);
		testIndexOfSmallest(5, new int[]{5, 4, 3, 2, 1, 0}, 0);
		testIndexOfSmallest(3, new int[]{0, 1, 2, 3, 4, 5}, 3);
		testIndexOfSmallest(3, new int[]{5, 4, 3, 0, 1, 2, 3, 4}, 3);
		testIndexOfSmallest(5, new int[]{5, 4, 3, 2, 1, 0}, 3);
		testIndexOfSmallest(-1, new int[]{}, 3);
	}
	private void testIndexOfSmallest(int expected, int array[], int start) {
		assertEquals(String.format("Testing ArrayMethod1.indexOfSmallest(%s,%s)", Arrays.asList(array), start), expected, ListMethods1.indexOfSmallest(asList(array), start));
	}
}
