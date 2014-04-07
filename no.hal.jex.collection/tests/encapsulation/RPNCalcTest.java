package encapsulation;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
	description="A RPNCalc must support stack functionality and performing operation."
)
public class RPNCalcTest extends TestCase {

	RPNCalc rpncalc;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		rpncalc = new RPNCalc();
	}

	@JExercise(
		tests="void push(Double);double pop(); double peek(int)",
		description="The push(Double) method puts the Double argument on the stack. The pop() method returns the element on the top of the stack. The peek(int) method returns Double at the position of the argument."
	)
	public void testPushPopPeek() {
		// Push
		rpncalc.push(1);
		assertEquals(1d, rpncalc.peek(0));
		rpncalc.push(2);
		assertEquals(2d, rpncalc.peek(0));
		rpncalc.push(3);
		assertEquals(3d, rpncalc.peek(0));
		
		// Pop
		assertEquals(3d, rpncalc.pop());
		assertEquals(2d, rpncalc.pop());
		rpncalc.push(2);
		assertEquals(2d, rpncalc.pop());
		assertEquals(1d, rpncalc.pop());

		// Peek
		rpncalc.push(0);
		rpncalc.push(1);
		rpncalc.push(2);
		assertEquals(2d, rpncalc.peek(0));
		assertEquals(1d, rpncalc.peek(1));
		assertEquals(0d, rpncalc.peek(2));
		assertEquals(Double.NaN, rpncalc.peek(3));
		assertEquals(Double.NaN, rpncalc.peek(-1));
	}
	
	@JExercise(
			tests="int getSize()",
			description="The getSize() method retuns the size of the stack."
	)
	public void testGetSize() {
		rpncalc.push(0);
		assertEquals(1, rpncalc.getSize());
		rpncalc.push(1);
		assertEquals(2, rpncalc.getSize());
		rpncalc.push(2);
		assertEquals(3, rpncalc.getSize());
		
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="The performOperation(char) method performs should be able to add the two top-most elements and leaves the result on the top of the stack."
	)
	public void testPerformOperationAddition() {
		rpncalc.push(3);
		rpncalc.push(4);
		rpncalc.performOperation('+');
		assertEquals(7d, rpncalc.peek(0));
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="The performOperation(char) method performs should be able to find the difference between the two top-most elements and leaves the result on the top of the stack."
	)
	public void testPerformOperationSubtraction() {
		rpncalc.push(7);
		rpncalc.push(2);
		rpncalc.performOperation('-');
		assertEquals(5d, rpncalc.peek(0));
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="The performOperation(char) method performs should be able to multiply the two top-most elements and leaves the result on the top of the stack."
	)
	public void testPerformOperationMultiplication() {
		rpncalc.push(5);
		rpncalc.push(2);
		rpncalc.performOperation('*');
		assertEquals(10d, rpncalc.peek(0));
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="The performOperation(char) method performs should be able to perform division of the two top-most elements and leaves the result on the top of the stack."
	)
	public void testPerformOperationDivision() {
		rpncalc.push(10);
		rpncalc.push(4);
		rpncalc.performOperation('/');
		assertEquals(2.5d, rpncalc.peek(0));
	}
	
	@JExercise(
			tests="void performOperation(char)",
			description="The performOperation(char) method performs should be able to swap the two top-most elements and leaves the result on the top of the stack."
	)
	public void testPerformOperationSwap() {	
		rpncalc.push(2.5);
		rpncalc.push(5);
		rpncalc.performOperation('~');
		assertEquals(2.5d, rpncalc.peek(0));
		assertEquals(5d, rpncalc.peek(1));
	}

	public static void main(String[] args) {
		JexStandalone.main(RPNCalcTest.class);
	}
}