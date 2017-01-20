package no.hal.learning.exercise.views.adapters;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapter;
import no.hal.emf.ui.parts.adapters.EObjectViewerAdapterHelper;
import no.hal.learning.exercise.ExercisePartProposals;
import no.hal.learning.exercise.Proposal;

public class ExercisePartProposalsUIAdapter extends EObjectUIAdapterImpl<ExercisePartProposals, Composite> implements DisposeListener, IExpansionListener {

	public ExercisePartProposalsUIAdapter(ExercisePartProposals partProposals) {
		super(partProposals);
	}
	
	@Override
	public ExpandableComposite initView(Composite parent) {
		FormToolkit toolkit = FormUtil.getFormToolkit(parent);
		int style = ExpandableComposite.EXPANDED | ExpandableComposite.TWISTIE | ExpandableComposite.CLIENT_INDENT;
		ExpandableComposite view = toolkit.createExpandableComposite(parent, style);
		if (getPartProposals().getExercisePart() != null && getPartProposals().getExercisePart().getTitle() != null) {
			view.setText(getPartProposals().getExercisePart().getTitle());
		}
		setView(view);
		Composite composite = new Composite(view, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		composite.setLayout(new GridLayout(1, false));
		view.setClient(composite);
		EObjectViewerAdapterHelper adapterHelper = getAdapterHelper();
		for (Proposal<?> proposal : getPartProposals().getProposals()) {
			if (adapterHelper.initView(proposal.getQuestion(), EObjectViewerAdapter.class, composite) != null) {
				adapterHelper.initView(proposal, EObjectUIAdapter.class, composite);
			}
		}
		updateView();
		view.addExpansionListener(this);
		return view;
	}
	
	@Override
	public void expansionStateChanging(ExpansionEvent e) {
	}
	@Override
	public void expansionStateChanged(ExpansionEvent e) {
		FormUtil.relayoutForm(getView());
	}

	protected ExercisePartProposals getPartProposals() {
		return eObject;
	}
	
	@Override
	public void widgetDisposed(DisposeEvent e) {
	}

	@Override
	public void updateView() {
		getAdapterHelper().updateView(getPartProposals().getProposals(), (Class<? extends EObjectViewerAdapter<?, ?>>) EObjectUIAdapter.class);
	}

	@Override
	public void updateModel() {
	}
}
