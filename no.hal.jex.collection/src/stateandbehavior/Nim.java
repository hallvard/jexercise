package stateandbehavior;

public class Nim {

	private int[] piles = new int[3];
	
	public Nim(){
		this(10);
	}	
	
	public Nim(int pileSize){
		piles[0] = pileSize;
		piles[1] = pileSize;
		piles[2] = pileSize;
	}
	
	public void removePieces(int number, int targetPile){
		if(isValidMove(number, targetPile)){
			piles[targetPile-1] -= number;
		}
	}

	public boolean isValidMove(int number, int targetPile){
		return number > 0 && piles[targetPile-1] - number >= 0;
	}

	public boolean isGameOver() {
		return piles[0] == 0 || piles[1] == 0 || piles[2] == 0;
	}

	@Override
	public String toString() {
		return "Pile 1: " + piles[0] 
				+ "\nPile 2: " + piles[1] 
				+ "\nPile 3: " + piles[2]; 
	}
	
	public int getPile(int targetPile){
		return piles[targetPile-1];
	}
}
