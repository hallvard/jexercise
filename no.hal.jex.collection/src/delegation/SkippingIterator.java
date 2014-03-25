package delegation;

import java.util.Iterator;

public class SkippingIterator<T> implements Iterator<T> {

	private Iterator<T> iteratorDelegate;
	private int skipCount;

	public SkippingIterator(Iterator<T> iteratorDelegate, int skipCount) {
		this.iteratorDelegate = iteratorDelegate;
		this.skipCount = skipCount;
	}

	public boolean hasNext() {
		return iteratorDelegate.hasNext();
	}

	public T next() {
		T next = iteratorDelegate.next();
		// skip the next skipCount elements
		for (int i = 0; i < skipCount && iteratorDelegate.hasNext(); i++) {
			iteratorDelegate.next();
		}
		return next;
	}

	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}
}
