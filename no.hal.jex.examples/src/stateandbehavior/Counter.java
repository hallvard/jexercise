package stateandbehavior;

public class Counter {
 
    // internal state
    private int counter;
    private int end;
 
    public Counter(int start, int end) {
        this.counter = start;
        this.end = end;
    }
 
    public String toString() {
        return "[Counter counter=" + counter + " end=" + end + "]";
    }
 
    public int getCounter() {
        return counter;
    }
 
    public void count(int increment) {
        if (counter < end) {
            counter += increment;
        }
    }
 
    public void count() {
        count(1);
    }
}