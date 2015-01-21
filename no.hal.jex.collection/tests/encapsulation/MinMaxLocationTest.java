package encapsulation;

import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;
import junit.framework.TestCase;

@JExercise(
	description="The MinMaxLocation class must contain two integer fields named x and y, that represent the x, y coordinates of the current location."
			+ "The x and y coordinates increase to the right and down, respectively. The values of these coordinates is constrained by the minX, maxX, minY"
			+ "and maxY values provided to the constructor."
)
public class MinMaxLocationTest extends TestCase {
	
	MinMaxLocation location;
	int minX = -20;
	int maxX = 20;
	int minY = -20;
	int maxY = 20;	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		location = new MinMaxLocation(minX, maxX, minY, maxY);
	}
	
	private void testLocation(int x, int y) {
		assertEquals("X coordinate passed its bound.", x, location.getX());
		assertEquals("Y coordinate passed its bound.", y, location.getY());
	}
	
	@JExercise(
		tests="void setX(int);int getX()",
		description="The setX(int) method takes and int value as its arguments and sets this to the x field. The getX() method returns this field."
	)
	public void testGetSetX() {
		location.setX(0);
		assertEquals(0, location.getX());
		location.setX(10);
		assertEquals(10, location.getX());
		location.setX(-1);
		assertEquals(-1, location.getX());
		testInvalidX(minX-1, location.getX());
		testInvalidX(maxX+1, location.getX());
	}
	
	private void testInvalidX(int invalidX, int existingX) {
		try {
			location.setX(invalidX);
			fail(invalidX + " is outside the coordinate bounds and should result in an exception.");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, existingX, location.getX());			
		}
	}
	
	@JExercise(
			tests="void setY(int);int getY()",
			description="The setY(int) method takes and int value as its arguments and sets this to the x field given that it is between minY and maxY. The getY() method returns this field."
		)
		public void testGetSetY() {
			location.setY(0);
			assertEquals(0, location.getY());
			location.setY(10);
			assertEquals(10, location.getY());
			location.setY(-1);
			assertEquals(-1, location.getY());
			testInvalidY(minY-1, location.getY());
			testInvalidY(maxY+1, location.getY());
		}
	
	private void testInvalidY(int invalidY, int existingY) {
		try {
			location.setY(invalidY);
			fail(invalidY + " is outside the coordinate bounds and should result in an exception.");
		} catch (Exception e) {
			testExceptionAndValue(e, IllegalArgumentException.class, existingY, location.getY());			
		}
	}
	
	private void testExceptionAndValue(Exception e, Class<? extends Exception> c, Object expected, Object actual) {
		assertTrue(e + " should be assignable to " + c, c.isAssignableFrom(e.getClass()));
		assertEquals(expected, actual);
	}
	
	@JExercise(
		tests="void left()",
		description="The left() method must change the x,y coordinates so it refers to the location to the left of the current one, unless <b>minX</b> has been reached."
	)
	public void testLeft() {
		testLocation(0, 0);
		location.left();
		testLocation(-1, 0);
		for(int i = 0; i < -minX; i++)
			location.left();
		testLocation(minX, 0);
	}
	
	@JExercise(
		tests="void up()",
		description="The up() method must change the x,y coordinates so it refers to the location above the current one, unless <b>minY</b> has been reached."
	)
	public void testUp() {
		testLocation(0, 0);
		location.up();
		testLocation(0, -1);
		for(int i = 0; i < -minY; i++)
			location.up();
		testLocation(0, minY);
	}
	
	@JExercise(
		tests="void right()",
		description="The right() method must change the x,y coordinates so it refers to the location to the right of the current one, unless <b>maxX</b> has been reached."
	)
	public void testRight() {
		testLocation(0, 0);
		location.right();
		testLocation(1, 0);
		for(int i = 0; i < maxX; i++)
			location.right();
		testLocation(maxX, 0);
	}
	
	@JExercise(
		tests="void down()",
		description="The down() method must change the x,y coordinates so it refers to the location below the current one, unless <b>maxY</b> has been reached."
	)
	public void testDown() {
		testLocation(0, 0);
		location.down();
		testLocation(0, 1);
		for(int i = 0; i < maxY; i++)
			location.down();
		testLocation(0, maxY);
	}
	
	//
	
	public static void main(String[] args) {
		JexStandalone.main(LocationTest.class);
	}
}