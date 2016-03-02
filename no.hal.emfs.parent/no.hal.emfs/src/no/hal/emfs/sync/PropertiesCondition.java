/**
 */
package no.hal.emfs.sync;

import no.hal.emfs.Property;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.PropertiesCondition#getIncludes <em>Includes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PropertiesCondition#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getPropertiesCondition()
 * @model
 * @generated
 */
public interface PropertiesCondition extends ResourceCondition {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPropertiesCondition_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getIncludes();

	/**
	 * Returns the value of the '<em><b>Excludes</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPropertiesCondition_Excludes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getExcludes();

} // PropertiesCondition
