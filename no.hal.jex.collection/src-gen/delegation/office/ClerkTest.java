package delegation.office;

import delegation.office.Clerk;
import delegation.office.Printer;
import java.util.Collection;
import java.util.function.BinaryOperator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.Conversions;

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
  
  @JExercise(tests = "Clerk(delegation.office.Printer);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gj\u00F8r en beregning: clerk.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5</li>\n\t\t<li>Gj\u00F8r en beregning: clerk.doCalculations([double x, double y | x / y ], 2.0, 4.0) ?= 0.5</li>\n\t\t</ul>\n")
  public void testDoCalculations() {
    _test__doCalculations_transitions0_effects0_state();
    _transition_exprAction__doCalculations_transitions1_actions0();
    _test__doCalculations_transitions1_effects0_state();
    _transition_exprAction__doCalculations_transitions2_actions0();
    _test__doCalculations_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer);void printDocument(String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer et dokument: clerk.printDocument(\"dokument1\")</li>\n\t\t<li>Printer et dokument: clerk.printDocument(\"dokument2\")</li>\n\t\t</ul>\n")
  public void testPrintDocuments() {
    _test__printDocuments_transitions0_effects0_state();
    _transition_exprAction__printDocuments_transitions1_actions0();
    _test__printDocuments_transitions1_effects0_state();
    _transition_exprAction__printDocuments_transitions2_actions0();
    _test__printDocuments_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer);void printDocument(String);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer et dokument: clerk.printDocument(\"dokument1\")</li>\n\t\t<li>Gj\u00F8r en beregning: clerk.doCalculations([double x, double y | x + y ], 2.0, 3.5)</li>\n\t\t</ul>\n")
  public void testTaskCount() {
    _test__taskCount_transitions0_effects0_state();
    _transition_exprAction__taskCount_transitions1_actions0();
    _test__taskCount_transitions1_effects0_state();
    _transition_exprAction__taskCount_transitions2_actions0();
    _test__taskCount_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "Clerk(delegation.office.Printer)", description = "Tests \n\t\tinitialization\n")
  public void testResourceCount() {
    _test__resourceCount_transitions0_effects0_state();
    
  }
  
  private void _test__doCalculations_transitions0_effects0_state() {
    _test__doCalculations_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions0_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
  }
  
  private void _transition_exprAction__doCalculations_transitions1_actions0() {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      @Override
      public Double apply(final Double x, final Double y) {
        return Double.valueOf((x + y));
      }
    };
    double _doCalculations = this.clerk.doCalculations(_function, 2.0, 3.5);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 5.5);
    assertTrue("clerk.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__doCalculations_transitions1_effects0_state() {
    _test__doCalculations_transitions1_effects0_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions1_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 1 failed after clerk.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5", 1, _taskCount);
    
  }
  
  private void _transition_exprAction__doCalculations_transitions2_actions0() {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      @Override
      public Double apply(final Double x, final Double y) {
        return Double.valueOf((x / y));
      }
    };
    double _doCalculations = this.clerk.doCalculations(_function, 2.0, 4.0);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 0.5);
    assertTrue("clerk.doCalculations([double x, double y | x / y ], 2.0, 4.0) ?= 0.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__doCalculations_transitions2_effects0_state() {
    _test__doCalculations_transitions2_effects0_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions2_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 2 failed after clerk.doCalculations([double x, double y | x / y ], 2.0, 4.0) ?= 0.5", 2, _taskCount);
    
  }
  
  private void _test__printDocuments_transitions0_effects0_state() {
    _test__printDocuments_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions0_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
  }
  
  private void _transition_exprAction__printDocuments_transitions1_actions0() {
    try {
      
      this.clerk.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printDocuments_transitions1_effects0_state() {
    _test__printDocuments_transitions1_effects0_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions1_effects0_state_objectTests0_test() {
    
    Collection<String> _printHistory = this.printer.getPrintHistory(this.clerk);
    String _get = ((String[])Conversions.unwrapArray(_printHistory, String.class))[0];
    assertEquals("printer.getPrintHistory(clerk).get(0) == \"dokument1\" failed after clerk.printDocument(\"dokument1\")", "dokument1", _get);
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 1 failed after clerk.printDocument(\"dokument1\")", 1, _taskCount);
    
    Collection<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk);
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
  
  private void _test__printDocuments_transitions2_effects0_state() {
    _test__printDocuments_transitions2_effects0_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions2_effects0_state_objectTests0_test() {
    
    Collection<String> _printHistory = this.printer.getPrintHistory(this.clerk);
    String _get = ((String[])Conversions.unwrapArray(_printHistory, String.class))[1];
    assertEquals("printer.getPrintHistory(clerk).get(1) == \"dokument2\" failed after clerk.printDocument(\"dokument2\")", "dokument2", _get);
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 2 failed after clerk.printDocument(\"dokument2\")", 2, _taskCount);
    
    Collection<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk);
    int _size = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk).size == 2 failed after clerk.printDocument(\"dokument2\")", 2, _size);
    
  }
  
  private void _test__taskCount_transitions0_effects0_state() {
    _test__taskCount_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions0_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
  }
  
  private void _transition_exprAction__taskCount_transitions1_actions0() {
    try {
      
      this.clerk.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__taskCount_transitions1_effects0_state() {
    _test__taskCount_transitions1_effects0_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions1_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 1 failed after clerk.printDocument(\"dokument1\")", 1, _taskCount);
    
  }
  
  private void _transition_exprAction__taskCount_transitions2_actions0() {
    try {
      
      final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
        @Override
        public Double apply(final Double x, final Double y) {
          return Double.valueOf((x + y));
        }
      };
      this.clerk.doCalculations(_function, 2.0, 3.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("clerk.doCalculations([double x, double y | x + y ], 2.0, 3.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__taskCount_transitions2_effects0_state() {
    _test__taskCount_transitions2_effects0_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions2_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 2 failed after clerk.doCalculations([double x, double y | x + y ], 2.0, 3.5)", 2, _taskCount);
    
  }
  
  private void _test__resourceCount_transitions0_effects0_state() {
    _test__resourceCount_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__resourceCount_transitions0_effects0_state_objectTests0_test() {
    
    int _resourceCount = this.clerk.getResourceCount();
    assertEquals("clerk.resourceCount == 1 failed", 1, _resourceCount);
    
  }
}
