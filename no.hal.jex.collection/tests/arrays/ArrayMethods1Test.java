package arrays;

import java.util.Random;

import junit.framework.TestCase;
import no.hal.jex.eval.JExercise;

@JExercise(
		description="The ArrayMethods1 class should contain a set of helper methods for querying arrays.",
		comment="Helper methods usually have a specific modifier, which one?",
		tags={"array", "iteration"}
		)
public class ArrayMethods1Test extends TestCase {

	private static int[] sequence(int start, int end) {
		int[] array = new int[end - start];
		for (int i = 0; i < array.length; i++) {
			array[i] = start + i;
		}
		return array;
	}

	private static Random random = new Random();

	private static int[] random(int size, int min, int max) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = random(min, max);
		}
		return array;
	}
	private static int random(int min, int max) {
		return random.nextInt(max - min) + min;
	}

	private void testIndexOf(int value, int array[]) {
		int result = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				result = i;
				break;
			}
		}
		assertEquals(result, ArrayMethods1.indexOf(array, value));
	}
	
	@JExercise(
			tests="static int indexOf(int[],int)",
			description="The indexOf method should take an int array and an int value as arguments." +
					"The method should return the index of the <em>first</em> occurrence of the value within the array.",
			comment="If the value does not occur in the array the method should return the standard illegal index -1."
	)
	public void testIndexOf() {
		for (int i = -1; i <= 10; i++) {
			testIndexOf(i, sequence(0, 10));
		}
		for (int i = -1; i <= 10; i++) {
			testIndexOf(i, random(10, 0, 10));
		}
	}

	private void testLastIndexOf(String value, String array[]) {
		int result = -1;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i].equals(value)) {
				result = i;
				break;
			}
		}
		assertEquals(result, ArrayMethods1.lastIndexOf(array, value));
	}

	@JExercise(
			tests="static int lastIndexOf(String[],String)",
			description="The lastIndexOf method should take a String array and a String reference as arguments." +
					"The method should return the index of the <em>last</em> occurrence of the String within the array.",
			comment="If the value does not occur in the array the method should return the standard illegal index -1."
	)
	public void testLastIndexOf() {
		testLastIndexOf("0", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf("4", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(new String("5"), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf(new String("9"), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf("-1", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
		testLastIndexOf("10", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
	}
	
	private void testIndexOfSmallest(int array[], int start) {
		int minIndex = -1;
		int minValue = Integer.MAX_VALUE;
		for (int i = start; i < array.length; i++) {
			if (array[i] < minValue) {
				minIndex = i;
				minValue = array[i];
			}
		}
		assertEquals(minIndex, ArrayMethods1.indexOfSmallest(array, start));
	}
	
	@JExercise(
			tests="static int indexOfSmallest(int[],int)",
			description="The indexOfSmallest method should take an int array and an index (into the same array) as arguments." +
					"The method should return the index of the <em>smallest</em> value, starting from the provided index.",
			comment="If the array is empty the method should return the standard illegal index -1."
	)
	public void testIndexOfSmallest() {
		for (int i = 0; i < 9; i++) {
			testIndexOfSmallest(ArrayMethods1Test.random(10, 0, 10), i);
		}
	}
}
