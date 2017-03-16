/**
 */
package no.hal.learning.diff;

import no.hal.learning.exercise.ExercisePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.learning.diff.DiffFactory
 * @model kind="package"
 * @generated
 */
public interface DiffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.model/model/diff.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffPackage eINSTANCE = no.hal.learning.diff.impl.DiffPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.diff.impl.PatchStringEditImpl <em>Patch String Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.diff.impl.PatchStringEditImpl
	 * @see no.hal.learning.diff.impl.DiffPackageImpl#getPatchStringEdit()
	 * @generated
	 */
	int PATCH_STRING_EDIT = 0;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_STRING_EDIT__EDIT = ExercisePackage.RELATIVE_STRING_EDIT__EDIT;

	/**
	 * The feature id for the '<em><b>Patches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_STRING_EDIT__PATCHES = ExercisePackage.RELATIVE_STRING_EDIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Patch String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_STRING_EDIT_FEATURE_COUNT = ExercisePackage.RELATIVE_STRING_EDIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_STRING_EDIT___GET_STRING = ExercisePackage.RELATIVE_STRING_EDIT___GET_STRING;

	/**
	 * The operation id for the '<em>Init String Edit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT = ExercisePackage.RELATIVE_STRING_EDIT___INIT_STRING_EDIT__STRING_ABSTRACTSTRINGEDIT;

	/**
	 * The number of operations of the '<em>Patch String Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATCH_STRING_EDIT_OPERATION_COUNT = ExercisePackage.RELATIVE_STRING_EDIT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.diff.PatchStringEdit <em>Patch String Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patch String Edit</em>'.
	 * @see no.hal.learning.diff.PatchStringEdit
	 * @generated
	 */
	EClass getPatchStringEdit();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.diff.PatchStringEdit#getPatches <em>Patches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patches</em>'.
	 * @see no.hal.learning.diff.PatchStringEdit#getPatches()
	 * @see #getPatchStringEdit()
	 * @generated
	 */
	EAttribute getPatchStringEdit_Patches();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiffFactory getDiffFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.learning.diff.impl.PatchStringEditImpl <em>Patch String Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.diff.impl.PatchStringEditImpl
		 * @see no.hal.learning.diff.impl.DiffPackageImpl#getPatchStringEdit()
		 * @generated
		 */
		EClass PATCH_STRING_EDIT = eINSTANCE.getPatchStringEdit();

		/**
		 * The meta object literal for the '<em><b>Patches</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATCH_STRING_EDIT__PATCHES = eINSTANCE.getPatchStringEdit_Patches();

	}

} //DiffPackage
