package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.workbench.BrowserEventAnswer;
import no.hal.learning.exercise.workbench.PartTaskAnswer;

public class BrowserEventsAdapter extends AbstractWorkbenchTaskEventAdapter<BrowserEventAnswer> implements IPartListener, LocationListener {

	@Override
	protected void registerListeners() {
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService().addPartListener(this);
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

	private String getId(LocationEvent event) {
		return event.location;
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		// check if part instanceof Web viewer and attach listener
	}
	
	@Override
	public void partActivated(IWorkbenchPart part) {
	}
	
	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}
	
	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}
	
	@Override
	public void partClosed(IWorkbenchPart part) {
		// check if part instanceof Web viewer and dis-attach listener
	}

	@Override
	public void changing(LocationEvent event) {
	}

	@Override
	public void changed(LocationEvent event) {
		taskPerformed(getId(event), "changed");
	}
}
