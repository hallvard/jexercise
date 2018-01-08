package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskAnswer;
import no.hal.learning.exercise.workbench.PartTaskEvent;
import no.hal.learning.exercise.workbench.WorkbenchFactory;
import no.hal.learning.exercise.workbench.WorkbenchTaskEvent;

public class PartTaskEventsAdapter extends AbstractWorkbenchTaskEventAdapter<PartTaskAnswer> implements IPartListener {

	@Override
	protected void registerListeners() {
		IWorkbenchWindow activeWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWindow != null) {
			activeWindow.getPartService().addPartListener(this);
		}
	}

	@Override
	protected void unregisterListeners() {
		IWorkbenchWindow activeWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWindow != null) {
			activeWindow.getPartService().removePartListener(this);
		}
	}

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, PartTaskAnswer.class);
	}

	//

	private String getId(IWorkbenchPart part) {
		return part.getSite().getId();
	}

	protected boolean taskPerformed(IWorkbenchPart part, String action) {
		WorkbenchTaskEvent taskEvent = createWorkbenchTaskEvent();
		initTaskEvent(taskEvent, getId(part), action);
		String inputUri = null;
		if (part instanceof IEditorPart) {
			IEditorInput input = ((IEditorPart) part).getEditorInput();
			if (input instanceof IFileEditorInput) {
				inputUri = "platform:/resource" + ((IFileEditorInput) input).getFile().getFullPath();
			} else if (input instanceof IPathEditorInput) {
				inputUri = "file:" + ((IPathEditorInput) input).getPath();
			} else if (input instanceof IStorageEditorInput) {
				try {
					inputUri = ((IStorageEditorInput) input).getStorage().getFullPath().toString();
				} catch (CoreException e) {
				}
			}
			if (inputUri == null && input instanceof URIEditorInput) {
				inputUri = ((URIEditorInput) input).getURI().toString();
			}
		}
		((PartTaskEvent) taskEvent).setInputUri(inputUri);
		return provideTaskEvent(taskEvent);
	}

	@Override
	protected WorkbenchTaskEvent createWorkbenchTaskEvent() {
		return WorkbenchFactory.eINSTANCE.createPartTaskEvent();
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
		taskPerformed(part, "activated");
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		taskPerformed(part, "broughtToTop");
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		taskPerformed(part, "closed");
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		taskPerformed(part, "deactivated");
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		taskPerformed(part, "opened");
	}
}
