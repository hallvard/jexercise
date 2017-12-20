package objectstructures;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Tweet;
import objectstructures.TwitterAccount;

@JExercise(description = "Tests objectstructures.TwitterAccount")
@SuppressWarnings("all")
public class TwitterAccountTest extends TestCase {
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
  
  @Override
  protected void setUp() {
    nils = _init_nils();
    ole = _init_ole();
    
  }
  
  @JExercise(tests = "TwitterAccount(String)", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "TwitterAccount(String);void follow(objectstructures.TwitterAccount)", description = "<h3>F\u00F8lge en annen bruker</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Nils f\u00F8lger Ole: nils.follow(ole)</li>\n\t\t<li>Ole f\u00F8lger Nils: ole.follow(nils)</li>\n\t\t</ul>\n")
  public void testFollow() {
    _transition_exprAction__follow_transitions0_actions0();
    _test__follow_transitions0_effects0_state();
    _transition_exprAction__follow_transitions1_actions0();
    _test__follow_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "TwitterAccount(String);void unfollow(objectstructures.TwitterAccount);void follow(objectstructures.TwitterAccount)", description = "<h3>Slutte \u00E5 f\u00F8lge en annen bruker</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Nils slutter \u00E5 f\u00F8lge Ole uten \u00E5 f\u00F8lge han fra f\u00F8r: nils.unfollow(ole)</li>\n\t\t<li>Nils f\u00F8lger Ole: nils.follow(ole)</li>\n\t\t<li>Nils slutter \u00E5 f\u00F8lge Ole: nils.unfollow(ole)</li>\n\t\t</ul>\n")
  public void testUnfollow() {
    _transition_exprAction__unfollow_transitions0_actions0();
    _test__unfollow_transitions0_effects0_state();
    _transition_exprAction__unfollow_transitions1_actions0();
    _test__unfollow_transitions1_effects0_state();
    _transition_exprAction__unfollow_transitions2_actions0();
    _test__unfollow_transitions2_effects0_state();
    
  }
  
  @JExercise(tests = "TwitterAccount(String);void tweet(String)", description = "<h3>Opprette ny tweet</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Nils tvitrer: nils.tweet(\"Kvitre!\")</li>\n\t\t<li>Nils tvitrer en gang til: nils.tweet(\"Kvitre igjen!\")</li>\n\t\t</ul>\n")
  public void testNewTweet() {
    _transition_exprAction__newTweet_transitions0_actions0();
    _test__newTweet_transitions0_effects0_state();
    _transition_exprAction__newTweet_transitions1_actions0();
    _test__newTweet_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "TwitterAccount(String);objectstructures.Tweet getTweet(int);void tweet(String)", description = "<h3>Hente tweet fra feil indeks</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>nils.getTweet(1)</li>\n\t\t<li>nils.getTweet(-1)</li>\n\t\t<li>nils.tweet(\"Kvitre!\")</li>\n\t\t<li>nils.getTweet(2)</li>\n\t\t<li>nils.getTweet(-1)</li>\n\t\t</ul>\n")
  public void testGetTweetIllegal() {
    try {
      _transition_exprAction__getTweetIllegal_transitions0_actions0();
      fail("RuntimeException should be thrown after nils.getTweet(1)");
    } catch (Exception e) {
      assertTrue("RuntimeException should be thrown after nils.getTweet(1)", e instanceof RuntimeException);
    }
    try {
      _transition_exprAction__getTweetIllegal_transitions1_actions0();
      fail("RuntimeException should be thrown after nils.getTweet(-1)");
    } catch (Exception e_1) {
      assertTrue("RuntimeException should be thrown after nils.getTweet(-1)", e_1 instanceof RuntimeException);
    }
    _transition_exprAction__getTweetIllegal_transitions2_actions0();
    _test__getTweetIllegal_transitions2_effects0_state();
    try {
      _transition_exprAction__getTweetIllegal_transitions3_actions0();
      fail("RuntimeException should be thrown after nils.getTweet(2)");
    } catch (Exception e_2) {
      assertTrue("RuntimeException should be thrown after nils.getTweet(2)", e_2 instanceof RuntimeException);
    }
    try {
      _transition_exprAction__getTweetIllegal_transitions4_actions0();
      fail("RuntimeException should be thrown after nils.getTweet(-1)");
    } catch (Exception e_3) {
      assertTrue("RuntimeException should be thrown after nils.getTweet(-1)", e_3 instanceof RuntimeException);
    }
    
  }
  
  @JExercise(tests = "TwitterAccount(String);void tweet(String);void retweet(objectstructures.Tweet);objectstructures.Tweet getTweet(int)", description = "<h3>Retweete noen andres tweet</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Nils tvitrer: nils.tweet(\"Kvitre!\")</li>\n\t\t<li>Ole retweeter Nils: ole.retweet(nils.getTweet(1))</li>\n\t\t<li>Kari retweeter Ole sin retweet: kari.retweet(ole.getTweet(1))</li>\n\t\t</ul>\n")
  public void testRetweet() {
    TwitterAccount kari = _init__retweet_kari();
    _transition_exprAction__retweet_transitions0_actions0(kari);
    _test__retweet_transitions0_effects0_state(kari);
    _transition_exprAction__retweet_transitions1_actions0(kari);
    _test__retweet_transitions1_effects0_state(kari);
    _transition_exprAction__retweet_transitions2_actions0(kari);
    _test__retweet_transitions2_effects0_state(kari);
    
  }
  
  private void _test__constructor_transitions0_effects0_state() {
    _test__constructor_transitions0_effects0_state_objectTests0_test(nils);
    _test__constructor_transitions0_effects0_state_objectTests1_test(ole);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    String _userName = it.getUserName();
    assertEquals("userName == \"Nils\" failed", "Nils", _userName);
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 0 failed", 0, _tweetCount);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests1_test(final TwitterAccount it) {
    
    String _userName = it.getUserName();
    assertEquals("userName == \"Ole\" failed", "Ole", _userName);
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 0 failed", 0, _tweetCount);
    
  }
  
  private void _transition_exprAction__follow_transitions0_actions0() {
    try {
      
      this.nils.follow(this.ole);
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.follow(ole) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__follow_transitions0_effects0_state() {
    _test__follow_transitions0_effects0_state_objectTests0_test(nils);
    _test__follow_transitions0_effects0_state_objectTests1_test(ole);
    
  }
  
  private void _test__follow_transitions0_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.ole);
    assertTrue("isFollowing(ole) failed after nils.follow(ole)", _isFollowing);
    
    boolean _isFollowedBy = it.isFollowedBy(this.ole);
    assertTrue("! isFollowedBy(ole) failed after nils.follow(ole)", (!_isFollowedBy));
    
  }
  
  private void _test__follow_transitions0_effects0_state_objectTests1_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.nils);
    boolean _not = (!_isFollowing);
    assertTrue("! isFollowing(nils) failed after nils.follow(ole)", _not);
    
    assertTrue("isFollowedBy(nils) failed after nils.follow(ole)", it.isFollowedBy(this.nils));
    
  }
  
  private void _transition_exprAction__follow_transitions1_actions0() {
    try {
      
      this.ole.follow(this.nils);
      } catch (junit.framework.AssertionFailedError error) {
      fail("ole.follow(nils) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__follow_transitions1_effects0_state() {
    _test__follow_transitions1_effects0_state_objectTests0_test(nils);
    _test__follow_transitions1_effects0_state_objectTests1_test(ole);
    
  }
  
  private void _test__follow_transitions1_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.ole);
    assertTrue("isFollowing(ole) failed after ole.follow(nils)", _isFollowing);
    
    assertTrue("isFollowedBy(ole) failed after ole.follow(nils)", it.isFollowedBy(this.ole));
    
  }
  
  private void _test__follow_transitions1_effects0_state_objectTests1_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.nils);
    assertTrue("isFollowing(nils) failed after ole.follow(nils)", _isFollowing);
    
    assertTrue("isFollowedBy(nils) failed after ole.follow(nils)", it.isFollowedBy(this.nils));
    
  }
  
  private void _transition_exprAction__unfollow_transitions0_actions0() {
    try {
      
      this.nils.unfollow(this.ole);
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.unfollow(ole) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__unfollow_transitions0_effects0_state() {
    _test__unfollow_transitions0_effects0_state_objectTests0_test(nils);
    _test__unfollow_transitions0_effects0_state_objectTests1_test(ole);
    
  }
  
  private void _test__unfollow_transitions0_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.ole);
    boolean _not = (!_isFollowing);
    assertTrue("! isFollowing(ole) failed after nils.unfollow(ole)", _not);
    
    boolean _isFollowedBy = it.isFollowedBy(this.ole);
    assertTrue("! isFollowedBy(ole) failed after nils.unfollow(ole)", (!_isFollowedBy));
    
  }
  
  private void _test__unfollow_transitions0_effects0_state_objectTests1_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.nils);
    boolean _not = (!_isFollowing);
    assertTrue("! isFollowing(nils) failed after nils.unfollow(ole)", _not);
    
    boolean _isFollowedBy = it.isFollowedBy(this.nils);
    assertTrue("! isFollowedBy(nils) failed after nils.unfollow(ole)", (!_isFollowedBy));
    
  }
  
  private void _transition_exprAction__unfollow_transitions1_actions0() {
    try {
      
      this.nils.follow(this.ole);
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.follow(ole) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__unfollow_transitions1_effects0_state() {
    _test__unfollow_transitions1_effects0_state_objectTests0_test(nils);
    _test__unfollow_transitions1_effects0_state_objectTests1_test(ole);
    
  }
  
  private void _test__unfollow_transitions1_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.ole);
    assertTrue("isFollowing(ole) failed after nils.follow(ole)", _isFollowing);
    
    boolean _isFollowedBy = it.isFollowedBy(this.ole);
    assertTrue("! isFollowedBy(ole) failed after nils.follow(ole)", (!_isFollowedBy));
    
  }
  
  private void _test__unfollow_transitions1_effects0_state_objectTests1_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.nils);
    boolean _not = (!_isFollowing);
    assertTrue("! isFollowing(nils) failed after nils.follow(ole)", _not);
    
    assertTrue("isFollowedBy(nils) failed after nils.follow(ole)", it.isFollowedBy(this.nils));
    
  }
  
  private void _transition_exprAction__unfollow_transitions2_actions0() {
    try {
      
      this.nils.unfollow(this.ole);
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.unfollow(ole) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__unfollow_transitions2_effects0_state() {
    _test__unfollow_transitions2_effects0_state_objectTests0_test(nils);
    _test__unfollow_transitions2_effects0_state_objectTests1_test(ole);
    
  }
  
  private void _test__unfollow_transitions2_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.ole);
    boolean _not = (!_isFollowing);
    assertTrue("! isFollowing(ole) failed after nils.unfollow(ole)", _not);
    
    boolean _isFollowedBy = it.isFollowedBy(this.ole);
    assertTrue("! isFollowedBy(ole) failed after nils.unfollow(ole)", (!_isFollowedBy));
    
  }
  
  private void _test__unfollow_transitions2_effects0_state_objectTests1_test(final TwitterAccount it) {
    
    boolean _isFollowing = it.isFollowing(this.nils);
    boolean _not = (!_isFollowing);
    assertTrue("! isFollowing(nils) failed after nils.unfollow(ole)", _not);
    
    boolean _isFollowedBy = it.isFollowedBy(this.nils);
    assertTrue("! isFollowedBy(nils) failed after nils.unfollow(ole)", (!_isFollowedBy));
    
  }
  
  private void _transition_exprAction__newTweet_transitions0_actions0() {
    try {
      
      this.nils.tweet("Kvitre!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.tweet(\"Kvitre!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__newTweet_transitions0_effects0_state() {
    _test__newTweet_transitions0_effects0_state_objectTests0_test(nils);
    
  }
  
  private void _test__newTweet_transitions0_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after nils.tweet(\"Kvitre!\")", 1, _tweetCount);
    
    Tweet _tweet = it.getTweet(1);
    String _text = _tweet.getText();
    assertEquals("getTweet(1).text == \"Kvitre!\" failed after nils.tweet(\"Kvitre!\")", "Kvitre!", _text);
    
  }
  
  private void _transition_exprAction__newTweet_transitions1_actions0() {
    try {
      
      this.nils.tweet("Kvitre igjen!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.tweet(\"Kvitre igjen!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__newTweet_transitions1_effects0_state() {
    _test__newTweet_transitions1_effects0_state_objectTests0_test(nils);
    
  }
  
  private void _test__newTweet_transitions1_effects0_state_objectTests0_test(final TwitterAccount it) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 2 failed after nils.tweet(\"Kvitre igjen!\")", 2, _tweetCount);
    
    Tweet _tweet = it.getTweet(1);
    String _text = _tweet.getText();
    assertEquals("getTweet(1).text == \"Kvitre igjen!\" failed after nils.tweet(\"Kvitre igjen!\")", "Kvitre igjen!", _text);
    
    Tweet _tweet_1 = it.getTweet(2);
    String _text_1 = _tweet_1.getText();
    assertEquals("getTweet(2).text == \"Kvitre!\" failed after nils.tweet(\"Kvitre igjen!\")", "Kvitre!", _text_1);
    
  }
  
  private void _transition_exprAction__getTweetIllegal_transitions0_actions0() {
    try {
      
      this.nils.getTweet(1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.getTweet(1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__getTweetIllegal_transitions1_actions0() {
    try {
      
      this.nils.getTweet((-1));
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.getTweet(-1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__getTweetIllegal_transitions2_actions0() {
    try {
      
      this.nils.tweet("Kvitre!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.tweet(\"Kvitre!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__getTweetIllegal_transitions2_effects0_state() {
    _test__getTweetIllegal_transitions2_effects0_state_objectTests0_test();
    
  }
  
  private void _test__getTweetIllegal_transitions2_effects0_state_objectTests0_test() {
    try {
      
      /* true */
      } catch (junit.framework.AssertionFailedError error) {
      fail("true failed after nils.tweet(\"Kvitre!\"): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__getTweetIllegal_transitions3_actions0() {
    try {
      
      this.nils.getTweet(2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.getTweet(2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__getTweetIllegal_transitions4_actions0() {
    try {
      
      this.nils.getTweet((-1));
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.getTweet(-1) failed: " + error.getMessage());
    }
    
  }
  
  private TwitterAccount _init__retweet_kari() {
    TwitterAccount _twitterAccount = new TwitterAccount("Kari");
    return _twitterAccount;
  }
  
  private void _transition_exprAction__retweet_transitions0_actions0(final TwitterAccount kari) {
    try {
      
      this.nils.tweet("Kvitre!");
      } catch (junit.framework.AssertionFailedError error) {
      fail("nils.tweet(\"Kvitre!\") failed: " + error.getMessage());
    }
    
  }
  
  private void _test__retweet_transitions0_effects0_state(final TwitterAccount kari) {
    _test__retweet_transitions0_effects0_state_objectTests0_test(nils, kari);
    
  }
  
  private void _test__retweet_transitions0_effects0_state_objectTests0_test(final TwitterAccount it, final TwitterAccount kari) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after nils.tweet(\"Kvitre!\")", 1, _tweetCount);
    
    Tweet _tweet = it.getTweet(1);
    String _text = _tweet.getText();
    assertEquals("getTweet(1).text == \"Kvitre!\" failed after nils.tweet(\"Kvitre!\")", "Kvitre!", _text);
    
  }
  
  private void _transition_exprAction__retweet_transitions1_actions0(final TwitterAccount kari) {
    try {
      
      Tweet _tweet = this.nils.getTweet(1);
      this.ole.retweet(_tweet);
      } catch (junit.framework.AssertionFailedError error) {
      fail("ole.retweet(nils.getTweet(1)) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__retweet_transitions1_effects0_state(final TwitterAccount kari) {
    _test__retweet_transitions1_effects0_state_objectTests0_test(nils, kari);
    _test__retweet_transitions1_effects0_state_objectTests1_test(ole, kari);
    
  }
  
  private void _test__retweet_transitions1_effects0_state_objectTests0_test(final TwitterAccount it, final TwitterAccount kari) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after ole.retweet(nils.getTweet(1))", 1, _tweetCount);
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 1 failed after ole.retweet(nils.getTweet(1))", 1, _retweetCount);
    
  }
  
  private void _test__retweet_transitions1_effects0_state_objectTests1_test(final TwitterAccount it, final TwitterAccount kari) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after ole.retweet(nils.getTweet(1))", 1, _tweetCount);
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 0 failed after ole.retweet(nils.getTweet(1))", 0, _retweetCount);
    
    Tweet _tweet = it.getTweet(1);
    String _text = _tweet.getText();
    assertEquals("getTweet(1).text == \"Kvitre!\" failed after ole.retweet(nils.getTweet(1))", "Kvitre!", _text);
    
    Tweet _tweet_1 = this.nils.getTweet(1);
    Tweet _tweet_2 = it.getTweet(1);
    Tweet _originalTweet = _tweet_2.getOriginalTweet();
    assertEquals("getTweet(1).originalTweet == nils.getTweet(1) failed after ole.retweet(nils.getTweet(1))", _tweet_1, _originalTweet);
    
  }
  
  private void _transition_exprAction__retweet_transitions2_actions0(final TwitterAccount kari) {
    try {
      
      Tweet _tweet = this.ole.getTweet(1);
      kari.retweet(_tweet);
      } catch (junit.framework.AssertionFailedError error) {
      fail("kari.retweet(ole.getTweet(1)) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__retweet_transitions2_effects0_state(final TwitterAccount kari) {
    _test__retweet_transitions2_effects0_state_objectTests0_test(nils, kari);
    _test__retweet_transitions2_effects0_state_objectTests1_test(ole, kari);
    _test__retweet_transitions2_effects0_state_objectTests2_test(kari, kari);
    
  }
  
  private void _test__retweet_transitions2_effects0_state_objectTests0_test(final TwitterAccount it, final TwitterAccount kari) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after kari.retweet(ole.getTweet(1))", 1, _tweetCount);
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 2 failed after kari.retweet(ole.getTweet(1))", 2, _retweetCount);
    
  }
  
  private void _test__retweet_transitions2_effects0_state_objectTests1_test(final TwitterAccount it, final TwitterAccount kari) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after kari.retweet(ole.getTweet(1))", 1, _tweetCount);
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 0 failed after kari.retweet(ole.getTweet(1))", 0, _retweetCount);
    
  }
  
  private void _test__retweet_transitions2_effects0_state_objectTests2_test(final TwitterAccount it, final TwitterAccount kari) {
    
    int _tweetCount = it.getTweetCount();
    assertEquals("tweetCount == 1 failed after kari.retweet(ole.getTweet(1))", 1, _tweetCount);
    
    int _retweetCount = it.getRetweetCount();
    assertEquals("retweetCount == 0 failed after kari.retweet(ole.getTweet(1))", 0, _retweetCount);
    
    Tweet _tweet = it.getTweet(1);
    String _text = _tweet.getText();
    assertNotNull("getTweet(1).text failed after kari.retweet(ole.getTweet(1))", _text);
    try {
      
      /* "Kvitre!" */
      } catch (junit.framework.AssertionFailedError error) {
      fail("\"Kvitre!\" failed after kari.retweet(ole.getTweet(1)): " + error.getMessage());
    }
    
    Tweet _tweet_1 = this.nils.getTweet(1);
    Tweet _tweet_2 = it.getTweet(1);
    Tweet _originalTweet = _tweet_2.getOriginalTweet();
    assertEquals("getTweet(1).originalTweet == nils.getTweet(1) failed after kari.retweet(ole.getTweet(1))", _tweet_1, _originalTweet);
    
  }
}
