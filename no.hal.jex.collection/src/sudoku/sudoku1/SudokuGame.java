package sudoku.sudoku1;

import java.util.ArrayList;

class SudokuGame {

	private ArrayList<Cell> grid = new ArrayList<Cell>();
	
	/**
	 * Construct a Grid from a String describing a sudoku-problem.
	 * @param problemDefinition The initial layout of the sudoku board.
	 */
	public SudokuGame(String problemDefinition) {
		
		for(int i = 0; i < problemDefinition.length(); i++){
			Cell cell = new Cell();
			
			char cellDefinition = problemDefinition.charAt(i);
			if(cellDefinition != '.'){
				cell.readOnly = true;
				cell.value = cellDefinition - '0';
			}
			
			grid.add(cell);
		}
	}

	
	private Cell getCell(int x, int y){
		
		return grid.get(x + y*9);
	}
	
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("  +-------------+-------------+-------------+\n");
		sb.append(printMultipleRows(0, 2));
		sb.append("  +-------------+-------------+-------------+\n");
		sb.append(printMultipleRows(3, 5));
		sb.append("  +-------------+-------------+-------------+\n");
		sb.append(printMultipleRows(6, 8));
		sb.append("  +-------------+-------------+-------------+\n");
		sb.append("     a   b   c     d   e   f     g   h   i\n");
		
		return sb.toString();	
	}


	private StringBuilder printMultipleRows(int first, int last){
		
		StringBuilder sb = new StringBuilder();

		for (int row = first; row <= last; row++) {
			sb.append(printRow(row));
		}

		return sb;
	}
	
	
	private String printRow(int row){
		
		StringJoiner sj = new StringJoiner();

		// Show the row-number
		sj.append(row+1);
		sj.append("|");
		sj.append(printMultipleCells(row, 0, 2));
		sj.append("|");
		sj.append(printMultipleCells(row, 3, 5));
		sj.append("|");
		sj.append(printMultipleCells(row, 6, 8));
		sj.append("|\n");
		
		return sj.toString();	
	}
	
	
	private String printMultipleCells(int row, int first, int last){
		
		StringJoiner sj = new StringJoiner();
		
		for(int col = first; col <= last; col++){
			sj.append(this.getCell(col, row));
		}
		
		return sj.toString();	
	}


	public boolean playerMove(int col, int row, int val) {
		
		if(this.getCell(col, row).readOnly)
			return false;
		
		this.getCell(col, row).value = val;
		updateConflicts();
		
		return true;
	}


	private void updateConflicts() {
		
		resetConflicts();
		updateComumnConflics();
		updateRowConflicts();
		updateRegionConflics();
	}

	private void calculateConflicts(ArrayList<Cell> cells){
		
		UniquenessChecker counts = new UniquenessChecker();
		
		for(int i = 0; i < cells.size(); i++)
			counts.bump(cells.get(i).value);
		
		ArrayList<Integer> conflicts = counts.getConflicts();
		for(int i = 0; i < cells.size(); i++){
			int value = cells.get(i).value;
			if(conflicts.contains(value))
				cells.get(i).isInConflict = true;
		}
	}

	private void updateRegionConflics() {
		
		for(int region = 0; region < 9; region++){
			
			ArrayList<Cell> cells = new ArrayList<Cell>();
			
			for(int i = 0; i < 9; i++){
				int col = (region % 3) * 3 + (i % 3);
				int row = (region / 3) * 3 + (i / 3);
				
				cells.add(getCell(col, row));
			}
			
			calculateConflicts(cells);
		}
	}


	private void updateRowConflicts() {
		
		for(int row = 0; row < 9; row++){
			
			ArrayList<Cell> cells = new ArrayList<Cell>();

			for(int col = 0; col < 9; col++){
				cells.add(getCell(col, row));
			}
			
			calculateConflicts(cells);
		}
	}


	private void updateComumnConflics() {
		
		for(int col = 0; col < 9; col++){
			
			ArrayList<Cell> cells = new ArrayList<Cell>();

			for(int row = 0; row < 9; row++){
				cells.add(getCell(col, row));
			}
			
			calculateConflicts(cells);
		}
	}
	
	private void resetConflicts() {
		
		for(int i = 0; i < grid.size(); i++)
			grid.get(i).isInConflict = false;
	}
}
