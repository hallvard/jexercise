package delegation;

import java.util.Iterator;

public abstract class ComputingIterator<T, T1, T2> implements Iterator<T> {

	private Iterator<T1> iterator1;
	private Iterator<T2> iterator2;

	public ComputingIterator(Iterator<T1> iterator1, Iterator<T2> iterator2) {
		this.iterator1 = iterator1;
		this.iterator2 = iterator2;
	}

	@Override
	public boolean hasNext() {
		return iterator1.hasNext() && iterator2.hasNext();
	}

	@Override
	public T next() {
		T1 next1 = iterator1.next();
		T2 next2 = iterator2.next();
		return compute(next1, next2);
	}

	protected abstract T compute(T1 next1, T2 next2);

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}
}
