package interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringGridImpl implements StringGrid, Iterable<String> {

	private int columnCount;
	private List<String> elements;
	
	public StringGridImpl(int rows, int columnCount) {
		elements = new ArrayList<String>(rows * columnCount);
		for (int count = 0; count < rows * columnCount; count++) {
			elements.add(null);
		}
		this.columnCount = columnCount;
	}

	// from StringGrid
	
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
	public String getElement(int row, int column) {
		checkValidElement(row, column);
		return elements.get(getIndex(row, column));
	}

	@Override
	public void setElement(int row, int column, String element) {
		checkValidElement(row, column);
		elements.set(getIndex(row, column), element);
	}
	
	// from Iterable<String>

	@Override
	public Iterator<String> iterator() {
		return elements.iterator();
	}
}
