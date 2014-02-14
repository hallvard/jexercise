package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GridImpl<T> implements Grid<T> {

	private int columnCount;
	private List<T> elements;
	
	public GridImpl(int rows, int columnCount) {
		elements = new ArrayList<T>(rows * columnCount);
		for (int count = 0; count < rows * columnCount; count++) {
			elements.add(null);
		}
		this.columnCount = columnCount;
	}

	@Override
	public int getRowCount() {
		return elements.size() / columnCount;
	}

	@Override
	public int getColumnCount() {
		return columnCount;
	}

	private void checkValidElement(int row, int column) {
		if (row < 0 || column < 0 && row >= getRowCount() || column >= getColumnCount()) {
			throw new IllegalArgumentException("Illegal grid coordinates, " + row + "," + column + ", for a grid of size " + getRowCount() + "," + getColumnCount());
		}
	}
	
	private int getIndex(int row, int column) {
		return row * getColumnCount() + column;
	}

	@Override
	public T getElement(int row, int column) {
		checkValidElement(row, column);
		return elements.get(getIndex(row, column));
	}

	@Override
	public void setElement(int row, int column, T element) {
		checkValidElement(row, column);
		elements.set(getIndex(row, column), element);
	}

	@Override
	public Iterator<T> iterator() {
		return elements.iterator();
	}
}
