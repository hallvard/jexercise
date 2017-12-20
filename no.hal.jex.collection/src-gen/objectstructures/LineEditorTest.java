package objectstructures;

import java.util.Collections;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.jextest.extensions.JextestExtensions;
import no.hal.jex.runtime.JExercise;
import objectstructures.LineEditor;
import objectstructures.Region;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@JExercise(description = "Tests objectstructures.LineEditor")
@SuppressWarnings("all")
public class LineEditorTest extends TestCase {
  private LineEditor empty;
  
  private LineEditor _init_empty() {
    LineEditor _lineEditor = new LineEditor();
    return _lineEditor;
  }
  
  private LineEditor left;
  
  private LineEditor _init_left() {
    LineEditor _lineEditor = new LineEditor("Hallvard", 0, (-1));
    return _lineEditor;
  }
  
  private LineEditor middle;
  
  private LineEditor _init_middle() {
    LineEditor _lineEditor = new LineEditor("Hallvard", 4, (-1));
    return _lineEditor;
  }
  
  private LineEditor regionLeft;
  
  private LineEditor _init_regionLeft() {
    LineEditor _lineEditor = new LineEditor("Hallvard", 3, 5);
    return _lineEditor;
  }
  
  private LineEditor regionRight;
  
  private LineEditor _init_regionRight() {
    LineEditor _lineEditor = new LineEditor("Hallvard", 5, 3);
    return _lineEditor;
  }
  
  private LineEditor right;
  
  private LineEditor _init_right() {
    LineEditor _lineEditor = new LineEditor("Hallvard", 8, (-1));
    return _lineEditor;
  }
  
  @Override
  protected void setUp() {
    empty = _init_empty();
    left = _init_left();
    middle = _init_middle();
    regionLeft = _init_regionLeft();
    regionRight = _init_regionRight();
    right = _init_right();
    
  }
  
  private boolean operator_assertEquals(final LineEditor lineEditor, final String s) {
    String _string = lineEditor.toString();
    return JextestExtensions.operator_assertEquals(_string, s);
  }
  
  private boolean operator_assertEquals(final LineEditor lineEditor, final List<Integer> regions) {
    int _regionCount = lineEditor.getRegionCount();
    int _multiply = (_regionCount * 2);
    int _size = regions.size();
    boolean _notEquals = (_multiply != _size);
    if (_notEquals) {
      return false;
    }
    for (int i = 0; (i < lineEditor.getRegionCount()); i++) {
      {
        final Region it = lineEditor.getRegion(i);
        boolean _not = (!(JextestExtensions.operator_assertEquals(it.getStartPos(), (regions.get((i * 2))).intValue()) && JextestExtensions.operator_assertEquals(it.getEndPos(), (regions.get(((i * 2) + 1))).intValue())));
        if (_not) {
          return false;
        }
      }
    }
    return true;
  }
  
  private boolean operator_assertEquals(final LineEditor lineEditor, final Pair<String, List<Integer>> textRegions) {
    return (JextestExtensions.operator_assertEquals(lineEditor.toString(), textRegions.getKey()) && this.operator_assertEquals(lineEditor, textRegions.getValue()));
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int)", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int)", description = "<h3>toString</h3>Tests \n\t\tinitialization\n")
  public void testToString() {
    _test__toString_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void left(boolean)", description = "<h3>left</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>empty.left(false), left.left(false), middle.left(false), regionLeft.left(false), regionRight.left(false), right.left(false)</li>\n\t\t</ul>\n")
  public void testLeft() {
    _transition_exprAction__left_transitions0_actions0();
    _transition_exprAction__left_transitions0_actions1();
    _transition_exprAction__left_transitions0_actions2();
    _transition_exprAction__left_transitions0_actions3();
    _transition_exprAction__left_transitions0_actions4();
    _transition_exprAction__left_transitions0_actions5();
    _test__left_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void right(boolean)", description = "<h3>right</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>empty.right(false), left.right(false), middle.right(false), regionLeft.right(false), regionRight.right(false), right.right(false)</li>\n\t\t</ul>\n")
  public void testRight() {
    _transition_exprAction__right_transitions0_actions0();
    _transition_exprAction__right_transitions0_actions1();
    _transition_exprAction__right_transitions0_actions2();
    _transition_exprAction__right_transitions0_actions3();
    _transition_exprAction__right_transitions0_actions4();
    _transition_exprAction__right_transitions0_actions5();
    _test__right_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void replaceRegion(String)", description = "<h3>replaceRegion</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>empty.replaceRegion(\"?!\"), left.replaceRegion(\"?!\"), middle.replaceRegion(\"?!\"), regionLeft.replaceRegion(\"?!\"), regionRight.replaceRegion(\"?!\"), right.replaceRegion(\"?!\")</li>\n\t\t</ul>\n")
  public void testReplaceRegion() {
    _transition_exprAction__replaceRegion_transitions0_actions0();
    _transition_exprAction__replaceRegion_transitions0_actions1();
    _transition_exprAction__replaceRegion_transitions0_actions2();
    _transition_exprAction__replaceRegion_transitions0_actions3();
    _transition_exprAction__replaceRegion_transitions0_actions4();
    _transition_exprAction__replaceRegion_transitions0_actions5();
    _test__replaceRegion_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void deleteLeft()", description = "<h3>deleteLeft</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>empty.deleteLeft, left.deleteLeft, middle.deleteLeft, regionLeft.deleteLeft, regionRight.deleteLeft, right.deleteLeft</li>\n\t\t</ul>\n")
  public void testDeleteLeft() {
    _transition_exprAction__deleteLeft_transitions0_actions0();
    _transition_exprAction__deleteLeft_transitions0_actions1();
    _transition_exprAction__deleteLeft_transitions0_actions2();
    _transition_exprAction__deleteLeft_transitions0_actions3();
    _transition_exprAction__deleteLeft_transitions0_actions4();
    _transition_exprAction__deleteLeft_transitions0_actions5();
    _test__deleteLeft_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void deleteRight()", description = "<h3>deleteRight</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>empty.deleteRight, left.deleteRight, middle.deleteRight, regionLeft.deleteRight, regionRight.deleteRight, right.deleteRight</li>\n\t\t</ul>\n")
  public void testDeleteRight() {
    _transition_exprAction__deleteRight_transitions0_actions0();
    _transition_exprAction__deleteRight_transitions0_actions1();
    _transition_exprAction__deleteRight_transitions0_actions2();
    _transition_exprAction__deleteRight_transitions0_actions3();
    _transition_exprAction__deleteRight_transitions0_actions4();
    _transition_exprAction__deleteRight_transitions0_actions5();
    _test__deleteRight_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void insertTag(String)", description = "<h3>insertTag</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>empty.insertTag(\"?!\"), left.insertTag(\"?!\"), middle.insertTag(\"?!\"), regionLeft.insertTag(\"?!\"), regionRight.insertTag(\"?!\"), right.insertTag(\"?!\")</li>\n\t\t</ul>\n")
  public void testInsertTag() {
    _transition_exprAction__insertTag_transitions0_actions0();
    _transition_exprAction__insertTag_transitions0_actions1();
    _transition_exprAction__insertTag_transitions0_actions2();
    _transition_exprAction__insertTag_transitions0_actions3();
    _transition_exprAction__insertTag_transitions0_actions4();
    _transition_exprAction__insertTag_transitions0_actions5();
    _test__insertTag_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "LineEditor();LineEditor(String,int,int);void insertTag(String);void left(boolean);void replaceRegion(String);void deleteLeft()", description = "<h3>insertTagEdit</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>regionLeft.insertTag(\"?!\")</li>\n\t\t<li>regionLeft.left(false)</li>\n\t\t<li>regionLeft.replaceRegion(\"xy\")</li>\n\t\t<li>regionLeft.deleteLeft()</li>\n\t\t</ul>\n")
  public void testInsertTagEdit() {
    _transition_exprAction__insertTagEdit_transitions0_actions0();
    _test__insertTagEdit_transitions0_effects0_state();
    _transition_exprAction__insertTagEdit_transitions1_actions0();
    _test__insertTagEdit_transitions1_effects0_state();
    _transition_exprAction__insertTagEdit_transitions2_actions0();
    _test__insertTagEdit_transitions2_effects0_state();
    _transition_exprAction__insertTagEdit_transitions3_actions0();
    _test__insertTagEdit_transitions3_effects0_state();
    
  }
  
  private void _test__constructor_transitions0_effects0_state() {
    _test__constructor_transitions0_effects0_state_objectTests0_test(empty);
    _test__constructor_transitions0_effects0_state_objectTests1_test(left);
    _test__constructor_transitions0_effects0_state_objectTests2_test(middle);
    _test__constructor_transitions0_effects0_state_objectTests3_test(regionLeft);
    _test__constructor_transitions0_effects0_state_objectTests4_test(regionRight);
    _test__constructor_transitions0_effects0_state_objectTests5_test(right);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    String _text = it.getText();
    assertEquals("text == \"\" failed", "", _text);
    
    int _insertionIndex = it.getInsertionIndex();
    assertEquals("insertionIndex == 0 failed", 0, _insertionIndex);
    
    int _end = it.getEnd();
    assertEquals("end == 0 failed", 0, _end);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests1_test(final LineEditor it) {
    
    String _text = it.getText();
    assertEquals("text == \"Hallvard\" failed", "Hallvard", _text);
    
    int _insertionIndex = it.getInsertionIndex();
    assertEquals("insertionIndex == 0 failed", 0, _insertionIndex);
    
    int _end = it.getEnd();
    assertEquals("end == 0 failed", 0, _end);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests2_test(final LineEditor it) {
    
    String _text = it.getText();
    assertEquals("text == \"Hallvard\" failed", "Hallvard", _text);
    
    int _insertionIndex = it.getInsertionIndex();
    assertEquals("insertionIndex == 4 failed", 4, _insertionIndex);
    
    int _end = it.getEnd();
    assertEquals("end == 4 failed", 4, _end);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests3_test(final LineEditor it) {
    
    String _text = it.getText();
    assertEquals("text == \"Hallvard\" failed", "Hallvard", _text);
    
    int _insertionIndex = it.getInsertionIndex();
    assertEquals("insertionIndex == 3 failed", 3, _insertionIndex);
    
    int _end = it.getEnd();
    assertEquals("end == 5 failed", 5, _end);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests4_test(final LineEditor it) {
    
    String _text = it.getText();
    assertEquals("text == \"Hallvard\" failed", "Hallvard", _text);
    
    int _insertionIndex = it.getInsertionIndex();
    assertEquals("insertionIndex == 5 failed", 5, _insertionIndex);
    
    int _end = it.getEnd();
    assertEquals("end == 3 failed", 3, _end);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests5_test(final LineEditor it) {
    
    String _text = it.getText();
    assertEquals("text == \"Hallvard\" failed", "Hallvard", _text);
    
    int _insertionIndex = it.getInsertionIndex();
    assertEquals("insertionIndex == 8 failed", 8, _insertionIndex);
    
    int _end = it.getEnd();
    assertEquals("end == 8 failed", 8, _end);
    
  }
  
  private void _test__toString_transitions0_effects0_state() {
    _test__toString_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__toString_transitions0_effects0_state_objectTests0_test() {
    
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, "|>");
    assertTrue("empty ?= \"|>\" failed", _assertEquals);
    
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, "|>Hallvard");
    assertTrue("left ?= \"|>Hallvard\" failed", _assertEquals_1);
    
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, "Hall|>vard");
    assertTrue("middle ?= \"Hall|>vard\" failed", _assertEquals_2);
    
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, "Hal|lv>ard");
    assertTrue("regionLeft ?= \"Hal|lv>ard\" failed", _assertEquals_3);
    
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, "Hal<lv|ard");
    assertTrue("regionRight ?= \"Hal<lv|ard\" failed", _assertEquals_4);
    
    assertTrue("right ?= \"Hallvard|>\" failed", this.operator_assertEquals(
      this.right, "Hallvard|>"));
    
  }
  
  private void _transition_exprAction__left_transitions0_actions0() {
    try {
      
      this.empty.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("empty.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions0_actions1() {
    try {
      
      this.left.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("left.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions0_actions2() {
    try {
      
      this.middle.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("middle.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions0_actions3() {
    try {
      
      this.regionLeft.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions0_actions4() {
    try {
      
      this.regionRight.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionRight.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions0_actions5() {
    try {
      
      this.right.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("right.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__left_transitions0_effects0_state() {
    _test__left_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__left_transitions0_effects0_state_objectTests0_test() {
    
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, "|>");
    assertTrue("empty ?= \"|>\" failed after empty.left(false) ,left.left(false) ,middle.left(false) ,regionLeft.left(false) ,regionRight.left(false) ,right.left(false)", _assertEquals);
    
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, "|>Hallvard");
    assertTrue("left ?= \"|>Hallvard\" failed after empty.left(false) ,left.left(false) ,middle.left(false) ,regionLeft.left(false) ,regionRight.left(false) ,right.left(false)", _assertEquals_1);
    
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, "Hal|>lvard");
    assertTrue("middle ?= \"Hal|>lvard\" failed after empty.left(false) ,left.left(false) ,middle.left(false) ,regionLeft.left(false) ,regionRight.left(false) ,right.left(false)", _assertEquals_2);
    
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, "Hal|>lvard");
    assertTrue("regionLeft ?= \"Hal|>lvard\" failed after empty.left(false) ,left.left(false) ,middle.left(false) ,regionLeft.left(false) ,regionRight.left(false) ,right.left(false)", _assertEquals_3);
    
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, "Hal|>lvard");
    assertTrue("regionRight ?= \"Hal|>lvard\" failed after empty.left(false) ,left.left(false) ,middle.left(false) ,regionLeft.left(false) ,regionRight.left(false) ,right.left(false)", _assertEquals_4);
    
    assertTrue("right ?= \"Hallvar|>d\" failed after empty.left(false) ,left.left(false) ,middle.left(false) ,regionLeft.left(false) ,regionRight.left(false) ,right.left(false)", this.operator_assertEquals(
      this.right, "Hallvar|>d"));
    
  }
  
  private void _transition_exprAction__right_transitions0_actions0() {
    try {
      
      this.empty.right(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("empty.right(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions0_actions1() {
    try {
      
      this.left.right(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("left.right(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions0_actions2() {
    try {
      
      this.middle.right(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("middle.right(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions0_actions3() {
    try {
      
      this.regionLeft.right(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.right(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions0_actions4() {
    try {
      
      this.regionRight.right(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionRight.right(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions0_actions5() {
    try {
      
      this.right.right(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("right.right(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__right_transitions0_effects0_state() {
    _test__right_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__right_transitions0_effects0_state_objectTests0_test() {
    
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, "|>");
    assertTrue("empty ?= \"|>\" failed after empty.right(false) ,left.right(false) ,middle.right(false) ,regionLeft.right(false) ,regionRight.right(false) ,right.right(false)", _assertEquals);
    
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, "H|>allvard");
    assertTrue("left ?= \"H|>allvard\" failed after empty.right(false) ,left.right(false) ,middle.right(false) ,regionLeft.right(false) ,regionRight.right(false) ,right.right(false)", _assertEquals_1);
    
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, "Hallv|>ard");
    assertTrue("middle ?= \"Hallv|>ard\" failed after empty.right(false) ,left.right(false) ,middle.right(false) ,regionLeft.right(false) ,regionRight.right(false) ,right.right(false)", _assertEquals_2);
    
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, "Hallv|>ard");
    assertTrue("regionLeft ?= \"Hallv|>ard\" failed after empty.right(false) ,left.right(false) ,middle.right(false) ,regionLeft.right(false) ,regionRight.right(false) ,right.right(false)", _assertEquals_3);
    
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, "Hallv|>ard");
    assertTrue("regionRight ?= \"Hallv|>ard\" failed after empty.right(false) ,left.right(false) ,middle.right(false) ,regionLeft.right(false) ,regionRight.right(false) ,right.right(false)", _assertEquals_4);
    
    assertTrue("right ?= \"Hallvard|>\" failed after empty.right(false) ,left.right(false) ,middle.right(false) ,regionLeft.right(false) ,regionRight.right(false) ,right.right(false)", this.operator_assertEquals(
      this.right, "Hallvard|>"));
    
  }
  
  private void _transition_exprAction__replaceRegion_transitions0_actions0() {
    try {
      
      this.empty.replaceRegion("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("empty.replaceRegion(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__replaceRegion_transitions0_actions1() {
    try {
      
      this.left.replaceRegion("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("left.replaceRegion(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__replaceRegion_transitions0_actions2() {
    try {
      
      this.middle.replaceRegion("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("middle.replaceRegion(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__replaceRegion_transitions0_actions3() {
    try {
      
      this.regionLeft.replaceRegion("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.replaceRegion(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__replaceRegion_transitions0_actions4() {
    try {
      
      this.regionRight.replaceRegion("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionRight.replaceRegion(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__replaceRegion_transitions0_actions5() {
    try {
      
      this.right.replaceRegion("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("right.replaceRegion(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__replaceRegion_transitions0_effects0_state() {
    _test__replaceRegion_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__replaceRegion_transitions0_effects0_state_objectTests0_test() {
    
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, "?!|>");
    assertTrue("empty ?= \"?!|>\" failed after empty.replaceRegion(\"?!\") ,left.replaceRegion(\"?!\") ,middle.replaceRegion(\"?!\") ,regionLeft.replaceRegion(\"?!\") ,regionRight.replaceRegion(\"?!\") ,right.replaceRegion(\"?!\")", _assertEquals);
    
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, "?!|>Hallvard");
    assertTrue("left ?= \"?!|>Hallvard\" failed after empty.replaceRegion(\"?!\") ,left.replaceRegion(\"?!\") ,middle.replaceRegion(\"?!\") ,regionLeft.replaceRegion(\"?!\") ,regionRight.replaceRegion(\"?!\") ,right.replaceRegion(\"?!\")", _assertEquals_1);
    
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, "Hall?!|>vard");
    assertTrue("middle ?= \"Hall?!|>vard\" failed after empty.replaceRegion(\"?!\") ,left.replaceRegion(\"?!\") ,middle.replaceRegion(\"?!\") ,regionLeft.replaceRegion(\"?!\") ,regionRight.replaceRegion(\"?!\") ,right.replaceRegion(\"?!\")", _assertEquals_2);
    
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, "Hal?!|>ard");
    assertTrue("regionLeft ?= \"Hal?!|>ard\" failed after empty.replaceRegion(\"?!\") ,left.replaceRegion(\"?!\") ,middle.replaceRegion(\"?!\") ,regionLeft.replaceRegion(\"?!\") ,regionRight.replaceRegion(\"?!\") ,right.replaceRegion(\"?!\")", _assertEquals_3);
    
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, "Hal?!|>ard");
    assertTrue("regionRight ?= \"Hal?!|>ard\" failed after empty.replaceRegion(\"?!\") ,left.replaceRegion(\"?!\") ,middle.replaceRegion(\"?!\") ,regionLeft.replaceRegion(\"?!\") ,regionRight.replaceRegion(\"?!\") ,right.replaceRegion(\"?!\")", _assertEquals_4);
    
    assertTrue("right ?= \"Hallvard?!|>\" failed after empty.replaceRegion(\"?!\") ,left.replaceRegion(\"?!\") ,middle.replaceRegion(\"?!\") ,regionLeft.replaceRegion(\"?!\") ,regionRight.replaceRegion(\"?!\") ,right.replaceRegion(\"?!\")", this.operator_assertEquals(
      this.right, "Hallvard?!|>"));
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions0() {
    try {
      
      this.empty.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("empty.deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions1() {
    try {
      
      this.left.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("left.deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions2() {
    try {
      
      this.middle.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("middle.deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions3() {
    try {
      
      this.regionLeft.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions4() {
    try {
      
      this.regionRight.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionRight.deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions5() {
    try {
      
      this.right.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("right.deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions0_effects0_state() {
    _test__deleteLeft_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__deleteLeft_transitions0_effects0_state_objectTests0_test() {
    
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, "|>");
    assertTrue("empty ?= \"|>\" failed after empty.deleteLeft ,left.deleteLeft ,middle.deleteLeft ,regionLeft.deleteLeft ,regionRight.deleteLeft ,right.deleteLeft", _assertEquals);
    
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, "|>Hallvard");
    assertTrue("left ?= \"|>Hallvard\" failed after empty.deleteLeft ,left.deleteLeft ,middle.deleteLeft ,regionLeft.deleteLeft ,regionRight.deleteLeft ,right.deleteLeft", _assertEquals_1);
    
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, "Hal|>vard");
    assertTrue("middle ?= \"Hal|>vard\" failed after empty.deleteLeft ,left.deleteLeft ,middle.deleteLeft ,regionLeft.deleteLeft ,regionRight.deleteLeft ,right.deleteLeft", _assertEquals_2);
    
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, "Hal|>ard");
    assertTrue("regionLeft ?= \"Hal|>ard\" failed after empty.deleteLeft ,left.deleteLeft ,middle.deleteLeft ,regionLeft.deleteLeft ,regionRight.deleteLeft ,right.deleteLeft", _assertEquals_3);
    
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, "Hal|>ard");
    assertTrue("regionRight ?= \"Hal|>ard\" failed after empty.deleteLeft ,left.deleteLeft ,middle.deleteLeft ,regionLeft.deleteLeft ,regionRight.deleteLeft ,right.deleteLeft", _assertEquals_4);
    
    assertTrue("right ?= \"Hallvar|>\" failed after empty.deleteLeft ,left.deleteLeft ,middle.deleteLeft ,regionLeft.deleteLeft ,regionRight.deleteLeft ,right.deleteLeft", this.operator_assertEquals(
      this.right, "Hallvar|>"));
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions0() {
    try {
      
      this.empty.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("empty.deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions1() {
    try {
      
      this.left.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("left.deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions2() {
    try {
      
      this.middle.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("middle.deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions3() {
    try {
      
      this.regionLeft.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions4() {
    try {
      
      this.regionRight.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionRight.deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions5() {
    try {
      
      this.right.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("right.deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions0_effects0_state() {
    _test__deleteRight_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__deleteRight_transitions0_effects0_state_objectTests0_test() {
    
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, "|>");
    assertTrue("empty ?= \"|>\" failed after empty.deleteRight ,left.deleteRight ,middle.deleteRight ,regionLeft.deleteRight ,regionRight.deleteRight ,right.deleteRight", _assertEquals);
    
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, "|>allvard");
    assertTrue("left ?= \"|>allvard\" failed after empty.deleteRight ,left.deleteRight ,middle.deleteRight ,regionLeft.deleteRight ,regionRight.deleteRight ,right.deleteRight", _assertEquals_1);
    
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, "Hall|>ard");
    assertTrue("middle ?= \"Hall|>ard\" failed after empty.deleteRight ,left.deleteRight ,middle.deleteRight ,regionLeft.deleteRight ,regionRight.deleteRight ,right.deleteRight", _assertEquals_2);
    
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, "Hal|>ard");
    assertTrue("regionLeft ?= \"Hal|>ard\" failed after empty.deleteRight ,left.deleteRight ,middle.deleteRight ,regionLeft.deleteRight ,regionRight.deleteRight ,right.deleteRight", _assertEquals_3);
    
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, "Hal|>ard");
    assertTrue("regionRight ?= \"Hal|>ard\" failed after empty.deleteRight ,left.deleteRight ,middle.deleteRight ,regionLeft.deleteRight ,regionRight.deleteRight ,right.deleteRight", _assertEquals_4);
    
    assertTrue("right ?= \"Hallvard|>\" failed after empty.deleteRight ,left.deleteRight ,middle.deleteRight ,regionLeft.deleteRight ,regionRight.deleteRight ,right.deleteRight", this.operator_assertEquals(
      this.right, "Hallvard|>"));
    
  }
  
  private void _transition_exprAction__insertTag_transitions0_actions0() {
    try {
      
      this.empty.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("empty.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertTag_transitions0_actions1() {
    try {
      
      this.left.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("left.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertTag_transitions0_actions2() {
    try {
      
      this.middle.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("middle.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertTag_transitions0_actions3() {
    try {
      
      this.regionLeft.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertTag_transitions0_actions4() {
    try {
      
      this.regionRight.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionRight.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertTag_transitions0_actions5() {
    try {
      
      this.right.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("right.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertTag_transitions0_effects0_state() {
    _test__insertTag_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__insertTag_transitions0_effects0_state_objectTests0_test() {
    
    Pair<String, List<Integer>> _mappedTo = Pair.<String, List<Integer>>of("|>[0,0:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(0))));
    boolean _assertEquals = this.operator_assertEquals(
      this.empty, _mappedTo);
    assertTrue("empty ?= \"|>[0,0:?!>\" -> #[0,0] failed after empty.insertTag(\"?!\") ,left.insertTag(\"?!\") ,middle.insertTag(\"?!\") ,regionLeft.insertTag(\"?!\") ,regionRight.insertTag(\"?!\") ,right.insertTag(\"?!\")", _assertEquals);
    
    Pair<String, List<Integer>> _mappedTo_1 = Pair.<String, List<Integer>>of("|>Hallvard[0,0:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(0), Integer.valueOf(0))));
    boolean _assertEquals_1 = this.operator_assertEquals(
      this.left, _mappedTo_1);
    assertTrue("left ?= \"|>Hallvard[0,0:?!>\" -> #[0,0] failed after empty.insertTag(\"?!\") ,left.insertTag(\"?!\") ,middle.insertTag(\"?!\") ,regionLeft.insertTag(\"?!\") ,regionRight.insertTag(\"?!\") ,right.insertTag(\"?!\")", _assertEquals_1);
    
    Pair<String, List<Integer>> _mappedTo_2 = Pair.<String, List<Integer>>of("Hall|>vard[4,4:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(4), Integer.valueOf(4))));
    boolean _assertEquals_2 = this.operator_assertEquals(
      this.middle, _mappedTo_2);
    assertTrue("middle ?= \"Hall|>vard[4,4:?!>\" -> #[4,4] failed after empty.insertTag(\"?!\") ,left.insertTag(\"?!\") ,middle.insertTag(\"?!\") ,regionLeft.insertTag(\"?!\") ,regionRight.insertTag(\"?!\") ,right.insertTag(\"?!\")", _assertEquals_2);
    
    Pair<String, List<Integer>> _mappedTo_3 = Pair.<String, List<Integer>>of("Hal|lv>ard[3,5:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(5))));
    boolean _assertEquals_3 = this.operator_assertEquals(
      this.regionLeft, _mappedTo_3);
    assertTrue("regionLeft ?= \"Hal|lv>ard[3,5:?!>\" -> #[3,5] failed after empty.insertTag(\"?!\") ,left.insertTag(\"?!\") ,middle.insertTag(\"?!\") ,regionLeft.insertTag(\"?!\") ,regionRight.insertTag(\"?!\") ,right.insertTag(\"?!\")", _assertEquals_3);
    
    Pair<String, List<Integer>> _mappedTo_4 = Pair.<String, List<Integer>>of("Hal<lv|ard[3,5:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(5))));
    boolean _assertEquals_4 = this.operator_assertEquals(
      this.regionRight, _mappedTo_4);
    assertTrue("regionRight ?= \"Hal<lv|ard[3,5:?!>\" -> #[3,5] failed after empty.insertTag(\"?!\") ,left.insertTag(\"?!\") ,middle.insertTag(\"?!\") ,regionLeft.insertTag(\"?!\") ,regionRight.insertTag(\"?!\") ,right.insertTag(\"?!\")", _assertEquals_4);
    
    Pair<String, List<Integer>> _mappedTo_5 = Pair.<String, List<Integer>>of("Hallvard|>[8,8:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(8), Integer.valueOf(8))));
    assertTrue("right ?= \"Hallvard|>[8,8:?!>\" -> #[8,8] failed after empty.insertTag(\"?!\") ,left.insertTag(\"?!\") ,middle.insertTag(\"?!\") ,regionLeft.insertTag(\"?!\") ,regionRight.insertTag(\"?!\") ,right.insertTag(\"?!\")", this.operator_assertEquals(
      this.right, _mappedTo_5));
    
  }
  
  private void _transition_exprAction__insertTagEdit_transitions0_actions0() {
    try {
      
      this.regionLeft.insertTag("?!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.insertTag(\"?!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertTagEdit_transitions0_effects0_state() {
    _test__insertTagEdit_transitions0_effects0_state_objectTests0_test(regionLeft);
    
  }
  
  private void _test__insertTagEdit_transitions0_effects0_state_objectTests0_test(final LineEditor it) {
    
    Pair<String, List<Integer>> _mappedTo = Pair.<String, List<Integer>>of("Hal|lv>ard[3,5:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(5))));
    boolean _assertEquals = this.operator_assertEquals(it, _mappedTo);
    assertTrue("it ?= \"Hal|lv>ard[3,5:?!>\" -> #[3,5] failed after regionLeft.insertTag(\"?!\")", _assertEquals);
    
    int _regionCount = it.getRegionCount();
    assertEquals("regionCount == 1 failed after regionLeft.insertTag(\"?!\")", 1, _regionCount);
    
    String _regionText = it.getRegionText(0);
    assertEquals("getRegionText(0) == \"lv\" failed after regionLeft.insertTag(\"?!\")", "lv", _regionText);
    
  }
  
  private void _transition_exprAction__insertTagEdit_transitions1_actions0() {
    try {
      
      this.regionLeft.left(false);
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.left(false) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertTagEdit_transitions1_effects0_state() {
    _test__insertTagEdit_transitions1_effects0_state_objectTests0_test(regionLeft);
    
  }
  
  private void _test__insertTagEdit_transitions1_effects0_state_objectTests0_test(final LineEditor it) {
    
    Pair<String, List<Integer>> _mappedTo = Pair.<String, List<Integer>>of("Hal|>lvard[3,5:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(5))));
    boolean _assertEquals = this.operator_assertEquals(it, _mappedTo);
    assertTrue("it ?= \"Hal|>lvard[3,5:?!>\" -> #[3,5] failed after regionLeft.left(false)", _assertEquals);
    
    String _regionText = it.getRegionText(0);
    assertEquals("getRegionText(0) == \"lv\" failed after regionLeft.left(false)", "lv", _regionText);
    
  }
  
  private void _transition_exprAction__insertTagEdit_transitions2_actions0() {
    try {
      
      this.regionLeft.replaceRegion("xy");
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.replaceRegion(\"xy\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertTagEdit_transitions2_effects0_state() {
    _test__insertTagEdit_transitions2_effects0_state_objectTests0_test(regionLeft);
    
  }
  
  private void _test__insertTagEdit_transitions2_effects0_state_objectTests0_test(final LineEditor it) {
    
    Pair<String, List<Integer>> _mappedTo = Pair.<String, List<Integer>>of("Halxy|>lvard[3,7:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(7))));
    boolean _assertEquals = this.operator_assertEquals(it, _mappedTo);
    assertTrue("it ?= \"Halxy|>lvard[3,7:?!>\" -> #[3,7] failed after regionLeft.replaceRegion(\"xy\")", _assertEquals);
    
    String _regionText = it.getRegionText(0);
    assertEquals("getRegionText(0) == \"xylv\" failed after regionLeft.replaceRegion(\"xy\")", "xylv", _regionText);
    
  }
  
  private void _transition_exprAction__insertTagEdit_transitions3_actions0() {
    try {
      
      this.regionLeft.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("regionLeft.deleteLeft() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertTagEdit_transitions3_effects0_state() {
    _test__insertTagEdit_transitions3_effects0_state_objectTests0_test(regionLeft);
    
  }
  
  private void _test__insertTagEdit_transitions3_effects0_state_objectTests0_test(final LineEditor it) {
    
    Pair<String, List<Integer>> _mappedTo = Pair.<String, List<Integer>>of("Halx|>lvard[3,6:?!>", Collections.<Integer>unmodifiableList(CollectionLiterals.<Integer>newArrayList(Integer.valueOf(3), Integer.valueOf(6))));
    boolean _assertEquals = this.operator_assertEquals(it, _mappedTo);
    assertTrue("it ?= \"Halx|>lvard[3,6:?!>\" -> #[3,6] failed after regionLeft.deleteLeft()", _assertEquals);
    
    String _regionText = it.getRegionText(0);
    assertEquals("getRegionText(0) == \"xlv\" failed after regionLeft.deleteLeft()", "xlv", _regionText);
    
  }
}
