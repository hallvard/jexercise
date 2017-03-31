package no.hal.learning.exercise.adm.plots.matrix;

public class MatrixFactorizer {

	private final int columnCount, rowCount, commonDimension;
	private final Matrix mA, mB, mAB;

	public MatrixFactorizer(int columnCount, int rowCount, int commonDimension) {
		this.columnCount = columnCount;
		this.rowCount = rowCount;
		this.commonDimension = commonDimension;

		this.mA = new ArrayMatrix(commonDimension, rowCount);
		this.mB = new ArrayMatrix(columnCount, commonDimension);
		this.mAB = new ArrayMatrix(columnCount, rowCount);
	}
	public MatrixFactorizer(int columnCount, int rowCount) {
		this(columnCount, rowCount, 1);
	}
	
	public Matrix getA() {
		return mA;
	}
	public double getA(int col, int row) {
		return getA().get(col, row);
	}
	public void setA(int col, int row, double value) {
		getA().set(col, row, value);
	}

	public Matrix getB() {
		return mB;
	}
	public double getB(int col, int row) {
		return getB().get(col, row);
	}
	public void setB(int col, int row, double value) {
		getB().set(col, row, value);
	}
	
	public Matrix getAB() {
		return mAB;
	}
	public double getAB(int col, int row) {
		return getAB().get(col, row);
	}
	public void setAB(int col, int row, double value) {
		getAB().set(col, row, value);
	}

	public boolean isEmpty(int col, int row) {
		return getAB(col, row) < 0.0;
	}

	private double getEstimate(int col, int row) {
		double dotProduct = 0.0;
		for (int i = 0; i < commonDimension; i++) {
			dotProduct += mA.get(i, row) * mB.get(col, i);
		}
		return dotProduct;
	}

	interface CellValueProvider {
		double get(int col, int row);
	}
	
	public CellValueProvider AB_VALUE = new CellValueProvider() {
		@Override
		public double get(int col, int row) {
			return getAB(col, row);
		}
	};
	public CellValueProvider ESTIMATE_VALUE = new CellValueProvider() {
		@Override
		public double get(int col, int row) {
			return getEstimate(col, row);
		}
	};
	public CellValueProvider ERROR_VALUE = new CellValueProvider() {
		@Override
		public double get(int col, int row) {
			return isEmpty(col, row) ? 0 : (getAB(col, row) - getEstimate(col, row));
		}
	};
	public CellValueProvider DIVERGENCE_VALUE = new CellValueProvider() {
		@Override
		public double get(int col, int row) {
			if (isEmpty(col, row)) {
				return 0;
			}
			double ab = getAB(col, row), e = getEstimate(col, row);
			return ab * Math.log(ab / e) - ab + e;
		}
	};
	public CellValueProvider SQUARE_ERROR_VALUE = new CellValueProvider() {
		@Override
		public double get(int col, int row) {
			double error = ERROR_VALUE.get(col, row);
			return error * error;
		}
	};

	public Matrix derive(CellValueProvider cellValueProvider) {
		Matrix m = getAB().copy();
		for (int col = 0; col < columnCount; col++) {
			for (int row = 0; row < rowCount; row++) {
				m.set(col, row, cellValueProvider.get(col, row));
			}
		}
		return m;
	}
	
	public double sum(CellValueProvider cellValueProvider) {
		double sum = 0.0;
		for (int col = 0; col < columnCount; col++) {
			for (int row = 0; row < rowCount; row++) {
				sum += cellValueProvider.get(col, row);
			}
		}
		return sum;
	}

	protected void update(UpdateRule updateRule) {
		for (int col = 0; col < columnCount; col++) {
			for (int row = 0; row < rowCount; row++) {
				if (! isEmpty(col, row)) {
					update(col, row, updateRule);
				}
			}
		}
	}
	
	interface UpdateRule {
		double newA(int col, int row, int k);
		double newB(int col, int row, int k);
	}

	public class GradientDescent implements UpdateRule {

		private double learningRate = 0.0005;
		private double damping = 0.02;

		public GradientDescent(double learningRate, double damping) {
			this.learningRate = learningRate;
			this.damping = damping;
		}

		public GradientDescent() {
			this(0.0005, 0.02);
		}
		
		@Override
		public double newA(int col, int row, int k) {
			double error = ERROR_VALUE.get(col, row), a = getA(k, row), b = getB(col, k);
			return a + learningRate * (error * b - damping * a);
		}
		@Override
		public double newB(int col, int row, int k) {
			double error = ERROR_VALUE.get(col, row), a = getA(k, row), b = getB(col, k);
			return b + learningRate * (error * a - damping * b);
		}
	}

	protected void update(int col, int row, UpdateRule updateRule) {
		for (int i = 0; i < commonDimension; i++) {
			setA(i, row, updateRule.newA(col, row, i));
			setB(col, i, updateRule.newB(col, row, i));
		}
	}

	public int factorize(int maxTimes, double error, UpdateRule updateRule) {
		for (int i = 0; i < maxTimes; i++) {
			update(updateRule);
			if (sum(SQUARE_ERROR_VALUE) < error) {
				return i;
			}
		}
		return -1;
	}
	
	//
	
	public static void main(String[] args) {
		MatrixFactorizer factorizer = new MatrixFactorizer(4, 5, 2);
		double[] ab = {
				 5, 3,-1, 1,
				 4,-1,-1, 1,
				 1, 1,-1, 5,
				 1,-1,-1, 4,
				-1, 1, 5, 4
		};
		factorizer.getAB().set(ab);
		System.out.println(factorizer.getAB());
		ArrayMatrix.fill(factorizer.getA(), 1.0, true);
		ArrayMatrix.fill(factorizer.getB(), 1.0, true);

		int n = 100000;
		for (int i = 0; i < n; i++) {
			factorizer.update(factorizer.new GradientDescent());
			if (factorizer.sum(factorizer.SQUARE_ERROR_VALUE) < 0.1) {
				System.out.println("Stopped after " + i + " iterations");
				break;
			}
		}
		System.out.println(factorizer.getAB());
		System.out.println(factorizer.derive(factorizer.ESTIMATE_VALUE));
		System.out.println(factorizer.sum(factorizer.SQUARE_ERROR_VALUE));
		System.out.println(factorizer.getA());
		System.out.println(factorizer.getB());
	}
}
