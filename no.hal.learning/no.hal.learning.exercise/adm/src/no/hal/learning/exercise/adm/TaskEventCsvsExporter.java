package no.hal.learning.exercise.adm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import no.hal.learning.exercise.TaskEvent;
import no.hal.learning.exercise.util.Util;

public class TaskEventCsvsExporter extends AbstractExporter {

	private File directory;

	public void setDirectory(final File directory) {
		this.directory = directory;
	}

	@Override
	public void export(final Collection<Resource> resources) {
		exportTaskEventsAsCsv(directory, resources);
	}

	protected Map<EClass, Integer> getAllEClasses(final Collection<Resource> resources, final EClass superEClass) {
		final Map<EClass, Integer> eClasses = new HashMap<EClass, Integer>();
		for (final Resource resource : resources) {
			for (final TaskEvent taskEvent : Util.getAllEObjects(resource.getAllContents(), TaskEvent.class)) {
				if (superEClass == null || superEClass.isInstance(taskEvent)) {
					final EClass eClass = taskEvent.eClass();
					if (eClasses.containsKey(eClass)) {
						eClasses.put(eClass, eClasses.get(eClass) + 1);
					} else {
						eClasses.put(eClass, 1);
					}
				}
			}
		}
		return eClasses;
	}

	protected void exportTaskEventsAsCsv(final File dir, final Collection<Resource> resources) {
		final Map<EClass, Integer> allEClasses = getAllEClasses(resources, null);
		for (final EClass eClass : allEClasses.keySet()) {
			final File eventFile = new File(dir, eClass.getName() + ".csv");
			try {
				final PrintStream printer = new PrintStream(eventFile);
				exportTaskEventsAsCsv(resources, printer, eClass);
			} catch (final FileNotFoundException e) {
			}
		}
	}

	private final int gapDuration = 5; // 10 minutes
	private final long gapWidth = gapDuration * 60 * 1000; // 10 minutes

	protected void exportTaskEventsAsCsv(final Collection<Resource> resources, final PrintStream printer, final EClass... eClasses) {
		for (final EClass eClass : eClasses) {
			printer.print("eClass" + csvSeparator + "exId" + csvSeparator + "studId");
			final Collection<EAttribute> attrs = eClass.getEAllAttributes();
			for (final EAttribute attr : attrs) {
				printer.print(csvSeparator);
				printer.print(attr.getName());
			}
			printer.print(csvSeparator + "relativeTime");
			printer.println();
			for (final Resource resource : resources) {
				final String exerciseId = ExResourcesChartView.getExerciseId(resource), studentId = ExResourcesChartView.getStudentId(resource);
				long start = -1;
				final List<TaskEvent> taskEvents = Util.getAllEObjects(resource.getAllContents(), TaskEvent.class);
				Collections.sort(taskEvents, Util.TASK_EVENT_TIMESTAMP_COMPARATOR);
				final long[] gaps = computeGaps(taskEvents, gapWidth);
				for (final TaskEvent taskEvent : taskEvents) {
					if (start < 0) {
						start = taskEvent.getTimestamp();
					}
					if (eClass.isInstance(taskEvent)) {
						printer.print(eClass.getName());
						printer.print(csvSeparator);
						printer.print(exerciseId);
						printer.print(csvSeparator);
						printer.print(studentId);
						for (final EAttribute attr : attrs) {
							printer.print(csvSeparator);
							final Object value = taskEvent.eGet(attr);
							if (value != null) {
								final String s = String.valueOf(value);
								if (! s.contains("\n")) {
									printer.print(s);
								}
							}
						}
						printer.print(csvSeparator);
						printer.print(getRelativeTime(taskEvent.getTimestamp(), gaps, gapWidth) - start);
						printer.println();
					}
				}
			}
		}
	}

	protected long[] computeGaps(final List<TaskEvent> sortedTaskEvents, final long gapWidth) {
		int gapCount = 0;
		for (int i = 1; i < sortedTaskEvents.size(); i++) {
			final long diff = sortedTaskEvents.get(i).getTimestamp() - sortedTaskEvents.get(i - 1).getTimestamp();
			if (diff > gapWidth) {
				gapCount++;
			}
		}
		final long[] gaps = new long[gapCount * 2];
		gapCount = 0;
		for (int i = 1; i < sortedTaskEvents.size(); i++) {
			final long prevTime = sortedTaskEvents.get(i - 1).getTimestamp();
			final long nextTime = sortedTaskEvents.get(i).getTimestamp();
			if (nextTime - prevTime > gapWidth) {
				gaps[(gapCount * 2) + 0] = prevTime;
				gaps[(gapCount * 2) + 1] = nextTime;
				gapCount++;
			}
		}
		return gaps;
	}

	protected long getRelativeTime(final long time, final long[] gaps, final long gapWidth) {
		int pos = 0;
		long gapDiff = 0;
		while (pos < gaps.length) {
			final long start = gaps[pos], end = gaps[pos + 1];
			if (time <= start) {
				break;
			}
			final long gap = end - start;
			gapDiff += gap - gapWidth;
			pos += 2;
		}
		return time - gapDiff;
	}
}
