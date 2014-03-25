package delegation;

import java.util.Iterator;

public class EvenIterator extends FilteringIterator<Integer> {

	public EvenIterator(Iterator<Integer> iteratorDelegate) {
		super(iteratorDelegate);
	}

	@Override
	protected boolean shouldSkip(Integer next) {
		return (next % 2) == 0;
	}
}
