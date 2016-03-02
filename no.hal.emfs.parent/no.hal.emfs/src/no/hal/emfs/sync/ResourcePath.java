/**
 */
package no.hal.emfs.sync;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Path</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.emfs.sync.SyncPackage#getResourcePath()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourcePath extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getPath();

} // ResourcePath
