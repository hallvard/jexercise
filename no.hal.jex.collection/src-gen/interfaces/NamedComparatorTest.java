package interfaces;

import interfaces.NamedComparator;
import interfaces.Person1;
import interfaces.Person2;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests interfaces.NamedComparator")
@SuppressWarnings("all")
public class NamedComparatorTest extends TestCase {
  private NamedComparator namedComparator;
  
  @Override
  protected void setUp() {
    namedComparator = new NamedComparator();
    
  }
  
  @JExercise(tests = "NamedComparator();int compare(interfaces.Named,interfaces.Named)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>compare(jt, ht) > 0</li>\n\t\t</ul>\n")
  public void testNamedComparator() {
    Person1 ht = _init__namedComparator_ht();
    Person2 jt = _init__namedComparator_jt();
    _transition_exprAction__namedComparator_transitions0_actions0(namedComparator, ht, jt);
    _test__namedComparator_transitions0_effects0_state(namedComparator, ht, jt);
    
  }
  
  private Person1 _init__namedComparator_ht() {
    Person1 _person1 = new Person1("Hallvard", "Tr\u00E6tteberg");
    return _person1;
  }
  
  private Person2 _init__namedComparator_jt() {
    Person2 _person2 = new Person2("Jens Tr\u00E6tteberg");
    return _person2;
  }
  
  private void _transition_exprAction__namedComparator_transitions0_actions0(final NamedComparator it, final Person1 ht, final Person2 jt) {
    
    int _compare = it.compare(jt, ht);
    boolean _greaterThan = (_compare > 0);
    assertTrue("compare(jt, ht) > 0 failed", Boolean.valueOf(_greaterThan));
    
  }
  
  private void _test__namedComparator_transitions0_effects0_state(final NamedComparator it, final Person1 ht, final Person2 jt) {
    _test__namedComparator_transitions0_effects0_state_objectTests0_test(namedComparator, ht, jt);
    
  }
  
  private void _test__namedComparator_transitions0_effects0_state_objectTests0_test(final NamedComparator it, final Person1 ht, final Person2 jt) {
    
    int _compare = it.compare(ht, ht);
    assertEquals("compare(ht, ht) == 0 failed after compare(jt, ht) > 0", 0, _compare);
    
    int _compare_1 = it.compare(ht, jt);
    boolean _lessThan = (_compare_1 < 0);
    assertTrue("compare(ht, jt) < 0 failed after compare(jt, ht) > 0", _lessThan);
    
    int _compare_2 = it.compare(jt, jt);
    assertEquals("compare(jt, jt) == 0 failed after compare(jt, ht) > 0", 0, _compare_2);
    
  }
}
