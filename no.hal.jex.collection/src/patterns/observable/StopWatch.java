package patterns.observable;

import java.util.ArrayList;
import java.util.Collection;

public class StopWatch {

	private int ticks = 0;

	public int getTicks() {
		return ticks;
	}
	
	public void tick(int milliSeconds) {
		if (milliSeconds < 0) {
			throw new IllegalArgumentException("Time cannot go backwards");
		}
		ticks += milliSeconds;
		fireStopWatchChanged(StopWatchListener.TICKED);
	}
	
	private int startTime = -1;
	private int stopTime = -1;

	private int lapStartTime = -1;
	private int lapTime = -1;
	
	private void checkState(boolean state, String message) {
		if (! state) {
			throw new IllegalStateException(message);
		}		
	}
	
	public void start() {
		checkState(! isStarted(), "Cannot start a timer that's already started");
		startTime = ticks;
		lap(false);
		fireStopWatchChanged(StopWatchListener.STARTED);
	}
	boolean isStarted() {
		return startTime >= 0;
	}

	private void lap(boolean fire) {
		checkState(isStarted(), "Cannot lap a timer that's not started");
		checkState(! isStopped(), "Cannot lap a timer that's stopped");
		if (lapStartTime >= 0) {
			lapTime = ticks - lapStartTime;
		}
		lapStartTime = ticks;
		if (fire) {
			fireStopWatchChanged(StopWatchListener.LAPPED);
		}
	}

	public void lap() {
		lap(true);
	}

	void stop() {
		checkState(isStarted(), "Cannot start a timer that's not started");
		checkState(! isStopped(), "Cannot stop a timer twice");
		lap(false);
		stopTime = ticks;
		fireStopWatchChanged(StopWatchListener.STOPPED);
	}
	boolean isStopped() {
		return stopTime >= 0;
	}

	int getTime() {
		if (isStopped()) {
			return stopTime - startTime;
		} else if (isStarted()) {
			return ticks - startTime;
		} else {
			return -1;
		}
	}

	int getLapTime() {
		if (lapStartTime >= 0) {
			return ticks - lapStartTime;
		} else {
			return -1;
		}
	}

	int getLastLapTime() {
		return lapTime;
	}
	
	//
	
	Collection<StopWatchListener> listeners = new ArrayList<StopWatchListener>();
	
	public void addStopWatchListener(StopWatchListener listener) {
		if (! listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeStopWatchListener(StopWatchListener listener) {
		listeners.remove(listener);
	}

	protected void fireStopWatchChanged(int what) {
		for (StopWatchListener listener : listeners) {
			listener.stopWatchChanged(this, what);
		}
	}
}
