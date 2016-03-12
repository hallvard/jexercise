package inheritance;

import inheritance.SimpleCalculator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.SimpleCalculator")
@SuppressWarnings("all")
public class SimpleCalculatorTest extends TestCase {
  private SimpleCalculator simpleCalculator;
  
  @Override
  protected void setUp() {
    simpleCalculator = new SimpleCalculator();
    
  }
  
  private boolean operator_equals(final double d1, final double d2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      _xblockexpression = ((d1 >= (d2 - epsilon)) && (d1 <= (d2 + epsilon)));
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Tester enkel addisjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gir inn 3.5: takeInputNumber(3.5)</li>\n\t\t<li>Gir operator +: takeInputOperator(\'+\')</li>\n\t\t<li>Gir inn 4: takeInputNumber(4.0)</li>\n\t\t</ul>\n")
  public void testSimpleAddition() {
    _test__simpleAddition_transitions0_source_state(simpleCalculator);
    _transition_exprAction__simpleAddition_transitions0_actions0(simpleCalculator);
    _test__simpleAddition_transitions0_effect_state(simpleCalculator);
    _transition_exprAction__simpleAddition_transitions1_actions0(simpleCalculator);
    _test__simpleAddition_transitions1_effect_state(simpleCalculator);
    _transition_exprAction__simpleAddition_transitions2_actions0(simpleCalculator);
    _test__simpleAddition_transitions2_effect_state(simpleCalculator);
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Tester enkel subtraksjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gir inn 4.7: takeInputNumber(4.7)</li>\n\t\t<li>Gir operator -: takeInputOperator(\'-\')</li>\n\t\t<li>Gir inn 8.1: takeInputNumber(8.1)</li>\n\t\t</ul>\n")
  public void testSimpleSubtraction() {
    _test__simpleSubtraction_transitions0_source_state(simpleCalculator);
    _transition_exprAction__simpleSubtraction_transitions0_actions0(simpleCalculator);
    _test__simpleSubtraction_transitions0_effect_state(simpleCalculator);
    _transition_exprAction__simpleSubtraction_transitions1_actions0(simpleCalculator);
    _test__simpleSubtraction_transitions1_effect_state(simpleCalculator);
    _transition_exprAction__simpleSubtraction_transitions2_actions0(simpleCalculator);
    _test__simpleSubtraction_transitions2_effect_state(simpleCalculator);
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Tester enkel multiplikasjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gir inn 1.5: takeInputNumber(1.5)</li>\n\t\t<li>Gir operator *: takeInputOperator(\'*\')</li>\n\t\t<li>Gir inn 2: takeInputNumber(2.0)</li>\n\t\t</ul>\n")
  public void testSimpleMultiplication() {
    _test__simpleMultiplication_transitions0_source_state(simpleCalculator);
    _transition_exprAction__simpleMultiplication_transitions0_actions0(simpleCalculator);
    _test__simpleMultiplication_transitions0_effect_state(simpleCalculator);
    _transition_exprAction__simpleMultiplication_transitions1_actions0(simpleCalculator);
    _test__simpleMultiplication_transitions1_effect_state(simpleCalculator);
    _transition_exprAction__simpleMultiplication_transitions2_actions0(simpleCalculator);
    _test__simpleMultiplication_transitions2_effect_state(simpleCalculator);
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Tester enkel divisjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gir inn 11.5: takeInputNumber(10.5)</li>\n\t\t<li>Gir operator /: takeInputOperator(\'/\')</li>\n\t\t<li>Gir inn 3: takeInputNumber(3.0)</li>\n\t\t</ul>\n")
  public void testSimpleDivision() {
    _test__simpleDivision_transitions0_source_state(simpleCalculator);
    _transition_exprAction__simpleDivision_transitions0_actions0(simpleCalculator);
    _test__simpleDivision_transitions0_effect_state(simpleCalculator);
    _transition_exprAction__simpleDivision_transitions1_actions0(simpleCalculator);
    _test__simpleDivision_transitions1_effect_state(simpleCalculator);
    _transition_exprAction__simpleDivision_transitions2_actions0(simpleCalculator);
    _test__simpleDivision_transitions2_effect_state(simpleCalculator);
    
  }
  
  @JExercise(tests = "SimpleCalculator();double getOutput();void takeInputNumber(double);void takeInputOperator(char)", description = "<h3>Tester riktig h\u00E5ndtering av \u00E5 pr\u00F8ve \u00E5 hente resultatet for tidlig</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>getOutput</li>\n\t\t<li>Gir inn 2: takeInputNumber(2.0)</li>\n\t\t<li>getOutput</li>\n\t\t<li>Gir operator +: takeInputOperator(\'+\')</li>\n\t\t<li>getOutput</li>\n\t\t</ul>\n")
  public void testNoResult() {
    try {
      _transition_exprAction__noResult_transitions0_actions0(simpleCalculator);
      fail("IllegalStateException should be thrown after getOutput");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after getOutput", e instanceof IllegalStateException);
    }
    _transition_exprAction__noResult_transitions1_actions0(simpleCalculator);
    _test__noResult_transitions1_effect_state(simpleCalculator);
    try {
      _transition_exprAction__noResult_transitions2_actions0(simpleCalculator);
      fail("IllegalStateException should be thrown after getOutput");
    } catch (Exception e_1) {
      assertTrue("IllegalStateException should be thrown after getOutput", e_1 instanceof IllegalStateException);
    }
    _transition_exprAction__noResult_transitions3_actions0(simpleCalculator);
    _test__noResult_transitions3_effect_state(simpleCalculator);
    try {
      _transition_exprAction__noResult_transitions4_actions0(simpleCalculator);
      fail("IllegalStateException should be thrown after getOutput");
    } catch (Exception e_2) {
      assertTrue("IllegalStateException should be thrown after getOutput", e_2 instanceof IllegalStateException);
    }
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void setOperator(char)", description = "<h3>Tester riktig h\u00E5ndtering av udefinert operator</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Gir inn 3: takeInputNumber(3.0)</li>\n\t\t<li>Gir operator $: setOperator(\'$\')</li>\n\t\t</ul>\n")
  public void testIllegalOperator() {
    _transition_exprAction__illegalOperator_transitions0_actions0(simpleCalculator);
    _test__illegalOperator_transitions0_effect_state(simpleCalculator);
    try {
      _transition_exprAction__illegalOperator_transitions1_actions0(simpleCalculator);
      fail("IllegalArgumentException should be thrown after setOperator('$')");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after setOperator('$')", e instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double)", description = "<h3>Tester \u00E5 gi inn to tall p\u00E5 rad uten operator</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>takeInputNumber(5), takeInputNumber(4)</li>\n\t\t</ul>\n")
  public void testMissingOperator() {
    try {
      _transition_exprAction__missingOperator_transitions0_actions0(simpleCalculator);
      _transition_exprAction__missingOperator_transitions0_actions1(simpleCalculator);
      fail("IllegalStateException should be thrown after takeInputNumber(5), takeInputNumber(4)");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after takeInputNumber(5), takeInputNumber(4)", e instanceof IllegalStateException);
    }
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void takeInputOperator(char);double getOutput()", description = "<h3>Tester to regnestykker etter hverandre</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Regner ut 2.5 + 3.5: takeInputNumber(2.5), takeInputOperator(\'+\'), takeInputNumber(3.5)</li>\n\t\t<li>Gir inn 4.5: takeInputNumber(4.5)</li>\n\t\t<li>getOutput</li>\n\t\t<li>Gir operator *: takeInputOperator(\'*\')</li>\n\t\t<li>getOutput</li>\n\t\t<li>Gir inn 2: takeInputNumber(2)</li>\n\t\t</ul>\n")
  public void testTwoSeparateCalculations() {
    _transition_exprAction__twoSeparateCalculations_transitions0_actions0(simpleCalculator);
    _transition_exprAction__twoSeparateCalculations_transitions0_actions1(simpleCalculator);
    _transition_exprAction__twoSeparateCalculations_transitions0_actions2(simpleCalculator);
    _test__twoSeparateCalculations_transitions0_effect_state(simpleCalculator);
    _transition_exprAction__twoSeparateCalculations_transitions1_actions0(simpleCalculator);
    _test__twoSeparateCalculations_transitions1_effect_state(simpleCalculator);
    try {
      _transition_exprAction__twoSeparateCalculations_transitions2_actions0(simpleCalculator);
      fail("IllegalStateException should be thrown after getOutput");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after getOutput", e instanceof IllegalStateException);
    }
    _transition_exprAction__twoSeparateCalculations_transitions3_actions0(simpleCalculator);
    _test__twoSeparateCalculations_transitions3_effect_state(simpleCalculator);
    try {
      _transition_exprAction__twoSeparateCalculations_transitions4_actions0(simpleCalculator);
      fail("IllegalStateException should be thrown after getOutput");
    } catch (Exception e_1) {
      assertTrue("IllegalStateException should be thrown after getOutput", e_1 instanceof IllegalStateException);
    }
    _transition_exprAction__twoSeparateCalculations_transitions5_actions0(simpleCalculator);
    _test__twoSeparateCalculations_transitions5_effect_state(simpleCalculator);
    
  }
  
  @JExercise(tests = "SimpleCalculator();void takeInputNumber(double);void takeInputOperator(char);double getOutput()", description = "<h3>Tester sammenhengende regnestykker: (3.5+1.1)*2.5</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Regner ut 3.5 + 1.1: takeInputNumber(3.5), takeInputOperator(\'+\'), takeInputNumber(1.1)</li>\n\t\t<li>Gir operator *: takeInputOperator(\'*\')</li>\n\t\t<li>getOutput</li>\n\t\t<li>Gir inn 2.5: takeInputNumber(2.5)</li>\n\t\t</ul>\n")
  public void testChainedCalculation() {
    _transition_exprAction__chainedCalculation_transitions0_actions0(simpleCalculator);
    _transition_exprAction__chainedCalculation_transitions0_actions1(simpleCalculator);
    _transition_exprAction__chainedCalculation_transitions0_actions2(simpleCalculator);
    _test__chainedCalculation_transitions0_effect_state(simpleCalculator);
    _transition_exprAction__chainedCalculation_transitions1_actions0(simpleCalculator);
    _test__chainedCalculation_transitions1_effect_state(simpleCalculator);
    try {
      _transition_exprAction__chainedCalculation_transitions2_actions0(simpleCalculator);
      fail("IllegalStateException should be thrown after getOutput");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after getOutput", e instanceof IllegalStateException);
    }
    _transition_exprAction__chainedCalculation_transitions3_actions0(simpleCalculator);
    _test__chainedCalculation_transitions3_effect_state(simpleCalculator);
    
  }
  
  private void _test__simpleAddition_transitions0_source_state(final SimpleCalculator it) {
    _test__simpleAddition_transitions0_source_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleAddition_transitions0_source_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(3.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleAddition_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(3.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(3.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleAddition_transitions0_effect_state(final SimpleCalculator it) {
    _test__simpleAddition_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleAddition_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(3.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleAddition_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleAddition_transitions1_effect_state(final SimpleCalculator it) {
    _test__simpleAddition_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleAddition_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputOperator('+')", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleAddition_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleAddition_transitions2_effect_state(final SimpleCalculator it) {
    _test__simpleAddition_transitions2_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleAddition_transitions2_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(4.0)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 7.5 failed after takeInputNumber(4.0)", this.operator_equals(_output, 7.5));
    
  }
  
  private void _test__simpleSubtraction_transitions0_source_state(final SimpleCalculator it) {
    _test__simpleSubtraction_transitions0_source_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleSubtraction_transitions0_source_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(4.7)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleSubtraction_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(4.7);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(4.7) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleSubtraction_transitions0_effect_state(final SimpleCalculator it) {
    _test__simpleSubtraction_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleSubtraction_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(4.7)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleSubtraction_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('-');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('-') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleSubtraction_transitions1_effect_state(final SimpleCalculator it) {
    _test__simpleSubtraction_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleSubtraction_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputOperator('-')", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleSubtraction_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(8.1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(8.1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleSubtraction_transitions2_effect_state(final SimpleCalculator it) {
    _test__simpleSubtraction_transitions2_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleSubtraction_transitions2_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(8.1)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == -3.4 failed after takeInputNumber(8.1)", this.operator_equals(_output, (-3.4)));
    
  }
  
  private void _test__simpleMultiplication_transitions0_source_state(final SimpleCalculator it) {
    _test__simpleMultiplication_transitions0_source_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleMultiplication_transitions0_source_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(1.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleMultiplication_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(1.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(1.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleMultiplication_transitions0_effect_state(final SimpleCalculator it) {
    _test__simpleMultiplication_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleMultiplication_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(1.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleMultiplication_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('*');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('*') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleMultiplication_transitions1_effect_state(final SimpleCalculator it) {
    _test__simpleMultiplication_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleMultiplication_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputOperator('*')", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleMultiplication_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleMultiplication_transitions2_effect_state(final SimpleCalculator it) {
    _test__simpleMultiplication_transitions2_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleMultiplication_transitions2_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(2.0)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 3.0 failed after takeInputNumber(2.0)", this.operator_equals(_output, 3.0));
    
  }
  
  private void _test__simpleDivision_transitions0_source_state(final SimpleCalculator it) {
    _test__simpleDivision_transitions0_source_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleDivision_transitions0_source_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(10.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleDivision_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(10.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(10.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleDivision_transitions0_effect_state(final SimpleCalculator it) {
    _test__simpleDivision_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleDivision_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(10.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleDivision_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('/');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('/') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleDivision_transitions1_effect_state(final SimpleCalculator it) {
    _test__simpleDivision_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleDivision_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputOperator('/')", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__simpleDivision_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__simpleDivision_transitions2_effect_state(final SimpleCalculator it) {
    _test__simpleDivision_transitions2_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__simpleDivision_transitions2_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(3.0)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 3.5 failed after takeInputNumber(3.0)", this.operator_equals(_output, 3.5));
    
  }
  
  private void _transition_exprAction__noResult_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__noResult_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__noResult_transitions1_effect_state(final SimpleCalculator it) {
    _test__noResult_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__noResult_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
  }
  
  private void _transition_exprAction__noResult_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__noResult_transitions3_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__noResult_transitions3_effect_state(final SimpleCalculator it) {
    _test__noResult_transitions3_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__noResult_transitions3_effect_state_objectTests0_test(final SimpleCalculator it) {
    
  }
  
  private void _transition_exprAction__noResult_transitions4_actions0(final SimpleCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__illegalOperator_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__illegalOperator_transitions0_effect_state(final SimpleCalculator it) {
    _test__illegalOperator_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__illegalOperator_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
  }
  
  private void _transition_exprAction__illegalOperator_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.setOperator('$');
      } catch (junit.framework.AssertionFailedError error) {
      fail("setOperator('$') failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__missingOperator_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(5) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__missingOperator_transitions0_actions1(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(4);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(4) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(2.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions0_actions1(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions0_actions2(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(3.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(3.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__twoSeparateCalculations_transitions0_effect_state(final SimpleCalculator it) {
    _test__twoSeparateCalculations_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__twoSeparateCalculations_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(2.5) ,takeInputOperator('+') ,takeInputNumber(3.5)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 6 failed after takeInputNumber(2.5) ,takeInputOperator('+') ,takeInputNumber(3.5)", this.operator_equals(_output, 6));
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(4.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(4.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__twoSeparateCalculations_transitions1_effect_state(final SimpleCalculator it) {
    _test__twoSeparateCalculations_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__twoSeparateCalculations_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputNumber(4.5)", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions3_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('*');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('*') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__twoSeparateCalculations_transitions3_effect_state(final SimpleCalculator it) {
    _test__twoSeparateCalculations_transitions3_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__twoSeparateCalculations_transitions3_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputOperator('*')", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions4_actions0(final SimpleCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__twoSeparateCalculations_transitions5_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__twoSeparateCalculations_transitions5_effect_state(final SimpleCalculator it) {
    _test__twoSeparateCalculations_transitions5_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__twoSeparateCalculations_transitions5_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(2)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 9 failed after takeInputNumber(2)", this.operator_equals(_output, 9));
    
  }
  
  private void _transition_exprAction__chainedCalculation_transitions0_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(3.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(3.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__chainedCalculation_transitions0_actions1(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__chainedCalculation_transitions0_actions2(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(1.1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(1.1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__chainedCalculation_transitions0_effect_state(final SimpleCalculator it) {
    _test__chainedCalculation_transitions0_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__chainedCalculation_transitions0_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(3.5) ,takeInputOperator('+') ,takeInputNumber(1.1)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 4.6 failed after takeInputNumber(3.5) ,takeInputOperator('+') ,takeInputNumber(1.1)", this.operator_equals(_output, 4.6));
    
  }
  
  private void _transition_exprAction__chainedCalculation_transitions1_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputOperator('*');
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputOperator('*') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__chainedCalculation_transitions1_effect_state(final SimpleCalculator it) {
    _test__chainedCalculation_transitions1_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__chainedCalculation_transitions1_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("!hasOutput failed after takeInputOperator('*')", (!_hasOutput));
    
  }
  
  private void _transition_exprAction__chainedCalculation_transitions2_actions0(final SimpleCalculator it) {
    try {
      
      it.getOutput();
      } catch (junit.framework.AssertionFailedError error) {
      fail("getOutput failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__chainedCalculation_transitions3_actions0(final SimpleCalculator it) {
    try {
      
      it.takeInputNumber(2.5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("takeInputNumber(2.5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__chainedCalculation_transitions3_effect_state(final SimpleCalculator it) {
    _test__chainedCalculation_transitions3_effect_state_objectTests0_test(simpleCalculator);
    
  }
  
  private void _test__chainedCalculation_transitions3_effect_state_objectTests0_test(final SimpleCalculator it) {
    
    boolean _hasOutput = it.hasOutput();
    assertTrue("hasOutput failed after takeInputNumber(2.5)", _hasOutput);
    
    double _output = it.getOutput();
    assertTrue("output == 11.5 failed after takeInputNumber(2.5)", this.operator_equals(_output, 11.5));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(SimpleCalculatorTest.class);
  }
}
