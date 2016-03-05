package sudoku.sudoku1;

import java.util.Scanner;


public class SudokuProgram {
	public static void main(String[] args) {
		
		String level = ".....2..38.273.45....6..87.9.8..5367..6...1..4513..9.8.84..3....79.512.62..8.....";
		
		Scanner input = new Scanner(System.in);
		SudokuGame game = new SudokuGame(level);

		while(true){
			System.out.println();
			System.out.println(game);
			System.out.println("Enter values in the following format: '<number><character><value>");
			System.out.print(">>> ");
			String move = input.nextLine();

			int row = move.charAt(0) - '1';
			int col = move.charAt(1) - 'a';
			int val = move.charAt(2) - '0';
			
			boolean wasLegal = game.playerMove(col, row, val);
			
			if(!wasLegal)
				System.out.println("Illegal move.");
		}
	}
}