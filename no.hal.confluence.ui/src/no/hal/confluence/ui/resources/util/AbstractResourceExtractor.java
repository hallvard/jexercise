package no.hal.confluence.ui.resources.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import no.hal.confluence.ui.Activator;
import no.hal.confluence.ui.resources.ContentRegionExtractor;
import no.hal.confluence.ui.resources.EmfsResourceClassifier;
import no.hal.confluence.ui.resources.EmfsResourceExtractor;
import no.hal.emfs.EmfsResource;

public class AbstractResourceExtractor<T> implements EmfsResourceExtractor {

	private boolean useDomAsSource = false;
	
	public AbstractResourceExtractor(boolean useDomAsSource) {
		setUseDomAsSource(useDomAsSource);
	}

	public AbstractResourceExtractor() {
		this(false);
	}
	
	@Override
	public boolean useDomAsSource() {
		return useDomAsSource;
	}

	public void setUseDomAsSource(boolean useDomAsSource) {
		this.useDomAsSource = useDomAsSource;
	}
	
	@Override
	public String toString() {
		return "AbstractEmfsResourceExtractor: " + contentRegionExtractors + " x " +  emfsResourceClassifiers;
	}
	
	private Collection<ContentRegionExtractor<T>> contentRegionExtractors = new ArrayList<ContentRegionExtractor<T>>();
	
	public void addContentRegionExtractors(ContentRegionExtractor<T>... classifiers) {
		this.contentRegionExtractors.addAll(Arrays.asList(classifiers));
	}

	public void addContentRegionExtractors(Collection<ContentRegionExtractor<T>> classifiers) {
		this.contentRegionExtractors.addAll(classifiers);
	}
	
	private Collection<EmfsResourceClassifier<T>> emfsResourceClassifiers = new ArrayList<EmfsResourceClassifier<T>>();

	public void addEmfsResourceClassifiers(EmfsResourceClassifier<T>... classifiers) {
		this.emfsResourceClassifiers.addAll(Arrays.asList(classifiers));
	}

	public void addEmfsResourceClassifiers(Collection<EmfsResourceClassifier<T>> classifiers) {
		this.emfsResourceClassifiers.addAll(classifiers);
	}

	@Override
	public boolean addResources(String s, Collection<EmfsResource> roots) {
		boolean result = false;
		for (ContentRegionExtractor<T> regionExtractor : contentRegionExtractors) {
			Collection<T> contentRegions = regionExtractor.getContentRegions(s);
			if (contentRegions != null && contentRegions.size() > 0) {
				Activator.logInfo(contentRegionExtractors + " found " + contentRegions);
				for (T region : contentRegions) {
					if (addResource(region, roots)) {
						result = true;
					}
				}
			} else {
				Activator.logInfo(contentRegionExtractors + " found no regions");
			}
		}
		return result;
	}

	protected boolean addResource(T region, Collection<EmfsResource> roots) {
		for (EmfsResourceClassifier<T> classifier : emfsResourceClassifiers) {
			if (classifier.addResource(region, roots)) {
				Activator.logInfo(classifier + " accepted " + region);
				return true;
			}
		}
		return false;
	}
}
