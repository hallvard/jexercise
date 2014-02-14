package generics;

import java.util.Iterator;

public class GridIterator<T> implements Iterator<T> {

	private Grid<T> grid;
	private boolean rowMajor;

	private int row, column;
	
	public GridIterator(Grid<T> grid, boolean rowMajor) {
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
	public T next() {
		T element = grid.getElement(row, column);
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
