package delegation;


import java.util.Iterator;
import java.util.function.BinaryOperator;

public class BinaryComputingIterator implements Iterator<Double> {

	private Iterator<Double> iterator1;
	private Iterator<Double> iterator2;
	private BinaryOperator<Double> operator;

	public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2, BinaryOperator<Double> operator) {
		this.iterator1 = iterator1;
		this.iterator2 = iterator2;
		this.operator = operator;
	}

	@Override
	public boolean hasNext() {
		return iterator1.hasNext() && iterator2.hasNext();
	}

	@Override
	public Double next() {
		Double next1 = iterator1.next();
		Double next2 = iterator2.next();
		return operator.apply(next1, next2);
	}


	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}
}
