package interfaces;


import java.util.Iterator;
import java.util.function.BinaryOperator;

public class BinaryComputingIterator implements Iterator<Double> {

	private final Iterator<Double> iterator1, iterator2;
	private final Double default1, default2;
	private final BinaryOperator<Double> operator;

	public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2, Double default1, Double default2, BinaryOperator<Double> operator) {
		this.iterator1 = iterator1;
		this.iterator2 = iterator2;
		this.default1 = default1;
		this.default2 = default2;
		this.operator = operator;
	}
	public BinaryComputingIterator(Iterator<Double> iterator1, Iterator<Double> iterator2, BinaryOperator<Double> operator) {
		this(iterator1, iterator2, null, null, operator);
	}

	@Override
	public boolean hasNext() {
		return (iterator1.hasNext() || default1 != null) && (iterator2.hasNext() || default2 != null) && (iterator1.hasNext() || iterator1.hasNext());
	}

	@Override
	public Double next() {
		Double next1 = (iterator1.hasNext() ? iterator1.next() : default1);
		Double next2 = (iterator2.hasNext() ? iterator2.next() : default2);
		return operator.apply(next1, next2);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Remove is not supported");
	}
}
