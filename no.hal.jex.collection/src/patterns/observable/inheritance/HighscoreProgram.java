package patterns.observable.inheritance;

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
		for (int i = 0; i < highscoreList.size(); i++) {
			System.out.println(highscoreList.getElement(i) + (pos == i ? (" <=== @ " + pos) : ""));
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
