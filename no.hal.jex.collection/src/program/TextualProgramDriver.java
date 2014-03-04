package program;

import java.util.Scanner;

public class TextualProgramDriver implements TextualOutput {

	private TextualProgram program;
	private String level = null;

	private void init(TextualProgram program, String level) {
		this.program = program;
		this.level = level;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		do {
			if (level == null) {
				if (scanner.hasNextLine()) {
					level = scanner.nextLine();
				}
				message("Enter level: ");
				level = scanner.nextLine();
			}
			program.init(level);
			program.run(this);
			Boolean result = null;
			while (result == null) {
				if (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					result = program.doLine(line);
				} else {
					result = false;
				}
			}
			message("Game over" + (result ? "" : ", no result") + "!");
			if (result) {
				level = null;
			}
			message("Another go (true/false)?");
		} while (scanner.nextBoolean());
		scanner.close();
	}

	@Override
	public void message(Object o) {
		System.out.println(o);
	}

	@Override
	public void error(Object o) {
		System.err.println(o);
	}

	public static void main(String[] args) throws Exception {
		TextualProgramDriver driver = new TextualProgramDriver();
		TextualProgram program = (TextualProgram) Class.forName(args[0]).newInstance();
		driver.init(program, args.length > 1 ? args[1] : null);
		driver.run();
	}
}
