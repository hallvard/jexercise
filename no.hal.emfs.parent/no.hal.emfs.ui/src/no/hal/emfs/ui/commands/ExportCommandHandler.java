package no.hal.emfs.ui.commands;

import java.io.File;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.exporter.ExportHelper;
import no.hal.emfs.exporter.ExportSupport;
import no.hal.emfs.git.GitExportSupport;

public class ExportCommandHandler extends EmfsCommandHandler {

	@Override
	protected IContainer getTargetContainer(IFile emfsResource) {
		return emfsResource.getProject();
	}
	
	private static ExportSupport gitExportSupport = new ExportSupport() {
		
		private GitExportSupport delegate;
		
		@Override
		public File provideExport(String spec) {
			if (delegate == null) {
				delegate = new GitExportSupport();
			}
			return delegate.provideExport(spec);
		}
	};
	
	@Override
	protected void execute(IFile emfsFile, final EmfsResource emfsResource, final IContainer target) throws ExecutionException {
		final int count = ExportHelper.countEmfsResources(emfsResource);
		Job job = new Job("Import EMFS resources") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Importing " + count + " EMFS resources", count);
				try {
					ExportHelper exportHelper = new ExportHelper();
					exportHelper.exportSupport = gitExportSupport;
					exportHelper.exceptionClass = ExecutionException.class;
					exportHelper.importResources(emfsResource, target, true, monitor);
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
