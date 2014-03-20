package patterns.observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartStock extends Stock {

	// illustrate the use of two different techniques for associating data to a listener
	
	// two lists, where items are associated by index/position
	private List<StockListener> intervalListeners;
	// two doubles for each listener
	private List<Double> intervals;

	// map from listener to a double array (with two values)
	private Map<StockListener, double[]> differenceListeners;
	
	public SmartStock(String ticker, double price) {
		super(ticker, price);
		intervalListeners = new ArrayList<StockListener>();
		intervals = new ArrayList<Double>();
		differenceListeners = new HashMap<StockListener, double[]>();
	}
	
	public void addStockListener(StockListener listener, double min, double max) {
		// double array remembers min and max
		intervalListeners.add(listener);
		intervals.add(min);
		intervals.add(max);
	}

	public void addStockListener(StockListener listener, double difference) {
		// double array remembers difference and last reported price (oldPrice)
		differenceListeners.put(listener, new double[]{difference, getPrice()});
	}
	
	public void removeStockListener(StockListener listener) {
		super.removeStockListener(listener);
		intervalListeners.remove(listener);
		differenceListeners.remove(listener);
	}
	
	// hjelpemetode for aa oppdatere lyttere

	protected void firePriceChanged(double oldPrice) {
		super.firePriceChanged(oldPrice);
		// handle interval listeners
		for (int i = 0; i < intervalListeners.size(); i++) {
			StockListener listener = intervalListeners.get(i);
			// use associated double values
			double min = intervals.get(i * 2), max = intervals.get(i * 2 + 1);
			double newPrice = getPrice();
			if (newPrice < min || newPrice > max) {
				listener.stockPriceChanged(this, oldPrice, newPrice);
			}
		}
		// handle difference listeners
		for (StockListener listener : differenceListeners.keySet()) {
			double[] diffOldPrice = differenceListeners.get(listener);
			double newPrice = getPrice();
			double difference = diffOldPrice[0], lastReportedPrice = diffOldPrice[1];
			if (Math.abs(newPrice - lastReportedPrice) > difference) {
				// store back the price to use as oldPrice the next time
				diffOldPrice[1] = newPrice;
				listener.stockPriceChanged(this, lastReportedPrice, newPrice);
			}
		}
	}
}
