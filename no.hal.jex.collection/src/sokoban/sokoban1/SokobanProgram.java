package sokoban.sokoban1;

import java.util.Scanner;

public class SokobanProgram {

	private SokobanGrid grid = null;
	
	public boolean doMove(char move) {
		int dx = 0, dy = 0;
		if (move == 'w') {
			dy = -1;
		} else if (move == 's') {
			dy = 1;
		} if (move == 'a') {
			dx = -1;
		} else if (move == 'd') {
			dx = 1;
		}
		if (dx != 0 || dy != 0) {
			return grid.doMove(dx, dy);
		}
		return false;
	}

	public void init(String level) {
		String[] lines = level.split("\\|");
		if (lines.length >= 3) {
			grid = new SokobanGrid(lines);
		}
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (grid == null) {
			System.out.println("Enter level on compact format: ");
			try {
				init(scanner.nextLine());
			} catch (Exception e) {
			}
		}
		System.out.println(grid);
		while (grid.countRemainingTargets() > 0 && scanner.hasNextLine()) {
			String moves = scanner.nextLine();
			if (moves.startsWith("<")) {
				try {
					init(moves.substring(1).trim());
				} catch (Exception e) {
					System.err.println("Exception when reading level: " + e);
				}
			} else {
				int i = 0, n = 0;
				while (i < moves.length()) {
					char command = moves.charAt(i);
					// a digit repeating the following command
					if (Character.isDigit(command)) {
						n = command - '0';
						i++;
					}
					// command is move in specific direction
					else {
						if (! doMove(command)) {
							System.out.println("Illegal move!");
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
			System.out.println(grid);
		}
		System.out.printf("Finished!");
		scanner.close();
	}
	
	public static void main(String[] args) {
		SokobanProgram sokoban = new SokobanProgram();
		sokoban.init(args.length > 0 ? args[0] : "#######|#.@ # #|#$* $ #|#   $ #|# ..  #|#  *  #|#######");
		sokoban.run();
	}
}
