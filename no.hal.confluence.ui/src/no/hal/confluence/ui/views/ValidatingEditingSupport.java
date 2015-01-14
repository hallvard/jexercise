package no.hal.confluence.ui.views;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;

public abstract class ValidatingEditingSupport extends EditingSupport implements ICellEditorValidator {
	
	private TextCellEditor cellEditor;

	public ValidatingEditingSupport(ColumnViewer viewer) {
		super(viewer);
	}

	public abstract String isValid(Object value);

	private Object editingElement;
	
	public Object getEditingElement() {
		return editingElement;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		if (cellEditor == null) {
			cellEditor = new TextCellEditor((Composite) getViewer().getControl());
		}
		editingElement = element;
		cellEditor.setValidator(this);
		return cellEditor;
	}
}
