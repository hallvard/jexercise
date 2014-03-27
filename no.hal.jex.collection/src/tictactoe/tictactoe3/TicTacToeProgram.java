package tictactoe.tictactoe3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import program.GameOutput;
import program.GridGame;
import program.GridGameGUI;
import program.GridProvider;

public class TicTacToeProgram implements GridGame {
	
	private TicTacToe ticTacToe;
	
	@Override
	public void init(String level) {
		String[] params = level.split(" ");
		try {
			ticTacToe = new TicTacToe(Integer.valueOf(params[0]), Integer.valueOf(params[1]), true);
		} catch (IndexOutOfBoundsException e) {
		} catch (NumberFormatException e) {
		}
	}

	private GameOutput output;
	
	private String instructions = "Enter x and y coordinate of next placement (separated by whitespace) corresponding to board positions:\n0 0|1 0|2 0\n-----------\n0 1|1 1|2 1\n-----------\n0 2|1 2|2 2\n###########\n";

	@Override
	public void run(GameOutput output) {
		this.output = output;
		output.info(instructions + "\n" /* + ticTacToe.toString(true) + "\n" */ + ticTacToe.getCurrentPlayer() + "'s turn");
	}

	/*
	 * PART 3
	 */

	private LevelFormat levelFormat = new StandardLevelFormat();
	
	@Override
	public Integer doCommand(String line) {
		if (line.startsWith("<")) {
			try {
				ticTacToe = levelFormat.readLevel(new FileInputStream(line.substring(1).trim()));
			} catch (Exception e) {
				output.error("Exception when reading level: " + e);
			}
		} else if (line.startsWith(">")) {
			try {
				levelFormat.writeLevel(ticTacToe, new FileOutputStream(line.substring(1).trim()));
			} catch (Exception e) {
				output.error("Exception when writing level: " + e);
			}
		} else if (line.equals("x") || line.equals("q")) {
			return -1;
		}
		if (line.equals("u")) {
			ticTacToe.undo();
		} else if (line.equals("r")) {
			ticTacToe.redo();
		} else {
			int pos = line.indexOf(' ');
			if (pos < 0) {
				output.error("Illegal input, syntax is x y");
				return null;
			}
			try {
				int x = Integer.valueOf(line.substring(0, pos).trim());
				int y = Integer.valueOf(line.substring(pos + 1).trim());
				ticTacToe.play(x, y);
			} catch (NumberFormatException e) {
				return null;
			}
		}
		String message = ""; // ticTacToe.toString(true) + "\n";
		if (! ticTacToe.isFinished()) {
			output.info(message + ticTacToe.getCurrentPlayer() + "'s turn");
			return null;
		}
		if (! ticTacToe.hasWinner()) {
			// The game ended in a draw
			output.info(message + "The game ended in a draw.");
		} else if (ticTacToe.isWinner('x')) {
			output.info(message + "Player x has won the game.");
		} else if (ticTacToe.isWinner('o')) {
			output.info(message + "Player o has won the game.");
		}
		return 1;
	}
	
	// from GridGame

	@Override
	public GridProvider getGridProvider() {
		return ticTacToe;
	}

	@Override
	public String getTextFor(Object o) {
		return o.toString();
	}

	@Override
	public String getImageFor(Object o) {
		return null;
	}
	
	@Override
	public Integer gridElementInput(int x, int y) {
		return doCommand(x + " " + y);
	}
	
	@Override
	public Integer directionInput(int dx, int dy) {
		return null;
	}
	
	//

	public static void main(String[] args) throws Exception {
		GridGameGUI.main(new String[]{TicTacToeProgram.class.getName()});
	}
}
