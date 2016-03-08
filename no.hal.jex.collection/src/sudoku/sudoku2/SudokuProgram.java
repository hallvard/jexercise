package sudoku.sudoku2;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class SudokuProgram implements ConsoleGame {
	
	public static void main(String[] args) {
		ConsoleGame program = new SudokuProgram();
		program.init();
		program.run();
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			program.doLine(input.nextLine());
		}
		input.close();
	}
	

	SudokuGame game;
	UndoSystem undoSystem;
	
	@Override
	public void init() {
		SudokuLoader loader;
		try {
			URL url = getClass().getResource("sudoku_level1.txt");
			loader = new SudokuFileLoader(url.getPath());
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File with level was not found.");
		}

		game = new SudokuGame(loader.getLevel());
		undoSystem = new UndoSystem(game);
	}

	@Override
	public void run() {
		printGame();
	}
	
	private void printGame(){
		System.out.println();
		System.out.println(game);

		System.out.print(">>> ");
	}

	@Override
	public Integer doLine(String move) {
		boolean undoRedo = false;
		
		if(move.equals("undo")){
			move = undoSystem.undo();
			undoRedo = true;
		}
		
		if(move.equals("redo")){
			move = undoSystem.redo();
			undoRedo = true;
		}
		
		int row = move.charAt(0) - '1';
		int col = move.charAt(1) - 'a';
		int val = move.charAt(2) - '0';
		
		boolean isLegal = game.isMoveLegal(col, row, val);
		if(isLegal){
			if(!undoRedo)
				undoSystem.doMove(move);
			game.playerMove(col, row, val);
		}
		
		if(!isLegal)
			System.out.println("Illegal move.");
		
		printGame();
		return null;
	}
}