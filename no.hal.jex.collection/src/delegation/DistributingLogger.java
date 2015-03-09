package delegation;

public class DistributingLogger implements ILogger {

	private ILogger errorLogger, warningLogger, infoLogger;
	
	public void setErrorLogger(ILogger errorLogger) {
		this.errorLogger = errorLogger;
	}
	
	public void setWarningLogger(ILogger warningLogger) {
		this.warningLogger = warningLogger;
	}
	
	public void setInfoLogger(ILogger infoLogger) {
		this.infoLogger = infoLogger;
	}
	
	public DistributingLogger(ILogger errorLogger, ILogger warningLogger, ILogger infoLogger) {
		this.errorLogger = errorLogger;
		this.warningLogger = warningLogger;
		this.infoLogger = infoLogger;
	}

	@Override
	public void log(String severity, String message, Exception e) {
		if (severity == ERROR && errorLogger != null) {
			errorLogger.log(severity, message, e);
		} else if (severity == WARNING && warningLogger != null) {
			warningLogger.log(severity, message, e);
		} else if (severity == INFO && infoLogger != null) {
			infoLogger.log(severity, message, e);
		}
	}
}
