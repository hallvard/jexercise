package no.hal.learning.exercise.adm.plots.util;

import java.util.Arrays;

public class DistributionData {
	
	public String label;
	public double values[], max, average, variance, normalized[];
	public Integer[] valueClasses;
	
	public DistributionData(String label) {
		this.label = label;
	}
	
	public void init(double[] values) {
		this.values = values;
		double dataMax = Double.MIN_VALUE, dataSum = 0.0;
		for (int i = 0; i < this.values.length; i++) {
			dataMax = Math.max(dataMax, this.values[i]);
			dataSum += this.values[i];
		}
		this.max = dataMax;
		this.average = dataSum / this.values.length;
		double sum = 0.0, squareSum = 0.0;
		for (int i = 0; i < this.values.length; i++) {
			double value = this.values[i];
			sum += value;
			squareSum += value * value;
		}
		this.variance = (squareSum - (sum * sum) / this.values.length) / this.values.length;
		// normalize
		this.normalized = new double[this.values.length];
		for (int i = 0; i < this.values.length; i++) {
			this.normalized[i] = (this.values[i] - this.average) / variance;
		}
	}
	
	public void computeClasses(int numClasses, double max2) {
		this.valueClasses = new Integer[numClasses];
		Arrays.fill(this.valueClasses, Integer.valueOf(0));
		for (int i = 0; i < this.values.length; i++) {
			int valueClass = (int)(numClasses * this.values[i] / (max2 + 1));
			this.valueClasses[valueClass]++;
		}
	}
}
