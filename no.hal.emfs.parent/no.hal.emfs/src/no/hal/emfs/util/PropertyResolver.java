package no.hal.emfs.util;

import no.hal.emfs.Property;
import no.hal.emfs.PropertyOwner;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class PropertyResolver {

	private boolean includeFeatures, includeContainer, includeResource;
	
	public PropertyResolver(boolean includeFeatures, boolean includeContainer) {
		super();
		this.includeFeatures = includeFeatures;
		this.includeContainer = includeContainer;
	}

	public PropertyResolver(boolean includeFeatures, boolean includeContainer, boolean includeResource) {
		this(includeFeatures, includeContainer);
		this.includeResource = includeResource;
	}

	public static Property findProperty(EObject eObject, String propertyName) {
		if (eObject instanceof PropertyOwner) {
			PropertyOwner propertyOwner = (PropertyOwner) eObject;
			for (Property property : propertyOwner.getProperties()) {
				if (propertyName.equals(property.getName())) {
					return property;
				}
			}
		}
		return null;
	}

	public static boolean hasProperty(EObject eObject, String propertyName) {
		return findProperty(eObject, propertyName) != null;
	}
	
	protected Object getPropertyValue(Property property) {
		Object result = property.getValue();
		if (result == null) {
			result = property.getERef();
		}
		if (result == null) {
			result = property.getEObject();
		}
		return result;
	}
	
	public Property getProperty(EObject eObject, String propertyName) {
		while (! (eObject instanceof PropertyOwner)) {
			if (eObject == null) {
				return null;
			}
			eObject = eObject.eContainer();
		}
		PropertyOwner propertyOwner = (PropertyOwner) eObject;
		Property property = findProperty(propertyOwner, propertyName);
		if (property != null) {
			Object value = getPropertyValue(property);
			if (value != null) {
				return property;
			}
		}
		if (includeContainer && propertyOwner.eContainer() instanceof PropertyOwner) {
			property = getProperty(((PropertyOwner) propertyOwner.eContainer()), propertyName);
			if (property != null) {
				return property;
			}
		}
		return null;
	}
	
	public Object getPropertyValue(EObject eObject, String propertyName) {
		while (! (eObject instanceof PropertyOwner)) {
			if (eObject == null) {
				return null;
			}
			eObject = eObject.eContainer();
		}
		PropertyOwner propertyOwner = (PropertyOwner) eObject;
		Property property = findProperty(propertyOwner, propertyName);
		if (property != null) {
			Object value = getPropertyValue(property);
			if (value != null) {
				return property;
			}
		}
		if (includeFeatures) {
			EStructuralFeature feature = propertyOwner.eClass().getEStructuralFeature(propertyName);
			if (feature != null) {
				Object value = propertyOwner.eGet(feature);
				if (value != null) {
					return value; 
				}
			}
		}
		if (includeContainer && propertyOwner.eContainer() instanceof PropertyOwner) {
			Object value = getPropertyValue(((PropertyOwner) propertyOwner.eContainer()), propertyName);
			if (value != null) {
				return value;
			}
		}
		if (includeResource && propertyOwner.eResource() != null) {
			Resource resource = propertyOwner.eResource();
			if (resource != null && resource.getResourceSet() != null) {
				Object value = resource.getResourceSet().getLoadOptions().get(propertyName);
				if (value != null) {
					return String.valueOf(value);
				}
			}
		}
		return null;
	}
	
	public static String resolveProperties(String s, EObject eObject, PropertyResolver propertyResolver) {
		StringBuilder builder = null;
		int start = 0;
		while (start < s.length()) {
			int pos1 = s.indexOf("$", start);
			if (pos1 < 0) {
				if (builder != null) {
					builder.append(s.substring(start));
				}
				break;
			} else {
				if (builder == null) {
					builder = new StringBuilder();
				}
				builder.append(s.substring(start, pos1));
				pos1++;
				if (pos1 < s.length() && s.charAt(pos1) == '{') {
					int pos2 = s.indexOf('}', pos1 + 1);
					if (pos2 >= pos1) {
						String propertyName = s.substring(pos1 + 1, pos2);
						start = pos2 + 1;
						Object propertyValue = propertyResolver.getPropertyValue(eObject, propertyName);
						if (propertyValue != null) {
							builder.append(propertyValue);
						}
					}
				} else {
					int pos2 = pos1;
					while (pos2 < s.length() && (Character.isLetterOrDigit(s.charAt(pos2)) || "-_.".indexOf(s.charAt(pos2)) >= 0)) {
						pos2++;
					}
					String propertyName = s.substring(pos1, pos2);
					start = pos2;
					Object propertyValue = propertyResolver.getPropertyValue(eObject, propertyName);
					if (propertyValue != null) {
						builder.append(propertyValue);
					}
				}
			}
		}
		return (builder != null ? builder.toString() : s);
	}
//
//	public static void main(String[] args) {
//		PropertyResolver propertyResolver = new PropertyResolver(false, false) {
//			@Override
//			public Object getProperty(PropertyOwner propertyOwner, String propertyName) {
//				if ("hei".equals(propertyName)) {
//					return "HEI";
//				}
//				return null;
//			}
//		};
//		System.out.println(resolveProperties("$hei${hei}pa${deg}!", null, propertyResolver));
//		System.out.println(resolveProperties("si$hei/${deg}pa${hei}", null, propertyResolver));
//		System.out.println(resolveProperties("si$hei/${deg}pa$hei", null, propertyResolver));
//	}
}
