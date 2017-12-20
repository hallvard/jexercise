package no.hal.learning.exercise.jdt.adapter;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtLaunchAnswer;
import no.hal.learning.exercise.jdt.JdtLaunchEvent;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.adapter.LaunchEventsAdapter;

public class JdtLaunchEventsAdapter extends LaunchEventsAdapter<JdtLaunchAnswer> {

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, JdtLaunchAnswer.class);
	}

	//

	private String className;
	
	@Override
	protected boolean acceptLaunch(ILaunchConfiguration launchConfig) {
		String classNameAttr = IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME;
		if (! hasLaunchAttr(launchConfig, classNameAttr, null)) {
			return false;
		}
		className = getLaunchAttr(launchConfig, classNameAttr, null);
		return super.acceptLaunch(launchConfig);
	}

	@Override
	protected LaunchEvent createLaunchEvent() {
		JdtLaunchEvent launchEvent = JdtFactory.eINSTANCE.createJdtLaunchEvent();
		launchEvent.setClassName(className);
		return launchEvent;
	}
}
