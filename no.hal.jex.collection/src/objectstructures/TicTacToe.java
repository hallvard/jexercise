package objectstructures;

public class TicTacToe {
	
	/*
	 * PART 1
	 */
	
	private String gridString;
	private char player;
	
	public TicTacToe() {
		gridString = "         ";
		player = 'x';
	}
	
	public char getCell(int x, int y) {
		return gridString.charAt(indexAt(x, y));
	}
	
	public boolean setCell(char c, int x, int y) {
		if (! isOccupied(x, y)) {
			int index = indexAt(x, y);
			gridString = gridString.substring(0, index) + c + gridString.substring(index+1);
			return true;
		}
		return false;
	}
	
	public boolean isOccupied(int x, int y) {
		return getCell(x, y) != ' ';
	}

	public char getCurrentPlayer() {
		return player;
	}
	
	public String toString() {
		String str = "";
		for (int y = 0; y <= 2; y++) {
			for (int x = 0; x <= 2; x++) {
				str += " " + gridString.charAt(indexAt(x, y)) + " |";
			}
			str = str.substring(0,str.length()-2) + "\n-----------\n";
		}
		return str.substring(0, str.length()-12);
	}
	
	/* 
	 * Grid coordinates:
	 * (0,0) | (1,0) | (2,0)
	 * ---------------------
	 * (0,1) | (1,1) | (2,1)
	 * ---------------------
	 * (0,2) | (1,2) | (2,2)
	 */
	public int indexAt(int x, int y) {
		return x + 3 * y;
	}

	/*
	 * PART 2
	 */

	public void play(int x, int y) {
		if (setCell(player, x, y)) {
			// Change player
			player = player == 'x' ? 'o' : 'x';
		}
	}

	private boolean checkNInARow(char c, int n, int x, int y, int dx, int dy) {
		while (n > 0) {
			if (getCell(x, y) != c) {
				return false;
			}
			x += dx;
			y += dy;
			n--;
		}
		return true;
	}
	
	public boolean isWinner(char c) {
		return
			// rows
			checkNInARow(c, 3, 0, 0, 1, 0) || checkNInARow(c, 3, 0, 1, 1, 0) || checkNInARow(c, 3, 0, 2, 1, 0)
			|| // columns
			checkNInARow(c, 3, 0, 0, 0, 1) || checkNInARow(c, 3, 1, 0, 0, 1) || checkNInARow(c, 3, 2, 0, 0, 1)
			|| // diagonals
			checkNInARow(c, 3, 0, 0, 1, 1) || checkNInARow(c, 3, 2, 0, -1, 1)
			;
	}
	
	public boolean hasWinner() {
		return isWinner('x') || isWinner('o');
	}
	
	public boolean isFinished() {
		return hasWinner() || gridString.indexOf(' ') < 0;
	}
}