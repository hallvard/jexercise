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
import no.hal.learning.exercise.AbstractTask;
import no.hal.learning.exercise.ExercisePart;

public class ExercisePartUIAdapter extends EObjectUIAdapterImpl<ExercisePart, Composite> implements DisposeListener, IExpansionListener {

	public ExercisePartUIAdapter(ExercisePart part) {
		super(part);
	}
	
	@Override
	public ExpandableComposite initView(Composite parent) {
		FormToolkit toolkit = FormUtil.getFormToolkit(parent);
		int style = ExpandableComposite.EXPANDED | ExpandableComposite.TWISTIE | ExpandableComposite.CLIENT_INDENT;
		ExpandableComposite view = toolkit.createExpandableComposite(parent, style);
		if (getExercisePart() != null && getExercisePart().getTitle() != null) {
			view.setText(getExercisePart().getTitle());
		}
		setView(view);
		Composite composite = new Composite(view, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		composite.setLayout(new GridLayout(1, false));
		view.setClient(composite);
		EObjectViewerAdapterHelper adapterHelper = getAdapterHelper();
		for (AbstractTask task : getExercisePart().getTasks()) {
			if (adapterHelper.initView(task.getQ(), EObjectViewerAdapter.class, composite) != null) {
//				adapterHelper.initView(proposal, EObjectUIAdapter.class, composite);
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

	protected ExercisePart getExercisePart() {
		return eObject;
	}
	
	@Override
	public void widgetDisposed(DisposeEvent e) {
	}

	@Override
	public void updateView() {
		for (AbstractTask task : getExercisePart().getTasks()) {
			getAdapterHelper().updateView(task.getQ(), (Class<? extends EObjectViewerAdapter<?, ?>>) EObjectUIAdapter.class);
		}
	}

	@Override
	public void updateModel() {
	}
}
