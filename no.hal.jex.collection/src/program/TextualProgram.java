package program;

public interface TextualProgram {
	public void init(String level);
	public void run(TextualOutput driver);
	public Boolean doLine(String line);
}
