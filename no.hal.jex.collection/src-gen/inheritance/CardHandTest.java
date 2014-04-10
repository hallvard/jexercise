package inheritance;

import inheritance.Card;
import inheritance.CardHand;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.CardHand")
@SuppressWarnings("all")
public class CardHandTest extends TestCase {
  private CardHand sub;
  
  private CardHand _init_sub() {
    CardHand _cardHand = new CardHand(2);
    return _cardHand;
  }
  
  @Override
  protected void setUp() {
    sub = _init_sub();
    
  }
  
  @JExercise(tests = "CardHand(int);void addCard(inheritance.Card)", description = "<h3>Tester maxCardCount</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Legger til kort: addCard(new Card(\'S\',1)), addCard(new Card(\'S\',2))</li>\n\t\t<li>Test at det ikke kan legges til flere kort: addCard(new Card(\'S\', 3))</li>\n\t\t</ul>\n")
  public void testAddCard() {
    _test__addCard_transitions0_source_state(sub);
    _transition_exprAction__addCard_transitions0_actions0(sub);
    _transition_exprAction__addCard_transitions0_actions1(sub);
    _test__addCard_transitions0_effect_state(sub);
    try {
      _transition_exprAction__addCard_transitions1_actions0(sub);
      fail("IllegalStateException should be thrown after addCard(new Card('S', 3))");
    } catch (Exception e) {
      assertTrue("IllegalStateException should be thrown after addCard(new Card('S', 3))", e instanceof IllegalStateException);
    }
    _test__addCard_transitions2_effect_state(sub);
    
  }
  
  private void _test__addCard_transitions0_source_state(final CardHand it) {
    _test__addCard_transitions0_source_state_objectTests0_test(sub);
    
  }
  
  private void _test__addCard_transitions0_source_state_objectTests0_test(final CardHand it) {
    try {
      
      } catch (junit.framework.AssertionFailedError error) {
      fail("sub instanceof CardContainerImpl failed after addCard(new Card('S',1)) ,addCard(new Card('S',2)): " + error.getMessage());
    }
    
    int _cardCount = it.getCardCount();
    assertEquals("getCardCount() == 0 failed after addCard(new Card('S',1)) ,addCard(new Card('S',2))", 0, _cardCount);
    
  }
  
  private void _transition_exprAction__addCard_transitions0_actions0(final CardHand it) {
    try {
      
      Card _card = new Card('S', 1);
      it.addCard(_card);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addCard(new Card('S',1)) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__addCard_transitions0_actions1(final CardHand it) {
    try {
      
      Card _card = new Card('S', 2);
      it.addCard(_card);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addCard(new Card('S',2)) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addCard_transitions0_effect_state(final CardHand it) {
    _test__addCard_transitions0_effect_state_objectTests0_test(sub);
    
  }
  
  private void _test__addCard_transitions0_effect_state_objectTests0_test(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    assertEquals("cardCount == 2 failed after addCard(new Card('S',1)) ,addCard(new Card('S',2))", 2, _cardCount);
    
  }
  
  private void _transition_exprAction__addCard_transitions1_actions0(final CardHand it) {
    try {
      
      Card _card = new Card('S', 3);
      it.addCard(_card);
      } catch (junit.framework.AssertionFailedError error) {
      fail("addCard(new Card('S', 3)) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addCard_transitions2_effect_state(final CardHand it) {
    _test__addCard_transitions2_effect_state_objectTests0_test(sub);
    
  }
  
  private void _test__addCard_transitions2_effect_state_objectTests0_test(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    assertEquals("cardCount == 2 failed", 2, _cardCount);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(CardHandTest.class);
  }
}
