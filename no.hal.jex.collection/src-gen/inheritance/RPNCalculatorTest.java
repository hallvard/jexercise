package inheritance;

import inheritance.RPNCalculator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.RPNCalculator")
@SuppressWarnings("all")
public class RPNCalculatorTest extends TestCase {
  private RPNCalculator rPNCalculator;
  
  @Override
  protected void setUp() {
    rPNCalculator = new RPNCalculator();
    
  }
  
  private boolean operator_equals(final double d1, final double d2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      _xblockexpression = ((d1 >= (d2 - epsilon)) && (d1 <= (d2 + epsilon)));
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "RPNCalculator();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Tester \u00E5 legge sammen to tall</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>takeInputNumber(2.5)</li>\n\t\t<li>takeInputNumber(1.2)</li>\n\t\t<li>takeInputOperator(\'+\')</li>\n\t\t</ul>\n")
  public void testSimpleAddition() {
    _test__simpleAddition_transitions0_source_state(rPNCalculator);
    _transition_exprAction__simpleAddition_transitions0_actions0(rPNCalculator);
    _test__simpleAddition_transitions0_effect_state(rPNCalculator);
    _transition_exprAction__simpleAddition_transitions1_actions0(rPNCalculator);
    _test__simpleAddition_transitions1_effect_state(rPNCalculator);
    _transition_exprAction__simpleAddition_transitions2_actions0(rPNCalculator);
    _test__simpleAddition_transitions2_effect_state(rPNCalculator);
    
  }
  
  @JExercise(tests = "RPNCalculator();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Regner ut ((1.1 + 2.1) * (7.0 / 2.0)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>takeInputNumber(2.1), takeInputNumber(1.1), takeInputOperator(\'+\')</li>\n\t\t<li>takeInputNumber(7.0)</li>\n\t\t<li>getOutput()</li>\n\t\t<li>takeInputNumber(2.0)</li>\n\t\t<li>getOutput()</li>\n\t\t<li>takeInputOperator(\'/\')</li>\n\t\t<li>takeInputOperator(\'*\')</li>\n\t\t</ul>\n")
  public void testComplexCalculation() {
    _transition_exprAction__complexCalculation_transitions0_actions0(rPNCalculator);
    _transition_exprAction__complexCalculation_transitions0_actions1(rPNCalculator);
    _transition_exprAction__complexCalculation_transitions0_actions2(rPNCalculator);
    _test__complexCalculation_transitions0_effect_state(rPNCalculator);
    _transition_exprAction__complexCalculation_transitions1_actions0(rPNCalculator);
    _test__complexCalculation_transitions1_effect_state(rPNCalculator);
    try {
      _transition_exprAction__complexCalculation_transitions2_actions0(rPNCalculator);
      fail("IllegalStateException should be thrown after getOutput()");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after getOutput()", e instanceof IllegalStateException);
    }
    _transition_exprAction__complexCalculation_transitions3_actions0(rPNCalculator);
    _test__complexCalculation_transitions3_effect_state(rPNCalculator);
    try {
      _transition_exprAction__complexCalculation_transitions4_actions0(rPNCalculator);
      fail("IllegalStateException should be thrown after getOutput()");
    } catch (Exception e_1) {
      assertTrue("IllegalStateException should be thrown after getOutput()", e_1 instanceof IllegalStateException);
    }
    _transition_exprAction__complexCalculation_transitions5_actions0(rPNCalculator);
    _test__complexCalculation_transitions5_effect_state(rPNCalculator);
    _transition_exprAction__complexCalculation_transitions6_actions0(rPNCalculator);
    _test__complexCalculation_transitions6_effect_state(rPNCalculator);
    
  }
  
  private void _test__simpleAddition_transitions0_source_state(final RPNCalculator it) {
    _test__simpleAddition_transitions0_source_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__simpleAddition_transitions0_source_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(2.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleAddition_transitions0_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputNumber(2.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleAddition_transitions0_effect_state(final RPNCalculator it) {
    _test__simpleAddition_transitions0_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__simpleAddition_transitions0_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(2.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleAddition_transitions1_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputNumber(1.2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(1.2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleAddition_transitions1_effect_state(final RPNCalculator it) {
    _test__simpleAddition_transitions1_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__simpleAddition_transitions1_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(1.2)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleAddition_transitions2_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputOperator('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleAddition_transitions2_effect_state(final RPNCalculator it) {
    _test__simpleAddition_transitions2_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__simpleAddition_transitions2_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputOperator('+')", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 3.7 failed after takeInputOperator('+')", this.operator_equals(_output, 3.7));
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions0_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputNumber(2.1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions0_actions1(final RPNCalculator it) {
    try {
      
      it.takeInputNumber(1.1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(1.1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions0_actions2(final RPNCalculator it) {
    try {
      
      it.takeInputOperator('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__complexCalculation_transitions0_effect_state(final RPNCalculator it) {
    _test__complexCalculation_transitions0_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__complexCalculation_transitions0_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(2.1) ,takeInputNumber(1.1) ,takeInputOperator('+')", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 3.2 failed after takeInputNumber(2.1) ,takeInputNumber(1.1) ,takeInputOperator('+')", this.operator_equals(_output, 3.2));
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions1_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputNumber(7.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(7.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__complexCalculation_transitions1_effect_state(final RPNCalculator it) {
    _test__complexCalculation_transitions1_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__complexCalculation_transitions1_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(7.0)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions2_actions0(final RPNCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput() failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions3_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputNumber(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__complexCalculation_transitions3_effect_state(final RPNCalculator it) {
    _test__complexCalculation_transitions3_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__complexCalculation_transitions3_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(2.0)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions4_actions0(final RPNCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput() failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions5_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputOperator('/');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('/') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__complexCalculation_transitions5_effect_state(final RPNCalculator it) {
    _test__complexCalculation_transitions5_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__complexCalculation_transitions5_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputOperator('/')", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 3.5 failed after takeInputOperator('/')", this.operator_equals(_output, 3.5));
    
  }
  
  private void _transition_exprAction__complexCalculation_transitions6_actions0(final RPNCalculator it) {
    try {
      
      it.takeInputOperator('*');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('*') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__complexCalculation_transitions6_effect_state(final RPNCalculator it) {
    _test__complexCalculation_transitions6_effect_state_objectTests0_test(rPNCalculator);
    
  }
  
  private void _test__complexCalculation_transitions6_effect_state_objectTests0_test(final RPNCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputOperator('*')", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 11.2 failed after takeInputOperator('*')", this.operator_equals(_output, 11.2));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(RPNCalculatorTest.class);
  }
}
