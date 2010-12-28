package oving5.card;

import jexutil.JExercise;
import junit.framework.TestCase;

@JExercise(
		tests="",
		description="The Card class encapsulates the properties suit and face." +
				" You have have to implement getter methods to retrieve their values." +
				" By not implementing setter methods you ensure these properties cannot be changed after a Card is created. "
)
public class CardTest extends TestCase {

	private final static String[] suits = {"S", "H", "D", "C"};
	
	@JExercise(
			tests="Card(String,int); String getSuit(); int getFace()",
			description="The Card constructor that takes two parameters: suit and face." +
					" The constructor should initialize the new Card with the given arguments." +
					" It should not accept other values than \"S\", \"H\", \"D\" or \"C\" for suit and integers between 1 and (including) 13 for face." +
					" For illegal input, suit should be set to null and face to -1, respectively." +
					"<p/>The getSuit() method returns the suit of this Card. " +
					"<p/>The getFace() method returns the face of this Card. "
	)
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
	
	@JExercise(
			tests="String toString()",
			description="The toString method returns the suit and face values as one String with no space in between." +
					" Example: The Ace of Spades should return \"S1\" as the value of the toString method."
	)
	public void testToString() {
		for (int i = 0; i < suits.length; i++) {
			for (int face = 1; face <= 13; face++) {
				Card card = new Card(suits[i], face);
				assertEquals(suits[i] + face, card.toString());
			}
		}
	}
}
