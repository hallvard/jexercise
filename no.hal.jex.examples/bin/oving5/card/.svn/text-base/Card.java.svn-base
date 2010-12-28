package oving5.card;


/*
 * @author Erik Wendel, undass TDT4100/4102
 * 
 * @startuml
 * Card: String suit
 * Card: int face
 * Card: Card(String suit, int face)
 * Card: String getSuit()
 * Card: int getFace()
 * @enduml
 */

public class Card {
	
	// the suit (farge), one of the values "S" (spades), "H" (hearts), "D" (diamonds) and "C" (clubs) 
	private String suit;
	// the value, 1 for the ace, 2 - 10, 11 (knight), 12 (queen) and 13 (king). -1 is invalid
	private int face = -1;
	
	private static boolean isValidSuitAndFace(String suit, int face) {
		return validateSuit(suit) && validateFace(face); 
	}
	
	private static boolean validateSuit(String suit) {
		for (int i = 0; i < CardDeck.suits.length; i++) {
			if (CardDeck.suits[i].equals(suit)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean validateFace(int face) {
		return face > 0 && face < 14;
	}

	public Card(String suit, int face) {
		if (isValidSuitAndFace(suit, face)) {
			this.suit = suit;
			this.face = face;
		}
	}
	
	/*
	 * Returns suit and face as a string
	 * E.g. Ace of spades is S1 and king of clubs is C13
	 */
	public String toString() {
		return suit + face;
	}

	public String getSuit() {
		return this.suit;
	}
	
	public int getFace() {
		return this.face;
	}
}
