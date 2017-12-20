package inheritance;

import inheritance.SavingsAccount2;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.SavingsAccount2")
@SuppressWarnings("all")
public class SavingsAccount2Test extends TestCase {
  private SavingsAccount2 sub;
  
  private SavingsAccount2 _init_sub() {
    SavingsAccount2 _savingsAccount2 = new SavingsAccount2(1, 50.0);
    return _savingsAccount2;
  }
  
  @Override
  protected void setUp() {
    sub = _init_sub();
    
  }
  
  @JExercise(tests = "SavingsAccount2(int,double)", description = "<h3>Setter inn midler</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Penger settes inn: deposit(10000.0)</li>\n\t\t<li>Tester negativt bel\u00F8p: deposit(-10000.0)</li>\n\t\t</ul>\n")
  public void testDeposit() {
    _test__deposit_transitions0_source_state(sub);
    _transition_exprAction__deposit_transitions0_actions0(sub);
    _test__deposit_transitions0_effects0_state(sub);
    try {
      _transition_exprAction__deposit_transitions1_actions0(sub);
      fail("IllegalArgumentException should be thrown after deposit(-10000.0)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after deposit(-10000.0)", e instanceof IllegalArgumentException);
    }
    _test__deposit_transitions2_effects0_state(sub);
    
  }
  
  @JExercise(tests = "SavingsAccount2(int,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Setter inn og tar ut: deposit(20000.0), withdraw(5000.0)</li>\n\t\t<li>Tester negativt bel\u00F8p: withdraw(-10000.0)</li>\n\t\t<li>Tester for stort bel\u00F8p: withdraw(20000.0)</li>\n\t\t<li>Tester fee: withdraw(10000.0)</li>\n\t\t<li>Tester fee og withdrawals: withdraw(4930.0)</li>\n\t\t</ul>\n")
  public void testWithdraw() {
    _transition_exprAction__withdraw_transitions0_actions0(sub);
    _transition_exprAction__withdraw_transitions0_actions1(sub);
    _test__withdraw_transitions0_effects0_state(sub);
    try {
      _transition_exprAction__withdraw_transitions1_actions0(sub);
      fail("IllegalArgumentException should be thrown after withdraw(-10000.0)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after withdraw(-10000.0)", e instanceof IllegalArgumentException);
    }
    _test__withdraw_transitions2_effects0_state(sub);
    try {
      _transition_exprAction__withdraw_transitions3_actions0(sub);
      fail("IllegalStateException should be thrown after withdraw(20000.0)");
    } catch (Exception e_1) {
      assertTrue("IllegalStateException should be thrown after withdraw(20000.0)", e_1 instanceof IllegalStateException);
    }
    _test__withdraw_transitions4_effects0_state(sub);
    _transition_exprAction__withdraw_transitions5_actions0(sub);
    _test__withdraw_transitions5_effects0_state(sub);
    try {
      _transition_exprAction__withdraw_transitions6_actions0(sub);
      fail("IllegalStateException should be thrown after withdraw(4930.0)");
    } catch (Exception e_2) {
      assertTrue("IllegalStateException should be thrown after withdraw(4930.0)", e_2 instanceof IllegalStateException);
    }
    _test__withdraw_transitions7_effects0_state(sub);
    
  }
  
  private void _test__deposit_transitions0_source_state(final SavingsAccount2 it) {
    _test__deposit_transitions0_source_state_objectTests0_test(sub);
    
  }
  
  private void _test__deposit_transitions0_source_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 0.0 failed after deposit(10000.0)", 0.0, _balance);
    
  }
  
  private void _transition_exprAction__deposit_transitions0_actions0(final SavingsAccount2 it) {
    try {
      
      it.deposit(10000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("deposit(10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deposit_transitions0_effects0_state(final SavingsAccount2 it) {
    _test__deposit_transitions0_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__deposit_transitions0_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 10000.0 failed after deposit(10000.0)", 10000.0, _balance);
    
  }
  
  private void _transition_exprAction__deposit_transitions1_actions0(final SavingsAccount2 it) {
    try {
      
      it.deposit((-10000.0));
      } catch (junit.framework.AssertionFailedError error) {
      fail("deposit(-10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deposit_transitions2_effects0_state(final SavingsAccount2 it) {
    _test__deposit_transitions2_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__deposit_transitions2_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 10000.0 failed", 10000.0, _balance);
    
  }
  
  private void _transition_exprAction__withdraw_transitions0_actions0(final SavingsAccount2 it) {
    try {
      
      it.deposit(20000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("deposit(20000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__withdraw_transitions0_actions1(final SavingsAccount2 it) {
    try {
      
      it.withdraw(5000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("withdraw(5000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions0_effects0_state(final SavingsAccount2 it) {
    _test__withdraw_transitions0_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__withdraw_transitions0_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 15000.0 failed after deposit(20000.0) ,withdraw(5000.0)", 15000.0, _balance);
    
  }
  
  private void _transition_exprAction__withdraw_transitions1_actions0(final SavingsAccount2 it) {
    try {
      
      it.withdraw((-10000.0));
      } catch (junit.framework.AssertionFailedError error) {
      fail("withdraw(-10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions2_effects0_state(final SavingsAccount2 it) {
    _test__withdraw_transitions2_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__withdraw_transitions2_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 15000.0 failed", 15000.0, _balance);
    
  }
  
  private void _transition_exprAction__withdraw_transitions3_actions0(final SavingsAccount2 it) {
    try {
      
      it.withdraw(20000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("withdraw(20000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions4_effects0_state(final SavingsAccount2 it) {
    _test__withdraw_transitions4_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__withdraw_transitions4_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 15000.0 failed", 15000.0, _balance);
    
  }
  
  private void _transition_exprAction__withdraw_transitions5_actions0(final SavingsAccount2 it) {
    try {
      
      it.withdraw(10000.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("withdraw(10000.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions5_effects0_state(final SavingsAccount2 it) {
    _test__withdraw_transitions5_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__withdraw_transitions5_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 4950.0 failed after withdraw(10000.0)", 4950.0, _balance);
    
  }
  
  private void _transition_exprAction__withdraw_transitions6_actions0(final SavingsAccount2 it) {
    try {
      
      it.withdraw(4930.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("withdraw(4930.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__withdraw_transitions7_effects0_state(final SavingsAccount2 it) {
    _test__withdraw_transitions7_effects0_state_objectTests0_test(sub);
    
  }
  
  private void _test__withdraw_transitions7_effects0_state_objectTests0_test(final SavingsAccount2 it) {
    
    double _balance = it.getBalance();
    assertEquals("getBalance() == 4950.0 failed", 4950.0, _balance);
    
  }
}
