package oving5.card;

import no.hal.jex.runtime.JExercise;
import junit.framework.TestCase;

@JExercise(
		tests="",
		description="The CardDeck class contains an encapsulated array of Cards and a deal method will be added. "
)
public class CardDeckTest extends TestCase {
	
	private final static String[] suits = {"S", "H", "D", "C"};
	
	private void testCard(int pos, Card card) {
		assertEquals(suits[pos / 13], card.getSuit());
		assertEquals(pos % 13 + 1, card.getFace());
	}
	
	private void testCardDeck(CardDeck deck, int length) {
		assertEquals(length, deck.getCardCount());
		for (int i = 0 ; i < length ; i++) {
			testCard(i, deck.getCard(i));
		}
	}

	@JExercise(
			tests="CardDeck()",
			description="The CardDeck constructor should take no arguments, and initialize this CardDeck with the cards in the correct order (suits S, H, D, C, faces 1 to 13)."
	)
	public void testCardDeck() {
		testCardDeck(new CardDeck(), 52);
	}
	
	@JExercise(
			tests="int getCardCount(); Card getCard(int)",
			description="The getCardCount method should return the number of cards in this CardDeck." +
					"<br/>The getCard method should return the Card at the specified index among this CardDeck's cards." +
					" If the index is not between 0 and the card count, null should be returned." +
					"<p/>Note that card count may be lower than 52 because of the deal method."
	)
	public void testGetCard() {
		CardDeck deck = new CardDeck();
		testCardDeck(deck, 52);
		assertNull(deck.getCard(-1));
		assertNull(deck.getCard(53));
	}
	
	private void testDealSize(CardDeck deck, int pos, int size) {
		assertEquals(deck.getCardCount(), pos + 1);
		Card[] hand = deck.deal(size);
		if (size > pos + 1) {
			assertNull(hand);
			assertEquals(deck.getCardCount(), pos + 1);
			return;
		}
		assertEquals(deck.getCardCount(), pos + 1 - size);
		assertEquals(size, hand.length);
		for (int i = 0 ; i < hand.length ; i++) {
			testCard(pos - i, hand[i]);
		}
	}

	@JExercise(
			tests="Card[] deal(int)",
			description="Takes an int argument and returns an array with that many Cards removed from the top of this CardDeck." +
					" Just as a real deck, the cards are dealt one by one from the top (highest index) of this CardDeck, and each card should only be dealt once -" +
					" meaning you have to keep track of how many cards have been dealt. If there are not enough cards left in the this CardDeck, the method should return null." +
					"<p/>The order is important: The first card removed from (the top of) this CardDeck, should be first in the returned array," +
					" the second card removed should be second in the array, and so forth. I.e. if deal(4) is called just after the CardDeck is created," +
					" it should return an array containing the King of Clubs (since Ace has face value 1 and not 14), Queen of Clubs, Knight of Clubs and Ten of Clubs, in that order."
	)
	public void testDeal() {
		CardDeck deck = new CardDeck();
		// testing that the cards are in right order with different deal sizes
		testDealSize(deck, 51, 1);
		testCardDeck(deck, 51);

		deck = new CardDeck();
		testDealSize(deck, 51, 0);
		testCardDeck(deck, 52);
		
		deck = new CardDeck();
		testDealSize(deck, 51, 51);
		testCardDeck(deck, 1);
		
		deck = new CardDeck();
		testDealSize(deck, 51, 52);
		testCardDeck(deck, 0);
		
		deck = new CardDeck();
		testDealSize(deck, 51, 53);
		testCardDeck(deck, 52);
		
		// testing several deals from same deck
		deck = new CardDeck();
		testDealSize(deck, 51, 10);
		testDealSize(deck, 41, 40);
		testDealSize(deck, 1, 1);
		testDealSize(deck, 0, 1);
		testDealSize(deck, -1, 1);
	}
}
