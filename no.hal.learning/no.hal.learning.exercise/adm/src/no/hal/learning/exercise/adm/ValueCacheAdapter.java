package no.hal.learning.exercise.adm;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class ValueCacheAdapter extends AdapterImpl {

	private List<Object> keyValues = null;
	
	private int valuePos(Object key, Class<?> valueClass) {
		if (keyValues != null) {
			for (int i = 0; i < keyValues.size(); i += 2) {
				if (keyValues.get(i).equals(key)) {
					Object value = keyValues.get(i + 1);
					if (valueClass == null || valueClass.isInstance(value)) {
						return i; 
					}
				}
			}
		}
		return -1;
	}
	
	public void clearCache() {
		keyValues.clear();
		keyValues = null;
	}
	
	public boolean hasValue(Object key) {
		return valuePos(key, null) >= 0;
	}

	public Object getValue(Object key) {
		int pos = valuePos(key, null);
		return (pos >= 0 ? keyValues.get(pos + 1) : null);
	}
	
	public void putValue(Object key, Object value) {
		if (keyValues == null) {
			keyValues = new ArrayList<Object>();
		}
		int pos = valuePos(key, null);
		if (pos >= 0) {
			keyValues.set(pos + 1, value);
		} else {
			keyValues.add(key);
			keyValues.add(value);
		}
	}
}
