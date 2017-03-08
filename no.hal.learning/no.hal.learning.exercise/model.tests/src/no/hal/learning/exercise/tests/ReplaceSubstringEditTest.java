/**
 */
package no.hal.learning.exercise.tests;

import org.junit.Assert;

import junit.textui.TestRunner;
import no.hal.learning.exercise.ExerciseFactory;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.ReplaceSubstringEdit;
import no.hal.learning.exercise.StringEdit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Replace Substring Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplaceSubstringEditTest extends StringEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReplaceSubstringEditTest.class);
	}

	/**
	 * Constructs a new Replace Substring Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceSubstringEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Replace Substring Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReplaceSubstringEdit getFixture() {
		return (ReplaceSubstringEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExerciseFactory.eINSTANCE.createReplaceSubstringEdit());
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

	//

	@Override
	public void testGetString() {
		// test base case
		StringEdit baseEdit = ExerciseFactory.eINSTANCE.createStringEdit();
		baseEdit.setStoredString("Java er gøy");
		Assert.assertEquals("Java er gøy", baseEdit.getString());

		ReplaceSubstringEdit edit = getFixture();
		edit.setEdit(baseEdit);
		
		// deletions
		edit.setStart(5);
		edit.setEnd(8);
		Assert.assertEquals("Java gøy", edit.getString());
		edit.setEnd(-4);
		Assert.assertEquals("Java gøy", edit.getString());
		
		edit.setStart(0);
		edit.setEnd(8);
		Assert.assertEquals("gøy", edit.getString());
		edit.setEnd(-4);
		Assert.assertEquals("gøy", edit.getString());

		edit.setStart(5);
		edit.setEnd(-1);
		Assert.assertEquals("Java ", edit.getString());

		// replacements
		edit.setStoredString("kjempe");
		edit.setStart(5);
		edit.setEnd(8);
		Assert.assertEquals("Java kjempegøy", edit.getString());
		edit.setEnd(-4);
		Assert.assertEquals("Java kjempegøy", edit.getString());
		
		edit.setStart(0);
		edit.setEnd(8);
		Assert.assertEquals("kjempegøy", edit.getString());
		edit.setEnd(-4);
		Assert.assertEquals("kjempegøy", edit.getString());
		
		edit.setStart(5);
		edit.setEnd(-1);
		Assert.assertEquals("Java kjempe", edit.getString());
		
		// insertions
		edit.setStart(8);
		edit.setEnd(8);
		Assert.assertEquals("Java er kjempegøy", edit.getString());
		edit.setEnd(-4);
		Assert.assertEquals("Java er kjempegøy", edit.getString());
		
		edit.setStart(0);
		edit.setEnd(0);
		Assert.assertEquals("kjempeJava er gøy", edit.getString());
		edit.setEnd(-12);
		Assert.assertEquals("kjempeJava er gøy", edit.getString());
		
		edit.setStart(11);
		edit.setEnd(-1);
		Assert.assertEquals("Java er gøykjempe", edit.getString());
	}

	@Override
	public void testInitStringEdit__String_AbstractStringEdit() {
		super.testInitStringEdit__String_AbstractStringEdit(ExercisePackage.eINSTANCE.getReplaceSubstringEdit(), INITIAL_STRING, TEST_STRINGS);
	}

} //ReplaceSubstringEditTest
