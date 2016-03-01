package no.hal.jex.editor.actions;

import no.hal.jex.resource.JexResource;
import no.hal.jex.views.actions.JexZipFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.FileEditorInput;

public abstract class AbstractCreateJexZipAction implements IObjectActionDelegate, IEditorActionDelegate {

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void setActiveEditor(IAction action, IEditorPart targetPart) {
		if (targetPart != null && targetPart.getEditorInput() instanceof FileEditorInput) {
			setJexFile(((FileEditorInput) targetPart.getEditorInput()).getFile()); 
		}
	}
	
	private IFile jexFile = null;
	
	public void run(IAction action) {
		JexResource res = getExerciseResource();
		if (res != null) {
			final JexZipFile zipFile = new JexZipFile(res);
			configureZipFile(zipFile);
			zipFile.addClasses(Boolean.TRUE);
			if (zipFile.prepare()) {
				Job job = new Job(zipFile.getZipUri().toString()) {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						return zipFile.create(monitor);
					}
				};
				job.setPriority(Job.SHORT);
				job.setUser(true);
				job.schedule();
			}
		}
	}

	protected abstract void configureZipFile(JexZipFile zipFile);

	private JexResource getExerciseResource() {
		if (jexFile != null) {
			String path = jexFile.getFullPath().toString();
			URI uri = URI.createPlatformResourceURI(path, false);
			return (JexResource)new ResourceSetImpl().getResource(uri, true);
		}
		return null;
	}

	protected boolean isJexFile(Object o) {
		return (o instanceof IFile && (((IFile)o).getName().endsWith("." + JexResource.JEX_EXTENSION)));
	}

	protected void setJexFile(Object o) {
		if (o instanceof IFile) {
			jexFile = (((IFile)o).getName().endsWith("." + JexResource.JEX_EXTENSION)) ? (IFile)o : null;
		}
	}
	
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			setJexFile(((IStructuredSelection)selection).getFirstElement());
		}
	}
}
