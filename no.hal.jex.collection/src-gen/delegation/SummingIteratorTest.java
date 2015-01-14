package delegation;

import delegation.SummingIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests delegation.SummingIterator")
@SuppressWarnings("all")
public class SummingIteratorTest extends TestCase {
  private List<Integer> list86;
  
  private List<Integer> _init_list86() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(8), Integer.valueOf(7), Integer.valueOf(6)));
  }
  
  private List<Integer> list13;
  
  private List<Integer> _init_list13() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)));
  }
  
  @Override
  protected void setUp() {
    list86 = _init_list86();
    list13 = _init_list13();
    
  }
  
  private void testIterator(final Collection<Integer> col1, final Collection<Integer> col2, final int... values) {
    Iterator<Integer> _iterator = col1.iterator();
    Iterator<Integer> _iterator_1 = col2.iterator();
    SummingIterator _summingIterator = new SummingIterator(_iterator, _iterator_1);
    this.testIterator(_summingIterator, values);
  }
  
  private void testIterator(final Iterator<Integer> iterator, final int... values) {
    for (final int value : values) {
      {
        boolean _hasNext = iterator.hasNext();
        TestCase.assertTrue(_hasNext);
        Integer _next = iterator.next();
        TestCase.assertEquals(value, (_next).intValue());
      }
    }
    boolean _hasNext = iterator.hasNext();
    TestCase.assertFalse(_hasNext);
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCaseEmpty() {
    _test__caseEmpty_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase1122() {
    _test__case1122_transitions0_effect_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase8613() {
    _test__case8613_transitions0_effect_state();
    
  }
  
  private void _test__caseEmpty_transitions0_effect_state() {
    _test__caseEmpty_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__caseEmpty_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList()), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[], #[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case1122_transitions0_effect_state() {
    _test__case1122_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case1122_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1))), Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(2))), 3);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[1], #[2], 3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case8613_transitions0_effect_state() {
    _test__case8613_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__case8613_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list86, this.list13, 9, 9, 9);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list86, list13, 9, 9, 9) failed: " + error.getMessage());
    }
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(SummingIteratorTest.class);
  }
}
