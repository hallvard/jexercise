package interfaces;

import interfaces.Digits;
import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
		description="Digits contains an ordered collection of Digit object that can be incremented. The digits all start as zero and wraps when reaching the maximally representable value.",
		markupLanguage="textile"
		)
public class DigitsTest extends TestCase {

	private Digits digits;
	private int digitCount;
	
	protected void setUp() throws Exception {
		digitCount = 2;
	}
	
	@JExercise(
			tests="Digits(int,int)",
			description="The value starts at zero.")
	public void testDigit() {
		digits = new Digits(10, digitCount);
		assertEquals(0, digits.toInt());
	}
	
	private void testIncrement(int base, boolean checkValue) {
		digits = new Digits(base, 2);
		int i = 0;
		String possibleDigits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (i < base) {
			if (checkValue) {
				assertEquals(i % base,  digits.toInt());
			}
			boolean overflow = digits.increment();
			i++;
			if (checkValue) {
				int combinedBase = (int) Math.pow(base, digitCount);
				assertEquals(i % combinedBase == 0, overflow);
				assertEquals(i % combinedBase, digits.toInt());
			}
		}
	}

	private void testIncrement(boolean checkValue) {
		for (int base = 2; base <= 16; base++) {
			testIncrement(base, checkValue);
		}
	}

	@JExercise(
			tests="boolean increment()",
			description="The *boolean increment()* method increments the value. If the value reaches the base (the argument passed to the constructor), the value is _reset to zero_ and *true* is returned, otherwise *false* is returned."
	)
	public void testIncrement() {
		testIncrement(true);
	}
	
	@JExercise(
			tests="String toString()",
			description="The *String toString()* method return the value as a digit (String) in the provided base. First it uses _0 through 9_, then _A to Z_."
			)
	public void testToString() {
		digits = new Digits(16, 2);
		/*
		 * Checks that the Digits class handles numbers larger than 9.
		 */
		for(int i = 0; i < 12 ; i++){
			digits.increment();
		} 
		assertEquals("0C", digits.toString());
		/*
		 * Increments to maximum value
		 */
		for(int i = 0; i < 16 * 16 - 13 ; i++){
			digits.increment();
		}
		assertEquals("FF", digits.toString().toUpperCase());
		assertEquals(true, digits.increment());
		assertEquals("00", digits.toString().toUpperCase());
	}

	//

	public static void main(String[] args) {
		JexStandalone.main(DigitsTest.class);
	}
}
