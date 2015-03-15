package patterns.observable;

public class ObservableHighscoreList extends ObservableList {

	private int maxSize;
	
	public ObservableHighscoreList(int maxSize) {
		this.maxSize = maxSize;
	}

	public boolean acceptsElement(Object element) {
		return element instanceof Integer;
	}

	@Override
	public void addElement(int pos, Object element) {
		if (pos < maxSize) {
			while (size() >= maxSize) {
				removeElement(size() - 1);
			}
			super.addElement(pos, element);
		}
	}

	public void addResult(Integer result) {
		int pos = 0;
		while (pos < size() && result >= (int) getElement(pos)) {
			pos++;
		}
		addElement(pos, result);
	}
}
