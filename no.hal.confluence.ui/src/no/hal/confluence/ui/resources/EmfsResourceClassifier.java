package no.hal.confluence.ui.resources;

import java.util.Collection;

import no.hal.emfs.EmfsResource;

public interface EmfsResourceClassifier<T> {
	
	public boolean addResource(T region, Collection<EmfsResource> roots);
}
