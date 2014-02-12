package interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class Digits implements Incrementable {

	private final int base;
	private Collection<Digit> digits;

	public Digits(int base, int digitCount) {
		this.base = base;
		digits = new ArrayList<Digit>(digitCount);
		while (digitCount > 0) {
			digits.add(new Digit(base));
			digitCount--;
		}
	}

	public String toString() {
		String result = "";
		for (Digit digit : digits) {
			result = digit + result;
		}
		return result;
	}
	
	public int toInt() {
		int result = 0, mult = 1;
		for (Digit digit : digits) {
			result += digit.toInt() * mult;
			mult *= base;
		}
		return result;
	}

	public boolean increment() {
		for (Digit digit : digits) {
			if (! digit.increment()) {
				return false;
			}
		}
		return true;
	}
}
