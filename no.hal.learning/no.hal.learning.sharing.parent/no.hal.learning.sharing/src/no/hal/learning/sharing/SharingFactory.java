/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.sharing.SharingPackage
 * @generated
 */
public interface SharingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SharingFactory eINSTANCE = no.hal.learning.sharing.impl.SharingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Share</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Share</em>'.
	 * @generated
	 */
	AbstractShare createAbstractShare();

	/**
	 * Returns a new object of class '<em>Abstract Attribute Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Attribute Edit</em>'.
	 * @generated
	 */
	AbstractAttributeEdit createAbstractAttributeEdit();

	/**
	 * Returns a new object of class '<em>Abstract Reference Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Reference Edit</em>'.
	 * @generated
	 */
	AbstractReferenceEdit createAbstractReferenceEdit();

	/**
	 * Returns a new object of class '<em>Set Attribute Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Attribute Edit</em>'.
	 * @generated
	 */
	SetAttributeEdit createSetAttributeEdit();

	/**
	 * Returns a new object of class '<em>Set Reference Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Reference Edit</em>'.
	 * @generated
	 */
	SetReferenceEdit createSetReferenceEdit();

	/**
	 * Returns a new object of class '<em>Add Attribute Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Attribute Edit</em>'.
	 * @generated
	 */
	AddAttributeEdit createAddAttributeEdit();

	/**
	 * Returns a new object of class '<em>Add Reference Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Reference Edit</em>'.
	 * @generated
	 */
	AddReferenceEdit createAddReferenceEdit();

	/**
	 * Returns a new object of class '<em>Remove Feature Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Feature Edit</em>'.
	 * @generated
	 */
	RemoveFeatureEdit createRemoveFeatureEdit();

	/**
	 * Returns a new object of class '<em>Change Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Edit</em>'.
	 * @generated
	 */
	ChangeEdit createChangeEdit();

	/**
	 * Returns a new object of class '<em>Share Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Share Model</em>'.
	 * @generated
	 */
	ShareModel createShareModel();

	/**
	 * Returns a new object of class '<em>Share Edits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Share Edits</em>'.
	 * @generated
	 */
	ShareEdits createShareEdits();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SharingPackage getSharingPackage();

} //SharingFactory
