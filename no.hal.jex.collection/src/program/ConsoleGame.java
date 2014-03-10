package program;

public interface ConsoleGame {
	public void init(String level);
	public void run(ConsoleOutput output);
	public Integer doLine(String line);
}
