package no.hal.learning.exercise.jdt.adapter;

import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.swt.widgets.Composite;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchEvent;
import no.hal.learning.exercise.views.adapters.TaskAttemptsUIAdapter;
import no.hal.learning.exercise.views.adapters.TaskProposalUIAdapter;

public class JdtLaunchTaskProposalAdapter extends TaskProposalUIAdapter<JdtLaunchAnswer> {

	public JdtLaunchTaskProposalAdapter(TaskProposal<JdtLaunchAnswer> proposal) {
		super(proposal);
	}

	@Override
	public EObjectUIAdapter<?, ?>[] createSubAdapters() {
		return new EObjectUIAdapter<?, ?>[] {
			new TaskAttemptsUIAdapter(getProposal())
		};
	}

	private LaunchListener listener;
	
	@Override
	public Composite initView(final Composite parent) {
		DebugPlugin.getDefault().getLaunchManager().addLaunchListener(listener = new LaunchListener());
		return super.initView(parent);
	}
	
	@Override
	public void dispose() {
		DebugPlugin.getDefault().getLaunchManager().removeLaunchListener(listener);
		super.dispose();
	}

	//

	protected class LaunchListener implements ILaunchListener, Runnable {
		
		private JdtLaunchEvent taskEvent;
		
		protected boolean acceptLaunch(ILaunch launch) {
			String className = getProposal().getAnswer().getClassName();
			String launchName = launch.getLaunchConfiguration().getName();
			// find base launch name
			int pos = launchName.indexOf(' ');
			if (pos < 0) {
				pos = launchName.indexOf('(');
			}
			if (pos > 0) {
				launchName = launchName.substring(0, pos);
			}
			// strip off package
			pos = className.lastIndexOf('.');
			if (pos >= 0) {
				className = className.substring(pos + 1);
			}
			if ((! isEmpty(className)) && (! launchName.equals(className))) {
				return false;
			}
			String mode = getProposal().getAnswer().getMode();
			String launchMode = launch.getLaunchMode();
			if ((! isEmpty(mode)) && (! launchMode.equals(mode))) {
				return false;
			}
			return true;
		}

		@Override
		public void launchAdded(ILaunch launch) {
			if (! acceptLaunch(launch)) {
				return;
			}
			taskEvent = JdtFactory.eINSTANCE.createJdtLaunchEvent();
			taskEvent.setTimestamp(System.currentTimeMillis());
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
			getProposal().getAttempts().add(taskEvent);
			getProposal().setCompletion(taskEvent.getCompletion());
		}
	}
}
