package no.hal.learning.exercise.adm.plots.matrix;

public class TransposedMatrix implements Matrix {

	private final Matrix transposed;
	
	public TransposedMatrix(Matrix transposed) {
		this.transposed = transposed;
	}

	public static Matrix transpose(Matrix transposed) {
		if (transposed instanceof TransposedMatrix) {
			return ((TransposedMatrix) transposed).transposed;
		}
		return new TransposedMatrix(transposed);
	}

	@Override
	public int getColumnCount() {
		return transposed.getRowCount();
	}

	@Override
	public int getRowCount() {
		return transposed.getColumnCount();
	}

	@Override
	public double get(int column, int row) {
		return transposed.get(row, column);
	}

	@Override
	public void set(int column, int row, double value) {
		transposed.set(row, column, value);
	}

	@Override
	public <T extends Number> void set(T[] values) {
		ArrayMatrix.set(this, values);
	}

	@Override
	public void set(double[] values) {
		ArrayMatrix.set(this, values);
	}

	@Override
	public Matrix copy() {
		return new TransposedMatrix(transposed.copy());
	}
}
