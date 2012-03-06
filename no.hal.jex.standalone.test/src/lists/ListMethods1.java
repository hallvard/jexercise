package lists;

import java.util.List;

public class ListMethods1 {

	// find the smallest index of value in array
    public static int indexOf(List<Integer> list, int value) {
    	// start i at 0, stop when the length is reached
        for (int i = 0; i < list.size(); i++) {
        	// is the current element the same as the value?
            if (list.get(i) == value) {
            	// return the index
                return i;
            }
        }
        // return an illegal index
        return -1;
    }
    
	// find the largest index of value in array
    public static int lastIndexOf(List<String> list, String value) {
    	// start i at highest possible index, continue as long as it is valid, reducing it with 1 in each iteration
    	for (int i = list.size() - 1; i >= 0; i--) {
        	// is the current element equal to the value?
    		// equals is used to test for String equality
    		if (list.get(i).equals(value)) {
            	// return the index
    			return i;
    		}
    	}
    	return -1;
    }

	// find the index of the smallest value in array, starting at start
    public static int indexOfSmallest(List<Integer> list, int start) {
    	// test if start is out of range
    	if (start < 0 || start >= list.size()) {
    		return -1;
    	}
        // remember the position of the smallest element found, so far
        int pos = start;
    	// stop when the length is reached
        for (int i = start + 1; i < list.size(); i++) {
        	// is the new current element a new smallest value?
            if (list.get(i) < list.get(pos)) {
            	// update the current smallest value and the position
                pos = i;
            }
        }
        // pos should now be the index of smallest value
        return pos;
    }
}
