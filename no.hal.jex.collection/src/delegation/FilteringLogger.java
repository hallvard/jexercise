package delegation;

import java.util.Arrays;
import java.util.Collection;

public class FilteringLogger implements ILogger {

	private final Collection<String> severities;
	private ILogger logger;
	
	public FilteringLogger(ILogger logger, String... severities) {
		this.severities = Arrays.asList(severities);
		this.logger = logger;
	}
	
	public boolean isLogging(String severity) {
		return severities.contains(severity);
	}

	public void setIsLogging(String severity, boolean value) {
		if (! value) {
			severities.remove(severity);
		} else if (! isLogging(severity)) {
			severities.add(severity);
		}
	}

	@Override
	public void log(String severity, String message, Exception e) {
		if (isLogging(severity)) {
			logger.log(severity, message, e);
		}
	}
}
