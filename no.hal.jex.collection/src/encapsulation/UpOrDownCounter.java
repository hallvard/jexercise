package encapsulation;

/* 
 * @startuml
 * class Counter {
 *         -int counter
 *         -int end
 *         +Counter(start, end)
 *         +count()
 *         +getCounter()
 * }
 * @enduml
 */

public class UpOrDownCounter {

        private int start, end, delta;
        private int counter;

        public UpOrDownCounter(int start, int end) {
                this.start = start;
                this.end = end;
                delta = signum(start, end);
                if (delta == 0) {
                        throw new IllegalArgumentException("start and end cannot be equal");
                }
                counter = start;
        }

        private int signum(int n1, int n2) {
                if (n1 < n2) {
                        return 1;
                } else if (n2 < n1) {
                        return -1;
                } else {
                        return 0;
                }
        }
        
        public boolean count() {
                if (signum(start, end) == signum(counter, end)) {
                        counter += delta;
                }
                return signum(start, end) == signum(counter, end);
        }
        
        public int getCounter() {
                return counter;
        }
}