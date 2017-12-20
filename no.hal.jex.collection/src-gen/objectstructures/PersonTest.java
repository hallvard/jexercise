package objectstructures;

import java.util.Collection;
import java.util.Collections;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Person;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests objectstructures.Person")
@SuppressWarnings("all")
public class PersonTest extends TestCase {
  private Person hallvard;
  
  private Person _init_hallvard() {
    Person _person = new Person("Hallvard", 'M');
    return _person;
  }
  
  private Person marit;
  
  private Person _init_marit() {
    Person _person = new Person("Marit", 'F');
    return _person;
  }
  
  private Person jens;
  
  private Person _init_jens() {
    Person _person = new Person("Jens", 'M');
    return _person;
  }
  
  private Person anne;
  
  private Person _init_anne() {
    Person _person = new Person("Anne", 'F');
    return _person;
  }
  
  @Override
  protected void setUp() {
    hallvard = _init_hallvard();
    marit = _init_marit();
    jens = _init_jens();
    anne = _init_anne();
    
  }
  
  private void testChildren(final Person person, final Collection<?> children) {
    int _size = children.size();
    int _childCount = person.getChildCount();
    TestCase.assertEquals(_size, _childCount);
    int i = 0;
    for (final Object child : children) {
      {
        Person _child = person.getChild(i);
        TestCase.assertEquals(child, _child);
        i = (i + 1);
      }
    }
  }
  
  @JExercise(tests = "Person(String,char)", description = "<h3>Personer uten foreldre og barn</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void setFather(objectstructures.Person)", description = "<h3>Marit kan ikke v\u00E6re far</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>jens.father = marit</li>\n\t\t<li>anne.father = marit</li>\n\t\t</ul>\n")
  public void testFarskapIllegalArgumentException() {
    try {
      _transition_exprAction__farskapIllegalArgumentException_transitions0_actions0();
      fail("IllegalArgumentException should be thrown after jens.father = marit");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after jens.father = marit", e instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__farskapIllegalArgumentException_transitions1_actions0();
      fail("IllegalArgumentException should be thrown after anne.father = marit");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after anne.father = marit", e_1 instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Hallvard kan ikke v\u00E6re mor</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>jens.mother = hallvard</li>\n\t\t<li>anne.mother = hallvard</li>\n\t\t</ul>\n")
  public void testMorskapIllegalArgumentException() {
    try {
      _transition_exprAction__morskapIllegalArgumentException_transitions0_actions0();
      fail("IllegalArgumentException should be thrown after jens.mother = hallvard");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after jens.mother = hallvard", e instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__morskapIllegalArgumentException_transitions1_actions0();
      fail("IllegalArgumentException should be thrown after anne.mother = hallvard");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after anne.mother = hallvard", e_1 instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Person(String,char);void setFather(objectstructures.Person)", description = "<h3>Jens kan ikke v\u00E6re sin egen far</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>jens.father = jens</li>\n\t\t</ul>\n")
  public void testSelvfarskapIllegalArgumentException() {
    try {
      _transition_exprAction__selvfarskapIllegalArgumentException_transitions0_actions0();
      fail("IllegalArgumentException should be thrown after jens.father = jens");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after jens.father = jens", e instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Anne kan ikke v\u00E6re sin egen mor</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>anne.mother = anne</li>\n\t\t</ul>\n")
  public void testSelvmorskapIllegalArgumentException() {
    try {
      _transition_exprAction__selvmorskapIllegalArgumentException_transitions0_actions0();
      fail("IllegalArgumentException should be thrown after anne.mother = anne");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after anne.mother = anne", e instanceof IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Person(String,char);void setFather(objectstructures.Person)", description = "<h3>Hallvard er far til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>jens.father = hallvard</li>\n\t\t<li>anne.father = hallvard</li>\n\t\t</ul>\n")
  public void testFarskapSetFather() {
    _transition_exprAction__farskapSetFather_transitions0_actions0();
    _test__farskapSetFather_transitions0_effects0_state();
    _transition_exprAction__farskapSetFather_transitions1_actions0();
    _test__farskapSetFather_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Hallvard er far til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>hallvard.addChild(jens)</li>\n\t\t<li>hallvard.addChild(anne)</li>\n\t\t</ul>\n")
  public void testFarskapAddChild() {
    _transition_exprAction__farskapAddChild_transitions0_actions0();
    _test__farskapAddChild_transitions0_effects0_state();
    _transition_exprAction__farskapAddChild_transitions1_actions0();
    _test__farskapAddChild_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Marit er mor til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>jens.mother = marit</li>\n\t\t<li>anne.mother = marit</li>\n\t\t</ul>\n")
  public void testMorskapSetMother() {
    _transition_exprAction__morskapSetMother_transitions0_actions0();
    _test__morskapSetMother_transitions0_effects0_state();
    _transition_exprAction__morskapSetMother_transitions1_actions0();
    _test__morskapSetMother_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Marit er mor til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>marit.addChild(jens)</li>\n\t\t<li>marit.addChild(anne)</li>\n\t\t</ul>\n")
  public void testMorskapAddChild() {
    _transition_exprAction__morskapAddChild_transitions0_actions0();
    _test__morskapAddChild_transitions0_effects0_state();
    _transition_exprAction__morskapAddChild_transitions1_actions0();
    _test__morskapAddChild_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void setFather(objectstructures.Person)", description = "<h3>Jens er ikke far til Anne likevel, Hallvard er</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Angir Jens som Annes far: anne.father = jens</li>\n\t\t<li>Bytter til Hallvard: anne.father = hallvard</li>\n\t\t</ul>\n")
  public void testFarbytteSetFather() {
    _transition_exprAction__farbytteSetFather_transitions0_actions0();
    _test__farbytteSetFather_transitions0_effects0_state();
    _transition_exprAction__farbytteSetFather_transitions1_actions0();
    _test__farbytteSetFather_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Jens er ikke far til Anne likevel, Hallvard er</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Angir Jens som Annes far: jens.addChild(anne)</li>\n\t\t<li>Bytter til Hallvard: hallvard.addChild(anne)</li>\n\t\t</ul>\n")
  public void testFarbytteAddChild() {
    _transition_exprAction__farbytteAddChild_transitions0_actions0();
    _test__farbytteAddChild_transitions0_effects0_state();
    _transition_exprAction__farbytteAddChild_transitions1_actions0();
    _test__farbytteAddChild_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Anne er ikke mor til Jens likevel, Marit er</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Angir Anne som Jens\' mor: jens.mother = anne</li>\n\t\t<li>Bytter til Marit: jens.mother = marit</li>\n\t\t</ul>\n")
  public void testMorbytteSetFather() {
    _transition_exprAction__morbytteSetFather_transitions0_actions0();
    _test__morbytteSetFather_transitions0_effects0_state();
    _transition_exprAction__morbytteSetFather_transitions1_actions0();
    _test__morbytteSetFather_transitions1_effects0_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Anne er ikke mor til Jens likevel, Marit er</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Angir Anne som Jens\' mor: anne.addChild(jens)</li>\n\t\t<li>Bytter til Marit: marit.addChild(jens)</li>\n\t\t</ul>\n")
  public void testMorbytteAddChild() {
    _transition_exprAction__morbytteAddChild_transitions0_actions0();
    _test__morbytteAddChild_transitions0_effects0_state();
    _transition_exprAction__morbytteAddChild_transitions1_actions0();
    _test__morbytteAddChild_transitions1_effects0_state();
    
  }
  
  private void _test__constructor_transitions0_effects0_state() {
    _test__constructor_transitions0_effects0_state_objectTests0_test(hallvard);
    _test__constructor_transitions0_effects0_state_objectTests1_test(marit);
    _test__constructor_transitions0_effects0_state_objectTests2_test(jens);
    _test__constructor_transitions0_effects0_state_objectTests3_test(anne);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests2_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests3_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farskapIllegalArgumentException_transitions0_actions0() {
    try {
      
      this.jens.setFather(this.marit);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.father = marit failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farskapIllegalArgumentException_transitions1_actions0() {
    try {
      
      this.anne.setFather(this.marit);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.father = marit failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morskapIllegalArgumentException_transitions0_actions0() {
    try {
      
      this.jens.setMother(this.hallvard);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.mother = hallvard failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morskapIllegalArgumentException_transitions1_actions0() {
    try {
      
      this.anne.setMother(this.hallvard);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.mother = hallvard failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__selvfarskapIllegalArgumentException_transitions0_actions0() {
    try {
      
      this.jens.setFather(this.jens);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.father = jens failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__selvmorskapIllegalArgumentException_transitions0_actions0() {
    try {
      
      this.anne.setMother(this.anne);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.mother = anne failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farskapSetFather_transitions0_actions0() {
    try {
      
      this.jens.setFather(this.hallvard);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.father = hallvard failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapSetFather_transitions0_effects0_state() {
    _test__farskapSetFather_transitions0_effects0_state_objectTests0_test(hallvard);
    _test__farskapSetFather_transitions0_effects0_state_objectTests1_test(jens);
    
  }
  
  private void _test__farskapSetFather_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after jens.father = hallvard", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after jens.father = hallvard", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after jens.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapSetFather_transitions0_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after jens.father = hallvard", this.hallvard, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after jens.father = hallvard", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after jens.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farskapSetFather_transitions1_actions0() {
    try {
      
      this.anne.setFather(this.hallvard);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.father = hallvard failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapSetFather_transitions1_effects0_state() {
    _test__farskapSetFather_transitions1_effects0_state_objectTests0_test(hallvard);
    _test__farskapSetFather_transitions1_effects0_state_objectTests1_test(jens);
    _test__farskapSetFather_transitions1_effects0_state_objectTests2_test(anne);
    
  }
  
  private void _test__farskapSetFather_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after anne.father = hallvard", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after anne.father = hallvard", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens, this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens, anne]) failed after anne.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapSetFather_transitions1_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after anne.father = hallvard", this.hallvard, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after anne.father = hallvard", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after anne.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapSetFather_transitions1_effects0_state_objectTests2_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after anne.father = hallvard", this.hallvard, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after anne.father = hallvard", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after anne.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farskapAddChild_transitions0_actions0() {
    try {
      
      this.hallvard.addChild(this.jens);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hallvard.addChild(jens) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapAddChild_transitions0_effects0_state() {
    _test__farskapAddChild_transitions0_effects0_state_objectTests0_test(hallvard);
    _test__farskapAddChild_transitions0_effects0_state_objectTests1_test(jens);
    
  }
  
  private void _test__farskapAddChild_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after hallvard.addChild(jens)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after hallvard.addChild(jens)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after hallvard.addChild(jens): " + error.getMessage());
    }
    
  }
  
  private void _test__farskapAddChild_transitions0_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after hallvard.addChild(jens)", this.hallvard, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after hallvard.addChild(jens)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after hallvard.addChild(jens): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farskapAddChild_transitions1_actions0() {
    try {
      
      this.hallvard.addChild(this.anne);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hallvard.addChild(anne) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farskapAddChild_transitions1_effects0_state() {
    _test__farskapAddChild_transitions1_effects0_state_objectTests0_test(hallvard);
    _test__farskapAddChild_transitions1_effects0_state_objectTests1_test(jens);
    _test__farskapAddChild_transitions1_effects0_state_objectTests2_test(anne);
    
  }
  
  private void _test__farskapAddChild_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after hallvard.addChild(anne)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after hallvard.addChild(anne)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens, this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens, anne]) failed after hallvard.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _test__farskapAddChild_transitions1_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after hallvard.addChild(anne)", this.hallvard, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after hallvard.addChild(anne)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after hallvard.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _test__farskapAddChild_transitions1_effects0_state_objectTests2_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after hallvard.addChild(anne)", this.hallvard, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after hallvard.addChild(anne)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after hallvard.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morskapSetMother_transitions0_actions0() {
    try {
      
      this.jens.setMother(this.marit);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.mother = marit failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapSetMother_transitions0_effects0_state() {
    _test__morskapSetMother_transitions0_effects0_state_objectTests0_test(marit);
    _test__morskapSetMother_transitions0_effects0_state_objectTests1_test(jens);
    
  }
  
  private void _test__morskapSetMother_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after jens.mother = marit", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after jens.mother = marit", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after jens.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapSetMother_transitions0_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after jens.mother = marit", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after jens.mother = marit", this.marit, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after jens.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morskapSetMother_transitions1_actions0() {
    try {
      
      this.anne.setMother(this.marit);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.mother = marit failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapSetMother_transitions1_effects0_state() {
    _test__morskapSetMother_transitions1_effects0_state_objectTests0_test(marit);
    _test__morskapSetMother_transitions1_effects0_state_objectTests1_test(jens);
    _test__morskapSetMother_transitions1_effects0_state_objectTests2_test(anne);
    
  }
  
  private void _test__morskapSetMother_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after anne.mother = marit", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after anne.mother = marit", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens, this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens, anne]) failed after anne.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapSetMother_transitions1_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after anne.mother = marit", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after anne.mother = marit", this.marit, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after anne.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapSetMother_transitions1_effects0_state_objectTests2_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after anne.mother = marit", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after anne.mother = marit", this.marit, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after anne.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morskapAddChild_transitions0_actions0() {
    try {
      
      this.marit.addChild(this.jens);
      } catch (junit.framework.AssertionFailedError error) {
      fail("marit.addChild(jens) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapAddChild_transitions0_effects0_state() {
    _test__morskapAddChild_transitions0_effects0_state_objectTests0_test(marit);
    _test__morskapAddChild_transitions0_effects0_state_objectTests1_test(jens);
    
  }
  
  private void _test__morskapAddChild_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after marit.addChild(jens)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after marit.addChild(jens)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after marit.addChild(jens): " + error.getMessage());
    }
    
  }
  
  private void _test__morskapAddChild_transitions0_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after marit.addChild(jens)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after marit.addChild(jens)", this.marit, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after marit.addChild(jens): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morskapAddChild_transitions1_actions0() {
    try {
      
      this.marit.addChild(this.anne);
      } catch (junit.framework.AssertionFailedError error) {
      fail("marit.addChild(anne) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morskapAddChild_transitions1_effects0_state() {
    _test__morskapAddChild_transitions1_effects0_state_objectTests0_test(marit);
    _test__morskapAddChild_transitions1_effects0_state_objectTests1_test(jens);
    _test__morskapAddChild_transitions1_effects0_state_objectTests2_test(anne);
    
  }
  
  private void _test__morskapAddChild_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after marit.addChild(anne)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == null failed after marit.addChild(anne)", null, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens, this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens, anne]) failed after marit.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _test__morskapAddChild_transitions1_effects0_state_objectTests1_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after marit.addChild(anne)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after marit.addChild(anne)", this.marit, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after marit.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _test__morskapAddChild_transitions1_effects0_state_objectTests2_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == null failed after marit.addChild(anne)", null, _father);
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after marit.addChild(anne)", this.marit, _mother);
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after marit.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farbytteSetFather_transitions0_actions0() {
    try {
      
      this.anne.setFather(this.jens);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.father = jens failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farbytteSetFather_transitions0_effects0_state() {
    _test__farbytteSetFather_transitions0_effects0_state_objectTests0_test(anne);
    _test__farbytteSetFather_transitions0_effects0_state_objectTests1_test(jens);
    
  }
  
  private void _test__farbytteSetFather_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == jens failed after anne.father = jens", this.jens, _father);
    
  }
  
  private void _test__farbytteSetFather_transitions0_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[anne]) failed after anne.father = jens: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farbytteSetFather_transitions1_actions0() {
    try {
      
      this.anne.setFather(this.hallvard);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.father = hallvard failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farbytteSetFather_transitions1_effects0_state() {
    _test__farbytteSetFather_transitions1_effects0_state_objectTests0_test(anne);
    _test__farbytteSetFather_transitions1_effects0_state_objectTests1_test(jens);
    _test__farbytteSetFather_transitions1_effects0_state_objectTests2_test(hallvard);
    
  }
  
  private void _test__farbytteSetFather_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after anne.father = hallvard", this.hallvard, _father);
    
  }
  
  private void _test__farbytteSetFather_transitions1_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after anne.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _test__farbytteSetFather_transitions1_effects0_state_objectTests2_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[anne]) failed after anne.father = hallvard: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farbytteAddChild_transitions0_actions0() {
    try {
      
      this.jens.addChild(this.anne);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.addChild(anne) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farbytteAddChild_transitions0_effects0_state() {
    _test__farbytteAddChild_transitions0_effects0_state_objectTests0_test(anne);
    _test__farbytteAddChild_transitions0_effects0_state_objectTests1_test(jens);
    
  }
  
  private void _test__farbytteAddChild_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == jens failed after jens.addChild(anne)", this.jens, _father);
    
  }
  
  private void _test__farbytteAddChild_transitions0_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[anne]) failed after jens.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__farbytteAddChild_transitions1_actions0() {
    try {
      
      this.hallvard.addChild(this.anne);
      } catch (junit.framework.AssertionFailedError error) {
      fail("hallvard.addChild(anne) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__farbytteAddChild_transitions1_effects0_state() {
    _test__farbytteAddChild_transitions1_effects0_state_objectTests0_test(anne);
    _test__farbytteAddChild_transitions1_effects0_state_objectTests1_test(jens);
    _test__farbytteAddChild_transitions1_effects0_state_objectTests2_test(hallvard);
    
  }
  
  private void _test__farbytteAddChild_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _father = it.getFather();
    assertEquals("father == hallvard failed after hallvard.addChild(anne)", this.hallvard, _father);
    
  }
  
  private void _test__farbytteAddChild_transitions1_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after hallvard.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _test__farbytteAddChild_transitions1_effects0_state_objectTests2_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.anne)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[anne]) failed after hallvard.addChild(anne): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morbytteSetFather_transitions0_actions0() {
    try {
      
      this.jens.setMother(this.anne);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.mother = anne failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morbytteSetFather_transitions0_effects0_state() {
    _test__morbytteSetFather_transitions0_effects0_state_objectTests0_test(jens);
    _test__morbytteSetFather_transitions0_effects0_state_objectTests1_test(anne);
    
  }
  
  private void _test__morbytteSetFather_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _mother = it.getMother();
    assertEquals("mother == anne failed after jens.mother = anne", this.anne, _mother);
    
  }
  
  private void _test__morbytteSetFather_transitions0_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after jens.mother = anne: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morbytteSetFather_transitions1_actions0() {
    try {
      
      this.jens.setMother(this.marit);
      } catch (junit.framework.AssertionFailedError error) {
      fail("jens.mother = marit failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morbytteSetFather_transitions1_effects0_state() {
    _test__morbytteSetFather_transitions1_effects0_state_objectTests0_test(jens);
    _test__morbytteSetFather_transitions1_effects0_state_objectTests1_test(anne);
    _test__morbytteSetFather_transitions1_effects0_state_objectTests2_test(marit);
    
  }
  
  private void _test__morbytteSetFather_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after jens.mother = marit", this.marit, _mother);
    
  }
  
  private void _test__morbytteSetFather_transitions1_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after jens.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _test__morbytteSetFather_transitions1_effects0_state_objectTests2_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after jens.mother = marit: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morbytteAddChild_transitions0_actions0() {
    try {
      
      this.anne.addChild(this.jens);
      } catch (junit.framework.AssertionFailedError error) {
      fail("anne.addChild(jens) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morbytteAddChild_transitions0_effects0_state() {
    _test__morbytteAddChild_transitions0_effects0_state_objectTests0_test(jens);
    _test__morbytteAddChild_transitions0_effects0_state_objectTests1_test(anne);
    
  }
  
  private void _test__morbytteAddChild_transitions0_effects0_state_objectTests0_test(final Person it) {
    
    Person _mother = it.getMother();
    assertEquals("mother == anne failed after anne.addChild(jens)", this.anne, _mother);
    
  }
  
  private void _test__morbytteAddChild_transitions0_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after anne.addChild(jens): " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__morbytteAddChild_transitions1_actions0() {
    try {
      
      this.marit.addChild(this.jens);
      } catch (junit.framework.AssertionFailedError error) {
      fail("marit.addChild(jens) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__morbytteAddChild_transitions1_effects0_state() {
    _test__morbytteAddChild_transitions1_effects0_state_objectTests0_test(jens);
    _test__morbytteAddChild_transitions1_effects0_state_objectTests1_test(anne);
    _test__morbytteAddChild_transitions1_effects0_state_objectTests2_test(marit);
    
  }
  
  private void _test__morbytteAddChild_transitions1_effects0_state_objectTests0_test(final Person it) {
    
    Person _mother = it.getMother();
    assertEquals("mother == marit failed after marit.addChild(jens)", this.marit, _mother);
    
  }
  
  private void _test__morbytteAddChild_transitions1_effects0_state_objectTests1_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList()));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[]) failed after marit.addChild(jens): " + error.getMessage());
    }
    
  }
  
  private void _test__morbytteAddChild_transitions1_effects0_state_objectTests2_test(final Person it) {
    try {
      
      this.testChildren(it, Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(this.jens)));
      } catch (junit.framework.AssertionFailedError error) {
      fail("testChildren(#[jens]) failed after marit.addChild(jens): " + error.getMessage());
    }
    
  }
}
