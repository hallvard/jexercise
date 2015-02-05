package battleship.battleship1;

public class Battleships {

	private int columns, rows;
	private Cell[][] board;
	
	public Battleships(String level) {
		// split lines on sequences of newlines and vertical bars
		String[] levelLines = level.split("[\n\\|]+");
		this.rows = levelLines.length;
		this.columns = levelLines[0].length();
		this.board = new Cell[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				board[row][col] = new Cell(levelLines[row].charAt(col));
			}
		}
	}
	
	public Cell getCell(int x, int y) {
		return board[y][x];
	}

	public boolean shoot(int x, int y) {
		Cell cell = getCell(x, y);
		cell.setHit(true);
		return cell.isHit() && (! cell.isEmpty());
	}

	public int countCells(boolean empty, boolean hit) {
		int count = 0;
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				Cell cell = getCell(col, row);
				if (cell.isEmpty() == empty && cell.isHit() == hit) {
					count++;
				}
			}
		}
		return count;
	}
	
	public boolean gameOver() {
		return countCells(false, false) == 0;
	}
	
	public String toString(boolean debug) {
		String boardString = "";
		for (int row = 0; row < rows; row++) {
			boardString += "|";
			for (int col = 0; col < columns; col++) {
				Cell cell = getCell(col, row);
				// show actual char, used for debugging
				char c = cell.getShipType();
				// always show hits
				if (cell.isHit()) {
					if (cell.isEmpty()) {
						boardString += "~";
					} else {
						boardString += Character.toUpperCase(c);
					}
					// always show hits
				} else if (cell.isEmpty()) {
					boardString += " ";
				} else {
					boardString += (debug ? Character.toLowerCase(c) : " ");
				}
			}
			boardString += "|";
			boardString += "\n";
		}
		return boardString;
	}

	public String toString() {
		return toString(false);
	}
}
