package no.hal.learning.exercise.adm.plots.util;

public class DoubleInputHandler extends TextInputHandler<Double> {

	public final static TextInputHandler<Double> INSTANCE = new DoubleInputHandler();

	@Override
	public String isValid(String newText) {
		try {
			Double.valueOf(newText);
		} catch (NumberFormatException e) {
			return e.toString();
		}
		return null;
	}

	@Override
	public Double toValue(String s) {
		try {
			return Double.valueOf(s);
		} catch (NumberFormatException e) {
		}
		return null;
	}
}
