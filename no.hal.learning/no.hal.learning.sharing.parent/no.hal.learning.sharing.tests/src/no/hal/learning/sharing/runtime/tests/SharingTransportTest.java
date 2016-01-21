package no.hal.learning.sharing.runtime.tests;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import junit.framework.TestCase;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.util.EmfsResourceImpl;
import no.hal.learning.sharing.AbstractShare;
import no.hal.learning.sharing.ChangeEdit;
import no.hal.learning.sharing.ShareModel;
import no.hal.learning.sharing.SharingFactory;
import no.hal.learning.sharing.runtime.SharingTransport;
import no.hal.learning.sharing.runtime.mqtt.LoopbackSharingTransport;
import no.hal.learning.sharing.tests.ChangeEditTest;
import no.hal.learning.sharing.tests.util.TestHelper;

public class SharingTransportTest extends TestCase implements SharingTransport.Subscriber {

	private SharingTransport transport;
	private TestHelper testHelper;
	private AbstractShare receivedModel;
	
	@Override
	protected void setUp() throws Exception {
		transport = new LoopbackSharingTransport();
		transport.subscribe(this);
		testHelper = new TestHelper();
	}
	
	private ShareModel createShareModel(String name, Collection<? extends EObject> eObjects) {
		return createShareModel(name, eObjects.toArray(new EObject[eObjects.size()]));
	}

	private ShareModel createShareModel(String name, EObject... eObjects) {
		ShareModel shareModel = SharingFactory.eINSTANCE.createShareModel();
		shareModel.setName("forloop");
		Collection<EObject> sharedObjects = Arrays.asList(eObjects);
		shareModel.getEObjects().addAll(sharedObjects);
		return shareModel;
	}
	
	public void testLoopbackPublishReceive() {
		EmfsResource emfsResource = testHelper.loadEmfsResource("forloop.xemfs", this);
		Resource resource = emfsResource.eResource().getResourceSet().createResource(URI.createURI("share-forloop.xmi"));
		ShareModel shareModel = createShareModel("forloop", emfsResource);
		resource.getContents().add(shareModel);

		testPublish(shareModel);
		ShareModel receivedShareModel = (ShareModel) receivedModel;
		assertTrue(EcoreUtil.equals(shareModel, receivedShareModel));
		assertTrue(EcoreUtil.equals(shareModel.getEObjects(), receivedShareModel.getEObjects()));
	}

	public void testLoopbackPublishReceiveWithChange() {
		EmfsResource emfsResource = testHelper.loadEmfsResource("forloop.xemfs", this);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource emfsXmiResource = resourceSet.createResource(emfsResource.eResource().getURI().trimFileExtension().appendFileExtension("emfs"));
		emfsXmiResource.getContents().add(EcoreUtil.copy(emfsResource));
		resourceSet.getResources().add(emfsXmiResource);

		Resource shareResource = resourceSet.createResource(URI.createURI("forloopShare.xmi"));
		ShareModel shareModel = createShareModel("forloop", emfsXmiResource.getContents());
		shareResource.getContents().add(shareModel);

		ShareModel receivedShareModel = testPublish(shareModel);
		assertTrue(EcoreUtil.equals(shareModel, receivedShareModel));
		assertTrue(EcoreUtil.equals(shareModel.getEObjects(), receivedShareModel.getEObjects()));
		ResourceSet receivedResourceSet = receivedShareModel.eResource().getResourceSet();
		Resource receivedEmfsResource = receivedResourceSet.getResources().get(0);

		// edit the model and publish the edit

		final EmfsResource forLoop1 = EmfsResourceImpl.getEmfsResource(emfsXmiResource, "/src/iteration/ForLoop1.java");
		assertTrue(forLoop1 instanceof EmfsFile);
		
		ChangeEdit changeEdit = SharingFactory.eINSTANCE.createChangeEdit();
		final String alternateForLoopContents = "nothing";
		ChangeEditTest.setUpChangeEdit(changeEdit, forLoop1, new Runnable() {
			@Override
			public void run() {
				StringContentProvider contentProvider = EmfsFactory.eINSTANCE.createStringContentProvider();
				contentProvider.setStringContent(alternateForLoopContents);
				((EmfsFile) forLoop1).setContentProvider(contentProvider);
			}
		});
		Resource editResource = changeEdit.createSerializableEdit(URI.createURI("forloopEdit.xmi"));
		shareModel = createShareModel("forloop", editResource.getContents());
		editResource.getContents().add(shareModel);

		ShareModel receivedShareModel2 = testPublish(shareModel);
		
		receivedResourceSet.getResources().add(receivedShareModel2.eResource());
		assertEquals(1, receivedShareModel2.getEObjects().size());
		assertTrue(receivedShareModel2.getEObjects().get(0) instanceof ChangeEdit);
		ChangeEdit receivedChangeEdit = (ChangeEdit) receivedShareModel2.getEObjects().get(0);
		receivedChangeEdit.performEdit();
		final EmfsResource receivedForLoop1 = EmfsResourceImpl.getEmfsResource(receivedEmfsResource, "/src/iteration/ForLoop1.java");
		assertTrue(receivedForLoop1 instanceof EmfsFile);
		assertTrue(((EmfsFile) receivedForLoop1).getContentProvider() instanceof StringContentProvider);
		assertEquals(alternateForLoopContents, ((StringContentProvider) ((EmfsFile) receivedForLoop1).getContentProvider()).getStringContent());
	}

	protected ShareModel testPublish(ShareModel shareModel) {
		receivedModel = null;
		transport.publish(shareModel);
		assertTrue(receivedModel instanceof ShareModel);
		return (ShareModel) receivedModel;
	}
	
	@Override
	public void receivedShare(AbstractShare share) {
		receivedModel = share;
	}
}
