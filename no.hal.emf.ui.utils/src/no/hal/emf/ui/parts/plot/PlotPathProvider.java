package no.hal.emf.ui.parts.plot;

import org.eclipse.swt.graphics.Transform;

public class PlotPathProvider {

	public interface Consumer {
		public void consume(long time, double value, float x, float y);
	}

	public void provide(Consumer consumer, Iterable<PlotData.Point> events, TimeScaler timeScaler, Transform transform, float minY, float maxY, float yOffset) {
		float maxValue = -1;
		for (PlotData.Point event : events) {
			float y = event.value;
			maxValue = Math.max(maxValue, y);
		}
		if (maxValue < 0) {
			return;
		}
		for (PlotData.Point event : events) {
			long nextTime = event.timestamp;
			float y = event.value;
			float t = timeScaler.getTimeValue(nextTime);
			float pY = maxY - (y == 0 ? y : y * (maxY - minY) / maxValue) + yOffset;
			if (transform != null) {
				float[] xy = new float[]{t, pY};
				transform.transform(xy);
				t = xy[0]; pY = xy[1];
			}
			consumer.consume(nextTime, y, t, pY);
		}
	}
}
