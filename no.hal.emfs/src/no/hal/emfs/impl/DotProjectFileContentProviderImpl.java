/**
 */
package no.hal.emfs.impl;

import java.util.Collection;
import no.hal.emfs.DotProjectFileContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dot Project File Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.DotProjectFileContentProviderImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link no.hal.emfs.impl.DotProjectFileContentProviderImpl#getLinkedResources <em>Linked Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DotProjectFileContentProviderImpl extends AbstractStringContentProviderImpl implements DotProjectFileContentProvider {
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<String> keys;

	/**
	 * The cached value of the '{@link #getLinkedResources() <em>Linked Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<EmfsResource> linkedResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DotProjectFileContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.DOT_PROJECT_FILE_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getKeys() {
		if (keys == null) {
			keys = new EDataTypeUniqueEList<String>(String.class, this, EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmfsResource> getLinkedResources() {
		if (linkedResources == null) {
			linkedResources = new EObjectResolvingEList<EmfsResource>(EmfsResource.class, this, EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES);
		}
		return linkedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS:
				return getKeys();
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES:
				return getLinkedResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends String>)newValue);
				return;
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES:
				getLinkedResources().clear();
				getLinkedResources().addAll((Collection<? extends EmfsResource>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS:
				getKeys().clear();
				return;
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES:
				getLinkedResources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS:
				return keys != null && !keys.isEmpty();
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES:
				return linkedResources != null && !linkedResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (keys: ");
		result.append(keys);
		result.append(')');
		return result.toString();
	}
	
	//
	
	@Override
	public String getStringContent() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<projectDescription>\n");
		String name = "name", comment = "";
		buffer.append("\t<name>" + name + "</name>\n");
		buffer.append("\t<comment>" + comment + "</comment>\n");

		buffer.append("\t<natures>\n");
		appendTags("org.eclipse.core.resources.natures", "\t\t<nature>", "</nature>\n", buffer);
		buffer.append("\t</natures>\n");

		buffer.append("\t<buildSpec>\n");
		appendTags("org.eclipse.core.resources.builders", "\t\t<buildCommand>\n\t\t\t<name>", "</name>\n\t\t</buildCommand>\n", buffer);
		buffer.append("\t</buildSpec>\n");

		buffer.append("</projectDescription>\n");
		return buffer.toString();
	}

	private void appendTags(String annotationKey, String prefix, String suffix, StringBuilder buffer) {
		appendTags(getKeys(), annotationKey, prefix, suffix, buffer);
		appendTags(getFile().getTags(), annotationKey, prefix, suffix, buffer);
	}
	
	private void appendTags(Collection<String> keys, String annotationKey, String prefix, String suffix, StringBuilder buffer) {
		for (String key : keys) {
			String[] values = getAnnotations(this.eClass(), annotationKey, key);
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					buffer.append(prefix);
					buffer.append(values[i]);
					buffer.append(suffix);
				}
			}
		}
	}
	
	private String[] getAnnotations(ENamedElement element, String annotationKey, String key) {
		EAnnotation annotations = element.getEAnnotation(annotationKey);
		String value = annotations.getDetails().get(key);
		return (value != null ? value.split(",") : null);
	}

} //DotProjectFileContentImpl
