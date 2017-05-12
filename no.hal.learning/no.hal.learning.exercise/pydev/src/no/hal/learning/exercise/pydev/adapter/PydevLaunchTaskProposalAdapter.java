package no.hal.learning.exercise.pydev.adapter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.python.pydev.debug.core.Constants;

import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.pydev.PydevFactory;
import no.hal.learning.exercise.pydev.PydevLaunchAnswer;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.adapter.LaunchTaskProposalAdapter;

public class PydevLaunchTaskProposalAdapter extends LaunchTaskProposalAdapter<PydevLaunchAnswer> {

	public PydevLaunchTaskProposalAdapter(TaskProposal<PydevLaunchAnswer> proposal) {
		super(proposal);
	}

	@Override
	protected LaunchListener createLaunchListener() {
		return new PydevLaunchListener();
	}

	//

	protected class PydevLaunchListener extends LaunchListener {

		@Override
		protected boolean acceptLaunch(ILaunch launch) {
			String pydevLaunchType = Constants.ID_JYTHON_LAUNCH_CONFIGURATION_TYPE;
			try {
				String launchConfigType = launch.getLaunchConfiguration().getType().getIdentifier();
				if (! (launchConfigType.equals(pydevLaunchType) || launchConfigType.startsWith("org.python.pydev.debug."))) {
					return false;
				}
			} catch (CoreException e) {
				return false;
			}
			return super.acceptLaunch(launch);
		}
		
		@Override
		protected boolean acceptLaunch(ILaunchConfiguration launchConfig) {
			String moduleName = getProposal().getAnswer().getModuleName();
			String value = "";
			try {
				value = launchConfig.getAttribute(Constants.ATTR_LOCATION, "");
			} catch (CoreException e) {
			}
			if (! value.contains(moduleName.replace(".", "/") + ".py")) {
				return false;
			}
			return super.acceptLaunch(launchConfig);
		}

		@Override
		protected LaunchEvent createLaunchEvent() {
			return PydevFactory.eINSTANCE.createPydevLaunchEvent();
		}
	}
}
