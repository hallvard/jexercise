package inheritance;

public interface CardContainer extends Iterable<Card> {
	/*
	 * returns the number of cards within this CardContainer
	 */
	public int getCardCount();
	
	/*
	 * returns the card at the provided index, starting at 0
	 * The method should throw an IllegalArgumentException (or a subclass) it the index is illegal 
	 */
	public Card getCard(int i) throws IllegalArgumentException;
}