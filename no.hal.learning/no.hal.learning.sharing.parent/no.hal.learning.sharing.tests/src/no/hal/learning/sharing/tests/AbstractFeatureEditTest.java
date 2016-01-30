/**
 */
package no.hal.learning.sharing.tests;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.learning.sharing.AbstractFeatureEdit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Feature Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.learning.sharing.AbstractFeatureEdit#getStructuralFeature() <em>Get Structural Feature</em>}</li>
 *   <li>{@link no.hal.learning.sharing.AbstractFeatureEdit#getValue() <em>Get Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AbstractFeatureEditTest extends AbstractModelEditTest {

	/**
	 * Constructs a new Abstract Feature Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFeatureEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Feature Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractFeatureEdit getFixture() {
		return (AbstractFeatureEdit)fixture;
	}

	/**
	 * Tests the '{@link no.hal.learning.sharing.AbstractFeatureEdit#getStructuralFeature() <em>Get Structural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.AbstractFeatureEdit#getStructuralFeature()
	 * @generated NOT
	 */
	public void testGetStructuralFeature() {
		EmfsResource emfsResource = (EmfsResource) EcoreUtil.create(EmfsPackage.eINSTANCE.getEmfsResource());
		AbstractFeatureEdit edit = getFixture();
		edit.setEObject(emfsResource);
		edit.setFeature("name");
		Assert.assertEquals(EmfsPackage.eINSTANCE.getEmfsResource_Name(), edit.getStructuralFeature());
	}

	/**
	 * Tests the '{@link no.hal.learning.sharing.AbstractFeatureEdit#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.sharing.AbstractFeatureEdit#getValue()
	 * @generated NOT
	 */
	public void testGetValue() {
		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
	}
	
} //AbstractFeatureEditTest
