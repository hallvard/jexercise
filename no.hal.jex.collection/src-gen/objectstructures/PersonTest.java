package objectstructures;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Person;
import org.eclipse.xtext.xbase.lib.Pair;

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
  
  private boolean operator_equals(final Person person, final Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> fatherMotherChildren) {
    Pair<? extends Object,? extends Object> _key = fatherMotherChildren.getKey();
    final Object expectedFather = _key.getKey();
    Pair<? extends Object,? extends Object> _key_1 = fatherMotherChildren.getKey();
    final Object expectedMother = _key_1.getValue();
    boolean _and = false;
    Person _father = person.getFather();
    boolean _equals = Objects.equal(_father, expectedFather);
    if (!_equals) {
      _and = false;
    } else {
      Person _mother = person.getMother();
      boolean _equals_1 = Objects.equal(_mother, expectedMother);
      _and = (_equals && _equals_1);
    }
    boolean _not = (!_and);
    if (_not) {
      return false;
    }
    final List<? extends Object> children = fatherMotherChildren.getValue();
    int _childCount = person.getChildCount();
    int _size = children.size();
    boolean _notEquals = (_childCount != _size);
    if (_notEquals) {
      return false;
    }
    int i = 0;
    for (final Object child : children) {
      {
        Person _child = person.getChild(i);
        boolean _notEquals_1 = (!Objects.equal(child, _child));
        if (_notEquals_1) {
          return false;
        }
        int _plus = (i + 1);
        i = _plus;
      }
    }
    return true;
  }
  
  @JExercise(tests = "Person(String,char)", description = "<h3>Personer uten foreldre og barn</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state();
    
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
    _test__farskapSetFather_transitions0_effect_state();
    _transition_exprAction__farskapSetFather_transitions1_actions0();
    _test__farskapSetFather_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Hallvard er far til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>hallvard.addChild(jens)</li>\n\t\t<li>hallvard.addChild(anne)</li>\n\t\t</ul>\n")
  public void testFarskapAddChild() {
    _transition_exprAction__farskapAddChild_transitions0_actions0();
    _test__farskapAddChild_transitions0_effect_state();
    _transition_exprAction__farskapAddChild_transitions1_actions0();
    _test__farskapAddChild_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Marit er mor til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>jens.mother = marit</li>\n\t\t<li>anne.mother = marit</li>\n\t\t</ul>\n")
  public void testMorskapSetMother() {
    _transition_exprAction__morskapSetMother_transitions0_actions0();
    _test__morskapSetMother_transitions0_effect_state();
    _transition_exprAction__morskapSetMother_transitions1_actions0();
    _test__morskapSetMother_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Marit er mor til Jens og Anne</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>marit.addChild(jens)</li>\n\t\t<li>marit.addChild(anne)</li>\n\t\t</ul>\n")
  public void testMorskapAddChild() {
    _transition_exprAction__morskapAddChild_transitions0_actions0();
    _test__morskapAddChild_transitions0_effect_state();
    _transition_exprAction__morskapAddChild_transitions1_actions0();
    _test__morskapAddChild_transitions1_effect_state();
    
  }
  
  private void _test__constructor_transitions0_effect_state() {
    _test__constructor_transitions0_effect_state_objectTests0_propertyTests0(hallvard);
    _test__constructor_transitions0_effect_state_objectTests1_propertyTests0(marit);
    _test__constructor_transitions0_effect_state_objectTests2_propertyTests0(jens);
    _test__constructor_transitions0_effect_state_objectTests3_propertyTests0(anne);
    
  }
  
  private boolean _test__constructor_transitions0_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
    
  }
  
  private boolean _test__constructor_transitions0_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
    
  }
  
  private boolean _test__constructor_transitions0_effect_state_objectTests2_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
    
  }
  
  private boolean _test__constructor_transitions0_effect_state_objectTests3_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
    
  }
  
  private void _transition_exprAction__farskapIllegalArgumentException_transitions0_actions0() {
    this.jens.setFather(this.marit);
  }
  
  private void _transition_exprAction__farskapIllegalArgumentException_transitions1_actions0() {
    this.anne.setFather(this.marit);
  }
  
  private void _transition_exprAction__morskapIllegalArgumentException_transitions0_actions0() {
    this.jens.setMother(this.hallvard);
  }
  
  private void _transition_exprAction__morskapIllegalArgumentException_transitions1_actions0() {
    this.anne.setMother(this.hallvard);
  }
  
  private void _transition_exprAction__selvfarskapIllegalArgumentException_transitions0_actions0() {
    this.jens.setFather(this.jens);
  }
  
  private void _transition_exprAction__selvmorskapIllegalArgumentException_transitions0_actions0() {
    this.anne.setMother(this.anne);
  }
  
  private void _transition_exprAction__farskapSetFather_transitions0_actions0() {
    this.jens.setFather(this.hallvard);
  }
  
  private void _test__farskapSetFather_transitions0_effect_state() {
    _test__farskapSetFather_transitions0_effect_state_objectTests0_propertyTests0(hallvard);
    _test__farskapSetFather_transitions0_effect_state_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition_exprAction__farskapSetFather_transitions1_actions0() {
    this.anne.setFather(this.hallvard);
  }
  
  private void _test__farskapSetFather_transitions1_effect_state() {
    _test__farskapSetFather_transitions1_effect_state_objectTests0_propertyTests0(hallvard);
    _test__farskapSetFather_transitions1_effect_state_objectTests1_propertyTests0(jens);
    _test__farskapSetFather_transitions1_effect_state_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__farskapSetFather_transitions0_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after jens.father = hallvard", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapSetFather_transitions0_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after jens.father = hallvard", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapSetFather_transitions1_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after anne.father = hallvard", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapSetFather_transitions1_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after anne.father = hallvard", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapSetFather_transitions1_effect_state_objectTests2_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after anne.father = hallvard", _equals);
    return _equals;
    
  }
  
  private void _transition_exprAction__farskapAddChild_transitions0_actions0() {
    this.hallvard.addChild(this.jens);
  }
  
  private void _test__farskapAddChild_transitions0_effect_state() {
    _test__farskapAddChild_transitions0_effect_state_objectTests0_propertyTests0(hallvard);
    _test__farskapAddChild_transitions0_effect_state_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition_exprAction__farskapAddChild_transitions1_actions0() {
    this.hallvard.addChild(this.anne);
  }
  
  private void _test__farskapAddChild_transitions1_effect_state() {
    _test__farskapAddChild_transitions1_effect_state_objectTests0_propertyTests0(hallvard);
    _test__farskapAddChild_transitions1_effect_state_objectTests1_propertyTests0(jens);
    _test__farskapAddChild_transitions1_effect_state_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__farskapAddChild_transitions0_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after hallvard.addChild(jens)", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapAddChild_transitions0_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after hallvard.addChild(jens)", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapAddChild_transitions1_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after hallvard.addChild(anne)", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapAddChild_transitions1_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after hallvard.addChild(anne)", _equals);
    return _equals;
    
  }
  
  private boolean _test__farskapAddChild_transitions1_effect_state_objectTests2_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after hallvard.addChild(anne)", _equals);
    return _equals;
    
  }
  
  private void _transition_exprAction__morskapSetMother_transitions0_actions0() {
    this.jens.setMother(this.marit);
  }
  
  private void _test__morskapSetMother_transitions0_effect_state() {
    _test__morskapSetMother_transitions0_effect_state_objectTests0_propertyTests0(marit);
    _test__morskapSetMother_transitions0_effect_state_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition_exprAction__morskapSetMother_transitions1_actions0() {
    this.anne.setMother(this.marit);
  }
  
  private void _test__morskapSetMother_transitions1_effect_state() {
    _test__morskapSetMother_transitions1_effect_state_objectTests0_propertyTests0(marit);
    _test__morskapSetMother_transitions1_effect_state_objectTests1_propertyTests0(jens);
    _test__morskapSetMother_transitions1_effect_state_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__morskapSetMother_transitions0_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after jens.mother = marit", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapSetMother_transitions0_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after jens.mother = marit", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapSetMother_transitions1_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after anne.mother = marit", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapSetMother_transitions1_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after anne.mother = marit", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapSetMother_transitions1_effect_state_objectTests2_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after anne.mother = marit", _equals);
    return _equals;
    
  }
  
  private void _transition_exprAction__morskapAddChild_transitions0_actions0() {
    this.marit.addChild(this.jens);
  }
  
  private void _test__morskapAddChild_transitions0_effect_state() {
    _test__morskapAddChild_transitions0_effect_state_objectTests0_propertyTests0(marit);
    _test__morskapAddChild_transitions0_effect_state_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition_exprAction__morskapAddChild_transitions1_actions0() {
    this.marit.addChild(this.anne);
  }
  
  private void _test__morskapAddChild_transitions1_effect_state() {
    _test__morskapAddChild_transitions1_effect_state_objectTests0_propertyTests0(marit);
    _test__morskapAddChild_transitions1_effect_state_objectTests1_propertyTests0(jens);
    _test__morskapAddChild_transitions1_effect_state_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__morskapAddChild_transitions0_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after marit.addChild(jens)", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapAddChild_transitions0_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after marit.addChild(jens)", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapAddChild_transitions1_effect_state_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after marit.addChild(anne)", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapAddChild_transitions1_effect_state_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after marit.addChild(anne)", _equals);
    return _equals;
    
  }
  
  private boolean _test__morskapAddChild_transitions1_effect_state_objectTests2_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after marit.addChild(anne)", _equals);
    return _equals;
    
  }
}
