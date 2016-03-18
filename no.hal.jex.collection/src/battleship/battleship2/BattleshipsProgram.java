package battleship.battleship2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class BattleshipsProgram {

	private int playerNum;
	private BattleshipGame game;
	
	public void init() {
		game = new BattleshipGame();
		InputStream board1Stream =  new ByteArrayInputStream(SampleLevels.SAMPLE_LEVEL1.getBytes());
		try{
			game.load(board1Stream);
		} catch(IOException e){
			throw new RuntimeException("Error loading boards. Exiting.");
		}
		playerNum = 0;
	}
	
	private boolean isGameOver() {
		return game.isGameOver();
	}
	
	private void printState() {
		System.out.println("Player " + (playerNum + 1) + "'s turn, here's the board:");
		System.out.println(getPlayerBoard());
		System.out.print("Type the x y coordinates (separated by space): ");
	}

	private Battleship getPlayerBoard() {
		return game.getBoards()[playerNum];
	}
	
	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (! isGameOver()) {
			printState();
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			boolean hit = false;
			hit = getPlayerBoard().fire(x, y);
			System.out.print("That's a " + (hit ? "hit!" : "miss...") + " ");
			playerNum = (playerNum + 1) % 2;
		}
		scanner.close();
		System.out.println("GAME OVER");
		String winner = (getPlayerBoard() == game.getBoards()[0] ? "Player 2 " : "Player 1");
		System.out.println("Winner is: " + winner);
	}
	
	public static void main(String[] args) {		
		BattleshipsProgram program = new BattleshipsProgram();
		program.init();
		program.run();
	}	
}
