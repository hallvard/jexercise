package objectstructures;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;

@JExercise(
	description="A TicTacToe class must hold all logic necessary for playing the Tic-Tac-Toe game."
)
public class TicTacToeTestPart1 extends TestCase {

	TicTacToe ttt;

	protected void setUp() throws Exception {
		super.setUp();
		ttt = new TicTacToe();
	}
	
	@JExercise(
			tests="boolean setCell(char, int, int);char getCell(int, int);boolean isOccupied(int, int)",
			description="The setCell(char, int, int) method should set the board position corresponding to "
					+ "the input x and y coordinates to the parameterized char. The getCell(int, int) method "
					+ "should return the char at the input x and y coordinates of the board. The boolean isOccupied(int, int) method "
					+ "should check whether the board position input as x and y coordinates is occupied or not."
			)
	public void testSetGetCell() {
		assertFalse(ttt.isOccupied(0, 0));
		assertTrue(ttt.setCell('x', 0, 0));
		assertTrue(ttt.isOccupied(0, 0));
		assertFalse(ttt.setCell('x', 0, 0));
		assertEquals('x', ttt.getCell(0, 0));

		assertFalse(ttt.isOccupied(1, 0));
		assertTrue(ttt.setCell('o', 1, 0));
		assertTrue(ttt.isOccupied(1, 0));
		assertFalse(ttt.setCell('x', 1, 0));
		assertEquals('o', ttt.getCell(1, 0));
	}
	
	@JExercise(
			tests="char getCurrentPlayer()",
			description="The char getCurrentPlayer() returns the current player of the game."
			)
	public void testGetCurrentPlayer() {
		assertEquals('x', ttt.getCurrentPlayer());
	}
	
	public static void main(String[] args) {
		JexStandalone.main(TicTacToeTestPart1.class);
	}
}