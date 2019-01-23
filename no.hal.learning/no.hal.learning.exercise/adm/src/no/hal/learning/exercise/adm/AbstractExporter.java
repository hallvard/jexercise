package no.hal.learning.exercise.adm;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;

public abstract class AbstractExporter implements Runnable {

	protected String csvSeparator = ";";

	private Collection<Resource> resources;

	public void setResources(final Collection<Resource> resources) {
		this.resources = resources;
	}

	@Override
	public void run() {
		export(resources);
	}

	public abstract void export(Collection<Resource> resources);
}
