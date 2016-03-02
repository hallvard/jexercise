package no.hal.emfs.exporter;

import java.util.Collection;
import no.hal.emfs.EmfsResource;

public class ExportHelperOptions {
	public Collection<EmfsResource> exclude = null;
	public ExportSupport exportSupport;
	public boolean recurse = true;
	public boolean overwrite = false;
	public boolean ensureContainers = true;
	public Class<? extends Exception> exceptionClass;
	public boolean createEmptyFiles = false;
	public boolean createEmptyWriteable = false;
	
	public void set(ExportHelperOptions options) {
		this.exclude 		= options.exclude;
		this.exportSupport 	= options.exportSupport;
		this.recurse 		= options.recurse;
		this.overwrite		= options.overwrite;
		this.ensureContainers = options.ensureContainers;
		this.exceptionClass	= options.exceptionClass;
		this.createEmptyFiles = options.createEmptyFiles;
		this.createEmptyWriteable = options.createEmptyWriteable;
	}
}
