package no.hal.emf.ui.parts.plot;

import org.eclipse.swt.graphics.Transform;

import no.hal.emf.ui.parts.plot.PlotData.Point;

public class PlotPathProvider<E> {

	public interface Consumer<E> {
		public Point<E> consume(Point<E> point,long time, double value, float x, float y);
	}

	public Point<E> provide(Consumer<E> consumer, Iterable<PlotData.Point<E>> eventPoints, TimeScaler timeScaler, Transform transform, float minY, float maxY, float yOffset) {
		float maxValue = -1;
		for (PlotData.Point<E> eventPoint : eventPoints) {
			float y = eventPoint.value;
			maxValue = Math.max(maxValue, y);
		}
		if (maxValue < 0) {
			return null;
		}
		Point<E> lastPoint = null;
		for (PlotData.Point<E> eventPoint : eventPoints) {
			long nextTime = eventPoint.timestamp;
			float y = eventPoint.value;
			float t = timeScaler.getTimeValue(nextTime);
			float pY = maxY - (y == 0 ? y : y * (maxY - minY) / maxValue) + yOffset;
			if (transform != null) {
				float[] xy = new float[]{t, pY};
				transform.transform(xy);
				t = xy[0]; pY = xy[1];
			}
			Point<E> point = consumer.consume(eventPoint, nextTime, y, t, pY);
			if (point != null) {
				lastPoint = point;
			}
		}
		return lastPoint;
	}
}
