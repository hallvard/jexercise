package delegation.office;

import delegation.office.Clerk;
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
  
  private Clerk clerk1;
  
  private Clerk _init_clerk1() {
    Clerk _clerk = new Clerk(this.printer);
    return _clerk;
  }
  
  private Clerk clerk2;
  
  private Clerk _init_clerk2() {
    Clerk _clerk = new Clerk(this.printer);
    return _clerk;
  }
  
  @Override
  protected void setUp() {
    printer = _init_printer();
    clerk1 = _init_clerk1();
    clerk2 = _init_clerk2();
    
  }
  
  @JExercise(tests = "Printer();void printDocument(String,delegation.office.Employee)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Printer to dokumenter: printer.printDocument(\"dokument1\", clerk1)</li>\r\n\t\t<li>Printer et dokument til: printer.printDocument(\"dokument2\", clerk1)</li>\r\n\t\t</ul>\r\n")
  public void testPrintSingleClerk() {
    _test__printSingleClerk_transitions0_effect_state();
    _transition_exprAction__printSingleClerk_transitions1_actions0();
    _test__printSingleClerk_transitions1_effect_state();
    _transition_exprAction__printSingleClerk_transitions2_actions0();
    _test__printSingleClerk_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "Printer();void printDocument(String,delegation.office.Employee)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Printer dokument for Clerk nr. 1: printer.printDocument(\"dokument1\", clerk1)</li>\r\n\t\t<li>Printer dokument for Clerk nr. 2: printer.printDocument(\"dokument2\", clerk2)</li>\r\n\t\t</ul>\r\n")
  public void testPrintMulipleClerks() {
    _test__printMulipleClerks_transitions0_effect_state();
    _transition_exprAction__printMulipleClerks_transitions1_actions0();
    _test__printMulipleClerks_transitions1_effect_state();
    _transition_exprAction__printMulipleClerks_transitions2_actions0();
    _test__printMulipleClerks_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "Printer();void printDocument(String,delegation.office.Employee);java.util.List<String> getPrintHistory(delegation.office.Employee)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Printer to dokumenter: printer.printDocument(\"dokument1\", clerk1), printer.printDocument(\"dokument2\", clerk1)</li>\r\n\t\t<li>Fjerner et dokument fra historikk og sjekker at printer-historikken er uendret: printer.getPrintHistory(clerk1).remove(0)</li>\r\n\t\t</ul>\r\n")
  public void testPrintHistoryModification() {
    _transition_exprAction__printHistoryModification_transitions0_actions0();
    _transition_exprAction__printHistoryModification_transitions0_actions1();
    _test__printHistoryModification_transitions0_effect_state();
    _transition_exprAction__printHistoryModification_transitions1_actions0();
    _test__printHistoryModification_transitions1_effect_state();
    
  }
  
  private void _test__printSingleClerk_transitions0_effect_state() {
    _test__printSingleClerk_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__printSingleClerk_transitions0_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 0 failed", 0, _size);
    
  }
  
  private void _transition_exprAction__printSingleClerk_transitions1_actions0() {
    try {
      
      this.printer.printDocument("dokument1", this.clerk1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument1\", clerk1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printSingleClerk_transitions1_effect_state() {
    _test__printSingleClerk_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__printSingleClerk_transitions1_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 1 failed after printer.printDocument(\"dokument1\", clerk1)", 1, _size);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk1);
    String _get = _printHistory_1.get(0);
    assertEquals("printer.getPrintHistory(clerk1).get(0) == \"dokument1\" failed after printer.printDocument(\"dokument1\", clerk1)", "dokument1", _get);
    
  }
  
  private void _transition_exprAction__printSingleClerk_transitions2_actions0() {
    try {
      
      this.printer.printDocument("dokument2", this.clerk1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument2\", clerk1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printSingleClerk_transitions2_effect_state() {
    _test__printSingleClerk_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__printSingleClerk_transitions2_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 2 failed after printer.printDocument(\"dokument2\", clerk1)", 2, _size);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk1);
    String _get = _printHistory_1.get(1);
    assertEquals("printer.getPrintHistory(clerk1).get(1) == \"dokument2\" failed after printer.printDocument(\"dokument2\", clerk1)", "dokument2", _get);
    
  }
  
  private void _test__printMulipleClerks_transitions0_effect_state() {
    _test__printMulipleClerks_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__printMulipleClerks_transitions0_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 0 failed", 0, _size);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk2);
    int _size_1 = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk2).size == 0 failed", 0, _size_1);
    
  }
  
  private void _transition_exprAction__printMulipleClerks_transitions1_actions0() {
    try {
      
      this.printer.printDocument("dokument1", this.clerk1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument1\", clerk1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printMulipleClerks_transitions1_effect_state() {
    _test__printMulipleClerks_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__printMulipleClerks_transitions1_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 1 failed after printer.printDocument(\"dokument1\", clerk1)", 1, _size);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk2);
    int _size_1 = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk2).size == 0 failed after printer.printDocument(\"dokument1\", clerk1)", 0, _size_1);
    
  }
  
  private void _transition_exprAction__printMulipleClerks_transitions2_actions0() {
    try {
      
      this.printer.printDocument("dokument2", this.clerk2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument2\", clerk2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printMulipleClerks_transitions2_effect_state() {
    _test__printMulipleClerks_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__printMulipleClerks_transitions2_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 1 failed after printer.printDocument(\"dokument2\", clerk2)", 1, _size);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk2);
    int _size_1 = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk2).size == 1 failed after printer.printDocument(\"dokument2\", clerk2)", 1, _size_1);
    
  }
  
  private void _transition_exprAction__printHistoryModification_transitions0_actions0() {
    try {
      
      this.printer.printDocument("dokument1", this.clerk1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument1\", clerk1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__printHistoryModification_transitions0_actions1() {
    try {
      
      this.printer.printDocument("dokument2", this.clerk1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.printDocument(\"dokument2\", clerk1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printHistoryModification_transitions0_effect_state() {
    _test__printHistoryModification_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__printHistoryModification_transitions0_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 2 failed after printer.printDocument(\"dokument1\", clerk1) ,printer.printDocument(\"dokument2\", clerk1)", 2, _size);
    
  }
  
  private void _transition_exprAction__printHistoryModification_transitions1_actions0() {
    try {
      
      List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
      _printHistory.remove(0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("printer.getPrintHistory(clerk1).remove(0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printHistoryModification_transitions1_effect_state() {
    _test__printHistoryModification_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__printHistoryModification_transitions1_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk1);
    int _size = _printHistory.size();
    assertEquals("printer.getPrintHistory(clerk1).size == 2 failed after printer.getPrintHistory(clerk1).remove(0)", 2, _size);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(PrinterTest.class);
  }
}
