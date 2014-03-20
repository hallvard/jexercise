package patterns.observable;

import java.util.Scanner;

public class HighscoreProgram implements ListListener {

	private HighscoreList highscoreList;

	public HighscoreProgram(HighscoreList highscoreList) {
		this.highscoreList = highscoreList;
		highscoreList.addListListener(this);
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
		HighscoreProgram program = new HighscoreProgram(new HighscoreList(5));
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int score = scanner.nextInt();
			program.highscoreList.addResult(score);
		}
		scanner.close();
	}
}
