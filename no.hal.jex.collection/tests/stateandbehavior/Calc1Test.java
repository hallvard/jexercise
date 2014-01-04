package stateandbehavior;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
		description="An instance of *Calc1* has a single _double value_ that is _updated_ by various math functions.",
		markupLanguage="textile"
	)
public class Calc1Test extends TestCase {

	private static double epsilon = 0.00000001d;
	
	private Calc1 calc1;
	
	@Override
	protected void setUp() throws Exception {
		calc1 = new Calc1();
	}
	
	@JExercise(
		tests="Calc1()",
		description="The internal double value should initially be zero."
	)
	public void testCalc1() {
		assertEquals(0.0, calc1.getValue(), 0.0);
	}
	
	public double testSetValue(double value) {
		calc1.setValue(value);
		assertEquals(value, calc1.getValue());
		return value;
	}

	@JExercise(
			tests="void setValue(double)",
			description="The *setValue(double)* method should set the internal double value to its argument."
			)
	public void testSetValue() {
		testSetValue(Math.random() * 100);
	}

	@JExercise(
			tests="void add(double)",
			description="The *add(double)* method should add its argument to the internal double value."
			)
	public void testAdd() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		calc1.add(value2);
		assertEquals(value1 + value2, calc1.getValue(), epsilon);
	}
	
	@JExercise(
			tests="void subtract(double)",
			description="The *subtract(double)* method should subtract the argument from the internal double value."
			)
	public void testSubtract() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		calc1.subtract(value2);
		assertEquals(value1 - value2, calc1.getValue(), epsilon);
	}
	
	@JExercise(
			tests="void multiply(double)",
			description="The *multiply(double)* method should multiply the internal double value with the argument."
			)
	public void testMultiply() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		calc1.multiply(value2);
		assertEquals(value1 * value2, calc1.getValue(), epsilon);
	}
	
	@JExercise(
			tests="void divide(double)",
			description="The *divide(double)* method should divide the internal double value with the argument."
			)
	public void testDivide() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100 + 1;
		calc1.divide(value2);
		assertEquals(value1 / value2, calc1.getValue(), epsilon);
	}
	
	@JExercise(
			tests="void percent(double)",
			description="The *precent(double)* method should compute the given percentage of the internal double value."
			)
	public void testPercent() {
		double value1 = testSetValue(Math.random() * 100), value2 = Math.random() * 100;
		calc1.percent(value2);
		assertEquals(value1 * value2 / 100, calc1.getValue(), epsilon);
	}
	
	@JExercise(
			tests="void negate()",
			description="The *negate()* method should negate the internal double value."
			)
	public void testNegate() {
		double value = testSetValue(Math.random() * 100);
		calc1.negate();
		assertEquals(- value, calc1.getValue(), 0.0);
	}
	
	@JExercise(
			tests="void pi()",
			description="The *pi()* method should set the internal double value to the π (pi) constant."
			)
	public void testPi() {
		testSetValue(Math.random() * 100);
		calc1.pi();
		assertEquals(Math.PI, calc1.getValue(), 0.0);
	}
	
	//
	
	
	public static void main(String[] args) {
		JexStandalone.main(Calc1Test.class);
	}
}
