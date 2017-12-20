package inheritance;

import inheritance.Card;
import inheritance.CardContainer;
import inheritance.CardHand;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import junit.framework.TestCase;
import no.hal.jex.jextest.extensions.JextestExtensions;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests inheritance.CardHand")
@SuppressWarnings("all")
public class CardHandTest extends TestCase {
  private CardHand hand;
  
  private CardHand _init_hand() {
    CardHand _cardHand = new CardHand(2);
    return _cardHand;
  }
  
  private Card s1;
  
  private Card _init_s1() {
    Card _card = new Card('S', 1);
    return _card;
  }
  
  private Card c2;
  
  private Card _init_c2() {
    Card _card = new Card('C', 2);
    return _card;
  }
  
  private Collection<Card> expected;
  
  private Collection<Card> _init_expected() {
    return Collections.<Card>unmodifiableList(CollectionLiterals.<Card>newArrayList(this.s1, this.c2));
  }
  
  @Override
  protected void setUp() {
    hand = _init_hand();
    s1 = _init_s1();
    c2 = _init_c2();
    expected = _init_expected();
    
  }
  
  private boolean operator_assertEquals(final CardContainer it, final Collection<Card> expected) {
    boolean _xblockexpression = false;
    {
      int _size = expected.size();
      int _cardCount = it.getCardCount();
      JextestExtensions.operator_assertEquals(_size, _cardCount);
      final Iterator<Card> expectedIt = expected.iterator();
      int i = 0;
      while (expectedIt.hasNext()) {
        {
          final Card expectedCard = expectedIt.next();
          final Card actualCard = it.getCard(i);
          char _suit = expectedCard.getSuit();
          char _suit_1 = actualCard.getSuit();
          JextestExtensions.operator_assertEquals(_suit, _suit_1);
          int _face = expectedCard.getFace();
          int _face_1 = actualCard.getFace();
          JextestExtensions.operator_assertEquals(_face, _face_1);
          i = (i + 1);
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  private boolean operator_assertEquals(final Iterable<Card> actual, final Iterator<Card> expected) {
    boolean _xblockexpression = false;
    {
      final Iterator<Card> actualIt = actual.iterator();
      while (expected.hasNext()) {
        {
          boolean _hasNext = actualIt.hasNext();
          TestCase.assertTrue(_hasNext);
          final Card expectedCard = expected.next();
          final Card actualCard = actualIt.next();
          char _suit = expectedCard.getSuit();
          char _suit_1 = actualCard.getSuit();
          JextestExtensions.operator_assertEquals(_suit, _suit_1);
          int _face = expectedCard.getFace();
          int _face_1 = actualCard.getFace();
          JextestExtensions.operator_assertEquals(_face, _face_1);
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "CardHand(int);void addCard(inheritance.Card)", description = "<h3>Tester maxCardCount</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Legger til kort: hand.addCard(new Card(\'S\',1)), hand.addCard(new Card(\'S\',2))</li>\n\t\t<li>Test at det ikke kan legges til flere kort: hand.addCard(new Card(\'S\', 3))</li>\n\t\t</ul>\n")
  public void testAddCard() {
    _test__addCard_transitions0_source_state();
    _transition_exprAction__addCard_transitions0_actions0();
    _transition_exprAction__addCard_transitions0_actions1();
    _test__addCard_transitions0_effects0_state();
    try {
      _transition_exprAction__addCard_transitions1_actions0();
      fail("IllegalStateException should be thrown after hand.addCard(new Card('S', 3))");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after hand.addCard(new Card('S', 3))", e instanceof IllegalStateException);
    }
    _test__addCard_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "CardHand(int);void addCard(inheritance.Card)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>hand.addCard(s1), hand.addCard(c2), hand.iterator</li>\n\t\t</ul>\n")
  public void testCardContainer() {
    _transition_exprAction__cardContainer_transitions0_actions0();
    _transition_exprAction__cardContainer_transitions0_actions1();
    _transition_exprAction__cardContainer_transitions0_actions2();
    _test__cardContainer_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "CardHand(int);void addCard(inheritance.Card)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>hand.addCard(s1), hand.addCard(c2), hand.iterator</li>\n\t\t</ul>\n")
  public void testHandIterator() {
    _transition_exprAction__handIterator_transitions0_actions0();
    _transition_exprAction__handIterator_transitions0_actions1();
    _transition_exprAction__handIterator_transitions0_actions2();
    _test__handIterator_transitions0_effects0_state();
    
  }
  
  private void _test__addCard_transitions0_source_state() {
    _test__addCard_transitions0_source_state_objectTests0_test();
    
  }
  
  private void _test__addCard_transitions0_source_state_objectTests0_test() {
    try {
      
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand instanceof CardContainerImpl failed after hand.addCard(new Card('S',1)) ,hand.addCard(new Card('S',2)): " + error.getMessage());
    }
    
    int _cardCount = this.hand.getCardCount();
    assertEquals("hand.cardCount == 0 failed after hand.addCard(new Card('S',1)) ,hand.addCard(new Card('S',2))", 0, _cardCount);
    
  }
  
  private void _transition_exprAction__addCard_transitions0_actions0() {
    try {
      
      Card _card = new Card('S', 1);
      this.hand.addCard(_card);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(new Card('S',1)) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addCard_transitions0_actions1() {
    try {
      
      Card _card = new Card('S', 2);
      this.hand.addCard(_card);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(new Card('S',2)) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addCard_transitions0_effects0_state() {
    _test__addCard_transitions0_effects0_state_objectTests0_test(hand);
    
  }
  
  private void _test__addCard_transitions0_effects0_state_objectTests0_test(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    assertEquals("cardCount == 2 failed after hand.addCard(new Card('S',1)) ,hand.addCard(new Card('S',2))", 2, _cardCount);
    
  }
  
  private void _transition_exprAction__addCard_transitions1_actions0() {
    try {
      
      Card _card = new Card('S', 3);
      this.hand.addCard(_card);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(new Card('S', 3)) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addCard_transitions2_effects0_state() {
    _test__addCard_transitions2_effects0_state_objectTests0_test(hand);
    
  }
  
  private void _test__addCard_transitions2_effects0_state_objectTests0_test(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    assertEquals("cardCount == 2 failed", 2, _cardCount);
    
  }
  
  private void _transition_exprAction__cardContainer_transitions0_actions0() {
    try {
      
      this.hand.addCard(this.s1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(s1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__cardContainer_transitions0_actions1() {
    try {
      
      this.hand.addCard(this.c2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(c2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__cardContainer_transitions0_actions2() {
    try {
      
      this.hand.iterator();
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.iterator failed: " + error.getMessage());
    }
    
  }
  
  private void _test__cardContainer_transitions0_effects0_state() {
    _test__cardContainer_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__cardContainer_transitions0_effects0_state_objectTests0_test() {
    
    assertTrue("hand ?= expected failed after hand.addCard(s1) ,hand.addCard(c2) ,hand.iterator", this.operator_assertEquals(
      this.hand, this.expected));
    
  }
  
  private void _transition_exprAction__handIterator_transitions0_actions0() {
    try {
      
      this.hand.addCard(this.s1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(s1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__handIterator_transitions0_actions1() {
    try {
      
      this.hand.addCard(this.c2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(c2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__handIterator_transitions0_actions2() {
    try {
      
      this.hand.iterator();
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.iterator failed: " + error.getMessage());
    }
    
  }
  
  private void _test__handIterator_transitions0_effects0_state() {
    _test__handIterator_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__handIterator_transitions0_effects0_state_objectTests0_test() {
    
    Iterator<Card> _iterator = this.expected.iterator();
    assertTrue("hand ?= expected.iterator failed after hand.addCard(s1) ,hand.addCard(c2) ,hand.iterator", this.operator_assertEquals(
      this.hand, _iterator));
    
  }
}
