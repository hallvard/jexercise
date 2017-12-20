package objectstructures;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Tweet;
import objectstructures.TwitterAccount;

@JExercise(description = "Tests objectstructures.Tweet")
@SuppressWarnings("all")
public class TweetTest extends TestCase {
  private TwitterAccount nils;
  
  private TwitterAccount _init_nils() {
    TwitterAccount _twitterAccount = new TwitterAccount("Nils");
    return _twitterAccount;
  }
  
  private TwitterAccount ole;
  
  private TwitterAccount _init_ole() {
    TwitterAccount _twitterAccount = new TwitterAccount("Ole");
    return _twitterAccount;
  }
  
  private TwitterAccount kari;
  
  private TwitterAccount _init_kari() {
    TwitterAccount _twitterAccount = new TwitterAccount("Kari");
    return _twitterAccount;
  }
  
  private Tweet tweet;
  
  private Tweet _init_tweet() {
    Tweet _tweet = new Tweet(this.nils, "Kvitre!");
    return _tweet;
  }
  
  private Tweet retweet1;
  
  private Tweet _init_retweet1() {
    return null;
  }
  
  private Tweet retweet2;
  
  private Tweet _init_retweet2() {
    return null;
  }
  
  @Override
  protected void setUp() {
    nils = _init_nils();
    ole = _init_ole();
    kari = _init_kari();
    tweet = _init_tweet();
    retweet1 = _init_retweet1();
    retweet2 = _init_retweet2();
    
  }
  
  @JExercise(tests = "Tweet(objectstructures.TwitterAccount,String)", description = "<h3>Konstrukt\u00F8r for ny tweet</h3>Tests \n\t\tinitialization\n")
  public void testConstructorNewTweet() {
    _test__constructorNewTweet_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "Tweet(objectstructures.TwitterAccount,String);Tweet(objectstructures.TwitterAccount,objectstructures.Tweet)", description = "<h3>Konstrukt\u00F8r for retweet</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>retweet1 = new Tweet(ole, tweet)</li>\n\t\t<li>Kan ikke retweete seg selv: new Tweet(nils, tweet)</li>\n\t\t</ul>\n")
  public void testConstructorRetweet() {
    _transition_exprAction__constructorRetweet_transitions0_actions0();
    _test__constructorRetweet_transitions0_effects0_state();
    try {
      _transition_exprAction__constructorRetweet_transitions1_actions0();
      fail("RuntimeException should be thrown after new Tweet(nils, tweet)");
    } catch (Exception e) {
      assertTrue("RuntimeException should be thrown after new Tweet(nils, tweet)", e instanceof RuntimeException);
    }
    
  }
  
  @JExercise(tests = "Tweet(objectstructures.TwitterAccount,String);Tweet(objectstructures.TwitterAccount,objectstructures.Tweet)", description = "<h3>Originalforfatter av retweets</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>retweet1 = new Tweet(ole, tweet)</li>\n\t\t<li>retweet2 = new Tweet(kari, tweet)</li>\n\t\t</ul>\n")
  public void testGetOriginalTweet() {
    _test__getOriginalTweet_transitions0_effects0_state();
    _transition_exprAction__getOriginalTweet_transitions1_actions0();
    _test__getOriginalTweet_transitions1_effects0_state();
    _transition_exprAction__getOriginalTweet_transitions2_actions0();
    _test__getOriginalTweet_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "Tweet(objectstructures.TwitterAccount,String);Tweet(objectstructures.TwitterAccount,objectstructures.Tweet)", description = "<h3>Retweet count</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>new Tweet(ole, tweet)</li>\n\t\t<li>new Tweet(kari, tweet)</li>\n\t\t</ul>\n")
  public void testGetRetweetCount() {
    _test__getRetweetCount_transitions0_effects0_state();
    _transition_exprAction__getRetweetCount_transitions1_actions0();
    _test__getRetweetCount_transitions1_effects0_state();
    _transition_exprAction__getRetweetCount_transitions2_actions0();
    _test__getRetweetCount_transitions2_effects0_state();
    
  }
  
  private void _test__constructorNewTweet_transitions0_effects0_state() {
    _test__constructorNewTweet_transitions0_effects0_state_objectTests0_test(tweet);
    
  }
  
  private void _test__constructorNewTweet_transitions0_effects0_state_objectTests0_test(final Tweet it) {
    
    String _text = it.getText();
    assertEquals("text == \"Kvitre!\" failed", "Kvitre!", _text);
    
    TwitterAccount _owner = it.getOwner();
    assertEquals("owner == nils failed", this.nils, _owner);
    
  }
  
  private void _transition_exprAction__constructorRetweet_transitions0_actions0() {
    try {
      
      Tweet _tweet = new Tweet(this.ole, this.tweet);
      this.retweet1 = _tweet;
      } catch (junit.framework.AssertionFailedError error) {
      fail("retweet1 = new Tweet(ole, tweet) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructorRetweet_transitions0_effects0_state() {
    _test__constructorRetweet_transitions0_effects0_state_objectTests0_test(retweet1);
    
  }
  
  private void _test__constructorRetweet_transitions0_effects0_state_objectTests0_test(final Tweet it) {
    
    String _text = it.getText();
    assertEquals("text == \"Kvitre!\" failed after retweet1 = new Tweet(ole, tweet)", "Kvitre!", _text);
    
    TwitterAccount _owner = it.getOwner();
    assertEquals("owner == ole failed after retweet1 = new Tweet(ole, tweet)", this.ole, _owner);
    
  }
  
  private void _transition_exprAction__constructorRetweet_transitions1_actions0() {
    try {
      
      new Tweet(this.nils, this.tweet);
      } catch (junit.framework.AssertionFailedError error) {
      fail("new Tweet(nils, tweet) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getOriginalTweet_transitions0_effects0_state() {
    _test__getOriginalTweet_transitions0_effects0_state_objectTests0_test(tweet);
    
  }
  
  private void _test__getOriginalTweet_transitions0_effects0_state_objectTests0_test(final Tweet it) {
    
    Tweet _originalTweet = it.getOriginalTweet();
    assertEquals("originalTweet == null failed", null, _originalTweet);
    
  }
  
  private void _transition_exprAction__getOriginalTweet_transitions1_actions0() {
    try {
      
      Tweet _tweet = new Tweet(this.ole, this.tweet);
      this.retweet1 = _tweet;
      } catch (junit.framework.AssertionFailedError error) {
      fail("retweet1 = new Tweet(ole, tweet) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getOriginalTweet_transitions1_effects0_state() {
    _test__getOriginalTweet_transitions1_effects0_state_objectTests0_test(retweet1);
    
  }
  
  private void _test__getOriginalTweet_transitions1_effects0_state_objectTests0_test(final Tweet it) {
    
    Tweet _originalTweet = it.getOriginalTweet();
    assertEquals("originalTweet == tweet failed after retweet1 = new Tweet(ole, tweet)", this.tweet, _originalTweet);
    
    Tweet _originalTweet_1 = it.getOriginalTweet();
    String _text = _originalTweet_1.getText();
    String _text_1 = it.getText();
    assertEquals("text == originalTweet.text failed after retweet1 = new Tweet(ole, tweet)", _text, _text_1);
    
  }
  
  private void _transition_exprAction__getOriginalTweet_transitions2_actions0() {
    try {
      
      Tweet _tweet = new Tweet(this.kari, this.tweet);
      this.retweet2 = _tweet;
      } catch (junit.framework.AssertionFailedError error) {
      fail("retweet2 = new Tweet(kari, tweet) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getOriginalTweet_transitions2_effects0_state() {
    _test__getOriginalTweet_transitions2_effects0_state_objectTests0_test(retweet2);
    
  }
  
  private void _test__getOriginalTweet_transitions2_effects0_state_objectTests0_test(final Tweet it) {
    
    Tweet _originalTweet = it.getOriginalTweet();
    assertEquals("originalTweet == tweet failed after retweet2 = new Tweet(kari, tweet)", this.tweet, _originalTweet);
    
    Tweet _originalTweet_1 = it.getOriginalTweet();
    String _text = _originalTweet_1.getText();
    String _text_1 = it.getText();
    assertEquals("text == originalTweet.text failed after retweet2 = new Tweet(kari, tweet)", _text, _text_1);
    
  }
  
  private void _test__getRetweetCount_transitions0_effects0_state() {
    _test__getRetweetCount_transitions0_effects0_state_objectTests0_test(tweet);
    
  }
  
  private void _test__getRetweetCount_transitions0_effects0_state_objectTests0_test(final Tweet it) {
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 0 failed", 0, _retweetCount);
    
  }
  
  private void _transition_exprAction__getRetweetCount_transitions1_actions0() {
    try {
      
      new Tweet(this.ole, this.tweet);
      } catch (junit.framework.AssertionFailedError error) {
      fail("new Tweet(ole, tweet) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRetweetCount_transitions1_effects0_state() {
    _test__getRetweetCount_transitions1_effects0_state_objectTests0_test(tweet);
    
  }
  
  private void _test__getRetweetCount_transitions1_effects0_state_objectTests0_test(final Tweet it) {
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 1 failed after new Tweet(ole, tweet)", 1, _retweetCount);
    
  }
  
  private void _transition_exprAction__getRetweetCount_transitions2_actions0() {
    try {
      
      new Tweet(this.kari, this.tweet);
      } catch (junit.framework.AssertionFailedError error) {
      fail("new Tweet(kari, tweet) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getRetweetCount_transitions2_effects0_state() {
    _test__getRetweetCount_transitions2_effects0_state_objectTests0_test(tweet);
    
  }
  
  private void _test__getRetweetCount_transitions2_effects0_state_objectTests0_test(final Tweet it) {
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 2 failed after new Tweet(kari, tweet)", 2, _retweetCount);
    
  }
}
