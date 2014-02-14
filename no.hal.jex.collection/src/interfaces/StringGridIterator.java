package interfaces;

import java.util.Iterator;

public class StringGridIterator implements Iterator<String> {

	private StringGrid grid;
	private boolean rowMajor;

	private int row, column;
	
	public StringGridIterator(StringGrid grid, boolean rowMajor) {
		this.grid = grid;
		this.rowMajor = rowMajor;
		this.row = 0;
		this.column = 0;
	}

	@Override
	public boolean hasNext() {
		return row < grid.getRowCount() && column < grid.getColumnCount();
	}

	@Override
	public String next() {
		String element = grid.getElement(row, column);
		if (rowMajor) {
			column = column + 1;
			if (column >= grid.getColumnCount()) {
				column = 0;
				row = row + 1;
			}
		} else {
			row = row + 1;
			if (row >= grid.getRowCount()) {
				row = 0;
				column = column + 1;
			}
		}
		return element;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("GridIterator does not not support remove");
	}
}
