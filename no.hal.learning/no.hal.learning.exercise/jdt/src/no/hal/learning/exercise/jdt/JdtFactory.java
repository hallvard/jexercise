/**
 */
package no.hal.learning.exercise.jdt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.jdt.JdtPackage
 * @generated
 */
public interface JdtFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JdtFactory eINSTANCE = no.hal.learning.exercise.jdt.impl.JdtFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Edit Answer</em>'.
	 * @generated
	 */
	JdtSourceEditAnswer createJdtSourceEditAnswer();

	/**
	 * Returns a new object of class '<em>Source Edit Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Edit Proposal</em>'.
	 * @generated
	 */
	JdtSourceEditProposal createJdtSourceEditProposal();

	/**
	 * Returns a new object of class '<em>Source Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Edit Event</em>'.
	 * @generated
	 */
	JdtSourceEditEvent createJdtSourceEditEvent();

	/**
	 * Returns a new object of class '<em>Marker Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marker Info</em>'.
	 * @generated
	 */
	JdtMarkerInfo createJdtMarkerInfo();

	/**
	 * Returns a new object of class '<em>Launch Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Answer</em>'.
	 * @generated
	 */
	JdtLaunchAnswer createJdtLaunchAnswer();

	/**
	 * Returns a new object of class '<em>Launch Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Proposal</em>'.
	 * @generated
	 */
	JdtLaunchProposal createJdtLaunchProposal();

	/**
	 * Returns a new object of class '<em>Launch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Launch Event</em>'.
	 * @generated
	 */
	JdtLaunchEvent createJdtLaunchEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JdtPackage getJdtPackage();

} //JdtFactory
