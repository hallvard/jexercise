package sudoku.sudoku2;

/**
 * Represents a single cell on the sudoku board.
 */
class Cell {
	int value = 0;
	boolean readOnly = false;
	boolean isInConflict = false;
	
	public int getValue(){
		return value;
	}
	
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