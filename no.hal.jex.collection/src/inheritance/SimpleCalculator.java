package inheritance;

class SimpleCalculator extends AbstractCalculator {
	
	private Double left = Double.NaN, right = Double.NaN;

	@Override
	public String toString() {
		return "[" + left + ", " + right + "]";
	}
	
	private int getArgumentCount() {
		return (Double.isNaN(left) ? 0 : 1) + (Double.isNaN(right) ? 0 : 1);
	}
	
	@Override
	protected double[] provideArguments(int arity) {
		int argCount = getArgumentCount();
		if (arity > argCount) {
			throw new IllegalArgumentException("Can only provide upto " + argCount + " values");
		}
		double[] values = values();
		switch (arity) {
		case 2:
			values = values(left, right);
			left = Double.NaN;
			right = Double.NaN;
			break;
		case 1:
			if (Double.isNaN(right)) {
				values = values(left);
				left = Double.NaN;
			} else {
				values = values(right);
				right = Double.NaN;
			}
			break;
		}
		return values;
	}

	@Override
	protected void acceptValues(double... values) {
		int argCount = getArgumentCount();
		if (argCount + values.length > 2) {
			throw new IllegalArgumentException("Can only accept upto " + (values.length - argCount) + " values");
		}
		switch (values.length) {
		case 2:
			left = values[0];
			right = values[1];
			break;
		case 1:
			if (argCount == 1) {
				right = values[0];
			} else {
				left = values[0];
			}
			break;
		case 0:
			break;
		}
	}
}
