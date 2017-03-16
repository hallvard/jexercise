package no.hal.learning.exercise.adm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import no.hal.learning.exercise.util.ExerciseResourceFactoryImpl;

public class BbSubmissionsView extends ExResourcesChartView implements ITaskEventsProvider {

	private Text submissionPathText;

	protected void createPathViewerControl(final Composite composite) {
		Composite row = new Composite(composite, SWT.NONE);
		row.setLayout(new GridLayout(3, false));
		Label label = new Label(row, SWT.NONE);
		label.setText("Submissions folder");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		submissionPathText = new Text(row, SWT.BORDER);
		submissionPathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Button button = new Button(row, SWT.NONE);
		button.setText("Browse...");
		button.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(composite.getShell(), SWT.OPEN);
				String result = dialog.open();
				if (result != null) {
					submissionPathText.setText(result);
					composite.getDisplay().asyncExec(new Runnable() {
						@Override
						public void run() {
							updatePane();
						}
					});
				}
			}
		});
		row.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		super.createPathViewerControl(composite);
	}

	@Override
	protected void updatePathViewer() {
		super.updatePathViewer();
		File dir = new File(submissionPathText.getText());
		if (dir.isDirectory()) {
			readSubmissions(dir);
		}
	}

	protected void readSubmissions(File dir) {
		for (String fileName : dir.list()) {
			String[] segments = fileName.split("_");
			File submission = new File(dir, fileName);
			String exName = segments[0], userName = segments[1], subFileName = segments[segments.length - 1];
			if (subFileName.endsWith(".ex")) {
				try {
					addSubmissionResource(exName + "/" + subFileName + "/" + userName, new FileInputStream(submission));
				} catch (FileNotFoundException e) {
				}
			} else if (subFileName.endsWith(".zip")) {
				try {
					ZipFile zipFile = new ZipFile(submission);
					Enumeration<? extends ZipEntry> entries = zipFile.entries();
				    while (entries.hasMoreElements()) {
				        try {
				        	ZipEntry zipEntry = entries.nextElement();
							String entryName = zipEntry.getName();
							if (entryName.endsWith(".ex")) {
								int pos = entryName.lastIndexOf('/');
								subFileName = (pos >= 0 ? entryName.substring(pos + 1) : entryName);
								addSubmissionResource(exName + "/" + subFileName + "/" + userName, zipFile.getInputStream(zipEntry));
							}
						} catch (Exception e) {
							System.err.println("Exception when reading from " + submission + ": " + e);
						}
				    }
				    zipFile.close();
				} catch (IOException e) {
				}
			}
		}
		pathViewer.refresh();
	}

	private Resource.Factory factory = new ExerciseResourceFactoryImpl();

	protected boolean addSubmissionResource(String path, InputStream input) {
		Resource resource = null;
		try {
			resource = factory.createResource(URI.createURI(path));
			resource.load(input, null);
			pathMap.put(path, resource);
			input.close();
		} catch (IOException e) {
		}
		return resource != null && resource.getErrors().isEmpty();
	}
}
