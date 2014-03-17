package patterns.observable;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	private final String ticker;
	private double price;
	private List<StockListener> listeners;
	
	public Stock(String ticker, double price) {
		checkStockPrice(price);
		this.ticker = ticker;
		this.price = price;
		listeners = new ArrayList<StockListener>();
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getTicker() {
		return this.ticker;
	}
	
	private void checkStockPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Stock price must be larger than zero");
		}
	}

	// Endringsmetoden kaller alle lytternes lyttermetode
	public void setPrice(double newPrice) {
		checkStockPrice(newPrice);
		double oldPrice = this.price;
		this.price = newPrice;
		if (this.price != oldPrice) {
			firePriceChanged(oldPrice);
		}
	}
	
	public void addStockListener(StockListener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	public void removeStockListener(StockListener listener) {
		listeners.remove(listener);
	}
	
	// helper for notifying listeners
	// protected, so it may be called by subclasses

	protected void firePriceChanged(double oldPrice) {
		for (StockListener listener : listeners) {
			listener.stockPriceChanged(this, oldPrice, this.price);
		}
	}
}
