package tictactoe.tictactoe1;

import java.util.Scanner;

public class TicTacToeProgram {
	
	private TicTacToe ticTacToe;
	
	public void init() {
		ticTacToe = new TicTacToe();
	}
	
	/*
	 * PART 3
	 */
	
	private String instructions = "Enter x and y coordinate of next placement (separated by whitespace) corresponding to board positions:\n0 0|1 0|2 0\n-----------\n0 1|1 1|2 1\n-----------\n0 2|1 2|2 2\n###########\n";

	public void run() {
		System.out.println(instructions);
		Scanner scanner = new Scanner(System.in);
		while (! ticTacToe.isFinished()) {
			System.out.println(ticTacToe);
			System.out.println("Player " + ticTacToe.getCurrentPlayer() + ", enter position of desired move:");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			ticTacToe.play(x, y);
		}
		System.out.println(ticTacToe);
		if (! ticTacToe.hasWinner()) {
			// The game ended in a draw
			System.out.println("The game ended in a draw.");
		} else if (ticTacToe.isWinner('x')) {
			System.out.println("Player x has won the game.");
		} else if (ticTacToe.isWinner('o')) {
			System.out.println("Player o has won the game.");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		TicTacToeProgram program = new TicTacToeProgram();
		program.init();
		program.run();
	}
}