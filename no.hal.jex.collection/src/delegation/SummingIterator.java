package delegation;

import java.util.Iterator;

public class SummingIterator extends ComputingIterator<Integer, Integer, Integer> {

	public SummingIterator(Iterator<Integer> iterator1, Iterator<Integer> iterator2) {
		super(iterator1, iterator2);
	}

	@Override
	protected Integer compute(Integer next1, Integer next2) {
		return next1 + next2;
	}
}
