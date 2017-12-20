package no.hal.learning.exercise.workbench.adapter;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.jdt.debug.core.IJavaStackFrame;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.workbench.DebugEventAnswer;

public class DebugEventsAdapter extends AbstractWorkbenchTaskEventAdapter<DebugEventAnswer> implements IDebugEventSetListener {

	@Override
	protected void registerListeners() {
		DebugPlugin plugin = DebugPlugin.getDefault();
		if (plugin != null) {
			plugin.addDebugEventListener(this);
		}
	}

	@Override
	protected void unregisterListeners() {
		DebugPlugin plugin = DebugPlugin.getDefault();
		if (plugin != null) {
			plugin.removeDebugEventListener(this);
		}
	}
	
	@Override
	public boolean supportsTaskAnswer(TaskAnswer type) {
		return supportsTaskAnswer(type, DebugEventAnswer.class);
	}

	//

	@Override
	public void handleDebugEvents(DebugEvent[] events) {
		String action = null, detail = null;
		for (int i = 0; i < events.length; i++) {
			DebugEvent event = events[i];
			switch (event.getKind()) {
			case DebugEvent.CREATE: 	action = "create"; break;
			case DebugEvent.CHANGE: 	action = "change"; break;
			case DebugEvent.TERMINATE:	action = "terminate"; break;
			case DebugEvent.RESUME: 	action = "resume"; break;
			case DebugEvent.SUSPEND: 	action = "suspend"; break;
			}
			switch (event.getDetail()) {
			case DebugEvent.STEP_INTO: 		detail = "stepInto"; break;
			case DebugEvent.STEP_OVER:		detail = "stepOver"; break;
			case DebugEvent.STEP_RETURN: 	detail = "stepReturn"; break;
			case DebugEvent.STEP_END: 		detail = "stepEnd"; break;
			case DebugEvent.BREAKPOINT:		detail = "breakpoint"; break;
			case DebugEvent.EVALUATION: 	detail = "evaluation"; break;
			}
			handleDebugEvent(event, action, detail);
		}
	}

	private void handleDebugEvent(DebugEvent event, String action, String detail) {
		String elementId = null;
		Object source = event.getSource();
		try {
			if (source instanceof IThread) {
				IStackFrame stackFrame = ((IThread) source).getTopStackFrame();
				if (stackFrame instanceof IJavaStackFrame) {
					elementId = ((IJavaStackFrame) stackFrame).getReceivingTypeName();
				} else if (stackFrame != null) {
					elementId = stackFrame.getName();
				}
			}
		} catch (DebugException e) {
		}
		if (elementId != null) {
			if (detail == null || (! taskPerformed(elementId, action + "." + detail))) {
				taskPerformed(elementId, action);
			}
		}
	}
}
