package delegation;

import java.util.Iterator;

public class AppendingIterator<T> implements Iterator<T> {

	private Iterator<T>[] iterators;
	private int pos;

	public AppendingIterator(Iterator<T>... iterators) {
		this.iterators = iterators;
		this.pos = 0;
	}
	
	private boolean skip() {
		while (pos < iterators.length) {
			if (iterators[pos].hasNext()) {
				return true;
			}
			pos++;
		}
		return false;
	}
	
	@Override
	public boolean hasNext() {
		return skip();
	}
	
	@Override
	public T next() {
		return iterators[pos].next();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}

}
