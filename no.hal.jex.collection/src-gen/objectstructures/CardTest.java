package objectstructures;

import com.google.common.base.Objects;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Card;
import org.eclipse.xtext.xbase.lib.Pair;

@JExercise(description = "Tests objectstructures.Card")
@SuppressWarnings("all")
public class CardTest extends TestCase {
  private Card c;
  
  private Card _init_c() {
    return null;
  }
  
  @Override
  protected void setUp() {
    c = _init_c();
    
  }
  
  private boolean operator_equals(final Character c, final String s) {
    boolean _and = false;
    int _length = s.length();
    boolean _equals = (_length == 1);
    if (!_equals) {
      _and = false;
    } else {
      char _charAt = s.charAt(0);
      boolean _equals_1 = ((c).charValue() == _charAt);
      _and = (_equals && _equals_1);
    }
    return _and;
  }
  
  private boolean operator_equals(final Card card, final String s) {
    String _string = card.toString();
    boolean _equals = Objects.equal(_string, s);
    return _equals;
  }
  
  private boolean operator_equals(final Card card, final Pair<String,Integer> suitFace) {
    boolean _and = false;
    char _suit = card.getSuit();
    String _key = suitFace.getKey();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), _key);
    if (!_equals) {
      _and = false;
    } else {
      int _face = card.getFace();
      Integer _value = suitFace.getValue();
      int _intValue = _value.intValue();
      boolean _equals_1 = (_face == _intValue);
      _and = (_equals && _equals_1);
    }
    return _and;
  }
  
  @JExercise(tests = "Card(char,int)", description = "Tests the following sequence:<ul><li>c = new Card(\'S\', 1)</li><li>c = new Card(\'S\', 13)</li><li>c = new Card(\'H\', 1)</li><li>c = new Card(\'H\', 13)</li><li>c = new Card(\'D\', 1)</li><li>c = new Card(\'D\', 13)</li><li>c = new Card(\'C\', 1)</li><li>c = new Card(\'C\', 13)</li><li>c = new Card(\'X\', 1)</li><li>c = new Card(\'S\', 0)</li><li>c = new Card(\'C\', 14)</li></ul>")
  public void testConstructor() {
    _transition__constructor_transitions0(c);
    _test__constructor_transitions0_target(c);
    _transition__constructor_transitions1(c);
    _test__constructor_transitions1_target(c);
    _transition__constructor_transitions2(c);
    _test__constructor_transitions2_target(c);
    _transition__constructor_transitions3(c);
    _test__constructor_transitions3_target(c);
    _transition__constructor_transitions4(c);
    _test__constructor_transitions4_target(c);
    _transition__constructor_transitions5(c);
    _test__constructor_transitions5_target(c);
    _transition__constructor_transitions6(c);
    _test__constructor_transitions6_target(c);
    _transition__constructor_transitions7(c);
    _test__constructor_transitions7_target(c);
    try {
      _transition__constructor_transitions8(c);
      fail("c = new Card('X', 1) should throw java.lang.IllegalArgumentException");
    } catch (Exception e) {
      assertTrue("c = new Card('X', 1) should throw java.lang.IllegalArgumentException", e instanceof java.lang.IllegalArgumentException);
    }
    try {
      _transition__constructor_transitions9(c);
      fail("c = new Card('S', 0) should throw java.lang.IllegalArgumentException");
    } catch (Exception e_1) {
      assertTrue("c = new Card('S', 0) should throw java.lang.IllegalArgumentException", e_1 instanceof java.lang.IllegalArgumentException);
    }
    try {
      _transition__constructor_transitions10(c);
      fail("c = new Card('C', 14) should throw java.lang.IllegalArgumentException");
    } catch (Exception e_2) {
      assertTrue("c = new Card('C', 14) should throw java.lang.IllegalArgumentException", e_2 instanceof java.lang.IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Card(char,int)", description = "Tests the following sequence:<ul><li>c = new Card(\'S\', 1)</li><li>c = new Card(\'S\', 13)</li><li>c = new Card(\'H\', 1)</li><li>c = new Card(\'H\', 13)</li><li>c = new Card(\'D\', 1)</li><li>c = new Card(\'D\', 13)</li><li>c = new Card(\'C\', 1)</li><li>c = new Card(\'C\', 13)</li></ul>")
  public void testToString() {
    _transition__toString_transitions0(c);
    _test__toString_transitions0_target(c);
    _transition__toString_transitions1(c);
    _test__toString_transitions1_target(c);
    _transition__toString_transitions2(c);
    _test__toString_transitions2_target(c);
    _transition__toString_transitions3(c);
    _test__toString_transitions3_target(c);
    _transition__toString_transitions4(c);
    _test__toString_transitions4_target(c);
    _transition__toString_transitions5(c);
    _test__toString_transitions5_target(c);
    _transition__toString_transitions6(c);
    _test__toString_transitions6_target(c);
    _transition__toString_transitions7(c);
    _test__toString_transitions7_target(c);
    
  }
  
  private Card _transition__constructor_transitions0(final Card it) {
    Card _card = new Card('S', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions0_target(final Card it) {
    _test__constructor_transitions0_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions1(final Card it) {
    Card _card = new Card('S', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions1_target(final Card it) {
    _test__constructor_transitions1_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions2(final Card it) {
    Card _card = new Card('H', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions2_target(final Card it) {
    _test__constructor_transitions2_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions3(final Card it) {
    Card _card = new Card('H', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions3_target(final Card it) {
    _test__constructor_transitions3_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions4(final Card it) {
    Card _card = new Card('D', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions4_target(final Card it) {
    _test__constructor_transitions4_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions5(final Card it) {
    Card _card = new Card('D', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions5_target(final Card it) {
    _test__constructor_transitions5_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions6(final Card it) {
    Card _card = new Card('C', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions6_target(final Card it) {
    _test__constructor_transitions6_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions7(final Card it) {
    Card _card = new Card('C', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__constructor_transitions7_target(final Card it) {
    _test__constructor_transitions7_target_propertyTests0(c);
    
  }
  
  private Card _transition__constructor_transitions8(final Card it) {
    Card _card = new Card('X', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private Card _transition__constructor_transitions9(final Card it) {
    Card _card = new Card('S', 0);
    Card _c = this.c = _card;
    return _c;
  }
  
  private Card _transition__constructor_transitions10(final Card it) {
    Card _card = new Card('C', 14);
    Card _c = this.c = _card;
    return _c;
  }
  
  private boolean _test__constructor_transitions0_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("S", Integer.valueOf(1));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'S' -> 1; failed after c = new Card('S', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions1_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("S", Integer.valueOf(13));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'S' -> 13; failed after c = new Card('S', 13)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions2_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("H", Integer.valueOf(1));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'H' -> 1; failed after c = new Card('H', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions3_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("H", Integer.valueOf(13));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'H' -> 13; failed after c = new Card('H', 13)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions4_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("D", Integer.valueOf(1));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'D' -> 1; failed after c = new Card('D', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions5_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("D", Integer.valueOf(13));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'D' -> 13; failed after c = new Card('D', 13)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions6_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("C", Integer.valueOf(1));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'C' -> 1; failed after c = new Card('C', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions7_target_propertyTests0(final Card it) {
    
    Pair<String,Integer> _mappedTo = Pair.<String, Integer>of("C", Integer.valueOf(13));
    boolean _equals = this.operator_equals(it, _mappedTo);
    assertTrue("it == 'C' -> 13; failed after c = new Card('C', 13)", _equals);
    return _equals;
  }
  
  private Card _transition__toString_transitions0(final Card it) {
    Card _card = new Card('S', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions0_target(final Card it) {
    _test__toString_transitions0_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions1(final Card it) {
    Card _card = new Card('S', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions1_target(final Card it) {
    _test__toString_transitions1_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions2(final Card it) {
    Card _card = new Card('H', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions2_target(final Card it) {
    _test__toString_transitions2_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions3(final Card it) {
    Card _card = new Card('H', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions3_target(final Card it) {
    _test__toString_transitions3_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions4(final Card it) {
    Card _card = new Card('D', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions4_target(final Card it) {
    _test__toString_transitions4_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions5(final Card it) {
    Card _card = new Card('D', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions5_target(final Card it) {
    _test__toString_transitions5_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions6(final Card it) {
    Card _card = new Card('C', 1);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions6_target(final Card it) {
    _test__toString_transitions6_target_propertyTests0(c);
    
  }
  
  private Card _transition__toString_transitions7(final Card it) {
    Card _card = new Card('C', 13);
    Card _c = this.c = _card;
    return _c;
  }
  
  private void _test__toString_transitions7_target(final Card it) {
    _test__toString_transitions7_target_propertyTests0(c);
    
  }
  
  private boolean _test__toString_transitions0_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "S1");
    assertTrue("it == 'S1'; failed after c = new Card('S', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions1_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "S13");
    assertTrue("it == 'S13'; failed after c = new Card('S', 13)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions2_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "H1");
    assertTrue("it == 'H1'; failed after c = new Card('H', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions3_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "H13");
    assertTrue("it == 'H13'; failed after c = new Card('H', 13)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions4_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "D1");
    assertTrue("it == 'D1'; failed after c = new Card('D', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions5_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "D13");
    assertTrue("it == 'D13'; failed after c = new Card('D', 13)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions6_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "C1");
    assertTrue("it == 'C1'; failed after c = new Card('C', 1)", _equals);
    return _equals;
  }
  
  private boolean _test__toString_transitions7_target_propertyTests0(final Card it) {
    
    boolean _equals = this.operator_equals(it, "C13");
    assertTrue("it == 'C13'; failed after c = new Card('C', 13)", _equals);
    return _equals;
  }
}
