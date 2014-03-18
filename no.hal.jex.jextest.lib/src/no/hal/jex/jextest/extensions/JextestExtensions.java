package no.hal.jex.jextest.extensions;

public class JextestExtensions {

	private static double epsilon = 0.0000001d;

	public static boolean operator_approximatelyEquals(double n1, double n2) {
		return n1 - epsilon <= n2 && n1 + epsilon >= n2;
	}

	private static boolean approximatelyEquals_trim = true;
	private static boolean approximatelyEquals_ignoreCase = true;
	
	public static boolean operator_approximatelyEquals(String s1, String s2) {
		if (approximatelyEquals_trim) {
			s1 = s1.trim();
			s2 = s2.trim();
		}
		return approximatelyEquals_ignoreCase ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
	}
}
