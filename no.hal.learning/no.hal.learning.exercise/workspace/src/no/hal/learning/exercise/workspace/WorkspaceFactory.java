/**
 */
package no.hal.learning.exercise.workspace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.workspace.WorkspacePackage
 * @generated
 */
public interface WorkspaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkspaceFactory eINSTANCE = no.hal.learning.exercise.workspace.impl.WorkspaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source File Edit Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source File Edit Answer</em>'.
	 * @generated
	 */
	SourceFileEditAnswer createSourceFileEditAnswer();

	/**
	 * Returns a new object of class '<em>Source File Edit Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source File Edit Proposal</em>'.
	 * @generated
	 */
	SourceFileEditProposal createSourceFileEditProposal();

	/**
	 * Returns a new object of class '<em>Source File Edit Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source File Edit Event</em>'.
	 * @generated
	 */
	SourceFileEditEvent createSourceFileEditEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkspacePackage getWorkspacePackage();

} //WorkspaceFactory
