package no.hal.learning.exercise.adm;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

import no.hal.learning.exercise.TaskEvent;

public abstract class AbstractTaskEventsCellLabel extends CellLabelProvider {

	protected LoggedExView loggedExView;

	public void setLoggedExView(LoggedExView loggedExView) {
		this.loggedExView = loggedExView;
	}
	
	@Override
	public void update(ViewerCell cell) {
		String s = getTaskEventsText(cell.getElement());
		cell.setText(s);
	}

	public abstract String getTaskEventsText(Object o);

	protected List<TaskEvent> getAllTaskEvents(Object o) {
		Resource resource = this.loggedExView.getMessageObject(String.valueOf(o));
		return (resource != null ? LoggedExView.getAllEObjects(resource.getAllContents(), TaskEvent.class) : null);
	}
	
	public abstract int compareTaskEventsValues(Object o1, Object o2);
	
	protected <T extends Comparable<T>> int compareValues(T v1, T v2) {
		if (v1 != null && v2 != null) {
			return -v1.compareTo(v2);
		} else if (v1 == null && v2 == null) {
			return 0;
		} else if (v1 != null) {
			return -1;
		} else if (v2 != null) {
			return 1;
		}
		return 0;
	}	
}
