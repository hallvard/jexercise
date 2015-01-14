package no.hal.confluence.ui.resources.util.xml;

public class TextMatcher implements Matcher<String> {

	private final static int EQUALS_MATCH = 0, EQUALS_IGNORE_CASE_MATCH = 1, PREFIX_MATCH = 2, SUFFIX_MATCH = 3, REGEX_MATCH = 4, CONTAINS_MATCH = 5; 

	private final String s;
	private final int matchType;
	
	public TextMatcher(String s, int matchType) {
		this.s = s;
		this.matchType = matchType;
	}

	public TextMatcher(String s) {
		this(s, EQUALS_IGNORE_CASE_MATCH);
	}
	
	@Override
	public boolean matches(String s) {
		switch (matchType) {
		case EQUALS_MATCH: 				return s.equals(this.s);
		case EQUALS_IGNORE_CASE_MATCH: 	return s.equalsIgnoreCase(this.s);
		case PREFIX_MATCH: 				return s.startsWith(this.s);
		case SUFFIX_MATCH: 				return s.endsWith(this.s);
		case REGEX_MATCH: 				return s.matches(this.s);
		case CONTAINS_MATCH: 			return s.contains(this.s);
		}
		return false;
	}
	
	//
	
	public static TextMatcher equals(String s) {
		return new TextMatcher(s, EQUALS_MATCH);
	}
	
	public static TextMatcher equalsIgnoreCase(String s) {
		return new TextMatcher(s, EQUALS_IGNORE_CASE_MATCH);
	}
	
	public static TextMatcher startsWith(String s) {
		return new TextMatcher(s, PREFIX_MATCH);
	}
	
	public static TextMatcher endsWith(String s) {
		return new TextMatcher(s, SUFFIX_MATCH);
	}
	
	public static TextMatcher regex(String s) {
		return new TextMatcher(s, REGEX_MATCH);
	}
	
	public static TextMatcher contains(String s) {
		return new TextMatcher(s, CONTAINS_MATCH);
	}
}
