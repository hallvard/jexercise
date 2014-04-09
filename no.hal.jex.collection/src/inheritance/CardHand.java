package inheritance;

public class CardHand extends CardContainerImpl {

	public CardHand(int max) {
		super(max);
	}

	@Override
	public String toString() {
		return "[Hand " + cards.toString().substring(1);
	}

	@Override
	public void addCard(Card card) {
		super.addCard(card);
	}
	
	public Card play(int i) {
		return cards.remove(i);
	}
}
