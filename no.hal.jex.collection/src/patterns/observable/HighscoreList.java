package patterns.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HighscoreList {

	private int maxSize;
	private List<Integer> list = new ArrayList<Integer>();
	
	public int size() {
		return list.size();
	}
	
	public HighscoreList(int maxSize) {
		this.maxSize = maxSize;
	}

	public void addElement(int pos, int element) {
		if (pos < maxSize) {
			while (size() >= maxSize) {
				list.remove((size() - 1));
			}
			list.add(pos, element);
			fireListChanged(pos);
		}
	}
	
	protected int getElement(int i) {
		return list.get(i);
	}

	public void addResult(Integer result) {
		int pos = 0;
		while (pos < size() && result >= (int) list.get(pos)) {
			pos++;
		}
		addElement(pos, result);
	}
	
	private Collection<HighscoreListListener> listListeners = new ArrayList<HighscoreListListener>();

	public void addHighscoreListListener(HighscoreListListener listListener) {
		if (! listListeners.contains(listListener)) {
			listListeners.add(listListener);
		}
	}

	public void removeHighscoreListListener(HighscoreListListener listListener) {
		listListeners.remove(listListener);
	}
	
	protected void fireListChanged(int pos) {
		for (HighscoreListListener listListener : listListeners) {
			listListener.listChanged(this, pos);
		}
	}
	
}
