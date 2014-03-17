package patterns.observable;

import java.util.HashMap;
import java.util.Map;

public class SmartStock extends Stock {

	private Map<StockListener, double[]> intervalListeners;
	private Map<StockListener, double[]> differenceListeners;
	
	public SmartStock(String ticker, double price) {
		super(ticker, price);
		intervalListeners = new HashMap<StockListener, double[]>();
		differenceListeners = new HashMap<StockListener, double[]>();
	}
	
	public void addStockListener(StockListener listener, double min, double max) {
		// double array remembers min and max
		intervalListeners.put(listener, new double[]{min, max});
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
		for (StockListener listener : intervalListeners.keySet()) {
			double[] minMax = intervalListeners.get(listener);
			double newPrice = getPrice();
			if (newPrice < minMax[0] || newPrice > minMax[1]) {
				listener.stockPriceChanged(this, oldPrice, newPrice);
			}
		}
		for (StockListener listener : differenceListeners.keySet()) {
			double[] diffOldPrice = differenceListeners.get(listener);
			double newPrice = getPrice();
			double difference = diffOldPrice[0], lastReportedPrice = diffOldPrice[1];
			if (Math.abs(newPrice - lastReportedPrice) > difference) {
				diffOldPrice[1] = newPrice;
				listener.stockPriceChanged(this, lastReportedPrice, newPrice);
			}
		}
	}
}
