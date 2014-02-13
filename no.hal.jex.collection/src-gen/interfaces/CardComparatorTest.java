package interfaces;

import com.google.common.collect.Lists;
import interfaces.Card;
import interfaces.CardComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests interfaces.CardComparator")
@SuppressWarnings("all")
public class CardComparatorTest extends TestCase {
  private Card s1;
  
  private Card _init_s1() {
    Card _card = new Card('S', 1);
    return _card;
  }
  
  private Card s13;
  
  private Card _init_s13() {
    Card _card = new Card('S', 13);
    return _card;
  }
  
  private Card h1;
  
  private Card _init_h1() {
    Card _card = new Card('H', 1);
    return _card;
  }
  
  private Card h13;
  
  private Card _init_h13() {
    Card _card = new Card('H', 13);
    return _card;
  }
  
  private Card d1;
  
  private Card _init_d1() {
    Card _card = new Card('D', 1);
    return _card;
  }
  
  private Card d13;
  
  private Card _init_d13() {
    Card _card = new Card('D', 13);
    return _card;
  }
  
  private Card c1;
  
  private Card _init_c1() {
    Card _card = new Card('C', 1);
    return _card;
  }
  
  private Card c13;
  
  private Card _init_c13() {
    Card _card = new Card('C', 13);
    return _card;
  }
  
  private List<Card> cards;
  
  private List<Card> _init_cards() {
    ArrayList<Card> _newArrayList = CollectionLiterals.<Card>newArrayList(this.s1, this.s13, this.h1, this.h13, this.d1, this.d13, this.c1, this.c13);
    return _newArrayList;
  }
  
  @Override
  protected void setUp() {
    s1 = _init_s1();
    s13 = _init_s13();
    h1 = _init_h1();
    h13 = _init_h13();
    d1 = _init_d1();
    d13 = _init_d13();
    c1 = _init_c1();
    c13 = _init_c13();
    cards = _init_cards();
    
  }
  
  @JExercise(tests = "CardComparator(boolean,char)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Collections.sort(cards, new CardComparator(false, \' \'))</li>\n\t\t</ul>\n")
  public void testNormal() {
    _transition_exprAction__normal_transitions0_actions0();
    _test__normal_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "CardComparator(boolean,char)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Collections.sort(cards, new CardComparator(true, \' \'))</li>\n\t\t</ul>\n")
  public void testAceIsHighest() {
    _transition_exprAction__aceIsHighest_transitions0_actions0();
    _test__aceIsHighest_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "CardComparator(boolean,char)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Collections.sort(cards, new CardComparator(false, \'D\'))</li>\n\t\t</ul>\n")
  public void testDiamondIsTrumph() {
    _transition_exprAction__diamondIsTrumph_transitions0_actions0();
    _test__diamondIsTrumph_transitions0_effect_state();
    
  }
  
  private void _transition_exprAction__normal_transitions0_actions0() {
    try {
      
      CardComparator _cardComparator = new CardComparator(false, ' ');
      Collections.<Card>sort(this.cards, _cardComparator);
      } catch (junit.framework.AssertionFailedError error) {
      fail("Collections.sort(cards, new CardComparator(false, ' ')) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__normal_transitions0_effect_state() {
    _test__normal_transitions0_effect_state_objectTests0_test(cards);
    
  }
  
  private void _test__normal_transitions0_effect_state_objectTests0_test(final List<Card> it) {
    
    assertEquals("it == #[c1, c13, d1, d13, h1, h13, s1, s13] failed after Collections.sort(cards, new CardComparator(false, ' '))", Collections.<Card>unmodifiableList(Lists.<Card>newArrayList(this.c1, this.c13, this.d1, this.d13, this.h1, this.h13, this.s1, this.s13)), it);
    
  }
  
  private void _transition_exprAction__aceIsHighest_transitions0_actions0() {
    try {
      
      CardComparator _cardComparator = new CardComparator(true, ' ');
      Collections.<Card>sort(this.cards, _cardComparator);
      } catch (junit.framework.AssertionFailedError error) {
      fail("Collections.sort(cards, new CardComparator(true, ' ')) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__aceIsHighest_transitions0_effect_state() {
    _test__aceIsHighest_transitions0_effect_state_objectTests0_test(cards);
    
  }
  
  private void _test__aceIsHighest_transitions0_effect_state_objectTests0_test(final List<Card> it) {
    
    assertEquals("it == #[c13, c1, d13, d1, h13, h1, s13, s1] failed after Collections.sort(cards, new CardComparator(true, ' '))", Collections.<Card>unmodifiableList(Lists.<Card>newArrayList(this.c13, this.c1, this.d13, this.d1, this.h13, this.h1, this.s13, this.s1)), it);
    
  }
  
  private void _transition_exprAction__diamondIsTrumph_transitions0_actions0() {
    try {
      
      CardComparator _cardComparator = new CardComparator(false, 'D');
      Collections.<Card>sort(this.cards, _cardComparator);
      } catch (junit.framework.AssertionFailedError error) {
      fail("Collections.sort(cards, new CardComparator(false, 'D')) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__diamondIsTrumph_transitions0_effect_state() {
    _test__diamondIsTrumph_transitions0_effect_state_objectTests0_test(cards);
    
  }
  
  private void _test__diamondIsTrumph_transitions0_effect_state_objectTests0_test(final List<Card> it) {
    
    assertEquals("it == #[c1, c13, h1, h13, s1, s13, d1, d13] failed after Collections.sort(cards, new CardComparator(false, 'D'))", Collections.<Card>unmodifiableList(Lists.<Card>newArrayList(this.c1, this.c13, this.h1, this.h13, this.s1, this.s13, this.d1, this.d13)), it);
    
  }
}
