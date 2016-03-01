package grensesnitt;

import interfaces.Digits;
import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
		description="Digits contains an ordered collection of Digit object that can be incremented. The digits all start as zero and wraps when reaching the maximally representable value.",
		markupLanguage="textile"
		)
public class DigitsTest extends TestCase {

	private Digits digit;
	private int digitCount;
	
	protected void setUp() throws Exception {
		digitCount = 2;
	}
	
	@JExercise(
			tests="Digits(int,int)",
			description="The value starts at zero.")
	public void testDigit() {
		digit = new Digits(10, digitCount);
		assertEquals(0, digit.toInt());
	}
	
	private void testIncrement(int base, boolean checkValue, boolean checkToString) {
		digit = new Digits(base, 2);
		int i = 0;
		String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (i < base) {
			if (checkValue) {
				assertEquals(i % base,  digit.toInt());
			}
			if (checkToString) {
				assertEquals(String.valueOf(digits.charAt(i % base)),  digit.toString().toUpperCase());
			}
			boolean overflow = digit.increment();
			i++;
			if (checkValue) {
				int combinedBase = (int) Math.pow(base, digitCount);
				assertEquals(i % combinedBase == 0, overflow);
				assertEquals(i % combinedBase, digit.toInt());
			}
			if (checkToString) {
				assertEquals(String.valueOf(digits.charAt(i % base)),  digit.toString().toUpperCase());
			}
		}
	}

	private void testIncrement(boolean checkValue, boolean checkToString) {
		for (int base = 2; base <= 16; base++) {
			testIncrement(base, checkValue, checkToString);
		}
	}

	@JExercise(
			tests="boolean increment()",
			description="The *boolean increment()* method increments the value. If the value reaches the base (the argument passed to the constructor), the value is _reset to zero_ and *true* is returned, otherwise *false* is returned."
	)
	public void testIncrement() {
		testIncrement(true, false);
	}
	
	@JExercise(
			tests="String toString()",
			description="The *String toString()* method return the value as a digit (String) in the provided base. First it uses _0 through 9_, then _A to Z_."
			)
	public void testToString() {
		testIncrement(false, true);
	}

	//

	public static void main(String[] args) {
		JexStandalone.main(DigitsTest.class);
	}
}
