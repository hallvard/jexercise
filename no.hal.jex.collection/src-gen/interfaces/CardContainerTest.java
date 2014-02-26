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
  
  private void testCards(final CardContainer it, final Collection<Card> expected) {
    int _size = expected.size();
    int _cardCount = it.getCardCount();
    Assert.assertEquals(_size, _cardCount);
    final Iterator<Card> expectedIt = expected.iterator();
    int i = 0;
    boolean _hasNext = expectedIt.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final Card expectedCard = expectedIt.next();
        final Card actualCard = it.getCard(i);
        char _suit = expectedCard.getSuit();
        char _suit_1 = actualCard.getSuit();
        Assert.assertEquals(_suit, _suit_1);
        int _face = expectedCard.getFace();
        int _face_1 = actualCard.getFace();
        Assert.assertEquals(_face, _face_1);
        int _plus = (i + 1);
        i = _plus;
      }
      boolean _hasNext_1 = expectedIt.hasNext();
      _while = _hasNext_1;
    }
  }
  
  private void testCards(final Iterator<Card> actual, final Collection<Card> expected) {
    final Iterator<Card> expectedIt = expected.iterator();
    boolean _hasNext = expectedIt.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        boolean _hasNext_1 = actual.hasNext();
        Assert.assertTrue(_hasNext_1);
        final Card expectedCard = expectedIt.next();
        final Card actualCard = actual.next();
        char _suit = expectedCard.getSuit();
        char _suit_1 = actualCard.getSuit();
        Assert.assertEquals(_suit, _suit_1);
        int _face = expectedCard.getFace();
        int _face_1 = actualCard.getFace();
        Assert.assertEquals(_face, _face_1);
      }
      boolean _hasNext_1 = expectedIt.hasNext();
      _while = _hasNext_1;
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
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(CardContainerTest.class);
  }
}
