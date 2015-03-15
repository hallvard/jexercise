package patterns.observable.inheritance;

import java.util.Iterator;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.Conversions;
import patterns.observable.inheritance.ListListener;
import patterns.observable.inheritance.ObservableList;

@JExercise(description = "Tests patterns.observable.inheritance.ObservableList")
@SuppressWarnings("all")
public class ObservableListTest extends TestCase {
  private ObservableList observableList;
  
  private ObservableList _init_observableList() {
    final ObservableList _function = new ObservableList() {
      @Override
      public boolean acceptsElement(final Object element) {
        return (element instanceof Integer);
      }
    };
    return _function;
  }
  
  private int pos1;
  
  private int _init_pos1() {
    return (-1);
  }
  
  private int pos2;
  
  private int _init_pos2() {
    return (-1);
  }
  
  @Override
  protected void setUp() {
    observableList = _init_observableList();
    pos1 = _init_pos1();
    pos2 = _init_pos2();
    
  }
  
  private void addElement(final int element, final int pos) {
    this.pos1 = pos;
    this.observableList.addElement(pos, Integer.valueOf(element));
    TestCase.assertEquals(this.pos1, this.pos2);
  }
  
  private void testElements(final int... elements) {
    int _length = elements.length;
    int _size = this.observableList.size();
    TestCase.assertEquals(_length, _size);
    final Iterator<Integer> iterator = ((List<Integer>)Conversions.doWrapArray(elements)).iterator();
    int i = 0;
    while (iterator.hasNext()) {
      {
        final Integer next = iterator.next();
        Object _element = this.observableList.getElement(i);
        TestCase.assertEquals(next, _element);
        i = (i + 1);
      }
    }
  }
  
  @JExercise(description = "Tests \r\n\t\tinitialization\r\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "void addElement(Object)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>observableList.addElement(\"5\")</li>\r\n\t\t</ul>\r\n")
  public void testAcceptsElement() {
    _test__acceptsElement_transitions0_effect_state();
    try {
      _transition_exprAction__acceptsElement_transitions1_actions0();
      fail("IllegalArgumentException should be thrown after observableList.addElement(\"5\")");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after observableList.addElement(\"5\")", e instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "void addElement(Object);void addElement(int,Object)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>observableList.addElement(5)</li>\r\n\t\t<li>observableList.addElement(6)</li>\r\n\t\t<li>observableList.addElement(0, 2)</li>\r\n\t\t</ul>\r\n")
  public void testAddElement() {
    _transition_exprAction__addElement_transitions0_actions0();
    _test__addElement_transitions0_effect_state();
    _transition_exprAction__addElement_transitions1_actions0();
    _test__addElement_transitions1_effect_state();
    _transition_exprAction__addElement_transitions2_actions0();
    _test__addElement_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "void addListListener(patterns.observable.inheritance.ListListener)", description = "Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>observableList.addListListener([list, pos | pos2 = pos]), addElement(5, 0)</li>\r\n\t\t<li>addElement(6, 1)</li>\r\n\t\t<li>addElement(2, 0)</li>\r\n\t\t</ul>\r\n")
  public void testListListener() {
    _transition_exprAction__listListener_transitions0_actions0();
    _transition_exprAction__listListener_transitions0_actions1();
    _test__listListener_transitions0_effect_state();
    _transition_exprAction__listListener_transitions1_actions0();
    _test__listListener_transitions1_effect_state();
    _transition_exprAction__listListener_transitions2_actions0();
    _test__listListener_transitions2_effect_state();
    
  }
  
  private void _test__constructor_transitions0_effect_state() {
    _test__constructor_transitions0_effect_state_objectTests0_test(observableList);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final ObservableList it) {
    
    int _size = it.size();
    assertEquals("size() == 0 failed", 0, _size);
    
  }
  
  private void _test__acceptsElement_transitions0_effect_state() {
    _test__acceptsElement_transitions0_effect_state_objectTests0_test(observableList);
    
  }
  
  private void _test__acceptsElement_transitions0_effect_state_objectTests0_test(final ObservableList it) {
    
    boolean _acceptsElement = it.acceptsElement(Integer.valueOf(5));
    assertTrue("acceptsElement(5) failed", _acceptsElement);
    
    boolean _acceptsElement_1 = it.acceptsElement("5");
    assertTrue("! acceptsElement(\"5\") failed", (!_acceptsElement_1));
    
  }
  
  private void _transition_exprAction__acceptsElement_transitions1_actions0() {
    try {
      
      this.observableList.addElement("5");
      } catch (junit.framework.AssertionFailedError error) {
      fail("observableList.addElement(\"5\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElement_transitions0_actions0() {
    try {
      
      this.observableList.addElement(Integer.valueOf(5));
      } catch (junit.framework.AssertionFailedError error) {
      fail("observableList.addElement(5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addElement_transitions0_effect_state() {
    _test__addElement_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElement_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5) failed after observableList.addElement(5): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElement_transitions1_actions0() {
    try {
      
      this.observableList.addElement(Integer.valueOf(6));
      } catch (junit.framework.AssertionFailedError error) {
      fail("observableList.addElement(6) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addElement_transitions1_effect_state() {
    _test__addElement_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElement_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5, 6) failed after observableList.addElement(6): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addElement_transitions2_actions0() {
    try {
      
      this.observableList.addElement(0, Integer.valueOf(2));
      } catch (junit.framework.AssertionFailedError error) {
      fail("observableList.addElement(0, 2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addElement_transitions2_effect_state() {
    _test__addElement_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__addElement_transitions2_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after observableList.addElement(0, 2): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListener_transitions0_actions0() {
    try {
      
      final ListListener _function = new ListListener() {
        public void listChanged(final ObservableList list, final int pos) {
          ObservableListTest.this.pos2 = pos;
        }
      };
      this.observableList.addListListener(_function);
      } catch (junit.framework.AssertionFailedError error) {
      fail("observableList.addListListener([list, pos | pos2 = pos]) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListener_transitions0_actions1() {
    try {
      
      this.addElement(5, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addElement(5, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListener_transitions0_effect_state() {
    _test__listListener_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListener_transitions0_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5) failed after observableList.addListListener([list, pos | pos2 = pos]) ,addElement(5, 0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListener_transitions1_actions0() {
    try {
      
      this.addElement(6, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addElement(6, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListener_transitions1_effect_state() {
    _test__listListener_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListener_transitions1_effect_state_objectTests0_test() {
    try {
      
      this.testElements(5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(5, 6) failed after addElement(6, 1): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__listListener_transitions2_actions0() {
    try {
      
      this.addElement(2, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addElement(2, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__listListener_transitions2_effect_state() {
    _test__listListener_transitions2_effect_state_objectTests0_test();
    
  }
  
  private void _test__listListener_transitions2_effect_state_objectTests0_test() {
    try {
      
      this.testElements(2, 5, 6);
      } catch (junit.framework.AssertionFailedError error) {
      fail("testElements(2, 5, 6) failed after addElement(2, 0): " + error.getMessage());
    }
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(ObservableListTest.class);
  }
}
