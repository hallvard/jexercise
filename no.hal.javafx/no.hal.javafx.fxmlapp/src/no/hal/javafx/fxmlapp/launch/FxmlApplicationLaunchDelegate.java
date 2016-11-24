package no.hal.javafx.fxmlapp.launch;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

import no.hal.javafx.fxmlapp.lib.FxmlApplication;

public class FxmlApplicationLaunchDelegate extends JavaLaunchDelegate {
	
	public static final String FXML_APPLICATION_LAUNCH_CONFIGURATION_TYPE = "no.hal.javafx.fxmlapp.launch.FxmlApplication";

	public static final String FXML_ATTRIBUTE = FXML_APPLICATION_LAUNCH_CONFIGURATION_TYPE + ".fxmlArg";

	public static String getMainTypeName() {
		return FxmlApplication.class.getName();
	}

	@Override
	public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
		String programArguments = super.getProgramArguments(configuration);
		String fxmlArg = getFxmlProgramArguments(configuration);
		return (fxmlArg != null ? programArguments + " " + fxmlArg : programArguments);
	}
	
	protected String getFxmlProgramArguments(ILaunchConfiguration configuration) {
		String projectLocation = "", fxmlAttr = "";
		try {
			String projectName = configuration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "");
			projectLocation = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).getLocation().toString();
			fxmlAttr = configuration.getAttribute(FXML_ATTRIBUTE, "");
		} catch (CoreException e1) {
		}
		if (projectLocation.length() > 0 && fxmlAttr.length() > 0) {
			String separator = File.separator;
			String fxmlArg = fxmlAttr;
			if ((! fxmlAttr.startsWith(separator)) && (! projectLocation.endsWith(separator))) {
				fxmlArg = separator + fxmlArg;
			}
			return "--fxml=" + projectLocation + fxmlArg;
		}
		return null;
	}
}
