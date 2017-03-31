package no.hal.learning.exercise.adm.plots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
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

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.adm.AbstractTaskEventsValueProvider;
import no.hal.learning.exercise.adm.ExResourcesChartView;
import no.hal.learning.exercise.adm.plots.matrix.AbstractMatrix;
import no.hal.learning.exercise.adm.plots.matrix.MatrixFactorizer;
import no.hal.learning.exercise.adm.plots.util.InputProvider;
import no.hal.learning.exercise.adm.plots.util.IntegerInputHandler;
import no.hal.learning.exercise.adm.plots.util.TestCompletionTaskEventsValue;
import no.hal.learning.exercise.adm.util.EditTimeAccumulator;
import no.hal.learning.exercise.util.Util;

public class StudentExerciseMatrixPlot extends AbstractBirtPlotPane<ChartWithAxes> {

	private Button timeButton, testsButton, bothButton;
	private InputProvider<Integer> studentNumProvider;
	
	protected void createConfigControls(Composite composite) {
		super.createConfigControls(composite);
		Composite configButtonGroup = new Composite(composite, SWT.NONE);
		configButtonGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		configButtonGroup.setLayout(new GridLayout(3, false));
		timeButton = new Button(configButtonGroup, SWT.RADIO);
		timeButton.setText("Time");
		testsButton = new Button(configButtonGroup, SWT.RADIO);
		testsButton.setText("Tests");
		bothButton = new Button(configButtonGroup, SWT.RADIO);
		bothButton.setText("Both");

		timeButton.setSelection(true);

		Composite configComposite = new Composite(composite, SWT.NONE);
		configComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		configComposite.setLayout(new GridLayout(2, false));
		studentNumProvider = createTextField(configComposite, "# students", "", new IntegerInputHandler(-1));
	}

	protected Axis studentAxis, valueAxis, exerciseAxis;

	@Override
	protected ChartWithAxes createChart(Collection<Resource> resources) {
		ChartWithAxes chart = ChartWithAxesImpl.create();
		chart.setDimension(ChartDimension.THREE_DIMENSIONAL_LITERAL);

		chart.getLegend().setItemType(LegendItemType.SERIES_LITERAL);
		chart.getLegend().setVisible(false);

		Text chartCaption = chart.getTitle().getLabel().getCaption();
		chartCaption.setValue("Student x exercise");
		chartCaption.getFont().setSize(14);
		String FONT_NAME = "Arial";
		chartCaption.getFont().setName(FONT_NAME);

		studentAxis = chart.getPrimaryBaseAxes()[0];
		Text studentCaption = studentAxis.getTitle().getCaption();
		studentCaption.getFont().setSize(12);
		studentCaption.getFont().setName(FONT_NAME);
		studentCaption.setValue("Students");
		studentAxis.getTitle().setVisible(false); // org.eclipse.birt.chart.render.AxesRenderHelper.renderHorizontalAxisTitle(AxesRenderHelper.java:1948)
		studentAxis.getLabel().setVisible(false);

		valueAxis = chart.getPrimaryOrthogonalAxis(studentAxis);
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
		studentAxis.getAncillaryAxes().add(exerciseAxis);

		Series studentSeries = SeriesImpl.create();
		studentSeries.setDataSet(TextDataSetImpl.create(new String[0]));
		SeriesDefinition studentSeriesDef = SeriesDefinitionImpl.create();
		studentSeriesDef.getSeries().add(studentSeries);
		studentAxis.getSeriesDefinitions().add(studentSeriesDef);

		Series exerciseSeries = SeriesImpl.create();
		exerciseSeries.setDataSet(TextDataSetImpl.create(new String[0]));
		SeriesDefinition exerciseSeriesDef = SeriesDefinitionImpl.create();
		exerciseSeriesDef.getSeries().add(exerciseSeries);
		exerciseAxis.getSeriesDefinitions().add(exerciseSeriesDef);

		return chart;
	}

	@Override
	protected void updateChart(ChartWithAxes chart, Collection<Resource> resources) {
		// sorted
		Map<String, Integer> allStudents = new TreeMap<String, Integer>();
		// unsorted
		Set<String> allExercises = new HashSet<String>();
		for (Resource resource : resources) {
			allStudents.put(ExResourcesChartView.getStudentId(resource), 0);
			allExercises.add(ExResourcesChartView.getExerciseId(resource));
		}
		List<Resource> sortedResources = new ArrayList<Resource>(resources);
		// same sorting as allStudents
		Collections.sort(sortedResources, new Comparator<Resource>() {
			@Override
			public int compare(Resource res1, Resource res2) {
				return ExResourcesChartView.getStudentId(res1).compareTo(ExResourcesChartView.getStudentId(res2));
			}
		});

		int maxStudents = studentNumProvider.getInput();
		List<String> studentValues = new ArrayList<String>();
		for (String student : allStudents.keySet()) {
			if (maxStudents > 0 && studentValues.size() >= maxStudents) {
				break;
			}
			studentValues.add(student);
		}

		Series studentSeries = studentAxis.getSeriesDefinitions().get(0).getSeries().get(0);
		String[] studentsArray = studentValues.toArray(new String[studentValues.size()]);
		Arrays.sort(studentsArray);
		studentSeries.getDataSet().setValues(studentsArray);
		
		Series exerciseSeries = exerciseAxis.getSeriesDefinitions().get(0).getSeries().get(0);
		String[] exerciseArray = allExercises.toArray(new String[allExercises.size()]);
		exerciseSeries.getDataSet().setValues(exerciseArray);

		SeriesDefinition valueSeriesDef = valueAxis.getSeriesDefinitions().get(0);
		valueSeriesDef.getSeries().clear();

		MatrixFactorizer factorizer = new MatrixFactorizer(studentsArray.length, exerciseArray.length, 1);
		int exerciseNum = 0;

		for (String exercise : allExercises) {
			double[] doubles = getExerciseStudentValues(exercise, studentValues, sortedResources);
			NumberDataSet values = NumberDataSetImpl.create(doubles);
			BarSeries valueSeries = (BarSeries) BarSeriesImpl.create();
			valueSeries.setDataSet(values);
			valueSeriesDef.getSeries().add(valueSeries);

			for (int i = 0; i < doubles.length; i++) {
				double value = doubles[i];
				factorizer.setAB(i, exerciseNum, (value > 0.0 ? value : -1));
			}
			exerciseNum++;
		}

		AbstractMatrix.fill(factorizer.getA(), 100.0, false);
		AbstractMatrix.fill(factorizer.getB(), 2.0, false);
		factorizer.factorize(10000, 0.01, factorizer.new GradientDescent(0.0005, 0.02));
		System.out.println(factorizer.getAB());
		System.out.println(factorizer.derive(factorizer.ESTIMATE_VALUE));
		System.out.println(factorizer.sum(factorizer.SQUARE_ERROR_VALUE));
		System.out.println(allExercises + ": " + factorizer.getA());
		System.out.println(factorizer.getB());
	}

	private AbstractTaskEventsValueProvider<? extends Number> timeValueProvider = EditTimeAccumulator.INSTANCE;
	private AbstractTaskEventsValueProvider<? extends Number> testValueProvider = TestCompletionTaskEventsValue.INSTANCE;

	protected double[] getExerciseStudentValues(String exercise, List<String> studentValues, Collection<Resource> resources) {
		double[] result = new double[studentValues.size()];
		String lastStudent = null;
		int studentNum = 0;
		for (Resource resource : resources) {
			String student = ExResourcesChartView.getStudentId(resource);
			if (lastStudent != null && (! student.equals(lastStudent))) {
				studentNum++;
				if (studentNum >= result.length) {
					break;
				}
			}
			if (exercise.equals(ExResourcesChartView.getExerciseId(resource))) {
				List<TaskEvent> taskEvents = Util.getAllEObjects(resource.getAllContents(), TaskEvent.class);
				Number time = (timeButton.getSelection() || bothButton.getSelection()
						? timeValueProvider.getTaskEventsValue(taskEvents) : null);
				Number test = (testsButton.getSelection() || bothButton.getSelection()
						? testValueProvider.getTaskEventsValue(taskEvents) : null);
				double value = 0.0;
				if (timeButton.getSelection() && time != null) {
					value = time.doubleValue();
				} else if (testsButton.getSelection() && test != null) {
					value = test.doubleValue();
				} else if (bothButton.getSelection() && time != null && test != null && test.doubleValue() != 0.0) {
					value = time.doubleValue() / test.doubleValue();
				}
				result[studentNum] = value;
			}
			lastStudent = student;
		}
		return result;
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
