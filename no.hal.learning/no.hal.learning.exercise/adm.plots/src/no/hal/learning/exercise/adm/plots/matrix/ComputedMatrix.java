package no.hal.learning.exercise.adm.plots.matrix;

public abstract class ComputedMatrix extends AbstractMatrix {
	
	private final int columnCount, rowCount;

	public ComputedMatrix(int columnCount, int rowCount) {
		this.columnCount = columnCount;
		this.rowCount = rowCount;
	}	

	@Override
	public int getColumnCount() {
		return columnCount;
	}
	
	@Override
	public int getRowCount() {
		return rowCount;
	}

	@Override
	public Matrix copy() {
		return this;
	}
	
	@Override
	public void set(int column, int row, double value) {
		throw new UnsupportedOperationException("Immutable matrix");
	}
}
