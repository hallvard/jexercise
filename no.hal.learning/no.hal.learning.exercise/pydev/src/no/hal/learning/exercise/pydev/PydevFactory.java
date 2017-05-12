/**
 */
package no.hal.learning.exercise.pydev;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.pydev.PydevPackage
 * @generated
 */
public interface PydevFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PydevFactory eINSTANCE = no.hal.learning.exercise.pydev.impl.PydevFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Edit Answer</em>'.
	 * @generated
	 */
	PydevSourceEditAnswer createPydevSourceEditAnswer();

	/**
	 * Returns a new object of class '<em>Source Edit Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Edit Proposal</em>'.
	 * @generated
	 */
	PydevSourceEditProposal createPydevSourceEditProposal();

	/**
	 * Returns a new object of class '<em>Source Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Edit Event</em>'.
	 * @generated
	 */
	PydevSourceEditEvent createPydevSourceEditEvent();

	/**
	 * Returns a new object of class '<em>Marker Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marker Info</em>'.
	 * @generated
	 */
	PydevMarkerInfo createPydevMarkerInfo();

	/**
	 * Returns a new object of class '<em>Launch Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Answer</em>'.
	 * @generated
	 */
	PydevLaunchAnswer createPydevLaunchAnswer();

	/**
	 * Returns a new object of class '<em>Launch Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Proposal</em>'.
	 * @generated
	 */
	PydevLaunchProposal createPydevLaunchProposal();

	/**
	 * Returns a new object of class '<em>Launch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Event</em>'.
	 * @generated
	 */
	PydevLaunchEvent createPydevLaunchEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PydevPackage getPydevPackage();

} //PydevFactory
