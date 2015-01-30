package encapsulation;

public class Nim {

	private int[] piles;
	
	public Nim() {
		this(10);
	}	
	
	public Nim(int pileSize) {
		piles = new int[]{pileSize, pileSize, pileSize};
	}
	
	@Override
	public String toString() {
		return String.format("Piles: %d, %d, %d", piles[0], piles[1], piles[2]); 
	}
	
	public void removePieces(int number, int targetPile) {
		if (isGameOver()) {
			throw new IllegalStateException("Cannot remove pieces when game is over");
		}
		if (number <= 0) {
			throw new IllegalArgumentException("Number must be greater than zero");
		}
		if (number > piles[targetPile]) {
			throw new IllegalArgumentException("Number cannot be greater than the pile (size)");
		}
		piles[targetPile] -= number;
	}

	public boolean isValidMove(int number, int targetPile) {
		return number > 0 && piles[targetPile] >= number && (! isGameOver());
	}

	public boolean isGameOver() {
		return piles[0] == 0 || piles[1] == 0 || piles[2] == 0;
	}

	public int getPile(int targetPile) {
		return piles[targetPile];
	}
}
