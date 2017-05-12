package no.hal.learning.exercise.jdt.adapter;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.adapter.LaunchTaskProposalAdapter;

public class JdtLaunchTaskProposalAdapter extends LaunchTaskProposalAdapter<JdtLaunchAnswer> {

	public JdtLaunchTaskProposalAdapter(TaskProposal<JdtLaunchAnswer> proposal) {
		super(proposal);
	}

	@Override
	protected LaunchListener createLaunchListener() {
		return new JdtLaunchListener();
	}
	
	//

	protected class JdtLaunchListener extends LaunchListener {

		@Override
		protected boolean acceptLaunch(ILaunchConfiguration launchConfig) {
			JdtLaunchAnswer answer = getProposal().getAnswer();
			if (! hasLaunchAttr(launchConfig, IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, answer.getClassName(), true)) {
				return false;
			}
			return super.acceptLaunch(launchConfig);
		}

		@Override
		protected LaunchEvent createLaunchEvent() {
			return JdtFactory.eINSTANCE.createJdtLaunchEvent();
		}
	}
}
