package no.hal.learning.exercise.adm;

import java.util.List;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

import no.hal.learning.exercise.TaskEvent;

public abstract class AbstractTaskEventsCellLabel<V> extends CellLabelProvider {

	protected ITaskEventsProvider taskEventsProvider;

	public void setTaskEventsProvider(ITaskEventsProvider taskEventsProvider) {
		this.taskEventsProvider = taskEventsProvider;
	}

	@Override
	public void update(ViewerCell cell) {
		String s = getTaskEventsText(cell.getElement());
		cell.setText(s);
	}

	private String labelFormat = "%s";

	public String getLabelFormat() {
		return labelFormat;
	}
	
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
	}

	public abstract String getTaskEventsText(Object o);

	protected List<? extends TaskEvent> getTaskEvents(Object o) {
		return taskEventsProvider.getTaskEvents(o);
	}
	
	public abstract int compareTaskEventsValues(Object o1, Object o2);
}
