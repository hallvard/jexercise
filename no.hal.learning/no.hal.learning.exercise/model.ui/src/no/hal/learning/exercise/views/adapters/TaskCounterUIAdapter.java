package no.hal.learning.exercise.views.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.provider.ExerciseEditPlugin;

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
	public TaskCounterUIAdapter(TaskProposal<?> proposal, EStructuralFeature counterFeature, String labelFormat, Boolean trendLogic) {
		this(proposal, counterFeature, labelFormat);
		this.trendLogic = trendLogic;
	}
	public TaskCounterUIAdapter(TaskProposal<?> proposal, EStructuralFeature counterFeature, String labelFormat, Boolean trendLogic, boolean showNeutralTrend) {
		this(proposal, counterFeature, labelFormat, trendLogic);
		this.showNeutralTrend = showNeutralTrend;
	}

	@Override
	public TaskProposal<?> getProposal() {
		return eObject;
	}
	
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
	}
	
	// true means higher is better, false lower is better and null means don't show trend
	public Boolean trendLogic;
	
	public void setTrendLogic(Boolean trendLogic) {
		this.trendLogic = trendLogic;
	}
	
	private Label counterControl;
	
	private Label getCounterControl() {
		return counterControl;
	}

	private Label trendControl;
	
	private Label getTrendControl() {
		return trendControl;
	}
	
	private boolean showNeutralTrend = false;
	
	public void setShowNeutralTrend(boolean showNeutralTrend) {
		this.showNeutralTrend = showNeutralTrend;
	}

	@Override
	public Composite initView(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new RowLayout());
		Label label = new Label(composite, SWT.NONE);
		counterControl = label;
		if (trendLogic != null || showNeutralTrend) {
			Label label2 = new Label(composite, SWT.NONE);
			trendControl = label2;
		}
		setView(composite);
		updateView();
		return composite;
	}

	@Override
	protected boolean isChangeNotification(Notification notification) {
		return notification.getFeature() == counterFeature || notification.getFeature() == ExercisePackage.eINSTANCE.getTaskProposal_Attempts();
	}
	
	protected int getCounterValue() {
		return getCounterValue(-1);
	}

	protected int getCounterValue(int n) {
		Object value = null;
		TaskProposal<?> proposal = getProposal();
		EList<TaskEvent> attempts = proposal.getAttempts();
		if (counterFeature.getEContainingClass().isSuperTypeOf(proposal.eClass())) {
			value = proposal.eGet(counterFeature);
		} else if (attempts.size() > 0) {
			if (n < 0) {
				n = attempts.size() + n;
			}
			if (n >= 0 && n < attempts.size()) {
				TaskEvent lastAttempt = attempts.get(n);
				if (counterFeature.getEContainingClass().isSuperTypeOf(lastAttempt.eClass())) {
					value = lastAttempt.eGet(counterFeature);
				}
			}
		}
		return (value instanceof Number ? ((Number) value).intValue() : -1);
	}

	protected Image getTrendImage(int trend) {
		String key = (trend == 0 || (trendLogic == null && (! showNeutralTrend)) ? "default" : ((trend > 0 ? "up" : "down") + "-" + (trendLogic != null ? (trend > 0 == trendLogic ? "good" : "bad") : "neutral")));
		return getTrendImage(key);
	}

	protected Image getTrendImage(String key) {
		Object imageDescription = ExerciseEditPlugin.getPlugin().getImage("trend/" + key + ".png");
		return ExtendedImageRegistry.getInstance().getImage(imageDescription);
	}

	@Override
	public void updateView() {
		int counter = getCounterValue();
		getCounterControl().setText(String.format(labelFormat, (counter >= 0 ? counter : "?")));
		if (trendLogic != null || showNeutralTrend) {
			int previousCounter = getCounterValue(-2), diff = counter - previousCounter;
			Image trendImage = previousCounter >= 0 && diff != 0 ? getTrendImage(diff) : null;
			if (trendImage == null) {
				trendImage = getTrendImage("default");
			}
			getTrendControl().setImage(trendImage);
		}
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
