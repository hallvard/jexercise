package inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class CardContainerImpl implements CardContainer, Iterable<Card> {

	private int maxCardCount;
	protected ArrayList<Card> cards;
	
	public CardContainerImpl(int max) {
		cards = new ArrayList<Card>();
		maxCardCount = max;
	}
	
	public int getMaxCardCount() {
		return maxCardCount;
	}
	
	public int getCardCount() {
		return cards.size();
	}
	
	public Card getCard(int i) {
		if (i < 0 || i >= getCardCount()) {
			throw new IllegalArgumentException(String.format("%s is an illegal card index, when the size of the deck is %s", i, getCardCount()));
		}
		return cards.get(i);
	}

	public Iterator<Card> iterator() {
		return cards.iterator();
	}
	
	protected void addCard(Card card) {
		if (getCardCount() >= getMaxCardCount()) {
			throw new IllegalStateException("Too many cards");
		}
		cards.add(card);			
	}
}
