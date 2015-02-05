package battleship.battleship1;

public class Cell {

	private char shipType;
	private boolean hit;

	public Cell(char shipType) {
		this.shipType = shipType;
		hit = false;
	}

	public boolean isShipType(char shipType) {
		return this.shipType == shipType;
	}

	public boolean isEmpty() {
		return isShipType('\0') || isShipType(' ') || isShipType('.');
	}
	
	public void setShipType(char shipType) {
		this.shipType = shipType;
	}
	
	public char getShipType() {
		return shipType;
	}
	
	public boolean isHit() {
		return hit;
	}
	
	public void setHit(boolean hit) {
		this.hit = hit;
	}
}
