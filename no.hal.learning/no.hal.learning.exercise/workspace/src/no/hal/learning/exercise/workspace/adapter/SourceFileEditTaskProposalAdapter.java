package no.hal.learning.exercise.workspace.adapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.WorkspaceFactory;

public class SourceFileEditTaskProposalAdapter extends AbstractSourceFileEditTaskProposalAdapter<SourceFileEditAnswer> {

	public SourceFileEditTaskProposalAdapter(TaskProposal<SourceFileEditAnswer> proposal) {
		super(proposal);
	}

	private SourceFileListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			this.listener = new SourceFileListener();
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

	protected class SourceFileListener extends AbstractSourceFileListener implements IResourceChangeListener, IResourceDeltaVisitor {
		
		protected boolean acceptResourceChanged(IResource resource) {
			String resourcePath = getProposal().getAnswer().getResourcePath();
			return resource instanceof IFile && acceptPath(resourcePath, resource.getFullPath());
		}

		private boolean acceptPath(String resourcePath, IPath fullPath) {
			return fullPath.toString().equals(resourcePath);
		}

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
			if (event.getType() != IResourceChangeEvent.POST_BUILD) {
				return;
			}
			try {
				event.getDelta().accept(this);
			} catch (CoreException e) {
			}
		}

		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			if (acceptResourceChanged(delta.getResource())) {
				taskEvent = WorkspaceFactory.eINSTANCE.createSourceFileEditEvent();
				IFile file = (IFile) delta.getResource();
				initTaskEventEdit(file);
				initTaskEventCounters(file, IMarker.PROBLEM, ExerciseFactory.eINSTANCE.createMarkerInfo());
				updateProposal();
				return false;
			} else {
				return true;
			}
		}
	}
}
