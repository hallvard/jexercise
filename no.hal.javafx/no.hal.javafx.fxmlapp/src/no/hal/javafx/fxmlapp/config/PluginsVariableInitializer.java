package no.hal.javafx.fxmlapp.config;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathVariableInitializer;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class PluginsVariableInitializer extends ClasspathVariableInitializer {


	@Override
	public void initialize(String variable) {
		if ("PLUGINS".equals(variable)) {
			String var = tryBundleLocation("no.hal.javafx.fxmlapp.lib");
			if (var == null) {
				var = tryBundleLocation("org.eclipse.jdt.core");
			}
			if (var != null) {
				try {
					JavaCore.setClasspathVariable(variable, new Path(var), new NullProgressMonitor());
				} catch (JavaModelException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private String tryBundleLocation(String bundleId) {
		try {
			String resolved = FileLocator.resolve(new URL("platform:/plugin/" + bundleId)).toString(), var = null;
			if (resolved.startsWith("jar:")) {
				resolved = resolved.substring(4, resolved.lastIndexOf('!'));
			}
			if (resolved.startsWith("file:")) {
				resolved = resolved.substring(5);
				if (resolved.endsWith(".jar")) {
					var = resolved.substring(0, resolved.lastIndexOf('/'));
				} else if (resolved.endsWith("/")) {
					var = resolved.substring(0, resolved.lastIndexOf('/', resolved.length() - 2));
				}
			}
			return var;
		} catch (Exception e) {
			return null;
		}
	}
}
