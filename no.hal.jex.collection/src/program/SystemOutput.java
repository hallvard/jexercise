package program;

public class SystemOutput implements ConsoleOutput {
	
	@Override
	public void message(Object o) {
		System.out.println(o);
	}

	@Override
	public void error(Object o) {
		System.err.println(o);
	}
}
