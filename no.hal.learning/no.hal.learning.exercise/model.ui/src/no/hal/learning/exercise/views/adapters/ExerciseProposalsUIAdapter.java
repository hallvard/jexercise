package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

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
	public Composite initView(Composite parent) {
//		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL);
		Composite view = new Composite(parent, SWT.NONE);
//		scrolledComposite.setContent(view);
		setView(view);
		view.setLayout(new GridLayout(1, false));
		for (ExercisePartProposals partProposals : getQuizProposals().getProposals()) {
			getAdapterHelper().initView(partProposals, EObjectUIAdapter.class, view);
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
//		for (QuizPartProposals partProposals : getQuizProposals().getProposals()) {
//			getAdapterHelper().updateView(partProposals, EObjectUIAdapter.class);
//		}
		getAdapterHelper().updateView(getQuizProposals().getProposals(), (Class<? extends EObjectViewerAdapter<?, ?>>) EObjectUIAdapter.class);
	}

	@Override
	public void updateModel() {
	}
}
