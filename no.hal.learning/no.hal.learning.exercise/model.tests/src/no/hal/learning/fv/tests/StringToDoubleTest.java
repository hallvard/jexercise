/**
 */
package no.hal.learning.fv.tests;

import java.util.Map;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.learning.fv.FvFactory;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String To Double</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringToDoubleTest extends TestCase {

	/**
	 * The fixture for this String To Double test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, Double> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringToDoubleTest.class);
	}

	/**
	 * Constructs a new String To Double test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToDoubleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String To Double test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, Double> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String To Double test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, Double> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, Double>)FvFactory.eINSTANCE.create(FvPackage.Literals.STRING_TO_DOUBLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testIgnore() {
		// ignore
	}
	
} //StringToDoubleTest
