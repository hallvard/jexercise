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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.junit.JunitTestEvent;
import no.hal.learning.exercise.junit.JunitTestProposal;
import no.hal.learning.exercise.util.Util;

public class ExerciseTestCompletionPlot extends AbstractStudentExercisesPlot<Double, Double> {

	private Text testCompletionMinText, testCompletionMaxText;

	protected void createConfigControls(Composite composite) {
		Composite configComposite = new Composite(composite, SWT.NONE);
		configComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		configComposite.setLayout(new GridLayout(2, false));
		Label label1 = new Label(configComposite, SWT.NONE);
		label1.setText("Test completion minimum: ");
		testCompletionMinText = new Text(configComposite, SWT.NONE);
		testCompletionMinText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		testCompletionMinText.setText(String.valueOf(0.0));
		Label label2 = new Label(configComposite, SWT.NONE);
		label2.setText("Test completion maximum: ");
		testCompletionMaxText = new Text(configComposite, SWT.NONE);
		testCompletionMaxText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		testCompletionMaxText.setText(String.valueOf(1.0));
	}

	@Override
	protected String getChartCaption() {
		return "Exercises test completion";
	}

	protected String getValueAxisCaption() {
		return "# Students completed";
	}

	protected Class<? extends TaskEvent> getTaskEventClass() {
		return JunitTestEvent.class;
	}

	private boolean stacked = true;
	
	@Override
	protected void addYSeries(SeriesDefinition ySeriesDef) {
		// below
		super.addYSeries(ySeriesDef);
		// between
		super.addYSeries(ySeriesDef);
		// above
		super.addYSeries(ySeriesDef);
		
		for (Series series : ySeriesDef.getSeries()) {
			series.setStacked(stacked);
			series.getLabel().setVisible(true);
			series.getLabel().getCaption().getFont().setSize(10);
			series.setLabelPosition(Position.INSIDE_LITERAL);
		}
	}

	@Override
	public void updateChart(ResourceSet resourceSet) {
		super.updateChart(resourceSet);
	}

	protected double[] getTestCompletionMinMax() {
		double[] minMax = {0.0d, 1.0d};
		try {
			minMax[0] = Double.valueOf(testCompletionMinText.getText().trim());
		} catch (NumberFormatException e) {
		}
		try {
			minMax[1] = Double.valueOf(testCompletionMaxText.getText().trim());
		} catch (NumberFormatException e) {
		}
		return minMax;
	}

	protected int compareCompletion(double completion) {
		double[] testCompletionMinMax = getTestCompletionMinMax();
		if (completion < testCompletionMinMax[0]) {
			return -1;
		} else if (completion > testCompletionMinMax[1]) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	protected void addExerciseValues(int seriesNum, Resource resource, Collection<Double> values) {
		List<JunitTestProposal> testProposals = Util.getAllEObjects(resource.getAllContents(), JunitTestProposal.class);
		for (JunitTestProposal testProposal : testProposals) {
			EList<TaskEvent> events = testProposal.getAttempts();
			for (int i = events.size() - 1; i >= 0; i--) {
				TaskEvent event = events.get(i);
				if (event instanceof JunitTestEvent) {
					values.add(event.getCompletion());
					// only take the last one
					break;
				}
			}
		}
	}

	@Override
	protected Double computeStudentValue(int seriesNum, Collection<Double> exerciseValues) {
		int count = 0;
		double sum = 0.0;
		for (Double num : exerciseValues) {
			if (num != null) {
				sum += num;
				count++;
			}
		}
		if (count == 0) {
			return null;
		}
		double average = sum / count;
		return compareCompletion(average) + 1 == seriesNum ? average : null;
	}

	@Override
	protected double computeStudentsValue(int seriesNum, Collection<Double> studentValues) {
		return studentValues.size();
	}
}
