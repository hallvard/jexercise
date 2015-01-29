package stateandbehavior;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import stateandbehavior.Nim;

@JExercise(description = "Tests stateandbehavior.Nim")
@SuppressWarnings("all")
public class NimTest extends TestCase {
  private Nim nim;
  
  private Nim _init_nim() {
    Nim _nim = new Nim(5);
    return _nim;
  }
  
  @Override
  protected void setUp() {
    nim = _init_nim();
    
  }
  
  private boolean checkValidation(final int pieces, final boolean legal, final Nim game) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isValidMove = game.isValidMove(pieces, 0);
    if (!_isValidMove) {
      _and_1 = false;
    } else {
      boolean _isValidMove_1 = game.isValidMove(pieces, 1);
      _and_1 = _isValidMove_1;
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _isValidMove_2 = game.isValidMove(pieces, 2);
      _and = _isValidMove_2;
    }
    return (legal == _and);
  }
  
  @JExercise(tests = "Nim(int)", description = "<h3>Konstrukt\u00F8r</h3>Tests \r\n\t\tinitialization\r\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state(nim);
    
  }
  
  @JExercise(tests = "Nim(int);void removePieces(int,int)", description = "<h3>Fjerning av brikker</h3>Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Fjerner brikker: removePieces(3, 0), removePieces(2, 1), removePieces(1, 2)</li>\r\n\t\t<li>Fjerner negativt antall: removePieces(-1, 0)</li>\r\n\t\t<li>Fjerner for f\u00E5 brikker: removePieces(0, 0)</li>\r\n\t\t<li>Fjerner for mange brikker: removePieces(6, 0)</li>\r\n\t\t</ul>\r\n")
  public void testRemovePieces() {
    _transition_exprAction__removePieces_transitions0_actions0(nim);
    _transition_exprAction__removePieces_transitions0_actions1(nim);
    _transition_exprAction__removePieces_transitions0_actions2(nim);
    _test__removePieces_transitions0_effect_state(nim);
    _transition_exprAction__removePieces_transitions1_actions0(nim);
    _test__removePieces_transitions1_effect_state(nim);
    _transition_exprAction__removePieces_transitions2_actions0(nim);
    _test__removePieces_transitions2_effect_state(nim);
    _transition_exprAction__removePieces_transitions3_actions0(nim);
    _test__removePieces_transitions3_effect_state(nim);
    
  }
  
  @JExercise(tests = "Nim(int);void removePieces(int,int)", description = "<h3>Avsluttet spill</h3>Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Fjerner brikker: removePieces(5, 0)</li>\r\n\t\t</ul>\r\n")
  public void testGameOver() {
    _test__gameOver_transitions0_effect_state(nim);
    _transition_exprAction__gameOver_transitions1_actions0(nim);
    _test__gameOver_transitions1_effect_state(nim);
    
  }
  
  @JExercise(tests = "Nim(int);void removePieces(int,int)", description = "<h3>Gyldige trekk</h3>Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Avslutter spillet: removePieces(5, 0)</li>\r\n\t\t</ul>\r\n")
  public void testIsValidMove() {
    _test__isValidMove_transitions0_effect_state(nim);
    _transition_exprAction__isValidMove_transitions1_actions0(nim);
    _test__isValidMove_transitions1_effect_state(nim);
    
  }
  
  private void _test__constructor_transitions0_effect_state(final Nim it) {
    _test__constructor_transitions0_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final Nim it) {
    
    int _pile = it.getPile(0);
    assertEquals("getPile(0) == 5 failed", 5, _pile);
    
    int _pile_1 = it.getPile(1);
    assertEquals("getPile(1) == 5 failed", 5, _pile_1);
    
    int _pile_2 = it.getPile(2);
    assertEquals("getPile(2) == 5 failed", 5, _pile_2);
    
  }
  
  private void _transition_exprAction__removePieces_transitions0_actions0(final Nim it) {
    try {
      
      it.removePieces(3, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(3, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__removePieces_transitions0_actions1(final Nim it) {
    try {
      
      it.removePieces(2, 1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(2, 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__removePieces_transitions0_actions2(final Nim it) {
    try {
      
      it.removePieces(1, 2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(1, 2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removePieces_transitions0_effect_state(final Nim it) {
    _test__removePieces_transitions0_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__removePieces_transitions0_effect_state_objectTests0_test(final Nim it) {
    
    int _pile = it.getPile(0);
    assertEquals("getPile(0) == 2 failed after removePieces(3, 0) ,removePieces(2, 1) ,removePieces(1, 2)", 2, _pile);
    
    int _pile_1 = it.getPile(1);
    assertEquals("getPile(1) == 3 failed after removePieces(3, 0) ,removePieces(2, 1) ,removePieces(1, 2)", 3, _pile_1);
    
    int _pile_2 = it.getPile(2);
    assertEquals("getPile(2) == 4 failed after removePieces(3, 0) ,removePieces(2, 1) ,removePieces(1, 2)", 4, _pile_2);
    
  }
  
  private void _transition_exprAction__removePieces_transitions1_actions0(final Nim it) {
    try {
      
      it.removePieces((-1), 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(-1, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removePieces_transitions1_effect_state(final Nim it) {
    _test__removePieces_transitions1_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__removePieces_transitions1_effect_state_objectTests0_test(final Nim it) {
    
    int _pile = it.getPile(0);
    assertEquals("getPile(0) == 2 failed after removePieces(-1, 0)", 2, _pile);
    
  }
  
  private void _transition_exprAction__removePieces_transitions2_actions0(final Nim it) {
    try {
      
      it.removePieces(0, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(0, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removePieces_transitions2_effect_state(final Nim it) {
    _test__removePieces_transitions2_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__removePieces_transitions2_effect_state_objectTests0_test(final Nim it) {
    
    int _pile = it.getPile(0);
    assertEquals("getPile(0) == 2 failed after removePieces(0, 0)", 2, _pile);
    
  }
  
  private void _transition_exprAction__removePieces_transitions3_actions0(final Nim it) {
    try {
      
      it.removePieces(6, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(6, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removePieces_transitions3_effect_state(final Nim it) {
    _test__removePieces_transitions3_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__removePieces_transitions3_effect_state_objectTests0_test(final Nim it) {
    
    int _pile = it.getPile(0);
    assertEquals("getPile(0) == 2 failed after removePieces(6, 0)", 2, _pile);
    
  }
  
  private void _test__gameOver_transitions0_effect_state(final Nim it) {
    _test__gameOver_transitions0_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__gameOver_transitions0_effect_state_objectTests0_test(final Nim it) {
    
    boolean _isGameOver = it.isGameOver();
    assertTrue("! isGameOver() failed", (!_isGameOver));
    
  }
  
  private void _transition_exprAction__gameOver_transitions1_actions0(final Nim it) {
    try {
      
      it.removePieces(5, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(5, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__gameOver_transitions1_effect_state(final Nim it) {
    _test__gameOver_transitions1_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__gameOver_transitions1_effect_state_objectTests0_test(final Nim it) {
    
    int _pile = it.getPile(0);
    assertEquals("getPile(0) == 0 failed after removePieces(5, 0)", 0, _pile);
    
    assertTrue("isGameOver() failed after removePieces(5, 0)", it.isGameOver());
    
  }
  
  private void _test__isValidMove_transitions0_effect_state(final Nim it) {
    _test__isValidMove_transitions0_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__isValidMove_transitions0_effect_state_objectTests0_test(final Nim it) {
    
    boolean _checkValidation = this.checkValidation(2, true, this.nim);
    assertTrue("checkValidation(2, true, nim) failed", _checkValidation);
    
    boolean _checkValidation_1 = this.checkValidation((-2), false, this.nim);
    assertTrue("checkValidation(-2, false, nim) failed", _checkValidation_1);
    
    boolean _checkValidation_2 = this.checkValidation(0, false, this.nim);
    assertTrue("checkValidation(0, false, nim) failed", _checkValidation_2);
    
    assertTrue("checkValidation(6, false, nim) failed", this.checkValidation(6, false, this.nim));
    
  }
  
  private void _transition_exprAction__isValidMove_transitions1_actions0(final Nim it) {
    try {
      
      it.removePieces(5, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("removePieces(5, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__isValidMove_transitions1_effect_state(final Nim it) {
    _test__isValidMove_transitions1_effect_state_objectTests0_test(nim);
    
  }
  
  private void _test__isValidMove_transitions1_effect_state_objectTests0_test(final Nim it) {
    
    assertTrue("checkValidation(2, false, nim) failed after removePieces(5, 0)", this.checkValidation(2, false, this.nim));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(NimTest.class);
  }
}
