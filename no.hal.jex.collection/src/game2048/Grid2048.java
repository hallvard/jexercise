package game2048;

import java.util.ArrayList;
import java.util.Collection;

import program.GridListener;
import program.GridProvider;

public class Grid2048 implements GridProvider {

	private int[][] grid = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
	private int emptyCount = 16;

	private int points = 0;

	@Override
	public int getGridWidth() {
		return grid[0].length;
	}

	@Override
	public int getGridHeight() {
		return grid.length;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		for (int y = 0; y < getGridHeight(); y++) {
			for (int x = 0; x < getGridWidth(); x++) {
				int value = getGridElement(x, y);
				buffer.append(String.format(" %1$4s", value));
			}
		}
		return buffer.toString();
	}

	public int getEmptyCount() {
		return emptyCount;
	}

	public int getPoints() {
		return points;
	}

	public int getGridValue(int x, int y) {
		return (x >= 0 && x < getGridWidth() && y >= 0 && y < getGridHeight()) ? grid[y][x] : -1;
	}

	private void setGridValue(int x, int y, int value) {
		int oldValue = getGridValue(x, y);
		grid[y][x] = value;
		if (oldValue == 0 && value != 0) {
			emptyCount--;
		} if (oldValue != 0 && value == 0) {
			emptyCount++;
		} else if (oldValue == value) {
			return;
		}
		fireGridChanged(x, y);
	}

	public int[] putRandom() {
		int pos = (int) (Math.random() * emptyCount);
		for (int y = 0; y < getGridHeight(); y++) {
			for (int x = 0; x < getGridWidth(); x++) {
				if (getGridValue(x, y) == 0) {
					if (pos == 0) {
						setGridValue(x, y, 2);
						return new int[]{x, y};
					}
					pos--;
				}
			}
		}
		return null;
	}

	public int shiftRow(int dx, boolean justCheck) {
		int shiftCount = 0;
		for (int y = 0; y < getGridHeight(); y++) {
			int emptyCount = 0;
			boolean first = true, mergedLast = false;
			for (int x = (dx < 0 ? 0 : getGridWidth() - 1); x >= 0 && x < getGridWidth(); x -= dx) {
				boolean[] shiftStep = shiftStep(x, y, dx, 0, emptyCount, first, mergedLast, justCheck);
				if (shiftStep == null) {
					return -1;
				}
				shiftCount += (shiftStep[0] ? 1 : 0);
				emptyCount += (shiftStep[1] ? 1 : 0);
				mergedLast = (shiftStep[0] && shiftStep[1]);
				first = false;
			}
		}
		return shiftCount;
	}

	private boolean[] shiftStep(int x, int y, int dx, int dy, int emptyCount, boolean first, boolean mergedLast, boolean justCheck) {
		int value = getGridValue(x, y);
		if (value == 0) {
			return (justCheck ? null : new boolean[]{false, true});
		} else if (first) {
		} else if ((! mergedLast) && value == getGridValue(x + (emptyCount + 1) * dx, y + (emptyCount + 1) * dy)) {
			if (justCheck) {
				return null;
			}
			setGridValue(x + (emptyCount + 1) * dx, y + (emptyCount + 1) * dy, value * 2);
			points += value * 2;
			setGridValue(x, y, 0);
			return new boolean[]{true, true};
		} else if (emptyCount > 0) {
			setGridValue(x + emptyCount * dx, y + emptyCount * dy, value);
			setGridValue(x, y, 0);
			return new boolean[]{true, false};
		}
		return new boolean[]{false, false};
	}

	public int shiftColumn(int dy, boolean justCheck) {
		int shiftCount = 0;
		for (int x = 0; x < getGridWidth(); x++) {
			int emptyCount = 0;
			boolean first = true, mergedLast = false;
			for (int y = (dy < 0 ? 0 : getGridHeight() - 1); y >= 0 && y < getGridHeight(); y -= dy) {
				boolean[] shiftStep = shiftStep(x, y, 0, dy, emptyCount, first, mergedLast, justCheck);
				if (shiftStep == null) {
					return -1;
				}
				shiftCount += (shiftStep[0] ? 1 : 0);
				emptyCount += (shiftStep[1] ? 1 : 0);
				mergedLast = (shiftStep[0] && shiftStep[1]);
				first = false;
			}
		}
		return shiftCount;
	}

	@Override
	public Integer getGridElement(int x, int y) {
		return getGridValue(x, y);
	}

	private Collection<GridListener> gridListeners = new ArrayList<GridListener>();

	private void fireGridChanged(int x, int y) {
		for (GridListener gridListener : gridListeners) {
			gridListener.gridChanged(this, x, y, 1, 1);
		}
	}

	@Override
	public void addGridListener(GridListener gridListener) {
		gridListeners.add(gridListener);
	}

	@Override
	public void removeGridListener(GridListener gridListener) {
		gridListeners.remove(gridListener);
	}
}
