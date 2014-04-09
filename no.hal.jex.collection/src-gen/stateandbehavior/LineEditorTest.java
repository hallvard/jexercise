package stateandbehavior;

import com.google.common.base.Objects;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import stateandbehavior.LineEditor;

@JExercise(description = "Tests stateandbehavior.LineEditor")
@SuppressWarnings("all")
public class LineEditorTest extends TestCase {
  private LineEditor lineEditor;
  
  @Override
  protected void setUp() {
    lineEditor = new LineEditor();
    
  }
  
  private void set(final String s) {
    final int pos = s.indexOf("|");
    String _substring = s.substring(0, pos);
    int _plus = (pos + 1);
    String _substring_1 = s.substring(_plus);
    String _plus_1 = (_substring + _substring_1);
    this.lineEditor.text = _plus_1;
    this.lineEditor.insertionIndex = pos;
  }
  
  private boolean operator_equals(final LineEditor lineEditor, final String s) {
    boolean _xblockexpression = false;
    {
      final int pos = s.indexOf("|");
      final String head = s.substring(0, pos);
      String _xifexpression = null;
      int _plus = (pos + 1);
      int _length = s.length();
      boolean _lessThan = (_plus < _length);
      if (_lessThan) {
        int _plus_1 = (pos + 1);
        String _substring = s.substring(_plus_1);
        _xifexpression = _substring;
      } else {
        _xifexpression = "";
      }
      final String tail = _xifexpression;
      boolean _and = false;
      String _plus_2 = (head + tail);
      boolean _equals = Objects.equal(lineEditor.text, _plus_2);
      if (!_equals) {
        _and = false;
      } else {
        boolean _equals_1 = (lineEditor.insertionIndex == pos);
        _and = (_equals && _equals_1);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "LineEditor()", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state(lineEditor);
    
  }
  
  @JExercise(tests = "LineEditor();void left()", description = "<h3>Venstre</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>left</li>\n\t\t<li>set(\"J|\"), left</li>\n\t\t</ul>\n")
  public void testLeft() {
    _transition_exprAction__left_transitions0_actions0(lineEditor);
    _test__left_transitions0_effect_state(lineEditor);
    _transition_exprAction__left_transitions1_actions0(lineEditor);
    _transition_exprAction__left_transitions1_actions1(lineEditor);
    _test__left_transitions1_effect_state(lineEditor);
    
  }
  
  @JExercise(tests = "LineEditor();void right()", description = "<h3>H\u00F8yre</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>right</li>\n\t\t<li>set(\"|J\"), right</li>\n\t\t</ul>\n")
  public void testRight() {
    _transition_exprAction__right_transitions0_actions0(lineEditor);
    _test__right_transitions0_effect_state(lineEditor);
    _transition_exprAction__right_transitions1_actions0(lineEditor);
    _transition_exprAction__right_transitions1_actions1(lineEditor);
    _test__right_transitions1_effect_state(lineEditor);
    
  }
  
  @JExercise(tests = "LineEditor();void deleteLeft()", description = "<h3>Slett mot venstre</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>deleteLeft</li>\n\t\t<li>set(\"J|\"), deleteLeft</li>\n\t\t<li>set(\"Ja|va\"), deleteLeft</li>\n\t\t</ul>\n")
  public void testDeleteLeft() {
    _transition_exprAction__deleteLeft_transitions0_actions0(lineEditor);
    _test__deleteLeft_transitions0_effect_state(lineEditor);
    _transition_exprAction__deleteLeft_transitions1_actions0(lineEditor);
    _transition_exprAction__deleteLeft_transitions1_actions1(lineEditor);
    _test__deleteLeft_transitions1_effect_state(lineEditor);
    _transition_exprAction__deleteLeft_transitions2_actions0(lineEditor);
    _transition_exprAction__deleteLeft_transitions2_actions1(lineEditor);
    _test__deleteLeft_transitions2_effect_state(lineEditor);
    
  }
  
  @JExercise(tests = "LineEditor();void deleteRight()", description = "<h3>Slett mot h\u00F8yre</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>deleteRight</li>\n\t\t<li>set(\"|J\"), deleteRight</li>\n\t\t<li>set(\"J|ava\"), deleteRight</li>\n\t\t</ul>\n")
  public void testDeleteRight() {
    _transition_exprAction__deleteRight_transitions0_actions0(lineEditor);
    _test__deleteRight_transitions0_effect_state(lineEditor);
    _transition_exprAction__deleteRight_transitions1_actions0(lineEditor);
    _transition_exprAction__deleteRight_transitions1_actions1(lineEditor);
    _test__deleteRight_transitions1_effect_state(lineEditor);
    _transition_exprAction__deleteRight_transitions2_actions0(lineEditor);
    _transition_exprAction__deleteRight_transitions2_actions1(lineEditor);
    _test__deleteRight_transitions2_effect_state(lineEditor);
    
  }
  
  @JExercise(tests = "LineEditor();void insertString(String)", description = "<h3>Sett inn tekst</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>insertString(\"\")</li>\n\t\t<li>insertString(\"Java\")</li>\n\t\t<li>insertString(\" er g\u00F8y!\")</li>\n\t\t<li>set(\"Java|g\u00F8y!\"), insertString(\" er \")</li>\n\t\t<li>set(\"|er g\u00F8y!\"), insertString(\"Java \")</li>\n\t\t</ul>\n")
  public void testInsertString() {
    _transition_exprAction__insertString_transitions0_actions0(lineEditor);
    _test__insertString_transitions0_effect_state(lineEditor);
    _transition_exprAction__insertString_transitions1_actions0(lineEditor);
    _test__insertString_transitions1_effect_state(lineEditor);
    _transition_exprAction__insertString_transitions2_actions0(lineEditor);
    _test__insertString_transitions2_effect_state(lineEditor);
    _transition_exprAction__insertString_transitions3_actions0(lineEditor);
    _transition_exprAction__insertString_transitions3_actions1(lineEditor);
    _test__insertString_transitions3_effect_state(lineEditor);
    _transition_exprAction__insertString_transitions4_actions0(lineEditor);
    _transition_exprAction__insertString_transitions4_actions1(lineEditor);
    _test__insertString_transitions4_effect_state(lineEditor);
    
  }
  
  private void _test__constructor_transitions0_effect_state(final LineEditor it) {
    _test__constructor_transitions0_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it ==\"|\" failed", _equals);
    
  }
  
  private void _transition_exprAction__left_transitions0_actions0(final LineEditor it) {
    try {
      
      it.left();
      } catch (junit.framework.AssertionFailedError error) {
      fail("left failed: " + error.getMessage());
    }
    
  }
  
  private void _test__left_transitions0_effect_state(final LineEditor it) {
    _test__left_transitions0_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__left_transitions0_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after left", _equals);
    
  }
  
  private void _transition_exprAction__left_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("J|");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"J|\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__left_transitions1_actions1(final LineEditor it) {
    try {
      
      it.left();
      } catch (junit.framework.AssertionFailedError error) {
      fail("left failed: " + error.getMessage());
    }
    
  }
  
  private void _test__left_transitions1_effect_state(final LineEditor it) {
    _test__left_transitions1_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__left_transitions1_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|J");
    assertTrue("it == \"|J\" failed after set(\"J|\") ,left", _equals);
    
  }
  
  private void _transition_exprAction__right_transitions0_actions0(final LineEditor it) {
    try {
      
      it.right();
      } catch (junit.framework.AssertionFailedError error) {
      fail("right failed: " + error.getMessage());
    }
    
  }
  
  private void _test__right_transitions0_effect_state(final LineEditor it) {
    _test__right_transitions0_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__right_transitions0_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after right", _equals);
    
  }
  
  private void _transition_exprAction__right_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("|J");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"|J\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__right_transitions1_actions1(final LineEditor it) {
    try {
      
      it.right();
      } catch (junit.framework.AssertionFailedError error) {
      fail("right failed: " + error.getMessage());
    }
    
  }
  
  private void _test__right_transitions1_effect_state(final LineEditor it) {
    _test__right_transitions1_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__right_transitions1_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "J|");
    assertTrue("it == \"J|\" failed after set(\"|J\") ,right", _equals);
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions0_actions0(final LineEditor it) {
    try {
      
      it.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions0_effect_state(final LineEditor it) {
    _test__deleteLeft_transitions0_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteLeft_transitions0_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after deleteLeft", _equals);
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("J|");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"J|\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions1_actions1(final LineEditor it) {
    try {
      
      it.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions1_effect_state(final LineEditor it) {
    _test__deleteLeft_transitions1_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteLeft_transitions1_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after set(\"J|\") ,deleteLeft", _equals);
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions2_actions0(final LineEditor it) {
    try {
      
      this.set("Ja|va");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"Ja|va\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteLeft_transitions2_actions1(final LineEditor it) {
    try {
      
      it.deleteLeft();
      } catch (junit.framework.AssertionFailedError error) {
      fail("deleteLeft failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteLeft_transitions2_effect_state(final LineEditor it) {
    _test__deleteLeft_transitions2_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteLeft_transitions2_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "J|va");
    assertTrue("it == \"J|va\" failed after set(\"Ja|va\") ,deleteLeft", _equals);
    
  }
  
  private void _transition_exprAction__deleteRight_transitions0_actions0(final LineEditor it) {
    try {
      
      it.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions0_effect_state(final LineEditor it) {
    _test__deleteRight_transitions0_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteRight_transitions0_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after deleteRight", _equals);
    
  }
  
  private void _transition_exprAction__deleteRight_transitions1_actions0(final LineEditor it) {
    try {
      
      this.set("|J");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"|J\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions1_actions1(final LineEditor it) {
    try {
      
      it.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions1_effect_state(final LineEditor it) {
    _test__deleteRight_transitions1_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteRight_transitions1_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after set(\"|J\") ,deleteRight", _equals);
    
  }
  
  private void _transition_exprAction__deleteRight_transitions2_actions0(final LineEditor it) {
    try {
      
      this.set("J|ava");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"J|ava\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__deleteRight_transitions2_actions1(final LineEditor it) {
    try {
      
      it.deleteRight();
      } catch (junit.framework.AssertionFailedError error) {
      fail("deleteRight failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deleteRight_transitions2_effect_state(final LineEditor it) {
    _test__deleteRight_transitions2_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__deleteRight_transitions2_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "J|va");
    assertTrue("it == \"J|va\" failed after set(\"J|ava\") ,deleteRight", _equals);
    
  }
  
  private void _transition_exprAction__insertString_transitions0_actions0(final LineEditor it) {
    try {
      
      it.insertString("");
      } catch (junit.framework.AssertionFailedError error) {
      fail("insertString(\"\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions0_effect_state(final LineEditor it) {
    _test__insertString_transitions0_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions0_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "|");
    assertTrue("it == \"|\" failed after insertString(\"\")", _equals);
    
  }
  
  private void _transition_exprAction__insertString_transitions1_actions0(final LineEditor it) {
    try {
      
      it.insertString("Java");
      } catch (junit.framework.AssertionFailedError error) {
      fail("insertString(\"Java\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions1_effect_state(final LineEditor it) {
    _test__insertString_transitions1_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions1_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "Java|");
    assertTrue("it == \"Java|\" failed after insertString(\"Java\")", _equals);
    
  }
  
  private void _transition_exprAction__insertString_transitions2_actions0(final LineEditor it) {
    try {
      
      it.insertString(" er g\u00F8y!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("insertString(\" er gøy!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions2_effect_state(final LineEditor it) {
    _test__insertString_transitions2_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions2_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "Java er g\u00F8y!|");
    assertTrue("it == \"Java er gøy!|\" failed after insertString(\" er gøy!\")", _equals);
    
  }
  
  private void _transition_exprAction__insertString_transitions3_actions0(final LineEditor it) {
    try {
      
      this.set("Java|g\u00F8y!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"Java|gøy!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertString_transitions3_actions1(final LineEditor it) {
    try {
      
      it.insertString(" er ");
      } catch (junit.framework.AssertionFailedError error) {
      fail("insertString(\" er \") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions3_effect_state(final LineEditor it) {
    _test__insertString_transitions3_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions3_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "Java er |g\u00F8y!");
    assertTrue("it == \"Java er |gøy!\" failed after set(\"Java|gøy!\") ,insertString(\" er \")", _equals);
    
  }
  
  private void _transition_exprAction__insertString_transitions4_actions0(final LineEditor it) {
    try {
      
      this.set("|er g\u00F8y!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("set(\"|er gøy!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__insertString_transitions4_actions1(final LineEditor it) {
    try {
      
      it.insertString("Java ");
      } catch (junit.framework.AssertionFailedError error) {
      fail("insertString(\"Java \") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__insertString_transitions4_effect_state(final LineEditor it) {
    _test__insertString_transitions4_effect_state_objectTests0_test(lineEditor);
    
  }
  
  private void _test__insertString_transitions4_effect_state_objectTests0_test(final LineEditor it) {
    
    boolean _equals = this.operator_equals(it, "Java |er g\u00F8y!");
    assertTrue("it == \"Java |er gøy!\" failed after set(\"|er gøy!\") ,insertString(\"Java \")", _equals);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(LineEditorTest.class);
  }
}
