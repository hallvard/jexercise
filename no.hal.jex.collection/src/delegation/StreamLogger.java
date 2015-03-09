package delegation;

import java.io.PrintStream;

public class StreamLogger implements ILogger {

	private PrintStream stream;
	private String logFormat = "%s @ %d: %s (%s)";
	
	@Override
	public void log(String severity, String message, Exception e) {
		if (stream != null) {
			stream.format(logFormat, severity, System.currentTimeMillis(), message, e.getMessage());
		}
	}
}
