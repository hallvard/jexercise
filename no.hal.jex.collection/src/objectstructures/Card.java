package objectstructures;

public class Card {
	
	// the suit (farge), one of the values 'S' (spades), 'H' (hearts), 'D' (diamonds) and 'C' (clubs) 
	private char suit;
	// the value, 1 for the ace, 2 - 10, 11 (knight), 12 (queen) and 13 (king). -1 is invalid
	private int face = -1;

	// the set of suits in decreasing order
	public final static String SUITS = "SHDC";
	
	public Card(char suit, int face) {
		if (SUITS.indexOf(suit) < 0) {
			throw new IllegalArgumentException("Illegal suit: " + suit);
		}
		if (face < 1 || face > 13) {
			throw new IllegalArgumentException("Illegal face: " + face);
		}
		this.suit = suit;
		this.face = face;
	}
	
	/*
	 * Returns suit and face as a string
	 * E.g. Ace of spades is S1 and king of clubs is C13
	 */
	public String toString() {
		return String.valueOf(suit) + face;
	}

	public char getSuit() {
		return this.suit;
	}
	
	public int getFace() {
		return this.face;
	}
}
