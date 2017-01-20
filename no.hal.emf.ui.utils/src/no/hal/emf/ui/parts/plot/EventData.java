package no.hal.emf.ui.parts.plot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class EventData<O, E> implements Comparator<E> {

	List<O> eventOwners;
	Map<O, Collection<E>> filteredEvents = null;
	List<E> allEventsSorted;
	long minT = Long.MAX_VALUE, maxT = Long.MIN_VALUE;
	long gapWidth, gaps[], gapsDiff = 0;
	
	private IEventDataProvider<O, E> eventsProvider;
	
	@Override
	public int compare(E t1, E t2) {
		long diff = eventsProvider.getTimestamp(t1) - eventsProvider.getTimestamp(t2);
		return (diff < 0 ? -1 : (diff > 0 ? 1 : 0));
	}

	EventData(Collection<O> owners, IEventDataProvider<O, E> eventsProvider) {
		this.eventOwners = new ArrayList<O>(owners);
		this.eventsProvider = eventsProvider;
		this.allEventsSorted = new ArrayList<E>();
		for (O owner : owners) {
			this.allEventsSorted.addAll(this.eventsProvider.getEvents(owner));
		}
		Collections.sort(allEventsSorted, this);
		if (allEventsSorted.size() > 0) {
			minT = eventsProvider.getTimestamp(allEventsSorted.get(0));
			maxT = eventsProvider.getTimestamp(allEventsSorted.get(allEventsSorted.size() - 1));
		}
	}

	Collection<E> getEvents(O owner) {
		Collection<E> events = (filteredEvents != null ? filteredEvents.get(owner) : null);
		return (events != null ? events : (owner != null ? eventsProvider.getEvents(owner) : null));
	}

	long getTimeSpan() {
		return Math.max(0,  maxT - minT);
	}
	
	void initGapData(int gapWidth) {
		int gapCount = 0;
		this.gapWidth = gapWidth;
		for (int i = 1; i < allEventsSorted.size(); i++) {
			long diff = eventsProvider.getTimestamp(allEventsSorted.get(i)) - eventsProvider.getTimestamp(allEventsSorted.get(i - 1));
			if (isGap(diff)) {
				gapCount++;
			}
		}
		this.gaps = new long[gapCount * 2];
		gapCount = 0;
		for (int i = 1; i < allEventsSorted.size(); i++) {
			long prevTime = eventsProvider.getTimestamp(allEventsSorted.get(i - 1));
			long nextTime = eventsProvider.getTimestamp(allEventsSorted.get(i));
			if (isGap(nextTime - prevTime)) {
				this.gaps[(gapCount * 2) + 0] = prevTime;
				this.gaps[(gapCount * 2) + 1] = nextTime;
				this.gapsDiff += (nextTime - prevTime - gapWidth);
				gapCount++;
			}
		}
	}

	protected boolean isGap(long diff) {
		return diff > this.gapWidth;
	}
	
	long getPlotWidth() {
		return getTimeSpan() - gapsDiff;
	}
}