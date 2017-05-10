package no.hal.learning.exercise.workspace.adapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.WorkspaceFactory;

public class SourceFileEditTaskProposalAdapter<T extends SourceFileEditAnswer> extends AbstractSourceFileEditTaskProposalAdapter<T> {

	public SourceFileEditTaskProposalAdapter(TaskProposal<T> proposal) {
		super(proposal);
	}
	
	private SourceFileListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_BUILD);
		}
		return super.initView(parent);
	}
	
	@Override
	public void dispose() {
		if (listener != null) {
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
		}
		super.dispose();
	}
	
	//

	protected class SourceFileListener extends AbstractSourceFileListener implements IResourceChangeListener {
		
		protected boolean acceptResourceChanged(IResource resource) {
			String resourcePath = getProposal().getAnswer().getResourcePath();
			return resource instanceof IFile && acceptPath(resourcePath, resource.getFullPath());
		}

		private boolean acceptPath(String resourcePath, IPath fullPath) {
			// TODO
			return false;
		}

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if (event.getType() != IResourceChangeEvent.POST_BUILD || filePath == null) {
				return;
			}
			if (event == null || (! acceptResourceChanged(event.getResource()))) {
				return;
			}
			IFile file = (IFile) event.getResource();
			taskEvent = WorkspaceFactory.eINSTANCE.createSourceFileEditEvent();
			initTaskEventEdit(file);
			initTaskEventCounters(file, IMarker.PROBLEM, ExerciseFactory.eINSTANCE.createMarkerInfo());
			updateProposal();
		}
	}
}
