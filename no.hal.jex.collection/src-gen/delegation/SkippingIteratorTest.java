package delegation;

import com.google.common.collect.Lists;
import delegation.SkippingIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests delegation.SkippingIterator")
@SuppressWarnings("all")
public class SkippingIteratorTest extends TestCase {
  private List<Integer> list17;
  
  private List<Integer> _init_list17() {
    return Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)));
  }
  
  private List<Integer> list18;
  
  private List<Integer> _init_list18() {
    return Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)));
  }
  
  private List<Integer> list19;
  
  private List<Integer> _init_list19() {
    return Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9)));
  }
  
  @Override
  protected void setUp() {
    list17 = _init_list17();
    list18 = _init_list18();
    list19 = _init_list19();
    
  }
  
  private void testIterator(final Collection<Integer> col, final int skipCount, final int... values) {
    Iterator<Integer> _iterator = col.iterator();
    SkippingIterator<Integer> _skippingIterator = new SkippingIterator<Integer>(_iterator, skipCount);
    this.testIterator(_skippingIterator, values);
  }
  
  private void testIterator(final Iterator<Integer> iterator, final int... values) {
    for (final int value : values) {
      {
        boolean _hasNext = iterator.hasNext();
        Assert.assertTrue(_hasNext);
        Integer _next = iterator.next();
        Assert.assertEquals(value, (_next).intValue());
      }
    }
    boolean _hasNext = iterator.hasNext();
    Assert.assertFalse(_hasNext);
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCaseEmpty() {
    _test__caseEmpty_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCaseSingle() {
    _test__caseSingle_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase12_1() {
    _test__case12_1_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase17_2() {
    _test__case17_2_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase18_2() {
    _test__case18_2_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase19_2() {
    _test__case19_2_transitions0_effect_state();
    
  }
  
  private void _test__caseEmpty_transitions0_effect_state() {
    _test__caseEmpty_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__caseEmpty_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList()), 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[], 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__caseSingle_transitions0_effect_state() {
    _test__caseSingle_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__caseSingle_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1))), 0, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[1], 0, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case12_1_transitions0_effect_state() {
    _test__case12_1_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case12_1_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2))), 1, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[1, 2], 1, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case17_2_transitions0_effect_state() {
    _test__case17_2_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case17_2_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list17, 2, 1, 4, 7);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list17, 2, 1, 4, 7) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case18_2_transitions0_effect_state() {
    _test__case18_2_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case18_2_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list18, 2, 1, 4, 7);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list18, 2, 1, 4, 7) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case19_2_transitions0_effect_state() {
    _test__case19_2_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case19_2_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list19, 2, 1, 4, 7);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list19, 2, 1, 4, 7) failed: " + error.getMessage());
    }
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(SkippingIteratorTest.class);
  }
}
