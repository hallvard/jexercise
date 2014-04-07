package game2048;

import program.GameOutput;
import program.GridGame;
import program.GridGameGUI;
import program.GridProvider;

public class Game2048 implements GridGame {

	private Grid2048 grid;
	
	@Override
	public void init(String level) {
		grid = new Grid2048();
	}

	private GameOutput output;
	
	@Override
	public void run(GameOutput output) {
		this.output = output;
		grid.putRandom();
		grid.putRandom();
	}

	@Override
	public Integer doCommand(String command) {
		switch (command) {
		case "w": return directionInput( 0, -1);
		case "s": return directionInput( 0,  1);
		case "a": return directionInput(-1,  0);
		case "d": return directionInput( 1,  0);
		}
		return null;
	}
	
	@Override
	public GridProvider getGridProvider() {
		return grid;
	}

	@Override
	public String getTextFor(Object o) {
		return null; // String.format(" %1$4s", ((Integer) o) != -1 ? o.toString() : "");
	}

	@Override
	public String getImageFor(Object o) {
		return o.toString() + ".png";
	}

	@Override
	public Integer gridElementInput(int x, int y) {
		return null;
	}

	@Override
	public Integer directionInput(int dx, int dy) {
		int shiftCount = 0;
		if (dx * dy == 0) {
			if (dx != 0) {
				shiftCount = grid.shiftRow(dx, false);
			} else if (dy != 0) {
				shiftCount = grid.shiftColumn(dy, false);
			}
		}
		output.info("Point: " + grid.getPoints());
		if (shiftCount > 0) {
			grid.putRandom();
		}
		return grid.getEmptyCount() == 0 && grid.shiftRow(-1, true) == 0 && grid.shiftRow(1, true) == 0 && grid.shiftColumn(-1, true) == 0 && grid.shiftColumn(-1, true) == 0  ? -1 : null;
	}
	
	public static void main(String[] args) throws Exception {
		GridGameGUI.main(new String[]{Game2048.class.getName()});
	}
}
