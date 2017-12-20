package interfaces;

import interfaces.StringGridImpl;
import interfaces.StringGridIterator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.StringGrid")
@SuppressWarnings("all")
public class StringGridTest extends TestCase {
  private StringGridImpl gridImpl;
  
  private StringGridImpl _init_gridImpl() {
    StringGridImpl _stringGridImpl = new StringGridImpl(2, 3);
    return _stringGridImpl;
  }
  
  @Override
  protected void setUp() {
    gridImpl = _init_gridImpl();
    
  }
  
  @JExercise(description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>gridImpl.setElement(0, 0, \"0, 0\"), gridImpl.setElement(0, 1, \"0, 1\"), gridImpl.setElement(0, 2, \"0, 2\"), gridImpl.setElement(1, 0, \"1, 0\"), gridImpl.setElement(1, 1, \"1, 1\"), gridImpl.setElement(1, 2, \"1, 2\")</li>\n\t\t</ul>\n")
  public void testGrid() {
    _transition_exprAction__grid_transitions0_actions0(gridImpl);
    _transition_exprAction__grid_transitions0_actions1(gridImpl);
    _transition_exprAction__grid_transitions0_actions2(gridImpl);
    _transition_exprAction__grid_transitions0_actions3(gridImpl);
    _transition_exprAction__grid_transitions0_actions4(gridImpl);
    _transition_exprAction__grid_transitions0_actions5(gridImpl);
    _test__grid_transitions0_effects0_state(gridImpl);
    
  }
  
  @JExercise(description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>gridImpl.setElement(0, 0, \"0, 0\"), gridImpl.setElement(0, 1, \"0, 1\"), gridImpl.setElement(0, 2, \"0, 2\"), gridImpl.setElement(1, 0, \"1, 0\"), gridImpl.setElement(1, 1, \"1, 1\"), gridImpl.setElement(1, 2, \"1, 2\")</li>\n\t\t<li>gridIterator.next == \"0, 0\"</li>\n\t\t<li>gridIterator.next == \"0, 1\"</li>\n\t\t<li>gridIterator.next == \"0, 2\"</li>\n\t\t<li>gridIterator.next == \"1, 0\"</li>\n\t\t<li>gridIterator.next == \"1, 1\"</li>\n\t\t<li>gridIterator.next == \"1, 2\"</li>\n\t\t</ul>\n")
  public void testGridIteratorRowMajor() {
    StringGridIterator gridIterator = _init__gridIteratorRowMajor_gridIterator();
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions0(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions1(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions2(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions3(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions4(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions0_actions5(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions0_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions1_actions0(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions1_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions2_actions0(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions2_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions3_actions0(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions3_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions4_actions0(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions4_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions5_actions0(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions5_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorRowMajor_transitions6_actions0(gridImpl, gridIterator);
    _test__gridIteratorRowMajor_transitions6_effects0_state(gridImpl, gridIterator);
    
  }
  
  @JExercise(description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>gridImpl.setElement(0, 0, \"0, 0\"), gridImpl.setElement(0, 1, \"0, 1\"), gridImpl.setElement(0, 2, \"0, 2\"), gridImpl.setElement(1, 0, \"1, 0\"), gridImpl.setElement(1, 1, \"1, 1\"), gridImpl.setElement(1, 2, \"1, 2\")</li>\n\t\t<li>gridIterator.next == \"0, 0\"</li>\n\t\t<li>gridIterator.next == \"1, 0\"</li>\n\t\t<li>gridIterator.next == \"0, 1\"</li>\n\t\t<li>gridIterator.next == \"1, 1\"</li>\n\t\t<li>gridIterator.next == \"0, 2\"</li>\n\t\t<li>gridIterator.next == \"1, 2\"</li>\n\t\t</ul>\n")
  public void testGridIteratorColumnMajor() {
    StringGridIterator gridIterator = _init__gridIteratorColumnMajor_gridIterator();
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions0(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions1(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions2(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions3(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions4(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions0_actions5(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions0_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions1_actions0(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions1_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions2_actions0(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions2_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions3_actions0(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions3_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions4_actions0(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions4_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions5_actions0(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions5_effects0_state(gridImpl, gridIterator);
    _transition_exprAction__gridIteratorColumnMajor_transitions6_actions0(gridImpl, gridIterator);
    _test__gridIteratorColumnMajor_transitions6_effects0_state(gridImpl, gridIterator);
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions0(final StringGridImpl it) {
    try {
      
      this.gridImpl.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions1(final StringGridImpl it) {
    try {
      
      this.gridImpl.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions2(final StringGridImpl it) {
    try {
      
      this.gridImpl.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions3(final StringGridImpl it) {
    try {
      
      this.gridImpl.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions4(final StringGridImpl it) {
    try {
      
      this.gridImpl.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions5(final StringGridImpl it) {
    try {
      
      this.gridImpl.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__grid_transitions0_effects0_state(final StringGridImpl it) {
    _test__grid_transitions0_effects0_state_objectTests0_test(gridImpl);
    
  }
  
  private void _test__grid_transitions0_effects0_state_objectTests0_test(final StringGridImpl it) {
    
    String _element = it.getElement(0, 0);
    assertEquals("getElement(0, 0) == \"0, 0\" failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", "0, 0", _element);
    
    String _element_1 = it.getElement(0, 1);
    assertEquals("getElement(0, 1) == \"0, 1\" failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", "0, 1", _element_1);
    
    String _element_2 = it.getElement(0, 2);
    assertEquals("getElement(0, 2) == \"0, 2\" failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", "0, 2", _element_2);
    
    String _element_3 = it.getElement(1, 0);
    assertEquals("getElement(1, 0) == \"1, 0\" failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", "1, 0", _element_3);
    
    String _element_4 = it.getElement(1, 1);
    assertEquals("getElement(1, 1) == \"1, 1\" failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", "1, 1", _element_4);
    
    String _element_5 = it.getElement(1, 2);
    assertEquals("getElement(1, 2) == \"1, 2\" failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", "1, 2", _element_5);
    
  }
  
  private StringGridIterator _init__gridIteratorRowMajor_gridIterator() {
    StringGridIterator _stringGridIterator = new StringGridIterator(this.gridImpl, true);
    return _stringGridIterator;
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions1(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions2(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions3(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions4(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions5(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gridIteratorRowMajor_transitions0_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions0_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions0_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions1_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 0\" failed", "0, 0", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions1_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions1_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions1_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions2_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 1\" failed", "0, 1", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions2_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions2_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions2_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions3_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 2\" failed", "0, 2", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions3_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions3_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions3_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 2\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions4_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 0\" failed", "1, 0", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions4_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions4_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions4_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions5_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 1\" failed", "1, 1", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions5_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions5_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions5_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions6_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 2\" failed", "1, 2", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions6_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorRowMajor_transitions6_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions6_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == false failed after gridIterator.next == \"1, 2\"", false, _hasNext);
    
  }
  
  private StringGridIterator _init__gridIteratorColumnMajor_gridIterator() {
    StringGridIterator _stringGridIterator = new StringGridIterator(this.gridImpl, false);
    return _stringGridIterator;
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions1(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions2(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions3(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions4(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions5(final StringGridImpl it, final StringGridIterator gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions0_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions0_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions0_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions1_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 0\" failed", "0, 0", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions1_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions1_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions1_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions2_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 0\" failed", "1, 0", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions2_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions2_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions2_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions3_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 1\" failed", "0, 1", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions3_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions3_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions3_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions4_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 1\" failed", "1, 1", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions4_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions4_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions4_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions5_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 2\" failed", "0, 2", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions5_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions5_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions5_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 2\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions6_actions0(final StringGridImpl it, final StringGridIterator gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 2\" failed", "1, 2", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions6_effects0_state(final StringGridImpl it, final StringGridIterator gridIterator) {
    _test__gridIteratorColumnMajor_transitions6_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions6_effects0_state_objectTests0_test(final StringGridIterator it, final StringGridIterator gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == false failed after gridIterator.next == \"1, 2\"", false, _hasNext);
    
  }
}
