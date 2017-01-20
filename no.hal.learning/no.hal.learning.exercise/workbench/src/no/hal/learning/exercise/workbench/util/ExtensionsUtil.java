package no.hal.learning.exercise.workbench.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import no.hal.learning.exercise.workbench.WorkbenchTaskAnswer;

public class ExtensionsUtil {
	
	public static boolean isKnownExtensionId(String id, String extensionPoint, String elementName, String idAttribute) {
		if (idAttribute == null) {
			idAttribute = "id";
		}
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPoint);
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
			if (elementName.equals(element.getName())) {
				try {
					String exId = element.getAttribute(idAttribute);
					if (id.equals(exId)) {
						return true;
					}
				} catch (Exception e) {
				}
			}
		}
		return false;
	}

	public static boolean isKnownExtensionId(WorkbenchTaskAnswer taskAnswer, String extensionPoint, String elementName, String idAttribute) {
		return isKnownExtensionId(taskAnswer.getElementId(), extensionPoint, elementName, idAttribute);
	}
	
	public static List<String> getExtensionIds(String idPrefix, String extensionPoint, String elementName, String idAttribute, List<String> ids) {
		if (idAttribute == null) {
			idAttribute = "id";
		}
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(extensionPoint);
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement element = elements[i];
			if (elementName.equals(element.getName())) {
				try {
					String exId = element.getAttribute(idAttribute);
					if (! ids.contains(exId)) {
						if (idPrefix == null || exId.startsWith(idPrefix)) {
							ids.add(exId);
						}
					}
				} catch (Exception e) {
				}
			}
		}
		Collections.sort(ids);
		return ids;
	}

	public static List<String> getExtensionIds(String idPrefix, String extensionPoint, String elementName, String idAttribute) {
		return getExtensionIds(idPrefix, extensionPoint, elementName, idAttribute, new ArrayList<String>());
	}
}
