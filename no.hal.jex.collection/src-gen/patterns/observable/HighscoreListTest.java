package patterns.observable;

import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.Conversions;
import patterns.observable.HighscoreList;
import patterns.observable.ListListener;
import patterns.observable.ObservableList;

@JExercise(description = "Tests patterns.observable.HighscoreList")
@SuppressWarnings("all")
public class HighscoreListTest extends TestCase {
  private HighscoreList highscoreList;
  
  private HighscoreList _init_highscoreList() {
    HighscoreList _highscoreList = new HighscoreList(3);
    return _highscoreList;
  }
  
  private int pos1;
  
  private int _init_pos1() {
    int _minus = (-1);
    return _minus;
  }
  
  private int pos2;
  
  private int _init_pos2() {
    int _minus = (-1);
    return _minus;
  }
  
  @Override
  protected void setUp() {
    highscoreList = _init_highscoreList();
    pos1 = _init_pos1();
    pos2 = _init_pos2();
    
  }
  
  private void addResult(final int element, final int pos) {
    this.pos1 = pos;
    this.highscoreList.addResult(Integer.valueOf(element));
    Assert.assertEquals(this.pos1, this.pos2);
  }
  
  private void testElements(final int... elements) {
    int _length = elements.length;
    int _size = this.highscoreList.size();
    Assert.assertEquals(_length, _size);
    final Iterator<Integer> iterator = ((List<Integer>)Conversions.doWrapArray(elements)).iterator();
    int i = 0;
    boolean _hasNext = iterator.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final Integer next = iterator.next();
        Object _element = this.highscoreList.getElement(i);
        Assert.assertEquals(next, _element);
        int _plus = (i + 1);
        i = _plus;
      }
      boolean _hasNext_1 = iterator.hasNext();
      _while = _hasNext_1;
    }
  }
  
  @JExercise(tests = "HighscoreList(int)", description = "Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "HighscoreList(int);int addResult(Integer)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>highscoreList.addResult(5)</li>\n\t\t<li>highscoreList.addResult(6)</li>\n\t\t<li>highscoreList.addResult(2)</li>\n\t\t</ul>\n")
  public void testAddElementSimple() {
    _transition_exprAction__addElementSimple_transitions0_actions0();
    _test__addElementSimple_transitions0_effect_state();
    _transition_exprAction__addElementSimple_transitions1_actions0();
    _test__addElementSimple_transitions1_effect_state();
    _transition_exprAction__addElementSimple_transitions2_actions0();
    _test__addElementSimple_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "HighscoreList(int);int addResult(Integer)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>highscoreList.addResult(5), highscoreList.addResult(6), highscoreList.addResult(2)</li>\n\t\t<li>highscoreList.addResult(3)</li>\n\t\t<li>highscoreList.addResult(7)</li>\n\t\t</ul>\n")
  public void testAddElementMoreThanMax() {
    _transition_exprAction__addElementMoreThanMax_transitions0_actions0();
    _transition_exprAction__addElementMoreThanMax_transitions0_actions1();
    _transition_exprAction__addElementMoreThanMax_transitions0_actions2();
    _test__addElementMoreThanMax_transitions0_effect_state();
    _transition_exprAction__addElementMoreThanMax_transitions1_actions0();
    _test__addElementMoreThanMax_transitions1_effect_state();
    _transition_exprAction__addElementMoreThanMax_transitions2_actions0();
    _test__addElementMoreThanMax_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "HighscoreList(int);int addResult(Integer)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>highscoreList.addResult(5), highscoreList.addResult(6), highscoreList.addResult(2)</li>\n\t\t<li>highscoreList.addResult(2)</li>\n\t\t</ul>\n")
  public void testAddElementDuplicate() {
    _transition_exprAction__addElementDuplicate_transitions0_actions0();
    _transition_exprAction__addElementDuplicate_transitions0_actions1();
    _transition_exprAction__addElementDuplicate_transitions0_actions2();
    _test__addElementDuplicate_transitions0_effect_state();
    _transition_exprAction__addElementDuplicate_transitions1_actions0();
    _test__addElementDuplicate_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "HighscoreList(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>highscoreList.addListListener([list, pos | pos2 = pos]), addResult(5, 0)</li>\n\t\t<li>addResult(6, 1)</li>\n\t\t<li>addResult(2, 0)</li>\n\t\t</ul>\n")
  public void testListListenerSimple() {
    _transition_exprAction__listListenerSimple_transitions0_actions0();
    _transition_exprAction__listListenerSimple_transitions0_actions1();
    _test__listListenerSimple_transitions0_effect_state();
    _transition_exprAction__listListenerSimple_transitions1_actions0();
    _test__listListenerSimple_transitions1_effect_state();
    _transition_exprAction__listListenerSimple_transitions2_actions0();
    _test__listListenerSimple_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "HighscoreList(int);int addResult(Integer)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>highscoreList.addListListener([list, pos | pos2 = pos]), highscoreList.addResult(5), highscoreList.addResult(6), highscoreList.addResult(2)</li>\n\t\t<li>addResult(3, 1)</li>\n\t\t<li>pos2 = -1, addResult(7, -1)</li>\n\t\t</ul>\n")
  public void testListListenerMoreThanMax() {
    _transition_exprAction__listListenerMoreThanMax_transitions0_actions0();
    _transition_exprAction__listListenerMoreThanMax_transitions0_actions1();
    _transition_exprAction__listListenerMoreThanMax_transitions0_actions2();
    _transition_exprAction__listListenerMoreThanMax_transitions0_actions3();
    _test__listListenerMoreThanMax_transitions0_effect_state();
    _transition_exprAction__listListenerMoreThanMax_transitions1_actions0();
    _test__listListenerMoreThanMax_transitions1_effect_state();
    _transition_exprAction__listListenerMoreThanMax_transitions2_actions0();
    _transition_exprAction__listListenerMoreThanMax_transitions2_actions1();
    _test__listListenerMoreThanMax_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "HighscoreList(int);int addResult(Integer)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>highscoreList.addListListener([list, pos | pos2 = pos]), highscoreList.addResult(5), highscoreList.addResult(6), highscoreList.addResult(2)</li>\n\t\t<li>addResult(2, 1)</li>\n\t\t</ul>\n")
  public void testListListenerDuplicate() {
    _transition_exprAction__listListenerDuplicate_transitions0_actions0();
    _transition_exprAction__listListenerDuplicate_transitions0_actions1();
    _transition_exprAction__listListenerDuplicate_transitions0_actions2();
    _transition_exprAction__listListenerDuplicate_transitions0_actions3();
    _test__listListenerDuplicate_transitions0_effect_state();
    _transition_exprAction__listListenerDuplicate_transitions1_actions0();
    _test__listListenerDuplicate_transitions1_effect_state();
    
  }
  
  private void _test__constructor_transitions0_effect_state() {
    _test__constructor_transitions0_effect_state_objectTests0_test(highscoreList);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final HighscoreList it) {
    
    int _size = it.size();
    assertEquals("size() == 0 failed", 0, _size);
    
  }
  
  private void _transition_exprAction__addElementSimple_transitions0_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(5));
    
  }
  
  private void _test__addElementSimple_transitions0_effect_state() {
    _test__addElementSimple_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementSimple_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5) failed after highscoreList.addResult(5): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementSimple_transitions1_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(6));
    
  }
  
  private void _test__addElementSimple_transitions1_effect_state() {
    _test__addElementSimple_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementSimple_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5, 6) failed after highscoreList.addResult(6): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementSimple_transitions2_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(2));
    
  }
  
  private void _test__addElementSimple_transitions2_effect_state() {
    _test__addElementSimple_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementSimple_transitions2_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after highscoreList.addResult(2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementMoreThanMax_transitions0_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(5));
    
  }
  
  private void _transition_exprAction__addElementMoreThanMax_transitions0_actions1() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(6));
    
  }
  
  private void _transition_exprAction__addElementMoreThanMax_transitions0_actions2() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(2));
    
  }
  
  private void _test__addElementMoreThanMax_transitions0_effect_state() {
    _test__addElementMoreThanMax_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementMoreThanMax_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after highscoreList.addResult(5) ,highscoreList.addResult(6) ,highscoreList.addResult(2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementMoreThanMax_transitions1_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(3));
    
  }
  
  private void _test__addElementMoreThanMax_transitions1_effect_state() {
    _test__addElementMoreThanMax_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementMoreThanMax_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 3, 5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 3, 5) failed after highscoreList.addResult(3): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementMoreThanMax_transitions2_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(7));
    
  }
  
  private void _test__addElementMoreThanMax_transitions2_effect_state() {
    _test__addElementMoreThanMax_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementMoreThanMax_transitions2_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 3, 5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 3, 5) failed after highscoreList.addResult(7): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementDuplicate_transitions0_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(5));
    
  }
  
  private void _transition_exprAction__addElementDuplicate_transitions0_actions1() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(6));
    
  }
  
  private void _transition_exprAction__addElementDuplicate_transitions0_actions2() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(2));
    
  }
  
  private void _test__addElementDuplicate_transitions0_effect_state() {
    _test__addElementDuplicate_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementDuplicate_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after highscoreList.addResult(5) ,highscoreList.addResult(6) ,highscoreList.addResult(2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElementDuplicate_transitions1_actions0() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(2));
    
  }
  
  private void _test__addElementDuplicate_transitions1_effect_state() {
    _test__addElementDuplicate_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElementDuplicate_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 2, 5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 2, 5) failed after highscoreList.addResult(2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerSimple_transitions0_actions0() {
    try {
      
      final ListListener _function = new ListListener() {
        public void listChanged(final ObservableList list, final int pos) {
          HighscoreListTest.this.pos2 = pos;
        }
      };
      this.highscoreList.addListListener(_function);
      } catch (junit.framework.AssertionFailedError error) {
      fail("highscoreList.addListListener([list, pos | pos2 = pos]) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerSimple_transitions0_actions1() {
    try {
      
      this.addResult(5, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addResult(5, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListenerSimple_transitions0_effect_state() {
    _test__listListenerSimple_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerSimple_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5) failed after highscoreList.addListListener([list, pos | pos2 = pos]) ,addResult(5, 0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerSimple_transitions1_actions0() {
    try {
      
      this.addResult(6, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addResult(6, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListenerSimple_transitions1_effect_state() {
    _test__listListenerSimple_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerSimple_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5, 6) failed after addResult(6, 1): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerSimple_transitions2_actions0() {
    try {
      
      this.addResult(2, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addResult(2, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListenerSimple_transitions2_effect_state() {
    _test__listListenerSimple_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerSimple_transitions2_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after addResult(2, 0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions0_actions0() {
    try {
      
      final ListListener _function = new ListListener() {
        public void listChanged(final ObservableList list, final int pos) {
          HighscoreListTest.this.pos2 = pos;
        }
      };
      this.highscoreList.addListListener(_function);
      } catch (junit.framework.AssertionFailedError error) {
      fail("highscoreList.addListListener([list, pos | pos2 = pos]) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions0_actions1() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(5));
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions0_actions2() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(6));
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions0_actions3() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(2));
    
  }
  
  private void _test__listListenerMoreThanMax_transitions0_effect_state() {
    _test__listListenerMoreThanMax_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerMoreThanMax_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after highscoreList.addListListener([list, pos | pos2 = pos]) ,highscoreList.addResult(5) ,highscoreList.addResult(6) ,highscoreList.addResult(2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions1_actions0() {
    try {
      
      this.addResult(3, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addResult(3, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListenerMoreThanMax_transitions1_effect_state() {
    _test__listListenerMoreThanMax_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerMoreThanMax_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 3, 5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 3, 5) failed after addResult(3, 1): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions2_actions0() {
    
    int _minus = (-1);
    int _pos2 = this.pos2 = _minus;
    
  }
  
  private void _transition_exprAction__listListenerMoreThanMax_transitions2_actions1() {
    try {
      
      int _minus = (-1);
      this.addResult(7, _minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addResult(7, -1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListenerMoreThanMax_transitions2_effect_state() {
    _test__listListenerMoreThanMax_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerMoreThanMax_transitions2_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 3, 5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 3, 5) failed after pos2 = -1 ,addResult(7, -1): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerDuplicate_transitions0_actions0() {
    try {
      
      final ListListener _function = new ListListener() {
        public void listChanged(final ObservableList list, final int pos) {
          HighscoreListTest.this.pos2 = pos;
        }
      };
      this.highscoreList.addListListener(_function);
      } catch (junit.framework.AssertionFailedError error) {
      fail("highscoreList.addListListener([list, pos | pos2 = pos]) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerDuplicate_transitions0_actions1() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(5));
    
  }
  
  private void _transition_exprAction__listListenerDuplicate_transitions0_actions2() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(6));
    
  }
  
  private void _transition_exprAction__listListenerDuplicate_transitions0_actions3() {
    
    int _addResult = this.highscoreList.addResult(Integer.valueOf(2));
    
  }
  
  private void _test__listListenerDuplicate_transitions0_effect_state() {
    _test__listListenerDuplicate_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerDuplicate_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after highscoreList.addListListener([list, pos | pos2 = pos]) ,highscoreList.addResult(5) ,highscoreList.addResult(6) ,highscoreList.addResult(2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListenerDuplicate_transitions1_actions0() {
    try {
      
      this.addResult(2, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addResult(2, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListenerDuplicate_transitions1_effect_state() {
    _test__listListenerDuplicate_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListenerDuplicate_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 2, 5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 2, 5) failed after addResult(2, 1): " + error.getMessage());
    }
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(HighscoreListTest.class);
  }
}
