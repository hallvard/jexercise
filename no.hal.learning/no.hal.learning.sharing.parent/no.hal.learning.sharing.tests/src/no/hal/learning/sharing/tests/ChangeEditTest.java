/**
 */
package no.hal.learning.sharing.tests;

import java.util.Map;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.junit.Assert;

import junit.textui.TestRunner;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.util.EmfsAdapterFactory;
import no.hal.emfs.util.EmfsResourceImpl;
import no.hal.learning.sharing.ChangeEdit;
import no.hal.learning.sharing.SharingFactory;
import no.hal.learning.sharing.tests.util.TestHelper;
import no.hal.learning.sharing.util.EObjectContentsUriMap;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Change Edit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeEditTest extends AbstractModelEditTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChangeEditTest.class);
	}

	/**
	 * Constructs a new Change Edit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEditTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Change Edit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChangeEdit getFixture() {
		return (ChangeEdit)fixture;
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
		setFixture(SharingFactory.eINSTANCE.createChangeEdit());
	}

	private TestHelper testHelper;

	protected EmfsResource setUpCardClassEdit(String featureName, Object newValue) {
		ChangeEdit edit = getFixture();
		EmfsResource emfsResource = testHelper.loadEmfsResource("card1.xemfs", this);
		final EmfsResource cardClass = EmfsResourceImpl.getEmfsResource(emfsResource.eResource(), "/src/objectstructures/Card.java");
		setUpChangeEdit(edit, cardClass, new Runnable() {
			@Override
			public void run() {
				cardClass.setName("Card2.java");
			}
		});
		return cardClass;
	}

	public static void setUpChangeEdit(ChangeEdit edit, EObject eObject, Runnable runnable) {
		ChangeRecorder changeRecorder = new ChangeRecorder(eObject);
		runnable.run();
		ChangeDescription changes = changeRecorder.endRecording();
		Map<EObject, URI> map = new EObjectContentsUriMap(eObject);
		changes.copyAndReverse(map);
		edit.setEObject(eObject);
		edit.setChange(changes);
	}

	@Override
	public void testPerformEdit() {
		EmfsResource cardClass = setUpCardClassEdit("name", "Card2.java");
		getFixture().performEdit();
		Assert.assertEquals("Card2.java", cardClass.getName());
	}

	@Override
	public void testCreateEditCommand__EditingDomain() {
		EmfsResource cardClass = setUpCardClassEdit("name", "Card2.java");
		BasicCommandStack commandStack = new BasicCommandStack();
		EditingDomain editingDomain = new AdapterFactoryEditingDomain(new EmfsAdapterFactory(), commandStack);
		commandStack.execute(getFixture().createEditCommand(editingDomain));
		Assert.assertEquals("Card2.java", cardClass.getName());
	}

	@Override
	public void testCreateSerializableEdit__URI() {
		EmfsResource cardClass = setUpCardClassEdit("name", "Card2.java");
		testHelper.testCreateSerializableEdit(getFixture());
		Assert.assertEquals("Card2.java", cardClass.getName());
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

} //ChangeEditTest
