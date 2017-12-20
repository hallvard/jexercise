package no.hal.learning.exercise.pydev.adapter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.python.pydev.debug.core.Constants;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.pydev.PydevFactory;
import no.hal.learning.exercise.pydev.PydevLaunchAnswer;
import no.hal.learning.exercise.pydev.PydevLaunchEvent;
import no.hal.learning.exercise.workspace.LaunchEvent;
import no.hal.learning.exercise.workspace.adapter.LaunchEventsAdapter;

public class PydevLaunchEventsAdapter extends LaunchEventsAdapter<PydevLaunchAnswer> {

	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, PydevLaunchAnswer.class);
	}

	//

	private String moduleName;

	private final static String DOT_PY_EXT = ".py";
	
	@Override
	protected boolean acceptLaunch(ILaunchConfiguration launchConfig) {
		String pydevLaunchType = Constants.ID_JYTHON_LAUNCH_CONFIGURATION_TYPE;
		try {
			String launchConfigType = launchConfig.getType().getIdentifier();
			if (! (launchConfigType.equals(pydevLaunchType) || launchConfigType.startsWith("org.python.pydev.debug."))) {
				return false;
			}
		} catch (CoreException e) {
			return false;
		}
		String moduleName = getLaunchAttr(launchConfig, Constants.ATTR_LOCATION, "");
		if (! moduleName.endsWith(DOT_PY_EXT)) {
			return false;
		}
		this.moduleName = moduleName.substring(0, moduleName.length() - DOT_PY_EXT.length()).replace('/', '.');
		return super.acceptLaunch(launchConfig);
	}

	@Override
	protected LaunchEvent createLaunchEvent() {
		PydevLaunchEvent launchEvent = PydevFactory.eINSTANCE.createPydevLaunchEvent();
		launchEvent.setModuleName(moduleName);
		return launchEvent;
	}
}
