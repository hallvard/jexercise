package battleship.battleship1;

import java.util.Scanner;

public class BattleshipsProgram {

	private int playerNum;
	private Battleships board1, board2;
	
	public void init() {
		board1 = new Battleships(SampleLevels.SAMPLE_LEVEL1);
		board2 = new Battleships(SampleLevels.SAMPLE_LEVEL2);
		playerNum = 0;
	}
	
	private boolean gameOver() {
		return board1.gameOver() || board2.gameOver();
	}
	
	private void printState() {
		System.out.println("Player " + (playerNum + 1) + "'s turn, here's the board:");
		System.out.println(getPlayerBoard());
		System.out.print("Type the x y coordinates (separated by space): ");
	}

	private Battleships getPlayerBoard() {
		return playerNum % 2 == 0 ? board1 : board2;
	}
	
	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (! gameOver()) {
			printState();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			boolean hit = false;
			hit = getPlayerBoard().shoot(x, y);
			System.out.print("That's a " + (hit ? "hit!" : "miss...") + " ");
			System.out.println(getPlayerBoard().countCells(false, true) + " hits so far.");
			playerNum = (playerNum + 1) % 2;
		}
		scanner.close();
		System.out.println("GAME OVER");
		String winner = (getPlayerBoard() == board1 ? "Player 2 " : "Player 1");
		System.out.println("Winner is: " + winner);
	}
	
	public static void main(String[] args) {		
		BattleshipsProgram game = new BattleshipsProgram();
		game.init();
		game.run();
	}	
}
