package program;

public interface ConsoleGame {
	public void init(String level);
	public void run(GameOutput output);
	public Integer doLine(String line);
}
