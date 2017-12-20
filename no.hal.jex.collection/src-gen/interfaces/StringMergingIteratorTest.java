package interfaces;

import interfaces.StringMergingIterator;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests interfaces.StringMergingIterator")
@SuppressWarnings("all")
public class StringMergingIteratorTest extends TestCase {
  private Iterator<String> first;
  
  private Iterator<String> _init_first() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("a", "b");
    Iterator<String> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<String> second;
  
  private Iterator<String> _init_second() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("c", "d");
    Iterator<String> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<String> empty1;
  
  private Iterator<String> _init_empty1() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
    Iterator<String> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<String> empty2;
  
  private Iterator<String> _init_empty2() {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
    Iterator<String> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  @Override
  protected void setUp() {
    first = _init_first();
    second = _init_second();
    empty1 = _init_empty1();
    empty2 = _init_empty2();
    
  }
  
  @JExercise(tests = "StringMergingIterator(java.util.Iterator<String>,java.util.Iterator<String>);boolean hasNext();String next()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>mergingIterator.hasNext, mergingIterator.next==\"a\"</li>\n\t\t<li>mergingIterator.hasNext, mergingIterator.next==\"c\"</li>\n\t\t<li>mergingIterator.hasNext, mergingIterator.next==\"b\"</li>\n\t\t<li>mergingIterator.hasNext, mergingIterator.next==\"d\"</li>\n\t\t</ul>\n")
  public void testMergeLists() {
    StringMergingIterator mergingIterator = _init__mergeLists_mergingIterator();
    _transition_exprAction__mergeLists_transitions0_actions0(mergingIterator);
    _transition_exprAction__mergeLists_transitions0_actions1(mergingIterator);
    _test__mergeLists_transitions0_effects0_state(mergingIterator);
    _transition_exprAction__mergeLists_transitions1_actions0(mergingIterator);
    _transition_exprAction__mergeLists_transitions1_actions1(mergingIterator);
    _test__mergeLists_transitions1_effects0_state(mergingIterator);
    _transition_exprAction__mergeLists_transitions2_actions0(mergingIterator);
    _transition_exprAction__mergeLists_transitions2_actions1(mergingIterator);
    _test__mergeLists_transitions2_effects0_state(mergingIterator);
    _transition_exprAction__mergeLists_transitions3_actions0(mergingIterator);
    _transition_exprAction__mergeLists_transitions3_actions1(mergingIterator);
    _test__mergeLists_transitions3_effects0_state(mergingIterator);
    
  }
  
  @JExercise(tests = "StringMergingIterator(java.util.Iterator<String>,java.util.Iterator<String>);boolean hasNext();String next()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>mergingIterator.hasNext, mergingIterator.next==\"a\"</li>\n\t\t<li>mergingIterator.hasNext, mergingIterator.next==\"b\"</li>\n\t\t</ul>\n")
  public void testMergeOneEmpty() {
    StringMergingIterator mergingIterator = _init__mergeOneEmpty_mergingIterator();
    _transition_exprAction__mergeOneEmpty_transitions0_actions0(mergingIterator);
    _transition_exprAction__mergeOneEmpty_transitions0_actions1(mergingIterator);
    _test__mergeOneEmpty_transitions0_effects0_state(mergingIterator);
    _transition_exprAction__mergeOneEmpty_transitions1_actions0(mergingIterator);
    _transition_exprAction__mergeOneEmpty_transitions1_actions1(mergingIterator);
    _test__mergeOneEmpty_transitions1_effects0_state(mergingIterator);
    
  }
  
  @JExercise(tests = "StringMergingIterator(java.util.Iterator<String>,java.util.Iterator<String>)", description = "Tests \n\t\tinitialization\n")
  public void testMergeBothEmpty() {
    StringMergingIterator mergingIterator = _init__mergeBothEmpty_mergingIterator();
    _test__mergeBothEmpty_transitions0_effects0_state(mergingIterator);
    
  }
  
  private StringMergingIterator _init__mergeLists_mergingIterator() {
    StringMergingIterator _stringMergingIterator = new StringMergingIterator(this.first, this.second);
    return _stringMergingIterator;
  }
  
  private void _transition_exprAction__mergeLists_transitions0_actions0(final StringMergingIterator mergingIterator) {
    try {
      
      mergingIterator.hasNext();
      } catch (junit.framework.AssertionFailedError error) {
      fail("mergingIterator.hasNext failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mergeLists_transitions0_actions1(final StringMergingIterator mergingIterator) {
    
    String _next = mergingIterator.next();
    assertEquals("mergingIterator.next==\"a\" failed", "a", _next);
    
  }
  
  private void _test__mergeLists_transitions0_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeLists_transitions0_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeLists_transitions0_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    assertTrue("mergingIterator.hasNext failed after mergingIterator.hasNext ,mergingIterator.next==\"a\"", mergingIterator.hasNext());
    
  }
  
  private void _transition_exprAction__mergeLists_transitions1_actions0(final StringMergingIterator mergingIterator) {
    try {
      
      mergingIterator.hasNext();
      } catch (junit.framework.AssertionFailedError error) {
      fail("mergingIterator.hasNext failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mergeLists_transitions1_actions1(final StringMergingIterator mergingIterator) {
    
    String _next = mergingIterator.next();
    assertEquals("mergingIterator.next==\"c\" failed", "c", _next);
    
  }
  
  private void _test__mergeLists_transitions1_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeLists_transitions1_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeLists_transitions1_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    assertTrue("mergingIterator.hasNext failed after mergingIterator.hasNext ,mergingIterator.next==\"c\"", mergingIterator.hasNext());
    
  }
  
  private void _transition_exprAction__mergeLists_transitions2_actions0(final StringMergingIterator mergingIterator) {
    try {
      
      mergingIterator.hasNext();
      } catch (junit.framework.AssertionFailedError error) {
      fail("mergingIterator.hasNext failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mergeLists_transitions2_actions1(final StringMergingIterator mergingIterator) {
    
    String _next = mergingIterator.next();
    assertEquals("mergingIterator.next==\"b\" failed", "b", _next);
    
  }
  
  private void _test__mergeLists_transitions2_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeLists_transitions2_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeLists_transitions2_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    assertTrue("mergingIterator.hasNext failed after mergingIterator.hasNext ,mergingIterator.next==\"b\"", mergingIterator.hasNext());
    
  }
  
  private void _transition_exprAction__mergeLists_transitions3_actions0(final StringMergingIterator mergingIterator) {
    try {
      
      mergingIterator.hasNext();
      } catch (junit.framework.AssertionFailedError error) {
      fail("mergingIterator.hasNext failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mergeLists_transitions3_actions1(final StringMergingIterator mergingIterator) {
    
    String _next = mergingIterator.next();
    assertEquals("mergingIterator.next==\"d\" failed", "d", _next);
    
  }
  
  private void _test__mergeLists_transitions3_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeLists_transitions3_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeLists_transitions3_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    boolean _hasNext = mergingIterator.hasNext();
    assertTrue("! mergingIterator.hasNext failed after mergingIterator.hasNext ,mergingIterator.next==\"d\"", (!_hasNext));
    
  }
  
  private StringMergingIterator _init__mergeOneEmpty_mergingIterator() {
    StringMergingIterator _stringMergingIterator = new StringMergingIterator(this.first, this.empty1);
    return _stringMergingIterator;
  }
  
  private void _transition_exprAction__mergeOneEmpty_transitions0_actions0(final StringMergingIterator mergingIterator) {
    try {
      
      mergingIterator.hasNext();
      } catch (junit.framework.AssertionFailedError error) {
      fail("mergingIterator.hasNext failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mergeOneEmpty_transitions0_actions1(final StringMergingIterator mergingIterator) {
    
    String _next = mergingIterator.next();
    assertEquals("mergingIterator.next==\"a\" failed", "a", _next);
    
  }
  
  private void _test__mergeOneEmpty_transitions0_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeOneEmpty_transitions0_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeOneEmpty_transitions0_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    assertTrue("mergingIterator.hasNext failed after mergingIterator.hasNext ,mergingIterator.next==\"a\"", mergingIterator.hasNext());
    
  }
  
  private void _transition_exprAction__mergeOneEmpty_transitions1_actions0(final StringMergingIterator mergingIterator) {
    try {
      
      mergingIterator.hasNext();
      } catch (junit.framework.AssertionFailedError error) {
      fail("mergingIterator.hasNext failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__mergeOneEmpty_transitions1_actions1(final StringMergingIterator mergingIterator) {
    
    String _next = mergingIterator.next();
    assertEquals("mergingIterator.next==\"b\" failed", "b", _next);
    
  }
  
  private void _test__mergeOneEmpty_transitions1_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeOneEmpty_transitions1_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeOneEmpty_transitions1_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    boolean _hasNext = mergingIterator.hasNext();
    assertTrue("! mergingIterator.hasNext failed after mergingIterator.hasNext ,mergingIterator.next==\"b\"", (!_hasNext));
    
  }
  
  private StringMergingIterator _init__mergeBothEmpty_mergingIterator() {
    StringMergingIterator _stringMergingIterator = new StringMergingIterator(this.empty1, this.empty2);
    return _stringMergingIterator;
  }
  
  private void _test__mergeBothEmpty_transitions0_effects0_state(final StringMergingIterator mergingIterator) {
    _test__mergeBothEmpty_transitions0_effects0_state_objectTests0_test(mergingIterator);
    
  }
  
  private void _test__mergeBothEmpty_transitions0_effects0_state_objectTests0_test(final StringMergingIterator mergingIterator) {
    
    boolean _hasNext = mergingIterator.hasNext();
    assertTrue("! mergingIterator.hasNext failed", (!_hasNext));
    
  }
}
