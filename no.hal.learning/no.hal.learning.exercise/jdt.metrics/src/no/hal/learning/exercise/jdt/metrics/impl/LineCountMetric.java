package no.hal.learning.exercise.jdt.metrics.impl;

import no.hal.learning.exercise.jdt.metrics.AbstractMetricsProvider;
import no.hal.learning.fv.FeatureValued;

public class LineCountMetric extends AbstractMetricsProvider {

	@Override
	public FeatureValued computeMetrics(String source) {
		return createFeatureList("lines", "nonEmptyLines", countLines(source));
	}

	private double countLines(String source) {
		boolean newLine = true;
		int lineCount = 0;
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (c == '\n') {
				newLine = true;
			} else if (newLine && (! Character.isWhitespace(c))) {
				lineCount++;
				newLine = false;
			}
		}
		return lineCount;
	}
}
