package no.hal.learning.exercise.pydev.adapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.MarkerInfo;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.pydev.PydevFactory;
import no.hal.learning.exercise.pydev.PydevMarkerInfo;
import no.hal.learning.exercise.pydev.PydevSourceEditAnswer;
import no.hal.learning.exercise.workspace.adapter.AbstractSourceFileEditTaskProposalAdapter;

public class PydevSourceEditTaskProposalAdapter extends AbstractSourceFileEditTaskProposalAdapter<PydevSourceEditAnswer> {

	public PydevSourceEditTaskProposalAdapter(TaskProposal<PydevSourceEditAnswer> proposal) {
		super(proposal);
	}
	
	private PydevListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			this.listener = new PydevListener();
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

	@Override
	protected void setMarkerInfo(MarkerInfo markerInfo, IMarker marker) {
		super.setMarkerInfo(markerInfo, marker);
		if (markerInfo instanceof PydevMarkerInfo) {
			PydevMarkerInfo pydevMarkerInfo = (PydevMarkerInfo) markerInfo;
		}
	}

	protected class PydevListener extends AbstractSourceFileListener implements IResourceChangeListener, IResourceDeltaVisitor {
		
		private boolean acceptChangedResource(IResource resource) {
			String pydevModule = getProposal().getAnswer().getModuleName();
			String resourcePath = resource.getFullPath().toString();
			return resource instanceof IFile && resourcePath.endsWith(pydevModule.replace(".", "/") + ".py");
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
			if (acceptChangedResource(delta.getResource())) {
				taskEvent = PydevFactory.eINSTANCE.createPydevSourceEditEvent();
				IFile file = (IFile) delta.getResource();
				initTaskEventEdit(file);
				initTaskEventCounters(file, IMarker.PROBLEM, PydevFactory.eINSTANCE.createPydevMarkerInfo());
				updateProposal();
				return false;
			} else {
				return true;
			}
		}
	}
}
