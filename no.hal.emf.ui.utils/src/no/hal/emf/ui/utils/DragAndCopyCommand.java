package no.hal.emf.ui.utils;

import java.util.Collection;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.swt.dnd.DND;

public abstract class DragAndCopyCommand extends AbstractCommand implements DragAndDropFeedback {

	@Override
	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return canExecute();
	}

	@Override
	public int getFeedback() {
		return DND.FEEDBACK_EXPAND;
	}

	@Override
	public int getOperation() {
		return DND.DROP_COPY;
	}
}
