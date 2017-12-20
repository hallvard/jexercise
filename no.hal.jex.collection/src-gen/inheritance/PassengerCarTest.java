package inheritance;

import inheritance.PassengerCar;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.PassengerCar")
@SuppressWarnings("all")
public class PassengerCarTest extends TestCase {
  private PassengerCar pc;
  
  private PassengerCar _init_pc() {
    PassengerCar _passengerCar = new PassengerCar(3000, 200);
    return _passengerCar;
  }
  
  @Override
  protected void setUp() {
    pc = _init_pc();
    
  }
  
  @JExercise(tests = "PassengerCar(int,int);void setPassengerCount(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>pc.passengerCount = 100</li>\n\t\t</ul>\n")
  public void testCheckWeight() {
    _test__checkWeight_transitions0_source_state(pc);
    _transition_exprAction__checkWeight_transitions0_actions0(pc);
    _test__checkWeight_transitions0_effects0_state(pc);
    
  }
  
  private void _test__checkWeight_transitions0_source_state(final PassengerCar it) {
    _test__checkWeight_transitions0_source_state_objectTests0_test(pc);
    
  }
  
  private void _test__checkWeight_transitions0_source_state_objectTests0_test(final PassengerCar it) {
    
    int _totalWeight = this.pc.getTotalWeight();
    assertEquals("pc.totalWeight == 3000 + (200 * 80) failed after pc.passengerCount = 100", (3000 + (200 * 80)), _totalWeight);
    
  }
  
  private void _transition_exprAction__checkWeight_transitions0_actions0(final PassengerCar it) {
    try {
      
      this.pc.setPassengerCount(100);
      } catch (junit.framework.AssertionFailedError error) {
      fail("pc.passengerCount = 100 failed: " + error.getMessage());
    }
    
  }
  
  private void _test__checkWeight_transitions0_effects0_state(final PassengerCar it) {
    _test__checkWeight_transitions0_effects0_state_objectTests0_test(pc);
    
  }
  
  private void _test__checkWeight_transitions0_effects0_state_objectTests0_test(final PassengerCar it) {
    
    int _passengerCount = this.pc.getPassengerCount();
    assertEquals("pc.passengerCount == 100 failed after pc.passengerCount = 100", 100, _passengerCount);
    
    int _totalWeight = this.pc.getTotalWeight();
    assertEquals("pc.totalWeight == 3000 + (100 * 80) failed after pc.passengerCount = 100", (3000 + (100 * 80)), _totalWeight);
    
  }
}
