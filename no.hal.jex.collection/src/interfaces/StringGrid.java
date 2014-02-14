package interfaces;

public interface StringGrid extends Iterable<String> {
	
	public int getRowCount();
	public int getColumnCount();

	public String getElement(int row, int column);
	public void setElement(int row, int column, String element);
}
