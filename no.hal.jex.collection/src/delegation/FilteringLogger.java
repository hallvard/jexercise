package delegation;

import java.util.Arrays;
import java.util.Collection;

public class FilteringLogger implements ILogger {

	private final Collection<String> severities;
	private ILogger delegate;
	
	public FilteringLogger(ILogger delegate, String... severities) {
		super();
		this.severities = Arrays.asList(severities);
		this.delegate = delegate;
	}
	
	@Override
	public void log(String severity, String message, Exception e) {
		if (severities.contains(severity)) {
			delegate.log(severity, message, e);
		}
	}
}
