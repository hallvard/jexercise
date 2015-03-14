package delegation;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import delegation.DistributingLogger;
import delegation.ILogger;
import delegation.StreamLogger;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests delegation.DistributingLogger")
@SuppressWarnings("all")
public class DistributingLoggerTest extends TestCase {
  private String formatString;
  
  private String _init_formatString() {
    return "%s: %s (%s)";
  }
  
  private ByteOutputStream infoStream;
  
  private ByteOutputStream _init_infoStream() {
    ByteOutputStream _byteOutputStream = new ByteOutputStream();
    return _byteOutputStream;
  }
  
  private ByteOutputStream warnStream;
  
  private ByteOutputStream _init_warnStream() {
    ByteOutputStream _byteOutputStream = new ByteOutputStream();
    return _byteOutputStream;
  }
  
  private ByteOutputStream errorStream;
  
  private ByteOutputStream _init_errorStream() {
    ByteOutputStream _byteOutputStream = new ByteOutputStream();
    return _byteOutputStream;
  }
  
  private ByteOutputStream newInfoStream;
  
  private ByteOutputStream _init_newInfoStream() {
    ByteOutputStream _byteOutputStream = new ByteOutputStream();
    return _byteOutputStream;
  }
  
  private StreamLogger infoLogger;
  
  private StreamLogger _init_infoLogger() {
    StreamLogger _streamLogger = new StreamLogger(this.infoStream);
    return _streamLogger;
  }
  
  private StreamLogger warnLogger;
  
  private StreamLogger _init_warnLogger() {
    StreamLogger _streamLogger = new StreamLogger(this.warnStream);
    return _streamLogger;
  }
  
  private StreamLogger errorLogger;
  
  private StreamLogger _init_errorLogger() {
    StreamLogger _streamLogger = new StreamLogger(this.errorStream);
    return _streamLogger;
  }
  
  private DistributingLogger logger;
  
  private DistributingLogger _init_logger() {
    DistributingLogger _distributingLogger = new DistributingLogger(this.errorLogger, this.warnLogger, this.infoLogger);
    return _distributingLogger;
  }
  
  @Override
  protected void setUp() {
    formatString = _init_formatString();
    infoStream = _init_infoStream();
    warnStream = _init_warnStream();
    errorStream = _init_errorStream();
    newInfoStream = _init_newInfoStream();
    infoLogger = _init_infoLogger();
    warnLogger = _init_warnLogger();
    errorLogger = _init_errorLogger();
    logger = _init_logger();
    
  }
  
  private boolean checkStreamContent(final ByteOutputStream stream, final String content) {
    String _string = stream.toString();
    return _string.equals(content);
  }
  
  @JExercise(tests = "DistributingLogger(delegation.ILogger,delegation.ILogger,delegation.ILogger);void log(String,String,Exception)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Skriver en melding til INFO: infoLogger.formatString = formatString, logger.log(ILogger.INFO, \"Dette er en info-melding.\", null)</li>\r\n\t\t</ul>\r\n")
  public void testLogToInfo() {
    _transition_exprAction__logToInfo_transitions0_actions0();
    _transition_exprAction__logToInfo_transitions0_actions1();
    _test__logToInfo_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "DistributingLogger(delegation.ILogger,delegation.ILogger,delegation.ILogger);void log(String,String,Exception)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Skriver en melding til WARNING: infoLogger.formatString = formatString, logger.log(ILogger.WARNING, \"Dette er en advarsel.\", null)</li>\r\n\t\t</ul>\r\n")
  public void testLogToWarn() {
    _transition_exprAction__logToWarn_transitions0_actions0();
    _transition_exprAction__logToWarn_transitions0_actions1();
    _test__logToWarn_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "DistributingLogger(delegation.ILogger,delegation.ILogger,delegation.ILogger);void log(String,String,Exception)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Skriver en melding til ERROR: infoLogger.formatString = formatString, logger.log(ILogger.ERROR, \"Dette er en feilmelding.\", exception)</li>\r\n\t\t</ul>\r\n")
  public void testLogToError() {
    Exception exception = _init__logToError_exception();
    _transition_exprAction__logToError_transitions0_actions0(exception);
    _transition_exprAction__logToError_transitions0_actions1(exception);
    _test__logToError_transitions0_effect_state(exception);
    
  }
  
  @JExercise(tests = "DistributingLogger(delegation.ILogger,delegation.ILogger,delegation.ILogger);void log(String,String,Exception);void setLogger(String,delegation.ILogger)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Skriver til INFO.: infoLogger.formatString = formatString, logger.log(ILogger.INFO, \"Dette er en info-melding.\", null)</li>\r\n\t\t<li>Bytter INFO-logger.: newInfoLogger.formatString = formatString, logger.setLogger(ILogger.INFO, newInfoLogger), logger.log(ILogger.INFO, \"Dette er en den andre info-meldingen.\", null)</li>\r\n\t\t</ul>\r\n")
  public void testChangeInfoLogger() {
    StreamLogger newInfoLogger = _init__changeInfoLogger_newInfoLogger();
    _transition_exprAction__changeInfoLogger_transitions0_actions0(newInfoLogger);
    _transition_exprAction__changeInfoLogger_transitions0_actions1(newInfoLogger);
    _test__changeInfoLogger_transitions0_effect_state(newInfoLogger);
    _transition_exprAction__changeInfoLogger_transitions1_actions0(newInfoLogger);
    _transition_exprAction__changeInfoLogger_transitions1_actions1(newInfoLogger);
    _transition_exprAction__changeInfoLogger_transitions1_actions2(newInfoLogger);
    _test__changeInfoLogger_transitions1_effect_state(newInfoLogger);
    
  }
  
  private void _transition_exprAction__logToInfo_transitions0_actions0() {
    try {
      
      this.infoLogger.setFormatString(this.formatString);
      } catch (junit.framework.AssertionFailedError error) {
      fail("infoLogger.formatString = formatString failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__logToInfo_transitions0_actions1() {
    try {
      
      this.logger.log(ILogger.INFO, "Dette er en info-melding.", null);
      } catch (junit.framework.AssertionFailedError error) {
      fail("logger.log(ILogger.INFO, \"Dette er en info-melding.\", null) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__logToInfo_transitions0_effect_state() {
    _test__logToInfo_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__logToInfo_transitions0_effect_state_objectTests0_test() {
    
    String _format = String.format(this.formatString, ILogger.INFO, "Dette er en info-melding.", null);
    boolean _checkStreamContent = this.checkStreamContent(this.infoStream, _format);
    assertTrue("checkStreamContent(infoStream, String.format(formatString, ILogger.INFO, \"Dette er en info-melding.\", null)) failed after infoLogger.formatString = formatString ,logger.log(ILogger.INFO, \"Dette er en info-melding.\", null)", _checkStreamContent);
    
    boolean _checkStreamContent_1 = this.checkStreamContent(this.warnStream, "");
    assertTrue("checkStreamContent(warnStream, \"\") failed after infoLogger.formatString = formatString ,logger.log(ILogger.INFO, \"Dette er en info-melding.\", null)", _checkStreamContent_1);
    
    assertTrue("checkStreamContent(errorStream, \"\") failed after infoLogger.formatString = formatString ,logger.log(ILogger.INFO, \"Dette er en info-melding.\", null)", this.checkStreamContent(this.errorStream, ""));
    
  }
  
  private void _transition_exprAction__logToWarn_transitions0_actions0() {
    try {
      
      this.infoLogger.setFormatString(this.formatString);
      } catch (junit.framework.AssertionFailedError error) {
      fail("infoLogger.formatString = formatString failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__logToWarn_transitions0_actions1() {
    try {
      
      this.logger.log(ILogger.WARNING, "Dette er en advarsel.", null);
      } catch (junit.framework.AssertionFailedError error) {
      fail("logger.log(ILogger.WARNING, \"Dette er en advarsel.\", null) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__logToWarn_transitions0_effect_state() {
    _test__logToWarn_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__logToWarn_transitions0_effect_state_objectTests0_test() {
    
    boolean _checkStreamContent = this.checkStreamContent(this.infoStream, "");
    assertTrue("checkStreamContent(infoStream, \"\") failed after infoLogger.formatString = formatString ,logger.log(ILogger.WARNING, \"Dette er en advarsel.\", null)", _checkStreamContent);
    
    String _format = String.format(this.formatString, ILogger.WARNING, "Dette er en advarsel.", null);
    boolean _checkStreamContent_1 = this.checkStreamContent(this.warnStream, _format);
    assertTrue("checkStreamContent(warnStream, String.format(formatString, ILogger.WARNING, \"Dette er en advarsel.\", null)) failed after infoLogger.formatString = formatString ,logger.log(ILogger.WARNING, \"Dette er en advarsel.\", null)", _checkStreamContent_1);
    
    assertTrue("checkStreamContent(errorStream, \"\") failed after infoLogger.formatString = formatString ,logger.log(ILogger.WARNING, \"Dette er en advarsel.\", null)", this.checkStreamContent(this.errorStream, ""));
    
  }
  
  private Exception _init__logToError_exception() {
    IllegalStateException _illegalStateException = new IllegalStateException();
    return _illegalStateException;
  }
  
  private void _transition_exprAction__logToError_transitions0_actions0(final Exception exception) {
    try {
      
      this.infoLogger.setFormatString(this.formatString);
      } catch (junit.framework.AssertionFailedError error) {
      fail("infoLogger.formatString = formatString failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__logToError_transitions0_actions1(final Exception exception) {
    try {
      
      this.logger.log(ILogger.ERROR, "Dette er en feilmelding.", exception);
      } catch (junit.framework.AssertionFailedError error) {
      fail("logger.log(ILogger.ERROR, \"Dette er en feilmelding.\", exception) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__logToError_transitions0_effect_state(final Exception exception) {
    _test__logToError_transitions0_effect_state_objectTests0_test(exception);
    
  }
  
  private void _test__logToError_transitions0_effect_state_objectTests0_test(final Exception exception) {
    
    boolean _checkStreamContent = this.checkStreamContent(this.infoStream, "");
    assertTrue("checkStreamContent(infoStream, \"\") failed after infoLogger.formatString = formatString ,logger.log(ILogger.ERROR, \"Dette er en feilmelding.\", exception)", _checkStreamContent);
    
    boolean _checkStreamContent_1 = this.checkStreamContent(this.warnStream, "");
    assertTrue("checkStreamContent(warnStream, \"\") failed after infoLogger.formatString = formatString ,logger.log(ILogger.ERROR, \"Dette er en feilmelding.\", exception)", _checkStreamContent_1);
    
    String _format = String.format(this.formatString, ILogger.ERROR, "Dette er en feilmelding.", exception);
    assertTrue("checkStreamContent(errorStream, String.format(formatString, ILogger.ERROR, \"Dette er en feilmelding.\", exception)) failed after infoLogger.formatString = formatString ,logger.log(ILogger.ERROR, \"Dette er en feilmelding.\", exception)", this.checkStreamContent(this.errorStream, _format));
    
  }
  
  private StreamLogger _init__changeInfoLogger_newInfoLogger() {
    StreamLogger _streamLogger = new StreamLogger(this.newInfoStream);
    return _streamLogger;
  }
  
  private void _transition_exprAction__changeInfoLogger_transitions0_actions0(final StreamLogger newInfoLogger) {
    try {
      
      this.infoLogger.setFormatString(this.formatString);
      } catch (junit.framework.AssertionFailedError error) {
      fail("infoLogger.formatString = formatString failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__changeInfoLogger_transitions0_actions1(final StreamLogger newInfoLogger) {
    try {
      
      this.logger.log(ILogger.INFO, "Dette er en info-melding.", null);
      } catch (junit.framework.AssertionFailedError error) {
      fail("logger.log(ILogger.INFO, \"Dette er en info-melding.\", null) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__changeInfoLogger_transitions0_effect_state(final StreamLogger newInfoLogger) {
    _test__changeInfoLogger_transitions0_effect_state_objectTests0_test(newInfoLogger);
    
  }
  
  private void _test__changeInfoLogger_transitions0_effect_state_objectTests0_test(final StreamLogger newInfoLogger) {
    
    String _format = String.format(this.formatString, ILogger.INFO, "Dette er en info-melding.", null);
    assertTrue("checkStreamContent(infoStream, String.format(formatString, ILogger.INFO, \"Dette er en info-melding.\", null)) failed after infoLogger.formatString = formatString ,logger.log(ILogger.INFO, \"Dette er en info-melding.\", null)", this.checkStreamContent(this.infoStream, _format));
    
  }
  
  private void _transition_exprAction__changeInfoLogger_transitions1_actions0(final StreamLogger newInfoLogger) {
    try {
      
      newInfoLogger.setFormatString(this.formatString);
      } catch (junit.framework.AssertionFailedError error) {
      fail("newInfoLogger.formatString = formatString failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__changeInfoLogger_transitions1_actions1(final StreamLogger newInfoLogger) {
    try {
      
      this.logger.setLogger(ILogger.INFO, newInfoLogger);
      } catch (junit.framework.AssertionFailedError error) {
      fail("logger.setLogger(ILogger.INFO, newInfoLogger) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__changeInfoLogger_transitions1_actions2(final StreamLogger newInfoLogger) {
    try {
      
      this.logger.log(ILogger.INFO, "Dette er en den andre info-meldingen.", null);
      } catch (junit.framework.AssertionFailedError error) {
      fail("logger.log(ILogger.INFO, \"Dette er en den andre info-meldingen.\", null) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__changeInfoLogger_transitions1_effect_state(final StreamLogger newInfoLogger) {
    _test__changeInfoLogger_transitions1_effect_state_objectTests0_test(newInfoLogger);
    
  }
  
  private void _test__changeInfoLogger_transitions1_effect_state_objectTests0_test(final StreamLogger newInfoLogger) {
    
    String _format = String.format(this.formatString, ILogger.INFO, "Dette er en info-melding.", null);
    boolean _checkStreamContent = this.checkStreamContent(this.infoStream, _format);
    assertTrue("checkStreamContent(infoStream, String.format(formatString, ILogger.INFO, \"Dette er en info-melding.\", null)) failed after newInfoLogger.formatString = formatString ,logger.setLogger(ILogger.INFO, newInfoLogger) ,logger.log(ILogger.INFO, \"Dette er en den andre info-meldingen.\", null)", _checkStreamContent);
    
    String _format_1 = String.format(this.formatString, ILogger.INFO, "Dette er en den andre info-meldingen.", null);
    assertTrue("checkStreamContent(newInfoStream, String.format(formatString, ILogger.INFO, \"Dette er en den andre info-meldingen.\", null)) failed after newInfoLogger.formatString = formatString ,logger.setLogger(ILogger.INFO, newInfoLogger) ,logger.log(ILogger.INFO, \"Dette er en den andre info-meldingen.\", null)", this.checkStreamContent(this.newInfoStream, _format_1));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(DistributingLoggerTest.class);
  }
}
