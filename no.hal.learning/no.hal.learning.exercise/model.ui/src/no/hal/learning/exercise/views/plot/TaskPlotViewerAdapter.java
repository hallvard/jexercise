package no.hal.learning.exercise.views.plot;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.StringQuestion;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.AbstractTaskProposalViewerAdapter;
import no.hal.learning.exercise.views.ExerciseView;

public class TaskPlotViewerAdapter extends AbstractTaskProposalViewerAdapter {

	public TaskPlotViewerAdapter(ExerciseProposals proposals) {
		super(proposals);
	}

	private EventPlotViewer<TaskProposal<?>, TaskEvent> plotViewer;
	
	@Override
	public Composite initView(Composite parent) {
		plotViewer = new EventPlotViewer<TaskProposal<?>, TaskEvent>(taskProposals);
		plotViewer.setEventModel(new TaskProposalEventModel());
		Composite view = plotViewer.createControls(parent);
		setView(view);
		view.addDisposeListener(this);
		updateView();
		return view;
	}

	private class TaskProposalEventModel implements IEventModel<TaskProposal<?>, TaskEvent> {

		@Override
		public boolean isOwner(Object o) {
			return o instanceof TaskProposal<?>;
		}
		@Override
		public boolean isEvent(Object o) {
			return o instanceof TaskEvent;
		}

		@Override
		public Collection<TaskEvent> getEvents(TaskProposal<?> o) {
			return o.getAttempts();
		}

		@Override
		public String getText(Object o) {
			if (o instanceof TaskProposal<?>) {
				TaskProposal<?> proposal = (TaskProposal<?>) o;
				Question question = proposal.getQuestion();
				String text = question instanceof StringQuestion ? ((StringQuestion) question).getQuestion() : String.valueOf(taskProposals.indexOf(proposal) + 1);
				String proposalName = plotViewer.getOwnerVariableName(proposal);
				if (proposalName != null) {
					text = proposalName + ") " + text;
				}
				return text;
			} else if (o instanceof TaskEvent) {
				return ((TaskEvent) o).getText();
			}
			return null;
		}

		@Override
		public long getTimestamp(TaskEvent event) {
			return event.getTimestamp();
		}

		@Override
		public Collection<IValueProvider<TaskEvent, Number>> getValueProviders(TaskEvent event) {
			Collection<IValueProvider<TaskEvent, Number>> valueProviders = new ArrayList<IValueProvider<TaskEvent,Number>>();
			EClass eventClass = event.eClass();
			for (EAttribute attr : eventClass.getEAllAttributes()) {
				String dashes = EcoreUtil.getAnnotation(attr, ExerciseView.class.getName(), "dashes");
				if (dashes != null) {
					IValueProvider<TaskEvent, Number> valueProvider = new EventAttributeValueProvider<TaskEvent>(attr);
					valueProviders.add(valueProvider);
				}
			}
			valueProviders.add(new ValueNumberProvider<TaskEvent>());
			for (EAnnotation annotation : eventClass.getEAnnotations()) {
				if ("exp4j".equals(annotation.getSource())) {
					EMap<String, String> details = annotation.getDetails();
					for (String exprName : details.keySet()) {
						IValueProvider<TaskEvent, Number> valueProvider = new EventExpressionValueProvider<TaskEvent>(exprName, details.get(exprName));
						valueProviders.add(valueProvider);
					}
				}
			}
			return valueProviders;
		}
	}

	@Override
	public void updateView() {
		plotViewer.updateView();
	}
}
