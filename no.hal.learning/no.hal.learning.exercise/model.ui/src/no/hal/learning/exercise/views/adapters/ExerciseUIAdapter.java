package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.learning.exercise.AbstractExercisePart;
import no.hal.learning.exercise.Exercise;

public class ExerciseUIAdapter extends EObjectUIAdapterImpl<Exercise, Composite> {

	public ExerciseUIAdapter(Exercise exercise) {
		super(exercise);
	}
	
	@Override
	public ScrolledForm initView(Composite parent) {
		FormToolkit toolkit = FormUtil.getFormToolkit(parent);
		ScrolledForm view = toolkit.createScrolledForm(parent);
		setView(view);
		view.getBody().setLayout(new GridLayout(1, false));
		for (AbstractExercisePart part : getExercise().getParts()) {
			getAdapterHelper().initView(part, EObjectUIAdapter.class, view.getBody());
		}
		view.addDisposeListener(this);
		updateView();
		return view;
	}

	protected Exercise getExercise() {
		return eObject;
	}
	
	@Override
	public void updateView() {
		getAdapterHelper().updateView(getExercise().getParts(), (Class<? extends EObjectViewerAdapter<?, ?>>) EObjectUIAdapter.class);
	}

	@Override
	public void updateModel() {
	}
}
