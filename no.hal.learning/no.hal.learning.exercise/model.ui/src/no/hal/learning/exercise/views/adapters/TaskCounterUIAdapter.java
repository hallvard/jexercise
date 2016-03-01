package no.hal.learning.exercise.views.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;

public class TaskCounterUIAdapter extends EObjectUIAdapterImpl<TaskProposal<?>, Composite> implements ProposalUIAdapter<TaskProposal<?>, Composite> {

	private String labelFormat = "Times: %s";
	private EStructuralFeature counterFeature;
	
	public TaskCounterUIAdapter(TaskProposal<?> proposal, EStructuralFeature counterFeature) {
		super(proposal);
		this.counterFeature = counterFeature;
	}
	public TaskCounterUIAdapter(TaskProposal<?> proposal, EStructuralFeature counterFeature, String labelFormat) {
		this(proposal, counterFeature);
		this.labelFormat = labelFormat;
	}

	@Override
	public TaskProposal<?> getProposal() {
		return eObject;
	}
	
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
	}
	
	private Label counterControl;
	
	private Label getCounterControl() {
		return counterControl;
	}
	
	@Override
	public Composite initView(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout());
		Label label = new Label(composite, SWT.NONE);
		counterControl = label;
		setView(composite);
		updateView();
		return composite;
	}

	@Override
	protected boolean isChangeNotification(Notification notification) {
		return notification.getFeature() == counterFeature || notification.getFeature() == ExercisePackage.eINSTANCE.getTaskProposal_Attempts();
	}
	
	protected int getCounterValue() {
		Object value = null;
		TaskProposal<?> proposal = getProposal();
		EList<TaskEvent> attempts = proposal.getAttempts();
		if (counterFeature.getEContainingClass().isSuperTypeOf(proposal.eClass())) {
			value = proposal.eGet(counterFeature);
		} else if (attempts.size() > 0){
			TaskEvent lastAttempt = attempts.get(attempts.size() - 1);
			if (counterFeature.getEContainingClass().isSuperTypeOf(lastAttempt.eClass())) {
				value = lastAttempt.eGet(counterFeature);
			}
		}
		return (value instanceof Number ? ((Number) value).intValue() : -1);
	}
	
	@Override
	public void updateView() {
		int counter = getCounterValue();
		getCounterControl().setText(String.format(labelFormat, (counter >= 0 ? counter : "?")));
	}
	
	@Override
	public void updateModel() {
	}
	
	protected void updateModel(int controlNum) {
	}
	
	protected void updateModel(double completion) {
		getProposal().setCompletion(completion);
	}
}
