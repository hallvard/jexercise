package oving5.card;

import junit.framework.TestCase;

public class CardTest extends TestCase {

	private final static String[] suits = {"S", "H", "D", "C"};
	
	public void testCard() {
		for (int i = 0; i < suits.length; i++) {
			for (int face = 1; face <= 13; face++) {
				Card card = new Card(suits[i], face);
				assertEquals(suits[i], card.getSuit());
				assertEquals(face, card.getFace());
			}
		}
		Card card = new Card("the meaning of life", 42);
		assertEquals(null, card.getSuit());
		assertEquals(-1, card.getFace());
	}
	
	public void testToString() {
		for (int i = 0; i < suits.length; i++) {
			for (int face = 1; face <= 13; face++) {
				Card card = new Card(suits[i], face);
				assertEquals(suits[i] + face, card.toString());
			}
		}
	}
}
