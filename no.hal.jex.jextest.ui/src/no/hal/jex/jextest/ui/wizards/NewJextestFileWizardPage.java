package no.hal.jex.jextest.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xactor).
 */

public class NewJextestFileWizardPage extends WizardPage {

	public static final String JEXTEST_EXTENSION = ".jextest";
	private Text containerText;
	private Text fileText;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public NewJextestFileWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Jextest File");
		setDescription("This wizard creates a new file with *" + JEXTEST_EXTENSION + " extension.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		// padding in third column
		new Label(container, SWT.NULL);

		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	public static IPath getElementPath(Object obj) {
		if (obj instanceof Resource) {
			obj = ((Resource) obj).getURI();
		}
		if (obj instanceof URI) {
			URI uri = (URI) obj;
			if (uri.isPlatformResource()) {
			}
		}
		if (obj instanceof IJavaElement) {
			IJavaElement javaElement = (IJavaElement) obj;
			if (! (javaElement instanceof IParent)) {
				javaElement = javaElement.getParent();
			}
			obj = javaElement.getPath();
		} else if (obj instanceof IResource) {
			IContainer container = (obj instanceof IContainer ? (IContainer) obj : ((IResource) obj).getParent());
			if (container != null) {
				obj = container.getFullPath();
			}
		}
		if (obj instanceof IPath) {
			return (IPath) obj;
		}
		return null;
	}

	private void initialize() {
		String fileText = "ClassUnderTest";
		if (selection != null && (! selection.isEmpty()) && selection instanceof IStructuredSelection) {
			IPath path = getElementPath(((IStructuredSelection) selection).getFirstElement());
			if (path != null) {
				String ext = path.getFileExtension();
				if (ext != null) {
					path = path.removeFileExtension();
					fileText = path.lastSegment();
					path = path.removeLastSegments(1);
				}
				containerText.setText(path.toString());
			}
		}
		if (! fileText.endsWith(JEXTEST_EXTENSION)) {
			fileText = fileText + JEXTEST_EXTENSION;
		}
		this.fileText.setText(fileText);
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String fileName = getFileName();

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int pos = fileName.lastIndexOf('.');
		if (pos >= 0 && (! fileName.substring(pos).equals(JEXTEST_EXTENSION))) {
			updateStatus("File extension must end with \"" + JEXTEST_EXTENSION + "\"");
			return;
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
}
