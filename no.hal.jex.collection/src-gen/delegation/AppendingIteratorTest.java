package delegation;

import delegation.AppendingIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests delegation.AppendingIterator")
@SuppressWarnings("all")
public class AppendingIteratorTest extends TestCase {
  private List<Integer> list86;
  
  private List<Integer> _init_list86() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(8), Integer.valueOf(7), Integer.valueOf(6)));
  }
  
  private List<Integer> list13;
  
  private List<Integer> _init_list13() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)));
  }
  
  private List<Integer> list14;
  
  private List<Integer> _init_list14() {
    return Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)));
  }
  
  @Override
  protected void setUp() {
    list86 = _init_list86();
    list13 = _init_list13();
    list14 = _init_list14();
    
  }
  
  private void testIterator(final Collection<Integer> col, final int... values) {
    Iterator<Integer> _iterator = col.iterator();
    AppendingIterator<Integer> _appendingIterator = new AppendingIterator<Integer>(_iterator);
    this.testIterator(_appendingIterator, values);
  }
  
  private void testIterator(final Collection<Integer> col1, final Collection<Integer> col2, final int... values) {
    Iterator<Integer> _iterator = col1.iterator();
    Iterator<Integer> _iterator_1 = col2.iterator();
    AppendingIterator<Integer> _appendingIterator = new AppendingIterator<Integer>(_iterator, _iterator_1);
    this.testIterator(_appendingIterator, values);
  }
  
  private void testIterator(final Collection<Integer> col1, final Collection<Integer> col2, final Collection<Integer> col3, final int... values) {
    Iterator<Integer> _iterator = col1.iterator();
    Iterator<Integer> _iterator_1 = col2.iterator();
    Iterator<Integer> _iterator_2 = col3.iterator();
    AppendingIterator<Integer> _appendingIterator = new AppendingIterator<Integer>(_iterator, _iterator_1, _iterator_2);
    this.testIterator(_appendingIterator, values);
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
  public void testCaseNone() {
    _test__caseNone_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCaseEmpty() {
    _test__caseEmpty_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase1() {
    _test__case1_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase86() {
    _test__case86_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase8613() {
    _test__case8613_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase8614() {
    _test__case8614_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase1486() {
    _test__case1486_transitions0_effects0_state();
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCase131486() {
    _test__case131486_transitions0_effects0_state();
    
  }
  
  private void _test__caseNone_transitions0_effects0_state() {
    _test__caseNone_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__caseNone_transitions0_effects0_state_objectTests0_test() {
    try {
      
      AppendingIterator<Integer> _appendingIterator = new AppendingIterator<Integer>();
      this.testIterator(_appendingIterator);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(new AppendingIterator()) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__caseEmpty_transitions0_effects0_state() {
    _test__caseEmpty_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__caseEmpty_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case1_transitions0_effects0_state() {
    _test__case1_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__case1_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(1))), 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(#[1], 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case86_transitions0_effects0_state() {
    _test__case86_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__case86_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list86, 8, 7, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list86, 8, 7, 6) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case8613_transitions0_effects0_state() {
    _test__case8613_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__case8613_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list86, this.list13, 8, 7, 6, 1, 2, 3);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list86, list13, 8, 7, 6, 1, 2, 3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case8614_transitions0_effects0_state() {
    _test__case8614_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__case8614_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list86, this.list14, 8, 7, 6, 1, 2, 3, 4);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list86, list14, 8, 7, 6, 1, 2, 3, 4) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case1486_transitions0_effects0_state() {
    _test__case1486_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__case1486_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list14, this.list86, 1, 2, 3, 4, 8, 7, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list14, list86, 1, 2, 3, 4, 8, 7, 6) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__case131486_transitions0_effects0_state() {
    _test__case131486_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__case131486_transitions0_effects0_state_objectTests0_test() {
    try {
      
      this.testIterator(this.list13, this.list14, this.list86, 1, 2, 3, 1, 2, 3, 4, 8, 7, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testIterator(list13, list14, list86, 1, 2, 3, 1, 2, 3, 4, 8, 7, 6) failed: " + error.getMessage());
    }
    
  }
}
