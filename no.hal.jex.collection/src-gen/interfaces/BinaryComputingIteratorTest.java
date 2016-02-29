package delegation;

import java.util.Collections;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

import interfaces.BinaryComputingIterator;

@JExercise(description = "Tests delegation.BinaryComputingIterator")
@SuppressWarnings("all")
public class BinaryComputingIteratorTest extends TestCase {
  private Iterator<Double> iterator1;
  
  private Iterator<Double> _init_iterator1() {
    Iterator<Double> _iterator = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(0.5), Double.valueOf((-2.0)))).iterator();
    return _iterator;
  }
  
  private Iterator<Double> iterator2;
  
  private Iterator<Double> _init_iterator2() {
    Iterator<Double> _iterator = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(5.0), Double.valueOf(3.0))).iterator();
    return _iterator;
  }
  
  private Iterator<Double> iteratorShort;
  
  private Iterator<Double> _init_iteratorShort() {
    Iterator<Double> _iterator = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList(Double.valueOf(5.0))).iterator();
    return _iterator;
  }
  
  @Override
  protected void setUp() {
    iterator1 = _init_iterator1();
    iterator2 = _init_iterator2();
    iteratorShort = _init_iteratorShort();
    
  }
  
  private boolean operator_assertEquals(final double first, final double second) {
    TestCase.assertEquals(first, second, 0.000001d);
    return true;
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>BinaryOperator som multipliserer</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Sjekker f\u00F8rste verdi: binaryIterator.next ?= 2.5</li>\n\t\t<li>Sjekker andre verdi: binaryIterator.next ?= -6.0</li>\n\t\t</ul>\n")
  public void testComputeResultsMultiplication() {
    BinaryComputingIterator binaryIterator = _init__computeResultsMultiplication_binaryIterator();
    _transition_exprAction__computeResultsMultiplication_transitions0_actions0(binaryIterator);
    _test__computeResultsMultiplication_transitions0_effect_state(binaryIterator);
    _transition_exprAction__computeResultsMultiplication_transitions1_actions0(binaryIterator);
    _test__computeResultsMultiplication_transitions1_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>BinaryOperator som adderer</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Sjekker f\u00F8rste verdi: binaryIterator.next ?= 5.5</li>\n\t\t<li>Sjekker andre verdi: binaryIterator.next ?= 1.0</li>\n\t\t</ul>\n")
  public void testComputeResultsAddition() {
    BinaryComputingIterator binaryIterator = _init__computeResultsAddition_binaryIterator();
    _transition_exprAction__computeResultsAddition_transitions0_actions0(binaryIterator);
    _test__computeResultsAddition_transitions0_effect_state(binaryIterator);
    _transition_exprAction__computeResultsAddition_transitions1_actions0(binaryIterator);
    _test__computeResultsAddition_transitions1_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>Multiplisering med ujevnt antall verdier i interne iteratorer</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Henter verdi: binaryIterator.next ?= 2.5</li>\n\t\t</ul>\n")
  public void testComputeResultsWithShortIterator() {
    BinaryComputingIterator binaryIterator = _init__computeResultsWithShortIterator_binaryIterator();
    _transition_exprAction__computeResultsWithShortIterator_transitions0_actions0(binaryIterator);
    _test__computeResultsWithShortIterator_transitions0_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,Double,Double,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>Multiplisering med ujevnt antall verdier i interne iteratorer og default</h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>Sjekker f\u00F8rste verdi: binaryIterator.next ?= 2.5</li>\n\t\t<li>Sjekker andre verdi: binaryIterator.next ?= -4.0</li>\n\t\t</ul>\n")
  public void testComputeResultsWithShortIteratorAndDefault() {
    BinaryComputingIterator binaryIterator = _init__computeResultsWithShortIteratorAndDefault_binaryIterator();
    _transition_exprAction__computeResultsWithShortIteratorAndDefault_transitions0_actions0(binaryIterator);
    _test__computeResultsWithShortIteratorAndDefault_transitions0_effect_state(binaryIterator);
    _transition_exprAction__computeResultsWithShortIteratorAndDefault_transitions1_actions0(binaryIterator);
    _test__computeResultsWithShortIteratorAndDefault_transitions1_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>)", description = "<h3>Multiplisering med tomme interne iteratorer</h3>Tests \n\t\tinitialization\n")
  public void testComputeResultsWithEmptyIterator() {
    BinaryComputingIterator binaryIterator = _init__computeResultsWithEmptyIterator_binaryIterator();
    _test__computeResultsWithEmptyIterator_transitions0_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,Double,Double,java.util.function.BinaryOperator<Double>)", description = "<h3>Multiplisering med tomme interne iteratorer og default</h3>Tests \n\t\tinitialization\n")
  public void testComputeResultsWithEmptyIteratorAndDefault() {
    BinaryComputingIterator binaryIterator = _init__computeResultsWithEmptyIteratorAndDefault_binaryIterator();
    _test__computeResultsWithEmptyIteratorAndDefault_transitions0_effect_state(binaryIterator);
    
  }
  
  private BinaryComputingIterator _init__computeResultsMultiplication_binaryIterator() {
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_multiply(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(this.iterator1, this.iterator2, _function);
    return _binaryComputingIterator;
  }
  
  private void _transition_exprAction__computeResultsMultiplication_transitions0_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), 2.5);
    assertTrue("binaryIterator.next ?= 2.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsMultiplication_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsMultiplication_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsMultiplication_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    assertTrue("binaryIterator.hasNext failed after binaryIterator.next ?= 2.5", binaryIterator.hasNext());
    
  }
  
  private void _transition_exprAction__computeResultsMultiplication_transitions1_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), (-6.0));
    assertTrue("binaryIterator.next ?= -6.0 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsMultiplication_transitions1_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsMultiplication_transitions1_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsMultiplication_transitions1_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after binaryIterator.next ?= -6.0", (!_hasNext));
    
  }
  
  private BinaryComputingIterator _init__computeResultsAddition_binaryIterator() {
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_plus(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(this.iterator1, this.iterator2, _function);
    return _binaryComputingIterator;
  }
  
  private void _transition_exprAction__computeResultsAddition_transitions0_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), 5.5);
    assertTrue("binaryIterator.next ?= 5.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsAddition_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsAddition_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsAddition_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    assertTrue("binaryIterator.hasNext failed after binaryIterator.next ?= 5.5", binaryIterator.hasNext());
    
  }
  
  private void _transition_exprAction__computeResultsAddition_transitions1_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), 1.0);
    assertTrue("binaryIterator.next ?= 1.0 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsAddition_transitions1_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsAddition_transitions1_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsAddition_transitions1_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after binaryIterator.next ?= 1.0", (!_hasNext));
    
  }
  
  private BinaryComputingIterator _init__computeResultsWithShortIterator_binaryIterator() {
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_multiply(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(this.iterator1, this.iteratorShort, _function);
    return _binaryComputingIterator;
  }
  
  private void _transition_exprAction__computeResultsWithShortIterator_transitions0_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), 2.5);
    assertTrue("binaryIterator.next ?= 2.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsWithShortIterator_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithShortIterator_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithShortIterator_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after binaryIterator.next ?= 2.5", (!_hasNext));
    
  }
  
  private BinaryComputingIterator _init__computeResultsWithShortIteratorAndDefault_binaryIterator() {
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_multiply(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(this.iterator1, this.iteratorShort, null, Double.valueOf(2.0), _function);
    return _binaryComputingIterator;
  }
  
  private void _transition_exprAction__computeResultsWithShortIteratorAndDefault_transitions0_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), 2.5);
    assertTrue("binaryIterator.next ?= 2.5 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsWithShortIteratorAndDefault_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithShortIteratorAndDefault_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithShortIteratorAndDefault_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    assertTrue("binaryIterator.hasNext failed after binaryIterator.next ?= 2.5", binaryIterator.hasNext());
    
  }
  
  private void _transition_exprAction__computeResultsWithShortIteratorAndDefault_transitions1_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _assertEquals = this.operator_assertEquals((_next).doubleValue(), (-4.0));
    assertTrue("binaryIterator.next ?= -4.0 failed", Boolean.valueOf(_assertEquals));
    
  }
  
  private void _test__computeResultsWithShortIteratorAndDefault_transitions1_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithShortIteratorAndDefault_transitions1_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithShortIteratorAndDefault_transitions1_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after binaryIterator.next ?= -4.0", (!_hasNext));
    
  }
  
  private BinaryComputingIterator _init__computeResultsWithEmptyIterator_binaryIterator() {
    Iterator<Double> _iterator = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()).iterator();
    Iterator<Double> _iterator_1 = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()).iterator();
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_multiply(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(_iterator, _iterator_1, _function);
    return _binaryComputingIterator;
  }
  
  private void _test__computeResultsWithEmptyIterator_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithEmptyIterator_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithEmptyIterator_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed", (!_hasNext));
    
  }
  
  private BinaryComputingIterator _init__computeResultsWithEmptyIteratorAndDefault_binaryIterator() {
    Iterator<Double> _iterator = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()).iterator();
    Iterator<Double> _iterator_1 = Collections.<Double>unmodifiableList(CollectionLiterals.<Double>newArrayList()).iterator();
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_multiply(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(_iterator, _iterator_1, Double.valueOf(1.0), Double.valueOf(2.0), _function);
    return _binaryComputingIterator;
  }
  
  private void _test__computeResultsWithEmptyIteratorAndDefault_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithEmptyIteratorAndDefault_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithEmptyIteratorAndDefault_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed", (!_hasNext));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(BinaryComputingIteratorTest.class);
  }
}
