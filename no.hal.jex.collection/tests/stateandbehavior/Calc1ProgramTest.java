package stateandbehavior;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
		description="*Calc1Program* implements a simple text-based calculator, that internally uses a *Calc1* instance for computations." +
"The supported syntax should be as follows:"
+ "A +, -, *, / or % followed by a double should invoke the method add, subtract, multiply, divide or percent, respectively, with the double as argument.\n"
+ "A single - should invoke negate and a single π should invoke pi()",
		markupLanguage="textile"
	)
public class Calc1ProgramTest extends TestCase {

	private static double epsilon = 0.00000001d;
	
	private Calc1Program calc1Program;
	
	@Override
	protected void setUp() throws Exception {
		calc1Program = new Calc1Program();
		calc1Program.init();
	}

	private double testSetValue(double value) {
		assertEquals(value, calc1Program.doLine(String.valueOf(value)), 0);
		return value;
	}
	
	@JExercise(
		tests="double doLine(String)",
		description="Tests a line with just a double value."
	)
	public void testSetValue() {
		testSetValue(Math.random() * 100);
	}

	private void assertEquals(double expected, String op, double value) {
		assertEquals(expected, calc1Program.doLine(op + value), epsilon);
	}
	private void assertEquals(double expected, String op) {
		assertEquals(expected, calc1Program.doLine(op), 0.0);
	}
	
	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with a + and a double value."
			)
	public void testAdd() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		assertEquals(value1 + value2, "+", value2);
	}
	
	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with a - and a double value."
			)
	public void testSubtract() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		assertEquals(value1 - value2, "-", value2);
	}
	
	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with a * and a double value."
			)
	public void testMultiply() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		assertEquals(value1 * value2, "*", value2);
	}
	
	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with a / and a double value."
			)
	public void testDivide() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100 + 1;
		assertEquals(value1 / value2, "/", value2);
	}
	
	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with a % and a double value."
			)
	public void testPercent() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100 + 1;
		assertEquals(value1 * value2 / 100, "%", value2);;
	}
	
	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with just a -."
			)
	public void testNegate() {
		double value1 = testSetValue(Math.random() * 100);
		assertEquals(- value1, "-");
	}

	@JExercise(
			tests="double doLine(String)",
			description="Tests a line with just a π (pi)."
			)
	public void testPi() {
		testSetValue(Math.random() * 100);
		assertEquals(Math.PI, "π");
	}

	//

	public static void main(String[] args) {
		JexStandalone.main(Calc1ProgramTest.class);
	}
}
