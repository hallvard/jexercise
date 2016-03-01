package no.hal.emf.ui.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class FilteringContentProvider extends DelegatingContentProvider {

	public FilteringContentProvider(ITreeContentProvider delegate) {
		super(delegate);
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return filter(super.getElements(inputElement));
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		return filter(super.getChildren(parentElement));
	}
	
	protected Object[] filter(Object[] elements) {
		List<Integer> filtered = null;
		for (int i = 0; i < elements.length; i++) {
			if (! accept(elements[i])) {
				if (filtered == null) {
					filtered = new ArrayList<Integer>();
				}
				filtered.add(i);
			}
		}
		if (filtered == null) {
			return elements;
		}
		Collection<Object> filteredElements = new ArrayList<Object>(elements.length - filtered.size());
		int filteredPos = 0;
		for (int i = 0; i < elements.length; i++) {
			if (filteredPos < filtered.size() && filtered.get(filteredPos) == i) {
				filteredPos++;
			} else {
				filteredElements.add(elements[i]);
			}
		}
		return filteredElements.toArray();
	}

	public boolean accept(Object element) {
		return false;
	}
}
