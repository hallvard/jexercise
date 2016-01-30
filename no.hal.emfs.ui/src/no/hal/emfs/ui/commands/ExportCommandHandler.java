package no.hal.emfs.ui.commands;

import java.io.File;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.git.GitImportSupport;
import no.hal.emfs.util.ImportHelper;
import no.hal.emfs.util.ImportSupport;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class ImportCommandHandler extends EmfsCommandHandler {

	@Override
	protected IContainer getTargetContainer(IFile emfsResource) {
		return emfsResource.getProject();
	}
	
	private static ImportSupport gitImportSupport = new ImportSupport() {
		private GitImportSupport delegate;
		@Override
		public File provideImport(String spec) {
			return delegate.provideImport(spec);
		}
	};
	
	@Override
	protected void execute(IFile emfsFile, final EmfsResource emfsResource, final IContainer target) throws ExecutionException {
		final int count = ImportHelper.countEmfsResources(emfsResource);
		Job job = new Job("Import EMFS resources") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Importing " + count + " EMFS resources", count);
				try {
					ImportHelper importHelper = new ImportHelper();
					importHelper.importSupport = gitImportSupport;
					importHelper.exceptionClass = ExecutionException.class;
					importHelper.importResources(emfsResource, target, true, monitor);
				} catch (Exception e) {
					if (monitor != null) {
						monitor.done();
					}
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
}
