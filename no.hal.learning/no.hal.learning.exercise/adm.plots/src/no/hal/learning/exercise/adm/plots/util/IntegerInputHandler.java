package no.hal.learning.exercise.adm.plots.util;

public class IntegerInputHandler extends TextInputHandler<Integer> {

	public final static TextInputHandler<Integer> INSTANCE = new IntegerInputHandler();
	
	private Integer defaultValue;
	
	public IntegerInputHandler(Integer defaultValue) {
		this.defaultValue = defaultValue;
	}
	public IntegerInputHandler() {
		this(null);
	}

	@Override
	public String isValid(String newText) {
		try {
			Integer.valueOf(newText);
		} catch (NumberFormatException e) {
			return e.getMessage();
		}
		return null;
	}

	@Override
	public Integer toValue(String s) {
		try {
			return Integer.valueOf(s);
		} catch (NumberFormatException e) {
		}
		return defaultValue;
	}
}
