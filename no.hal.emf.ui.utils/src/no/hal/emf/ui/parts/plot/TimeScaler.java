package no.hal.emf.ui.parts.plot;

public class TimeScaler {

	private long start;
	private float scale;
	private long gapWidth;
	private long[] gaps;
	
	public TimeScaler(EventData<?, ?> taskData, float scale) {
		this.start = taskData.minT;
		this.scale = scale;
		this.gapWidth = taskData.gapWidth;
		this.gaps = taskData.gaps;
	}

	public float getScaledInterval(long time) {
		return time * scale;
	}
	
	public long getGapWidth() {
		return gapWidth;
	}
	
	public float getTimeValue(long time) {
		int pos = 0;
		long gapDiff = 0;
		while (pos < gaps.length) {
			long start = gaps[pos], end = gaps[pos + 1];
			if (time <= start) {
				break;
			}
			long gap = end - start;
			gapDiff += gap - gapWidth;
			pos += 2;
		}
		return getScaledInterval(time - gapDiff - this.start);
	}
}
