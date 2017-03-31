package no.hal.learning.exercise.adm.plots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.Text;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.BarSeries;
import org.eclipse.birt.chart.model.type.impl.BarSeriesImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractExerciseCombinationsPlot extends AbstractBirtPlotPane<ChartWithAxes> {

	private Button individualButton, combButton, bothButton;

	protected void createConfigControls(Composite composite) {
		super.createConfigControls(composite);
		Composite configComposite = new Composite(composite, SWT.NONE);
		configComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		configComposite.setLayout(new GridLayout(3, false));
	    individualButton = new Button(configComposite, SWT.RADIO);
	    individualButton.setText("Individual exercises");
	    combButton = new Button(configComposite, SWT.RADIO);
	    combButton.setText("Combinations");
	    bothButton = new Button(configComposite, SWT.RADIO);
	    bothButton.setText("Both");

	    individualButton.setSelection(true);
	}

	protected Axis xAxis, yAxis;
	
	@Override
	protected ChartWithAxes createChart(Collection<Resource> resources) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
		
		chart.getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
		chart.getLegend().setVisible(true);
		
		Text chartCaption = chart.getTitle().getLabel().getCaption();
		chartCaption.setValue(getChartCaption());
		chartCaption.getFont().setSize(14);
        String FONT_NAME = "Arial";
		chartCaption.getFont().setName(FONT_NAME);

		xAxis = chart.getPrimaryBaseAxes()[0];
		Text xCaption = xAxis.getTitle().getCaption();
		xCaption.getFont().setSize(12);
		xCaption.getFont().setName(FONT_NAME);
		xCaption.setValue(getExerciseAxisCaption());
        xAxis.getTitle().setVisible(true);

        yAxis = chart.getPrimaryOrthogonalAxis(xAxis);
        Text yCaption = yAxis.getTitle().getCaption();
		yCaption.setValue(getValueAxisCaption());
		yCaption.getFont().setSize(12);
		yCaption.getFont().setName(FONT_NAME);
        yAxis.getTitle().setVisible(true);
        yAxis.getScale().setStep(10.0);

		TextDataSet categoryValues = TextDataSetImpl.create(new String[0]);
        Series categorySeries = SeriesImpl.create();
        categorySeries.setDataSet(categoryValues);

        SeriesDefinition cateorySeriesDef = SeriesDefinitionImpl.create();
        cateorySeriesDef.getSeries().add(categorySeries);
//        seriesDef.getSeriesPalette().update(1);
        xAxis.getSeriesDefinitions().add(cateorySeriesDef);

        updateYSeries();
        
		return chart;
	}

	protected void addYSeries(SeriesDefinition ySeriesDef) {
		BarSeries ySeries = createBarSeries();
        ySeriesDef.getSeries().add(ySeries);
	}

	protected void updateYSeries() {
		yAxis.getSeriesDefinitions().clear();
        SeriesDefinition ySeriesDef = SeriesDefinitionImpl.create();
        addYSeries(ySeriesDef);
        yAxis.getSeriesDefinitions().add(ySeriesDef);
	}
	
	protected BarSeries createBarSeries() {
		NumberDataSet yValues = NumberDataSetImpl.create(new Integer[0]);
        BarSeries ySeries = (BarSeries) BarSeriesImpl.create();
        ySeries.setDataSet(yValues);
		return ySeries;
	}

	protected String getExerciseAxisCaption() {
		return "Exercise combinations";
	}

	protected abstract String getValueAxisCaption();
	protected abstract String getChartCaption();

	@Override
	protected void updateChart(ChartWithAxes chart, Collection<Resource> resources) {
		ExerciseCombinationsComputer computer = new ExerciseCombinationsComputer(resources);
		boolean both = bothButton.getSelection();
		Map<Object, ? extends Collection<String>> exerciseCombinationsMap = computer.getExerciseCombinationStudents(individualButton.getSelection() || both, combButton.getSelection() || both);
		List<Object> exerciseCombinations = new ArrayList<Object>();
		for (Object combination : exerciseCombinationsMap.keySet()) {
			if (acceptExerciseCombination(combination)) {
				exerciseCombinations.add(combination);
			}
		}
		Collections.sort(exerciseCombinations, new Comparator<Object>() {
				// smallest combinations first, as we assume they are most common
				public int compare(Object o1, Object o2) {
					return (o1 instanceof Collection<?> ? ((Collection<?>) o1).size() : 0) -
						   (o2 instanceof Collection<?> ? ((Collection<?>) o2).size() : 0);
				}
		});
		Collection<String> categoryValues = new ArrayList<String>(exerciseCombinations.size());
		for (Object combination : exerciseCombinations) {
			if (acceptExerciseCombination(combination)) {
				categoryValues.add(combination.toString());
			}
		}
        SeriesDefinition cateorySeriesDef = xAxis.getSeriesDefinitions().get(0);
        Series categorySeries = cateorySeriesDef.getSeries().get(0);
        categorySeries.getDataSet().setValues(categoryValues.toArray(new String[categoryValues.size()]));

        SeriesDefinition ySeriesDef = yAxis.getSeriesDefinitions().get(0);
        int seriesNum = 0;
        for (Series series : ySeriesDef.getSeries()) {
	        BarSeries ySeries = (BarSeries) series;
	        Double[] values = new Double[categoryValues.size()];
	        int i = 0;
	        outer: for (String category : categoryValues) {
	    		for (Object combination : exerciseCombinations) {
					if (acceptExerciseCombination(combination) && combination.toString().equals(category)) {
						Collection<String> students = exerciseCombinationsMap.get(combination);
						values[i++] = computeExercisesValue(seriesNum, combination, students, computer);
						continue outer;
					}
				}
	        	values[i++] = 0.0;
	        }
	        ySeries.getDataSet().setValues(values);
	        seriesNum++;
        }
	}

	protected boolean acceptExerciseCombination(Object combination) {
		return (bothButton.getSelection() || (combination instanceof Collection<?> ? combButton.getSelection() : individualButton.getSelection()));
	}
	
	protected abstract double computeExercisesValue(int seriesNum, Object exerciseCombination, Collection<String> students, ExerciseCombinationsComputer computer);
}
