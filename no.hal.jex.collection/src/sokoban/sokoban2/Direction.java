package sokoban.sokoban2;

public class Direction {

	public final int dx, dy;

	private Direction(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public final static Direction
		UP = new Direction(0, -1),
		DOWN = new Direction(0, 1),
		LEFT = new Direction(-1, 0),
		RIGHT = new Direction(1, 0);
}
