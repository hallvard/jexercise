package no.hal.learning.exercise.workspace.adapter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;
import no.hal.learning.exercise.workspace.LaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.WorkspaceFactory;

public class LaunchTaskProposalAdapter<T extends LaunchAnswer> extends TaskProposalUIAdapter<T> {

	public LaunchTaskProposalAdapter(TaskProposal<T> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskAttemptsUIAdapter(getProposal())
		};
	}

	private LaunchListener listener;
	
	protected LaunchTaskProposalAdapter<T>.LaunchListener createLaunchListener() {
		return new LaunchListener();
	}

	@Override
	public Composite initView(final Composite parent) {
		if (! getAdapterHelper().isReadOnly(this)) {
			DebugPlugin.getDefault().getLaunchManager().addLaunchListener(listener = createLaunchListener());
		}
		return super.initView(parent);
	}
	
	@Override
	public void dispose() {
		if (listener != null) {
			DebugPlugin.getDefault().getLaunchManager().removeLaunchListener(listener);
		}
		super.dispose();
	}

	//

	protected class LaunchListener implements ILaunchListener, Runnable {
		
		private LaunchEvent taskEvent;
		
		protected boolean hasLaunchAttr(ILaunchConfiguration launchConfig, String attrName, String attrValue, boolean isQname) {
			try {
				String value = launchConfig.getAttribute(attrName, "");
				return ! (isEmpty(value) || (! (isQname ? acceptQName(value, attrValue) : value.equals(attrValue))));
			} catch (CoreException e) {
				return false;
			}
		}

		protected boolean acceptLaunch(ILaunch launch) {
			ILaunchConfiguration launchConfig = launch.getLaunchConfiguration();			
			String mode = getProposal().getAnswer().getMode();
			String launchMode = launch.getLaunchMode();
			if (! acceptQName(mode, launchMode, true)) {
				return false;
			}
			return acceptLaunch(launchConfig);
		}

		protected boolean acceptLaunch(ILaunchConfiguration launchConfig) {
			LaunchAnswer answer = getProposal().getAnswer();
			for (int attrNum = 0; attrNum < answer.getLaunchAttrNames().size(); attrNum++) {
				String launchAttr = answer.getLaunchAttrNames().get(attrNum);
				if (! hasLaunchAttr(launchConfig, launchAttr, answer.getLaunchAttrValues().get(attrNum), false)) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void launchAdded(ILaunch launch) {
			if (! acceptLaunch(launch)) {
				return;
			}
			initTaskEvent(launch, createLaunchEvent());
		}

		protected LaunchEvent createLaunchEvent() {
			return WorkspaceFactory.eINSTANCE.createLaunchEvent();
		}
		
		protected void initTaskEvent(ILaunch launch, LaunchEvent event) {
			taskEvent = event;
			taskEvent.setTimestamp(getTimestamp());
			taskEvent.setMode(launch.getLaunchMode());
			updateProposal();
		}

		private void updateProposal() {
			asyncExec(this);
		}

		@Override
		public void launchRemoved(ILaunch launch) {
		}

		@Override
		public void launchChanged(ILaunch launch) {
		}

		@Override
		public void run() {
			getProposal().setCompletion(taskEvent.getCompletion());
			getProposal().getAttempts().add(taskEvent);
		}
	}
}
