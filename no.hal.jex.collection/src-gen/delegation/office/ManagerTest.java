package delegation.office;

import delegation.office.Clerk;
import delegation.office.Employee;
import delegation.office.Manager;
import delegation.office.Printer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.Conversions;

@JExercise(description = "Tests delegation.office.Manager")
@SuppressWarnings("all")
public class ManagerTest extends TestCase {
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
  
  private Clerk secondClerk;
  
  private Clerk _init_secondClerk() {
    Clerk _clerk = new Clerk(this.printer);
    return _clerk;
  }
  
  private Manager manager;
  
  private Manager _init_manager() {
    List<Employee> _asList = Arrays.<Employee>asList(this.clerk);
    Manager _manager = new Manager(_asList);
    return _manager;
  }
  
  @Override
  protected void setUp() {
    printer = _init_printer();
    clerk = _init_clerk();
    secondClerk = _init_secondClerk();
    manager = _init_manager();
    
  }
  
  private boolean operator_assertEquals(final double first, final double second) {
    TestCase.assertEquals(first, second, 0.000001d);
    return true;
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Lager Manager med tom Employee-samling: new Manager(new ArrayList<Employee>)</li>\n\t\t</ul>\n")
  public void testNoEmployeesConstructor() {
    try {
      _transition_exprAction__noEmployeesConstructor_transitions0_actions0();
      fail("IllegalArgumentException should be thrown after new Manager(new ArrayList<Employee>)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after new Manager(new ArrayList<Employee>)", e instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>);int getResourceCount()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Sjekker getResourceCount uten mellomledere: manager.resourceCount == 2</li>\n\t\t</ul>\n")
  public void testResourceCount() {
    _transition_exprAction__resourceCount_transitions0_actions0();
    _test__resourceCount_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>);int getResourceCount()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Sjekker getResourceCount med mellomleder: topManager.resourceCount == 3</li>\n\t\t</ul>\n")
  public void testMiddleManagementResourceCounts() {
    Manager topManager = _init__middleManagementResourceCounts_topManager();
    _transition_exprAction__middleManagementResourceCounts_transitions0_actions0(topManager);
    _test__middleManagementResourceCounts_transitions0_effects0_state(topManager);
    
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gj\u00F8r en beregning: manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5</li>\n\t\t</ul>\n")
  public void testDoCalculations() {
    _test__doCalculations_transitions0_effects0_state();
    _transition_exprAction__doCalculations_transitions1_actions0();
    _test__doCalculations_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>);void printDocument(String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer et dokument: manager.printDocument(\"dokument1\")</li>\n\t\t</ul>\n")
  public void testPrintDocuments() {
    _transition_exprAction__printDocuments_transitions0_actions0();
    _test__printDocuments_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>);void printDocument(String);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer et dokument: manager.printDocument(\"dokument\")</li>\n\t\t<li>Gj\u00F8r en beregning: manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5</li>\n\t\t</ul>\n")
  public void testTaskCount() {
    _test__taskCount_transitions0_effects0_state();
    _transition_exprAction__taskCount_transitions1_actions0();
    _test__taskCount_transitions1_effects0_state();
    _transition_exprAction__taskCount_transitions2_actions0();
    _test__taskCount_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "Manager(java.util.Collection<delegation.office.Employee>);void printDocument(String);double doCalculations(java.util.function.BinaryOperator<Double>,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Printer et dokument: multiManager.printDocument(\"dokument\")</li>\n\t\t<li>Gj\u00F8r en beregning: multiManager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5</li>\n\t\t</ul>\n")
  public void testSeveralClerks() {
    Manager multiManager = _init__severalClerks_multiManager();
    _test__severalClerks_transitions0_effects0_state(multiManager);
    _transition_exprAction__severalClerks_transitions1_actions0(multiManager);
    _test__severalClerks_transitions1_effects0_state(multiManager);
    _transition_exprAction__severalClerks_transitions2_actions0(multiManager);
    _test__severalClerks_transitions2_effects0_state(multiManager);
    
  }
  
  private void _transition_exprAction__noEmployeesConstructor_transitions0_actions0() {
    try {
      
      ArrayList<Employee> _arrayList = new ArrayList<Employee>();
      new Manager(_arrayList);
      } catch (junit.framework.AssertionFailedError error) {
      fail("new Manager(new ArrayList<Employee>) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__resourceCount_transitions0_actions0() {
    
    int _resourceCount = this.manager.getResourceCount();
    assertEquals("manager.resourceCount == 2 failed", 2, _resourceCount);
    
  }
  
  private void _test__resourceCount_transitions0_effects0_state() {
    _test__resourceCount_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__resourceCount_transitions0_effects0_state_objectTests0_test() {
    
  }
  
  private Manager _init__middleManagementResourceCounts_topManager() {
    List<Employee> _asList = Arrays.<Employee>asList(this.manager);
    Manager _manager = new Manager(_asList);
    return _manager;
  }
  
  private void _transition_exprAction__middleManagementResourceCounts_transitions0_actions0(final Manager topManager) {
    
    int _resourceCount = topManager.getResourceCount();
    assertEquals("topManager.resourceCount == 3 failed", 3, _resourceCount);
    
  }
  
  private void _test__middleManagementResourceCounts_transitions0_effects0_state(final Manager topManager) {
    _test__middleManagementResourceCounts_transitions0_effects0_state_objectTests0_test(topManager);
    
  }
  
  private void _test__middleManagementResourceCounts_transitions0_effects0_state_objectTests0_test(final Manager topManager) {
    
  }
  
  private void _test__doCalculations_transitions0_effects0_state() {
    _test__doCalculations_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions0_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount);
    
    int _taskCount_1 = this.manager.getTaskCount();
    assertEquals("manager.taskCount == 0 failed", 0, _taskCount_1);
    
  }
  
  private void _transition_exprAction__doCalculations_transitions1_actions0() {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      @Override
      public Double apply(final Double x, final Double y) {
        return Double.valueOf((x + y));
      }
    };
    double _doCalculations = this.manager.doCalculations(_function, 2.0, 3.5);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 5.5);
    assertTrue("manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__doCalculations_transitions1_effects0_state() {
    _test__doCalculations_transitions1_effects0_state_objectTests0_test();
    
  }
  
  private void _test__doCalculations_transitions1_effects0_state_objectTests0_test() {
    
    int _taskCount = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 1 failed after manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5", 1, _taskCount);
    
    int _taskCount_1 = this.manager.getTaskCount();
    assertEquals("manager.taskCount == 1 failed after manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5", 1, _taskCount_1);
    
  }
  
  private void _transition_exprAction__printDocuments_transitions0_actions0() {
    try {
      
      this.manager.printDocument("dokument1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("manager.printDocument(\"dokument1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__printDocuments_transitions0_effects0_state() {
    _test__printDocuments_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__printDocuments_transitions0_effects0_state_objectTests0_test() {
    
    Collection<String> _printHistory = this.printer.getPrintHistory(this.clerk);
    String _get = ((String[])Conversions.unwrapArray(_printHistory, String.class))[0];
    assertEquals("printer.getPrintHistory(clerk).get(0) == \"dokument1\" failed after manager.printDocument(\"dokument1\")", "dokument1", _get);
    
    int _taskCount = this.manager.getTaskCount();
    assertEquals("manager.taskCount == 1 failed after manager.printDocument(\"dokument1\")", 1, _taskCount);
    
    int _taskCount_1 = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 1 failed after manager.printDocument(\"dokument1\")", 1, _taskCount_1);
    
    Collection<String> _printHistory_1 = this.printer.getPrintHistory(this.clerk);
    int _size = _printHistory_1.size();
    assertEquals("printer.getPrintHistory(clerk).size == 1 failed after manager.printDocument(\"dokument1\")", 1, _size);
    
  }
  
  private void _test__taskCount_transitions0_effects0_state() {
    _test__taskCount_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions0_effects0_state_objectTests0_test() {
    
    int _taskCount = this.manager.getTaskCount();
    assertEquals("manager.taskCount == 0 failed", 0, _taskCount);
    
    int _taskCount_1 = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 0 failed", 0, _taskCount_1);
    
  }
  
  private void _transition_exprAction__taskCount_transitions1_actions0() {
    try {
      
      this.manager.printDocument("dokument");
      } catch (junit.framework.AssertionFailedError error) {
      fail("manager.printDocument(\"dokument\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__taskCount_transitions1_effects0_state() {
    _test__taskCount_transitions1_effects0_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions1_effects0_state_objectTests0_test() {
    
    int _taskCount = this.manager.getTaskCount();
    assertEquals("manager.taskCount == 1 failed after manager.printDocument(\"dokument\")", 1, _taskCount);
    
    int _taskCount_1 = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 1 failed after manager.printDocument(\"dokument\")", 1, _taskCount_1);
    
  }
  
  private void _transition_exprAction__taskCount_transitions2_actions0() {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      @Override
      public Double apply(final Double x, final Double y) {
        return Double.valueOf((x + y));
      }
    };
    double _doCalculations = this.manager.doCalculations(_function, 2.0, 3.5);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 5.5);
    assertTrue("manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__taskCount_transitions2_effects0_state() {
    _test__taskCount_transitions2_effects0_state_objectTests0_test();
    
  }
  
  private void _test__taskCount_transitions2_effects0_state_objectTests0_test() {
    
    int _taskCount = this.manager.getTaskCount();
    assertEquals("manager.taskCount == 2 failed after manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5", 2, _taskCount);
    
    int _taskCount_1 = this.clerk.getTaskCount();
    assertEquals("clerk.taskCount == 2 failed after manager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5", 2, _taskCount_1);
    
  }
  
  private Manager _init__severalClerks_multiManager() {
    List<Employee> _asList = Arrays.<Employee>asList(this.clerk, this.secondClerk);
    Manager _manager = new Manager(_asList);
    return _manager;
  }
  
  private void _test__severalClerks_transitions0_effects0_state(final Manager multiManager) {
    _test__severalClerks_transitions0_effects0_state_objectTests0_test(multiManager);
    
  }
  
  private void _test__severalClerks_transitions0_effects0_state_objectTests0_test(final Manager multiManager) {
    
    int _resourceCount = multiManager.getResourceCount();
    assertEquals("multiManager.resourceCount == 3 failed", 3, _resourceCount);
    
    int _resourceCount_1 = this.clerk.getResourceCount();
    assertEquals("clerk.resourceCount == 1 failed", 1, _resourceCount_1);
    
    int _resourceCount_2 = this.secondClerk.getResourceCount();
    assertEquals("secondClerk.resourceCount == 1 failed", 1, _resourceCount_2);
    
  }
  
  private void _transition_exprAction__severalClerks_transitions1_actions0(final Manager multiManager) {
    try {
      
      multiManager.printDocument("dokument");
      } catch (junit.framework.AssertionFailedError error) {
      fail("multiManager.printDocument(\"dokument\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__severalClerks_transitions1_effects0_state(final Manager multiManager) {
    _test__severalClerks_transitions1_effects0_state_objectTests0_test(multiManager);
    
  }
  
  private void _test__severalClerks_transitions1_effects0_state_objectTests0_test(final Manager multiManager) {
    
    int _taskCount = multiManager.getTaskCount();
    assertEquals("multiManager.taskCount == 1 failed after multiManager.printDocument(\"dokument\")", 1, _taskCount);
    
    assertTrue("(clerk.taskCount == 1 || secondClerk.taskCount == 1) && (clerk.taskCount == 0 || secondClerk.taskCount == 0) failed after multiManager.printDocument(\"dokument\")", (((this.clerk.getTaskCount() == 1) || (this.secondClerk.getTaskCount() == 1)) && ((this.clerk.getTaskCount() == 0) || (this.secondClerk.getTaskCount() == 0))));
    
  }
  
  private void _transition_exprAction__severalClerks_transitions2_actions0(final Manager multiManager) {
    
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      @Override
      public Double apply(final Double x, final Double y) {
        return Double.valueOf((x + y));
      }
    };
    double _doCalculations = multiManager.doCalculations(_function, 2.0, 3.5);
    boolean _assertEquals = this.operator_assertEquals(_doCalculations, 5.5);
    assertTrue("multiManager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__severalClerks_transitions2_effects0_state(final Manager multiManager) {
    _test__severalClerks_transitions2_effects0_state_objectTests0_test(multiManager);
    
  }
  
  private void _test__severalClerks_transitions2_effects0_state_objectTests0_test(final Manager multiManager) {
    
    int _taskCount = multiManager.getTaskCount();
    assertEquals("multiManager.taskCount == 2 failed after multiManager.doCalculations([double x, double y | x + y ], 2.0, 3.5) ?= 5.5", 2, _taskCount);
    
  }
}
