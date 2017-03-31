package no.hal.learning.exercise.adm;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import no.hal.learning.exercise.adm.bb.BbSubmissionsProcessor;

public class BbSubmissionsView extends ExResourcesChartView {

	private Text submissionPathText;

	protected void createPathViewerControl(final Composite composite) {
		Composite row = new Composite(composite, SWT.NONE);
		row.setLayout(new GridLayout(4, false));
		Label label = new Label(row, SWT.NONE);
		label.setText("Submissions");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		submissionPathText = new Text(row, SWT.BORDER);
		submissionPathText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Button dirButton = new Button(row, SWT.NONE);
		dirButton.setText("Folder...");
		dirButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		dirButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(composite.getShell(), SWT.OPEN);
				String result = dialog.open();
				if (result != null) {
					submissionPathText.setText(result);
					asyncUpdatePane();
				}
			}
		});
		Button zipButton = new Button(row, SWT.NONE);
		zipButton.setText("Zip...");
		zipButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		zipButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(composite.getShell(), SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.zip" });
				String result = dialog.open();
				if (result != null) {
					submissionPathText.setText(result);
					asyncUpdatePane();
				}
			}
		});
		row.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		super.createPathViewerControl(composite);
	}

	@Override
	protected void updatePathViewer() {
		super.updatePathViewer();
		final File file = new File(submissionPathText.getText());
		final Job job = new Job("Load " + file) {
			protected IStatus run(IProgressMonitor monitor) {
				boolean processed = processFile(file, monitor);
				return (processed ? Status.OK_STATUS : Status.CANCEL_STATUS);
			}
		};
		job.schedule();
	}
	
	protected boolean processFile(File file, final IProgressMonitor monitor) {
		if (monitor != null) {
			monitor.beginTask(file.toString(), IProgressMonitor.UNKNOWN);
		}
		BbSubmissionsProcessor bbSubmissionsProcessor = new BbSubmissionsProcessor() {
			protected boolean addSubmissionResource(SubmissionData sub, java.io.InputStream input) {
				if (monitor != null) {
					monitor.subTask(sub.toString());
				}
				boolean success = super.addSubmissionResource(sub, input);
				if (monitor != null) {
					monitor.worked(1);
				}
				return success;
			}
		};
		if (file.getName().endsWith(".zip")) {
			try {
				bbSubmissionsProcessor.readSubmissionsFromZip(file, true);
			} catch (IOException e) {
				System.err.println("Exception when reading " + file + ": " + e);
//				MessageBox errorDialog = new MessageBox(submissionPathText.getShell(), SWT.ICON_ERROR);
//				errorDialog.setMessage("Exception when reading " + file + ": " + e);
//				errorDialog.open();
			}
		} else if (file.isDirectory()) {
			bbSubmissionsProcessor.readSubmissionsFromDirectory(file, true);
		}
		for (Map.Entry<BbSubmissionsProcessor.SubmissionData, Resource> entry : bbSubmissionsProcessor
				.getSubmissions().entrySet()) {
			BbSubmissionsProcessor.SubmissionData sub = entry.getKey();
			String path = sub.exerciseName + "/" + sub.fileName + "/" + sub.userName;
			pathMap.put(path, entry.getValue());
		}
		if (monitor != null) {
			monitor.done();
		}
		asyncRefreshViewer();
		return true;
	}
}
