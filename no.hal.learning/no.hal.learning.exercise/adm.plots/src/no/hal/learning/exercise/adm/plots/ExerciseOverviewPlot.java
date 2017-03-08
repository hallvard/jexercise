package no.hal.learning.exercise.adm.plots;

import java.util.Collection;

import org.eclipse.birt.chart.model.attribute.Position;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.data.SeriesDefinition;

public class ExerciseOverviewPlot extends AbstractExerciseCombinationsPlot {

	@Override
	protected String getChartCaption() {
		return "Exercises selection overview";
	}
	
	protected String getValueAxisCaption() {
		return "# Students";
	}
		
	@Override
	protected void addYSeries(SeriesDefinition ySeriesDef) {
		super.addYSeries(ySeriesDef);
		Series series = ySeriesDef.getSeries().get(0);
		series.getLabel().setVisible(true);
		series.setLabelPosition(Position.OUTSIDE_LITERAL);
	}
	
	protected double computeExercisesValue(int seriesNum, Object exerciseCombination, Collection<String> students, ExerciseCombinationsComputer computer) {
		return students.size();
	}
}
