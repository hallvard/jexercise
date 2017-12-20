package encapsulation;

import encapsulation.RPNCalc;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests encapsulation.RPNCalc")
@SuppressWarnings("all")
public class RPNCalcTest extends TestCase {
  private RPNCalc rPNCalc;
  
  @Override
  protected void setUp() {
    rPNCalc = new RPNCalc();
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double)", description = "<h3>Push</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(1.0)</li>\n\t\t<li>push(2.0)</li>\n\t\t<li>push(3.0)</li>\n\t\t</ul>\n")
  public void testPush() {
    _transition_exprAction__push_transitions0_actions0(rPNCalc);
    _test__push_transitions0_effects0_state(rPNCalc);
    _transition_exprAction__push_transitions1_actions0(rPNCalc);
    _test__push_transitions1_effects0_state(rPNCalc);
    _transition_exprAction__push_transitions2_actions0(rPNCalc);
    _test__push_transitions2_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double);double pop()", description = "<h3>Pop</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(1.0), push(2.0), push(3.0)</li>\n\t\t<li>pop() == 3.0</li>\n\t\t<li>pop() == 2.0</li>\n\t\t<li>push(2.0)</li>\n\t\t<li>pop() == 2.0</li>\n\t\t<li>pop() == 1.0</li>\n\t\t</ul>\n")
  public void testPop() {
    _transition_exprAction__pop_transitions0_actions0(rPNCalc);
    _transition_exprAction__pop_transitions0_actions1(rPNCalc);
    _transition_exprAction__pop_transitions0_actions2(rPNCalc);
    _test__pop_transitions0_effects0_state(rPNCalc);
    _transition_exprAction__pop_transitions1_actions0(rPNCalc);
    _test__pop_transitions1_effects0_state(rPNCalc);
    _transition_exprAction__pop_transitions2_actions0(rPNCalc);
    _test__pop_transitions2_effects0_state(rPNCalc);
    _transition_exprAction__pop_transitions3_actions0(rPNCalc);
    _test__pop_transitions3_effects0_state(rPNCalc);
    _transition_exprAction__pop_transitions4_actions0(rPNCalc);
    _test__pop_transitions4_effects0_state(rPNCalc);
    _transition_exprAction__pop_transitions5_actions0(rPNCalc);
    _test__pop_transitions5_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double)", description = "<h3>Peek</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(0.0), push(1.0), push(2.0)</li>\n\t\t</ul>\n")
  public void testPeek() {
    _transition_exprAction__peek_transitions0_actions0(rPNCalc);
    _transition_exprAction__peek_transitions0_actions1(rPNCalc);
    _transition_exprAction__peek_transitions0_actions2(rPNCalc);
    _test__peek_transitions0_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc()", description = "<h3>Peek empty stack</h3>Tests \n\t\tinitialization\n")
  public void testPeekEmpty() {
    _test__peekEmpty_transitions0_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double)", description = "<h3>getSize</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(1.0)</li>\n\t\t<li>push(2.0)</li>\n\t\t<li>push(3.0)</li>\n\t\t</ul>\n")
  public void testGetSize() {
    _test__getSize_transitions0_effects0_state(rPNCalc);
    _transition_exprAction__getSize_transitions1_actions0(rPNCalc);
    _test__getSize_transitions1_effects0_state(rPNCalc);
    _transition_exprAction__getSize_transitions2_actions0(rPNCalc);
    _test__getSize_transitions2_effects0_state(rPNCalc);
    _transition_exprAction__getSize_transitions3_actions0(rPNCalc);
    _test__getSize_transitions3_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double);void performOperation(char)", description = "<h3>+ operation</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(3.0), push(4.0), performOperation(\'+\')</li>\n\t\t</ul>\n")
  public void testAdd() {
    _transition_exprAction__add_transitions0_actions0(rPNCalc);
    _transition_exprAction__add_transitions0_actions1(rPNCalc);
    _transition_exprAction__add_transitions0_actions2(rPNCalc);
    _test__add_transitions0_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double);void performOperation(char)", description = "<h3>- operation</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(7.0), push(2.0), performOperation(\'-\')</li>\n\t\t</ul>\n")
  public void testSub() {
    _transition_exprAction__sub_transitions0_actions0(rPNCalc);
    _transition_exprAction__sub_transitions0_actions1(rPNCalc);
    _transition_exprAction__sub_transitions0_actions2(rPNCalc);
    _test__sub_transitions0_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double);void performOperation(char)", description = "<h3>* operation</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(5.0), push(2.0), performOperation(\'*\')</li>\n\t\t</ul>\n")
  public void testMult() {
    _transition_exprAction__mult_transitions0_actions0(rPNCalc);
    _transition_exprAction__mult_transitions0_actions1(rPNCalc);
    _transition_exprAction__mult_transitions0_actions2(rPNCalc);
    _test__mult_transitions0_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double);void performOperation(char)", description = "<h3>/ operation</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(10.0), push(4.0), performOperation(\'/\')</li>\n\t\t</ul>\n")
  public void testDiv() {
    _transition_exprAction__div_transitions0_actions0(rPNCalc);
    _transition_exprAction__div_transitions0_actions1(rPNCalc);
    _transition_exprAction__div_transitions0_actions2(rPNCalc);
    _test__div_transitions0_effects0_state(rPNCalc);
    
  }
  
  @JExercise(tests = "RPNCalc();void push(double);void performOperation(char)", description = "<h3>~ operation</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(10.0), push(4.0), performOperation(\'~\')</li>\n\t\t</ul>\n")
  public void testSwap() {
    _transition_exprAction__swap_transitions0_actions0(rPNCalc);
    _transition_exprAction__swap_transitions0_actions1(rPNCalc);
    _transition_exprAction__swap_transitions0_actions2(rPNCalc);
    _test__swap_transitions0_effects0_state(rPNCalc);
    
  }
  
  private void _transition_exprAction__push_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(1.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(1.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__push_transitions0_effects0_state(final RPNCalc it) {
    _test__push_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__push_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 1.0 failed after push(1.0)", 1.0, _peek);
    
  }
  
  private void _transition_exprAction__push_transitions1_actions0(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__push_transitions1_effects0_state(final RPNCalc it) {
    _test__push_transitions1_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__push_transitions1_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 2.0 failed after push(2.0)", 2.0, _peek);
    
  }
  
  private void _transition_exprAction__push_transitions2_actions0(final RPNCalc it) {
    try {
      
      it.push(3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__push_transitions2_effects0_state(final RPNCalc it) {
    _test__push_transitions2_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__push_transitions2_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 3.0 failed after push(3.0)", 3.0, _peek);
    
  }
  
  private void _transition_exprAction__pop_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(1.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(1.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__pop_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__pop_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.push(3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__pop_transitions0_effects0_state(final RPNCalc it) {
    _test__pop_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__pop_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 3.0 failed after push(1.0) ,push(2.0) ,push(3.0)", 3.0, _peek);
    
  }
  
  private void _transition_exprAction__pop_transitions1_actions0(final RPNCalc it) {
    
    double _pop = it.pop();
    assertEquals("pop() == 3.0 failed", 3.0, _pop);
    
  }
  
  private void _test__pop_transitions1_effects0_state(final RPNCalc it) {
    _test__pop_transitions1_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__pop_transitions1_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 2.0 failed after pop() == 3.0", 2.0, _peek);
    
  }
  
  private void _transition_exprAction__pop_transitions2_actions0(final RPNCalc it) {
    
    double _pop = it.pop();
    assertEquals("pop() == 2.0 failed", 2.0, _pop);
    
  }
  
  private void _test__pop_transitions2_effects0_state(final RPNCalc it) {
    _test__pop_transitions2_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__pop_transitions2_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 1.0 failed after pop() == 2.0", 1.0, _peek);
    
  }
  
  private void _transition_exprAction__pop_transitions3_actions0(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__pop_transitions3_effects0_state(final RPNCalc it) {
    _test__pop_transitions3_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__pop_transitions3_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 2.0 failed after push(2.0)", 2.0, _peek);
    
  }
  
  private void _transition_exprAction__pop_transitions4_actions0(final RPNCalc it) {
    
    double _pop = it.pop();
    assertEquals("pop() == 2.0 failed", 2.0, _pop);
    
  }
  
  private void _test__pop_transitions4_effects0_state(final RPNCalc it) {
    _test__pop_transitions4_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__pop_transitions4_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 1.0 failed after pop() == 2.0", 1.0, _peek);
    
  }
  
  private void _transition_exprAction__pop_transitions5_actions0(final RPNCalc it) {
    
    double _pop = it.pop();
    assertEquals("pop() == 1.0 failed", 1.0, _pop);
    
  }
  
  private void _test__pop_transitions5_effects0_state(final RPNCalc it) {
    _test__pop_transitions5_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__pop_transitions5_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 0 failed after pop() == 1.0", 0, _size);
    
  }
  
  private void _transition_exprAction__peek_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(0.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(0.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__peek_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(1.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(1.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__peek_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__peek_transitions0_effects0_state(final RPNCalc it) {
    _test__peek_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__peek_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 2.0 failed after push(0.0) ,push(1.0) ,push(2.0)", 2.0, _peek);
    
    double _peek_1 = it.peek(1);
    assertEquals("peek(1) == 1.0 failed after push(0.0) ,push(1.0) ,push(2.0)", 1.0, _peek_1);
    
    double _peek_2 = it.peek(2);
    assertEquals("peek(2) == 0.0 failed after push(0.0) ,push(1.0) ,push(2.0)", 0.0, _peek_2);
    
  }
  
  private void _test__peekEmpty_transitions0_effects0_state(final RPNCalc it) {
    _test__peekEmpty_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__peekEmpty_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    double _peek = it.peek(3);
    assertEquals("peek(3) == Double.NaN failed", Double.NaN, _peek);
    
    double _peek_1 = it.peek((-1));
    assertEquals("peek(-1) == Double.NaN failed", Double.NaN, _peek_1);
    
  }
  
  private void _test__getSize_transitions0_effects0_state(final RPNCalc it) {
    _test__getSize_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__getSize_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 0 failed", 0, _size);
    
  }
  
  private void _transition_exprAction__getSize_transitions1_actions0(final RPNCalc it) {
    try {
      
      it.push(1.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(1.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getSize_transitions1_effects0_state(final RPNCalc it) {
    _test__getSize_transitions1_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__getSize_transitions1_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(1.0)", 1, _size);
    
  }
  
  private void _transition_exprAction__getSize_transitions2_actions0(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getSize_transitions2_effects0_state(final RPNCalc it) {
    _test__getSize_transitions2_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__getSize_transitions2_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 2 failed after push(2.0)", 2, _size);
    
  }
  
  private void _transition_exprAction__getSize_transitions3_actions0(final RPNCalc it) {
    try {
      
      it.push(3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getSize_transitions3_effects0_state(final RPNCalc it) {
    _test__getSize_transitions3_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__getSize_transitions3_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 3 failed after push(3.0)", 3, _size);
    
  }
  
  private void _transition_exprAction__add_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(3.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(3.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__add_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__add_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.performOperation('+');
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__add_transitions0_effects0_state(final RPNCalc it) {
    _test__add_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__add_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(3.0) ,push(4.0) ,performOperation('+')", 1, _size);
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 7.0 failed after push(3.0) ,push(4.0) ,performOperation('+')", 7.0, _peek);
    
  }
  
  private void _transition_exprAction__sub_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(7.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(7.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__sub_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__sub_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.performOperation('-');
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('-') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__sub_transitions0_effects0_state(final RPNCalc it) {
    _test__sub_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__sub_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(7.0) ,push(2.0) ,performOperation('-')", 1, _size);
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 5.0 failed after push(7.0) ,push(2.0) ,performOperation('-')", 5.0, _peek);
    
  }
  
  private void _transition_exprAction__mult_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(5.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(5.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mult_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(2.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(2.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mult_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.performOperation('*');
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('*') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__mult_transitions0_effects0_state(final RPNCalc it) {
    _test__mult_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__mult_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(5.0) ,push(2.0) ,performOperation('*')", 1, _size);
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 10.0 failed after push(5.0) ,push(2.0) ,performOperation('*')", 10.0, _peek);
    
  }
  
  private void _transition_exprAction__div_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__div_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__div_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.performOperation('/');
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('/') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__div_transitions0_effects0_state(final RPNCalc it) {
    _test__div_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__div_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(10.0) ,push(4.0) ,performOperation('/')", 1, _size);
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 2.5 failed after push(10.0) ,push(4.0) ,performOperation('/')", 2.5, _peek);
    
  }
  
  private void _transition_exprAction__swap_transitions0_actions0(final RPNCalc it) {
    try {
      
      it.push(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__swap_transitions0_actions1(final RPNCalc it) {
    try {
      
      it.push(4.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(4.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__swap_transitions0_actions2(final RPNCalc it) {
    try {
      
      it.performOperation('~');
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('~') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__swap_transitions0_effects0_state(final RPNCalc it) {
    _test__swap_transitions0_effects0_state_objectTests0_test(rPNCalc);
    
  }
  
  private void _test__swap_transitions0_effects0_state_objectTests0_test(final RPNCalc it) {
    
    int _size = it.getSize();
    assertEquals("size == 2 failed after push(10.0) ,push(4.0) ,performOperation('~')", 2, _size);
    
    double _peek = it.peek(0);
    assertEquals("peek(0) == 10.0 failed after push(10.0) ,push(4.0) ,performOperation('~')", 10.0, _peek);
    
    double _peek_1 = it.peek(1);
    assertEquals("peek(1) == 4.0 failed after push(10.0) ,push(4.0) ,performOperation('~')", 4.0, _peek_1);
    
  }
}
