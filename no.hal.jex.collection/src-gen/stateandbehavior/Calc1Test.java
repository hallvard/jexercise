package stateandbehavior;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import stateandbehavior.Calc1;

@JExercise(description = "Tests stateandbehavior.Calc1")
@SuppressWarnings("all")
public class Calc1Test extends TestCase {
  private Calc1 calc1;
  
  @Override
  protected void setUp() {
    calc1 = new Calc1();
    
  }
  
  private boolean operator_equals(final double d1, final double d2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      boolean _and = false;
      double _minus = (d2 - epsilon);
      boolean _greaterEqualsThan = (d1 >= _minus);
      if (!_greaterEqualsThan) {
        _and = false;
      } else {
        double _plus = (d2 + epsilon);
        boolean _lessEqualsThan = (d1 <= _plus);
        _and = (_greaterEqualsThan && _lessEqualsThan);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "Calc1()", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state(calc1);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double)", description = "<h3>Sett verdi</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Sett verdi til et tilfeldig tall: value = random</li>\n\t\t</ul>\n")
  public void testSetValue() {
    double random = _init__setValue_random();
    _transition_exprAction__setValue_transitions0_actions0(calc1, random);
    _test__setValue_transitions0_effect_state(calc1, random);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double);void add(double)", description = "<h3>Addisjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Addisjon med to tilfeldige tall: value = random1, add(random2)</li>\n\t\t</ul>\n")
  public void testAdd() {
    double random1 = _init__add_random1();
    double random2 = _init__add_random2();
    _transition_exprAction__add_transitions0_actions0(calc1, random1, random2);
    _transition_exprAction__add_transitions0_actions1(calc1, random1, random2);
    _test__add_transitions0_effect_state(calc1, random1, random2);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double);void subtract(double)", description = "<h3>Subtraksjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Subtraksjon med to tilfeldige tall: value = random1, subtract(random2)</li>\n\t\t</ul>\n")
  public void testSubtract() {
    double random1 = _init__subtract_random1();
    double random2 = _init__subtract_random2();
    _transition_exprAction__subtract_transitions0_actions0(calc1, random1, random2);
    _transition_exprAction__subtract_transitions0_actions1(calc1, random1, random2);
    _test__subtract_transitions0_effect_state(calc1, random1, random2);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double);void multiply(double)", description = "<h3>Multiplikasjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Multiplikasjon med to tilfeldige tall: value = random1, multiply(random2)</li>\n\t\t</ul>\n")
  public void testMultiply() {
    double random1 = _init__multiply_random1();
    double random2 = _init__multiply_random2();
    _transition_exprAction__multiply_transitions0_actions0(calc1, random1, random2);
    _transition_exprAction__multiply_transitions0_actions1(calc1, random1, random2);
    _test__multiply_transitions0_effect_state(calc1, random1, random2);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double);void divide(double)", description = "<h3>Divisjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Divisjon med to tilfeldige tall: value = random1, divide(random2)</li>\n\t\t</ul>\n")
  public void testDivide() {
    double random1 = _init__divide_random1();
    double random2 = _init__divide_random2();
    _transition_exprAction__divide_transitions0_actions0(calc1, random1, random2);
    _transition_exprAction__divide_transitions0_actions1(calc1, random1, random2);
    _test__divide_transitions0_effect_state(calc1, random1, random2);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double);void percent(double)", description = "<h3>Prosent</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Tilfeldig prosent av et tilfeldige tall: value = random1, percent(random2)</li>\n\t\t</ul>\n")
  public void testPercent() {
    double random1 = _init__percent_random1();
    double random2 = _init__percent_random2();
    _transition_exprAction__percent_transitions0_actions0(calc1, random1, random2);
    _transition_exprAction__percent_transitions0_actions1(calc1, random1, random2);
    _test__percent_transitions0_effect_state(calc1, random1, random2);
    
  }
  
  @JExercise(tests = "Calc1();void setValue(double);void negate()", description = "<h3>Negasjon</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Negasjon av et tilfeldige tall: value = random1, negate</li>\n\t\t</ul>\n")
  public void testNegate() {
    double random1 = _init__negate_random1();
    _transition_exprAction__negate_transitions0_actions0(calc1, random1);
    _transition_exprAction__negate_transitions0_actions1(calc1, random1);
    _test__negate_transitions0_effect_state(calc1, random1);
    
  }
  
  @JExercise(tests = "Calc1();void pi()", description = "<h3>Pi</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>pi</li>\n\t\t</ul>\n")
  public void testPi() {
    _transition_exprAction__pi_transitions0_actions0(calc1);
    _test__pi_transitions0_effect_state(calc1);
    
  }
  
  private void _test__constructor_transitions0_effect_state(final Calc1 it) {
    _test__constructor_transitions0_effect_state_objectTests0_test(calc1);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final Calc1 it) {
    
    double _value = it.getValue();
    boolean _equals = this.operator_equals(_value, 0.0d);
    assertTrue("value == 0.0d failed", _equals);
    
  }
  
  private double _init__setValue_random() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__setValue_transitions0_actions0(final Calc1 it, final double random) {
    try {
      
      it.setValue(random);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random failed: " + error.getMessage());
    }
    
  }
  
  private void _test__setValue_transitions0_effect_state(final Calc1 it, final double random) {
    _test__setValue_transitions0_effect_state_objectTests0_test(calc1, random);
    
  }
  
  private void _test__setValue_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random) {
    
    double _value = it.getValue();
    boolean _equals = this.operator_equals(_value, random);
    assertTrue("value == random failed after value = random", _equals);
    
  }
  
  private double _init__add_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__add_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__add_transitions0_actions0(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.setValue(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random1 failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__add_transitions0_actions1(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.add(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("add(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__add_transitions0_effect_state(final Calc1 it, final double random1, final double random2) {
    _test__add_transitions0_effect_state_objectTests0_test(calc1, random1, random2);
    
  }
  
  private void _test__add_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random1, final double random2) {
    
    double _value = it.getValue();
    double _plus = (random1 + random2);
    boolean _equals = this.operator_equals(_value, _plus);
    assertTrue("value == random1 + random2 failed after value = random1 ,add(random2)", _equals);
    
  }
  
  private double _init__subtract_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__subtract_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__subtract_transitions0_actions0(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.setValue(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random1 failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__subtract_transitions0_actions1(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.subtract(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("subtract(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__subtract_transitions0_effect_state(final Calc1 it, final double random1, final double random2) {
    _test__subtract_transitions0_effect_state_objectTests0_test(calc1, random1, random2);
    
  }
  
  private void _test__subtract_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random1, final double random2) {
    
    double _value = it.getValue();
    double _minus = (random1 - random2);
    boolean _equals = this.operator_equals(_value, _minus);
    assertTrue("value == random1 - random2 failed after value = random1 ,subtract(random2)", _equals);
    
  }
  
  private double _init__multiply_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__multiply_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__multiply_transitions0_actions0(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.setValue(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random1 failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__multiply_transitions0_actions1(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.multiply(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("multiply(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__multiply_transitions0_effect_state(final Calc1 it, final double random1, final double random2) {
    _test__multiply_transitions0_effect_state_objectTests0_test(calc1, random1, random2);
    
  }
  
  private void _test__multiply_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random1, final double random2) {
    
    double _value = it.getValue();
    double _multiply = (random1 * random2);
    boolean _equals = this.operator_equals(_value, _multiply);
    assertTrue("value == random1 * random2 failed after value = random1 ,multiply(random2)", _equals);
    
  }
  
  private double _init__divide_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__divide_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    double _plus = (_multiply + 1);
    return _plus;
  }
  
  private void _transition_exprAction__divide_transitions0_actions0(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.setValue(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random1 failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__divide_transitions0_actions1(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.divide(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("divide(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__divide_transitions0_effect_state(final Calc1 it, final double random1, final double random2) {
    _test__divide_transitions0_effect_state_objectTests0_test(calc1, random1, random2);
    
  }
  
  private void _test__divide_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random1, final double random2) {
    
    double _value = it.getValue();
    double _divide = (random1 / random2);
    boolean _equals = this.operator_equals(_value, _divide);
    assertTrue("value == random1 / random2 failed after value = random1 ,divide(random2)", _equals);
    
  }
  
  private double _init__percent_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__percent_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__percent_transitions0_actions0(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.setValue(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random1 failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__percent_transitions0_actions1(final Calc1 it, final double random1, final double random2) {
    try {
      
      it.percent(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("percent(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__percent_transitions0_effect_state(final Calc1 it, final double random1, final double random2) {
    _test__percent_transitions0_effect_state_objectTests0_test(calc1, random1, random2);
    
  }
  
  private void _test__percent_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random1, final double random2) {
    
    double _value = it.getValue();
    double _multiply = (random1 * random2);
    double _divide = (_multiply / 100);
    boolean _equals = this.operator_equals(_value, _divide);
    assertTrue("value == random1 * random2 / 100 failed after value = random1 ,percent(random2)", _equals);
    
  }
  
  private double _init__negate_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__negate_transitions0_actions0(final Calc1 it, final double random1) {
    try {
      
      it.setValue(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("value = random1 failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__negate_transitions0_actions1(final Calc1 it, final double random1) {
    try {
      
      it.negate();
      } catch (junit.framework.AssertionFailedError error) {
      fail("negate failed: " + error.getMessage());
    }
    
  }
  
  private void _test__negate_transitions0_effect_state(final Calc1 it, final double random1) {
    _test__negate_transitions0_effect_state_objectTests0_test(calc1, random1);
    
  }
  
  private void _test__negate_transitions0_effect_state_objectTests0_test(final Calc1 it, final double random1) {
    
    double _value = it.getValue();
    double _minus = (-random1);
    boolean _equals = this.operator_equals(_value, _minus);
    assertTrue("value == -random1 failed after value = random1 ,negate", _equals);
    
  }
  
  private void _transition_exprAction__pi_transitions0_actions0(final Calc1 it) {
    try {
      
      it.pi();
      } catch (junit.framework.AssertionFailedError error) {
      fail("pi failed: " + error.getMessage());
    }
    
  }
  
  private void _test__pi_transitions0_effect_state(final Calc1 it) {
    _test__pi_transitions0_effect_state_objectTests0_test(calc1);
    
  }
  
  private void _test__pi_transitions0_effect_state_objectTests0_test(final Calc1 it) {
    
    double _value = it.getValue();
    boolean _equals = this.operator_equals(_value, Math.PI);
    assertTrue("value == Math.PI failed after pi", _equals);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(Calc1Test.class);
  }
}
