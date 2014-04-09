package inheritance;

import inheritance.ForeldreSpar;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.ForeldreSpar")
@SuppressWarnings("all")
public class ForeldreSparTest extends TestCase {
  private ForeldreSpar foreldreSpar;
  
  private ForeldreSpar _init_foreldreSpar() {
    ForeldreSpar _foreldreSpar = new ForeldreSpar(0.04, 3);
    return _foreldreSpar;
  }
  
  @Override
  protected void setUp() {
    foreldreSpar = _init_foreldreSpar();
    
  }
  
  private boolean operator_equals(final double n1, final double n2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.0000001;
      boolean _and = false;
      double _minus = (n1 - epsilon);
      boolean _lessEqualsThan = (_minus <= n2);
      if (!_lessEqualsThan) {
        _and = false;
      } else {
        double _plus = (n1 + epsilon);
        boolean _greaterEqualsThan = (_plus >= n2);
        _and = (_lessEqualsThan && _greaterEqualsThan);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "ForeldreSpar(double,int);void withdraw(double);void endYearUpdate()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>foreldreSpar.deposit(10000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(-1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(10000.0)</li>\n\t\t<li>foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.endYearUpdate(), foreldreSpar.withdraw(1000.0)</li>\n\t\t</ul>\n")
  public void testWithdraw() {
    _transition_exprAction__withdraw_transitions0_actions0(foreldreSpar);
    _transition_exprAction__withdraw_transitions0_actions1(foreldreSpar);
    _test__withdraw_transitions0_effect_state(foreldreSpar);
    try {
      _transition_exprAction__withdraw_transitions1_actions0(foreldreSpar);
      fail("IllegalArgumentException should be thrown after foreldreSpar.withdraw(-1000.0)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after foreldreSpar.withdraw(-1000.0)", e instanceof IllegalArgumentException);
    }
    _test__withdraw_transitions2_effect_state(foreldreSpar);
    try {
      _transition_exprAction__withdraw_transitions3_actions0(foreldreSpar);
      fail("IllegalStateException should be thrown after foreldreSpar.withdraw(10000.0)");
    } catch (Exception e_1) {
      assertTrue("IllegalStateException should be thrown after foreldreSpar.withdraw(10000.0)", e_1 instanceof IllegalStateException);
    }
    _test__withdraw_transitions4_effect_state(foreldreSpar);
    try {
      _transition_exprAction__withdraw_transitions5_actions0(foreldreSpar);
      _transition_exprAction__withdraw_transitions5_actions1(foreldreSpar);
      _transition_exprAction__withdraw_transitions5_actions2(foreldreSpar);
      fail("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)");
    } catch (Exception e_2) {
      assertTrue("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)", e_2 instanceof IllegalStateException);
    }
    _test__withdraw_transitions6_effect_state(foreldreSpar);
    _transition_exprAction__withdraw_transitions7_actions0(foreldreSpar);
    _transition_exprAction__withdraw_transitions7_actions1(foreldreSpar);
    _test__withdraw_transitions7_effect_state(foreldreSpar);
    
  }
  
  @JExercise(tests = "ForeldreSpar(double,int);void withdraw(double);void endYearUpdate()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>foreldreSpar.deposit(10000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.endYearUpdate()</li>\n\t\t</ul>\n")
  public void testGetRemainingWithdrawals() {
    _transition_exprAction__getRemainingWithdrawals_transitions0_actions0(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions0_actions1(foreldreSpar);
    _test__getRemainingWithdrawals_transitions0_effect_state(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions1_actions0(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions1_actions1(foreldreSpar);
    _test__getRemainingWithdrawals_transitions1_effect_state(foreldreSpar);
    try {
      _transition_exprAction__getRemainingWithdrawals_transitions2_actions0(foreldreSpar);
      fail("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0)");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0)", e instanceof IllegalStateException);
    }
    _test__getRemainingWithdrawals_transitions3_effect_state(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions4_actions0(foreldreSpar);
    _test__getRemainingWithdrawals_transitions4_effect_state(foreldreSpar);
    
  }
  
  private void _transition_exprAction__withdraw_transitions0_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.deposit(10000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.deposit(10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__withdraw_transitions0_actions1(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions0_effect_state(final ForeldreSpar it) {
    _test__withdraw_transitions0_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions0_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    boolean _equals = this.operator_equals(_balance, 9000.0);
    assertTrue("foreldreSpar.getBalance() == 9000.0 failed after foreldreSpar.deposit(10000.0) ,foreldreSpar.withdraw(1000.0)", _equals);
    
  }
  
  private void _transition_exprAction__withdraw_transitions1_actions0(final ForeldreSpar it) {
    try {
      
      double _minus = (-1000.0);
      this.foreldreSpar.withdraw(_minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(-1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions2_effect_state(final ForeldreSpar it) {
    _test__withdraw_transitions2_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions2_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    boolean _equals = this.operator_equals(_balance, 9000.0);
    assertTrue("foreldreSpar.getBalance() == 9000.0 failed", _equals);
    
  }
  
  private void _transition_exprAction__withdraw_transitions3_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(10000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions4_effect_state(final ForeldreSpar it) {
    _test__withdraw_transitions4_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions4_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    boolean _equals = this.operator_equals(_balance, 9000.0);
    assertTrue("foreldreSpar.getBalance() == 9000.0 failed", _equals);
    
  }
  
  private void _transition_exprAction__withdraw_transitions5_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__withdraw_transitions5_actions1(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__withdraw_transitions5_actions2(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions6_effect_state(final ForeldreSpar it) {
    _test__withdraw_transitions6_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions6_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    boolean _equals = this.operator_equals(_balance, 7000.0);
    assertTrue("foreldreSpar.getBalance() == 7000.0 failed", _equals);
    
  }
  
  private void _transition_exprAction__withdraw_transitions7_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.endYearUpdate();
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.endYearUpdate() failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__withdraw_transitions7_actions1(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions7_effect_state(final ForeldreSpar it) {
    _test__withdraw_transitions7_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions7_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    double _plus = (1 + 0.04);
    double _multiply = (7000.0 * _plus);
    double _minus = (_multiply - 1000.0);
    boolean _equals = this.operator_equals(_balance, _minus);
    assertTrue("foreldreSpar.getBalance() == 7000.0 * (1 + 0.04) - 1000.0 failed after foreldreSpar.endYearUpdate() ,foreldreSpar.withdraw(1000.0)", _equals);
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions0_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.deposit(10000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.deposit(10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions0_actions1(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRemainingWithdrawals_transitions0_effect_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions0_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions0_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    boolean _equals = this.operator_equals(_remainingWithdrawals, 2);
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 2 failed after foreldreSpar.deposit(10000.0) ,foreldreSpar.withdraw(1000.0)", _equals);
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions1_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions1_actions1(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRemainingWithdrawals_transitions1_effect_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions1_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions1_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    boolean _equals = this.operator_equals(_remainingWithdrawals, 0);
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 0 failed after foreldreSpar.withdraw(1000.0) ,foreldreSpar.withdraw(1000.0)", _equals);
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions2_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRemainingWithdrawals_transitions3_effect_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions3_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions3_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    boolean _equals = this.operator_equals(_remainingWithdrawals, 0);
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 0 failed", _equals);
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions4_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.endYearUpdate();
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.endYearUpdate() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRemainingWithdrawals_transitions4_effect_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions4_effect_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions4_effect_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    boolean _equals = this.operator_equals(_remainingWithdrawals, 3);
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 3 failed after foreldreSpar.endYearUpdate()", _equals);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(ForeldreSparTest.class);
  }
}
