package delegation.office;

import delegation.office.Clerk;
import delegation.office.Printer;
import java.util.List;
import java.util.function.BinaryOperator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

@JExercise(description = "Tests delegation.office.Clerk")
@SuppressWarnings("all")
public class ClerkTest extends TestCase {
  private Printer printer;
  
  private Printer _init_printer() {
    Printer _printer = new Printer();
    return _printer;
  }
  
  private Clerk clerk;
  
  private Clerk _init_clerk() {
    Clerk _clerk = new Clerk(this.printer);
    return _clerk;
  }
  
  @Override
  protected void setUp() {
    printer = _init_printer();
    clerk = _init_clerk();
    
  }
  
  private boolean operator_assertEquals(final double first, final double second) {
    TestCase.assertEquals(first, second, 0.000001d);
    return true;
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Gj\u00F8r en beregning: clerk.doCalculations([x, y | x + y ], 2.0, 3.5) ?= 5.5</li>\r\n\t\t<li>Gj\u00F8r en beregning: clerk.doCalculations([x, y | x / y ], 2.0, 4.0) ?= 0.5</li>\r\n\t\t</ul>\r\n")
  public void testDoCalculations() {
    _test__doCalculations_transitions0_effect_state();
    _transition_exprAction__doCalculations_transitions1_actions0();
    _test__doCalculations_transitions1_effect_state();
    _transition_exprAction__doCalculations_transitions2_actions0();
    _test__doCalculations_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer);void printDocument(String)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Printer et dokument: clerk.printDocument(\"dokument1\")</li>\r\n\t\t<li>Printer et dokument: clerk.printDocument(\"dokument2\")</li>\r\n\t\t</ul>\r\n")
  public void testPrintDocuments() {
    _test__printDocuments_transitions0_effect_state();
    _transition_exprAction__printDocuments_transitions1_actions0();
    _test__printDocuments_transitions1_effect_state();
    _transition_exprAction__printDocuments_transitions2_actions0();
    _test__printDocuments_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer);void printDocument(String);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Printer et dokument: clerk.printDocument(\"dokument1\")</li>\r\n\t\t<li>Gj\u00F8r en beregning: clerk.doCalculations([x, y | x + y ], 2.0, 3.5)</li>\r\n\t\t</ul>\r\n")
  public void testTaskCount() {
    _test__taskCount_transitions0_effect_state();
    _transition_exprAction__taskCount_transitions1_actions0();
    _test__taskCount_transitions1_effect_state();
    _transition_exprAction__taskCount_transitions2_actions0();
    _test__taskCount_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer)", description = "Tests \r\n\t\tinitialization\r\n")
  public void testResourceCount() {
    _test__resourceCount_transitions0_effect_state();
    
  }
  
  private void _test__doCalculations_transitions0_effect_state() {
    _test__doCalculations_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions0_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
  }
  
  private void _transition_exprAction__doCalculations_transitions1_actions0() {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_plus(x, y));
      }
    };
    double _doCalculations = this.clerk.doCalculations(_function, 2.0, 3.5);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 5.5);
    assertTrue("clerk.doCalculations([x, y | x + y ], 2.0, 3.5) ?= 5.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__doCalculations_transitions1_effect_state() {
    _test__doCalculations_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions1_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 1 failed after clerk.doCalculations([x, y | x + y ], 2.0, 3.5) ?= 5.5", 1, _taskCount);
    
  }
  
  private void _transition_exprAction__doCalculations_transitions2_actions0() {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_divide(x, y));
      }
    };
    double _doCalculations = this.clerk.doCalculations(_function, 2.0, 4.0);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 0.5);
    assertTrue("clerk.doCalculations([x, y | x / y ], 2.0, 4.0) ?= 0.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__doCalculations_transitions2_effect_state() {
    _test__doCalculations_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions2_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 2 failed after clerk.doCalculations([x, y | x / y ], 2.0, 4.0) ?= 0.5", 2, _taskCount);
    
  }
  
  private void _test__printDocuments_transitions0_effect_state() {
    _test__printDocuments_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions0_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
  }
  
  private void _transition_exprAction__printDocuments_transitions1_actions0() {
    try {
      
      this.clerk.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printDocuments_transitions1_effect_state() {
    _test__printDocuments_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions1_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk);
    String _get = _printHistory.get(0);
    assertEquals("printer.getPrintHistory(clerk).get(0) == \"dokument1\" failed after clerk.printDocument(\"dokument1\")", "dokument1", _get);
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 1 failed after clerk.printDocument(\"dokument1\")", 1, _taskCount);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk);
    int _size = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk).size == 1 failed after clerk.printDocument(\"dokument1\")", 1, _size);
    
  }
  
  private void _transition_exprAction__printDocuments_transitions2_actions0() {
    try {
      
      this.clerk.printDocument("dokument2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.printDocument(\"dokument2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printDocuments_transitions2_effect_state() {
    _test__printDocuments_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions2_effect_state_objectTests0_test() {
    
    List<String> _printHistory = this.printer.getPrintHistory(this.clerk);
    String _get = _printHistory.get(1);
    assertEquals("printer.getPrintHistory(clerk).get(1) == \"dokument2\" failed after clerk.printDocument(\"dokument2\")", "dokument2", _get);
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 2 failed after clerk.printDocument(\"dokument2\")", 2, _taskCount);
    
    List<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk);
    int _size = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk).size == 2 failed after clerk.printDocument(\"dokument2\")", 2, _size);
    
  }
  
  private void _test__taskCount_transitions0_effect_state() {
    _test__taskCount_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions0_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
  }
  
  private void _transition_exprAction__taskCount_transitions1_actions0() {
    try {
      
      this.clerk.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__taskCount_transitions1_effect_state() {
    _test__taskCount_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions1_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 1 failed after clerk.printDocument(\"dokument1\")", 1, _taskCount);
    
  }
  
  private void _transition_exprAction__taskCount_transitions2_actions0() {
    try {
      
      final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
        public Double apply(final Double x, final Double y) {
          return Double.valueOf(DoubleExtensions.operator_plus(x, y));
        }
      };
      this.clerk.doCalculations(_function, 2.0, 3.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.doCalculations([x, y | x + y ], 2.0, 3.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__taskCount_transitions2_effect_state() {
    _test__taskCount_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions2_effect_state_objectTests0_test() {
    
    int _taskCount = this.clerk.taskCount();
    assertEquals("clerk.taskCount == 2 failed after clerk.doCalculations([x, y | x + y ], 2.0, 3.5)", 2, _taskCount);
    
  }
  
  private void _test__resourceCount_transitions0_effect_state() {
    _test__resourceCount_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__resourceCount_transitions0_effect_state_objectTests0_test() {
    
    int _resourceCount = this.clerk.resourceCount();
    assertEquals("clerk.resourceCount == 1 failed", 1, _resourceCount);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(ClerkTest.class);
  }
}
