package tictactoe.tictactoe3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

import program.GridListener;
import program.GridProvider;

public class TicTacToe implements GridProvider {
	
	/*
	 * PART 1
	 */
	
	private int width = 3, height = 3;
	private String gridString;
	private char player;
	
	private Stack<String> undo = new Stack<String>();
	private Stack<String> redo = new Stack<String>();

	TicTacToe(String gridString, boolean x) {
		this.gridString = (gridString == null ? "........." : gridString);
		player = (x ? 'x' : 'o');
	}
	
	public TicTacToe() {
		this(null, true);
	}

	@Override
	public int getGridWidth() {
		return width;
	}

	@Override
	public int getGridHeight() {
		return height;
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
		return x + getGridWidth() * y;
	}

	public char getCell(int x, int y) {
		return gridString.charAt(indexAt(x, y));
	}
	
	public boolean setCell(char c, int x, int y) {
		if (! isOccupied(x, y)) {
			int index = indexAt(x, y);
			gridString = gridString.substring(0, index) + c + gridString.substring(index+1);
			fireGridChanged(x, y);
			return true;
		}
		return false;
	}
	
	public boolean isOccupied(int x, int y) {
		return getCell(x, y) != '.';
	}

	public char getCurrentPlayer() {
		return player;
	}
	
	public String toString(boolean pretty) {
		String result = (pretty ? "-------\n" : "");
		for (int y = 0; y <= 2; y++) {
			if (pretty) {
				result += "|";
			}
			for (int x = 0; x <= 2; x++) {
				char c = gridString.charAt(indexAt(x, y));
				result += (pretty && c == '.' ? ' ' : c);
				if (pretty) {
					result += "|";
				}
			}
			if (pretty) {
				result = result + "\n-------\n";
			}
		}
		return result;
	}
	
	public String toString() {
		return toString(false);
	}

	/*
	 * PART 2
	 */

	public void play(int x, int y) {
		String oldGridString = gridString;
		if (setCell(player, x, y)) {
			undo.push(oldGridString);
			changePlayer();
		}
	}

	private void changePlayer() {
		player = player == 'x' ? 'o' : 'x';
	}

	private void undo(Stack<String> from, Stack<String> to) {
		if (from.isEmpty()) {
			return;
		}
		String oldGridString = gridString;
		gridString = from.pop();
		to.push(oldGridString);
		changePlayer();
	}

	public void undo() {
		undo(undo, redo);
	}

	public void redo() {
		undo(redo, undo);
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
		return hasWinner() || gridString.indexOf('.') < 0;
	}

	@Override
	public Object getGridElement(int x, int y) {
		return getCell(x, y);
	}

	private Collection<GridListener> gridListeners = new ArrayList<GridListener>();
	
	@Override
	public void addGridListener(GridListener gridListener) {
		gridListeners.add(gridListener);
	}

	@Override
	public void removeGridListener(GridListener gridListener) {
		gridListeners.remove(gridListener);
	}
	
	private void fireGridChanged(int x, int y) {
		for (GridListener gridListener : gridListeners) {
			gridListener.gridChanged(this, x, y, 1, 1);
		}
	}
}
