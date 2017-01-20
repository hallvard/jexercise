package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.ExerciseProposals;

public class ExerciseProposalsUIAdapter extends EObjectUIAdapterImpl<ExerciseProposals, Composite> {

	public ExerciseProposalsUIAdapter(ExerciseProposals quizProposals) {
		super(quizProposals);
	}
	
	@Override
	public ScrolledForm initView(Composite parent) {
		FormToolkit toolkit = FormUtil.getFormToolkit(parent);
		ScrolledForm view = toolkit.createScrolledForm(parent);
		setView(view);
		view.getBody().setLayout(new GridLayout(1, false));
		for (ExercisePartProposals partProposals : getQuizProposals().getProposals()) {
			getAdapterHelper().initView(partProposals, EObjectUIAdapter.class, view.getBody());
		}
		view.addDisposeListener(this);
		updateView();
		return view;
	}

	protected ExerciseProposals getQuizProposals() {
		return eObject;
	}
	
	@Override
	public void updateView() {
		getAdapterHelper().updateView(getQuizProposals().getProposals(), (Class<? extends EObjectViewerAdapter<?, ?>>) EObjectUIAdapter.class);
	}

	@Override
	public void updateModel() {
	}
}
