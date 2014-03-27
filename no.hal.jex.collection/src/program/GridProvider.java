package program;

public interface GridProvider {
	
	/**
	 * Gets the width (number of columns) of the grid
	 * @return the width of the grid
	 */
	public int getGridWidth();

	/**
	 * Gets the height (number of rows) of the grid
	 * @return the height of the grid
	 */
	public int getGridHeight();

	/**
	 * Gets the element at the specified x (column) and y (row) position 
	 * @param x the x-coordinate of the element
	 * @param y the y-coordinate of the element
	 * @return the object at the specified position
	 */
	public Object getGridElement(int x, int y);

	/**
	 * Adds the listener, so it will be notified when the grid changes
	 * @param gridListener the listener to add
	 */
	public void addGridListener(GridListener gridListener);

	/**
	 * Removes the listener, so it no longer will be notified when the grid changes
	 * @param gridListener the listener to remove
	 */
	public void removeGridListener(GridListener gridListener);
}
