package no.hal.learning.exercise.adm;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class PathViewerContentProvider<T> implements ITreeContentProvider {

	private final SortedMap<String, T> pathMap;

	public PathViewerContentProvider(SortedMap<String, T> pathMap) {
		this.pathMap = pathMap;
	}

	private String pathPrefix = null;
	
	public void setPathPrefix(String pathPrefix) {
		this.pathPrefix = pathPrefix;
	}
	
	protected Object[] getNextPrefixLevel(String prefix) {
		Object[] elements = getNextPrefixLevel(prefix, pathMap.keySet());
		return elements;
	}

	private Object[] getNextPrefixLevel(String prefix, Iterable<String> paths) {
		List<Object> elements = null;
		String currentElement = null;
		for (String path : paths) {
			if (prefix == null || path.startsWith(prefix)) {
				if (elements == null) {
					elements = new ArrayList<Object>();
				}
				int start = (prefix != null ? prefix.length() + 1 : 0), end = path.indexOf('/', start);
				String nextElement = (prefix != null && prefix.length() == path.length() ? "" : path.substring(start, end > start ? end : path.length()));
				if (! nextElement.equals(currentElement)) {
					String newElement = prefix != null ? (prefix + "/" + nextElement) : nextElement;
					elements.add(pathMap.containsKey(newElement) ? pathMap.get(newElement) : newElement);
					currentElement = nextElement;
				}
			} else if (elements != null) {
				break;
			}
		}
		return (elements != null ? elements.toArray() : new Object[0]);
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getNextPrefixLevel(pathPrefix);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		String s = String.valueOf(parentElement);
		return getNextPrefixLevel(s);
	}

	@Override
	public Object getParent(Object element) {
		String s = String.valueOf(element);
		int pos = s.lastIndexOf('/');
		return (pos > 0 ? s.substring(0, pos) : null);
	}

	@Override
	public boolean hasChildren(Object element) {
		try {
			return element instanceof Comparable<?> && (! pathMap.containsKey(element));
		} catch (Exception e) {
		}
		return false;
	}
}
