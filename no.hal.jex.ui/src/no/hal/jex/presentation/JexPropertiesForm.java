package no.hal.jex.presentation;

import no.hal.jex.AbstractRequirement;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;

public class JexPropertiesForm implements ISelectionChangedListener {

	private JexEditor editor;
	
	private class TextFeatureEditor extends AdapterImpl
		implements SelectionListener, ModifyListener, FocusListener {
		
		private String featureName;
		
		private Composite parent;
		private Label label;
		private Button updateButton;
		private Text text;

		private IHandlerService handlerService = (IHandlerService)PlatformUI.getWorkbench().getService(IHandlerService.class);
		private IContextService contextService = (IContextService)PlatformUI.getWorkbench().getService(IContextService.class);

		private IContextActivation contextActivation;
		private IHandlerActivation[] handlerActivations;

		private IHandler handleTagCommandHandler = new AbstractHandler() {
			public Object execute(ExecutionEvent event) {
				String id = event.getCommand().getId();
				int pos = id.lastIndexOf('.');
				String tag = (pos < 0 ? id : id.substring(pos + 1));
				Text textControl = (Text)getTextControl();
				Point interval = textControl.getSelection();
				String startTag = "<" + tag + ">";
				String endTag = "</" + tag + ">";
				String insertion = textControl.getText(interval.x, interval.y - 1);
				if (insertion.startsWith(startTag)) {
					insertion = insertion.substring(startTag.length());
				} else {
					insertion = startTag + insertion;
				}
				if (insertion.endsWith(endTag)) {
					insertion = insertion.substring(0, insertion.length() - endTag.length());
				} else {
					insertion = insertion + endTag;
				}
				textControl.insert(insertion);
				modifyText(null);
				return null;
			}
		};
		
		public TextFeatureEditor(String featureName, Composite parent) {
			this.parent = parent;
			this.featureName = featureName;
		}
		public Control getLabelControl() {
			if (label == null) {
				label = new Label(parent, SWT.NONE);
				label.setLayoutData(createLabelGridData(SWT.NONE));
			}
			label.setText(Character.toUpperCase(featureName.charAt(0)) + featureName.substring(1));
			return label;
		}
		public Control getUpdateButtonControl() {
			if (updateButton == null) {
				updateButton = new Button(parent, SWT.NONE);
				updateButton.setLayoutData(createButtonGridData(SWT.NONE));
//				updateButton.setVisible(false);
				updateButton.setEnabled(false);
				updateButton.addSelectionListener(this);
			}
			updateButton.setText("Update " + featureName);
			return updateButton;
		}
		public Control getTextControl() {
			if (text == null) {
				text = new Text(parent, SWT.BORDER | SWT.MULTI | SWT.WRAP);
				text.setLayoutData(createTextGridData(SWT.NONE));
				text.addModifyListener(this);
				text.addFocusListener(this);
				((JexActionBarContributor)editor.getActionBarContributor()).registerTextControl(text);
			}
			return text;
		}

		public void widgetSelected(SelectionEvent e) {
			updateModel();
		}
		private void updateModel() {
			EStructuralFeature structuralFeature = getEStructuralFeature();
			if (getEObject() != null && structuralFeature != null) {
				String value = text.getText().trim();
				if (isChanged(value, getFeatureValue())) {
					Command command = new SetCommand(editor.getEditingDomain(), getEObject(), structuralFeature, (value != null && value.length() > 0 ? value : null));
					editor.getEditingDomain().getCommandStack().execute(command);
	//			getEObject().eSet(structuralFeature, (value != null && value.length() > 0 ? value : null));
				}
			}
		}
		private boolean isChanged(String value, Object oldValue) {
			if (value.equals(oldValue)) {
				return false;
			} else if ((value == null || value.length() == 0) &&
						(oldValue == null || (oldValue instanceof String && ((String)oldValue).length() == 0))) {
				return false;
			}
			return true;
		}
		private EStructuralFeature getEStructuralFeature() {
			return (getEObject() != null ? getEObject().eClass().getEStructuralFeature(featureName) : null);
		}
		public void widgetDefaultSelected(SelectionEvent e) {
		}
		
		private EObject getEObject() {
			return (EObject)getTarget();
		}
		
		public void updateView() {
			Object value = getFeatureValue();
			text.setText(value == null ? "" : value.toString());
		}
		private Object getFeatureValue() {
			EStructuralFeature structuralFeature = getEStructuralFeature();
			return (getEObject() != null && structuralFeature != null ? getEObject().eGet(structuralFeature) : null);
		}

		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() == getTarget() && featureName.equals(((EStructuralFeature)notification.getFeature()).getName())) {
				updateView();
			}
		}

		@Override
		public void setTarget(Notifier newTarget) {
			super.setTarget(newTarget);
			updateView();
		}
		
		public void modifyText(ModifyEvent e) {
			if (updateButton != null) {
				updateButton.setEnabled(getEStructuralFeature() != null && (isChanged(text.getText().trim(), getFeatureValue())));
			}
		}

		public void focusGained(FocusEvent e) {
			activateHandlers();
		}
		private void activateHandlers() {
			contextActivation = contextService.activateContext("no.hal.jex.editor.tagsField.context");
			handlerActivations = new IHandlerActivation[] {
					handlerService.activateHandler("no.hal.jex.editor.tagsField.b", handleTagCommandHandler),
					handlerService.activateHandler("no.hal.jex.editor.tagsField.code", handleTagCommandHandler),
			};
		}
		public void focusLost(FocusEvent e) {
			deactivateHandlers();
			updateModel();
		}
		private void deactivateHandlers() {
			contextService.deactivateContext(contextActivation);
			for (int i = 0; i < handlerActivations.length; i++) {
				handlerService.deactivateHandler(handlerActivations[i]);
			}
		}
	}
	
	private TextFeatureEditor descriptionEditor;
	private TextFeatureEditor commentEditor;
	
	private AbstractRequirement requirement;

	public void setRequirement(AbstractRequirement requirement) {
		this.requirement = requirement;
		descriptionEditor.setTarget(requirement);
		commentEditor.setTarget(requirement);
	}

	private GridData createGridData(int style) {
		return new GridData(style);
	}
	private GridData createLabelGridData(int style) {
		return createGridData(style);
	}
	private GridData createButtonGridData(int style) {
		return createGridData(style | GridData.GRAB_HORIZONTAL | SWT.RIGHT);
	}
	private GridData createTextGridData(int style) {
		GridData gridData = createGridData(style | GridData.FILL_BOTH);
		gridData.horizontalSpan = 2;
		return gridData;
	}
	
	public JexPropertiesForm(JexEditor editor, Composite parent) {
		this.editor = editor;
		createPartControl(parent);
		editor.addSelectionChangedListener(this);
	}
	
	public void selectionChanged(SelectionChangedEvent event) {
		AbstractRequirement selection = null;
		if (event.getSelection() instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection)event.getSelection()).getFirstElement();
			if (o instanceof AbstractRequirement) {
				selection = (AbstractRequirement)o;
			}
		}
		setRequirement(selection);
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		descriptionEditor = new TextFeatureEditor("description", parent);
		descriptionEditor.getLabelControl();
		descriptionEditor.getUpdateButtonControl();
		descriptionEditor.getTextControl();

		commentEditor = new TextFeatureEditor("comment", parent);
		commentEditor.getLabelControl();
		commentEditor.getUpdateButtonControl();
		commentEditor.getTextControl();
	}

	public void setFocus() {
		descriptionEditor.getTextControl().setFocus();
	}
}
