/**
 */
package no.hal.emfs.sync;

import no.hal.emfs.EmfsResource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.emfs.sync.SyncPackage#getResourceCondition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceCondition extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean accept(EmfsResource resource);

} // SourceCondition
