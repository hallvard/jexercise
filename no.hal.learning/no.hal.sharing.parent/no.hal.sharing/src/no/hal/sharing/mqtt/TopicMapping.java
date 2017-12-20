package no.hal.sharing.mqtt;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import no.hal.sharing.SharedBytes;
import no.hal.sharing.SharedResource;

public class TopicMapping {
	
	private String prefix;
	
	public TopicMapping(String prefix) {
		this.prefix = prefix;
	}

	protected String IN_TOPIC_SEGMENT = "in";
	protected String OUT_TOPIC_SEGMENT = "out";

	private static StringBuilder append(StringBuilder buffer, String... segments) {
		for (int i = 0; i < segments.length && segments[i] != null; i++) {
			if (buffer.length() > 0) {
				if (buffer.charAt(buffer.length() - 1) != '/' && segments[i].charAt(0) != '/') {
					buffer.append("/");
				}
			}
			buffer.append(segments[i]);
		}
		return buffer;
	}
	
	private static String concat(String... segments) {
		return append(new StringBuilder(), segments).toString();
	}

	protected String getTopicString(String... pathSegments) {
		return concat(prefix, pathSegments != null ? concat(pathSegments) : null);
	}

	public String getSubscriptionTopicString(String from, String to) {
		if (to != null) {
			return getTopicString(to, IN_TOPIC_SEGMENT, "#");
		} else if (from != null) {
			return getTopicString(from, OUT_TOPIC_SEGMENT, "#");			
		}
		return getTopicString("+", OUT_TOPIC_SEGMENT, "#");
	}

	public String getTopicString(SharedResource shared) {
		String key = shared.key;
		String segments = concat(shared.getPath().segments());
		if (shared.to != null) {
			return getTopicString(shared.to, IN_TOPIC_SEGMENT, key, segments);
		} else {
			return getTopicString(shared.from, OUT_TOPIC_SEGMENT, key, segments);
		}
	}
	
	public SharedBytes getSharedResource(String topic, byte[] payload) {
		IPath path = new Path(topic);
		if (prefix.equals(path.segment(0))) {
			path = path.removeFirstSegments(1);
		}
		String to = path.segment(0), direction = path.segment(1), from = path.segment(2);
		if (IN_TOPIC_SEGMENT.equals(direction)) {
			path = path.removeFirstSegments(3);
		} else if (OUT_TOPIC_SEGMENT.equals(direction)) {
			from = to;
			to = null;
			path = path.removeFirstSegments(2);
		} else {
			return null;
		}
		String key = path.segment(0);
		path = path.removeFirstSegments(1);
		return new SharedBytes(key, from, to, path, payload);
	}
}
