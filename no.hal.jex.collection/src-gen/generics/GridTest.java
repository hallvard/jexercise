package generics;

import generics.GridImpl;
import generics.GridIterator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests generics.Grid")
@SuppressWarnings("all")
public class GridTest extends TestCase {
  private GridImpl<String> gridImpl;
  
  private GridImpl<String> _init_gridImpl() {
    GridImpl<String> _gridImpl = new GridImpl<String>(2, 3);
    return _gridImpl;
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
    GridIterator<String> gridIterator = _init__gridIteratorRowMajor_gridIterator();
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
    GridIterator<String> gridIterator = _init__gridIteratorColumnMajor_gridIterator();
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
  
  private void _transition_exprAction__grid_transitions0_actions0(final GridImpl<String> it) {
    try {
      
      this.gridImpl.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions1(final GridImpl<String> it) {
    try {
      
      this.gridImpl.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions2(final GridImpl<String> it) {
    try {
      
      this.gridImpl.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions3(final GridImpl<String> it) {
    try {
      
      this.gridImpl.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions4(final GridImpl<String> it) {
    try {
      
      this.gridImpl.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__grid_transitions0_actions5(final GridImpl<String> it) {
    try {
      
      this.gridImpl.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__grid_transitions0_effects0_state(final GridImpl<String> it) {
    _test__grid_transitions0_effects0_state_objectTests0_test(gridImpl);
    
  }
  
  private void _test__grid_transitions0_effects0_state_objectTests0_test(final GridImpl<String> it) {
    
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
  
  private GridIterator<String> _init__gridIteratorRowMajor_gridIterator() {
    GridIterator<String> _gridIterator = new GridIterator<String>(this.gridImpl, true);
    return _gridIterator;
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions1(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions2(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions3(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions4(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions0_actions5(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gridIteratorRowMajor_transitions0_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions0_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions0_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions1_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 0\" failed", "0, 0", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions1_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions1_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions1_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions2_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 1\" failed", "0, 1", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions2_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions2_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions2_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions3_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 2\" failed", "0, 2", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions3_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions3_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions3_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 2\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions4_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 0\" failed", "1, 0", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions4_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions4_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions4_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions5_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 1\" failed", "1, 1", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions5_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions5_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions5_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorRowMajor_transitions6_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 2\" failed", "1, 2", _next);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions6_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorRowMajor_transitions6_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorRowMajor_transitions6_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == false failed after gridIterator.next == \"1, 2\"", false, _hasNext);
    
  }
  
  private GridIterator<String> _init__gridIteratorColumnMajor_gridIterator() {
    GridIterator<String> _gridIterator = new GridIterator<String>(this.gridImpl, false);
    return _gridIterator;
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 0, "0, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 0, \"0, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions1(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 1, "0, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 1, \"0, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions2(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(0, 2, "0, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(0, 2, \"0, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions3(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 0, "1, 0");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 0, \"1, 0\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions4(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 1, "1, 1");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 1, \"1, 1\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions0_actions5(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    try {
      
      this.gridImpl.setElement(1, 2, "1, 2");
      } catch (junit.framework.AssertionFailedError error) {
      fail("gridImpl.setElement(1, 2, \"1, 2\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions0_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions0_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions0_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridImpl.setElement(0, 0, \"0, 0\") ,gridImpl.setElement(0, 1, \"0, 1\") ,gridImpl.setElement(0, 2, \"0, 2\") ,gridImpl.setElement(1, 0, \"1, 0\") ,gridImpl.setElement(1, 1, \"1, 1\") ,gridImpl.setElement(1, 2, \"1, 2\")", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions1_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 0\" failed", "0, 0", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions1_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions1_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions1_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions2_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 0\" failed", "1, 0", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions2_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions2_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions2_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 0\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions3_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 1\" failed", "0, 1", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions3_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions3_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions3_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions4_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 1\" failed", "1, 1", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions4_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions4_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions4_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"1, 1\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions5_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"0, 2\" failed", "0, 2", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions5_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions5_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions5_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == true failed after gridIterator.next == \"0, 2\"", true, _hasNext);
    
  }
  
  private void _transition_exprAction__gridIteratorColumnMajor_transitions6_actions0(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    
    String _next = gridIterator.next();
    assertEquals("gridIterator.next == \"1, 2\" failed", "1, 2", _next);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions6_effects0_state(final GridImpl<String> it, final GridIterator<String> gridIterator) {
    _test__gridIteratorColumnMajor_transitions6_effects0_state_objectTests0_test(gridIterator, gridIterator);
    
  }
  
  private void _test__gridIteratorColumnMajor_transitions6_effects0_state_objectTests0_test(final GridIterator<String> it, final GridIterator<String> gridIterator) {
    
    boolean _hasNext = it.hasNext();
    assertEquals("hasNext == false failed after gridIterator.next == \"1, 2\"", false, _hasNext);
    
  }
}
