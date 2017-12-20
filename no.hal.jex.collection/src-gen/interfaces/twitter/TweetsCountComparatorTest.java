package interfaces.twitter;

import interfaces.twitter.TweetsCountComparator;
import interfaces.twitter.TwitterAccount;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.twitter.TweetsCountComparator")
@SuppressWarnings("all")
public class TweetsCountComparatorTest extends TestCase {
  private TweetsCountComparator comparator;
  
  private TweetsCountComparator _init_comparator() {
    TweetsCountComparator _tweetsCountComparator = new TweetsCountComparator();
    return _tweetsCountComparator;
  }
  
  private TwitterAccount mostTweet;
  
  private TwitterAccount _init_mostTweet() {
    TwitterAccount _twitterAccount = new TwitterAccount("aaron");
    return _twitterAccount;
  }
  
  private TwitterAccount lessTweet1;
  
  private TwitterAccount _init_lessTweet1() {
    TwitterAccount _twitterAccount = new TwitterAccount("ben");
    return _twitterAccount;
  }
  
  private TwitterAccount lessTweet2;
  
  private TwitterAccount _init_lessTweet2() {
    TwitterAccount _twitterAccount = new TwitterAccount("charlie");
    return _twitterAccount;
  }
  
  @Override
  protected void setUp() {
    comparator = _init_comparator();
    mostTweet = _init_mostTweet();
    lessTweet1 = _init_lessTweet1();
    lessTweet2 = _init_lessTweet2();
    
  }
  
  @JExercise(tests = "TweetsCountComparator()", description = "<h3>Sammenligner TwitterAccounts p\u00E5 antall tweets.</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Tweeter: mostTweet.tweet(\"tweet\"), mostTweet.tweet(\"tweet\"), lessTweet1.tweet(\"tweet\"), lessTweet2.tweet(\"tweet\")</li>\n\t\t</ul>\n")
  public void testCompare() {
    _transition_exprAction__compare_transitions0_actions0();
    _transition_exprAction__compare_transitions0_actions1();
    _transition_exprAction__compare_transitions0_actions2();
    _transition_exprAction__compare_transitions0_actions3();
    _test__compare_transitions0_effects0_state();
    
  }
  
  private void _transition_exprAction__compare_transitions0_actions0() {
    try {
      
      this.mostTweet.tweet("tweet");
      } catch (junit.framework.AssertionFailedError error) {
      fail("mostTweet.tweet(\"tweet\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__compare_transitions0_actions1() {
    try {
      
      this.mostTweet.tweet("tweet");
      } catch (junit.framework.AssertionFailedError error) {
      fail("mostTweet.tweet(\"tweet\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__compare_transitions0_actions2() {
    try {
      
      this.lessTweet1.tweet("tweet");
      } catch (junit.framework.AssertionFailedError error) {
      fail("lessTweet1.tweet(\"tweet\") failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__compare_transitions0_actions3() {
    try {
      
      this.lessTweet2.tweet("tweet");
      } catch (junit.framework.AssertionFailedError error) {
      fail("lessTweet2.tweet(\"tweet\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__compare_transitions0_effects0_state() {
    _test__compare_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__compare_transitions0_effects0_state_objectTests0_test() {
    
    int _compare = this.comparator.compare(this.mostTweet, this.lessTweet1);
    boolean _lessThan = (_compare < 0);
    assertTrue("comparator.compare(mostTweet, lessTweet1) < 0 failed after mostTweet.tweet(\"tweet\") ,mostTweet.tweet(\"tweet\") ,lessTweet1.tweet(\"tweet\") ,lessTweet2.tweet(\"tweet\")", _lessThan);
    
    int _compare_1 = this.comparator.compare(this.lessTweet1, this.mostTweet);
    boolean _greaterThan = (_compare_1 > 0);
    assertTrue("comparator.compare(lessTweet1, mostTweet) > 0 failed after mostTweet.tweet(\"tweet\") ,mostTweet.tweet(\"tweet\") ,lessTweet1.tweet(\"tweet\") ,lessTweet2.tweet(\"tweet\")", _greaterThan);
    
    int _compare_2 = this.comparator.compare(this.lessTweet1, this.lessTweet2);
    assertEquals("comparator.compare(lessTweet1, lessTweet2) == 0 failed after mostTweet.tweet(\"tweet\") ,mostTweet.tweet(\"tweet\") ,lessTweet1.tweet(\"tweet\") ,lessTweet2.tweet(\"tweet\")", 0, _compare_2);
    
  }
}
