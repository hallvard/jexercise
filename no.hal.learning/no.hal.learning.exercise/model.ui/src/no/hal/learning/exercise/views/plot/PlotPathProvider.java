package no.hal.learning.exercise.views.plot;

import org.eclipse.swt.graphics.Transform;

import no.hal.learning.exercise.TaskEvent;

public class PlotPathProvider implements IPlotPathProvider {

	@Override
	public PlotPath computePlotPath(Iterable<TaskEvent> attempts, IEventValueProvider valueProvider, TimeScaler timeScaler, Transform transform, float minY, float maxY, float yOffset) {
		int valueNum = 0;
		float maxValue = -1;
		for (TaskEvent event : attempts) {
			float y = valueNum;
			if (valueProvider != null) {
				try {
					y = valueProvider.getValue(event).floatValue();
				} catch (Exception e) {
				}
			}
			maxValue = Math.max(maxValue, y);
			valueNum++;
		}
		if (maxValue < 0) {
			return null;
		}
		PlotPath plotPath = new PlotPath();
		valueNum = 0;
		for (TaskEvent event : attempts) {
			long nextTime = event.getTimestamp();
			float t = timeScaler.getTimeValue(nextTime);
			float y = valueNum;
			if (valueProvider != null) {
				try {
					y = valueProvider.getValue(event).floatValue();
				} catch (Exception e) {
				}
			}
			float pY = maxY - (y == 0 ? y : y * (maxY - minY) / maxValue) + yOffset;
			if (transform != null) {
				float[] xy = new float[]{t, pY};
				transform.transform(xy);
				t = xy[0]; pY = xy[1];
			}
			plotPath.appendSegment(t, pY);
			valueNum++;
		}
		return plotPath;
	}
}
