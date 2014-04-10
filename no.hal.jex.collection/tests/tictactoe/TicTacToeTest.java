package tictactoe;

import java.io.IOException;

import tictactoe.tictactoe1.TicTacToeProgram;

public class TicTacToeTest extends AbstractExampleTest {

	private TicTacToeProgram program;
	
	@Override
	protected void initProgram() {
		program = new TicTacToeProgram();
		program.init();
	}

	@Override
	protected void runProgram() {
		program.run();
	}

	public void testExample1() throws IOException { testExample("example1.txt"); }
	public void testExample2() throws IOException { testExample("example2.txt"); }
}
