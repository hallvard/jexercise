package objectstructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StopWatchManager {

	private Map<String, StopWatch> stopWatches = new HashMap<String, StopWatch>();
	
	public StopWatch newStopWatch(String name) {
		StopWatch stopWatch = new StopWatch();
		stopWatches.put(name, stopWatch);
		return stopWatch;
	}

	public void removeStopWatch(String name) {
		stopWatches.remove(name);
	}
	
	public void tick(int milliSeconds) {
		if (milliSeconds < 0) {
			throw new IllegalArgumentException("Time cannot go backwards");
		}
		for (StopWatch stopWatch : stopWatches.values()) {
			stopWatch.tick(milliSeconds);
		}
	}

	private StopWatch getStopWatch(String name, boolean throwException) {
		StopWatch stopWatch = stopWatches.get(name);
		if (throwException && stopWatch == null) {
			throw new IllegalArgumentException("No stop watch for " + name);
		}
		return stopWatch;
	}

	public StopWatch getStopWatch(String name) {
		return getStopWatch(name, false);
	}
	
	private Collection<StopWatch> getWatches(Boolean started, Boolean stopped) {
		Collection<StopWatch> result = new ArrayList<StopWatch>();
		for (StopWatch stopWatch : stopWatches.values()) {
			if ((started == null || stopWatch.isStarted() == started) &&
				(stopped == null || stopWatch.isStopped() == stopped))	{
				result.add(stopWatch);
			}
		}
		return result;
	}

	public Collection<StopWatch> getAllWatches() {
		return getWatches(null, null);
	}
	
	public Collection<StopWatch> getStartedWatches() {
		return getWatches(true, null);
	}
	
	public Collection<StopWatch> getStoppedWatches() {
		return getWatches(null, true);
	}
}
