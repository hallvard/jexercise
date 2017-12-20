package interfaces;

import interfaces.Person1;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.Person1")
@SuppressWarnings("all")
public class Person1Test extends TestCase {
  private String h;
  
  private String _init_h() {
    return "Hallvard";
  }
  
  private String t;
  
  private String _init_t() {
    return "Tr\u00E6tteberg";
  }
  
  private String j;
  
  private String _init_j() {
    return "Jens";
  }
  
  private Person1 person1;
  
  private Person1 _init_person1() {
    Person1 _person1 = new Person1(this.h, this.t);
    return _person1;
  }
  
  @Override
  protected void setUp() {
    h = _init_h();
    t = _init_t();
    j = _init_j();
    person1 = _init_person1();
    
  }
  
  @JExercise(tests = "Person1(String,String);void setGivenName(String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>person1.givenName = j</li>\n\t\t</ul>\n")
  public void testPerson1() {
    _test__Person1_transitions0_effects0_state();
    _transition_exprAction__Person1_transitions1_actions0();
    _test__Person1_transitions1_effects0_state();
    
  }
  
  private void _test__Person1_transitions0_effects0_state() {
    _test__Person1_transitions0_effects0_state_objectTests0_test(person1);
    
  }
  
  private void _test__Person1_transitions0_effects0_state_objectTests0_test(final Person1 it) {
    
    String _givenName = it.getGivenName();
    assertEquals("givenName == h failed", this.h, _givenName);
    
    String _familyName = it.getFamilyName();
    assertEquals("familyName == t failed", this.t, _familyName);
    
    String _fullName = it.getFullName();
    assertEquals("fullName == h + \" \" + t failed", ((this.h + " ") + this.t), _fullName);
    
  }
  
  private void _transition_exprAction__Person1_transitions1_actions0() {
    try {
      
      this.person1.setGivenName(this.j);
      } catch (junit.framework.AssertionFailedError error) {
      fail("person1.givenName = j failed: " + error.getMessage());
    }
    
  }
  
  private void _test__Person1_transitions1_effects0_state() {
    _test__Person1_transitions1_effects0_state_objectTests0_test(person1);
    
  }
  
  private void _test__Person1_transitions1_effects0_state_objectTests0_test(final Person1 it) {
    
    String _givenName = it.getGivenName();
    assertEquals("givenName == j failed after person1.givenName = j", this.j, _givenName);
    
    String _familyName = it.getFamilyName();
    assertEquals("familyName == t failed after person1.givenName = j", this.t, _familyName);
    
    String _fullName = it.getFullName();
    assertEquals("fullName == j + \" \" + t failed after person1.givenName = j", ((this.j + " ") + this.t), _fullName);
    
  }
}
