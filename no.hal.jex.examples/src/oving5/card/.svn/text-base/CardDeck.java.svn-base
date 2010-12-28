package oving5.card;


/*
 * @author Erik Wendel, undass TDT4100/4102
 * 
 * @startuml
 * CardDeck: Card[] cards
 * CardDeck: int topCard
 * CardDeck: CardDeck()
 * CardDeck: int getCardCount()
 * CardDeck: Card getCard(int cardNum)
 * CardDeck: Card[] deal(int handSize)
 * @enduml
 */

public class CardDeck {

	// array to hold Card objects, filled in the constructor
	private Card[] cards;
	
	// keeping track of remaining cards
	private int topCard;

	// the set of suits in increasing order
	final static String[] suits = {"S", "H", "D", "C"};

	public CardDeck() {
		cards = new Card[52];
		topCard = -1;
		for (int i = 0; i < suits.length; i++) {
			for (int face = 1; face <= 13; face++) {
				Card card = new Card(suits[i], face);
				topCard++;
				cards[topCard] = card;
			}
		}
	}

	/*
	 *  Deals as many cards as specified by input variable
	 *  
	 */
	public Card[] deal(int handSize) {
		if (topCard + 1 < handSize) {
			return null;
		}
		Card[] handCards = new Card[handSize];
		for (int i = 0 ; i < handSize ; i++) {
			handCards[i] = cards[topCard];
			topCard--;
		}
		return handCards;
	}
	
	public int getCardCount() {
		return topCard + 1;
	}
	
	public Card getCard(int i) {
		return (i >= 0 && i < getCardCount() ? cards[i] : null);
	}
}
