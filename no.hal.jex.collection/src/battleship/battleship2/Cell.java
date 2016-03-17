package battleship.battleship2;

public class Cell {

	private final Ship ship;
	private boolean hit;

	public Cell(Ship ship) {
		this.ship = ship;
		setHit(false);
	}

	public Ship getShip() {
		return ship;
	}

	public ShipType getShipType() {
		return ship != null ? ship.getShipType() : null;
	}

	public char getCharacter() {
		return ship != null ? ship.getCharacter() : '~';
	}

	public boolean isShip() {
		return ship != null;
	}

	public void setHit(boolean hit) {
		this.hit = hit;
	}

	public boolean isHit() {
		return hit;
	}

	public String toString() {
		char c;
        if (isHit())
            c = (isShip()) ? 'X' : 'O';
        else
            c = '~';
        return String.valueOf(c);
	}
}
