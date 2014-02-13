package objectstructures;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import junit.framework.Assert;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Card;
import objectstructures.CardDeck;
import objectstructures.CardHand;

@JExercise(description = "Tests objectstructures.CardHand")
@SuppressWarnings("all")
public class CardHandTest extends TestCase {
  private CardHand cardHand;
  
  @Override
  protected void setUp() {
    cardHand = new CardHand();
    
  }
  
  private void testCards(final CardHand it, final Collection<String> toStrings) {
    int _size = toStrings.size();
    int _cardCount = it.getCardCount();
    Assert.assertEquals(_size, _cardCount);
    int i = 0;
    for (final String toString : toStrings) {
      {
        final Card card = it.getCard(i);
        char _suit = card.getSuit();
        String _valueOf = String.valueOf(_suit);
        int _face = card.getFace();
        String _plus = (_valueOf + Integer.valueOf(_face));
        Assert.assertEquals(toString, _plus);
        int _plus_1 = (i + 1);
        i = _plus_1;
      }
    }
  }
  
  @JExercise(tests = "CardHand()", description = "Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state(cardHand);
    
  }
  
  @JExercise(tests = "CardHand()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>deck.deal(cardHand, 3)</li>\n\t\t</ul>\n")
  public void testDeal() {
    CardDeck deck = _init__deal_deck();
    _transition_exprAction__deal_transitions0_actions0(cardHand, deck);
    _test__deal_transitions0_effect_state(cardHand, deck);
    
  }
  
  @JExercise(tests = "CardHand();objectstructures.Card play(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>deck.deal(cardHand, 3)</li>\n\t\t<li>play(1)</li>\n\t\t<li>play(0)</li>\n\t\t<li>play(0)</li>\n\t\t</ul>\n")
  public void testDealPlay() {
    CardDeck deck = _init__dealPlay_deck();
    _transition_exprAction__dealPlay_transitions0_actions0(cardHand, deck);
    _test__dealPlay_transitions0_effect_state(cardHand, deck);
    _transition_exprAction__dealPlay_transitions1_actions0(cardHand, deck);
    _test__dealPlay_transitions1_effect_state(cardHand, deck);
    _transition_exprAction__dealPlay_transitions2_actions0(cardHand, deck);
    _test__dealPlay_transitions2_effect_state(cardHand, deck);
    _transition_exprAction__dealPlay_transitions3_actions0(cardHand, deck);
    _test__dealPlay_transitions3_effect_state(cardHand, deck);
    
  }
  
  private void _test__constructor_transitions0_effect_state(final CardHand it) {
    _test__constructor_transitions0_effect_state_objectTests0_test(cardHand);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    assertEquals("cardCount == 0 failed", 0, _cardCount);
    
  }
  
  private CardDeck _init__deal_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _transition_exprAction__deal_transitions0_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      deck.deal(this.cardHand, 3);
      } catch (junit.framework.AssertionFailedError error) {
      fail("deck.deal(cardHand, 3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deal_transitions0_effect_state(final CardHand it, final CardDeck deck) {
    _test__deal_transitions0_effect_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__deal_transitions0_effect_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    try {
      
      this.testCards(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("C2", "C1", "D2")));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(it, #[\"C2\", \"C1\", \"D2\"]) failed after deck.deal(cardHand, 3): " + error.getMessage());
    }
    
  }
  
  private CardDeck _init__dealPlay_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _transition_exprAction__dealPlay_transitions0_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      deck.deal(this.cardHand, 3);
      } catch (junit.framework.AssertionFailedError error) {
      fail("deck.deal(cardHand, 3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__dealPlay_transitions0_effect_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions0_effect_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions0_effect_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    try {
      
      this.testCards(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("C2", "C1", "D2")));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(it, #[\"C2\", \"C1\", \"D2\"]) failed after deck.deal(cardHand, 3): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__dealPlay_transitions1_actions0(final CardHand it, final CardDeck deck) {
    
    Card _play = it.play(1);
    
  }
  
  private void _test__dealPlay_transitions1_effect_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions1_effect_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions1_effect_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    try {
      
      this.testCards(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("C2", "D2")));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(it, #[\"C2\", \"D2\"]) failed after play(1): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__dealPlay_transitions2_actions0(final CardHand it, final CardDeck deck) {
    
    Card _play = it.play(0);
    
  }
  
  private void _test__dealPlay_transitions2_effect_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions2_effect_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions2_effect_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    try {
      
      this.testCards(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("D2")));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(it, #[\"D2\"]) failed after play(0): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__dealPlay_transitions3_actions0(final CardHand it, final CardDeck deck) {
    
    Card _play = it.play(0);
    
  }
  
  private void _test__dealPlay_transitions3_effect_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions3_effect_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions3_effect_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    
    int _cardCount = it.getCardCount();
    assertEquals("cardCount == 0 failed after play(0)", 0, _cardCount);
    
  }
}
