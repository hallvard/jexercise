package no.hal.learning.exercise.views.stringeditors;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;
import no.hal.learning.exercise.TaskEvent;

class EditorController extends AbstractStringEditorInput implements IPartListener {

	private StringEditTaskProposal<StringEditAnswer> editTask;
	private AbstractStringEditEvent editEvent;

	private Text text;
	private FontData defaultFont = null, currentFont = null;
	private Font textFont;
	private Button syncButton;
	
	public EditorController(StringEditTaskProposal<StringEditAnswer> editTask) {
		super(new Path(editTask.getAnswer().getEditorPath()));
		this.editTask = editTask;
	}
	
	void createControls(Composite parent) {
		Composite comp = new Composite(parent, SWT.H_SCROLL);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		comp.setLayout(layout);

		Label label = new Label(comp, SWT.NONE);
		label.setText(editTask.getText());
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));

		syncButton = new Button(comp, SWT.TOGGLE);
		syncButton.setText("Show in editor");
		syncButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		syncButton.addSelectionListener(selectionListener);

		// rest
//		Composite textParent = new Composite(comp, SWT.NONE);
//		textParent.setLayout(layout);
		text = new Text(comp, SWT.READ_ONLY | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
		text.setEditable(false);
		text.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true));
		currentFont = defaultFont = text.getFont().getFontData()[0];
//		textParent.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true));
		
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addPartListener(this);
	}
	
	private SelectionListener selectionListener = new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent event) {
			if (event.widget == syncButton) {
				if (syncButton.getSelection()) {
					updateView();
				} else {
					closeEditor();					
				}
			}
		}
	};

	public void dispose() {
		if (text != null) {
			text.removeSelectionListener(selectionListener);
			if (textFont != null) {
				textFont.dispose();
			}
		}
		Composite parent = text.getParent();
		if (! parent.isDisposed()) {
			parent.dispose();
		}
		text = null;
		syncButton = null;
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().removePartListener(this);
		closeEditor();
	}
	
	protected AbstractStringEditEvent getEditEvent() {
		EList<TaskEvent> attempts = editTask.getAttempts();
		if (editEvent == null && (! attempts.isEmpty())) {
			editEvent = (AbstractStringEditEvent) attempts.get(attempts.size() - 1);
		}
		return editEvent;
	}

	public void updateView(AbstractStringEditEvent editEvent) {
		this.editEvent = editEvent;
		updateView();
	}

	private String EMPTY_EDITOR_STRING = "<empty>";

	public void updateView() {
		AbstractStringEditEvent editEvent = getEditEvent();
		syncButton.setEnabled(editEvent != null);
		this.string = (editEvent != null ? editEvent.getString() : null);
		String textString = (this.string != null ? this.string : EMPTY_EDITOR_STRING);
		text.setText(textString);
		updateTextFont(textString);
		text.getParent().layout();
		if (syncButton.getSelection()) {
			if (xeditor == null) {
				openEditor();
			} else {
				updateSourceEditor();
			}
		}
	}

	private int MIN_FONT_HEIGHT = 6;

	private void updateTextFont(String s) {
		int lineCount = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '\n') {
				lineCount++;
			}
		}
		int fontHeight = Math.max(Math.min(text.getSize().y / lineCount, defaultFont.getHeight()), MIN_FONT_HEIGHT);
		if (fontHeight != currentFont.getHeight()) {
//			System.out.println(s);
//			System.out.println("Desired font height: " + fontHeight + String.format(" Math.min(%s / %s, %s", text.getSize().y, lineCount, defaultFont.getHeight()));
			if (textFont != null) {
				textFont.dispose();
			}
			FontDescriptor fontDescriptor = FontDescriptor.createFrom(defaultFont).setHeight(fontHeight);
			textFont = fontDescriptor.createFont(text.getDisplay());
			currentFont = textFont.getFontData()[0];
			text.setFont(textFont);
		}
	}

	private String string;
	private IEditorPart xeditor;

	@Override
	public String getString() {
		return this.string != null ? this.string : "";
	}
	
	private void updateSourceEditor() {
		if (xeditor instanceof ITextEditor) {
			IDocumentProvider documentProvider = ((ITextEditor) xeditor).getDocumentProvider();
			if (documentProvider != null) {
				IDocument document = documentProvider.getDocument(this);
				document.set(getString());
			} else {
				xeditor = null;
			}
			// to avoid a dirty state
			xeditor.doSave(null);
		} else {
			closeEditor();
			openEditor();
		}
	}
	
	private void openEditor() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		Path path = new Path(editTask.getAnswer().getEditorPath());
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor("." + path.toString());
		try {
			xeditor = page.openEditor(this, desc.getId());
		} catch (PartInitException e) {
		}
	}

	private void closeEditor() {
		if (xeditor != null) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			if (page.closeEditor(xeditor, false)) {
				xeditor = null;
			}
		}
	}

	//
	
	@Override
	public void partOpened(IWorkbenchPart part) {
	}

	@Override
	public void partActivated(IWorkbenchPart part) {
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		if (part == xeditor) {
			xeditor = null;
			syncButton.setSelection(false);
		}
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}
}
