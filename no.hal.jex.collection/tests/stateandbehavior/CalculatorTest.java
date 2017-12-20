package stateandbehavior;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;

@JExercise(
	description="A Calculator must contain two double fields for first and second operand, a char for operand and methods for setting these fields and calculating the result."
)
public class CalculatorTest extends TestCase {

	Calculator calculator;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		calculator = new Calculator();
	}

	@JExercise(
		tests="void setFirstOperand(double)",
		description="The setFirstOperand(double) method takes an operand as its only argument, and sets this to the firstOperand field."
	)
	public void testSetFirstOperand() {
		calculator.setFirstOperand(0);
		assertEquals(calculator.firstOperand, 0.0);
		calculator.setFirstOperand(-5.0);
		assertEquals(calculator.firstOperand, -5.0);
		calculator.setFirstOperand(5.0);
		assertEquals(calculator.firstOperand, 5.0);
	}
	
	@JExercise(
			tests="void setSecondOperand(double)",
			description="The setSecondOperand(double) method takes an operand as its only argument, and sets this to the secondOperand field."
			)
	public void testSetSecondOperand() {
		calculator.setSecondOperand(0);
		assertEquals(calculator.secondOperand, 0.0);
		calculator.setSecondOperand(-5.0);
		assertEquals(calculator.secondOperand, -5.0);
		calculator.setSecondOperand(5.0);
		assertEquals(calculator.secondOperand, 5.0);
	}
	
	@JExercise(
		tests="void setOperator(char)",
		description="The setOperator(char) method takes an operator as its only argument, and sets this to the operator field."
	)
	public void testSetOperator() {
		calculator.setOperator('+');
		assertEquals(calculator.operator, '+');

		calculator.setOperator('-');
		assertEquals(calculator.operator, '-');
		
		calculator.setOperator('*');
		assertEquals(calculator.operator, '*');
		
		calculator.setSecondOperand(5);
		calculator.setOperator('/');
		assertEquals(calculator.operator, '/');
		
		try {
			calculator.setOperator('X');			
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@JExercise(
			tests="double calculateResult()",
			description="The calculateResult() method computes the result based on the operands and the operator stored in the calculator."
	)
	public void testCalculateResult() {
		calculator.setFirstOperand(5.0);
		calculator.setSecondOperand(4.0);
		calculator.setOperator('+');
		assertEquals(calculator.calculateResult(), 5.0 + 4.0);

		calculator.setOperator('-');
		assertEquals(calculator.calculateResult(), 5.0 - 4.0);

		calculator.setOperator('*');
		assertEquals(calculator.calculateResult(), 5.0 * 4.0);

		calculator.setOperator('/');
		assertEquals(calculator.calculateResult(), 5.0 / 4.0);

		calculator.setOperator('%');
		assertEquals(calculator.calculateResult(), 5.0 % 4.0);

		try {
			calculator.setSecondOperand(0);
			calculator.setOperator('/');
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}

	public static void main(String[] args) {
		JexStandalone.main(CalculatorTest.class);
	}
}