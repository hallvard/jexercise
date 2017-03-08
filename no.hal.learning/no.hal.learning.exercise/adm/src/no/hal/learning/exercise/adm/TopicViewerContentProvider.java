package no.hal.learning.exercise.adm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class TopicViewerContentProvider<T> implements ITreeContentProvider {

	private final Map<String, T> topicMap;

	
	public TopicViewerContentProvider(Map<String, T> topicMap) {
		this.topicMap = topicMap;
	}

	private String topicPrefix = null;
	
	public void setTopicPrefix(String topicPrefix) {
		this.topicPrefix = topicPrefix;
	}
	
	protected Object[] getNextPrefixLevel(String prefix) {
		return getNextPrefixLevel(prefix, topicMap.keySet());
	}

	private static Object[] getNextPrefixLevel(String prefix, Iterable<String> topics) {
		List<String> elements = null;
		String currentElement = null;
		for (String topic : topics) {
			if (prefix == null || topic.startsWith(prefix)) {
				if (elements == null) {
					elements = new ArrayList<String>();
				}
				int start = (prefix != null ? prefix.length() + 1 : 0), end = topic.indexOf('/', start);
				String nextElement = (prefix != null && prefix.length() == topic.length() ? "" : topic.substring(start, end > start ? end : topic.length()));
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
		return getNextPrefixLevel(topicPrefix);
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
		return (! topicMap.containsKey(element));
	}
}
