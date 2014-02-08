package objectstructures;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
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
  
  private boolean operator_equals(final CardHand cardHand, final Collection<String> toStrings) {
    boolean _xblockexpression = false;
    {
      int _cardCount = cardHand.getCardCount();
      int _size = toStrings.size();
      boolean _notEquals = (_cardCount != _size);
      if (_notEquals) {
        return false;
      }
      int i = 0;
      for (final String toString : toStrings) {
        {
          Card _card = cardHand.getCard(i);
          String _string = _card.toString();
          boolean _notEquals_1 = (!Objects.equal(_string, toString));
          if (_notEquals_1) {
            return false;
          }
          int _plus = (i + 1);
          i = _plus;
        }
      }
      _xblockexpression = (true);
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "CardHand()", description = "Tests initialization")
  public void testConstructor() {
    _test__constructor_transitions0_target(cardHand);
    
  }
  
  @JExercise(tests = "CardHand()", description = "Tests the following sequence:<ul><li>deck.deal(cardHand, 3)</li></ul>")
  public void testDeal() {
    CardDeck deck = _init__deal_deck();
    _transition__deal_transitions0(cardHand, deck);
    _test__deal_transitions0_target(cardHand, deck);
    
  }
  
  @JExercise(tests = "CardHand();objectstructures.Card play(int)", description = "Tests the following sequence:<ul><li>deck.deal(cardHand, 3)</li><li>play(1)</li><li>play(0)</li><li>play(0)</li></ul>")
  public void testDealPlay() {
    CardDeck deck = _init__dealPlay_deck();
    _transition__dealPlay_transitions0(cardHand, deck);
    _test__dealPlay_transitions0_target(cardHand, deck);
    _transition__dealPlay_transitions1(cardHand, deck);
    _test__dealPlay_transitions1_target(cardHand, deck);
    _transition__dealPlay_transitions2(cardHand, deck);
    _test__dealPlay_transitions2_target(cardHand, deck);
    _transition__dealPlay_transitions3(cardHand, deck);
    _test__dealPlay_transitions3_target(cardHand, deck);
    
  }
  
  private void _test__constructor_transitions0_target(final CardHand it) {
    _test__constructor_transitions0_target_propertyTests0(cardHand);
    
  }
  
  private boolean _test__constructor_transitions0_target_propertyTests0(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    boolean _equals = (_cardCount == 0);
    assertTrue("cardCount == 0; failed", _equals);
    return _equals;
  }
  
  private CardDeck _init__deal_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _transition__deal_transitions0(final CardHand it, final CardDeck deck) {
    deck.deal(this.cardHand, 3);
  }
  
  private void _test__deal_transitions0_target(final CardHand it, final CardDeck deck) {
    _test__deal_transitions0_target_propertyTests0(cardHand, deck);
    
  }
  
  private boolean _test__deal_transitions0_target_propertyTests0(final CardHand it, final CardDeck deck) {
    
    boolean _equals = this.operator_equals(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("C2", "C1", "D2")));
    assertTrue("it == #[\"C2\", \"C1\", \"D2\"]; failed after deck.deal(cardHand, 3)", _equals);
    return _equals;
  }
  
  private CardDeck _init__dealPlay_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _transition__dealPlay_transitions0(final CardHand it, final CardDeck deck) {
    deck.deal(this.cardHand, 3);
  }
  
  private void _test__dealPlay_transitions0_target(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions0_target_propertyTests0(cardHand, deck);
    
  }
  
  private Card _transition__dealPlay_transitions1(final CardHand it, final CardDeck deck) {
    Card _play = it.play(1);
    return _play;
  }
  
  private void _test__dealPlay_transitions1_target(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions1_target_propertyTests0(cardHand, deck);
    
  }
  
  private Card _transition__dealPlay_transitions2(final CardHand it, final CardDeck deck) {
    Card _play = it.play(0);
    return _play;
  }
  
  private void _test__dealPlay_transitions2_target(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions2_target_propertyTests0(cardHand, deck);
    
  }
  
  private Card _transition__dealPlay_transitions3(final CardHand it, final CardDeck deck) {
    Card _play = it.play(0);
    return _play;
  }
  
  private void _test__dealPlay_transitions3_target(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions3_target_propertyTests0(cardHand, deck);
    
  }
  
  private boolean _test__dealPlay_transitions0_target_propertyTests0(final CardHand it, final CardDeck deck) {
    
    boolean _equals = this.operator_equals(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("C2", "C1", "D2")));
    assertTrue("it == #[\"C2\", \"C1\", \"D2\"]; failed after deck.deal(cardHand, 3)", _equals);
    return _equals;
  }
  
  private boolean _test__dealPlay_transitions1_target_propertyTests0(final CardHand it, final CardDeck deck) {
    
    boolean _equals = this.operator_equals(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("C2", "D2")));
    assertTrue("it == #[\"C2\", \"D2\"]; failed after play(1)", _equals);
    return _equals;
  }
  
  private boolean _test__dealPlay_transitions2_target_propertyTests0(final CardHand it, final CardDeck deck) {
    
    boolean _equals = this.operator_equals(it, Collections.<String>unmodifiableList(Lists.<String>newArrayList("D2")));
    assertTrue("it == #[\"D2\"]; failed after play(0)", _equals);
    return _equals;
  }
  
  private boolean _test__dealPlay_transitions3_target_propertyTests0(final CardHand it, final CardDeck deck) {
    
    int _cardCount = it.getCardCount();
    boolean _equals = (_cardCount == 0);
    assertTrue("cardCount == 0; failed after play(0)", _equals);
    return _equals;
  }
}
