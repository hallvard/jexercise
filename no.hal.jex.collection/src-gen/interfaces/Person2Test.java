package interfaces;

import interfaces.Person2;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.Person2")
@SuppressWarnings("all")
public class Person2Test extends TestCase {
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
  
  private Person2 person2;
  
  private Person2 _init_person2() {
    Person2 _person2 = new Person2(((this.h + " ") + this.t));
    return _person2;
  }
  
  @Override
  protected void setUp() {
    h = _init_h();
    t = _init_t();
    j = _init_j();
    person2 = _init_person2();
    
  }
  
  @JExercise(tests = "Person2(String);void setGivenName(String)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>person2.givenName = j</li>\n\t\t</ul>\n")
  public void testPerson2() {
    _test__Person2_transitions0_effects0_state();
    _transition_exprAction__Person2_transitions1_actions0();
    _test__Person2_transitions1_effects0_state();
    
  }
  
  private void _test__Person2_transitions0_effects0_state() {
    _test__Person2_transitions0_effects0_state_objectTests0_test(person2);
    
  }
  
  private void _test__Person2_transitions0_effects0_state_objectTests0_test(final Person2 it) {
    
    String _givenName = it.getGivenName();
    assertEquals("givenName == h failed", this.h, _givenName);
    
    String _familyName = it.getFamilyName();
    assertEquals("familyName == t failed", this.t, _familyName);
    
    String _fullName = it.getFullName();
    assertEquals("fullName == h + \" \" + t failed", ((this.h + " ") + this.t), _fullName);
    
  }
  
  private void _transition_exprAction__Person2_transitions1_actions0() {
    try {
      
      this.person2.setGivenName(this.j);
      } catch (junit.framework.AssertionFailedError error) {
      fail("person2.givenName = j failed: " + error.getMessage());
    }
    
  }
  
  private void _test__Person2_transitions1_effects0_state() {
    _test__Person2_transitions1_effects0_state_objectTests0_test(person2);
    
  }
  
  private void _test__Person2_transitions1_effects0_state_objectTests0_test(final Person2 it) {
    
    String _givenName = it.getGivenName();
    assertEquals("givenName == j failed after person2.givenName = j", this.j, _givenName);
    
    String _familyName = it.getFamilyName();
    assertEquals("familyName == t failed after person2.givenName = j", this.t, _familyName);
    
    String _fullName = it.getFullName();
    assertEquals("fullName == j + \" \" + t failed after person2.givenName = j", ((this.j + " ") + this.t), _fullName);
    
  }
}
