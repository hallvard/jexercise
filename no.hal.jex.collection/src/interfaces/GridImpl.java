package interfaces;

import java.util.Iterator;
import java.util.List;

public class GridImpl<T> implements Grid<T> {

	private int width;
	private List<T> elements;
	
	@Override
	public int getRowCount() {
		return elements.size() / width;
	}

	@Override
	public int getColumnCount() {
		return width;
	}

	private void checkValidElement(int row, int column) {
		if (row < 0 || column < 0 && row >= getRowCount() || column >= getColumnCount()) {
			throw new IllegalArgumentException("Illegal grid coordinates, " + row + "," + column + ", for a grid of size " + getRowCount() + "," + getColumnCount());
		}
	}

	@Override
	public T getElement(int row, int column) {
		checkValidElement(row, column);
		return elements.get(row * width + column);
	}

	@Override
	public T setElement(int row, int column, T element) {
		checkValidElement(row, column);
		return elements.set(row * width + column, element);
	}

	@Override
	public Iterator<T> iterator() {
		return elements.iterator();
	}
}
