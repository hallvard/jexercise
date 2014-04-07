package encapsulation;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
	description="A Stack must support operations for pushing, peeking, poping, and returning the size of the stack. A RandomStringGenerator must support generation of random strings."
)
public class StackTest extends TestCase {

	Stack stack;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		stack = new Stack();
	}

	@JExercise(
		tests="void push(String)",
		description="The push(String) method puts the String argument on the stack."
	)
	public void testPush() {
		stack.push("1");
		assertEquals("1", stack.peek(0));
		stack.push("2");
		assertEquals("2", stack.peek(0));
		stack.push("3");
		assertEquals("3", stack.pop());
	}
	
	@JExercise(
			tests="String pop()",
			description="The pop() method returns the element on the top of the stack."
			)
	public void testPop() {
		stack.push("0");
		stack.push("1");
		stack.push("2");
		assertEquals("2", stack.pop());
		assertEquals("1", stack.pop());
		stack.push("3");
		assertEquals("3", stack.pop());
		assertEquals("0", stack.pop());
	}
	
	@JExercise(
		tests="String peek(int)",
		description="The peek(int) method returns String at the position of the argument."
	)
	public void testPeek() {
		stack.push("0");
		stack.push("1");
		stack.push("2");
		assertEquals("2", stack.peek(0));
		assertEquals("1", stack.peek(1));
		assertEquals("0", stack.peek(2));
		assertEquals(null , stack.peek(3));
		assertEquals(null , stack.peek(-1));
	}
	
	@JExercise(
			tests="int getSize()",
			description="The getSize() method retuns the size of the stack."
	)
	public void testGetSize() {
		stack.push("0");
		assertEquals(1, stack.getSize());
		stack.push("1");
		assertEquals(2, stack.getSize());
		stack.push("2");
		assertEquals(3, stack.getSize());
		
	}
	
	public static void main(String[] args) {
		JexStandalone.main(StackTest.class);
	}
}