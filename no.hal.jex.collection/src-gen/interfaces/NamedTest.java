package interfaces;

import interfaces.Named;
import interfaces.NamedComparator;
import interfaces.Person1;
import interfaces.Person2;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.Named")
@SuppressWarnings("all")
public class NamedTest extends TestCase {
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
  
  @Override
  protected void setUp() {
    h = _init_h();
    t = _init_t();
    j = _init_j();
    
  }
  
  private void ht(final Named it) {
    _test__ht_test(it);
    
  }
  
  private void _test__ht_test(final Named it) {
    
    String _givenName = it.getGivenName();
    assertEquals("givenName == h failed", this.h, _givenName);
    
    String _familyName = it.getFamilyName();
    assertEquals("familyName == t failed", this.t, _familyName);
    try {
      
      String _plus = (this.h + " ");
      String _plus_1 = (_plus + this.t);
      it.setFullName(_plus_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("fullName = h + \" \" + t failed: " + error.getMessage());
    }
    
  }
  
  private void jt(final Named it) {
    _test__jt_test(it);
    
  }
  
  private void _test__jt_test(final Named it) {
    
    String _givenName = it.getGivenName();
    assertEquals("givenName == j failed", this.j, _givenName);
    
    String _familyName = it.getFamilyName();
    assertEquals("familyName == t failed", this.t, _familyName);
    try {
      
      String _plus = (this.j + " ");
      String _plus_1 = (_plus + this.t);
      it.setFullName(_plus_1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("fullName = j + \" \" + t failed: " + error.getMessage());
    }
    
  }
  
  @JExercise(description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>person1.givenName = j</li>\n\t\t</ul>\n")
  public void testPerson1() {
    Person1 person1 = _init__person1_person1();
    _test__person1_transitions0_effect_state(person1);
    _transition_exprAction__person1_transitions1_actions0(person1);
    _test__person1_transitions1_effect_state(person1);
    
  }
  
  @JExercise(description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>person2.givenName = j</li>\n\t\t</ul>\n")
  public void testPerson2() {
    Person2 person2 = _init__person2_person2();
    _test__person2_transitions0_effect_state(person2);
    _transition_exprAction__person2_transitions1_actions0(person2);
    _test__person2_transitions1_effect_state(person2);
    
  }
  
  @JExercise(description = "Tests \n\t\tinitialization\n")
  public void testNamedComparator() {
    NamedComparator namedComparator = _init__namedComparator_namedComparator();
    Person1 ht = _init__namedComparator_ht();
    Person2 jt = _init__namedComparator_jt();
    _test__namedComparator_transitions0_effect_state(namedComparator, ht, jt);
    
  }
  
  private Person1 _init__person1_person1() {
    Person1 _person1 = new Person1(this.h, this.t);
    return _person1;
  }
  
  private void _test__person1_transitions0_effect_state(final Person1 person1) {
    _test__person1_transitions0_effect_state_objectTests0_test(person1, person1);
    
  }
  
  private void _test__person1_transitions0_effect_state_objectTests0_test(final Person1 it, final Person1 person1) {
    try {
      
      this.ht(it);
      } catch (junit.framework.AssertionFailedError error) {
      fail("ht failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__person1_transitions1_actions0(final Person1 person1) {
    try {
      
      person1.setGivenName(this.j);
      } catch (junit.framework.AssertionFailedError error) {
      fail("person1.givenName = j failed: " + error.getMessage());
    }
    
  }
  
  private void _test__person1_transitions1_effect_state(final Person1 person1) {
    _test__person1_transitions1_effect_state_objectTests0_test(person1, person1);
    
  }
  
  private void _test__person1_transitions1_effect_state_objectTests0_test(final Person1 it, final Person1 person1) {
    try {
      
      this.jt(it);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jt failed after person1.givenName = j: " + error.getMessage());
    }
    
  }
  
  private Person2 _init__person2_person2() {
    String _plus = (this.h + " ");
    String _plus_1 = (_plus + this.t);
    Person2 _person2 = new Person2(_plus_1);
    return _person2;
  }
  
  private void _test__person2_transitions0_effect_state(final Person2 person2) {
    _test__person2_transitions0_effect_state_objectTests0_test(person2, person2);
    
  }
  
  private void _test__person2_transitions0_effect_state_objectTests0_test(final Person2 it, final Person2 person2) {
    try {
      
      this.ht(it);
      } catch (junit.framework.AssertionFailedError error) {
      fail("ht failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__person2_transitions1_actions0(final Person2 person2) {
    try {
      
      person2.setGivenName(this.j);
      } catch (junit.framework.AssertionFailedError error) {
      fail("person2.givenName = j failed: " + error.getMessage());
    }
    
  }
  
  private void _test__person2_transitions1_effect_state(final Person2 person2) {
    _test__person2_transitions1_effect_state_objectTests0_test(person2, person2);
    
  }
  
  private void _test__person2_transitions1_effect_state_objectTests0_test(final Person2 it, final Person2 person2) {
    try {
      
      this.jt(it);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jt failed after person2.givenName = j: " + error.getMessage());
    }
    
  }
  
  private NamedComparator _init__namedComparator_namedComparator() {
    return new NamedComparator();
    
  }
  
  private Person1 _init__namedComparator_ht() {
    Person1 _person1 = new Person1(this.h, this.t);
    return _person1;
  }
  
  private Person2 _init__namedComparator_jt() {
    String _plus = (this.j + " ");
    String _plus_1 = (_plus + this.t);
    Person2 _person2 = new Person2(_plus_1);
    return _person2;
  }
  
  private void _test__namedComparator_transitions0_effect_state(final NamedComparator namedComparator, final Person1 ht, final Person2 jt) {
    _test__namedComparator_transitions0_effect_state_objectTests0_test(namedComparator, namedComparator, ht, jt);
    
  }
  
  private void _test__namedComparator_transitions0_effect_state_objectTests0_test(final NamedComparator it, final NamedComparator namedComparator, final Person1 ht, final Person2 jt) {
    
    int _compare = it.compare(ht, ht);
    assertEquals("compare(ht, ht) == 0 failed", 0, _compare);
    
    int _compare_1 = it.compare(jt, ht);
    boolean _greaterThan = (_compare_1 > 0);
    assertTrue("compare(jt, ht) > 0 failed", _greaterThan);
    
    int _compare_2 = it.compare(ht, jt);
    boolean _lessThan = (_compare_2 < 0);
    assertTrue("compare(ht, jt) < 0 failed", _lessThan);
    
    int _compare_3 = it.compare(jt, jt);
    assertEquals("compare(jt, jt) == 0 failed", 0, _compare_3);
    
  }
}
