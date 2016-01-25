package objectstructures;

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
		lap();
	}
	boolean isStarted() {
		return startTime >= 0;
	}

	public void lap() {
		checkState(isStarted(), "Cannot lap a timer that's not started");
		checkState(! isStopped(), "Cannot lap a timer that's stopped");
		if (lapStartTime >= 0) {
			lapTime = ticks - lapStartTime;
		}
		lapStartTime = ticks;
	}

	void stop() {
		checkState(isStarted(), "Cannot start a timer that's not started");
		checkState(! isStopped(), "Cannot stop a timer twice");
		lap();
		stopTime = ticks;
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
}
