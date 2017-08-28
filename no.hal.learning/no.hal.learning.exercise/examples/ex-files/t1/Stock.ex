<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:exercise="platform:/plugin/no.hal.learning.exercise.model/model/exercise.ecore" xmlns:jdt="platform:/plugin/no.hal.learning.exercise.jdt/model/jdt-exercise.ecore" xmlns:junit="platform:/plugin/no.hal.learning.exercise.junit/model/junit-exercise.ecore" xmlns:workbench="platform:/plugin/no.hal.learning.exercise.workbench/model/workbench-exercise.ecore">
  <exercise:Exercise>
    <parts xsi:type="exercise:ExercisePart" title="Stock">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the Stock class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.Stock"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="StockListener">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StockListener interface."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.StockListener"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the Stock JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.StockTest"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="StockIndex">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Write source code for the StockIndex class."/>
        <a xsi:type="jdt:JdtSourceEditAnswer" className="patterns.observable.StockIndex"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run the StockIndex JUnit test."/>
        <a xsi:type="junit:JunitTestAnswer" testRunName="patterns.observable.StockIndexTest"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Run The Stock class."/>
        <a xsi:type="jdt:JdtLaunchAnswer" className="patterns.observable.Stock"/>
      </tasks>
    </parts>
    <parts xsi:type="exercise:ExercisePart" title="Tool usage">
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use breakpoints to debug code."/>
        <a xsi:type="workbench:DebugEventAnswer" action="suspend.breakpoint"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Over"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepOver" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the debug command Step Into"/>
        <a xsi:type="workbench:CommandExecutionAnswer" elementId="org.eclipse.debug.ui.commands.StepInto" action="executeSuccess"/>
      </tasks>
      <tasks xsi:type="exercise:Task">
        <q xsi:type="exercise:StringQuestion" question="Use the Variables view"/>
        <a xsi:type="workbench:PartTaskAnswer" elementId="org.eclipse.debug.ui.VariableView" action="activated"/>
      </tasks>
    </parts>
  </exercise:Exercise>
  <exercise:ExerciseProposals exercise="/0">
    <proposals exercisePart="/0/@parts.0">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.0/@tasks.0/@q" answer="/0/@parts.0/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457603989603" sizeMeasure="54">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class Stock implements StockListener {&#xA;&#x9;&#xA;&#x9;private String ticker;&#xA;&#x9;private double price;&#xA;&#x9;Collection&lt;StockListener> stockListener = new ArrayList&lt;StockListener>();&#xA;&#x9;&#xA;&#x9;public Stock(String ticker, double price){&#xA;&#x9;&#x9;this.ticker = ticker;&#xA;&#x9;&#x9;this.price = price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setPrice(double price) {&#xA;&#x9;&#x9;if(price &lt;= 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The price must not be null or negative.&quot;);&#xA;&#x9;&#x9;} else {&#xA;&#x9;&#x9;&#x9;for(StockListener listener : stockListener){&#xA;&#x9;&#x9;&#x9;&#x9;listener.stockPriceChanged(this, this.price, price);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;this.price = price;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getPrice() {&#xA;&#x9;&#x9;return price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String getTicker() {&#xA;&#x9;&#x9;return ticker;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStockListener(StockListener listener){&#xA;&#x9;&#x9;if(!stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.add(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;public void removeStockListener(StockListener listener){&#xA;&#x9;&#x9;if(stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.remove(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;if(stock.getPrice() == oldPrice){&#xA;&#x9;&#x9;&#x9;stock.setPrice(newPrice);&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604002843" sizeMeasure="54">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class Stock implements StockListener {&#xA;&#x9;&#xA;&#x9;private String ticker;&#xA;&#x9;private double price;&#xA;&#x9;Collection&lt;StockListener> stockListener = new ArrayList&lt;StockListener>();&#xA;&#x9;&#xA;&#x9;public Stock(String ticker, double price){&#xA;&#x9;&#x9;this.ticker = ticker;&#xA;&#x9;&#x9;this.price = price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setPrice(double price) {&#xA;&#x9;&#x9;if(price &lt;= 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The price must not be null or negative.&quot;);&#xA;&#x9;&#x9;} else {&#xA;&#x9;&#x9;&#x9;for(StockListener listener : stockListener){&#xA;&#x9;&#x9;&#x9;&#x9;listener.stockPriceChanged(this, this.price, price);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;this.price = price;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getPrice() {&#xA;&#x9;&#x9;return price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String getTicker() {&#xA;&#x9;&#x9;return ticker;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStockListener(StockListener listener){&#xA;&#x9;&#x9;if(!stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.add(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;public void removeStockListener(StockListener listener){&#xA;&#x9;&#x9;if(stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.remove(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;if(stock.getPrice() == oldPrice){&#xA;&#x9;&#x9;&#x9;stock.setPrice(newPrice);&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604010472" sizeMeasure="54">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class Stock implements StockListener {&#xA;&#x9;&#xA;&#x9;private String ticker;&#xA;&#x9;private double price;&#xA;&#x9;Collection&lt;StockListener> stockListener = new ArrayList&lt;StockListener>();&#xA;&#x9;&#xA;&#x9;public Stock(String ticker, double price){&#xA;&#x9;&#x9;this.ticker = ticker;&#xA;&#x9;&#x9;this.price = price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setPrice(double price) {&#xA;&#x9;&#x9;if(price &lt;= 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The price must not be null or negative.&quot;);&#xA;&#x9;&#x9;} else {&#xA;&#x9;&#x9;&#x9;for(StockListener listener : stockListener){&#xA;&#x9;&#x9;&#x9;&#x9;listener.stockPriceChanged(this, this.price, price);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;this.price = price;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getPrice() {&#xA;&#x9;&#x9;return price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String getTicker() {&#xA;&#x9;&#x9;return ticker;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStockListener(StockListener listener){&#xA;&#x9;&#x9;if(!stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.add(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;public void removeStockListener(StockListener listener){&#xA;&#x9;&#x9;if(stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.remove(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;if(stock.getPrice() == oldPrice){&#xA;&#x9;&#x9;&#x9;stock.setPrice(newPrice);&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604019439" sizeMeasure="54">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class Stock implements StockListener {&#xA;&#x9;&#xA;&#x9;private String ticker;&#xA;&#x9;private double price;&#xA;&#x9;Collection&lt;StockListener> stockListener = new ArrayList&lt;StockListener>();&#xA;&#x9;&#xA;&#x9;public Stock(String ticker, double price){&#xA;&#x9;&#x9;this.ticker = ticker;&#xA;&#x9;&#x9;this.price = price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void setPrice(double price) {&#xA;&#x9;&#x9;if(price &lt;= 0) {&#xA;&#x9;&#x9;&#x9;throw new IllegalArgumentException(&quot;The price must not be null or negative.&quot;);&#xA;&#x9;&#x9;} else {&#xA;&#x9;&#x9;&#x9;for(StockListener listener : stockListener){&#xA;&#x9;&#x9;&#x9;&#x9;listener.stockPriceChanged(this, this.price, price);&#xA;&#x9;&#x9;&#x9;}&#xA;&#x9;&#x9;&#x9;this.price = price;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public double getPrice() {&#xA;&#x9;&#x9;return price;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public String getTicker() {&#xA;&#x9;&#x9;return ticker;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStockListener(StockListener listener){&#xA;&#x9;&#x9;if(!stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.add(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;public void removeStockListener(StockListener listener){&#xA;&#x9;&#x9;if(stockListener.contains(listener)){&#xA;&#x9;&#x9;&#x9;stockListener.remove(listener);&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;if(stock.getPrice() == oldPrice){&#xA;&#x9;&#x9;&#x9;stock.setPrice(newPrice);&#x9;&#x9;&#x9;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;}&#xA;"/>
        </attempts>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.1">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.1/@tasks.0/@q" answer="/0/@parts.1/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604400127" sizeMeasure="6">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;public interface StockListener {&#xA;&#x9;&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice);&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604402846" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;public interface StockListener {&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice);&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.1/@tasks.1/@q" answer="/0/@parts.1/@tasks.1/@a" completion="1.0">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457603979721" completion="1.0" successCount="2"/>
      </proposals>
    </proposals>
    <proposals exercisePart="/0/@parts.2">
      <proposals xsi:type="jdt:JdtSourceEditProposal" question="/0/@parts.2/@tasks.0/@q" answer="/0/@parts.2/@tasks.0/@a">
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604181231" sizeMeasure="5">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;public class StockIndex {&#xA;&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604390458" sizeMeasure="24">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class StockIndex implements StockListener{&#xA;&#xA;&#x9;Collection&lt;Stock> stockList = new ArrayList&lt;Stock>();&#xA;&#x9;public StockIndex(String name, Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStock(Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void removeStock(Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604774418" sizeMeasure="28">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class StockIndex implements StockListener{&#xA;&#xA;&#x9;private double index;&#xA;&#x9;Collection&lt;Stock> stockList = new ArrayList&lt;Stock>();&#xA;&#x9;public StockIndex(String name, Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStock(Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void removeStock(Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;public double getIndex(){&#xA;&#x9;&#x9;return index;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457604780241" sizeMeasure="29">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class StockIndex implements StockListener{&#xA;&#xA;&#x9;private double index;&#xA;&#x9;Collection&lt;Stock> stockList = new ArrayList&lt;Stock>();&#xA;&#x9;&#xA;&#x9;public StockIndex(String name, Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStock(Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void removeStock(Stock stock){&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;public double getIndex(){&#xA;&#x9;&#x9;return index;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457628056789" sizeMeasure="47">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class StockIndex implements StockListener{&#xA;&#xA;&#x9;private double index;&#xA;&#x9;Collection&lt;Stock> stockList = new ArrayList&lt;Stock>();&#xA;&#x9;&#xA;&#x9;public StockIndex(String ticker, Stock ... stocks){&#xA;&#x9;&#x9;if(stocks == null) {&#xA;&#x9;&#x9;&#x9;index = 0;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;for(Stock stock : stocks) {&#xA;&#x9;&#x9;&#x9;stockList.add(stock);&#xA;&#x9;&#x9;&#x9;index += stock.getPrice();&#xA;&#x9;&#x9;&#x9;stock.addStockListener(this);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStock(Stock stock){&#xA;&#x9;&#x9;if(! stockList.contains(stock)){&#xA;&#x9;&#x9;&#x9;stockList.add(stock);&#xA;&#x9;&#x9;&#x9;index += stock.getPrice();&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void removeStock(Stock stock){&#xA;&#x9;&#x9;if(stockList.contains(stock)){&#xA;&#x9;&#x9;&#x9;stockList.remove(stock);&#xA;&#x9;&#x9;&#x9;index -= stock.getPrice();&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;public double getIndex(){&#xA;&#x9;&#x9;return index;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;if(stockList.contains(stock) &amp;&amp; stock.getPrice() == oldPrice) {&#xA;&#x9;&#x9;&#x9;index -= oldPrice;&#xA;&#x9;&#x9;&#x9;index += newPrice;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
        <attempts xsi:type="jdt:JdtSourceEditEvent" timestamp="1457628198312" sizeMeasure="46">
          <edit xsi:type="exercise:StringEdit" storedString="package patterns.observable;&#xA;&#xA;import java.util.ArrayList;&#xA;import java.util.Collection;&#xA;&#xA;public class StockIndex implements StockListener{&#xA;&#xA;&#x9;private double index;&#xA;&#x9;Collection&lt;Stock> stockList = new ArrayList&lt;Stock>();&#xA;&#x9;&#xA;&#x9;public StockIndex(String ticker, Stock ... stocks){&#xA;&#x9;&#x9;if(stocks == null) {&#xA;&#x9;&#x9;&#x9;index = 0;&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;for(Stock stock : stocks) {&#xA;&#x9;&#x9;&#x9;stockList.add(stock);&#xA;&#x9;&#x9;&#x9;index += stock.getPrice();&#xA;&#x9;&#x9;&#x9;stock.addStockListener(this);&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#xA;&#x9;public void addStock(Stock stock){&#xA;&#x9;&#x9;if(! stockList.contains(stock)){&#xA;&#x9;&#x9;&#x9;stockList.add(stock);&#xA;&#x9;&#x9;&#x9;index += stock.getPrice();&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;&#x9;&#xA;&#x9;public void removeStock(Stock stock){&#xA;&#x9;&#x9;if(stockList.contains(stock)){&#xA;&#x9;&#x9;&#x9;stockList.remove(stock);&#xA;&#x9;&#x9;&#x9;index -= stock.getPrice();&#xA;&#x9;&#x9;}&#xA;&#x9;&#x9;&#xA;&#x9;}&#xA;&#x9;public double getIndex(){&#xA;&#x9;&#x9;return index;&#xA;&#x9;}&#xA;&#x9;@Override&#xA;&#x9;public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {&#xA;&#x9;&#x9;if(stockList.contains(stock) &amp;&amp; stock.getPrice() == oldPrice) {&#xA;&#x9;&#x9;&#x9;index += newPrice - oldPrice;&#xA;&#x9;&#x9;}&#xA;&#x9;}&#xA;}&#xA;"/>
        </attempts>
      </proposals>
      <proposals xsi:type="junit:JunitTestProposal" question="/0/@parts.2/@tasks.1/@q" answer="/0/@parts.2/@tasks.1/@a" completion="0.9">
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457627957859" completion="1.0" successCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457627963638" completion="1.0" successCount="2"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457627965652" completion="1.0" successCount="3"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457627966997" completion="0.75" successCount="3" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457628057055" completion="0.8" successCount="4" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457628057979" completion="0.8333333333333334" successCount="5" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457628058887" completion="0.8571428571428571" successCount="6" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457628059736" completion="0.875" successCount="7" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457628198598" completion="0.8888888888888888" successCount="8" failureCount="1"/>
        <attempts xsi:type="junit:JunitTestEvent" timestamp="1457628200007" completion="0.9" successCount="9" failureCount="1"/>
      </proposals>
      <proposals xsi:type="jdt:JdtLaunchProposal" question="/0/@parts.2/@tasks.2/@q" answer="/0/@parts.2/@tasks.2/@a"/>
    </proposals>
    <proposals exercisePart="/0/@parts.3">
      <proposals xsi:type="workbench:DebugEventProposal" question="/0/@parts.3/@tasks.0/@q" answer="/0/@parts.3/@tasks.0/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.3/@tasks.1/@q" answer="/0/@parts.3/@tasks.1/@a"/>
      <proposals xsi:type="workbench:CommandExecutionProposal" question="/0/@parts.3/@tasks.2/@q" answer="/0/@parts.3/@tasks.2/@a"/>
      <proposals xsi:type="workbench:PartTaskProposal" question="/0/@parts.3/@tasks.3/@q" answer="/0/@parts.3/@tasks.3/@a"/>
    </proposals>
  </exercise:ExerciseProposals>
</xmi:XMI>
