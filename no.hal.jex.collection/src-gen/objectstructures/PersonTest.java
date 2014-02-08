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
    boolean _and = false;
    boolean _and_1 = false;
    Person _father = person.getFather();
    Pair<? extends Object,? extends Object> _key = fatherMotherChildren.getKey();
    Object _key_1 = _key.getKey();
    boolean _equals = Objects.equal(_father, _key_1);
    if (!_equals) {
      _and_1 = false;
    } else {
      Person _mother = person.getMother();
      Pair<? extends Object,? extends Object> _key_2 = fatherMotherChildren.getKey();
      Object _value = _key_2.getValue();
      boolean _equals_1 = Objects.equal(_mother, _value);
      _and_1 = (_equals && _equals_1);
    }
    if (!_and_1) {
      _and = false;
    } else {
      List<? extends Object> _value_1 = fatherMotherChildren.getValue();
      boolean _equals_2 = Objects.equal(person, _value_1);
      _and = (_and_1 && _equals_2);
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
  
  @JExercise(tests = "Person(String,char)", description = "<h3>Personer uten foreldre og barn</h3>Tests initialization")
  public void testConstructor() {
    _test__constructor_transitions0_target();
    
  }
  
  @JExercise(tests = "Person(String,char);void setFather(objectstructures.Person)", description = "<h3>Marit kan ikke v\u00E6re far</h3>Tests the following sequence:<ul><li>jens.father = marit</li><li>anne.father = marit</li></ul>")
  public void testFarskapIllegalArgumentException() {
    try {
      _transition__farskapIllegalArgumentException_transitions0();fail("jens.father = marit should throw java.lang.IllegalArgumentException");
    } catch (Exception e) {
      assertTrue("jens.father = marit should throw java.lang.IllegalArgumentException", e instanceof java.lang.IllegalArgumentException);
    }
    try {
      _transition__farskapIllegalArgumentException_transitions1();fail("anne.father = marit should throw java.lang.IllegalArgumentException");
    } catch (Exception e_1) {
      assertTrue("anne.father = marit should throw java.lang.IllegalArgumentException", e_1 instanceof java.lang.IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Hallvard kan ikke v\u00E6re mor</h3>Tests the following sequence:<ul><li>jens.mother = hallvard</li><li>anne.mother = hallvard</li></ul>")
  public void testMorskapIllegalArgumentException() {
    try {
      _transition__morskapIllegalArgumentException_transitions0();fail("jens.mother = hallvard should throw java.lang.IllegalArgumentException");
    } catch (Exception e) {
      assertTrue("jens.mother = hallvard should throw java.lang.IllegalArgumentException", e instanceof java.lang.IllegalArgumentException);
    }
    try {
      _transition__morskapIllegalArgumentException_transitions1();fail("anne.mother = hallvard should throw java.lang.IllegalArgumentException");
    } catch (Exception e_1) {
      assertTrue("anne.mother = hallvard should throw java.lang.IllegalArgumentException", e_1 instanceof java.lang.IllegalArgumentException);
    }
    
  }
  
  @JExercise(tests = "Person(String,char);void setFather(objectstructures.Person)", description = "<h3>Hallvard er far til Jens og Anne</h3>Tests the following sequence:<ul><li>jens.father = hallvard</li><li>anne.father = hallvard</li></ul>")
  public void testFarskapSetFather() {
    _transition__farskapSetFather_transitions0();_test__farskapSetFather_transitions0_target();
    _transition__farskapSetFather_transitions1();_test__farskapSetFather_transitions1_target();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Hallvard er far til Jens og Anne</h3>Tests the following sequence:<ul><li>hallvard.addChild(jens)</li><li>hallvard.addChild(anne)</li></ul>")
  public void testFarskapAddChild() {
    _transition__farskapAddChild_transitions0();_test__farskapAddChild_transitions0_target();
    _transition__farskapAddChild_transitions1();_test__farskapAddChild_transitions1_target();
    
  }
  
  @JExercise(tests = "Person(String,char);void setMother(objectstructures.Person)", description = "<h3>Marit er mor til Jens og Anne</h3>Tests the following sequence:<ul><li>jens.mother = marit</li><li>anne.mother = marit</li></ul>")
  public void testMorskapSetMother() {
    _transition__morskapSetMother_transitions0();_test__morskapSetMother_transitions0_target();
    _transition__morskapSetMother_transitions1();_test__morskapSetMother_transitions1_target();
    
  }
  
  @JExercise(tests = "Person(String,char);void addChild(objectstructures.Person)", description = "<h3>Marit er mor til Jens og Anne</h3>Tests the following sequence:<ul><li>marit.addChild(jens)</li><li>marit.addChild(anne)</li></ul>")
  public void testMorskapAddChild() {
    _transition__morskapAddChild_transitions0();_test__morskapAddChild_transitions0_target();
    _transition__morskapAddChild_transitions1();_test__morskapAddChild_transitions1_target();
    
  }
  
  private void _test__constructor_transitions0_target() {
    _test__constructor_transitions0_target_objectTests0_propertyTests0(hallvard);
    _test__constructor_transitions0_target_objectTests1_propertyTests0(marit);
    _test__constructor_transitions0_target_objectTests2_propertyTests0(jens);
    _test__constructor_transitions0_target_objectTests3_propertyTests0(anne);
    
  }
  
  private boolean _test__constructor_transitions0_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions0_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions0_target_objectTests2_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions0_target_objectTests3_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[]; failed", _equals);
    return _equals;
  }
  
  private void _transition__farskapIllegalArgumentException_transitions0() {
    this.jens.setFather(this.marit);
  }
  
  private void _transition__farskapIllegalArgumentException_transitions1() {
    this.anne.setFather(this.marit);
  }
  
  private void _transition__morskapIllegalArgumentException_transitions0() {
    this.jens.setMother(this.hallvard);
  }
  
  private void _transition__morskapIllegalArgumentException_transitions1() {
    this.anne.setMother(this.hallvard);
  }
  
  private void _transition__farskapSetFather_transitions0() {
    this.jens.setFather(this.hallvard);
  }
  
  private void _test__farskapSetFather_transitions0_target() {
    _test__farskapSetFather_transitions0_target_objectTests0_propertyTests0(hallvard);
    _test__farskapSetFather_transitions0_target_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition__farskapSetFather_transitions1() {
    this.anne.setFather(this.hallvard);
  }
  
  private void _test__farskapSetFather_transitions1_target() {
    _test__farskapSetFather_transitions1_target_objectTests0_propertyTests0(hallvard);
    _test__farskapSetFather_transitions1_target_objectTests1_propertyTests0(jens);
    _test__farskapSetFather_transitions1_target_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__farskapSetFather_transitions0_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after jens.father = hallvard", _equals);
    return _equals;
  }
  
  private boolean _test__farskapSetFather_transitions0_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after jens.father = hallvard", _equals);
    return _equals;
  }
  
  private boolean _test__farskapSetFather_transitions1_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after anne.father = hallvard", _equals);
    return _equals;
  }
  
  private boolean _test__farskapSetFather_transitions1_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after anne.father = hallvard", _equals);
    return _equals;
  }
  
  private boolean _test__farskapSetFather_transitions1_target_objectTests2_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after anne.father = hallvard", _equals);
    return _equals;
  }
  
  private void _transition__farskapAddChild_transitions0() {
    this.hallvard.addChild(this.jens);
  }
  
  private void _test__farskapAddChild_transitions0_target() {
    _test__farskapAddChild_transitions0_target_objectTests0_propertyTests0(hallvard);
    _test__farskapAddChild_transitions0_target_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition__farskapAddChild_transitions1() {
    this.hallvard.addChild(this.anne);
  }
  
  private void _test__farskapAddChild_transitions1_target() {
    _test__farskapAddChild_transitions1_target_objectTests0_propertyTests0(hallvard);
    _test__farskapAddChild_transitions1_target_objectTests1_propertyTests0(jens);
    _test__farskapAddChild_transitions1_target_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__farskapAddChild_transitions0_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after hallvard.addChild(jens)", _equals);
    return _equals;
  }
  
  private boolean _test__farskapAddChild_transitions0_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after hallvard.addChild(jens)", _equals);
    return _equals;
  }
  
  private boolean _test__farskapAddChild_transitions1_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after hallvard.addChild(anne)", _equals);
    return _equals;
  }
  
  private boolean _test__farskapAddChild_transitions1_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after hallvard.addChild(anne)", _equals);
    return _equals;
  }
  
  private boolean _test__farskapAddChild_transitions1_target_objectTests2_propertyTests0(final Person it) {
    
    Pair<Person,Object> _mappedTo = Pair.<Person, Object>of(this.hallvard, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == hallvard -> null -> #[]; failed after hallvard.addChild(anne)", _equals);
    return _equals;
  }
  
  private void _transition__morskapSetMother_transitions0() {
    this.jens.setMother(this.marit);
  }
  
  private void _test__morskapSetMother_transitions0_target() {
    _test__morskapSetMother_transitions0_target_objectTests0_propertyTests0(marit);
    _test__morskapSetMother_transitions0_target_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition__morskapSetMother_transitions1() {
    this.anne.setMother(this.marit);
  }
  
  private void _test__morskapSetMother_transitions1_target() {
    _test__morskapSetMother_transitions1_target_objectTests0_propertyTests0(marit);
    _test__morskapSetMother_transitions1_target_objectTests1_propertyTests0(jens);
    _test__morskapSetMother_transitions1_target_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__morskapSetMother_transitions0_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after jens.mother = marit", _equals);
    return _equals;
  }
  
  private boolean _test__morskapSetMother_transitions0_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after jens.mother = marit", _equals);
    return _equals;
  }
  
  private boolean _test__morskapSetMother_transitions1_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after anne.mother = marit", _equals);
    return _equals;
  }
  
  private boolean _test__morskapSetMother_transitions1_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after anne.mother = marit", _equals);
    return _equals;
  }
  
  private boolean _test__morskapSetMother_transitions1_target_objectTests2_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after anne.mother = marit", _equals);
    return _equals;
  }
  
  private void _transition__morskapAddChild_transitions0() {
    this.marit.addChild(this.jens);
  }
  
  private void _test__morskapAddChild_transitions0_target() {
    _test__morskapAddChild_transitions0_target_objectTests0_propertyTests0(marit);
    _test__morskapAddChild_transitions0_target_objectTests1_propertyTests0(jens);
    
  }
  
  private void _transition__morskapAddChild_transitions1() {
    this.marit.addChild(this.anne);
  }
  
  private void _test__morskapAddChild_transitions1_target() {
    _test__morskapAddChild_transitions1_target_objectTests0_propertyTests0(marit);
    _test__morskapAddChild_transitions1_target_objectTests1_propertyTests0(jens);
    _test__morskapAddChild_transitions1_target_objectTests2_propertyTests0(anne);
    
  }
  
  private boolean _test__morskapAddChild_transitions0_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens]; failed after marit.addChild(jens)", _equals);
    return _equals;
  }
  
  private boolean _test__morskapAddChild_transitions0_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after marit.addChild(jens)", _equals);
    return _equals;
  }
  
  private boolean _test__morskapAddChild_transitions1_target_objectTests0_propertyTests0(final Person it) {
    
    Pair<Object,Object> _mappedTo = Pair.<Object, Object>of(null, null);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Person>unmodifiableList(Lists.<Person>newArrayList(this.jens, this.anne)));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> null -> #[jens, anne]; failed after marit.addChild(anne)", _equals);
    return _equals;
  }
  
  private boolean _test__morskapAddChild_transitions1_target_objectTests1_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after marit.addChild(anne)", _equals);
    return _equals;
  }
  
  private boolean _test__morskapAddChild_transitions1_target_objectTests2_propertyTests0(final Person it) {
    
    Pair<Object,Person> _mappedTo = Pair.<Object, Person>of(null, this.marit);
    Pair<Pair<? extends Object,? extends Object>,List<? extends Object>> _mappedTo_1 = Pair.<Pair<? extends Object,? extends Object>, List<? extends Object>>of(_mappedTo, Collections.<Object>unmodifiableList(Lists.<Object>newArrayList()));
    boolean _equals = this.operator_equals(it, _mappedTo_1);
    assertTrue("it == null -> marit -> #[]; failed after marit.addChild(anne)", _equals);
    return _equals;
  }
}
