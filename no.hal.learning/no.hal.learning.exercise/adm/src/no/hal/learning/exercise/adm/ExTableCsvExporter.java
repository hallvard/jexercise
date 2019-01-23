package no.hal.learning.exercise.adm;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;

public class ExTableCsvExporter extends AbstractExporter {

	@Override
	public void export(final Collection<Resource> resources) {
		exportExTableAsCsv(resources, System.out);
	}

	private Collection<ExResourcesChartView.ExViewerColumnData> exViewerColumns;

	public void setExViewerColumns(final Collection<ExResourcesChartView.ExViewerColumnData> exViewerColumns) {
		this.exViewerColumns = exViewerColumns;
	}

	protected void exportExTableAsCsv(final Collection<Resource> resources, final PrintStream printer) {
		// print headers
		printer.print("exId" + csvSeparator + "studId");
		int columnNum = 0;
		final Collection<ExResourcesChartView.ExViewerColumnData> viewerColumns = new ArrayList<ExResourcesChartView.ExViewerColumnData>(exViewerColumns);
		final Iterator<ExResourcesChartView.ExViewerColumnData> it = viewerColumns.iterator();
		while (it.hasNext()) {
			final ExResourcesChartView.ExViewerColumnData columnData = it.next();
			if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel) {
				if (columnData.columnName != null) {
					if (columnNum > 0) {
						printer.print(csvSeparator);
					}
					printer.print(columnData.columnName);
				} else {
					it.remove();
				}
			}
			columnNum++;
		}
		// print rows
		for (final Resource resource : resources) {
			printer.print(ExResourcesChartView.getExerciseId(resource));
			printer.print(csvSeparator);
			printer.print(ExResourcesChartView.getStudentId(resource));
			columnNum = 0;
			for (final ExResourcesChartView.ExViewerColumnData columnData : viewerColumns) {
				if (columnData.cellLabelProvider instanceof AbstractTaskEventsCellLabel) {
					if (columnNum > 0) {
						printer.print(csvSeparator);
					}
					final AbstractTaskEventsCellLabel<?> cellLabel = (AbstractTaskEventsCellLabel<?>) columnData.cellLabelProvider;
					final String s = cellLabel.getTaskEventsText(resource);
					printer.print(s);
				}
				columnNum++;
			}
			printer.println();
		}
	}
}
