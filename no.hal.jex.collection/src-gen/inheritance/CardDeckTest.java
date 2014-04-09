package inheritance;

import inheritance.CardDeck;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.CardDeck")
@SuppressWarnings("all")
public class CardDeckTest extends TestCase {
  private CardDeck sub;
  
  private CardDeck _init_sub() {
    CardDeck _cardDeck = new CardDeck(4);
    return _cardDeck;
  }
  
  @Override
  protected void setUp() {
    sub = _init_sub();
    
  }
  
  @JExercise(tests = "CardDeck(int)", description = "<h3>Tester maxCardCount</h3>Tests \n\t\tinitialization\n")
  public void testAddCard() {
    _test__addCard_transitions0_effect_state(sub);
    
  }
  
  private void _test__addCard_transitions0_effect_state(final CardDeck it) {
    _test__addCard_transitions0_effect_state_objectTests0_test(sub);
    
  }
  
  private void _test__addCard_transitions0_effect_state_objectTests0_test(final CardDeck it) {
    try {
      
      } catch (junit.framework.AssertionFailedError error) {
      fail("sub instanceof CardContainerImpl failed: " + error.getMessage());
    }
    
    int _maxCardCount = it.getMaxCardCount();
    assertEquals("maxCardCount == 52 failed", 52, _maxCardCount);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(CardDeckTest.class);
  }
}
