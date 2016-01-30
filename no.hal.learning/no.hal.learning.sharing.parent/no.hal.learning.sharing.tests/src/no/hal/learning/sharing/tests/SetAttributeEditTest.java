/**
 */
package no.hal.learning.sharing.tests;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.junit.Assert;

import junit.textui.TestRunner;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsAdapterFactory;
import no.hal.emfs.util.EmfsResourceImpl;
import no.hal.learning.sharing.AbstractAttributeEdit;
import no.hal.learning.sharing.SetAttributeEdit;
import no.hal.learning.sharing.SharingFactory;
import no.hal.learning.sharing.tests.util.TestHelper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Attribute Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetAttributeEditTest extends SetFeatureEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SetAttributeEditTest.class);
	}

	/**
	 * Constructs a new Set Attribute Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAttributeEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Set Attribute Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SetAttributeEdit getFixture() {
		return (SetAttributeEdit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		testHelper = new TestHelper();
		setFixture(SharingFactory.eINSTANCE.createSetAttributeEdit());
	}

	private TestHelper testHelper;

	protected EmfsResource setUpCardClassEdit(String featureName, Object newValue) {
		AbstractAttributeEdit edit = getFixture();
		EmfsResource emfsResource = testHelper.loadEmfsResource("card1.xemfs", this);
		EmfsResource cardClass = EmfsResourceImpl.getEmfsResource(emfsResource.eResource(), "/src/objectstructures/Card.java");
		edit.setEObject(cardClass);
		edit.setFeature(featureName);
		edit.setValue(newValue);
		return cardClass;
	}
	
	@Override
	public void testGetValue() {
		getFixture().setValue("value");
		Assert.assertEquals("value", getFixture().getValue());
	}
	
	protected void testPerformEdit(SetAttributeEdit edit) {
		edit.performEdit();
		Assert.assertEquals("Card2.java", ((EmfsResource) edit.getEObject()).getName());
	}

	@Override
	public void testPerformEdit() {
		setUpCardClassEdit("name", "Card2.java");
		testPerformEdit(getFixture());
	}

	@Override
	public void testCreateEditCommand__EditingDomain() {
		setUpCardClassEdit("name", "Card2.java");
		BasicCommandStack commandStack = new BasicCommandStack();
		EditingDomain editingDomain = new AdapterFactoryEditingDomain(new EmfsAdapterFactory(), commandStack);
		commandStack.execute(getFixture().createEditCommand(editingDomain));
		Assert.assertEquals("Card2.java", ((EmfsResource) getFixture().getEObject()).getName());
	}

	@Override
	public void testCreateSerializableEdit__URI() {
		setUpCardClassEdit("name", "Card2.java");
		testHelper.testCreateSerializableEdit(getFixture());
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

} //SetAttributeEditTest
