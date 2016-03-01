package no.hal.learning.exercise.views.plot;

import org.eclipse.swt.graphics.Transform;

import no.hal.learning.exercise.TaskEvent;

public interface IPlotPathProvider {

	public PlotPath computePlotPath(Iterable<TaskEvent> attempts, IEventValueProvider valueProvider, TimeScaler timeScaler, Transform transform, float minY, float maxY, float yOffset);
}
