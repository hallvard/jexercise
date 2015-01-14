package no.hal.confluence.ui.resources.util;

import java.util.HashMap;
import java.util.Map;

public class HtmlEntitiesDecoder {

	private static Map<String, String> entities = new HashMap<String, String>();
	static {
		entities.put("amp", "&");
		entities.put("lt", "<");
		entities.put("gt", ">");
		entities.put("quot", "\"");
		entities.put("apos", "'");
	}
	
	
	public static String decodeEntities(String s, int start, int end) {
		return decodeEntities(s, start, end, true);
	}

	public static String decodeEntities(String s, int start, int end, boolean leaveUnknownEntities) {
		if (end < 0) {
			end = s.length() + end + 1;
		}
		StringBuilder buffer = new StringBuilder(end - start);
		while (start < end) {
			int ampPos = s.indexOf('&', start);
			if (ampPos < 0 || ampPos >= end) {
				buffer.append(s.substring(start, end));
				break;
			}
			buffer.append(s.substring(start, ampPos));
			int semiPos = s.indexOf(';', ampPos + 1);
			if (semiPos < 0 || semiPos >= end) {
				buffer.append(s.substring(start, end));
				break;
			}
			if (s.charAt(ampPos + 1) == '#') {
				int charCode = -1;
				if (s.charAt(ampPos + 2) == 'x') {
					charCode = Integer.valueOf(s.substring(ampPos + 3, semiPos), 16);
				} else {
					charCode = Integer.valueOf(s.substring(ampPos + 2, semiPos), 10);
				}
				if (charCode >= 0) {
					buffer.append((char) charCode);
				}
			} else {
				String entityName = s.substring(ampPos + 1, semiPos);
				String entity = entities.get(entityName);
				if (entity != null) {
					buffer.append(entity);
				} else if (leaveUnknownEntities) {
					buffer.append('&');
					buffer.append(entityName);
					buffer.append(';');
				}
			}
			start = semiPos + 1;
		}
		return buffer.toString();
	}

	public static String decodeEntities(String s) {
		return decodeEntities(s, 0, -1);
	}
	
	public static void main(String[] args) {
		System.out.println(decodeEntities("&amp;"));
		System.out.println(decodeEntities("&amp;&lt;"));
		System.out.println(decodeEntities("a&amp;&lt;"));
		System.out.println(decodeEntities("&amp;&lt;b"));
		System.out.println(decodeEntities("a&amp;b&lt;"));
		System.out.println(decodeEntities("a&amp;b&lt;c"));
		System.out.println(decodeEntities("a&#39;b&lt;c"));
		System.out.println(decodeEntities("a&#x27;b&lt;c"));
	}
}
