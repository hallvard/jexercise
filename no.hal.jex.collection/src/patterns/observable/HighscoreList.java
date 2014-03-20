package patterns.observable;

public class HighscoreList extends ObservableList {

	private int maxSize;
	
	public HighscoreList(int maxSize) {
		this.maxSize = maxSize;
	}

	public int addResult(Integer result) {
		int pos = 0;
		while (pos < size() && result >= (int) getElement(pos)) {
			pos++;
		}
		if (pos < maxSize) {
			while (size() >= maxSize) {
				removeElement(size() - 1);
			}
			super.addElement(pos, result);
		}
		return pos;
	}
}
