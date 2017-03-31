package no.hal.learning.exercise.adm.plots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.Orientation;
import org.eclipse.birt.chart.model.attribute.Position;
import org.eclipse.birt.chart.model.attribute.Text;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.AxisImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.type.BarSeries;
import org.eclipse.birt.chart.model.type.impl.BarSeriesImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;
import no.hal.learning.exercise.adm.ExResourcesChartView;
import no.hal.learning.exercise.adm.plots.util.InputProvider;
import no.hal.learning.exercise.adm.plots.util.IntegerInputHandler;
import no.hal.learning.exercise.adm.plots.util.TestCompletionTaskEventsValue;
import no.hal.learning.exercise.adm.util.EditTimeAccumulator;
import no.hal.learning.exercise.util.Util;

public class ExercisePerformanceDistributionPlot extends AbstractBirtPlotPane<ChartWithAxes> {

	private Button timeButton, testsButton, bothButton;
	
	private InputProvider<Integer> minTimeProvider;
	private InputProvider<Integer> numClassesProvider;
	
	protected void createConfigControls(Composite composite) {
		super.createConfigControls(composite);
		Composite performanceButtonGroup = new Composite(composite, SWT.NONE);
		performanceButtonGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		performanceButtonGroup.setLayout(new GridLayout(3, false));
		timeButton = new Button(performanceButtonGroup, SWT.RADIO);
		timeButton.setText("Time");
		testsButton = new Button(performanceButtonGroup, SWT.RADIO);
		testsButton.setText("Tests");
		bothButton = new Button(performanceButtonGroup, SWT.RADIO);
		bothButton.setText("Both");

		timeButton.setSelection(true);

		Composite configPropertiesGroup = new Composite(composite, SWT.NONE);
		configPropertiesGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		configPropertiesGroup.setLayout(new GridLayout(2, false));
		minTimeProvider = createTextField(configPropertiesGroup, "Min. time", "10", new IntegerInputHandler(10));
		numClassesProvider = createTextField(configPropertiesGroup, "# classes", "10", new IntegerInputHandler(10));
	}

	protected Axis distAxis, valueAxis, exerciseAxis;

	@Override
	protected ChartWithAxes createChart(Collection<Resource> resources) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.THREE_DIMENSIONAL_LITERAL);

		chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		chart.getLegend().setVisible(false);

		Text chartCaption = chart.getTitle().getLabel().getCaption();
		chartCaption.setValue("Exercise performance distribution");
		chartCaption.getFont().setSize(14);
		String FONT_NAME = "Arial";
		chartCaption.getFont().setName(FONT_NAME);

		distAxis = chart.getPrimaryBaseAxes()[0];
		Text studentCaption = distAxis.getTitle().getCaption();
		studentCaption.getFont().setSize(12);
		studentCaption.getFont().setName(FONT_NAME);
		studentCaption.setValue("Distribution");
		distAxis.getTitle().setVisible(false); // org.eclipse.birt.chart.render.AxesRenderHelper.renderHorizontalAxisTitle(AxesRenderHelper.java:1948)
		distAxis.getLabel().setVisible(false);

		valueAxis = chart.getPrimaryOrthogonalAxis(distAxis);
		Text valueCaption = valueAxis.getTitle().getCaption();
		valueCaption.setValue("Performance");
		valueCaption.getFont().setSize(12);
		valueCaption.getFont().setName(FONT_NAME);
		valueAxis.getTitle().setVisible(false); // org.eclipse.birt.chart.render.AxesRenderHelper.renderVerticalAxisTitle(AxesRenderHelper.java:1948)
		valueAxis.getScale().setStep(30.0);
		valueAxis.getSeriesDefinitions().add(SeriesDefinitionImpl.create());

		exerciseAxis = AxisImpl.create(Axis.ANCILLARY_BASE);
		exerciseAxis.setType(AxisType.TEXT_LITERAL);
		exerciseAxis.setOrientation(Orientation.HORIZONTAL_LITERAL);
		exerciseAxis.setLabelPosition(Position.BELOW_LITERAL);
		exerciseAxis.setTitlePosition(Position.BELOW_LITERAL);
		exerciseAxis.getTitle().setVisible(false);
		distAxis.getAncillaryAxes().add(exerciseAxis);

		setSeriesDefinition(distAxis, new double[0]);
		setSeriesDefinition(exerciseAxis, new String[0]);

		return chart;
	}

	@Override
	protected void updateChart(ChartWithAxes chart, Collection<Resource> resources) {
		Series distSeries = distAxis.getSeriesDefinitions().get(0).getSeries().get(0);
		int numClasses = numClassesProvider.getInput();
		Integer[] distClasses = new Integer[numClasses];
		for (int i = 0; i < distClasses.length; i++) {
			distClasses[i] = i + 1;
		}
		distSeries.getDataSet().setValues(distClasses);

		SeriesDefinition valueSeriesDef = valueAxis.getSeriesDefinitions().get(0);
		valueSeriesDef.getSeries().clear();

		List<DistData> distData = getDistData(resources, numClasses);
		Collections.sort(distData, new Comparator<DistData>() {
			@Override
			public int compare(DistData data1, DistData data2) {
//				return Double.compare(data1.average, data2.average);
				return data1.values.length - data2.values.length;
			}
		});
		for (DistData data : distData) {
			NumberDataSet values = NumberDataSetImpl.create(data.dist);
			BarSeries valueSeries = (BarSeries) BarSeriesImpl.create();
			valueSeries.setDataSet(values);
			valueSeriesDef.getSeries().add(valueSeries);
		}
		List<String> exercises = new ArrayList<String>();
		for (DistData data : distData) {
			exercises.add(0, data.label);
			System.out.println(data.label + ": " + "max=" + data.max + " " + "average=" + data.average + " variance=" + data.variance);
		}
		Series exerciseSeries = exerciseAxis.getSeriesDefinitions().get(0).getSeries().get(0);
		exerciseSeries.getDataSet().setValues(exercises.toArray(new String[exercises.size()]));
	}

	private static class DistData {
		String label;
		double values[], max, average, variance;
		Integer[] dist;
	}
	
	private List<DistData> getDistData(Collection<Resource> resources, int numClasses) {
		Collection<String> exercises = new ArrayList<String>();
		for (Resource resource : resources) {
			String exerciseId = ExResourcesChartView.getExerciseId(resource);
			if (! exercises.contains(exerciseId)) {
				exercises.add(exerciseId);
			}
		}
		List<DistData> distData = new ArrayList<DistData>(exercises.size());
		double max = Double.MIN_VALUE;
		Iterator<String> exIt = exercises.iterator();
		while (exIt.hasNext()) {
			DistData data = new DistData();
			data.label = exIt.next();
			data.values = getExerciseValues(data.label, resources);
			if (data.values != null) {
				double dataMax = Double.MIN_VALUE, dataSum = 0.0;
				for (int i = 0; i < data.values.length; i++) {
					dataMax = Math.max(dataMax, data.values[i]);
					dataSum += data.values[i];
				}
				data.max = dataMax;
				max = Math.max(max, dataMax);
				data.average = dataSum / data.values.length;
				distData.add(data);
			} else {
				exIt.remove();
			}
		}
		for (DistData data : distData) {
			data.dist = new Integer[numClasses];
			Arrays.fill(data.dist, Integer.valueOf(0));
			double sum = 0.0, squareSum = 0.0;
			for (int i = 0; i < data.values.length; i++) {
				double value = data.values[i];
				sum += value;
				squareSum += value * value;
			}
			data.variance = (squareSum - (sum * sum) / data.values.length) / data.values.length;
			for (int i = 0; i < data.values.length; i++) {
				int valueClass = (int)(numClasses * data.values[i] / (max + 1));
				data.dist[valueClass]++;
			}
		}
		return distData;
	}

	protected double[] getExerciseValues(String exercise, Collection<Resource> resources) {
		List<Double> values = new ArrayList<Double>();
		for (Resource resource : resources) {
			if (exercise.equals(ExResourcesChartView.getExerciseId(resource))) {
				double value = getPerformanceValue(resource);
				if (value > 0.0) {
					values.add(value);
				}
			}
		}
		double[] doubles = new double[values.size()];
		for (int i = 0; i < doubles.length; i++) {
			doubles[i] = values.get(i);
		}
		Arrays.sort(doubles);
		return doubles;
	}
	
	private AbstractTaskEventsValueProvider<? extends Number> timeValueProvider = EditTimeAccumulator.INSTANCE;
	private AbstractTaskEventsValueProvider<? extends Number> testValueProvider = TestCompletionTaskEventsValue.INSTANCE;

	public double getPerformanceValue(Resource resource) {
		List<TaskEvent> taskEvents = Util.getAllEObjects(resource.getAllContents(), TaskEvent.class);
		Number time = (timeButton.getSelection() || bothButton.getSelection() ? timeValueProvider.getTaskEventsValue(taskEvents) : null);
		Number test = (testsButton.getSelection() || bothButton.getSelection() ? testValueProvider.getTaskEventsValue(taskEvents) : null);
		double value = 0.0;
		if (timeButton.getSelection() && time != null) {
			double timeValue = time.doubleValue();
			if (timeValue >= minTimeProvider.getInput()) {
				value = time.doubleValue();
			}
		} else if (testsButton.getSelection() && test != null) {
			value = test.doubleValue();
		} else if (bothButton.getSelection() && time != null && test != null && test.doubleValue() != 0.0) {
			value = time.doubleValue() / test.doubleValue();
		}
		return value;
	}

//	Chart createChart(BaseChart chartSpec, ResourceBundle bundle) throws Exception {
//		ChartWithAxes cwaBar = ChartWithAxesImpl.create();
//		cwaBar.setDimension(ChartDimension.THREE_DIMENSIONAL_LITERAL);
//		cwaBar.setType("Bar Chart"); //$NON-NLS-1$
//		cwaBar.setSubType("Side-by-side"); //$NON-NLS-1$
//		// Plot
//		cwaBar.getBlock().setBackground(ColorDefinitionImpl.WHITE());
//		cwaBar.getBlock().getOutline().setVisible(true);
//		// Title
//		cwaBar.getTitle().getLabel().getCaption()
//				.setValue(chartSpec.getChartTitle()
//						+ ChartUtils.getDateAsString(ChartConstants.DATE_FORMAT_YYYYMMDD,
//								(String) chartSpec.getWhereClauseStmts().get("fromDate"))
//						+ " - " + ChartUtils.getDateAsString(ChartConstants.DATE_FORMAT_YYYYMMDD,
//								(String) chartSpec.getWhereClauseStmts().get("toDate")));
//		// Legend
//		cwaBar.getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
//		// X-Axis
//		Axis xAxisPrimary = cwaBar.getPrimaryBaseAxes()[0];
//		xAxisPrimary.setType(AxisType.TEXT_LITERAL);
//		xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
//		xAxisPrimary.getOrigin().setType(IntersectionType.MIN_LITERAL);
//		xAxisPrimary.getLabel().getCaption().getFont().setRotation(90);
//		if (chartSpec.getxAxisTitle() != null) {
//			xAxisPrimary.getTitle().setVisible(true);
//			xAxisPrimary.getTitle().getCaption().setValue(chartSpec.getxAxisTitle());
//		}
//		// Y-Axis
//		Axis yAxisPrimary = cwaBar.getPrimaryOrthogonalAxis(xAxisPrimary);
//		yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
//		yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
//		if (chartSpec.getyAxisTitle() != null) {
//			yAxisPrimary.getTitle().setVisible(true);
//			yAxisPrimary.getTitle().getCaption().setValue(chartSpec.getyAxisTitle());
//		}
//		// yAxisPrimary.getLabel( ).getCaption( ).getFont().setRotation( 90 );
//		// Z-Axis
//		Axis zAxis = AxisImpl.create(Axis.ANCILLARY_BASE);
//		zAxis.setType(AxisType.TEXT_LITERAL);
//		zAxis.setLabelPosition(Position.BELOW_LITERAL);
//		zAxis.setTitlePosition(Position.BELOW_LITERAL);
//		zAxis.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
//		zAxis.setOrientation(Orientation.HORIZONTAL_LITERAL);
//		xAxisPrimary.getAncillaryAxes().add(zAxis);
//		// Data Set
//		TextDataSet categoryValues = TextDataSetImpl.create(chartSpec.getxAxis());
//		NumberDataSet orthoValues1 = NumberDataSetImpl.create(chartSpec.getyAxis());
//		// X-Series
//		Series seCategory = SeriesImpl.create();
//		seCategory.setDataSet(categoryValues);
//		SeriesDefinition sdX = SeriesDefinitionImpl.create();
//		sdX.getSeriesPalette().shift(0, 10);
//		xAxisPrimary.getSeriesDefinitions().add(sdX);
//		sdX.getSeries().add(seCategory);
//		// Y-Series (1)
//		BarSeries bs1 = (BarSeries) BarSeriesImpl.create();
//		bs1.setDataSet(orthoValues1);
//		bs1.getLabel().setVisible(true);
//		bs1.setLabelPosition(Position.OUTSIDE_LITERAL);
//		bs1.setTranslucent(false);
//		SeriesDefinition sdY = SeriesDefinitionImpl.create();
//		yAxisPrimary.getSeriesDefinitions().add(sdY);
//		sdY.getSeries().add(bs1);
//		// Z-Series
//		SeriesDefinition sdZ = SeriesDefinitionImpl.create();
//		zAxis.getSeriesDefinitions().add(sdZ);
//		// Rotate the chart
//		cwaBar.setRotation(Rotation3DImpl.create(new Angle3D[] { Angle3DImpl.create(-10, 25, 0) }));
//		return cwaBar;
//	}
}
