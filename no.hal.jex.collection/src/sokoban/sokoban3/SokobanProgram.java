package sokoban.sokoban3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import program.GameOutput;
import program.GridGame;
import program.GridGameGUI;
import program.GridProvider;

public class SokobanProgram implements GridGame {

	private SokobanGrid grid = null;
	
	private Stack<String> undo = new Stack<String>();
	private Stack<String> redo = new Stack<String>();

	private Direction directionFor(char c) {
		switch (Character.toLowerCase(c)) {
		case 'w': return Direction.UP;
		case 's': return Direction.DOWN;
		case 'a': return Direction.LEFT;
		case 'd': return Direction.RIGHT;
		}
		return null;
	}
	
	private Character moveFor(int dx, int dy) {
		if (dx == 0 && dy < 0) {
			return 'w';
		} else if (dx == 0 && dy > 0) {
			return 's';
		} else if (dx < 0 && dy == 0) {
			return 'a';
		} else if (dx > 0 && dy == 0) {
			return 'd';
		}
		return null;
	}

	public boolean doMoves(String moves, boolean isRedo) {
		String undoMoves = "";
		for (int i = 0; i < moves.length(); i++) {
			char move = moves.charAt(i);
			Direction direction = directionFor(move);
			if (direction != null) {
				Boolean wasPush = grid.doMove(direction);
				if (wasPush != null) {
					move = wasPush ? Character.toUpperCase(move) : move;
					undoMoves += move;
				}
			}
		}
		if (undoMoves.length() > 0) {
			undo.push(undoMoves);
			if (! isRedo) {
				redo.clear();
			}
			return true;
		}
		return false;
	}
	
	public boolean doMove(char move) {
		return doMoves(String.valueOf(move), false);
	}

	public boolean undoMoves() {
		if (undo.isEmpty()) {
			return false;
		}
		String moves = undo.pop();
		for (int i = moves.length() - 1; i >= 0; i--) {
			char move = moves.charAt(i);
			boolean wasPush = Character.isUpperCase(move);
			move = Character.toLowerCase(move);
			grid.undoMove(directionFor(move), wasPush);
		}
		redo.push(moves);
		return true;
	}

	public boolean redoMove() {
		if (redo.isEmpty()) {
			return false;
		}
		return doMoves(redo.pop(), true);
	}

	public CharSequence computeMovesToGoal(int goalX, int goalY) {
		Cell goalValue = grid.getGridElement(goalX, goalY);
		if (goalValue.isOccupied()) {
			return null;
		}
		int[] player = grid.getPlayerPosition();
		// we extend a boundary, like riples in the water, from the starting point
		Queue<Integer> boundary = new LinkedList<Integer>();
		boundary.add(player[0]);
		boundary.add(player[1]);
		// as long as there are more cells to consider
		StringBuilder moves = null;
		while (boundary.size() > 0) {
			// remove current position
			int x = boundary.poll(), y = boundary.poll();
			for (Direction direction : Direction.DIRECTIONS) {
				int nx = x + direction.dx, ny = y + direction.dy;
				Cell cell = grid.getGridElement(nx, ny);
				// if this is a new and unoccupied cell
				if (cell.getDirection() == null && (! cell.isOccupied())) {
					// note the direction we came from
					cell.setDirection(direction);
					// if this is goal, walk backwards (the opposite direction) and collect moves
					if (nx == goalX && ny == goalY) {
						moves = new StringBuilder(grid.getGridWidth() + grid.getGridHeight());
						while (nx != player[0] || ny != player[1]) {
							Cell moveCell = grid.getGridElement(nx, ny);
							Direction moveDirection = moveCell.getDirection();
							moves.append(moveFor(moveDirection.dx, moveDirection.dy));
							nx -= moveDirection.dx;
							ny -= moveDirection.dy;
						}
						moves.reverse();
						break;
					}
					// enqueue this position, so we can consider it later
					boundary.offer(nx);
					boundary.offer(ny);
				}
			}
		}
		grid.clearDirections();
		return moves;
	}

	public CharSequence computeMovesInDirection(int dx, int dy, boolean considerPushes) {
		int player[] = grid.getPlayerPosition(), nx = player[0] + dx, ny = player[1] + dy;
		StringBuilder buffer = new StringBuilder();
		buffer.append(moveFor(dx, dy));
		outer: while (true) {
			Direction possibleDirection = null;
			for (Direction testDirection : Direction.DIRECTIONS) {
				// ignore the opposite direction
				if (testDirection.dx == -dx && testDirection.dy == -dy) {
					continue;
				}
				if (grid.tryMove(nx, ny, testDirection.dx, testDirection.dy, false, false) != null) {
					if (possibleDirection != null)
						break outer;
					else
						possibleDirection = testDirection;
				}
			}
			if (possibleDirection == null || grid.tryMove(nx, ny, possibleDirection.dx, possibleDirection.dy, considerPushes, false) == null) {
				break;
			}
			dx = possibleDirection.dx;
			dy = possibleDirection.dy;
			buffer.append(moveFor(dx, dy));
			nx += dx;
			ny += dy;
		}
		return buffer;
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
				output.error(exception.getMessage());
			}
		}
	}
	
	private GameOutput output;
	
	public void run(GameOutput output) {
		this.output = output;
	}
	
	public Integer doCommand(String moves) {
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
			return -1;
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
					undoMoves();
				} else if (command == 'r') {
					redoMove();
				}
				// command is move in specific direction
				else {
					Direction direction = directionFor(command);
					if (direction != null) {
						Boolean legalMove = null;
						if (Character.isUpperCase(command)) {
							CharSequence directionMoves = computeMovesInDirection(direction.dx, direction.dy, true);
							if (directionMoves != null) {
								legalMove = doMoves(directionMoves.toString(), false);
							}
						} else {
							legalMove = doMove(command);
						}
						if (legalMove != null && (! legalMove)) {
							output.info("Illegal move!");
						}
					}
				}
				// count down repetition or step to next command
				if (n > 0) {
					n--;
				} else {
					i++;
				}
			}
		}
		return returnGameStatus();
	}

	private Integer returnGameStatus() {
		if (grid.countRemainingTargets() == 0) {
			output.info("Finished using " + this.undo.size() + " moves/pushes!");
			return 1;
		}
		return null;
	}
	
	@Override
	public Integer gridElementInput(int x, int y) {
		CharSequence moves = computeMovesToGoal(x, y);
		if (moves != null) {
			doMoves(moves.toString(), false);
		}
		return null;
	}
	
	@Override
	public Integer directionInput(int dx, int dy) {
		Character move = moveFor(dx, dy);
		if (move != null) {
			doMove(move);
		}
		return returnGameStatus();
	}

	@Override
	public GridProvider getGridProvider() {
		return grid;
	}

	@Override
	public String getTextFor(Object o) {
		return null;
	}
	
	@Override
	public String getImageFor(Object o) {
		return o.toString();
	}
	
	//
	
	public static void main(String[] args) throws Exception {
		GridGameGUI.main(new String[]{SokobanProgram.class.getName(), "#######|#.@ # #|#$* $ #|#   $ #|# ..  #|#  *  #|#######"});
	}
}
