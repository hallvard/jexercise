package no.hal.emf.ui.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

public class EObjectPropertyPage extends PropertyPage {

	private EObject eObject;
	private IEditingDomainProvider editingDomainProvider = null;

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public EObjectPropertyPage() {
		super();
	}

	private List<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>();
	private List<CellEditor> propertyEditors = new ArrayList<CellEditor>();
	private List<CellEditor> dirtyEditors = new ArrayList<CellEditor>();
	
	private void createSection(final Composite parent) {
		final Composite composite = createSectionComposite(parent);
		if (editingDomainProvider != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) editingDomainProvider.getEditingDomain();
			IPropertySource propertySource = new AdapterFactoryContentProvider(editingDomain.getAdapterFactory()).getPropertySource(eObject);
			EditorControlHandler handler = null;
			int descriptorCount = 0;
			for (IPropertyDescriptor propertyDescriptor : propertySource.getPropertyDescriptors()) {
				Label propertyLabel = new Label(composite, SWT.NONE);
				final CellEditor propertyEditor = propertyDescriptor.createPropertyEditor(composite);
				if (propertyEditor == null) {
					propertyLabel.dispose();
					continue;
				}
				propertyDescriptors.add(propertyDescriptor);
				propertyEditors.add(propertyEditor);
				propertyLabel.setText(propertyDescriptor.getDisplayName());
				final Control control = propertyEditor.getControl();
				control.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
				control.setVisible(true);
				final int cellEditorPos = descriptorCount;
				handler = new EditorControlHandler() {
					public void applyEditorValue() {
						if (propertyEditor.isDirty()) {
							dirtyEditors.add(propertyEditor);
						}
					}
					// default to the first cellEditor control
					private int cellEditorControlPos = 0;
					public void focusLost(FocusEvent e) {
						control.setVisible(true);
					}
					public void keyPressed(KeyEvent e) {
						if (e.keyCode == SWT.CR) {
							// select next control
							this.cellEditorControlPos = cellEditorPos + 1;
							control.getDisplay().asyncExec(this);
						} else if (e.keyCode == SWT.ESC) {
							// select no control
							this.cellEditorControlPos = -1;
							control.getDisplay().asyncExec(this);
						} 
					}
					public void run() {
						moveFocus(cellEditorControlPos);
					}
				};
				propertyEditor.addListener(handler);
				control.addFocusListener(handler);
				control.addKeyListener(handler);
				descriptorCount++;
			}
			if (handler != null) {
				// act as if we just edited the field, i.e. give focus to the first one
				composite.getDisplay().asyncExec(handler);
			}
		}
	}

	private static abstract class EditorControlHandler implements FocusListener, KeyListener, Runnable, ICellEditorListener {
		public void applyEditorValue() {}
		public void cancelEditor() {}
		public void editorValueChanged(boolean oldValidState, boolean newValidState) {}
		public void keyPressed(KeyEvent e) {}
		public void keyReleased(KeyEvent e) {}
		public void focusLost(FocusEvent e) {}
		public void focusGained(FocusEvent e) {}
		public void run() {};
	}
	
	private void moveFocus(int cellEditorPos) {
		if (cellEditorPos >= propertyEditors.size()) {
			cellEditorPos = Math.min(0, propertyEditors.size() - 1);
		}
		if (cellEditorPos < 0) {
			getApplyButton().setFocus();
		} else {
			propertyEditors.get(cellEditorPos).setFocus();
		}
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		eObject = (EObject) getElement().getAdapter(EObject.class);

		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if (part instanceof ISelectionProvider) {
			ISelection selection = ((ISelectionProvider) part).getSelection();
			if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).getFirstElement() == eObject) {
				if (part instanceof IEditingDomainProvider) {
					editingDomainProvider = (IEditingDomainProvider) part;
				}
			}
		}

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		createSection(composite);
		initPropertyValues();
		
		return composite;
	}

	private Composite createSectionComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, false, false));

		return composite;
	}

	/**
	 * @see PreferencePage#performDefaults()
	 */
	protected void performDefaults() {
		initPropertyValues();
		super.performDefaults();
	}

	private void initPropertyValues() {
		if (editingDomainProvider != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) editingDomainProvider.getEditingDomain();
			IPropertySource propertySource = new AdapterFactoryContentProvider(editingDomain.getAdapterFactory()).getPropertySource(eObject);
			for (int i = 0; i < propertyDescriptors.size(); i++) {
				IPropertyDescriptor propertyDescriptor = propertyDescriptors.get(i);
				CellEditor propertyEditor = propertyEditors.get(i);
				Object propertyValue = getPropertyValue(propertySource, propertyDescriptor);
				propertyEditor.setValue(propertyValue);
			}
		}
	}
	
	private void usePropertyValues() {
		if (editingDomainProvider != null) {
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) editingDomainProvider.getEditingDomain();
			IPropertySource propertySource = new AdapterFactoryContentProvider(editingDomain.getAdapterFactory()).getPropertySource(eObject);
			for (int i = 0; i < propertyDescriptors.size(); i++) {
				IPropertyDescriptor propertyDescriptor = propertyDescriptors.get(i);
				CellEditor propertyEditor = propertyEditors.get(i);
				if (dirtyEditors.contains(propertyEditor) && propertyEditor.isValueValid()) {
					Object oldValue = getPropertyValue(propertySource, propertyDescriptor), editorValue = propertyEditor.getValue();
					if (editorValue != oldValue && (editorValue == null || (! editorValue.equals(oldValue)))) {
						propertySource.setPropertyValue(propertyDescriptor.getId(), editorValue);
					}
					propertyEditor.deactivate();
				}
			}
		}
	}

	private Object getPropertyValue(IPropertySource propertySource,
			IPropertyDescriptor propertyDescriptor) {
		Object value = propertySource.getPropertyValue(propertyDescriptor.getId());
		if (value instanceof IItemPropertySource) {
			value = ((IItemPropertySource) value).getEditableValue(eObject);
		}
		return value;
	}

	/**
	 * @see PreferencePage#performOk()
	 */
	public boolean performOk() {
		usePropertyValues();
		return super.performOk();
	}

	/**
	 * @see PreferencePage#performCancel()
	 */
	public boolean performCancel() {
		if (editingDomainProvider != null) {
			for (int i = 0; i < propertyDescriptors.size(); i++) {
				CellEditor propertyEditor = propertyEditors.get(i);
				propertyEditor.dispose();
			}
		}
		return super.performCancel();
	}
}
