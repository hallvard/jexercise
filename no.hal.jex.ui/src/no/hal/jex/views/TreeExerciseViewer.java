package no.hal.jex.views;

import java.util.ArrayList;
import java.util.List;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.Exercise;
import no.hal.jex.JavaRequirement;
import no.hal.jex.resource.JexResource;
import no.hal.jex.ui.JexManager;
import no.hal.jex.ui.JexUiPlugin;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

public class TreeExerciseViewer extends TreeViewer implements IExerciseViewer, ISelectionChangedListener, IDoubleClickListener {

	public TreeExerciseViewer(Composite parent, int style) {
		super(parent, style);
		init();
	}
	public TreeExerciseViewer(Composite parent) {
		this(parent, SWT.NONE);
	}
	public TreeExerciseViewer(Tree tree) {
		super(tree);
		init();
	}

	private void init() {
		addSelectionChangedListener(this);
		addDoubleClickListener(this);
	}

	public void updateViewer(AbstractRequirement req) {
		super.update(req, null);
	}
	
	public JexResource getExerciseResource() {
		return (JexResource)getInput();
	}
	public void setExerciseResource(JexResource res) {
		AbstractRequirement oldSelection = null;
		if (res != null && res == getInput()) {
			oldSelection = getSelectedRequirement();
		}
		setInput(res); // res != null ? (Object)res : JexPlugin.getDefault().getExerciseManager());
		if (oldSelection != null) {
			// this doesn't seem to work
			setSelectedRequirement(oldSelection);
			reveal(oldSelection);
		} else {
			setSelectedRequirement(res != null ? res.getExercise() : null);
		}
	}
	
	public Object getSelection(Object o, Class<?> c) {
		if (o instanceof ISelection) {
			ISelection selection = (ISelection)o;
			if (! (selection instanceof IStructuredSelection)) {
				return null;
			}
			o = ((IStructuredSelection)selection).getFirstElement();
			if (o instanceof JexResource && c != JexResource.class) {
				o = ((JexResource)o).getExercise();
			}
		}
		return (c == null || c.isInstance(o) ? o : null);
	}

	public AbstractRequirement getSelectedRequirement() {
		return (AbstractRequirement)getSelection(getSelection(), AbstractRequirement.class);
	}

	public void setSelectedRequirement(AbstractRequirement req) {
		Object selection = req;
		if (req instanceof Exercise) {
			selection = JexUiPlugin.getPlugin().getExerciseManager().getExerciseResource((Exercise)req);
		}
		setSelection(selection != null ? new StructuredSelection(selection) : StructuredSelection.EMPTY);
	}

	private List<ExerciseListener> listeners;
	
	public void addExerciseListener(ExerciseListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<ExerciseListener>();
		}
		listeners.add(listener);
	}

	public void removeExerciseListener(ExerciseListener listener) {
		if (listeners != null) {
			listeners.remove(listener);
		}
	}
	
	private void fireRequirementSelected(AbstractRequirement req) {
		for (ExerciseListener listener : listeners) {
			listener.requirementSelected(req);
		}
	}
	private void fireRequirementValidationRequested(JavaRequirement req) {
		for (ExerciseListener listener : listeners) {
			listener.requirementValidationRequested(req);
		}
	}

	public void selectionChanged(SelectionChangedEvent event) {
		AbstractRequirement req = (AbstractRequirement)getSelection(event.getSelection(), AbstractRequirement.class);
		if (req != null) {
			fireRequirementSelected(req);
		}
	}

	public void doubleClick(DoubleClickEvent event) {
		JavaRequirement req = (JavaRequirement)getSelection(event.getSelection(), JavaRequirement.class);
		if (req != null) {
			fireRequirementValidationRequested((JavaRequirement)req);
		} else {
			JexResource res = (JexResource)getSelection(event.getSelection(), JexResource.class);
			JexManager manager = JexUiPlugin.getPlugin().getExerciseManager();
			manager.refreshExerciseResource(res);
		}
	}
}
