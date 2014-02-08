package objectstructures;


import com.google.common.base.Objects;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import objectstructures.Partner;

@JExercise(description = "Tests objectstructures.Partner")
@SuppressWarnings("all")
public class PartnerTest extends TestCase {
  private Partner p1;
  
  private Partner _init_p1() {
    Partner _partner = new Partner("1");
    return _partner;
  }
  
  private Partner p2;
  
  private Partner _init_p2() {
    Partner _partner = new Partner("2");
    return _partner;
  }
  
  @Override
  protected void setUp() {
    p1 = _init_p1();
    p2 = _init_p2();
    
  }
  
  @JExercise(tests = "Partner(String)", description = "<h3>Ingen partnerskap</h3>Tests initialization")
  public void testConstructor() {
    _test__constructor_transitions0_target();
    
  }
  
  @JExercise(tests = "Partner(String);void setPartner(objectstructures.Partner)", description = "<h3>Enkelt partnerskap</h3>Tests the following sequence:<ul><li>p1.setPartner(p2) - Partnerskap inng\u00E5s</li></ul>")
  public void testPartner() {
    _test__partner_transitions0_source();
    _transition__partner_transitions0();_test__partner_transitions0_target();
    
  }
  
  @JExercise(tests = "Partner(String);void setPartner(objectstructures.Partner)", description = "<h3>Partnerskap med etterf\u00F8lgende brudd</h3>Tests the following sequence:<ul><li>p1.setPartner(p2) - Partnerskap inng\u00E5s</li><li>p1.setPartner(null) - Partnerskap brytes</li></ul>")
  public void testDivorce() {
    _transition__divorce_transitions0();_test__divorce_transitions0_target();
    _transition__divorce_transitions1();_test__divorce_transitions1_divorced();
    
  }
  
  @JExercise(tests = "Partner(String);void setPartner(objectstructures.Partner)", description = "<h3>Partnerskap med etterf\u00F8lgende kombinert brudd og nytt partnerskap</h3>Tests the following sequence:<ul><li>p1.setPartner(p2) - Partnerskap inng\u00E5s</li><li>p3.setPartner(p4) - Partnerskap inng\u00E5s</li><li>p1.setPartner(p4) - Kombinert brudd og nytt partnerskap</li></ul>")
  public void testSwinger() {
    Partner p3 = _init__swinger_p3();
    Partner p4 = _init__swinger_p4();
    _transition__swinger_transitions0(p3, p4);_test__swinger_transitions0_target(p3, p4);
    _transition__swinger_transitions1(p3, p4);_test__swinger_transitions1_target(p3, p4);
    _transition__swinger_transitions2(p3, p4);_test__swinger_transitions2_target(p3, p4);
    
  }
  
  private void _test__constructor_transitions0_target() {
    _test__constructor_transitions0_target_objectTests0_propertyTests0(p1);
    _test__constructor_transitions0_target_objectTests1_propertyTests0(p2);
    
  }
  
  private boolean _test__constructor_transitions0_target_objectTests0_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed", _equals);
    return _equals;
  }
  
  private boolean _test__constructor_transitions0_target_objectTests1_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed", _equals);
    return _equals;
  }
  
  private void _test__partner_transitions0_source() {
    _test__partner_transitions0_source_objectTests0_propertyTests0(p1);
    _test__partner_transitions0_source_objectTests1_propertyTests0(p2);
    
  }
  
  private void _transition__partner_transitions0() {
    this.p1.setPartner(this.p2);
  }
  
  private void _test__partner_transitions0_target() {
    _test__partner_transitions0_target_objectTests0_propertyTests0(p1);
    _test__partner_transitions0_target_objectTests1_propertyTests0(p2);
    
  }
  
  private boolean _test__partner_transitions0_source_objectTests0_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__partner_transitions0_source_objectTests1_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__partner_transitions0_target_objectTests0_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p2);
    assertTrue("partner == p2; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__partner_transitions0_target_objectTests1_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p1);
    assertTrue("partner == p1; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private void _transition__divorce_transitions0() {
    this.p1.setPartner(this.p2);
  }
  
  private void _test__divorce_transitions0_target() {
    _test__divorce_transitions0_target_objectTests0_propertyTests0(p1);
    _test__divorce_transitions0_target_objectTests1_propertyTests0(p2);
    
  }
  
  private void _transition__divorce_transitions1() {
    this.p1.setPartner(null);
  }
  
  private void _test__divorce_transitions1_divorced() {
    _test__divorce_transitions1_divorced_objectTests0_propertyTests0(p1);
    _test__divorce_transitions1_divorced_objectTests1_propertyTests0(p2);
    
  }
  
  private boolean _test__divorce_transitions0_target_objectTests0_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p2);
    assertTrue("partner == p2; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__divorce_transitions0_target_objectTests1_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p1);
    assertTrue("partner == p1; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__divorce_transitions1_divorced_objectTests0_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed after p1.setPartner(null)", _equals);
    return _equals;
  }
  
  private boolean _test__divorce_transitions1_divorced_objectTests1_propertyTests0(final Partner it) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed after p1.setPartner(null)", _equals);
    return _equals;
  }
  
  private Partner _init__swinger_p3() {
    Partner _partner = new Partner("3");
    return _partner;
  }
  
  private Partner _init__swinger_p4() {
    Partner _partner = new Partner("4");
    return _partner;
  }
  
  private void _transition__swinger_transitions0(final Partner p3, final Partner p4) {
    this.p1.setPartner(this.p2);
  }
  
  private void _test__swinger_transitions0_target(final Partner p3, final Partner p4) {
    _test__swinger_transitions0_target_objectTests0_propertyTests0(p1, p3, p4);
    _test__swinger_transitions0_target_objectTests1_propertyTests0(p2, p3, p4);
    
  }
  
  private void _transition__swinger_transitions1(final Partner p3, final Partner p4) {
    p3.setPartner(p4);
  }
  
  private void _test__swinger_transitions1_target(final Partner p3, final Partner p4) {
    _test__swinger_transitions1_target_objectTests0_propertyTests0(p3, p3, p4);
    _test__swinger_transitions1_target_objectTests1_propertyTests0(p4, p3, p4);
    
  }
  
  private void _transition__swinger_transitions2(final Partner p3, final Partner p4) {
    this.p1.setPartner(p4);
  }
  
  private void _test__swinger_transitions2_target(final Partner p3, final Partner p4) {
    _test__swinger_transitions2_target_objectTests0_propertyTests0(p1, p3, p4);
    _test__swinger_transitions2_target_objectTests1_propertyTests0(p4, p3, p4);
    _test__swinger_transitions2_target_objectTests2_propertyTests0(p2, p3, p4);
    _test__swinger_transitions2_target_objectTests3_propertyTests0(p3, p3, p4);
    
  }
  
  private boolean _test__swinger_transitions0_target_objectTests0_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p2);
    assertTrue("partner == p2; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions0_target_objectTests1_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p1);
    assertTrue("partner == p1; failed after p1.setPartner(p2)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions1_target_objectTests0_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, p4);
    assertTrue("partner == p4; failed after p3.setPartner(p4)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions1_target_objectTests1_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, p3);
    assertTrue("partner == p3; failed after p3.setPartner(p4)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions2_target_objectTests0_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, p4);
    assertTrue("partner == p4; failed after p1.setPartner(p4)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions2_target_objectTests1_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, this.p1);
    assertTrue("partner == p1; failed after p1.setPartner(p4)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions2_target_objectTests2_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed after p1.setPartner(p4)", _equals);
    return _equals;
  }
  
  private boolean _test__swinger_transitions2_target_objectTests3_propertyTests0(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    boolean _equals = Objects.equal(_partner, null);
    assertTrue("partner == null; failed after p1.setPartner(p4)", _equals);
    return _equals;
  }
}
