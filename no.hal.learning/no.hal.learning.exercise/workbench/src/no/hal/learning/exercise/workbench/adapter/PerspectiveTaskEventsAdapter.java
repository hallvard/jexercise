package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.workbench.PerspectiveTaskAnswer;

public class PerspectiveTaskEventsAdapter extends AbstractWorkbenchTaskEventAdapter<PerspectiveTaskAnswer> implements IPerspectiveListener {

	@Override
	protected void registerListeners() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().addPerspectiveListener(this);
	}

	@Override
	protected void unregisterListeners() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().removePerspectiveListener(this);
	}

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, PerspectiveTaskAnswer.class);
	}

	//

	private String getId(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
		return perspective.getId();
	}

	@Override
	public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
		taskPerformed(getId(page, perspective), "activated");
	}

	@Override
	public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {
		taskPerformed(getId(page, perspective), "changed");
	}
}
