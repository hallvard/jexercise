package no.hal.confluence.ui.resources;

import java.util.Collection;

import no.hal.emfs.EmfsResource;

public interface EmfsResourceExtractor {
	public boolean useDomAsSource();
	public boolean addResources(String s, Collection<EmfsResource> roots);
}
