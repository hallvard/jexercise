package patterns.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StockIndex implements StockListener{
	
	private String name;
	private List<Stock> stocks;
	private double index;

	public StockIndex(String name, Stock... stocks) {
		this.name = name;
		this.stocks = new ArrayList<Stock>(Arrays.asList(stocks));
		
		this.index = 0;
		for (Stock s : stocks) {
			s.addStockListener(this);
			this.index += s.getPrice();
		}
	}

	public String getName() {
		return this.name;
	}
	
	public double getIndex() {
		return this.index;
	}
	
	@Override
	public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {
		this.index += newPrice - oldPrice;
	}
	
	public void addStock(Stock stock) {
		if (!this.stocks.contains(stock)) {
			this.stocks.add(stock);
			stock.addStockListener(this);
			this.index += stock.getPrice();
		}
	}
	
	public void removeStock(Stock stock) {
		if (this.stocks.contains(stock)) {
			stock.removeStockListener(this);
			this.stocks.remove(stock);
			this.index -= stock.getPrice();
		}
	}
}
