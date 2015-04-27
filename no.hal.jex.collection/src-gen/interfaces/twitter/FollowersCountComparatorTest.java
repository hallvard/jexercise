package interfaces.twitter;

import interfaces.twitter.FollowersCountComparator;
import interfaces.twitter.TwitterAccount;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.twitter.FollowersCountComparator")
@SuppressWarnings("all")
public class FollowersCountComparatorTest extends TestCase {
  private FollowersCountComparator comparator;
  
  private FollowersCountComparator _init_comparator() {
    FollowersCountComparator _followersCountComparator = new FollowersCountComparator();
    return _followersCountComparator;
  }
  
  private TwitterAccount aaron;
  
  private TwitterAccount _init_aaron() {
    TwitterAccount _twitterAccount = new TwitterAccount("aaron");
    return _twitterAccount;
  }
  
  private TwitterAccount ben;
  
  private TwitterAccount _init_ben() {
    TwitterAccount _twitterAccount = new TwitterAccount("ben");
    return _twitterAccount;
  }
  
  private TwitterAccount charlie;
  
  private TwitterAccount _init_charlie() {
    TwitterAccount _twitterAccount = new TwitterAccount("charlie");
    return _twitterAccount;
  }
  
  @Override
  protected void setUp() {
    comparator = _init_comparator();
    aaron = _init_aaron();
    ben = _init_ben();
    charlie = _init_charlie();
    
  }
  
  @JExercise(tests = "FollowersCountComparator()", description = "<h3>Sammenligner TwitterAccounts p\u00E5 antall f\u00F8lgere.</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Legger til f\u00F8lgere: aaron.follow(ben), ben.follow(aaron)</li>\n\t\t<li>Legger til en ekstra f\u00F8lger: charlie.follow(ben)</li>\n\t\t</ul>\n")
  public void testCompare() {
    _transition_exprAction__compare_transitions0_actions0();
    _transition_exprAction__compare_transitions0_actions1();
    _test__compare_transitions0_effect_state();
    _transition_exprAction__compare_transitions1_actions0();
    _test__compare_transitions1_effect_state();
    
  }
  
  private void _transition_exprAction__compare_transitions0_actions0() {
    try {
      
      this.aaron.follow(this.ben);
      } catch (junit.framework.AssertionFailedError error) {
      fail("aaron.follow(ben) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__compare_transitions0_actions1() {
    try {
      
      this.ben.follow(this.aaron);
      } catch (junit.framework.AssertionFailedError error) {
      fail("ben.follow(aaron) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__compare_transitions0_effect_state() {
    _test__compare_transitions0_effect_state_objectTests0_test();
    
  }
  
  private void _test__compare_transitions0_effect_state_objectTests0_test() {
    
    int _compare = this.comparator.compare(this.aaron, this.ben);
    assertEquals("comparator.compare(aaron, ben) == 0 failed after aaron.follow(ben) ,ben.follow(aaron)", 0, _compare);
    
  }
  
  private void _transition_exprAction__compare_transitions1_actions0() {
    try {
      
      this.charlie.follow(this.ben);
      } catch (junit.framework.AssertionFailedError error) {
      fail("charlie.follow(ben) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__compare_transitions1_effect_state() {
    _test__compare_transitions1_effect_state_objectTests0_test();
    
  }
  
  private void _test__compare_transitions1_effect_state_objectTests0_test() {
    
    int _compare = this.comparator.compare(this.aaron, this.ben);
    boolean _greaterThan = (_compare > 0);
    assertTrue("comparator.compare(aaron, ben) > 0 failed after charlie.follow(ben)", _greaterThan);
    
    int _compare_1 = this.comparator.compare(this.ben, this.aaron);
    assertTrue("comparator.compare(ben, aaron) < 0 failed after charlie.follow(ben)", (_compare_1 < 0));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(FollowersCountComparatorTest.class);
  }
}
