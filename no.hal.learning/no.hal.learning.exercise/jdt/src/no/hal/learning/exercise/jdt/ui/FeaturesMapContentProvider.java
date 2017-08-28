package no.hal.learning.exercise.jdt.ui;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.jface.viewers.ITreeContentProvider;

import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FeatureValued;

public class FeaturesMapContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Map<?, ?>) {
			return ((Map<?, ?>) inputElement).entrySet().toArray();
		} else if (inputElement instanceof EMap<?, ?>) {
			return ((EMap<?, ?>) inputElement).entrySet().toArray();
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Map.Entry<?, ?>) {
			parentElement = ((Map.Entry<?, ?>) parentElement).getValue();
		}
		List<Entry<String,Double>> entries = null;
		if (parentElement instanceof FeatureList) {
			entries = new ArrayList<Map.Entry<String,Double>>(((FeatureList) parentElement).getFeatures().entrySet());
		} else if (parentElement instanceof FeatureValued) {
			entries = new ArrayList<Map.Entry<String,Double>>();
			FeatureValued fv = (FeatureValued) parentElement;
			for (String featureName : fv.getFeatureNames()) {
				entries.add(new AbstractMap.SimpleEntry<String, Double>(featureName, fv.getFeatureValue(featureName)));
			}
		}
		if (entries != null) {
			Collections.sort(entries, new Comparator<Map.Entry<String,Double>>() {
				@Override
				public int compare(Map.Entry<String,Double> entry1, Map.Entry<String,Double> entry2) {
					return entry1.getKey().compareTo(entry2.getKey());
				}
			});
			return entries.toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof Map.Entry<?, ?>) {
			element = ((Map.Entry<?, ?>) element).getValue();
		}
		return (element instanceof FeatureValued);
	}
}
