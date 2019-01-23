package no.hal.learning.exercise.jdt.metrics;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.ext.ITaskEventFeaturesProvider;

public class SourceEditEventMetricsProvider implements ITaskEventFeaturesProvider {

	private final IMetricsProvider metricsProvider;

	public SourceEditEventMetricsProvider(final IMetricsProvider metricsProvider) {
		this.metricsProvider = metricsProvider;
	}

	public IMetricsProvider getMetricsProvider() {
		return metricsProvider;
	}

	@Override
	public boolean supportsTaskEventType(final Class<TaskEvent> taskEventClass) {
		return AbstractStringEditEvent.class.isAssignableFrom(taskEventClass);
	}

	@Override
	public FeatureValued getFeatures(final TaskEvent taskEvent) {
		final AbstractStringEditEvent editEvent = (AbstractStringEditEvent) taskEvent;
		final FeatureValued features = getMetricsProvider().computeMetrics(editEvent.getString());
		return features;
	}
}
