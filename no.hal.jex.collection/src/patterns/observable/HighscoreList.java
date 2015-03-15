package patterns.observable;

import java.util.ArrayList;
import java.util.List;

import patterns.observable.ListListener;

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
	
	private List<ListListener> listListeners = new ArrayList<ListListener>();

	public void addListListener(ListListener listListener) {
		if (! listListeners.contains(listListener)) {
			listListeners.add(listListener);
		}
	}

	public void removeListListener(ListListener listListener) {
		listListeners.remove(listListener);
	}
	
	protected void fireListChanged(int pos) {
		for (ListListener listListener : listListeners) {
			listListener.listChanged(this, pos);
		}
	}
	
}
