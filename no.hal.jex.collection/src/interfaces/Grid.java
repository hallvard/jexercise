package interfaces;

public interface Grid<T> extends Iterable<T> {
	
	public int getRowCount();
	public int getColumnCount();

	public T getElement(int row, int column);
	public T setElement(int row, int column, T element);
}
