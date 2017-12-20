package interfaces.twitter;

import interfaces.twitter.TwitterAccount;
import interfaces.twitter.UserNameComparator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.twitter.UserNameComparator")
@SuppressWarnings("all")
public class UserNameComparatorTest extends TestCase {
  private UserNameComparator comparator;
  
  private UserNameComparator _init_comparator() {
    UserNameComparator _userNameComparator = new UserNameComparator();
    return _userNameComparator;
  }
  
  private TwitterAccount aaron1;
  
  private TwitterAccount _init_aaron1() {
    TwitterAccount _twitterAccount = new TwitterAccount("aaron");
    return _twitterAccount;
  }
  
  private TwitterAccount aaron2;
  
  private TwitterAccount _init_aaron2() {
    TwitterAccount _twitterAccount = new TwitterAccount("aaron");
    return _twitterAccount;
  }
  
  private TwitterAccount ben;
  
  private TwitterAccount _init_ben() {
    TwitterAccount _twitterAccount = new TwitterAccount("ben");
    return _twitterAccount;
  }
  
  @Override
  protected void setUp() {
    comparator = _init_comparator();
    aaron1 = _init_aaron1();
    aaron2 = _init_aaron2();
    ben = _init_ben();
    
  }
  
  @JExercise(tests = "UserNameComparator()", description = "<h3>Sammenligner TwitterAccounts p\u00E5 username.</h3>Tests \n\t\tinitialization\n")
  public void testCompare() {
    _test__compare_transitions0_effects0_state();
    
  }
  
  private void _test__compare_transitions0_effects0_state() {
    _test__compare_transitions0_effects0_state_objectTests0_test();
    
  }
  
  private void _test__compare_transitions0_effects0_state_objectTests0_test() {
    
    int _compare = this.comparator.compare(this.aaron1, this.ben);
    boolean _lessThan = (_compare < 0);
    assertTrue("comparator.compare(aaron1, ben) < 0 failed", _lessThan);
    
    int _compare_1 = this.comparator.compare(this.ben, this.aaron1);
    boolean _greaterThan = (_compare_1 > 0);
    assertTrue("comparator.compare(ben, aaron1) > 0 failed", _greaterThan);
    
    int _compare_2 = this.comparator.compare(this.aaron1, this.aaron2);
    assertEquals("comparator.compare(aaron1, aaron2) == 0 failed", 0, _compare_2);
    
  }
}
