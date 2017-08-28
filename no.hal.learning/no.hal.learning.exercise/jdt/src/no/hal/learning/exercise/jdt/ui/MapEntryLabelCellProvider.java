package no.hal.learning.exercise.jdt.ui;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

public class MapEntryLabelCellProvider extends CellLabelProvider {
	
	private final Boolean keyOrValue;
	private final Class<?> itemClass;
	private String separator = null;
	
	public MapEntryLabelCellProvider(Boolean keyOrValue, Class<?> itemClass) {
		this.keyOrValue = keyOrValue;
		this.itemClass = itemClass;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	@Override
	public void update(ViewerCell cell) {
		Entry<?, ?> entry = (Map.Entry<?, ?>) cell.getElement();
		String text = "";
		if (keyOrValue == null) {
			if (itemClass == null || itemClass.isInstance(entry.getValue())) {
				text = formatKey(entry.getKey()) + (separator != null ? separator : "") + formatValue(entry.getValue());
			}
		} else if (keyOrValue) {
			if (itemClass == null || itemClass.isInstance(entry.getKey())) {
				text = formatKey(entry.getKey()) + (separator != null ? separator : "");			
			}
		} else if (itemClass == null || itemClass.isInstance(entry.getValue())) {
			text = formatValue(entry.getValue());
		} 
		cell.setText(text);
	}
	
	protected String formatKey(String text) {
		return text;
	}
	protected String formatKey(Object key) {
		return formatKey(String.valueOf(key));
	}
	
	protected String formatValue(String text) {
		return text;
	}
	protected String formatValue(Object value) {
		return formatValue(String.valueOf(value));
	}
	
	//
	
	protected String wordify(String text, Boolean casify) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (i == 0 || (Character.isUpperCase(c) && Character.isLowerCase(text.charAt(i - 1)))) {
				if (i > 0) {
					buffer.append(' ');
				}
				if (casify != null) {
					c = (casify ? Character.toUpperCase(c) : Character.toLowerCase(c));
				}
			}
			buffer.append(c);
		}
		return buffer.toString();
	}
}
