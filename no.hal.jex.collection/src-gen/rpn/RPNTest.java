package rpn;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import rpn.RPN;

@JExercise(description = "Tests rpn.RPN")
@SuppressWarnings("all")
public class RPNTest extends TestCase {
  private RPN rPN;
  
  @Override
  protected void setUp() {
    rPN = new RPN();
    
  }
  
  private void performOperation(final String s) {
    char _charAt = s.charAt(0);
    this.rPN.performOperation(_charAt);
  }
  
  private boolean operator_equals(final RPN rpn, final Collection<Double> ds) {
    boolean _xblockexpression = false;
    {
      int count = 0;
      for (final Double d : ds) {
        {
          int _size = ds.size();
          int _minus = (_size - count);
          int _minus_1 = (_minus - 1);
          double _peek = rpn.peek(_minus_1);
          boolean _equals = this.operator_equals(_peek, (d).doubleValue());
          boolean _not = (!_equals);
          if (_not) {
            return false;
          }
          int _plus = (count + 1);
          count = _plus;
        }
      }
      _xblockexpression = (true);
    }
    return _xblockexpression;
  }
  
  private boolean operator_equals(final double d1, final double d2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      boolean _and = false;
      double _minus = (d2 - epsilon);
      boolean _greaterEqualsThan = (d1 >= _minus);
      if (!_greaterEqualsThan) {
        _and = false;
      } else {
        double _plus = (d2 + epsilon);
        boolean _lessEqualsThan = (d1 <= _plus);
        _and = (_greaterEqualsThan && _lessEqualsThan);
      }
      _xblockexpression = (_and);
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "RPN()", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state(rPN);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger ett element p\u00E5 stacken og sjekker st\u00F8rrelsen</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(1.0)</li>\n\t\t</ul>\n")
  public void testPush() {
    _transition_exprAction__push_transitions0_actions0(rPN);
    _test__push_transitions0_effect_state(rPN);
    
  }
  
  @JExercise(tests = "RPN();void push(double);double pop()", description = "<h3>Legger et tilfeldig tall p\u00E5 stacken, tar det av og sjekker verdien</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random)</li>\n\t\t<li>pop == random</li>\n\t\t</ul>\n")
  public void testPushPop() {
    double random = _init__pushPop_random();
    _transition_exprAction__pushPop_transitions0_actions0(rPN, random);
    _test__pushPop_transitions0_effect_state(rPN, random);
    _transition_exprAction__pushPop_transitions1_actions0(rPN, random);
    _test__pushPop_transitions1_effect_state(rPN, random);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken, og sjekker dem med peek()</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1)</li>\n\t\t<li>push(random2)</li>\n\t\t</ul>\n")
  public void testPushPeek() {
    double random1 = _init__pushPeek_random1();
    double random2 = _init__pushPeek_random2();
    _transition_exprAction__pushPeek_transitions0_actions0(rPN, random1, random2);
    _test__pushPeek_transitions0_effect_state(rPN, random1, random2);
    _transition_exprAction__pushPeek_transitions1_actions0(rPN, random1, random2);
    _test__pushPeek_transitions1_effect_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer + (pluss)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'+\')</li>\n\t\t</ul>\n")
  public void testPerformAdd() {
    double random1 = _init__performAdd_random1();
    double random2 = _init__performAdd_random2();
    _transition_exprAction__performAdd_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performAdd_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performAdd_transitions0_actions2(rPN, random1, random2);
    _test__performAdd_transitions0_effect_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer - (minus)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'-\')</li>\n\t\t</ul>\n")
  public void testPerformSubtract() {
    double random1 = _init__performSubtract_random1();
    double random2 = _init__performSubtract_random2();
    _transition_exprAction__performSubtract_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performSubtract_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performSubtract_transitions0_actions2(rPN, random1, random2);
    _test__performSubtract_transitions0_effect_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer * (multiplikasjon)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'*\')</li>\n\t\t</ul>\n")
  public void testPerformMultiply() {
    double random1 = _init__performMultiply_random1();
    double random2 = _init__performMultiply_random2();
    _transition_exprAction__performMultiply_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performMultiply_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performMultiply_transitions0_actions2(rPN, random1, random2);
    _test__performMultiply_transitions0_effect_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer / (divisjon)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'/\')</li>\n\t\t</ul>\n")
  public void testPerformDivide() {
    double random1 = _init__performDivide_random1();
    double random2 = _init__performDivide_random2();
    _transition_exprAction__performDivide_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performDivide_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performDivide_transitions0_actions2(rPN, random1, random2);
    _test__performDivide_transitions0_effect_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer ~ (swap)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'~\')</li>\n\t\t</ul>\n")
  public void testPerformSwap() {
    double random1 = _init__performSwap_random1();
    double random2 = _init__performSwap_random2();
    _transition_exprAction__performSwap_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performSwap_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performSwap_transitions0_actions2(rPN, random1, random2);
    _test__performSwap_transitions0_effect_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN()", description = "<h3>Utf\u00F8rer p (pi)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>performOperation(\'p\')</li>\n\t\t</ul>\n")
  public void testPerformPi() {
    _transition_exprAction__performPi_transitions0_actions0(rPN);
    _test__performPi_transitions0_effect_state(rPN);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Utf\u00F8rer | (absoluttverdi)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random), performOperation(\'|\')</li>\n\t\t</ul>\n")
  public void testPerformAbs() {
    double random = _init__performAbs_random();
    _transition_exprAction__performAbs_transitions0_actions0(rPN, random);
    _transition_exprAction__performAbs_transitions0_actions1(rPN, random);
    _test__performAbs_transitions0_effect_state(rPN, random);
    
  }
  
  private void _test__constructor_transitions0_effect_state(final RPN it) {
    _test__constructor_transitions0_effect_state_propertyTests0(rPN);
    
  }
  
  private boolean _test__constructor_transitions0_effect_state_propertyTests0(final RPN it) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 0);
    assertTrue("size == 0; failed after ", _equals);
    return _equals;
  }
  
  private void _transition_exprAction__push_transitions0_actions0(final RPN it) {
    it.push(1.0);
  }
  
  private void _test__push_transitions0_effect_state(final RPN it) {
    _test__push_transitions0_effect_state_propertyTests0(rPN);
    
  }
  
  private boolean _test__push_transitions0_effect_state_propertyTests0(final RPN it) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(1.0)", _equals);
    return _equals;
  }
  
  private double _init__pushPop_random() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__pushPop_transitions0_actions0(final RPN it, final double random) {
    it.push(random);
  }
  
  private void _test__pushPop_transitions0_effect_state(final RPN it, final double random) {
    _test__pushPop_transitions0_effect_state_propertyTests0(rPN, random);
    
  }
  
  private boolean _transition_exprAction__pushPop_transitions1_actions0(final RPN it, final double random) {
    double _pop = it.pop();
    boolean _equals = this.operator_equals(_pop, random);
    return _equals;
  }
  
  private void _test__pushPop_transitions1_effect_state(final RPN it, final double random) {
    _test__pushPop_transitions1_effect_state_propertyTests0(rPN, random);
    
  }
  
  private boolean _test__pushPop_transitions0_effect_state_propertyTests0(final RPN it, final double random) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random)", _equals);
    return _equals;
  }
  
  private boolean _test__pushPop_transitions1_effect_state_propertyTests0(final RPN it, final double random) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 0);
    assertTrue("size == 0; failed after pop == random", _equals);
    return _equals;
  }
  
  private double _init__pushPeek_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__pushPeek_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__pushPeek_transitions0_actions0(final RPN it, final double random1, final double random2) {
    it.push(random1);
  }
  
  private void _test__pushPeek_transitions0_effect_state(final RPN it, final double random1, final double random2) {
    _test__pushPeek_transitions0_effect_state_propertyTests0(rPN, random1, random2);
    _test__pushPeek_transitions0_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private void _transition_exprAction__pushPeek_transitions1_actions0(final RPN it, final double random1, final double random2) {
    it.push(random2);
  }
  
  private void _test__pushPeek_transitions1_effect_state(final RPN it, final double random1, final double random2) {
    _test__pushPeek_transitions1_effect_state_propertyTests0(rPN, random1, random2);
    _test__pushPeek_transitions1_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private boolean _test__pushPeek_transitions0_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random1)", _equals);
    return _equals;
  }
  
  private boolean _test__pushPeek_transitions0_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(random1))));
    assertTrue("it == #[random1]; failed after push(random1)", _equals);
    return _equals;
  }
  
  private boolean _test__pushPeek_transitions1_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 2);
    assertTrue("size == 2; failed after push(random2)", _equals);
    return _equals;
  }
  
  private boolean _test__pushPeek_transitions1_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(random1), Double.valueOf(random2))));
    assertTrue("it == #[random1, random2]; failed after push(random2)", _equals);
    return _equals;
  }
  
  private double _init__performAdd_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__performAdd_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__performAdd_transitions0_actions0(final RPN it, final double random1, final double random2) {
    it.push(random1);
  }
  
  private void _transition_exprAction__performAdd_transitions0_actions1(final RPN it, final double random1, final double random2) {
    it.push(random2);
  }
  
  private void _transition_exprAction__performAdd_transitions0_actions2(final RPN it, final double random1, final double random2) {
    this.performOperation("+");
  }
  
  private void _test__performAdd_transitions0_effect_state(final RPN it, final double random1, final double random2) {
    _test__performAdd_transitions0_effect_state_propertyTests0(rPN, random1, random2);
    _test__performAdd_transitions0_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private boolean _test__performAdd_transitions0_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random1) ,push(random2) ,performOperation('+')", _equals);
    return _equals;
  }
  
  private boolean _test__performAdd_transitions0_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    double _plus = (random1 + random2);
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(_plus))));
    assertTrue("it == #[random1 + random2]; failed after push(random1) ,push(random2) ,performOperation('+')", _equals);
    return _equals;
  }
  
  private double _init__performSubtract_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__performSubtract_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__performSubtract_transitions0_actions0(final RPN it, final double random1, final double random2) {
    it.push(random1);
  }
  
  private void _transition_exprAction__performSubtract_transitions0_actions1(final RPN it, final double random1, final double random2) {
    it.push(random2);
  }
  
  private void _transition_exprAction__performSubtract_transitions0_actions2(final RPN it, final double random1, final double random2) {
    this.performOperation("-");
  }
  
  private void _test__performSubtract_transitions0_effect_state(final RPN it, final double random1, final double random2) {
    _test__performSubtract_transitions0_effect_state_propertyTests0(rPN, random1, random2);
    _test__performSubtract_transitions0_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private boolean _test__performSubtract_transitions0_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random1) ,push(random2) ,performOperation('-')", _equals);
    return _equals;
  }
  
  private boolean _test__performSubtract_transitions0_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    double _minus = (random1 - random2);
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(_minus))));
    assertTrue("it == #[random1 - random2]; failed after push(random1) ,push(random2) ,performOperation('-')", _equals);
    return _equals;
  }
  
  private double _init__performMultiply_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__performMultiply_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__performMultiply_transitions0_actions0(final RPN it, final double random1, final double random2) {
    it.push(random1);
  }
  
  private void _transition_exprAction__performMultiply_transitions0_actions1(final RPN it, final double random1, final double random2) {
    it.push(random2);
  }
  
  private void _transition_exprAction__performMultiply_transitions0_actions2(final RPN it, final double random1, final double random2) {
    this.performOperation("*");
  }
  
  private void _test__performMultiply_transitions0_effect_state(final RPN it, final double random1, final double random2) {
    _test__performMultiply_transitions0_effect_state_propertyTests0(rPN, random1, random2);
    _test__performMultiply_transitions0_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private boolean _test__performMultiply_transitions0_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random1) ,push(random2) ,performOperation('*')", _equals);
    return _equals;
  }
  
  private boolean _test__performMultiply_transitions0_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    double _multiply = (random1 * random2);
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(_multiply))));
    assertTrue("it == #[random1 * random2]; failed after push(random1) ,push(random2) ,performOperation('*')", _equals);
    return _equals;
  }
  
  private double _init__performDivide_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__performDivide_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    double _plus = (_multiply + 1);
    return _plus;
  }
  
  private void _transition_exprAction__performDivide_transitions0_actions0(final RPN it, final double random1, final double random2) {
    it.push(random1);
  }
  
  private void _transition_exprAction__performDivide_transitions0_actions1(final RPN it, final double random1, final double random2) {
    it.push(random2);
  }
  
  private void _transition_exprAction__performDivide_transitions0_actions2(final RPN it, final double random1, final double random2) {
    this.performOperation("/");
  }
  
  private void _test__performDivide_transitions0_effect_state(final RPN it, final double random1, final double random2) {
    _test__performDivide_transitions0_effect_state_propertyTests0(rPN, random1, random2);
    _test__performDivide_transitions0_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private boolean _test__performDivide_transitions0_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random1) ,push(random2) ,performOperation('/')", _equals);
    return _equals;
  }
  
  private boolean _test__performDivide_transitions0_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    double _divide = (random1 / random2);
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(_divide))));
    assertTrue("it == #[random1 / random2]; failed after push(random1) ,push(random2) ,performOperation('/')", _equals);
    return _equals;
  }
  
  private double _init__performSwap_random1() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private double _init__performSwap_random2() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    double _plus = (_multiply + 1);
    return _plus;
  }
  
  private void _transition_exprAction__performSwap_transitions0_actions0(final RPN it, final double random1, final double random2) {
    it.push(random1);
  }
  
  private void _transition_exprAction__performSwap_transitions0_actions1(final RPN it, final double random1, final double random2) {
    it.push(random2);
  }
  
  private void _transition_exprAction__performSwap_transitions0_actions2(final RPN it, final double random1, final double random2) {
    this.performOperation("~");
  }
  
  private void _test__performSwap_transitions0_effect_state(final RPN it, final double random1, final double random2) {
    _test__performSwap_transitions0_effect_state_propertyTests0(rPN, random1, random2);
    _test__performSwap_transitions0_effect_state_propertyTests1(rPN, random1, random2);
    
  }
  
  private boolean _test__performSwap_transitions0_effect_state_propertyTests0(final RPN it, final double random1, final double random2) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 2);
    assertTrue("size == 2; failed after push(random1) ,push(random2) ,performOperation('~')", _equals);
    return _equals;
  }
  
  private boolean _test__performSwap_transitions0_effect_state_propertyTests1(final RPN it, final double random1, final double random2) {
    
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(random2), Double.valueOf(random1))));
    assertTrue("it == #[random2, random1]; failed after push(random1) ,push(random2) ,performOperation('~')", _equals);
    return _equals;
  }
  
  private void _transition_exprAction__performPi_transitions0_actions0(final RPN it) {
    this.performOperation("p");
  }
  
  private void _test__performPi_transitions0_effect_state(final RPN it) {
    _test__performPi_transitions0_effect_state_propertyTests0(rPN);
    _test__performPi_transitions0_effect_state_propertyTests1(rPN);
    
  }
  
  private boolean _test__performPi_transitions0_effect_state_propertyTests0(final RPN it) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after performOperation('p')", _equals);
    return _equals;
  }
  
  private boolean _test__performPi_transitions0_effect_state_propertyTests1(final RPN it) {
    
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(Math.PI))));
    assertTrue("it == #[Math.PI]; failed after performOperation('p')", _equals);
    return _equals;
  }
  
  private double _init__performAbs_random() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    double _minus = (_multiply - 50);
    return _minus;
  }
  
  private void _transition_exprAction__performAbs_transitions0_actions0(final RPN it, final double random) {
    it.push(random);
  }
  
  private void _transition_exprAction__performAbs_transitions0_actions1(final RPN it, final double random) {
    this.performOperation("|");
  }
  
  private void _test__performAbs_transitions0_effect_state(final RPN it, final double random) {
    _test__performAbs_transitions0_effect_state_propertyTests0(rPN, random);
    _test__performAbs_transitions0_effect_state_propertyTests1(rPN, random);
    
  }
  
  private boolean _test__performAbs_transitions0_effect_state_propertyTests0(final RPN it, final double random) {
    
    int _size = it.getSize();
    boolean _equals = this.operator_equals(_size, 1);
    assertTrue("size == 1; failed after push(random) ,performOperation('|')", _equals);
    return _equals;
  }
  
  private boolean _test__performAbs_transitions0_effect_state_propertyTests1(final RPN it, final double random) {
    
    double _abs = Math.abs(random);
    boolean _equals = this.operator_equals(it, Collections.<Double>unmodifiableList(Lists.<Double>newArrayList(Double.valueOf(_abs))));
    assertTrue("it == #[Math.abs(random)]; failed after push(random) ,performOperation('|')", _equals);
    return _equals;
  }
}
