/**
 */
package no.hal.emfs.sync;

import no.hal.emfs.EmfsResource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.PortSpec#getRules <em>Rules</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PortSpec#getResources <em>Resources</em>}</li>
 *   <li>{@link no.hal.emfs.sync.PortSpec#getResourceRefs <em>Resource Refs</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.sync.SyncPackage#getPortSpec()
 * @model
 * @generated
 */
public interface PortSpec<R extends PathRule<R>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPortSpec_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<R> getRules();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.EmfsResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPortSpec_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmfsResource> getResources();

	/**
	 * Returns the value of the '<em><b>Resource Refs</b></em>' reference list.
	 * The list contents are of type {@link no.hal.emfs.EmfsResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Refs</em>' reference list.
	 * @see no.hal.emfs.sync.SyncPackage#getPortSpec_ResourceRefs()
	 * @model
	 * @generated
	 */
	EList<EmfsResource> getResourceRefs();

} // PortSpec
