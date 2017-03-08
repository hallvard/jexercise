package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.jface.dialogs.IInputValidator;

public abstract class TextInputHandler<T> implements IInputValidator {

	public String toString(T t) {
		return (t != null ? t.toString() : "");
	}
	public abstract T toValue(String s);
}
