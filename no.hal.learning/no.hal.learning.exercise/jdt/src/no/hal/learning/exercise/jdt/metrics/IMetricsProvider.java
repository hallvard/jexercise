package no.hal.learning.exercise.jdt.metrics;

import no.hal.learning.fv.FeatureValued;

public interface IMetricsProvider {

	public FeatureValued computeMetrics(String source);
}
