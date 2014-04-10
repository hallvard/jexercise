package interfaces;

/*
An interface with methods for managing the content of a String grid.
The grid has a number of rows (the grid's height) and columns (the grid's width).
In each cell in the grid there is a String that can be set with the setElement method and read with the getElement method.
*/
public interface StringGrid {
	
	// Returns the number of rows in this StringGrid
	public int getRowCount();
	
	// Returns the number of columns in this StringGrid
	public int getColumnCount();

	// Returns the String at the given row and column.
	// Throws an IllegalArgumentException if the row or column is out of range
	public String getElement(int row, int column);
	
	// Sets the String at the given row and column.
	// Throws an IllegalArgumentException if the row or column is out of range
	public void setElement(int row, int column, String element);
}
