package objectstructures;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import no.hal.jex.standalone.JexStandalone;

@JExercise(
	description="A TicTacToe class must hold all logic necessary for playing Tic-Tac-Toe game."
)
public class TicTacToeTestPart2 extends TestCase {

	private TicTacToe ttt;

	protected void setUp() throws Exception {
		super.setUp();
		ttt = new TicTacToe();
	}
	
	@JExercise(
		tests="void play(int, int)",
		description="The play(int x, int y) method sets the board position x, y to the char of the currentPlayer. If a new placement has been made, it updates the currentPlayer."
	)
	public void testPlay() {
		ttt.play(0, 0);
		assertEquals('o', ttt.getCurrentPlayer());
		assertEquals('x', ttt.getCell(0,0));
		ttt.play(0, 0);
		assertEquals('o', ttt.getCurrentPlayer());
		ttt.play(1, 1);
		assertEquals('o', ttt.getCell(1,1));
		assertEquals('x', ttt.getCurrentPlayer());
	}

	@JExercise(
			tests="boolean isWinner(char)",
			description="The isWinner(char) method returns true if player char has won the game, otherwise it returns false."
			)
	public void testIsWinnerRow() {
		assertFalse(ttt.isWinner('x'));
		// Three in a row
		for (int row = 0; row <= 2; row++) {
			ttt.play(0, row);
			ttt.play(0, row < 2 ? row + 1 : row -1 );
			assertFalse(ttt.isWinner('x'));
			ttt.play(1, row);
			ttt.play(1, row < 2 ? row + 1 : row -1 );
			assertFalse(ttt.isWinner('x'));
			ttt.play(2, row);
			assertTrue(ttt.isWinner('x'));
			ttt = new TicTacToe();
		}
	}

	@JExercise(
			tests="boolean isWinner(char)",
			description="The isWinner(char) method returns true if player char has won the game, otherwise it returns false."
			)
	public void testIsWinnerCol() {
		assertFalse(ttt.isWinner('x'));
		// Three in a row
		for (int col = 0; col <= 2; col++) {
			ttt.play(col, 0);
			ttt.play(col < 2 ? col + 1 : col -1, 0);
			assertFalse(ttt.isWinner('x'));
			ttt.play(col, 1);
			ttt.play(col < 2 ? col + 1 : col -1, 1);
			assertFalse(ttt.isWinner('x'));
			ttt.play(col, 2);
			assertTrue(ttt.isWinner('x'));
			ttt = new TicTacToe();
		}
	}
	
	@JExercise(
			tests="boolean isWinner(char)",
			description="The isWinner(char) method returns true if player char has won the game, otherwise it returns false."
			)
	public void testIsWinnerAcross() {
		// Three across (NW - SE)
		ttt.play(1, 0);
		ttt.play(0, 0);
		assertFalse(ttt.isWinner('o'));
		ttt.play(0, 1);
		ttt.play(1, 1);
		assertFalse(ttt.isWinner('o'));
		ttt.play(2, 0);
		ttt.play(2, 2);
		assertTrue(ttt.isWinner('o'));
		ttt = new TicTacToe();

		// Three across (NE - SW)
		ttt.play(1, 0);
		ttt.play(2, 0);
		assertFalse(ttt.isWinner('o'));
		ttt.play(0, 1);
		ttt.play(1, 1);
		assertFalse(ttt.isWinner('o'));
		ttt.play(2, 1);
		ttt.play(0, 2);
		assertTrue(ttt.isWinner('o'));
		ttt = new TicTacToe();
	}
	
	@JExercise(
			tests="boolean hasWinner()",
			description="The hasWinner() method returns true if a player has won the game, otherwise it returns false."
			)
	public void testHasWinner() {
		assertFalse(ttt.hasWinner());
		winningBroard('x');
		assertTrue(ttt.hasWinner());
		ttt = new TicTacToe();
		winningBroard('o');
		assertTrue(ttt.hasWinner());
	}
	
	@JExercise(
			tests="boolean isFinished()",
			description="The isFinished() method returns true if a player has wont the game or if the board has been filled with pieces. Otherwise it returns false."
			)
	public void testIsFinished() {
		// Winner
		assertFalse(ttt.isFinished());	
		winningBroard('o');
		assertTrue(ttt.isFinished());
		ttt = new TicTacToe();
		winningBroard('x');		
		assertTrue(ttt.isFinished());	
		
		// Full board, no winner
		ttt = new TicTacToe();
		assertFalse(ttt.isFinished());
		fullBoardNoWinner();
		assertTrue(ttt.isFinished());
	}
	
	private void winningBroard(char winner) {
		if (winner == 'o') {
			ttt.play(0,0);
		}
		ttt.play(1, 0);
		ttt.play(2,0);
		ttt.play(1, 1);
		ttt.play(0,2);
		ttt.play(1, 2);
	}
	
	private void fullBoardNoWinner() {
		ttt.play(0,0);
		ttt.play(1,1);

		ttt.play(1,0);
		ttt.play(2,0);

		ttt.play(2,1);
		ttt.play(0,1);

		ttt.play(0,2);
		ttt.play(1,2);

		ttt.play(2,2);
	}
	
	public static void main(String[] args) {
		JexStandalone.main(TicTacToeTestPart2.class);
	}
}