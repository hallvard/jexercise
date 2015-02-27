package delegation;

import delegation.BinaryComputingIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

@JExercise(description = "Tests delegation.BinaryComputingIterator")
@SuppressWarnings("all")
public class BinaryComputingIteratorTest extends TestCase {
  private Iterator<Double> iterator1;
  
  private Iterator<Double> _init_iterator1() {
    ArrayList<Double> _newArrayList = CollectionLiterals.<Double>newArrayList(Double.valueOf(0.5), Double.valueOf((-2.0)));
    Iterator<Double> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<Double> iterator2;
  
  private Iterator<Double> _init_iterator2() {
    ArrayList<Double> _newArrayList = CollectionLiterals.<Double>newArrayList(Double.valueOf(5.0), Double.valueOf(3.0));
    Iterator<Double> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<Double> iteratorShort;
  
  private Iterator<Double> _init_iteratorShort() {
    ArrayList<Double> _newArrayList = CollectionLiterals.<Double>newArrayList(Double.valueOf(5.0));
    Iterator<Double> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<Double> iteratorEmpty1;
  
  private Iterator<Double> _init_iteratorEmpty1() {
    ArrayList<Double> _newArrayList = CollectionLiterals.<Double>newArrayList();
    Iterator<Double> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private Iterator<Double> iteratorEmpty2;
  
  private Iterator<Double> _init_iteratorEmpty2() {
    ArrayList<Double> _newArrayList = CollectionLiterals.<Double>newArrayList();
    Iterator<Double> _iterator = _newArrayList.iterator();
    return _iterator;
  }
  
  private double epsilon;
  
  private double _init_epsilon() {
    return 0.000001d;
  }
  
  @Override
  protected void setUp() {
    iterator1 = _init_iterator1();
    iterator2 = _init_iterator2();
    iteratorShort = _init_iteratorShort();
    iteratorEmpty1 = _init_iteratorEmpty1();
    iteratorEmpty2 = _init_iteratorEmpty2();
    epsilon = _init_epsilon();
    
  }
  
  private boolean approximatelyEquals(final double first, final double second, final double epsilon) {
    return (((first - epsilon) < second) && ((first + epsilon) > second));
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>BinaryOperator som multipliserer</h3>Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Henter verdi: approximatelyEquals(binaryIterator.next, 2.5, epsilon) == true</li>\r\n\t\t<li>Henter verdi: approximatelyEquals(binaryIterator.next, -6.0, epsilon) == true</li>\r\n\t\t</ul>\r\n")
  public void testComputeResultsMultiplication() {
    BinaryComputingIterator binaryIterator = _init__computeResultsMultiplication_binaryIterator();
    _transition_exprAction__computeResultsMultiplication_transitions0_actions0(binaryIterator);
    _test__computeResultsMultiplication_transitions0_effect_state(binaryIterator);
    _transition_exprAction__computeResultsMultiplication_transitions1_actions0(binaryIterator);
    _test__computeResultsMultiplication_transitions1_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>BinaryOperator som adderer</h3>Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Henter verdi: approximatelyEquals(binaryIterator.next, 5.5, epsilon) == true</li>\r\n\t\t<li>Henter verdi: approximatelyEquals(binaryIterator.next, 1.0, epsilon) == true</li>\r\n\t\t</ul>\r\n")
  public void testComputeResultsAddition() {
    BinaryComputingIterator binaryIterator = _init__computeResultsAddition_binaryIterator();
    _transition_exprAction__computeResultsAddition_transitions0_actions0(binaryIterator);
    _test__computeResultsAddition_transitions0_effect_state(binaryIterator);
    _transition_exprAction__computeResultsAddition_transitions1_actions0(binaryIterator);
    _test__computeResultsAddition_transitions1_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>);Double next()", description = "<h3>Multiplisering med ujevnt antall verdier i interne iteratorer</h3>Tests \r\n\t\tthe following sequence:\r\n\t\t<ul>\r\n\t\t<li>Henter verdi: approximatelyEquals(binaryIterator.next, 2.5, epsilon) == true</li>\r\n\t\t</ul>\r\n")
  public void testComputeResultsWithShortIterator() {
    BinaryComputingIterator binaryIterator = _init__computeResultsWithShortIterator_binaryIterator();
    _transition_exprAction__computeResultsWithShortIterator_transitions0_actions0(binaryIterator);
    _test__computeResultsWithShortIterator_transitions0_effect_state(binaryIterator);
    
  }
  
  @JExercise(tests = "BinaryComputingIterator(java.util.Iterator<Double>,java.util.Iterator<Double>,java.util.function.BinaryOperator<Double>)", description = "<h3>Multiplisering med tomme interne iteratorer</h3>Tests \r\n\t\tinitialization\r\n")
  public void testComputeResultsWithEmptyIterator() {
    BinaryComputingIterator binaryIterator = _init__computeResultsWithEmptyIterator_binaryIterator();
    _test__computeResultsWithEmptyIterator_transitions0_effect_state(binaryIterator);
    
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
    boolean _approximatelyEquals = this.approximatelyEquals((_next).doubleValue(), 2.5, this.epsilon);
    assertEquals("approximatelyEquals(binaryIterator.next, 2.5, epsilon) == true failed", true, _approximatelyEquals);
    
  }
  
  private void _test__computeResultsMultiplication_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsMultiplication_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsMultiplication_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    assertTrue("binaryIterator.hasNext failed after approximatelyEquals(binaryIterator.next, 2.5, epsilon) == true", binaryIterator.hasNext());
    
  }
  
  private void _transition_exprAction__computeResultsMultiplication_transitions1_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _approximatelyEquals = this.approximatelyEquals((_next).doubleValue(), (-6.0), this.epsilon);
    assertEquals("approximatelyEquals(binaryIterator.next, -6.0, epsilon) == true failed", true, _approximatelyEquals);
    
  }
  
  private void _test__computeResultsMultiplication_transitions1_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsMultiplication_transitions1_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsMultiplication_transitions1_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after approximatelyEquals(binaryIterator.next, -6.0, epsilon) == true", (!_hasNext));
    
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
    boolean _approximatelyEquals = this.approximatelyEquals((_next).doubleValue(), 5.5, this.epsilon);
    assertEquals("approximatelyEquals(binaryIterator.next, 5.5, epsilon) == true failed", true, _approximatelyEquals);
    
  }
  
  private void _test__computeResultsAddition_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsAddition_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsAddition_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    assertTrue("binaryIterator.hasNext failed after approximatelyEquals(binaryIterator.next, 5.5, epsilon) == true", binaryIterator.hasNext());
    
  }
  
  private void _transition_exprAction__computeResultsAddition_transitions1_actions0(final BinaryComputingIterator binaryIterator) {
    
    Double _next = binaryIterator.next();
    boolean _approximatelyEquals = this.approximatelyEquals((_next).doubleValue(), 1.0, this.epsilon);
    assertEquals("approximatelyEquals(binaryIterator.next, 1.0, epsilon) == true failed", true, _approximatelyEquals);
    
  }
  
  private void _test__computeResultsAddition_transitions1_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsAddition_transitions1_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsAddition_transitions1_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after approximatelyEquals(binaryIterator.next, 1.0, epsilon) == true", (!_hasNext));
    
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
    boolean _approximatelyEquals = this.approximatelyEquals((_next).doubleValue(), 2.5, this.epsilon);
    assertEquals("approximatelyEquals(binaryIterator.next, 2.5, epsilon) == true failed", true, _approximatelyEquals);
    
  }
  
  private void _test__computeResultsWithShortIterator_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithShortIterator_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithShortIterator_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed after approximatelyEquals(binaryIterator.next, 2.5, epsilon) == true", (!_hasNext));
    
  }
  
  private BinaryComputingIterator _init__computeResultsWithEmptyIterator_binaryIterator() {
    final BinaryOperator<Double> _function = new BinaryOperator<Double>() {
      public Double apply(final Double x, final Double y) {
        return Double.valueOf(DoubleExtensions.operator_multiply(x, y));
      }
    };
    BinaryComputingIterator _binaryComputingIterator = new BinaryComputingIterator(this.iteratorEmpty1, this.iteratorEmpty2, _function);
    return _binaryComputingIterator;
  }
  
  private void _test__computeResultsWithEmptyIterator_transitions0_effect_state(final BinaryComputingIterator binaryIterator) {
    _test__computeResultsWithEmptyIterator_transitions0_effect_state_objectTests0_test(binaryIterator);
    
  }
  
  private void _test__computeResultsWithEmptyIterator_transitions0_effect_state_objectTests0_test(final BinaryComputingIterator binaryIterator) {
    
    boolean _hasNext = binaryIterator.hasNext();
    assertTrue("! binaryIterator.hasNext failed", (!_hasNext));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(BinaryComputingIteratorTest.class);
  }
}
