/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.common.command.Command;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.learning.sharing.SharingPackage#getModelEdit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelEdit extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performEdit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="no.hal.lecture.sharing.ECommand" editingDomainDataType="no.hal.lecture.sharing.EEditingDomain"
	 * @generated
	 */
	Command createEditCommand(EditingDomain editingDomain);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model uriDataType="no.hal.lecture.sharing.EURI"
	 * @generated
	 */
	Resource createSerializableEdit(URI uri);

} // ModelEdit
