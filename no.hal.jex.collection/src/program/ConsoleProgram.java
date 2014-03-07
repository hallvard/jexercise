package program;

public interface ConsoleProgram {
	public void init(String level);
	public void run(ConsoleOutput output);
	public Integer doLine(String line);
}
