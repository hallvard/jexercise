package sokoban.sokoban2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import program.GraphicalOutput;
import program.TextualOutput;
import program.TextualProgram;
import program.TextualProgramDriver;

public class SokobanProgram implements TextualProgram {

	private SokobanGrid grid = null;
	
	private Stack<Character> undo = new Stack<Character>();
	private Stack<Character> redo = new Stack<Character>();

	private Direction direction(char c) {
		switch (Character.toLowerCase(c)) {
		case 'w': return Direction.UP;
		case 's': return Direction.DOWN;
		case 'a': return Direction.LEFT;
		case 'd': return Direction.RIGHT;
		}
		return null;
	}
	
	public boolean doMove(char move, boolean isRedo) {
		Direction direction = direction(move);
		if (direction != null) {
			Boolean wasPush = grid.doMove(direction);
			if (wasPush != null) {
				move = wasPush ? Character.toUpperCase(move) : move;
				undo.push(move);
				if (! isRedo) {
					redo.clear();
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean doMove(char move) {
		return doMove(move, false);
	}

	public boolean undoMove() {
		if (undo.isEmpty()) {
			return false;
		}
		char move = undo.pop();
		boolean wasPush = Character.isUpperCase(move);
		move = Character.toLowerCase(move);
		Direction direction = direction(move);
		if (direction == null) {
			return false;
		}
		grid.undoMove(direction, wasPush);
		redo.push(move);
		return true;
	}

	public boolean redoMove() {
		if (redo.isEmpty()) {
			return false;
		}
		return doMove(redo.pop(), true);
	}

	private LevelFormat levelFormat = new StandardLevelFormat();
	
	public void init(String level) {
		if (level.indexOf('|') >= 0) {
			grid = new SokobanGrid(level.split("\\|"));
			undo.clear();
		} else {
			Exception exception = null;
			InputStream input = null;
			try {
				input = new URL(level).openStream();
			} catch (MalformedURLException mue) {
				try {
					input = new FileInputStream(level);
				} catch (FileNotFoundException e) {
					exception = e;
				}
			} catch (IOException e) {
				exception = e;
			}
			if (input != null) {
				try {
					grid = levelFormat.readLevel(input);
					undo.clear();
				} catch (IOException e) {
					exception = e;
				}
			}
			if (exception != null) {
				output.error(exception);
			}
		}
	}
	
	private TextualOutput output;
	
	public void run(TextualOutput output) {
		this.output = output;
		if (output instanceof GraphicalOutput) {
			((GraphicalOutput) output).imageGrid(grid.toString(), cellImageMapping);
		} else {
			output.message(grid);
		}
	}
	
	private String imageSuffix = "16x16.png";
	private Map<String, String> cellImageMapping = new HashMap<String, String>();
	{
		cellImageMapping.put(" ", "empty" + imageSuffix);
		cellImageMapping.put("#", "wall" + imageSuffix);
		cellImageMapping.put(".", "target" + imageSuffix);
		cellImageMapping.put("@", "player" + imageSuffix);
		cellImageMapping.put("+", "player_on_target" + imageSuffix);
		cellImageMapping.put("$", "box" + imageSuffix);
		cellImageMapping.put("*", "box_on_target" + imageSuffix);
	}
	
	public Boolean doLine(String moves) {
		if (moves.startsWith("<")) {
			try {
				init(moves.substring(1).trim());
			} catch (Exception e) {
				output.error("Exception when reading level: " + e);
			}
		} else if (moves.startsWith(">")) {
			try {
				levelFormat.writeLevel(grid, new FileOutputStream(moves.substring(1).trim()));
			} catch (Exception e) {
				output.error("Exception when writing level: " + e);
			}
		} else if (moves.equals("x") || moves.equals("q")) {
			return false;
		} else {
			int i = 0, n = 0;
			while (i < moves.length()) {
				char command = moves.charAt(i);
				// a digit repeating the following command
				if (Character.isDigit(command)) {
					n = command - '0';
					i++;
				}
				// space == undo
				else if (command == 'u') {
					undoMove();
				} else if (command == 'r') {
					redoMove();
				}
				// command is move in specific direction
				else if (direction(command) != null) {
					if (! doMove(command)) {
						output.message("Illegal move!");
					}
				}
				// count down repetition or step to next command
				if (n > 0) {
					n--;
				} else {
					i++;
				}
			}
			if (output instanceof GraphicalOutput) {
				((GraphicalOutput) output).imageGrid(grid.toString(), cellImageMapping);
			} else {
				output.message(grid + "\n" + this.undo.size() + " moves/pushes: " + moves);
			}
		}
		if (grid.countRemainingTargets() == 0) {
			output.message("Finished using " + this.undo.size() + " moves/pushes!");
			return true;
		}
		return null;
	}
	
	//
	
	public static void main(String[] args) throws Exception {
		TextualProgramDriver.main(new String[]{SokobanProgram.class.getName(), "#######|#.@ # #|#$* $ #|#   $ #|# ..  #|#  *  #|#######"});
	}
}
