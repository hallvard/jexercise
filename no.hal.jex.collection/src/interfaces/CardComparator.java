package interfaces;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

	private String suitOrder = "SHDC";
	private boolean aceIsBest;
	private char trumph;
	
	@Override
	public int compare(Card card1, Card card2) {
		int suit1 = suitOrder.indexOf(card1.getSuit());
		int suit2 = suitOrder.indexOf(card2.getSuit());
		if (suit1 == trumph) {
			suit1 = suitOrder.length();
		}
		if (suit2 == trumph) {
			suit2 = suitOrder.length();
		}
		int diff = suit1 - suit2;
		if (diff == 0) {
			int face1 = card1.getFace();
			int face2 = card2.getFace();
			if (aceIsBest) {
				if (face1 == 1) {
					face1 = 14;
				}
				if (face2 == 1) {
					face2 = 14;
				}
			}
			diff = face1 - face2;
		}
		return diff;
	}
}
