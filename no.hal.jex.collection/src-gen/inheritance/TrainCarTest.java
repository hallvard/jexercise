package inheritance;

import inheritance.TrainCar;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.TrainCar")
@SuppressWarnings("all")
public class TrainCarTest extends TestCase {
  private TrainCar tc;
  
  private TrainCar _init_tc() {
    TrainCar _trainCar = new TrainCar(3000);
    return _trainCar;
  }
  
  @Override
  protected void setUp() {
    tc = _init_tc();
    
  }
  
  @JExercise(tests = "TrainCar(int);void setDeadWeight(int)", description = "<h3>D\u00F8d vekt er lik totalvekt</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>tc.deadWeight = 5000</li>\n\t\t</ul>\n")
  public void testCheckWeight() {
    _test__checkWeight_transitions0_source_state(tc);
    _transition_exprAction__checkWeight_transitions0_actions0(tc);
    _test__checkWeight_transitions0_effects0_state(tc);
    
  }
  
  private void _test__checkWeight_transitions0_source_state(final TrainCar it) {
    _test__checkWeight_transitions0_source_state_objectTests0_test(tc);
    
  }
  
  private void _test__checkWeight_transitions0_source_state_objectTests0_test(final TrainCar it) {
    
    int _deadWeight = this.tc.getDeadWeight();
    assertEquals("tc.deadWeight == 3000 failed after tc.deadWeight = 5000", 3000, _deadWeight);
    
  }
  
  private void _transition_exprAction__checkWeight_transitions0_actions0(final TrainCar it) {
    try {
      
      this.tc.setDeadWeight(5000);
      } catch (junit.framework.AssertionFailedError error) {
      fail("tc.deadWeight = 5000 failed: " + error.getMessage());
    }
    
  }
  
  private void _test__checkWeight_transitions0_effects0_state(final TrainCar it) {
    _test__checkWeight_transitions0_effects0_state_objectTests0_test(tc);
    
  }
  
  private void _test__checkWeight_transitions0_effects0_state_objectTests0_test(final TrainCar it) {
    
    int _deadWeight = this.tc.getDeadWeight();
    assertEquals("tc.deadWeight == 5000 failed after tc.deadWeight = 5000", 5000, _deadWeight);
    
  }
}
