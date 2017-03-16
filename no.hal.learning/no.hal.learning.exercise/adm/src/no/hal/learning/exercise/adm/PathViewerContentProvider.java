package no.hal.learning.exercise.adm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class PathViewerContentProvider<T> implements ITreeContentProvider {

	private final Map<String, T> pathMap;

	public PathViewerContentProvider(Map<String, T> pathMap) {
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

	private static Object[] getNextPrefixLevel(String prefix, Iterable<String> paths) {
		List<String> elements = null;
		String currentElement = null;
		for (String path : paths) {
			if (prefix == null || path.startsWith(prefix)) {
				if (elements == null) {
					elements = new ArrayList<String>();
				}
				int start = (prefix != null ? prefix.length() + 1 : 0), end = path.indexOf('/', start);
				String nextElement = (prefix != null && prefix.length() == path.length() ? "" : path.substring(start, end > start ? end : path.length()));
				if (! nextElement.equals(currentElement)) {
					elements.add(prefix != null ? (prefix + "/" + nextElement) : nextElement);
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
//		String prefix = String.valueOf(element) + "/";
//		for (String path : pathMap.keySet()) {
//			if (path.startsWith(prefix)) {
//				return true;
//			}
//		}
		return (! pathMap.containsKey(element));
	}
}
