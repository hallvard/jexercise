package arrays;

public class ArrayMethods1 {

	// find the smallest index of value in array
    public static int indexOf(int[] array, int value) {
    	// start i at 0, stop when the length is reached
        for (int i = 0; i < array.length; i++) {
        	// is the current element the same as the value?
            if (array[i] == value) {
            	// return the index
                return i;
            }
        }
        // return an illegal index
        return -1;
    }
    
	// find the largest index of value in array
    public static int lastIndexOf(String[] array, String value) {
    	// start i at highest possible index, continue as long as it is valid, reducing it with 1 in each iteration
    	for (int i = array.length - 1; i >= 0; i--) {
        	// is the current element equal to the value?
    		// equals is used to test for String equality
    		if (array[i].equals(value)) {
            	// return the index
    			return i;
    		}
    	}
    	return -1;
    }

	// find the index of the smallest value in array, starting at start
    public static int indexOfSmallest(int[] array, int start) {
    	// initialise the current smallest value to first element
        int smallest = array[start];
        // remember its position, too
        int pos = start;
    	// stop when the length is reached
        for (int i = start + 1; i < array.length; i++) {
        	// is the new current element a new smallest value?
            if (array[i] < smallest) {
            	// update the current smallest value and the position
                smallest = array[i];
                pos = i;
            }
        }
        // pos should now be the index of smallest value
        return pos;
    }
}
