package rpn;

import no.hal.jex.runtime.JExercise;
import junit.framework.TestCase;

@JExercise(
		description="A stack-based calculator using Reverse Polish Notation (RPN)",
		markupLanguage="textile"
		)
public class RPNTest extends TestCase {

	private RPN rpn;
	
	private static double epsilon = 0.000001d;
	
	@Override
	protected void setUp() throws Exception {
		rpn = new RPN();
	}
	
	private int testStack(double...topValues) {
		String s = rpn.toString();
		if ("([{".indexOf(s.charAt(0)) >= 0) {
			s = s.substring(1);
		}
		int lastPos = s.length() - 1;
		if (")]}".indexOf(s.charAt(lastPos)) >= 0) {
			s = s.substring(0, lastPos);
		}
		String[] values = s.split("[,; ]+");
		assertTrue(values.length >= topValues.length);
		for (int i = 0; i < topValues.length; i++) {
			assertEquals(Double.valueOf(values[values.length - topValues.length + i]), topValues[i], epsilon);
		}
		return values.length;
	}

	@JExercise(
			tests="void push(double)",
			description="Push should add the argument to the top of the stack."
			)
	public void testPush() {
		double random1 = Math.random(), random2 = Math.random();
		rpn.push(random1);
		rpn.push(random2);
		testStack(random1, random2);
	}
	
	private void testOperation(char op, double... topValues) {
		for (int i = 0; i < topValues.length - 1; i++) {
			rpn.push(topValues[i]);
		}
		int n1 = testStack();
		rpn.performOperation(op);
		int n2 = testStack(topValues[topValues.length - 1]);
		assertEquals(topValues.length - 2, n1 - n2);
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="Tests performOperation with + as operand. It should pop two values and push the _sum_."
			)
	public void testAdd() {
		double random1 = Math.random(), random2 = Math.random();
		testOperation('+', random1, random2, random1 + random2);
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="Tests performOperation with - as operand. It should pop two values and push the difference."
			)
	public void testSub() {
		double random1 = Math.random(), random2 = Math.random();
		testOperation('-', random1, random2, random1 - random2);
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="Tests performOperation with * as operand. It should pop two values and push the product."
			)
	public void testMult() {
		double random1 = Math.random(), random2 = Math.random();
		testOperation('*', random1, random2, random1 * random2);
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="Tests performOperation with / as operand. It should pop two values and push the ratio."
			)
	public void testDiv() {
		double random1 = Math.random(), random2 = Math.random();
		testOperation('/', random1, random2, random1 / random2);
	}
}
