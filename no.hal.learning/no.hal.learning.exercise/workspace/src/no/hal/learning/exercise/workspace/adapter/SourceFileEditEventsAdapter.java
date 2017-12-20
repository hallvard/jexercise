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

import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.exercise.workspace.WorkspaceFactory;

public class SourceFileEditEventsAdapter<A extends SourceFileEditAnswer, E extends SourceFileEditEvent> extends AbstractSourceFileEditEventsAdapter<A, E> implements IResourceChangeListener, IResourceDeltaVisitor {
	
	@Override
	protected void registerListeners() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_BUILD);
	}

	@Override
	protected void unregisterListeners() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, SourceFileEditAnswer.class);
	}

	//

	protected boolean acceptResourceChanged(IResource resource) {
		return resource instanceof IFile;
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
			provideTaskEvent(taskEvent);
			return false;
		} else {
			return true;
		}
	}
}
