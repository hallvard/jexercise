package sokoban.sokoban2;

import java.util.ArrayList;
import java.util.List;

public class SokobanGrid {
	
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

	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return grid.size() / width;
	}

	public Cell getCell(int x, int y) {
		if (y < 0 || x < 0 || y >= getHeight() || x >= getWidth()) {
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

	private int playerX = -1, playerY = -1;

	public Boolean doMove(Direction direction) {
		// a legal move is 1 in one direction and 0 in the other
		int x = playerX, y = playerY;
		int dx = direction.dx, dy = direction.dy;
		boolean isPush = false;
		// if we need to move a box, i.e. overwrite the target, whether goal or floor
		Cell cell = getCell(x, y);
		Cell forward1 = getCell(x + dx, y + dy);
		Cell forward2 = getCell(x + dx + dx, y + dy + dy);
		if (forward1.isBox() && (! forward2.isOccupied())) {
			// remember that the move is a push
			isPush = true;
			forward1.moveTo(forward2);
		}
		if (isPush || (! forward1.isOccupied())) {
			// then move the player, i.e. overwrite the target, whether box (just moved), goal or floor
			cell.moveTo(forward1);
			playerX += dx;
			playerY += dy;
			return Boolean.valueOf(isPush);
		}
		return null;
	}
	
	public void undoMove(Direction direction, boolean wasPush) {
		int x = playerX, y = playerY;
		int dx = direction.dx, dy = direction.dy;
		// first undo player's move
		Cell cell = getCell(x, y);
		Cell backward = getCell(x - dx, y - dy);
		Cell forward = getCell(x + dx, y + dy);
		cell.moveTo(backward);
		// move box, too, if needed
		if (wasPush) {
			forward.moveTo(cell);
		}
		playerX -= dx;
		playerY -= dy;
	}
}
