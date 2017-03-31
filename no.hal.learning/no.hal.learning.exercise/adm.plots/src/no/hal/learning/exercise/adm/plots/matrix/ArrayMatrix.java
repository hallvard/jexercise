package no.hal.learning.exercise.adm.plots.matrix;

public class ArrayMatrix extends AbstractMatrix {
	
	private final int columnCount, rowCount;
	private double[] values;

	public ArrayMatrix(int columnCount, int rowCount) {
		this.columnCount = columnCount;
		this.rowCount = rowCount;
		this.values = new double[rowCount * columnCount];
	}	

	public ArrayMatrix(int columnCount, int rowCount, double... values) {
		this(columnCount, rowCount);
		set(values);
	}

	public <T extends Number> ArrayMatrix(int columnCount, int rowCount, T[] values) {
		this(columnCount, rowCount);
		set(values);
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
	public void set(double[] values) {
		System.arraycopy(values, 0, this.values, 0, values.length);
	}	

	@Override
	public Matrix copy() {
		return new ArrayMatrix(columnCount, rowCount, values);
	}

	protected int index(int column, int row) {
		return row * columnCount + column;
	}
	
	@Override
	public double get(int column, int row) {
		return values[index(column, row)];
	}
	
	@Override
	public void set(int column, int row, double value) {
		values[index(column, row)] = value;
	}
}
