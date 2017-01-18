package no.hal.javafx.fxmlapp.launch;
 
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class FxmlApplicationLaunchShortcut implements ILaunchShortcut2 {

	public static ILaunchConfigurationType getConfigurationType() {
		return getLaunchManager().getLaunchConfigurationType(FxmlApplicationLaunchDelegate.FXML_APPLICATION_LAUNCH_CONFIGURATION_TYPE);
	}

	public static ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();
	}

	protected void launch(IFile fxmlFile, String mode) {
		ILaunchConfiguration config = getLaunchConfiguration(fxmlFile, true);
		if (config != null) {
			DebugUITools.launch(config, mode);
		}	
	}

	private String getFxmlAttributeValue(IResource resource) {
		return resource.getFullPath().removeFirstSegments(1).toString();
	}

	protected ILaunchConfiguration createConfiguration(IResource fxmlFile) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(fxmlFile.getName()));
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, FxmlApplicationLaunchDelegate.getMainTypeName());
			wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, fxmlFile.getProject().getName());
			wc.setAttribute(FxmlApplicationLaunchDelegate.FXML_ATTRIBUTE, getFxmlAttributeValue(fxmlFile));
			wc.setMappedResources(new IResource[] { fxmlFile });
			config = wc.doSave();
		} catch (CoreException exception) {
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Error launching " + getConfigurationType().getName(), exception.getStatus().getMessage());
		} 
		return config;
	}

	ILaunchConfiguration getLaunchConfiguration(IFile fxmlFile, boolean create) {
		try {
			ILaunchConfiguration[] configs = getLaunchManager().getLaunchConfigurations(getConfigurationType());
			for (ILaunchConfiguration config : configs) {
				if (config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME, "").equals(FxmlApplicationLaunchDelegate.getMainTypeName()) &&
					config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "").equals(fxmlFile.getProject().getName()) &&
					config.getAttribute(FxmlApplicationLaunchDelegate.FXML_ATTRIBUTE, "").equals(getFxmlAttributeValue(fxmlFile))) {
					return config;
				}
			}
		} catch (CoreException e) {
			System.err.println("Exception getting launch configuration for " + fxmlFile + ": " + e);
		}
		return (create ? createConfiguration(fxmlFile) : null);
	}

	//

	@Override
	public void launch(ISelection selection, String mode) {
		IResource resource = getLaunchableResource(selection);
		if (resource instanceof IFile) {
			launch((IFile) resource, mode);
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		IResource resource = getLaunchableResource(editor);
		if (resource instanceof IFile) {
			launch((IFile) resource, mode);
		}		
	}

	protected ILaunchConfiguration[] getLaunchConfigurations(IResource resource) {
		ILaunchConfiguration launchConfiguration = null;
		if (resource instanceof IFile) {
			launchConfiguration = getLaunchConfiguration((IFile) resource, false);
		}
		return (launchConfiguration != null ? new ILaunchConfiguration[]{launchConfiguration} : null);
	}
	
	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		return getLaunchConfigurations(getLaunchableResource(selection));
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorPart) {
		return getLaunchConfigurations(getLaunchableResource(editorPart));
	}

	@Override
	public IResource getLaunchableResource(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object fileObject = ((IStructuredSelection) selection).getFirstElement();
			IPath path = null;
			if (fileObject instanceof IResource) {
				path = ((IResource) fileObject).getFullPath();
			} else {
				path = new Path(fileObject.toString());
			}
			if (path != null) {
				return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			}
		}
		return null;
	}

	@Override
	public IResource getLaunchableResource(IEditorPart editorPart) {
		IEditorInput editorInput = editorPart.getEditorInput();
		IResource resource = Platform.getAdapterManager().getAdapter(editorInput, IResource.class);
		if ("fxml".equals(resource.getFileExtension())) {
			return resource;
		}
		return null;
	}	
}
