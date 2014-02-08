package objectstructures;

import java.util.ArrayList;

public class CardHand {

	// array to hold Card objects, filled in the constructor
	private ArrayList<Card> cards;

	public CardHand() {
		cards = new ArrayList<Card>();
	}

	@Override
	public String toString() {
		return "[Hand " + cards.toString().substring(1);
	}

	public void addCard(Card card) {
		this.cards.add(card);
	}

	public int getCardCount() {
		return cards.size();
	}
	
	public Card getCard(int i) {
		if (i < 0 || i >= getCardCount()) {
			throw new IllegalArgumentException(String.format("%s is an illegal card index, when the size of the hand is %s", i, getCardCount()));
		}
		return cards.get(i);
	}
	
	public Card play(int i) {
		return cards.remove(i);
	}
}
