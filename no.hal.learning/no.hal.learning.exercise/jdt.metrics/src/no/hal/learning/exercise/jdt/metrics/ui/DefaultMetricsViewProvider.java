package no.hal.learning.exercise.jdt.metrics.ui;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;

public class DefaultMetricsViewProvider implements IMetricsViewProvider {

	private String name;
	private FeatureValued features = null;
	
	public DefaultMetricsViewProvider() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFeatures(FeatureValued fv) {
		features = fv;
	}

	@Override
	public FeatureValued getFeatures(EMap<String, FeatureValued> featuresMap) {
		TreeIterator<EObject> tree = features.eAllContents();
		while (tree.hasNext()) {
			EObject next = tree.next();
			if (next instanceof FeatureList && next.eContainer() instanceof DelegatedFeatures) {
				FeatureList fl = (FeatureList) next;
				fl.getFeatures().clear();
				FeatureValued fv = featuresMap.get(fl.getName());
				if (fv != null) {
					fl.set(fv.toFeatureList(), false);
				}
				tree.prune();
			}
		}
		return features;
	}
}
