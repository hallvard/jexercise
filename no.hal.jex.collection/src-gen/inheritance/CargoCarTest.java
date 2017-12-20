package inheritance;

import inheritance.CargoCar;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.CargoCar")
@SuppressWarnings("all")
public class CargoCarTest extends TestCase {
  private CargoCar cc;
  
  private CargoCar _init_cc() {
    CargoCar _cargoCar = new CargoCar(3000, 2000);
    return _cargoCar;
  }
  
  @Override
  protected void setUp() {
    cc = _init_cc();
    
  }
  
  @JExercise(tests = "CargoCar(int,int);void setCargoWeight(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>cc.cargoWeight = 4000</li>\n\t\t</ul>\n")
  public void testCheckWeight() {
    _test__checkWeight_transitions0_source_state(cc);
    _transition_exprAction__checkWeight_transitions0_actions0(cc);
    _test__checkWeight_transitions0_effects0_state(cc);
    
  }
  
  private void _test__checkWeight_transitions0_source_state(final CargoCar it) {
    _test__checkWeight_transitions0_source_state_objectTests0_test(cc);
    
  }
  
  private void _test__checkWeight_transitions0_source_state_objectTests0_test(final CargoCar it) {
    
    int _totalWeight = this.cc.getTotalWeight();
    assertEquals("cc.totalWeight == 5000 failed after cc.cargoWeight = 4000", 5000, _totalWeight);
    
  }
  
  private void _transition_exprAction__checkWeight_transitions0_actions0(final CargoCar it) {
    try {
      
      this.cc.setCargoWeight(4000);
      } catch (junit.framework.AssertionFailedError error) {
      fail("cc.cargoWeight = 4000 failed: " + error.getMessage());
    }
    
  }
  
  private void _test__checkWeight_transitions0_effects0_state(final CargoCar it) {
    _test__checkWeight_transitions0_effects0_state_objectTests0_test(cc);
    
  }
  
  private void _test__checkWeight_transitions0_effects0_state_objectTests0_test(final CargoCar it) {
    
    int _totalWeight = this.cc.getTotalWeight();
    assertEquals("cc.totalWeight == 7000 failed after cc.cargoWeight = 4000", 7000, _totalWeight);
    
    int _cargoWeight = this.cc.getCargoWeight();
    assertEquals("cc.cargoWeight == 4000 failed after cc.cargoWeight = 4000", 4000, _cargoWeight);
    
  }
}
