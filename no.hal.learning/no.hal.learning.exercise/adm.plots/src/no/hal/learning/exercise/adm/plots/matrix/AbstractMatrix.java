package no.hal.learning.exercise.adm.plots.matrix;

public abstract class AbstractMatrix implements Matrix {

	public String toString(String doubleFormat, String prefix, String columnSeparator, String rowSeparator, String suffix) {
		StringBuilder buffer = new StringBuilder();
		if (prefix != null) {
			buffer.append(prefix);
		}
		for (int row = 0; row < getRowCount(); row++) {
			for (int col = 0; col < getColumnCount(); col++) {
				if (row != 0 || col != 0) {
					if (columnSeparator != null) {
						buffer.append(columnSeparator);
					}
					if (rowSeparator != null && col == 0) {
						buffer.append(rowSeparator);					
					}
				}
				buffer.append(String.format(doubleFormat, get(col, row)));
			}
		}
		if (suffix != null) {
			buffer.append(suffix);
		}
		return buffer.toString();
	}

	public String toString() {
		return toString("%f", "{\n  ", ", ", "\n  ", "\n}");
	}

	@Override
	public void set(double[] values) {
		AbstractMatrix.set(this, values);
	}	
	
	@Override
	public <T extends Number> void set(T[] values) {
		AbstractMatrix.set(this, values);
	}
	
	//

	public static <T extends Number> void set(Matrix m, T[] values) {
		int columnCount = m.getColumnCount();
		for (int i = 0; i < values.length; i++) {
			T value = values[i];
			m.set(i % columnCount, i / columnCount, (value != null ? value.doubleValue() : 0.0));
		}
	}

	public static void set(Matrix m, double[] values) {
		fill(m, 0, 1, 0, 0, values);
	}

	public static void fill(Matrix m, int column, int colStep, int row, int rowStep, double[] values) {
		int columnCount = m.getColumnCount(), rowCount = m.getRowCount();
		for (int i = 0; i < values.length; i++) {
			m.set((column % columnCount) + row / rowCount, (row + column / columnCount) % rowCount, values[i]);
			column += colStep;
			row += rowStep;
		}
	}
	
	public static void copyInto(Matrix m1, Matrix m2) {
		for (int col = 0; col < m1.getColumnCount() && col < m2.getColumnCount(); col++) {
			for (int row = 0; row < m1.getRowCount() && row < m1.getRowCount(); row++) {
				m2.set(col, row, m1.get(col, row));
			}
		}
	}

	public static void fill(Matrix m, double value, boolean random) {
		for (int col = 0; col < m.getColumnCount(); col++) {
			for (int row = 0; row < m.getRowCount(); row++) {
				m.set(col, row, (random ? (Math.random() * value) : value));
			}
		}
	}
}
