package no.hal.learning.exercise.adm.plots.matrix;

import java.util.ArrayList;
import java.util.List;

public class SparseMatrix extends AbstractMatrix {

	private final int columnCount, rowCount;
	
	private double defaultValue;
	private List<Integer> coordinates;
	private List<Double> values;

	private SparseMatrix(int columnCount, int rowCount, double defaultValue, int sizeHint) {
		this.columnCount = columnCount;
		this.rowCount = rowCount;
		this.defaultValue = defaultValue;
		this.coordinates = new ArrayList<Integer>(sizeHint * 2);
		this.values = new ArrayList<Double>(sizeHint);
	}
	
	public SparseMatrix(int columnCount, int rowCount, double defaultValue) {
		this(columnCount, rowCount, defaultValue, 4);
	}

	public SparseMatrix(int columnCount, int rowCount) {
		this(columnCount, rowCount, 0.0);
	}	

	@Override
	public int getColumnCount() {
		return columnCount;
	}

	@Override
	public int getRowCount() {
		return rowCount;
	}

	private int index(int column, int row) {
		for (int i = 0; i < coordinates.size(); i += 2) {
			if (coordinates.get(i).intValue() == column && coordinates.get(i + 1).intValue() == row) {
				return i / 2;
			}
		}
		return -1;
	}
	
	@Override
	public double get(int column, int row) {
		int index = index(column, row);
		return (index >= 0 ? values.get(index) : defaultValue);
	}

	@Override
	public void set(int column, int row, double value) {
		int index = index(column, row);
		if (index >= 0) {
			if (value == defaultValue) {
				coordinates.remove(index * 2 + 1);
				coordinates.remove(index * 2);
			} else {
				values.set(index, value);
			}
		} else if (value != defaultValue) {
			coordinates.add(column);
			coordinates.add(row);
			values.add(value);
		}
	}

	@Override
	public Matrix copy() {
		SparseMatrix matrix = new SparseMatrix(columnCount, rowCount, defaultValue, values.size());
		matrix.coordinates.addAll(this.coordinates);
		matrix.values.addAll(this.values);
		return matrix;
	}
}
