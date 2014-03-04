package tictactoe.tictactoe2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import program.TextualOutput;
import program.TextualProgram;
import program.TextualProgramDriver;

public class TicTacToeProgram implements TextualProgram {
	
	private TicTacToe ticTacToe;
	
	@Override
	public void init(String level) {
		ticTacToe = new TicTacToe(level, true);
	}

	private TextualOutput output;
	
	private String instructions = "Enter x and y coordinate of next placement (separated by whitespace) corresponding to board positions:\n0 0|1 0|2 0\n-----------\n0 1|1 1|2 1\n-----------\n0 2|1 2|2 2\n###########\n";

	@Override
	public void run(TextualOutput output) {
		this.output = output;
		output.message(instructions + "\n" + ticTacToe.toString(true) + "\n" + ticTacToe.getCurrentPlayer() + "'s turn");
	}

	/*
	 * PART 3
	 */

	private LevelFormat levelFormat = new StandardLevelFormat();
	
	@Override
	public Boolean doLine(String line) {
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
			return false;
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
		String message = ticTacToe.toString(true) + "\n";
		output.message(message + ticTacToe.getCurrentPlayer() + "'s turn");
		if (! ticTacToe.isFinished()) {
			return null;
		}
		if (! ticTacToe.hasWinner()) {
			// The game ended in a draw
			output.message(message + "The game ended in a draw.");
		} else if (ticTacToe.isWinner('x')) {
			output.message(message + "Player x has won the game.");
		} else if (ticTacToe.isWinner('o')) {
			output.message(message + "Player o has won the game.");
		}
		return true;
	}
	
	//

	public static void main(String[] args) throws Exception {
		TextualProgramDriver.main(new String[]{TicTacToeProgram.class.getName(), "........."});
	}
}
