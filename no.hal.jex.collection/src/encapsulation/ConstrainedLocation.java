package encapsulation;

public class ConstrainedLocation {

	private int x = 0, y = 0;
	private int minX = Integer.MIN_VALUE, minY = Integer.MIN_VALUE;
	private int maxX = Integer.MAX_VALUE, maxY = Integer.MAX_VALUE;
	
	public ConstrainedLocation() {
	}
	
	public ConstrainedLocation(int x, int y, int minX, int minY, int maxX, int maxY) {
		this.x = x;
		this.y = y;
		this.minX = minX;
		this.minY = minY;		
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public boolean isValidCoordinates(int x, int y) {
		return x >= minX && x <= maxX && y >= minY && y <= maxY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	private void moveTo(int x, int y) {
		if (isValidCoordinates(x, y)) {
			this.x = x;
			this.y = y;
		}
	}
	
	private void move(int dx, int dy) {
		moveTo(x + dx, y + dy);
	}

	public void up() {
		move(0, -1);
	}
	
	public void down() {
		move(0, 1);
	}
	
	public void left() {
		move(-1, 0);
	}
	
	public void right() {
		move(1, 0);
	}
}
