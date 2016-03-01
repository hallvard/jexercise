package no.hal.emf.ui.utils;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

public class DelegatingCellLabelProvider extends CellLabelProvider {

	private final ILabelProvider labelProvider;
	
	public DelegatingCellLabelProvider(ILabelProvider labelProvider) {
		super();
		this.labelProvider = labelProvider;
	}

	@Override
	public void update(ViewerCell cell) {
		cell.setText(labelProvider.getText(cell.getElement()));
		cell.setImage(labelProvider.getImage(cell.getElement()));
	}
}
