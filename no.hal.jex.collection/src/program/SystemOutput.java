package program;

public class SystemOutput implements GameOutput {
	
	@Override
	public void info(String message) {
		System.out.println(message);
	}

	@Override
	public void warning(String message) {
		System.out.println("==>" + message + "!!!");
	}
	
	@Override
	public void error(String message) {
		System.err.println(message);
	}
}
