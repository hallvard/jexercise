package validstate;

public class Location {
	
	int x, y;
	int minX, minY;
	int maxX, maxY;
	
	@Override
	public String toString() {
		return String.format("[Location x=%d, y=%d]", x, y);
	}
	
	// check all values at once
	boolean isValidLocation(int x, int y, int minX, int minY, int maxX, int maxY) {
		return x >= minX && y >= minY && x <= maxX && y <= maxY;
	}
	
	// change limits, after first checking validity
	void limit(int newMinX, int newMinY, int newMaxX, int newMaxY) {
		if (isValidLocation(x, y, newMinX, newMinY, newMaxX, newMaxY)) {
			minX = newMinX;
			minY = newMinY;
			maxX = newMaxX;
			maxY = newMaxY;
		}
	}
	
	boolean isValidLocation(int x, int y) {
		return isValidLocation(x, y, minX, minY, maxX, maxY);
	}
	
	void move(int dx, int dy) {
		if (isValidLocation(x + dx, y + dy)) {
			x = x + dx;
			y = y + dy;
		}
	}
	
	void left() {
		move(-1, 0);
	}
	
	void right() {
		move(1, 0);
	}
	
	void up() {
		move(0, -1);
	}
	
	void down() {
		move(0, 1);
	}
}
