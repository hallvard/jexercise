package delegation;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class FilteringIterator<T> implements Iterator<T> {

	private Iterator<T> iteratorDelegate;
	private boolean hasNext;
	private T next;
	
	public FilteringIterator(Iterator<T> iteratorDelegate) {
		this.iteratorDelegate = iteratorDelegate;
		this.next = null;
		skip();
	}

	protected abstract boolean shouldSkip(T next);
	
	protected void skip() {
		hasNext = false;
		while (iteratorDelegate.hasNext()) {
			hasNext = true;
			next = iteratorDelegate.next();
			if (! shouldSkip(next)) {
				return;
			}
			hasNext = false;
			next = null;
		}
	}
	
	public boolean hasNext() {
		return hasNext;
	}

	public T next() {
		if (! hasNext) {
			throw new NoSuchElementException("No more elements");
		}
		T o = next;
		skip();
		return o;
	}

	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}
}
