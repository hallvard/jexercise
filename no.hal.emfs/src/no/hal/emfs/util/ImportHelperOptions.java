package no.hal.emfs.util;

import java.util.Collection;
import no.hal.emfs.EmfsResource;

public class ImportHelperOptions {
	public Collection<EmfsResource> exclude = null;
	public ImportSupport importSupport;
	public boolean recurse = true;
	public boolean overwrite = false;
	public boolean ensureContainers = true;
	public Class<? extends Exception> exceptionClass;
	public boolean createEmptyFiles = false;
	public boolean createEmptyWriteable = false;
	
	public void set(ImportHelperOptions options) {
		this.exclude 		= options.exclude;
		this.importSupport 	= options.importSupport;
		this.recurse 		= options.recurse;
		this.overwrite		= options.overwrite;
		this.ensureContainers = options.ensureContainers;
		this.exceptionClass	= options.exceptionClass;
		this.createEmptyFiles = options.createEmptyFiles;
		this.createEmptyWriteable = options.createEmptyWriteable;
	}
}
