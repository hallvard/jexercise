package delegation.office;

import delegation.office.Printer;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests delegation.office.Printer")
@SuppressWarnings("all")
public class PrinterTest extends TestCase {
  private Printer printer;
  
  private Printer _init_printer() {
    Printer _printer = new Printer();
    return _printer;
  }
  
  @Override
  protected void setUp() {
    printer = _init_printer();
    
  }
  
  @JExercise(tests = "Printer();void printDocument(String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer to dokumenter: printer.printDocument(\"dokument1\"), printer.printDocument(\"dokument2\")</li>\n\t\t</ul>\n")
  public void testPrint() {
    _test__print_transitions0_effect_state(printer);
    _transition_exprAction__print_transitions1_actions0(printer);
    _transition_exprAction__print_transitions1_actions1(printer);
    _test__print_transitions1_effect_state(printer);
    
  }
  
  @JExercise(tests = "Printer();void printDocument(String);java.util.List<String> getPrintHistory()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer to dokumenter: printer.printDocument(\"dokument1\"), printer.printDocument(\"dokument2\")</li>\n\t\t<li>Fjerner et dokument fra history og sjekker at printer-historikken er uendret: printer.printHistory.remove(0)</li>\n\t\t</ul>\n")
  public void testPrintHistoryModification() {
    _transition_exprAction__printHistoryModification_transitions0_actions0(printer);
    _transition_exprAction__printHistoryModification_transitions0_actions1(printer);
    _test__printHistoryModification_transitions0_effect_state(printer);
    _transition_exprAction__printHistoryModification_transitions1_actions0(printer);
    _test__printHistoryModification_transitions1_effect_state(printer);
    
  }
  
  private void _test__print_transitions0_effect_state(final Printer it) {
    _test__print_transitions0_effect_state_objectTests0_test(printer);
    
  }
  
  private void _test__print_transitions0_effect_state_objectTests0_test(final Printer it) {
    
    List<String> _printHistory = this.printer.getPrintHistory();
    int _size = _printHistory.size();
    assertEquals("printer.printHistory.size == 0 failed", 0, _size);
    
  }
  
  private void _transition_exprAction__print_transitions1_actions0(final Printer it) {
    try {
      
      this.printer.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__print_transitions1_actions1(final Printer it) {
    try {
      
      this.printer.printDocument("dokument2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__print_transitions1_effect_state(final Printer it) {
    _test__print_transitions1_effect_state_objectTests0_test(printer);
    
  }
  
  private void _test__print_transitions1_effect_state_objectTests0_test(final Printer it) {
    
    List<String> _printHistory = this.printer.getPrintHistory();
    int _size = _printHistory.size();
    assertEquals("printer.printHistory.size == 2 failed after printer.printDocument(\"dokument1\") ,printer.printDocument(\"dokument2\")", 2, _size);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory();
    String _get = _printHistory_1.get(0);
    assertEquals("printer.printHistory.get(0) == \"dokument1\" failed after printer.printDocument(\"dokument1\") ,printer.printDocument(\"dokument2\")", "dokument1", _get);
    
    List<String> _printHistory_2 = this.printer.getPrintHistory();
    String _get_1 = _printHistory_2.get(1);
    assertEquals("printer.printHistory.get(1) == \"dokument2\" failed after printer.printDocument(\"dokument1\") ,printer.printDocument(\"dokument2\")", "dokument2", _get_1);
    
  }
  
  private void _transition_exprAction__printHistoryModification_transitions0_actions0(final Printer it) {
    try {
      
      this.printer.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__printHistoryModification_transitions0_actions1(final Printer it) {
    try {
      
      this.printer.printDocument("dokument2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printHistoryModification_transitions0_effect_state(final Printer it) {
    _test__printHistoryModification_transitions0_effect_state_objectTests0_test(printer);
    
  }
  
  private void _test__printHistoryModification_transitions0_effect_state_objectTests0_test(final Printer it) {
    
    List<String> _printHistory = this.printer.getPrintHistory();
    int _size = _printHistory.size();
    assertEquals("printer.printHistory.size == 2 failed after printer.printDocument(\"dokument1\") ,printer.printDocument(\"dokument2\")", 2, _size);
    
  }
  
  private void _transition_exprAction__printHistoryModification_transitions1_actions0(final Printer it) {
    try {
      
      List<String> _printHistory = this.printer.getPrintHistory();
      _printHistory.remove(0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printHistory.remove(0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printHistoryModification_transitions1_effect_state(final Printer it) {
    _test__printHistoryModification_transitions1_effect_state_objectTests0_test(printer);
    
  }
  
  private void _test__printHistoryModification_transitions1_effect_state_objectTests0_test(final Printer it) {
    
    List<String> _printHistory = this.printer.getPrintHistory();
    int _size = _printHistory.size();
    assertEquals("printer.printHistory.size == 2 failed after printer.printHistory.remove(0)", 2, _size);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(PrinterTest.class);
  }
}
