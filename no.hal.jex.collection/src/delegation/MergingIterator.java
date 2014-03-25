package delegation;

import java.util.Iterator;

public class MergingIterator<T> implements Iterator<T> {

	private Iterator<T>[] iterators;
	private int pos;

	public MergingIterator(Iterator<T>... iterators) {
		this.iterators = iterators;
		this.pos = 0;
	}
	
	private boolean skip() {
		for (int i = pos; i < pos + iterators.length; i++) {
			if (iterators[i % iterators.length].hasNext()) {
				pos = i % iterators.length;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean hasNext() {
		return skip();
	}
	
	@Override
	public T next() {
		return iterators[pos++].next();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}
}
