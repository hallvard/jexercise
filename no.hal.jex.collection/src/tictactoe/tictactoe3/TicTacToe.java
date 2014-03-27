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
	
	private int gridSize = 3;
	private int winLength = 3;

	private StringBuilder gridString;
	private char player;
	
	private Stack<String> undo = new Stack<String>();
	private Stack<String> redo = new Stack<String>();

	private static StringBuilder createGridString(int size) {
		StringBuilder buffer = new StringBuilder(size * size);
		while (buffer.length() < buffer.capacity()) {
			buffer.append(".");
		}
		return buffer;
	}
	
	TicTacToe(int gridSize, int winLength, String gridString, boolean x) {
		this.gridSize = gridSize;
		this.winLength = winLength;
		this.gridString = new StringBuilder(gridString);
		this.player = (x ? 'x' : 'o');
	}
	
	public TicTacToe(int gridSize, int winLength, boolean x) {
		this(gridSize, winLength, createGridString(gridSize).toString(), x);
	}

	public TicTacToe() {
		this(3, 3, true);
	}
	
	public int getWinLength() {
		return winLength;
	}

	@Override
	public int getGridWidth() {
		return gridSize;
	}

	@Override
	public int getGridHeight() {
		return gridSize;
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
			gridString.setCharAt(index, c);
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
		String oldGridString = gridString.toString();
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
		String oldGridString = gridString.toString();
		gridString = new StringBuilder(from.pop());
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
		int count = 0;
		while (x >= 0 && x < getGridWidth() && y >= 0 && y < getGridHeight()) {
			if (getCell(x, y) == c) {
				count++;
				if (count == n) {
					return true;
				}
			} else {
				count = 0;
			}
			x += dx;
			y += dy;
		}
		return false;
	}
	
	public boolean isWinner(char c) {
		for (int i = 0; i < gridSize; i++) {
			// check down column and across row
			if (checkNInARow(c, winLength, i, 0, 0, 1) || checkNInARow(c, winLength, 0, i, 1, 0)) {
				return true;
			}
			// check diagonals
			if (checkNInARow(c, winLength, i, 0, -1, 1) || checkNInARow(c, winLength, gridSize - 1, i, -1, 1)) {
				return true;
			}
			if (checkNInARow(c, winLength, i, 0, 1, 1) || checkNInARow(c, winLength, 0, i, 1, 1)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasWinner() {
		return isWinner('x') || isWinner('o');
	}
	
	public boolean isFinished() {
		return hasWinner() || gridString.indexOf(".") < 0;
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
