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
    throw new UnsupportedOperationException("Test wouldn't compile, due to missing or erroneous code.");
  }
  
  @JExercise(tests = "ForeldreSpar(double,int);void withdraw(double);void endYearUpdate()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>foreldreSpar.deposit(10000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(-1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(10000.0)</li>\n\t\t<li>foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.endYearUpdate(), foreldreSpar.withdraw(1000.0)</li>\n\t\t</ul>\n")
  public void testWithdraw() {
    _transition_exprAction__withdraw_transitions0_actions0(foreldreSpar);
    _transition_exprAction__withdraw_transitions0_actions1(foreldreSpar);
    _test__withdraw_transitions0_effects0_state(foreldreSpar);
    try {
      _transition_exprAction__withdraw_transitions1_actions0(foreldreSpar);
      fail("IllegalArgumentException should be thrown after foreldreSpar.withdraw(-1000.0)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after foreldreSpar.withdraw(-1000.0)", e instanceof IllegalArgumentException);
    }
    _test__withdraw_transitions2_effects0_state(foreldreSpar);
    try {
      _transition_exprAction__withdraw_transitions3_actions0(foreldreSpar);
      fail("IllegalStateException should be thrown after foreldreSpar.withdraw(10000.0)");
    } catch (Exception e_1) {
      assertTrue("IllegalStateException should be thrown after foreldreSpar.withdraw(10000.0)", e_1 instanceof IllegalStateException);
    }
    _test__withdraw_transitions4_effects0_state(foreldreSpar);
    try {
      _transition_exprAction__withdraw_transitions5_actions0(foreldreSpar);
      _transition_exprAction__withdraw_transitions5_actions1(foreldreSpar);
      _transition_exprAction__withdraw_transitions5_actions2(foreldreSpar);
      fail("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)");
    } catch (Exception e_2) {
      assertTrue("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)", e_2 instanceof IllegalStateException);
    }
    _test__withdraw_transitions6_effects0_state(foreldreSpar);
    _transition_exprAction__withdraw_transitions7_actions0(foreldreSpar);
    _transition_exprAction__withdraw_transitions7_actions1(foreldreSpar);
    _test__withdraw_transitions7_effects0_state(foreldreSpar);
    
  }
  
  @JExercise(tests = "ForeldreSpar(double,int);void withdraw(double);void endYearUpdate()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>foreldreSpar.deposit(10000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(1000.0), foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.withdraw(1000.0)</li>\n\t\t<li>foreldreSpar.endYearUpdate()</li>\n\t\t</ul>\n")
  public void testGetRemainingWithdrawals() {
    _transition_exprAction__getRemainingWithdrawals_transitions0_actions0(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions0_actions1(foreldreSpar);
    _test__getRemainingWithdrawals_transitions0_effects0_state(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions1_actions0(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions1_actions1(foreldreSpar);
    _test__getRemainingWithdrawals_transitions1_effects0_state(foreldreSpar);
    try {
      _transition_exprAction__getRemainingWithdrawals_transitions2_actions0(foreldreSpar);
      fail("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0)");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after foreldreSpar.withdraw(1000.0)", e instanceof IllegalStateException);
    }
    _test__getRemainingWithdrawals_transitions3_effects0_state(foreldreSpar);
    _transition_exprAction__getRemainingWithdrawals_transitions4_actions0(foreldreSpar);
    _test__getRemainingWithdrawals_transitions4_effects0_state(foreldreSpar);
    
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
  
  private void _test__withdraw_transitions0_effects0_state(final ForeldreSpar it) {
    _test__withdraw_transitions0_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions0_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    assertTrue("foreldreSpar.getBalance() == 9000.0 failed after foreldreSpar.deposit(10000.0) ,foreldreSpar.withdraw(1000.0)", this.operator_equals(_balance, 9000.0));
    
  }
  
  private void _transition_exprAction__withdraw_transitions1_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw((-1000.0));
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(-1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions2_effects0_state(final ForeldreSpar it) {
    _test__withdraw_transitions2_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions2_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    assertTrue("foreldreSpar.getBalance() == 9000.0 failed", this.operator_equals(_balance, 9000.0));
    
  }
  
  private void _transition_exprAction__withdraw_transitions3_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(10000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions4_effects0_state(final ForeldreSpar it) {
    _test__withdraw_transitions4_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions4_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    assertTrue("foreldreSpar.getBalance() == 9000.0 failed", this.operator_equals(_balance, 9000.0));
    
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
  
  private void _test__withdraw_transitions6_effects0_state(final ForeldreSpar it) {
    _test__withdraw_transitions6_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions6_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    assertTrue("foreldreSpar.getBalance() == 7000.0 failed", this.operator_equals(_balance, 7000.0));
    
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
  
  private void _test__withdraw_transitions7_effects0_state(final ForeldreSpar it) {
    _test__withdraw_transitions7_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__withdraw_transitions7_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    double _balance = this.foreldreSpar.getBalance();
    assertTrue("foreldreSpar.getBalance() == 7000.0 * (1 + 0.04) - 1000.0 failed after foreldreSpar.endYearUpdate() ,foreldreSpar.withdraw(1000.0)", this.operator_equals(_balance, ((7000.0 * (1 + 0.04)) - 1000.0)));
    
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
  
  private void _test__getRemainingWithdrawals_transitions0_effects0_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions0_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions0_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 2 failed after foreldreSpar.deposit(10000.0) ,foreldreSpar.withdraw(1000.0)", this.operator_equals(_remainingWithdrawals, 2));
    
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
  
  private void _test__getRemainingWithdrawals_transitions1_effects0_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions1_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions1_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 0 failed after foreldreSpar.withdraw(1000.0) ,foreldreSpar.withdraw(1000.0)", this.operator_equals(_remainingWithdrawals, 0));
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions2_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.withdraw(1000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.withdraw(1000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRemainingWithdrawals_transitions3_effects0_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions3_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions3_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 0 failed", this.operator_equals(_remainingWithdrawals, 0));
    
  }
  
  private void _transition_exprAction__getRemainingWithdrawals_transitions4_actions0(final ForeldreSpar it) {
    try {
      
      this.foreldreSpar.endYearUpdate();
      } catch (junit.framework.AssertionFailedError error) {
      fail("foreldreSpar.endYearUpdate() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRemainingWithdrawals_transitions4_effects0_state(final ForeldreSpar it) {
    _test__getRemainingWithdrawals_transitions4_effects0_state_objectTests0_test(foreldreSpar);
    
  }
  
  private void _test__getRemainingWithdrawals_transitions4_effects0_state_objectTests0_test(final ForeldreSpar it) {
    
    int _remainingWithdrawals = this.foreldreSpar.getRemainingWithdrawals();
    assertTrue("foreldreSpar.getRemainingWithdrawals() == 3 failed after foreldreSpar.endYearUpdate()", this.operator_equals(_remainingWithdrawals, 3));
    
  }
}
