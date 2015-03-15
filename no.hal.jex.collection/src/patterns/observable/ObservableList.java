package patterns.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class ObservableList {

	private List<Object> list = new ArrayList<Object>();

	public int size() {
		return list.size();
	}

	protected Object getElement(int i) {
		return list.get(i);
	}
	
	private void checkIndex(int pos, int d) {
		if (pos < 0 || pos + d > list.size()) {
			throw new IndexOutOfBoundsException(pos + " is out of bounds");
		}
	}
	
	public abstract boolean acceptsElement(Object element);
	
	protected void addElement(int pos, Object element) {
		if (! acceptsElement(element)) {
			throw new IllegalArgumentException(element + " is not acceptable");
		}
		checkIndex(pos, 0);
		list.add(pos, element);
		fireListChanged(pos);
	}
	protected void removeElement(int pos) {
		checkIndex(pos, 1);
		list.remove(pos);
		fireListChanged(pos);
	}

	protected void addElement(Object element) {
		addElement(list.size(), element);
	}
	
	//
	
	private Collection<ObservableListListener> listListeners = new ArrayList<ObservableListListener>();

	public void addObservableListListener(ObservableListListener listListener) {
		if (! listListeners.contains(listListener)) {
			listListeners.add(listListener);
		}
	}

	public void removeObservableListListener(ObservableListListener listListener) {
		listListeners.remove(listListener);
	}
	
	protected void fireListChanged(int pos) {
		for (ObservableListListener listListener : listListeners) {
			listListener.listChanged(this, pos);
		}
	}
}
