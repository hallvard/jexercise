package inheritance;

import inheritance.SavingsAccount;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.SavingsAccount")
@SuppressWarnings("all")
public class SavingsAccountTest extends TestCase {
  private SavingsAccount savingsAccount;
  
  private SavingsAccount _init_savingsAccount() {
    SavingsAccount _savingsAccount = new SavingsAccount(0.10);
    return _savingsAccount;
  }
  
  @Override
  protected void setUp() {
    savingsAccount = _init_savingsAccount();
    
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
  
  @JExercise(tests = "SavingsAccount(double);void deposit(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(100.0)</li>\n\t\t</ul>\n")
  public void testBalanceField() {
    _transition_exprAction__balanceField_transitions0_actions0(savingsAccount);
    _test__balanceField_transitions0_effect_state(savingsAccount);
    
  }
  
  @JExercise(tests = "SavingsAccount(double);void deposit(double);void withdraw(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(100.0), savingsAccount.withdraw(40.0)</li>\n\t\t</ul>\n")
  public void testDepositAndWithdraw() {
    _transition_exprAction__depositAndWithdraw_transitions0_actions0(savingsAccount);
    _transition_exprAction__depositAndWithdraw_transitions0_actions1(savingsAccount);
    _test__depositAndWithdraw_transitions0_effect_state(savingsAccount);
    
  }
  
  @JExercise(tests = "SavingsAccount(double);void deposit(double);void withdraw(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(10.0), savingsAccount.deposit(-100.0)</li>\n\t\t<li>savingsAccount.deposit(10.0), savingsAccount.withdraw(-100.0)</li>\n\t\t<li>savingsAccount.deposit(10.0), savingsAccount.withdraw(40.0)</li>\n\t\t</ul>\n")
  public void testDepositAndWithdrawIllegalStateOrInput() {
    try {
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions0(savingsAccount);
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions1(savingsAccount);
      fail("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.deposit(-100.0)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.deposit(-100.0)", e instanceof IllegalArgumentException);
    }
    _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state(savingsAccount);
    try {
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions0(savingsAccount);
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions1(savingsAccount);
      fail("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(-100.0)");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(-100.0)", e_1 instanceof IllegalArgumentException);
    }
    _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state(savingsAccount);
    try {
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions0(savingsAccount);
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions1(savingsAccount);
      fail("IllegalStateException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(40.0)");
    } catch (Exception e_2) {
      assertTrue("IllegalStateException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(40.0)", e_2 instanceof IllegalStateException);
    }
    _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state(savingsAccount);
    
  }
  
  @JExercise(tests = "SavingsAccount(double);void deposit(double);void endYearUpdate()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(100.0), savingsAccount.endYearUpdate()</li>\n\t\t</ul>\n")
  public void testEndYearUpdate() {
    _transition_exprAction__endYearUpdate_transitions0_actions0(savingsAccount);
    _transition_exprAction__endYearUpdate_transitions0_actions1(savingsAccount);
    _test__endYearUpdate_transitions0_effect_state(savingsAccount);
    
  }
  
  private void _transition_exprAction__balanceField_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(100.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__balanceField_transitions0_effect_state(final SavingsAccount it) {
    _test__balanceField_transitions0_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__balanceField_transitions0_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    boolean _equals = this.operator_equals(_balance, 100.0);
    assertTrue("savingsAccount.getBalance() == 100.0 failed after savingsAccount.deposit(100.0)", _equals);
    
  }
  
  private void _transition_exprAction__depositAndWithdraw_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(100.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdraw_transitions0_actions1(final SavingsAccount it) {
    try {
      
      this.savingsAccount.withdraw(40.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.withdraw(40.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdraw_transitions0_effect_state(final SavingsAccount it) {
    _test__depositAndWithdraw_transitions0_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdraw_transitions0_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    boolean _equals = this.operator_equals(_balance, 60.0);
    assertTrue("savingsAccount.getBalance() == 60.0 failed after savingsAccount.deposit(100.0) ,savingsAccount.withdraw(40.0)", _equals);
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions1(final SavingsAccount it) {
    try {
      
      double _minus = (-100.0);
      this.savingsAccount.deposit(_minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(-100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state(final SavingsAccount it) {
    _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    boolean _equals = this.operator_equals(_balance, 10.0);
    assertTrue("savingsAccount.getBalance() == 10.0 failed", _equals);
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions1(final SavingsAccount it) {
    try {
      
      double _minus = (-100.0);
      this.savingsAccount.withdraw(_minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.withdraw(-100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state(final SavingsAccount it) {
    _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    boolean _equals = this.operator_equals(_balance, 20.0);
    assertTrue("savingsAccount.getBalance() == 20.0 failed", _equals);
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions1(final SavingsAccount it) {
    try {
      
      this.savingsAccount.withdraw(40.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.withdraw(40.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state(final SavingsAccount it) {
    _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    boolean _equals = this.operator_equals(_balance, 30.0);
    assertTrue("savingsAccount.getBalance() == 30.0 failed", _equals);
    
  }
  
  private void _transition_exprAction__endYearUpdate_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(100.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__endYearUpdate_transitions0_actions1(final SavingsAccount it) {
    try {
      
      this.savingsAccount.endYearUpdate();
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.endYearUpdate() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__endYearUpdate_transitions0_effect_state(final SavingsAccount it) {
    _test__endYearUpdate_transitions0_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__endYearUpdate_transitions0_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    double _plus = (1 + 0.10);
    double _multiply = (100.0 * _plus);
    boolean _equals = this.operator_equals(_balance, _multiply);
    assertTrue("savingsAccount.getBalance() == 100.0 * (1 + 0.10) failed after savingsAccount.deposit(100.0) ,savingsAccount.endYearUpdate()", _equals);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(SavingsAccountTest.class);
  }
}
