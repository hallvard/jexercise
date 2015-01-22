package encapsulation;

public class MinMaxLocation {

	private int x, y;
	private int minX;
	private int maxX;
	private int minY;
	private int maxY;
	
	public MinMaxLocation(int minX, int maxX, int minY, int maxY) {
		x = 0;
		y = 0;
		
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}
	
	private boolean isValidCoordinates(int x, int y){
		return x >= minX && x <= maxX && y >= minY && y <= maxY;
	}

	public void setY(int y) {
		if(isValidCoordinates(this.x, y))
			this.y = y;
		else
			throw new IllegalArgumentException("y = " + y + " is outside coordinate bounds.");
	}

	public void setX(int x) {
		if(isValidCoordinates(x, this.y))
			this.x = x;
		else
			throw new IllegalArgumentException("x = " + x + " is outside coordinate bounds.");
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void up() {
		if(isValidCoordinates(x, y-1))
			y--;
	}
	
	public void down() {
		if(isValidCoordinates(x, y+1))
			y++;
	}
	
	public void left() {
		if(isValidCoordinates(x-1, y))
			x--;
	}
	
	public void right() {
		if(isValidCoordinates(x+1, y))
			x++;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
