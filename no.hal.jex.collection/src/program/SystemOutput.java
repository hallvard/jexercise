package program;

public class SystemOutput implements ConsoleOutput {
	
	@Override
	public void message(String message) {
		System.out.println(message);
	}

	@Override
	public void error(String message) {
		System.err.println(message);
	}
}
