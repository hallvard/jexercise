package no.hal.learning.exercise.jdt.metrics.ui;

import org.eclipse.emf.common.util.EMap;

import no.hal.learning.fv.FeatureValued;

public interface IMetricsViewProvider {
	public FeatureValued getFeatures(EMap<String, FeatureValued> featuresMap);
}
