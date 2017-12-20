package misc.rpn;

import java.util.Collection;
import java.util.Collections;
import junit.framework.TestCase;
import misc.rpn.RPN;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@JExercise(description = "Tests misc.rpn.RPN")
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
      int _size = rpn.getSize();
      int _size_1 = ds.size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        return false;
      }
      final double epsilon = 0.000001d;
      int count = 0;
      for (final Double d : ds) {
        {
          int _size_2 = ds.size();
          int _minus = (_size_2 - count);
          int _minus_1 = (_minus - 1);
          final double value = rpn.peek(_minus_1);
          if ((((d).doubleValue() < (value - epsilon)) || ((d).doubleValue() > (value + epsilon)))) {
            return false;
          }
          count = (count + 1);
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "RPN()", description = "<h3>Konstrukt\u00F8r</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(rPN);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger ett element p\u00E5 stacken og sjekker st\u00F8rrelsen</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(1.0)</li>\n\t\t</ul>\n")
  public void testPush() {
    _transition_exprAction__push_transitions0_actions0(rPN);
    _test__push_transitions0_effects0_state(rPN);
    
  }
  
  @JExercise(tests = "RPN();void push(double);double pop()", description = "<h3>Legger et tilfeldig tall p\u00E5 stacken, tar det av og sjekker verdien</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random)</li>\n\t\t<li>pop == random</li>\n\t\t</ul>\n")
  public void testPushPop() {
    double random = _init__pushPop_random();
    _transition_exprAction__pushPop_transitions0_actions0(rPN, random);
    _test__pushPop_transitions0_effects0_state(rPN, random);
    _transition_exprAction__pushPop_transitions1_actions0(rPN, random);
    _test__pushPop_transitions1_effects0_state(rPN, random);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken, og sjekker dem med peek()</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1)</li>\n\t\t<li>push(random2)</li>\n\t\t</ul>\n")
  public void testPushPeek() {
    double random1 = _init__pushPeek_random1();
    double random2 = _init__pushPeek_random2();
    _transition_exprAction__pushPeek_transitions0_actions0(rPN, random1, random2);
    _test__pushPeek_transitions0_effects0_state(rPN, random1, random2);
    _transition_exprAction__pushPeek_transitions1_actions0(rPN, random1, random2);
    _test__pushPeek_transitions1_effects0_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer + (pluss)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'+\')</li>\n\t\t</ul>\n")
  public void testPerformAdd() {
    double random1 = _init__performAdd_random1();
    double random2 = _init__performAdd_random2();
    _transition_exprAction__performAdd_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performAdd_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performAdd_transitions0_actions2(rPN, random1, random2);
    _test__performAdd_transitions0_effects0_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer - (minus)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'-\')</li>\n\t\t</ul>\n")
  public void testPerformSubtract() {
    double random1 = _init__performSubtract_random1();
    double random2 = _init__performSubtract_random2();
    _transition_exprAction__performSubtract_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performSubtract_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performSubtract_transitions0_actions2(rPN, random1, random2);
    _test__performSubtract_transitions0_effects0_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer * (multiplikasjon)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'*\')</li>\n\t\t</ul>\n")
  public void testPerformMultiply() {
    double random1 = _init__performMultiply_random1();
    double random2 = _init__performMultiply_random2();
    _transition_exprAction__performMultiply_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performMultiply_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performMultiply_transitions0_actions2(rPN, random1, random2);
    _test__performMultiply_transitions0_effects0_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer / (divisjon)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'/\')</li>\n\t\t</ul>\n")
  public void testPerformDivide() {
    double random1 = _init__performDivide_random1();
    double random2 = _init__performDivide_random2();
    _transition_exprAction__performDivide_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performDivide_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performDivide_transitions0_actions2(rPN, random1, random2);
    _test__performDivide_transitions0_effects0_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Legger to tilfeldig tall p\u00E5 stacken og utf\u00F8rer ~ (swap)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random1), push(random2), performOperation(\'~\')</li>\n\t\t</ul>\n")
  public void testPerformSwap() {
    double random1 = _init__performSwap_random1();
    double random2 = _init__performSwap_random2();
    _transition_exprAction__performSwap_transitions0_actions0(rPN, random1, random2);
    _transition_exprAction__performSwap_transitions0_actions1(rPN, random1, random2);
    _transition_exprAction__performSwap_transitions0_actions2(rPN, random1, random2);
    _test__performSwap_transitions0_effects0_state(rPN, random1, random2);
    
  }
  
  @JExercise(tests = "RPN()", description = "<h3>Utf\u00F8rer p (pi)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>performOperation(\'p\')</li>\n\t\t</ul>\n")
  public void testPerformPi() {
    _transition_exprAction__performPi_transitions0_actions0(rPN);
    _test__performPi_transitions0_effects0_state(rPN);
    
  }
  
  @JExercise(tests = "RPN();void push(double)", description = "<h3>Utf\u00F8rer | (absoluttverdi)</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>push(random), performOperation(\'|\')</li>\n\t\t</ul>\n")
  public void testPerformAbs() {
    double random = _init__performAbs_random();
    _transition_exprAction__performAbs_transitions0_actions0(rPN, random);
    _transition_exprAction__performAbs_transitions0_actions1(rPN, random);
    _test__performAbs_transitions0_effects0_state(rPN, random);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final RPN it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(rPN);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final RPN it) {
    
    int _size = it.getSize();
    assertEquals("size == 0 failed", 0, _size);
    
  }
  
  private void _transition_exprAction__push_transitions0_actions0(final RPN it) {
    try {
      
      it.push(1.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(1.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__push_transitions0_effects0_state(final RPN it) {
    _test__push_transitions0_effects0_state_objectTests0_test(rPN);
    
  }
  
  private void _test__push_transitions0_effects0_state_objectTests0_test(final RPN it) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(1.0)", 1, _size);
    
  }
  
  private double _init__pushPop_random() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    return _multiply;
  }
  
  private void _transition_exprAction__pushPop_transitions0_actions0(final RPN it, final double random) {
    try {
      
      it.push(random);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__pushPop_transitions0_effects0_state(final RPN it, final double random) {
    _test__pushPop_transitions0_effects0_state_objectTests0_test(rPN, random);
    
  }
  
  private void _test__pushPop_transitions0_effects0_state_objectTests0_test(final RPN it, final double random) {
    
    int _size = it.getSize();
    assertEquals("size == 1 failed after push(random)", 1, _size);
    
  }
  
  private void _transition_exprAction__pushPop_transitions1_actions0(final RPN it, final double random) {
    
    double _pop = it.pop();
    assertEquals("pop == random failed", random, _pop);
    
  }
  
  private void _test__pushPop_transitions1_effects0_state(final RPN it, final double random) {
    _test__pushPop_transitions1_effects0_state_objectTests0_test(rPN, random);
    
  }
  
  private void _test__pushPop_transitions1_effects0_state_objectTests0_test(final RPN it, final double random) {
    
    int _size = it.getSize();
    assertEquals("size == 0 failed after pop == random", 0, _size);
    
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
    try {
      
      it.push(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__pushPeek_transitions0_effects0_state(final RPN it, final double random1, final double random2) {
    _test__pushPeek_transitions0_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__pushPeek_transitions0_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random1] failed after push(random1)", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(random1)))));
    
  }
  
  private void _transition_exprAction__pushPeek_transitions1_actions0(final RPN it, final double random1, final double random2) {
    try {
      
      it.push(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__pushPeek_transitions1_effects0_state(final RPN it, final double random1, final double random2) {
    _test__pushPeek_transitions1_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__pushPeek_transitions1_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random1, random2] failed after push(random2)", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(random1), Double.valueOf(random2)))));
    
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
    try {
      
      it.push(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performAdd_transitions0_actions1(final RPN it, final double random1, final double random2) {
    try {
      
      it.push(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performAdd_transitions0_actions2(final RPN it, final double random1, final double random2) {
    try {
      
      this.performOperation("+");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('+') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performAdd_transitions0_effects0_state(final RPN it, final double random1, final double random2) {
    _test__performAdd_transitions0_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__performAdd_transitions0_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random1 + random2] failed after push(random1) ,push(random2) ,performOperation('+')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf((random1 + random2))))));
    
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
    try {
      
      it.push(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performSubtract_transitions0_actions1(final RPN it, final double random1, final double random2) {
    try {
      
      it.push(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performSubtract_transitions0_actions2(final RPN it, final double random1, final double random2) {
    try {
      
      this.performOperation("-");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('-') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performSubtract_transitions0_effects0_state(final RPN it, final double random1, final double random2) {
    _test__performSubtract_transitions0_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__performSubtract_transitions0_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random1 - random2] failed after push(random1) ,push(random2) ,performOperation('-')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf((random1 - random2))))));
    
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
    try {
      
      it.push(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performMultiply_transitions0_actions1(final RPN it, final double random1, final double random2) {
    try {
      
      it.push(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performMultiply_transitions0_actions2(final RPN it, final double random1, final double random2) {
    try {
      
      this.performOperation("*");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('*') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performMultiply_transitions0_effects0_state(final RPN it, final double random1, final double random2) {
    _test__performMultiply_transitions0_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__performMultiply_transitions0_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random1 * random2] failed after push(random1) ,push(random2) ,performOperation('*')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf((random1 * random2))))));
    
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
    try {
      
      it.push(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performDivide_transitions0_actions1(final RPN it, final double random1, final double random2) {
    try {
      
      it.push(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performDivide_transitions0_actions2(final RPN it, final double random1, final double random2) {
    try {
      
      this.performOperation("/");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('/') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performDivide_transitions0_effects0_state(final RPN it, final double random1, final double random2) {
    _test__performDivide_transitions0_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__performDivide_transitions0_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random1 / random2] failed after push(random1) ,push(random2) ,performOperation('/')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf((random1 / random2))))));
    
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
    try {
      
      it.push(random1);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performSwap_transitions0_actions1(final RPN it, final double random1, final double random2) {
    try {
      
      it.push(random2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performSwap_transitions0_actions2(final RPN it, final double random1, final double random2) {
    try {
      
      this.performOperation("~");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('~') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performSwap_transitions0_effects0_state(final RPN it, final double random1, final double random2) {
    _test__performSwap_transitions0_effects0_state_objectTests0_test(rPN, random1, random2);
    
  }
  
  private void _test__performSwap_transitions0_effects0_state_objectTests0_test(final RPN it, final double random1, final double random2) {
    
    assertTrue("it == #[random2, random1] failed after push(random1) ,push(random2) ,performOperation('~')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(random2), Double.valueOf(random1)))));
    
  }
  
  private void _transition_exprAction__performPi_transitions0_actions0(final RPN it) {
    try {
      
      this.performOperation("p");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('p') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performPi_transitions0_effects0_state(final RPN it) {
    _test__performPi_transitions0_effects0_state_objectTests0_test(rPN);
    
  }
  
  private void _test__performPi_transitions0_effects0_state_objectTests0_test(final RPN it) {
    
    assertTrue("it == #[Math.PI] failed after performOperation('p')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(Math.PI)))));
    
  }
  
  private double _init__performAbs_random() {
    double _random = Math.random();
    double _multiply = (_random * 100);
    double _minus = (_multiply - 50);
    return _minus;
  }
  
  private void _transition_exprAction__performAbs_transitions0_actions0(final RPN it, final double random) {
    try {
      
      it.push(random);
      } catch (junit.framework.AssertionFailedError error) {
      fail("push(random) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__performAbs_transitions0_actions1(final RPN it, final double random) {
    try {
      
      this.performOperation("|");
      } catch (junit.framework.AssertionFailedError error) {
      fail("performOperation('|') failed: " + error.getMessage());
    }
    
  }
  
  private void _test__performAbs_transitions0_effects0_state(final RPN it, final double random) {
    _test__performAbs_transitions0_effects0_state_objectTests0_test(rPN, random);
    
  }
  
  private void _test__performAbs_transitions0_effects0_state_objectTests0_test(final RPN it, final double random) {
    
    double _abs = Math.abs(random);
    assertTrue("it == #[Math.abs(random)] failed after push(random) ,performOperation('|')", this.operator_equals(it, Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(_abs)))));
    
  }
}
