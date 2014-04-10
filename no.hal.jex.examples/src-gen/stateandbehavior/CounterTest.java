package stateandbehavior;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import stateandbehavior.Counter;

@JExercise(description = "Tests stateandbehavior.Counter")
@SuppressWarnings("all")
public class CounterTest extends TestCase {
  private Counter counter;
  
  private Counter _init_counter() {
    Counter _counter = new Counter(1, 3);
    return _counter;
  }
  
  @Override
  protected void setUp() {
    counter = _init_counter();
    
  }
  
  @JExercise(tests = "Counter(int,int);void count()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>count()</li>\n\t\t<li>count()</li>\n\t\t<li>count()</li>\n\t\t</ul>\n")
  public void testExample1() {
    _test__example1_transitions0_effect_state(counter);
    _transition_exprAction__example1_transitions1_actions0(counter);
    _test__example1_transitions1_effect_state(counter);
    _transition_exprAction__example1_transitions2_actions0(counter);
    _test__example1_transitions2_effect_final(counter);
    _transition_exprAction__example1_transitions3_actions0(counter);
    _test__example1_transitions2_effect_final(counter);
    
  }
  
  private void _test__example1_transitions0_effect_state(final Counter it) {
    _test__example1_transitions0_effect_state_objectTests0_test(counter);
    
  }
  
  private void _test__example1_transitions0_effect_state_objectTests0_test(final Counter it) {
    
    int _counter = it.getCounter();
    assertEquals("getCounter() == 1 failed", 1, _counter);
    
  }
  
  private void _transition_exprAction__example1_transitions1_actions0(final Counter it) {
    try {
      
      it.count();
      } catch (junit.framework.AssertionFailedError error) {
      fail("count() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__example1_transitions1_effect_state(final Counter it) {
    _test__example1_transitions1_effect_state_objectTests0_test(counter);
    
  }
  
  private void _test__example1_transitions1_effect_state_objectTests0_test(final Counter it) {
    
    int _counter = it.getCounter();
    assertEquals("getCounter() == 2 failed after count()", 2, _counter);
    
  }
  
  private void _transition_exprAction__example1_transitions2_actions0(final Counter it) {
    try {
      
      it.count();
      } catch (junit.framework.AssertionFailedError error) {
      fail("count() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__example1_transitions2_effect_final(final Counter it) {
    _test__example1_transitions2_effect_final_objectTests0_test(counter);
    
  }
  
  private void _test__example1_transitions2_effect_final_objectTests0_test(final Counter it) {
    
    int _counter = it.getCounter();
    assertEquals("getCounter() == 3 failed after count()", 3, _counter);
    
  }
  
  private void _transition_exprAction__example1_transitions3_actions0(final Counter it) {
    try {
      
      it.count();
      } catch (junit.framework.AssertionFailedError error) {
      fail("count() failed: " + error.getMessage());
    }
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(CounterTest.class);
  }
}
