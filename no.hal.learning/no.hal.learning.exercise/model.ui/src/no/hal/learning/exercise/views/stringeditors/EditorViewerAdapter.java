package no.hal.learning.exercise.views.stringeditors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.ExerciseProposals;
import no.hal.learning.exercise.Question;
import no.hal.learning.exercise.StringEditAnswer;
import no.hal.learning.exercise.StringEditTaskProposal;
import no.hal.learning.exercise.StringQuestion;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.TaskProposal;
import no.hal.learning.exercise.views.AbstractTaskProposalViewerAdapter;
import no.hal.learning.exercise.views.ExerciseView;
import no.hal.learning.exercise.views.plot.EventAttributeValueProvider;
import no.hal.learning.exercise.views.plot.EventExpressionValueProvider;
import no.hal.learning.exercise.views.plot.EventPlotViewer;
import no.hal.learning.exercise.views.plot.IEventModel;
import no.hal.learning.exercise.views.plot.IEventProvider;
import no.hal.learning.exercise.views.plot.IValueProvider;

public class EditorViewerAdapter extends AbstractTaskProposalViewerAdapter implements ISelectionChangedListener {

	public EditorViewerAdapter(ExerciseProposals proposals) {
		super(proposals);
	}

	@Override
	public void addProposal(TaskProposal<?> proposal) {
		if (proposal instanceof StringEditTaskProposal<?>) {
			super.addProposal(proposal);
		}
	}

	private SashForm editorSash;
	private EditorController[] editors;
	
	private EventPlotViewer<TaskProposal<?>, TaskEvent> plotViewer;

	@Override
	public Composite initView(Composite parent) {
		EventPlotViewer.Config config = new EventPlotViewer.Config();
		plotViewer = new EventPlotViewer<TaskProposal<?>, TaskEvent>(taskProposals, config) {
			@Override
			public void createExtraControls(Composite parent, int position) {
				if (position == SWT.TOP) {
					editorSash = new SashForm(parent, SWT.HORIZONTAL);
					createEditors();
				}
				getPointSelector().setMaxD(-1, -1, -1);
			}

			protected void createEditors() {
				int editorCount = 0;
				for (TaskProposal<?> task : taskProposals) {
					if (shouldHaveEditor(task)) {
						editorCount++;
					}
				}
				editors = new EditorController[editorCount];
				int[] weights = new int[editors.length];
				int editorNum = 0;
				for (TaskProposal<?> task : taskProposals) {
					if (shouldHaveEditor(task)) {
						editors[editorNum] = new EditorController((StringEditTaskProposal<StringEditAnswer>) task);
						editors[editorNum].createControls(editorSash);
						weights[editorNum] = 1;
						editorNum++;
					}
				}
				editorSash.setWeights(weights);
				for (int i = 0; i < editors.length; i++) {
					editors[i].updateView();
				}
			}
			
			protected void recreateEditors() {
				for (int i = 0; i < editors.length; i++) {
					editors[i].dispose();
				}
				createEditors();
			}

			protected boolean shouldHaveEditor(TaskProposal<?> task) {
				return isChecked(task);
			}

			@Override
			protected void treeStateChanged(CheckStateChangedEvent event) {
				super.treeStateChanged(event);
				if (event.getElement() instanceof StringEditTaskProposal<?>) {
					recreateEditors();
				}
			}
		};
		plotViewer.setEventModel(new EditorViewerEventModel());
		plotViewer.addSelectionChangedListener(this);
		Composite view = plotViewer.createControls(parent);
		setView(view);
		view.addDisposeListener(this);
		updateView();
		return view;
	}

	protected void updateEditor(AbstractStringEditEvent editEvent) {
		int i = taskProposals.indexOf((StringEditTaskProposal<?>) editEvent.eContainer());
		if (i >= 0 && i < editors.length) {
			try {
				editors[i].updateView(editEvent);
			} catch (RuntimeException e) {
				e.printStackTrace();
				throw e;
			}
		}
	}
	
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		ISelection selection = event.getSelection();
		Iterator<?> it = ((IStructuredSelection) selection).iterator();
		while (it.hasNext()) {
			Object next = it.next();
			if (next instanceof IEventProvider<?>) {
				AbstractStringEditEvent editEvent = ((IEventProvider<AbstractStringEditEvent>) next).getEvent();
				updateEditor(editEvent);
			}
		}
	}

	private class EditorViewerEventModel implements IEventModel<TaskProposal<?>, TaskEvent> {

		@Override
		public boolean isOwner(Object o) {
			return o instanceof StringEditTaskProposal<?>;
		}
		@Override
		public boolean isEvent(Object o) {
			return o instanceof AbstractStringEditEvent;
		}

		@Override
		public Collection<TaskEvent> getEvents(TaskProposal<?> o) {
			Collection<TaskEvent> events = new ArrayList<TaskEvent>(); 
			for (TaskEvent event : o.getAttempts()) {
				if (isEvent(event)) {
					events.add(event);
				}
			}
			return events;
//			return o.getAttempts();
		}

		@Override
		public String getText(Object o) {
			if (o instanceof StringEditTaskProposal<?>) {
				StringEditTaskProposal<?> proposal = (StringEditTaskProposal<?>) o;
				Question question = proposal.getQuestion();
				String text = question instanceof StringQuestion ? ((StringQuestion) question).getQuestion() : String.valueOf(taskProposals.indexOf(proposal) + 1);
				String proposalName = plotViewer.getOwnerVariableName(proposal);
				if (proposalName != null) {
					text = proposalName + ") " + text;
				}
				return text;
			} else if (o instanceof AbstractStringEditEvent) {
				return ((AbstractStringEditEvent) o).getText();
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
