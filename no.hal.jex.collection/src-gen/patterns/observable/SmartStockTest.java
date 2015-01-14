package patterns.observable;

import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;
import patterns.observable.SmartStock;
import patterns.observable.Stock;
import patterns.observable.StockListener;

@JExercise(description = "Tests patterns.observable.SmartStock")
@SuppressWarnings("all")
public class SmartStockTest extends TestCase {
  private SmartStock stock;
  
  private SmartStock _init_stock() {
    SmartStock _smartStock = new SmartStock("APPL", 110.0d);
    return _smartStock;
  }
  
  private double oldPrice1;
  
  private double _init_oldPrice1() {
    return 0.0d;
  }
  
  private double newPrice1;
  
  private double _init_newPrice1() {
    return 110.0d;
  }
  
  private double oldPrice2;
  
  private double _init_oldPrice2() {
    return 0.0d;
  }
  
  private double newPrice2;
  
  private double _init_newPrice2() {
    return 0.0d;
  }
  
  @Override
  protected void setUp() {
    stock = _init_stock();
    oldPrice1 = _init_oldPrice1();
    newPrice1 = _init_newPrice1();
    oldPrice2 = _init_oldPrice2();
    newPrice2 = _init_newPrice2();
    
  }
  
  private void setPrice1(final double newPrice, final double expectedOldPrice, final double expectedNewPrice) {
    this.oldPrice1 = this.newPrice1;
    this.newPrice1 = newPrice;
    this.stock.setPrice(newPrice);
    TestCase.assertEquals(Double.valueOf(expectedOldPrice), Double.valueOf(this.oldPrice2));
    TestCase.assertEquals(Double.valueOf(expectedNewPrice), Double.valueOf(this.newPrice2));
  }
  
  private double setPrice2(final double oldPrice, final double newPrice) {
    double _xblockexpression = (double) 0;
    {
      this.oldPrice2 = oldPrice;
      _xblockexpression = this.newPrice2 = newPrice;
    }
    return _xblockexpression;
  }
  
  @JExercise(tests = "SmartStock(String,double)", description = "Tests \n\t\tinitialization\n")
  public void testConstructor() {
    _test__constructor_transitions0_effect_state();
    
  }
  
  @JExercise(tests = "SmartStock(String,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ]), setPrice1(118.0d, 110.0d, 118.0d)</li>\n\t\t<li>setPrice1(121.0d, 118.0d, 121.0d)</li>\n\t\t</ul>\n")
  public void testStockListener() {
    _transition_exprAction__stockListener_transitions0_actions0();
    _transition_exprAction__stockListener_transitions0_actions1();
    _test__stockListener_transitions0_effect_state();
    _transition_exprAction__stockListener_transitions1_actions0();
    _test__stockListener_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "SmartStock(String,double);void addStockListener(patterns.observable.StockListener,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 110.0d, 120.0d), setPrice1(118.0d, 0.0d, 0.0d)</li>\n\t\t<li>setPrice1(121.0d, 118.0d, 121.0d)</li>\n\t\t</ul>\n")
  public void testIntervalListener1() {
    _transition_exprAction__intervalListener1_transitions0_actions0();
    _transition_exprAction__intervalListener1_transitions0_actions1();
    _test__intervalListener1_transitions0_effect_state();
    _transition_exprAction__intervalListener1_transitions1_actions0();
    _test__intervalListener1_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "SmartStock(String,double);void addStockListener(patterns.observable.StockListener,double,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 110.0d, 120.0d), setPrice1(108.0d, 110.0d, 108.0d)</li>\n\t\t<li>setPrice1(115.0d, 110.0d, 108.0d)</li>\n\t\t</ul>\n")
  public void testIntervalListener2() {
    _transition_exprAction__intervalListener2_transitions0_actions0();
    _transition_exprAction__intervalListener2_transitions0_actions1();
    _test__intervalListener2_transitions0_effect_state();
    _transition_exprAction__intervalListener2_transitions1_actions0();
    _test__intervalListener2_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "SmartStock(String,double);void addStockListener(patterns.observable.StockListener,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 10.0d), setPrice1(118.0d, 0.0d, 0.0d)</li>\n\t\t<li>setPrice1(121.0d, 110.0d, 121.0d)</li>\n\t\t</ul>\n")
  public void testDifferenceListener1() {
    _transition_exprAction__differenceListener1_transitions0_actions0();
    _transition_exprAction__differenceListener1_transitions0_actions1();
    _test__differenceListener1_transitions0_effect_state();
    _transition_exprAction__differenceListener1_transitions1_actions0();
    _test__differenceListener1_transitions1_effect_state();
    
  }
  
  @JExercise(tests = "SmartStock(String,double);void addStockListener(patterns.observable.StockListener,double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 5.0d), setPrice1(118.0d, 110.0d, 118.0d)</li>\n\t\t<li>setPrice1(121.0d, 110.0d, 118.0d)</li>\n\t\t</ul>\n")
  public void testDifferenceListener2() {
    _transition_exprAction__differenceListener2_transitions0_actions0();
    _transition_exprAction__differenceListener2_transitions0_actions1();
    _test__differenceListener2_transitions0_effect_state();
    _transition_exprAction__differenceListener2_transitions1_actions0();
    _test__differenceListener2_transitions1_effect_state();
    
  }
  
  private void _test__constructor_transitions0_effect_state() {
    _test__constructor_transitions0_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__constructor_transitions0_effect_state_objectTests0_test(final SmartStock it) {
    
    String _ticker = it.getTicker();
    assertEquals("ticker == \"APPL\" failed", "APPL", _ticker);
    
    double _price = it.getPrice();
    assertEquals("price == 110.0d failed", 110.0d, _price);
    
  }
  
  private void _transition_exprAction__stockListener_transitions0_actions0() {
    try {
      
      final StockListener _function = new StockListener() {
        public void stockPriceChanged(final Stock stock, final double oldPrice, final double newPrice) {
          SmartStockTest.this.setPrice2(oldPrice, newPrice);
        }
      };
      this.stock.addStockListener(_function);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ]) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__stockListener_transitions0_actions1() {
    try {
      
      this.setPrice1(118.0d, 110.0d, 118.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(118.0d, 110.0d, 118.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__stockListener_transitions0_effect_state() {
    _test__stockListener_transitions0_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__stockListener_transitions0_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 118.0d failed after stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ]) ,setPrice1(118.0d, 110.0d, 118.0d)", 118.0d, _price);
    
  }
  
  private void _transition_exprAction__stockListener_transitions1_actions0() {
    try {
      
      this.setPrice1(121.0d, 118.0d, 121.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(121.0d, 118.0d, 121.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__stockListener_transitions1_effect_state() {
    _test__stockListener_transitions1_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__stockListener_transitions1_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 121.0d failed after setPrice1(121.0d, 118.0d, 121.0d)", 121.0d, _price);
    
  }
  
  private void _transition_exprAction__intervalListener1_transitions0_actions0() {
    try {
      
      final StockListener _function = new StockListener() {
        public void stockPriceChanged(final Stock stock, final double oldPrice, final double newPrice) {
          SmartStockTest.this.setPrice2(oldPrice, newPrice);
        }
      };
      this.stock.addStockListener(_function, 110.0d, 120.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 110.0d, 120.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__intervalListener1_transitions0_actions1() {
    try {
      
      this.setPrice1(118.0d, 0.0d, 0.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(118.0d, 0.0d, 0.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__intervalListener1_transitions0_effect_state() {
    _test__intervalListener1_transitions0_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__intervalListener1_transitions0_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 118.0d failed after stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 110.0d, 120.0d) ,setPrice1(118.0d, 0.0d, 0.0d)", 118.0d, _price);
    
  }
  
  private void _transition_exprAction__intervalListener1_transitions1_actions0() {
    try {
      
      this.setPrice1(121.0d, 118.0d, 121.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(121.0d, 118.0d, 121.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__intervalListener1_transitions1_effect_state() {
    _test__intervalListener1_transitions1_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__intervalListener1_transitions1_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 121.0d failed after setPrice1(121.0d, 118.0d, 121.0d)", 121.0d, _price);
    
  }
  
  private void _transition_exprAction__intervalListener2_transitions0_actions0() {
    try {
      
      final StockListener _function = new StockListener() {
        public void stockPriceChanged(final Stock stock, final double oldPrice, final double newPrice) {
          SmartStockTest.this.setPrice2(oldPrice, newPrice);
        }
      };
      this.stock.addStockListener(_function, 110.0d, 120.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 110.0d, 120.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__intervalListener2_transitions0_actions1() {
    try {
      
      this.setPrice1(108.0d, 110.0d, 108.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(108.0d, 110.0d, 108.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__intervalListener2_transitions0_effect_state() {
    _test__intervalListener2_transitions0_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__intervalListener2_transitions0_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 108.0d failed after stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 110.0d, 120.0d) ,setPrice1(108.0d, 110.0d, 108.0d)", 108.0d, _price);
    
  }
  
  private void _transition_exprAction__intervalListener2_transitions1_actions0() {
    try {
      
      this.setPrice1(115.0d, 110.0d, 108.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(115.0d, 110.0d, 108.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__intervalListener2_transitions1_effect_state() {
    _test__intervalListener2_transitions1_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__intervalListener2_transitions1_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 115.0d failed after setPrice1(115.0d, 110.0d, 108.0d)", 115.0d, _price);
    
  }
  
  private void _transition_exprAction__differenceListener1_transitions0_actions0() {
    try {
      
      final StockListener _function = new StockListener() {
        public void stockPriceChanged(final Stock stock, final double oldPrice, final double newPrice) {
          SmartStockTest.this.setPrice2(oldPrice, newPrice);
        }
      };
      this.stock.addStockListener(_function, 10.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 10.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__differenceListener1_transitions0_actions1() {
    try {
      
      this.setPrice1(118.0d, 0.0d, 0.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(118.0d, 0.0d, 0.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__differenceListener1_transitions0_effect_state() {
    _test__differenceListener1_transitions0_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__differenceListener1_transitions0_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 118.0d failed after stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 10.0d) ,setPrice1(118.0d, 0.0d, 0.0d)", 118.0d, _price);
    
  }
  
  private void _transition_exprAction__differenceListener1_transitions1_actions0() {
    try {
      
      this.setPrice1(121.0d, 110.0d, 121.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(121.0d, 110.0d, 121.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__differenceListener1_transitions1_effect_state() {
    _test__differenceListener1_transitions1_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__differenceListener1_transitions1_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 121.0d failed after setPrice1(121.0d, 110.0d, 121.0d)", 121.0d, _price);
    
  }
  
  private void _transition_exprAction__differenceListener2_transitions0_actions0() {
    try {
      
      final StockListener _function = new StockListener() {
        public void stockPriceChanged(final Stock stock, final double oldPrice, final double newPrice) {
          SmartStockTest.this.setPrice2(oldPrice, newPrice);
        }
      };
      this.stock.addStockListener(_function, 5.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 5.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__differenceListener2_transitions0_actions1() {
    try {
      
      this.setPrice1(118.0d, 110.0d, 118.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(118.0d, 110.0d, 118.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__differenceListener2_transitions0_effect_state() {
    _test__differenceListener2_transitions0_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__differenceListener2_transitions0_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 118.0d failed after stock.addStockListener([Stock stock, double oldPrice, double newPrice | setPrice2(oldPrice, newPrice) ], 5.0d) ,setPrice1(118.0d, 110.0d, 118.0d)", 118.0d, _price);
    
  }
  
  private void _transition_exprAction__differenceListener2_transitions1_actions0() {
    try {
      
      this.setPrice1(121.0d, 110.0d, 118.0d);
      } catch (junit.framework.AssertionFailedError error) {
      fail("setPrice1(121.0d, 110.0d, 118.0d) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__differenceListener2_transitions1_effect_state() {
    _test__differenceListener2_transitions1_effect_state_objectTests0_test(stock);
    
  }
  
  private void _test__differenceListener2_transitions1_effect_state_objectTests0_test(final SmartStock it) {
    
    double _price = it.getPrice();
    assertEquals("price == 121.0d failed after setPrice1(121.0d, 110.0d, 118.0d)", 121.0d, _price);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(SmartStockTest.class);
  }
}
