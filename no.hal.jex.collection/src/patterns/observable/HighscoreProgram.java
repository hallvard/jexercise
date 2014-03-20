package patterns.observable;

import java.util.Scanner;

public class HighscoreProgram implements ListListener {

	private HighscoreList highscoreList;

	public void init() {
		this.highscoreList = new HighscoreList(5);
		highscoreList.addListListener(this);
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int score = scanner.nextInt();
			highscoreList.addResult(score);
		}
		scanner.close();
	}

	public void listChanged(ObservableList list, int pos) {
		int i = 0;
		for (Object result: highscoreList) {
			System.out.println(result + (pos == i ? (" <=== @ " + pos) : ""));
			i++;
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HighscoreProgram program = new HighscoreProgram();
		program.init();
		program.run();
	}
}
