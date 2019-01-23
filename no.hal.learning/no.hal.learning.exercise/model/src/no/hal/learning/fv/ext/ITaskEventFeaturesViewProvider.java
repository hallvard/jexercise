package no.hal.learning.fv.ext;

import org.eclipse.emf.common.util.EMap;

import no.hal.learning.fv.FeatureValued;

public interface ITaskEventFeaturesViewProvider {
	public FeatureValued getFeatures(final EMap<String, FeatureValued> featuresMap);
}
