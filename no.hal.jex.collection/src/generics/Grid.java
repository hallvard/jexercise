package generics;

public interface Grid<T> extends Iterable<T> {
	
	public int getRowCount();
	public int getColumnCount();

	public T getElement(int row, int column);
	public void setElement(int row, int column, T element);
}
