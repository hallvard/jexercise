/**
 */
package no.hal.learning.diff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.diff.DiffPackage
 * @generated
 */
public interface DiffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffFactory eINSTANCE = no.hal.learning.diff.impl.DiffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Patch String Edit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patch String Edit</em>'.
	 * @generated
	 */
	PatchStringEdit createPatchStringEdit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiffPackage getDiffPackage();

} //DiffFactory
