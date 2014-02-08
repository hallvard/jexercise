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

@JExercise(description = "Tests objectstructures.CardDeck")
@SuppressWarnings("all")
public class CardDeckTest extends TestCase {
  private CardDeck deck;
  
  private CardDeck _init_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  @Override
  protected void setUp() {
    deck = _init_deck();
    
  }
  
  private boolean operator_equals(final CardDeck cardDeck, final Collection<String> toStrings) {
    boolean _xblockexpression = false;
    {
      int _cardCount = cardDeck.getCardCount();
      int _size = toStrings.size();
      boolean _notEquals = (_cardCount != _size);
      if (_notEquals) {
        return false;
      }
      int i = 0;
      for (final String toString : toStrings) {
        {
          Card _card = cardDeck.getCard(i);
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
  
  @JExercise(tests = "CardDeck(int)", description = "Tests initialization")
  public void testConstructor() {
    _test__constructor_transitions0_target(deck);
    
  }
  
  @JExercise(tests = "CardDeck(int);void shufflePerfectly()", description = "Tests the following sequence:<ul><li>shufflePerfectly</li></ul>")
  public void testShufflePerfectly() {
    _transition__shufflePerfectly_transitions0(deck);
    _test__shufflePerfectly_transitions0_target(deck);
    
  }
  
  @JExercise(tests = "CardDeck(int);void deal(objectstructures.CardHand,int)", description = "Tests the following sequence:<ul><li>deal(hand, 3)</li></ul>")
  public void testDeal() {
    CardHand hand = _init__deal_hand();
    _transition__deal_transitions0(deck, hand);
    _test__deal_transitions0_target(deck, hand);
    
  }
  
  private void _test__constructor_transitions0_target(final CardDeck it) {
    _test__constructor_transitions0_target_propertyTests0(deck);
    
  }
  
  private boolean _test__constructor_transitions0_target_propertyTests0(final CardDeck it) {
    
    boolean _equals = this.operator_equals(
      this.deck, Collections.<String>unmodifiableList(Lists.<String>newArrayList("S1", "S2", "H1", "H2", "D1", "D2", "C1", "C2")));
    assertTrue("deck == #[\"S1\", \"S2\", \"H1\", \"H2\", \"D1\", \"D2\", \"C1\", \"C2\"]; failed", _equals);
    return _equals;
  }
  
  private void _transition__shufflePerfectly_transitions0(final CardDeck it) {
    it.shufflePerfectly();
  }
  
  private void _test__shufflePerfectly_transitions0_target(final CardDeck it) {
    _test__shufflePerfectly_transitions0_target_propertyTests0(deck);
    
  }
  
  private boolean _test__shufflePerfectly_transitions0_target_propertyTests0(final CardDeck it) {
    
    boolean _equals = this.operator_equals(
      this.deck, Collections.<String>unmodifiableList(Lists.<String>newArrayList("S1", "D1", "S2", "D2", "H1", "C1", "H2", "C2")));
    assertTrue("deck == #[\"S1\", \"D1\", \"S2\", \"D2\", \"H1\", \"C1\", \"H2\", \"C2\"]; failed after shufflePerfectly", _equals);
    return _equals;
  }
  
  private CardHand _init__deal_hand() {
    return new CardHand();
    
  }
  
  private void _transition__deal_transitions0(final CardDeck it, final CardHand hand) {
    it.deal(hand, 3);
  }
  
  private void _test__deal_transitions0_target(final CardDeck it, final CardHand hand) {
    _test__deal_transitions0_target_propertyTests0(deck, hand);
    
  }
  
  private boolean _test__deal_transitions0_target_propertyTests0(final CardDeck it, final CardHand hand) {
    
    boolean _equals = this.operator_equals(
      this.deck, Collections.<String>unmodifiableList(Lists.<String>newArrayList("S1", "S2", "H1", "H2", "D1")));
    assertTrue("deck == #[\"S1\", \"S2\", \"H1\", \"H2\", \"D1\"]; failed after deal(hand, 3)", _equals);
    return _equals;
  }
}
