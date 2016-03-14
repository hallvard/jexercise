package patterns.observable;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import patterns.observable.Stock;
import patterns.observable.StockIndex;

@JExercise(description = "Tests patterns.observable.StockIndex")
@SuppressWarnings("all")
public class StockIndexTest extends TestCase {
  private double facebookPrice;
  
  private double _init_facebookPrice() {
    return 67.80;
  }
  
  private double applePrice;
  
  private double _init_applePrice() {
    return 534.98;
  }
  
  private Stock facebook;
  
  private Stock _init_facebook() {
    Stock _stock = new Stock("FB", this.facebookPrice);
    return _stock;
  }
  
  private Stock apple;
  
  private Stock _init_apple() {
    Stock _stock = new Stock("AAPL", this.applePrice);
    return _stock;
  }
  
  private StockIndex index0;
  
  private StockIndex _init_index0() {
    StockIndex _stockIndex = new StockIndex("OSEBX");
    return _stockIndex;
  }
  
  private StockIndex index1;
  
  private StockIndex _init_index1() {
    StockIndex _stockIndex = new StockIndex("OSEBX", this.facebook);
    return _stockIndex;
  }
  
  private StockIndex indexN;
  
  private StockIndex _init_indexN() {
    StockIndex _stockIndex = new StockIndex("OSEBX", this.facebook, this.apple);
    return _stockIndex;
  }
  
  @Override
  protected void setUp() {
    facebookPrice = _init_facebookPrice();
    applePrice = _init_applePrice();
    facebook = _init_facebook();
    apple = _init_apple();
    index0 = _init_index0();
    index1 = _init_index1();
    indexN = _init_indexN();
    
  }
  
  private boolean operator_equals(final double n1, final double n2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      _xblockexpression = (((n1 + epsilon) >= n2) && ((n1 - epsilon) <= n2));
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "StockIndex(String,patterns.observable.Stock[])", description = "<h3>Tests constructor with 0, 1 and 2 arguments</h3>Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "StockIndex(String,patterns.observable.Stock[]);void addStock(patterns.observable.Stock)", description = "<h3>Tests addStock </h3>Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>index0.addStock(facebook)</li>\n\t\t<li>index0.addStock(facebook)</li>\n\t\t</ul>\n")
  public void testAddStock() {
    _test__addStock_transitions0_effect_state();
    _transition_exprAction__addStock_transitions1_actions0();
    _test__addStock_transitions1_effect_state();
    _transition_exprAction__addStock_transitions2_actions0();
    _test__addStock_transitions2_effect_state();
    
  }
  
  @JExercise(tests = "StockIndex(String,patterns.observable.Stock[]);void removeStock(patterns.observable.Stock)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>indexN.removeStock(apple)</li>\n\t\t<li>indexN.removeStock(apple)</li>\n\t\t<li>indexN.removeStock(facebook)</li>\n\t\t</ul>\n")
  public void testRemoveStock() {
    _test__removeStock_transitions0_effect_state();
    _transition_exprAction__removeStock_transitions1_actions0();
    _test__removeStock_transitions1_effect_state();
    _transition_exprAction__removeStock_transitions2_actions0();
    _test__removeStock_transitions2_effect_state();
    _transition_exprAction__removeStock_transitions3_actions0();
    _test__removeStock_transitions3_effect_state();
    
  }
  
  @JExercise(tests = "StockIndex(String,patterns.observable.Stock[])", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>facebook.setPrice(facebookPrice2)</li>\n\t\t<li>facebook.setPrice(facebookPrice3)</li>\n\t\t</ul>\n")
  public void testChangePrice() {
    double facebookPrice2 = _init__changePrice_facebookPrice2();
    double facebookPrice3 = _init__changePrice_facebookPrice3();
    _transition_exprAction__changePrice_transitions0_actions0(facebookPrice2, facebookPrice3);
    _test__changePrice_transitions0_effect_state(facebookPrice2, facebookPrice3);
    _transition_exprAction__changePrice_transitions1_actions0(facebookPrice2, facebookPrice3);
    _test__changePrice_transitions1_effect_state(facebookPrice2, facebookPrice3);
    
  }
  
  private void _test__constructor_transitions0_effect_state() {
    _test__constructor_transitions0_effect_state_objectTests0_test(index0);
    _test__constructor_transitions0_effect_state_objectTests1_test(index1);
    _test__constructor_transitions0_effect_state_objectTests2_test(indexN);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == 0.0 failed", this.operator_equals(_index, 0.0));
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests1_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice failed", this.operator_equals(_index, this.facebookPrice));
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests2_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice + applePrice failed", this.operator_equals(_index, (this.facebookPrice + this.applePrice)));
    
  }
  
  private void _test__addStock_transitions0_effect_state() {
    _test__addStock_transitions0_effect_state_objectTests0_test(index0);
    
  }
  
  private void _test__addStock_transitions0_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == 0.0 failed", this.operator_equals(_index, 0.0));
    
  }
  
  private void _transition_exprAction__addStock_transitions1_actions0() {
    try {
      
      this.index0.addStock(this.facebook);
      } catch (junit.framework.AssertionFailedError error) {
      fail("index0.addStock(facebook) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addStock_transitions1_effect_state() {
    _test__addStock_transitions1_effect_state_objectTests0_test(index0);
    
  }
  
  private void _test__addStock_transitions1_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice failed after index0.addStock(facebook)", this.operator_equals(_index, this.facebookPrice));
    
  }
  
  private void _transition_exprAction__addStock_transitions2_actions0() {
    try {
      
      this.index0.addStock(this.facebook);
      } catch (junit.framework.AssertionFailedError error) {
      fail("index0.addStock(facebook) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addStock_transitions2_effect_state() {
    _test__addStock_transitions2_effect_state_objectTests0_test(index0);
    
  }
  
  private void _test__addStock_transitions2_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice failed after index0.addStock(facebook)", this.operator_equals(_index, this.facebookPrice));
    
  }
  
  private void _test__removeStock_transitions0_effect_state() {
    _test__removeStock_transitions0_effect_state_objectTests0_test(indexN);
    
  }
  
  private void _test__removeStock_transitions0_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice + applePrice failed", this.operator_equals(_index, (this.facebookPrice + this.applePrice)));
    
  }
  
  private void _transition_exprAction__removeStock_transitions1_actions0() {
    try {
      
      this.indexN.removeStock(this.apple);
      } catch (junit.framework.AssertionFailedError error) {
      fail("indexN.removeStock(apple) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removeStock_transitions1_effect_state() {
    _test__removeStock_transitions1_effect_state_objectTests0_test(indexN);
    
  }
  
  private void _test__removeStock_transitions1_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice failed after indexN.removeStock(apple)", this.operator_equals(_index, this.facebookPrice));
    
  }
  
  private void _transition_exprAction__removeStock_transitions2_actions0() {
    try {
      
      this.indexN.removeStock(this.apple);
      } catch (junit.framework.AssertionFailedError error) {
      fail("indexN.removeStock(apple) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removeStock_transitions2_effect_state() {
    _test__removeStock_transitions2_effect_state_objectTests0_test(indexN);
    
  }
  
  private void _test__removeStock_transitions2_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice failed after indexN.removeStock(apple)", this.operator_equals(_index, this.facebookPrice));
    
  }
  
  private void _transition_exprAction__removeStock_transitions3_actions0() {
    try {
      
      this.indexN.removeStock(this.facebook);
      } catch (junit.framework.AssertionFailedError error) {
      fail("indexN.removeStock(facebook) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__removeStock_transitions3_effect_state() {
    _test__removeStock_transitions3_effect_state_objectTests0_test(indexN);
    
  }
  
  private void _test__removeStock_transitions3_effect_state_objectTests0_test(final StockIndex it) {
    
    double _index = it.getIndex();
    assertTrue("index == 0.0 failed after indexN.removeStock(facebook)", this.operator_equals(_index, 0.0));
    
  }
  
  private double _init__changePrice_facebookPrice2() {
    return 67.0;
  }
  
  private double _init__changePrice_facebookPrice3() {
    return 69.0;
  }
  
  private void _transition_exprAction__changePrice_transitions0_actions0(final double facebookPrice2, final double facebookPrice3) {
    try {
      
      this.facebook.setPrice(facebookPrice2);
      } catch (junit.framework.AssertionFailedError error) {
      fail("facebook.setPrice(facebookPrice2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__changePrice_transitions0_effect_state(final double facebookPrice2, final double facebookPrice3) {
    _test__changePrice_transitions0_effect_state_objectTests0_test(index1, facebookPrice2, facebookPrice3);
    _test__changePrice_transitions0_effect_state_objectTests1_test(indexN, facebookPrice2, facebookPrice3);
    
  }
  
  private void _test__changePrice_transitions0_effect_state_objectTests0_test(final StockIndex it, final double facebookPrice2, final double facebookPrice3) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice2 failed after facebook.setPrice(facebookPrice2)", this.operator_equals(_index, facebookPrice2));
    
  }
  
  private void _test__changePrice_transitions0_effect_state_objectTests1_test(final StockIndex it, final double facebookPrice2, final double facebookPrice3) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice2 + applePrice failed after facebook.setPrice(facebookPrice2)", this.operator_equals(_index, (facebookPrice2 + this.applePrice)));
    
  }
  
  private void _transition_exprAction__changePrice_transitions1_actions0(final double facebookPrice2, final double facebookPrice3) {
    try {
      
      this.facebook.setPrice(facebookPrice3);
      } catch (junit.framework.AssertionFailedError error) {
      fail("facebook.setPrice(facebookPrice3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__changePrice_transitions1_effect_state(final double facebookPrice2, final double facebookPrice3) {
    _test__changePrice_transitions1_effect_state_objectTests0_test(index1, facebookPrice2, facebookPrice3);
    _test__changePrice_transitions1_effect_state_objectTests1_test(indexN, facebookPrice2, facebookPrice3);
    
  }
  
  private void _test__changePrice_transitions1_effect_state_objectTests0_test(final StockIndex it, final double facebookPrice2, final double facebookPrice3) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice3 failed after facebook.setPrice(facebookPrice3)", this.operator_equals(_index, facebookPrice3));
    
  }
  
  private void _test__changePrice_transitions1_effect_state_objectTests1_test(final StockIndex it, final double facebookPrice2, final double facebookPrice3) {
    
    double _index = it.getIndex();
    assertTrue("index == facebookPrice3 + applePrice failed after facebook.setPrice(facebookPrice3)", this.operator_equals(_index, (facebookPrice3 + this.applePrice)));
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(StockIndexTest.class);
  }
}
