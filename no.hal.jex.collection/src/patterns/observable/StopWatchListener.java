package patterns.observable;

public interface StopWatchListener {
	int TICKED = 1, STARTED = 2, LAPPED = 4, STOPPED = 8;
	void stopWatchChanged(StopWatch stopWatch, int what);
}
