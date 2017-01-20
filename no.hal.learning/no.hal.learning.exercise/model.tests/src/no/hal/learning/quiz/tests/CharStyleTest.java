/**
 */
package no.hal.learning.quiz.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.learning.quiz.CharStyle;
import no.hal.learning.quiz.QuizFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Char Style</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CharStyleTest extends TestCase {

	/**
	 * The fixture for this Char Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharStyle fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CharStyleTest.class);
	}

	/**
	 * Constructs a new Char Style test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharStyleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Char Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CharStyle fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Char Style test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharStyle getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createCharStyle());
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

} //CharStyleTest
