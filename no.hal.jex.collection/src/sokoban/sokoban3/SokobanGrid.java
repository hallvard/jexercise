package sokoban.sokoban3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import program.GridListener;
import program.GridProvider;

public class SokobanGrid implements GridProvider {
	
	private int width;
	private List<Cell> grid;
	
	public SokobanGrid(String[] lines) {
		// first we compute the width, as the maximum length of the lines
		width = 0;
		for (int y = 0; y < lines.length; y++) {
			width = Math.max(width, lines[y].length());
		}
		grid = new ArrayList<Cell>(lines.length * width);
		// fill the array with the characters in the lines
		// note that lines may be shorter than the width, so some cells may not be set
		for (int y = 0; y < lines.length; y++) {
			String line = lines[y];
			for (int x = 0; x < width; x++) {
				Cell cell = (x < line.length() ? new Cell(line.charAt(x)) : new Cell());
				if (cell.isPlayer()) {
					playerX = x;
					playerY = y;
				}
				grid.add(cell);
			}
		}
	}
	
	@Override
	public String toString() {
		return toString("\n");
	}
	
	public String toString(String separator) {
		// with a StringBuilder, we can create a String without garbage
		StringBuilder builder = new StringBuilder();
		int num = 0;
		// for each cell
		for (Cell cell : grid) {
			// add the corresponding char
			builder.append(cell.toChar());
			num++;
			// if end-of-line and not end of grid, add separator
			if (num == width && num < grid.size()) {
				builder.append(separator);
				num = 0;
			}
		}
		// convert the StringBuilder to a String
		return builder.toString();
	}

	@Override
	public int getGridWidth() {
		return width;
	}
	
	@Override
	public int getGridHeight() {
		return grid.size() / width;
	}

	public Cell getGridElement(int x, int y) {
		if (y < 0 || x < 0 || y >= getGridHeight() || x >= getGridWidth()) {
			return null;
		}
		return grid.get(y * width + x);
	}

	public int countRemainingTargets() {
		int count = 0;
		// iterate over all cells
		for (Cell cell : grid) {
			// increase counter if this cell is a target without box
			if (cell.isTarget() && (! cell.isBox())) {
				count++;
			}
		}
		return count;
	}

	public void clearDirections() {
		for (Cell cell : grid) {
			cell.setDirection(null);
		}
	}
	
	private int playerX = -1, playerY = -1;

	public int[] getPlayerPosition() {
		return new int[]{playerX, playerY};
	}
	
	public Boolean tryMove(int x, int y, int dx, int dy, boolean allowPush, boolean reallyDo) {
		// a legal move is 1 in one direction and 0 in the other
		boolean isPush = false;
		// if we need to move a box, i.e. overwrite the target, whether goal or floor
		Cell cell = getGridElement(x, y);
		Cell forward1 = getGridElement(x + dx, y + dy);
		Cell forward2 = getGridElement(x + dx + dx, y + dy + dy);
		if (allowPush && forward1.isBox() && (! forward2.isOccupied())) {
			// remember that the move is a push
			isPush = true;
			if (reallyDo) {
				forward1.moveTo(forward2);
			}
		}
		if (isPush || (! forward1.isOccupied())) {
			// then move the player, i.e. overwrite the target, whether box (just moved), goal or floor
			if (reallyDo) {
				cell.moveTo(forward1);
				playerX += dx;
				playerY += dy;
				fireGridChanged(x, y, dx, dy, isPush);
			}
			return Boolean.valueOf(isPush);
		}
		return null;
	}

	public Boolean doMove(Direction direction) {
		return tryMove(playerX, playerY, direction.dx, direction.dy, true, true);
	}
	
	public void undoMove(Direction direction, boolean wasPush) {
		int x = playerX, y = playerY;
		int dx = direction.dx, dy = direction.dy;
		// first undo player's move
		Cell cell = getGridElement(x, y);
		Cell backward = getGridElement(x - dx, y - dy);
		Cell forward = getGridElement(x + dx, y + dy);
		cell.moveTo(backward);
		// move box, too, if needed
		if (wasPush) {
			forward.moveTo(cell);
		}
		playerX -= dx;
		playerY -= dy;
		fireGridChanged(playerX, playerY, dx, dy, wasPush);
	}

	//
	
	private Collection<GridListener> gridListeners = new ArrayList<GridListener>();
	
	@Override
	public void addGridListener(GridListener gridListener) {
		gridListeners.add(gridListener);
	}

	@Override
	public void removeGridListener(GridListener gridListener) {
		gridListeners.remove(gridListener);
	}
	
	private void fireGridChanged(int x, int y, int dx, int dy, boolean isPush) {
		int d = 2 + (isPush ? 1 : 0);
		int w = dx * d, h = dy * d;
		if (w < 0) {
			x += w + 1;
			w = -w;
		} else if (w == 0) {
			w = 1;
		}
		if (h < 0) {
			y += h + 1;
			h = -h;
		} else if (h == 0) {
			h = 1;
		}
		for (GridListener gridListener : gridListeners) {
			gridListener.gridChanged(this, x, y, w, h);
		}
	}
}
