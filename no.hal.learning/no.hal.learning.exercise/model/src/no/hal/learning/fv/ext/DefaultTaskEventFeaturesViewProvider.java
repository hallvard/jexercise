package no.hal.learning.fv.ext;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import no.hal.learning.fv.DelegatedFeatures;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;

public class DefaultTaskEventFeaturesViewProvider implements ITaskEventFeaturesViewProvider {

	private String name;
	private FeatureValued features = null;

	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}

	public void setFeatures(final FeatureValued fv) {
		features = fv;
	}

	@Override
	public FeatureValued getFeatures(final EMap<String, FeatureValued> featuresMap) {
		final TreeIterator<EObject> tree = features.eAllContents();
		while (tree.hasNext()) {
			final EObject next = tree.next();
			if (next instanceof FeatureList && next.eContainer() instanceof DelegatedFeatures) {
				final DelegatedFeatures df = (DelegatedFeatures) next.eContainer();
				final FeatureList fl = (FeatureList) next;
				fl.getFeatures().clear();
				final FeatureValued fv = featuresMap.get(df.getName());
				if (fv != null) {
					fl.set(fv, false);
				}
				tree.prune();
			}
		}
		return features;
	}
}
