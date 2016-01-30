package stateandbehavior;

public class StopWatch {

	int ticks = 0;

	int getTicks() {
		return ticks;
	}
	
	void tick(int milliSeconds) {
		ticks += milliSeconds;
	}
	
	int startTime = -1;
	int stopTime = -1;

	int lapStartTime = -1;
	int lapTime = -1;
	
	void start() {
		startTime = ticks;
		lap();
	}
	boolean isStarted() {
		return startTime >= 0;
	}

	void lap() {
		if (lapStartTime >= 0) {
			lapTime = ticks - lapStartTime;
		}
		lapStartTime = ticks;
	}

	void stop() {
		stopTime = ticks;
		lap();
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
