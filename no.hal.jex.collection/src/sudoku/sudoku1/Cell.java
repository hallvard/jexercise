package sudoku.sudoku1;

/**
 * Represents a single cell on the sudoku board.
 */
class Cell {
	int value = 0;
	boolean readOnly = false;
	boolean isInConflict = false;
	
	@Override
	public String toString() {
		if(this.readOnly)
			return "("+value+")";
		
		if(this.isInConflict)
			return " "+value+"*";
		
		if(value == 0)
			return " . ";
		
		return " "+value+" ";
	}
}