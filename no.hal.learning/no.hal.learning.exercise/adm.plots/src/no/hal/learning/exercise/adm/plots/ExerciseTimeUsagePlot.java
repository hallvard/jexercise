package no.hal.learning.exercise.adm.plots;

import java.util.Collection;
import java.util.List;

import org.eclipse.birt.chart.model.attribute.Position;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.AbstractStringEditEvent;
import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.plots.util.DoubleInputHandler;
import no.hal.learning.exercise.adm.plots.util.InputProvider;
import no.hal.learning.exercise.adm.plots.util.IntegerInputHandler;
import no.hal.learning.exercise.adm.util.TaskEventTimeAccumulator;
import no.hal.learning.exercise.junit.JunitTestEvent;
import no.hal.learning.exercise.junit.JunitTestProposal;
import no.hal.learning.exercise.util.Util;

public class ExerciseTimeUsagePlot extends AbstractStudentExercisesPlot<Long, Integer> {

	private InputProvider<Integer> eventGapThresholdProvider;
	private InputProvider<Double> testCompletionThresholdProvider;

	protected void createConfigControls(Composite composite) {
		Composite configComposite = new Composite(composite, SWT.NONE);
		configComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		configComposite.setLayout(new GridLayout(2, false));
		eventGapThresholdProvider = createTextField(configComposite, "Event gap threshold (in minutes): ", 5, IntegerInputHandler.INSTANCE);
		testCompletionThresholdProvider = createTextField(configComposite, "Test completion threshold: ", 0.5d, DoubleInputHandler.INSTANCE);
	}

	@Override
	protected String getChartCaption() {
		return "Exercises time usage";
	}

	protected String getValueAxisCaption() {
		return "# Hours used";
	}

	protected Class<? extends TaskEvent> getTaskEventClass() {
		return AbstractStringEditEvent.class;
	}

	private TaskEventTimeAccumulator taskEventTimeAccumulator;

	@Override
	protected void addYSeries(SeriesDefinition ySeriesDef) {
		super.addYSeries(ySeriesDef);
		super.addYSeries(ySeriesDef);
		
		for (Series series : ySeriesDef.getSeries()) {
			series.getLabel().setVisible(true);
			series.getLabel().getCaption().getFont().setSize(10);
			series.setLabelPosition(Position.OUTSIDE_LITERAL);
		}
	}

	@Override
	public void updateChart(ResourceSet resourceSet) {
		int eventGapThreshold = 5;
		try {
			eventGapThreshold = eventGapThresholdProvider.getInput();
		} catch (NullPointerException e) {
		}
		taskEventTimeAccumulator = new TaskEventTimeAccumulator(eventGapThreshold);
		super.updateChart(resourceSet);
	}
	
	@Override
	protected void addExerciseValues(int seriesNum, Resource resource, Collection<Long> values) {
		double testCompletionThreshold = 0.5d;
		try {
			testCompletionThreshold = testCompletionThresholdProvider.getInput();
		} catch (NullPointerException e) {
		}
		double exerciseCompletion = computeExerciseCompletion(resource);
		if (exerciseCompletion >= testCompletionThreshold) {
			Long usage = getEventsValue(resource, taskEventTimeAccumulator, seriesNum == 0 ? getTaskEventClass() : null);
			if (usage != null) {
				values.add(usage);
			}
		}
	}

	protected double computeExerciseCompletion(Resource resource) {
		double sum = 0.0;
		List<JunitTestProposal> testProposals = Util.getAllEObjects(resource.getAllContents(), JunitTestProposal.class);
		for (JunitTestProposal testProposal : testProposals) {
			EList<TaskEvent> events = testProposal.getAttempts();
			for (int i = events.size() - 1; i >= 0; i--) {
				TaskEvent event = events.get(i);
				if (event instanceof JunitTestEvent) {
					sum += event.getCompletion();
					break;
				}
			}
		}
		return sum / testProposals.size();
	}

	@Override
	protected Integer computeStudentValue(int seriesNum, Collection<Long> exerciseValues) {
		Long sum = null;
		for (Long num : exerciseValues) {
			if (sum == null) {
				sum = num;
			} else {
				sum += num;
			}
		}
		return (sum != null ? milliseconds2minutes(sum) : 0);
	}

	public static int milliseconds2minutes(long millis) {
		return (int)(millis / (1000 * 60));
	}

	public static double minutesToHours(long mins) {
		return ((double) Math.round(((double) mins) / 6)) / 10;
	}

	@Override
	protected double computeStudentsValue(int seriesNum, Collection<Integer> studentValues) {
		int count = 0, sum = 0;
		for (Integer num : studentValues) {
			if (num != null && num > 5) {
				sum += num;
				count++;
			}
		}
		return (count == 0 ? 0.0 : minutesToHours(sum / count));
	}
}
