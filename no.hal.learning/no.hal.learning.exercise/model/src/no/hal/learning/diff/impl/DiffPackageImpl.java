/**
 */
package no.hal.learning.diff.impl;

import no.hal.learning.diff.DiffFactory;
import no.hal.learning.diff.DiffPackage;
import no.hal.learning.diff.PatchStringEdit;

import no.hal.learning.exercise.ExercisePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffPackageImpl extends EPackageImpl implements DiffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patchStringEditEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.learning.diff.DiffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiffPackageImpl() {
		super(eNS_URI, DiffFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiffPackage init() {
		if (isInited) return (DiffPackage)EPackage.Registry.INSTANCE.getEPackage(DiffPackage.eNS_URI);

		// Obtain or create and register package
		DiffPackageImpl theDiffPackage = (DiffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiffPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExercisePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDiffPackage.createPackageContents();

		// Initialize created meta-data
		theDiffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiffPackage.eNS_URI, theDiffPackage);
		return theDiffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatchStringEdit() {
		return patchStringEditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatchStringEdit_Patches() {
		return (EAttribute)patchStringEditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffFactory getDiffFactory() {
		return (DiffFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		patchStringEditEClass = createEClass(PATCH_STRING_EDIT);
		createEAttribute(patchStringEditEClass, PATCH_STRING_EDIT__PATCHES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExercisePackage theExercisePackage = (ExercisePackage)EPackage.Registry.INSTANCE.getEPackage(ExercisePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patchStringEditEClass.getESuperTypes().add(theExercisePackage.getRelativeStringEdit());

		// Initialize classes, features, and operations; add parameters
		initEClass(patchStringEditEClass, PatchStringEdit.class, "PatchStringEdit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatchStringEdit_Patches(), ecorePackage.getEString(), "patches", null, 0, -1, PatchStringEdit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DiffPackageImpl
