package interfaces;

import com.google.common.collect.Lists;
import interfaces.Card;
import interfaces.CardContainer;
import interfaces.CardContainerIterator;
import interfaces.CardDeck;
import interfaces.CardHand;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import junit.framework.Assert;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.CardContainer")
@SuppressWarnings("all")
public class CardContainerTest extends TestCase {
  private Card s1;
  
  private Card _init_s1() {
    Card _card = new Card('S', 1);
    return _card;
  }
  
  private Card s2;
  
  private Card _init_s2() {
    Card _card = new Card('S', 2);
    return _card;
  }
  
  private Card h1;
  
  private Card _init_h1() {
    Card _card = new Card('H', 1);
    return _card;
  }
  
  private Card h2;
  
  private Card _init_h2() {
    Card _card = new Card('H', 2);
    return _card;
  }
  
  private Card d1;
  
  private Card _init_d1() {
    Card _card = new Card('D', 1);
    return _card;
  }
  
  private Card d2;
  
  private Card _init_d2() {
    Card _card = new Card('D', 2);
    return _card;
  }
  
  private Card c1;
  
  private Card _init_c1() {
    Card _card = new Card('C', 1);
    return _card;
  }
  
  private Card c2;
  
  private Card _init_c2() {
    Card _card = new Card('C', 2);
    return _card;
  }
  
  @Override
  protected void setUp() {
    s1 = _init_s1();
    s2 = _init_s2();
    h1 = _init_h1();
    h2 = _init_h2();
    d1 = _init_d1();
    d2 = _init_d2();
    c1 = _init_c1();
    c2 = _init_c2();
    
  }
  
  private void testCards(final CardContainer it, final Collection<Card> cards) {
    int _size = cards.size();
    int _cardCount = it.getCardCount();
    Assert.assertEquals(_size, _cardCount);
    Iterator<Card> _iterator = it.iterator();
    this.testCards(_iterator, cards);
  }
  
  private void testCards(final Iterator<Card> iterator, final Collection<Card> cards) {
    final Iterator<Card> iterator2 = cards.iterator();
    boolean _and = false;
    boolean _hasNext = iterator.hasNext();
    if (!_hasNext) {
      _and = false;
    } else {
      boolean _hasNext_1 = iterator2.hasNext();
      _and = (_hasNext && _hasNext_1);
    }
    boolean _while = _and;
    while (_while) {
      {
        final Card expected = iterator.next();
        final Card actual = iterator2.next();
        char _suit = expected.getSuit();
        char _suit_1 = actual.getSuit();
        Assert.assertEquals(_suit, _suit_1);
        int _face = expected.getFace();
        int _face_1 = actual.getFace();
        Assert.assertEquals(_face, _face_1);
      }
      boolean _and_1 = false;
      boolean _hasNext_2 = iterator.hasNext();
      if (!_hasNext_2) {
        _and_1 = false;
      } else {
        boolean _hasNext_3 = iterator2.hasNext();
        _and_1 = (_hasNext_2 && _hasNext_3);
      }
      _while = _and_1;
    }
  }
  
  @JExercise(description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>hand.addCard(s1), hand.addCard(c2)</li>\n\t\t</ul>\n")
  public void testHandIterator() {
    CardHand hand = _init__handIterator_hand();
    _transition_exprAction__handIterator_transitions0_actions0(hand);
    _transition_exprAction__handIterator_transitions0_actions1(hand);
    _test__handIterator_transitions0_effect_state(hand);
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testDeckIterator() {
    CardDeck deck = _init__deckIterator_deck();
    _test__deckIterator_transitions0_effect_state(deck);
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testCardContainerIterator() {
    CardContainerIterator cardContainerIterator = _init__cardContainerIterator_cardContainerIterator();
    _test__cardContainerIterator_transitions0_effect_state(cardContainerIterator);
    
  }
  
  private CardHand _init__handIterator_hand() {
    return new CardHand();
    
  }
  
  private void _transition_exprAction__handIterator_transitions0_actions0(final CardHand hand) {
    try {
      
      hand.addCard(this.s1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(s1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__handIterator_transitions0_actions1(final CardHand hand) {
    try {
      
      hand.addCard(this.c2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hand.addCard(c2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__handIterator_transitions0_effect_state(final CardHand hand) {
    _test__handIterator_transitions0_effect_state_objectTests0_test(hand, hand);
    
  }
  
  private void _test__handIterator_transitions0_effect_state_objectTests0_test(final CardHand it, final CardHand hand) {
    try {
      
      this.testCards(it, Collections.<Card>unmodifiableList(Lists.<Card>newArrayList(this.s1, this.c2)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(#[s1, c2]) failed after hand.addCard(s1) ,hand.addCard(c2): " + error.getMessage());
    }
    
  }
  
  private CardDeck _init__deckIterator_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _test__deckIterator_transitions0_effect_state(final CardDeck deck) {
    _test__deckIterator_transitions0_effect_state_objectTests0_test(deck, deck);
    
  }
  
  private void _test__deckIterator_transitions0_effect_state_objectTests0_test(final CardDeck it, final CardDeck deck) {
    try {
      
      this.testCards(it, Collections.<Card>unmodifiableList(Lists.<Card>newArrayList(this.s1, this.s2, this.h1, this.h2, this.d1, this.d2, this.c1, this.c2)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(#[s1, s2, h1, h2, d1, d2, c1, c2]) failed: " + error.getMessage());
    }
    
  }
  
  private CardContainerIterator _init__cardContainerIterator_cardContainerIterator() {
    CardDeck _cardDeck = new CardDeck(2);
    CardContainerIterator _cardContainerIterator = new CardContainerIterator(_cardDeck);
    return _cardContainerIterator;
  }
  
  private void _test__cardContainerIterator_transitions0_effect_state(final CardContainerIterator cardContainerIterator) {
    _test__cardContainerIterator_transitions0_effect_state_objectTests0_test(cardContainerIterator, cardContainerIterator);
    
  }
  
  private void _test__cardContainerIterator_transitions0_effect_state_objectTests0_test(final CardContainerIterator it, final CardContainerIterator cardContainerIterator) {
    try {
      
      this.testCards(it, Collections.<Card>unmodifiableList(Lists.<Card>newArrayList(this.s1, this.s2, this.h1, this.h2, this.d1, this.d2, this.c1, this.c2)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testCards(#[s1, s2, h1, h2, d1, d2, c1, c2]) failed: " + error.getMessage());
    }
    
  }
}
