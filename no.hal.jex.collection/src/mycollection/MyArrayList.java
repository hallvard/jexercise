package mycollection;

public class MyArrayList implements MyCollection, MyList {

	private static final int EXTRA_SPACE = 4;

	private Object[] array; // internal array
	private int size = 0; // the part that is actually used

	// use this one when you know in advance how big the array needs to be
	public MyArrayList(int capacity) {
		array = new Object[capacity];
	}
	// use this one when you want a reasonable default capacity
	public MyArrayList() {
		this(EXTRA_SPACE);
	}

	private void shiftAndCopyIfNeeded(int newSize, int pos) {
		// if needed, create and copy into new array
		if (array.length < newSize) {
			// create new array of desired size, at least newSize big
			Object[] newArray = new Object[newSize + EXTRA_SPACE];
			// copy all elements from array into newArray
			System.arraycopy(array, 0, newArray, 0, size);
			// use the newArray instead of the old 
			array = newArray;
		}
		// if there are elements above pos
		if (pos < size) {
			// shift content from pos and above
			// if newSize is greater than size, makes room for (newSize - size) elements at pos
			// in this case, make sure to fill the gap with new elements
			// if newSize is less than size, overwrites (newSize - size) elements below pos
			System.arraycopy(array, pos, array, newSize - (size - pos), size - pos);
		}
		// finally, use the new size
		size = newSize;
	}

	public int size() {
		return size;
	}
	
	private void checkIndex(int pos, int max) {
		// check that pos is in the range [0, max)
		if (pos < 0 || pos >= max) {
			throw new IndexOutOfBoundsException("The index must greater than 0 and less than " + max + ", but was " + pos);
		}
	}

	public Object get(int pos) {
		checkIndex(pos, size);
		// return the element at pos, after checking the validity of pos
		return array[pos];
	}
	public void set(int pos, Object o) {
		checkIndex(pos, size);
		// set the element at pos, after checking the validity of pos
		array[pos] = o;
	}
	
	public int indexOf(Object o) {
		// loop through the used part of array
		for (int i = 0; i < size; i++) {
			// if o is null we check against null else use equals
			if (o == null ? array[i] == null : o.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(Object o) {
		// loop backwards through the used part of array
		for (int i = size - 1; i >= 0; i--) {
			// if o is null we check against null else use equals
			if (o == null ? array[i] == null : o.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}
	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}
	public boolean containsAll(MyCollection col) {
		MyIterator it = col.iterator();
		while (it.hasNext()) {
			if (! contains(it.next())) {
				return false;
			}
		}
		return true;
	}
	
	public void add(int pos, Object o) {
		checkIndex(pos, size + 1);
		// make room for one element
		shiftAndCopyIfNeeded(size + 1, pos);
		// and set it
		array[pos] = o;
	}
	public void add(Object o) {
		// add o at end of this list
		add(size, o);
	}
	public void addAll(int pos, MyCollection col) {
		checkIndex(pos, size + 1);
		// make room for new elements
		shiftAndCopyIfNeeded(size + col.size(), pos);
		// loop through col's content, setting the appropriate array element
		MyIterator it = col.iterator();
		while (it.hasNext()) {
			array[pos] = it.next();
			pos++;
		}
	}
	public void addAll(MyCollection col) {
		// add col at end of this list
		addAll(size, col);
	}

	public void remove(int pos) {
		checkIndex(pos, size);
		// shift elements above pos to the left
		shiftAndCopyIfNeeded(size - 1, pos + 1);
	}
	public void remove(Object o) {
		int pos = indexOf(o);
		if (pos >= 0) {
			// shift elements above pos to the left
			shiftAndCopyIfNeeded(size - 1, pos + 1);
		}
	}
	public void removeAll(MyCollection col) {
		// loop through col's content, removing each element
		MyIterator it = col.iterator();
		while (it.hasNext()) {
			remove(it.next());
		}
	}

	public void retainAll(MyCollection col) {
		int count = 0;
		// shift each element left the number of items found so far
		// this will overwrite elements that should be removed
		for (int i = 0; i < size; i++) {
			if (! col.contains(array[i])) {
				// if element should be remove, just increase the shift counter
				count++;
			} else {
				// shift element count positions to the left
				array[i - count] = array[i];
			}
		}
		// we have removed count elements, so reduce the size accordingly
		size -= count;
	}

	public MyIterator iterator() {
		return new MyListIterator(this);
	}
}
