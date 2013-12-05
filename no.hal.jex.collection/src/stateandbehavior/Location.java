package stateandbehavior;

public class Location {
	
	int x, y;
	
	@Override
	public String toString() {
		return String.format("[Location x=%d, y=%d]", x, y);
	}
	
	void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
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
