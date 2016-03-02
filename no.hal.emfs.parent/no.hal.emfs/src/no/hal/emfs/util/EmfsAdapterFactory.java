/**
 */
package no.hal.emfs.util;

import no.hal.emfs.*;
import no.hal.emfs.AbstractBytesContentProvider;
import no.hal.emfs.AbstractClasspathEntry;
import no.hal.emfs.AbstractStringContentProvider;
import no.hal.emfs.AbstractURLContentProvider;
import no.hal.emfs.ByteArrayContentProvider;
import no.hal.emfs.CachingContentProvider;
import no.hal.emfs.ClasspathEntry;
import no.hal.emfs.DotClasspathFileContentProvider;
import no.hal.emfs.DotProjectFileContentProvider;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.EmfsResourcesRef;
import no.hal.emfs.GitContentProvider;
import no.hal.emfs.GitContentRef;
import no.hal.emfs.GitRepoRef;
import no.hal.emfs.GitURLContentProvider;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.URLContentProvider;
import no.hal.emfs.WrappingStringContentProvider;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.EmfsPackage
 * @generated
 */
public class EmfsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmfsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmfsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsSwitch<Adapter> modelSwitch =
		new EmfsSwitch<Adapter>() {
			@Override
			public Adapter caseEmfsResource(EmfsResource object) {
				return createEmfsResourceAdapter();
			}
			@Override
			public Adapter caseTagsOwner(TagsOwner object) {
				return createTagsOwnerAdapter();
			}
			@Override
			public Adapter casePropertyOwner(PropertyOwner object) {
				return createPropertyOwnerAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseEmfsContainer(EmfsContainer object) {
				return createEmfsContainerAdapter();
			}
			@Override
			public Adapter caseEmfsContainerContentProvider(EmfsContainerContentProvider object) {
				return createEmfsContainerContentProviderAdapter();
			}
			@Override
			public Adapter caseEmfsResourcesRef(EmfsResourcesRef object) {
				return createEmfsResourcesRefAdapter();
			}
			@Override
			public Adapter caseGitContentProvider(GitContentProvider object) {
				return createGitContentProviderAdapter();
			}
			@Override
			public Adapter caseEmfsFile(EmfsFile object) {
				return createEmfsFileAdapter();
			}
			@Override
			public Adapter caseEmfsFileContentProvider(EmfsFileContentProvider object) {
				return createEmfsFileContentProviderAdapter();
			}
			@Override
			public Adapter caseAbstractBytesContentProvider(AbstractBytesContentProvider object) {
				return createAbstractBytesContentProviderAdapter();
			}
			@Override
			public Adapter caseByteArrayContentProvider(ByteArrayContentProvider object) {
				return createByteArrayContentProviderAdapter();
			}
			@Override
			public Adapter caseAbstractStringContentProvider(AbstractStringContentProvider object) {
				return createAbstractStringContentProviderAdapter();
			}
			@Override
			public Adapter caseStringContentProvider(StringContentProvider object) {
				return createStringContentProviderAdapter();
			}
			@Override
			public Adapter caseAbstractStringContents(AbstractStringContents object) {
				return createAbstractStringContentsAdapter();
			}
			@Override
			public Adapter caseVerbatimStringContents(VerbatimStringContents object) {
				return createVerbatimStringContentsAdapter();
			}
			@Override
			public Adapter casePropertyValueString(PropertyValueString object) {
				return createPropertyValueStringAdapter();
			}
			@Override
			public Adapter caseWrappingStringContentProvider(WrappingStringContentProvider object) {
				return createWrappingStringContentProviderAdapter();
			}
			@Override
			public Adapter caseAbstractURLContentProvider(AbstractURLContentProvider object) {
				return createAbstractURLContentProviderAdapter();
			}
			@Override
			public Adapter caseURLContentProvider(URLContentProvider object) {
				return createURLContentProviderAdapter();
			}
			@Override
			public Adapter caseGitURLContentProvider(GitURLContentProvider object) {
				return createGitURLContentProviderAdapter();
			}
			@Override
			public Adapter caseGitRepoRef(GitRepoRef object) {
				return createGitRepoRefAdapter();
			}
			@Override
			public Adapter caseGitContentRef(GitContentRef object) {
				return createGitContentRefAdapter();
			}
			@Override
			public Adapter caseCachingContentProvider(CachingContentProvider object) {
				return createCachingContentProviderAdapter();
			}
			@Override
			public Adapter caseDotClasspathFileContentProvider(DotClasspathFileContentProvider object) {
				return createDotClasspathFileContentProviderAdapter();
			}
			@Override
			public Adapter caseAbstractClasspathEntry(AbstractClasspathEntry object) {
				return createAbstractClasspathEntryAdapter();
			}
			@Override
			public Adapter caseClasspathEntry(ClasspathEntry object) {
				return createClasspathEntryAdapter();
			}
			@Override
			public Adapter caseDotProjectFileContentProvider(DotProjectFileContentProvider object) {
				return createDotProjectFileContentProviderAdapter();
			}
			@Override
			public Adapter caseXmlStringContents(XmlStringContents object) {
				return createXmlStringContentsAdapter();
			}
			@Override
			public Adapter caseXmlContents(XmlContents object) {
				return createXmlContentsAdapter();
			}
			@Override
			public Adapter caseXmlElement(XmlElement object) {
				return createXmlElementAdapter();
			}
			@Override
			public Adapter caseXmlPIElement(XmlPIElement object) {
				return createXmlPIElementAdapter();
			}
			@Override
			public Adapter caseXmlTagElement(XmlTagElement object) {
				return createXmlTagElementAdapter();
			}
			@Override
			public Adapter caseXmlTag(XmlTag object) {
				return createXmlTagAdapter();
			}
			@Override
			public Adapter caseXmlAttribute(XmlAttribute object) {
				return createXmlAttributeAdapter();
			}
			@Override
			public Adapter caseEmfResourceStringContents(EmfResourceStringContents object) {
				return createEmfResourceStringContentsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfsResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfsResource
	 * @generated
	 */
	public Adapter createEmfsResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.TagsOwner <em>Tags Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.TagsOwner
	 * @generated
	 */
	public Adapter createTagsOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.PropertyOwner
	 * @generated
	 */
	public Adapter createPropertyOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfsContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfsContainer
	 * @generated
	 */
	public Adapter createEmfsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfsContainerContentProvider <em>Container Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfsContainerContentProvider
	 * @generated
	 */
	public Adapter createEmfsContainerContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfsResourcesRef <em>Resources Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfsResourcesRef
	 * @generated
	 */
	public Adapter createEmfsResourcesRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.GitContentProvider <em>Git Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.GitContentProvider
	 * @generated
	 */
	public Adapter createGitContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfsFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfsFile
	 * @generated
	 */
	public Adapter createEmfsFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfsFileContentProvider <em>File Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfsFileContentProvider
	 * @generated
	 */
	public Adapter createEmfsFileContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.AbstractBytesContentProvider <em>Abstract Bytes Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.AbstractBytesContentProvider
	 * @generated
	 */
	public Adapter createAbstractBytesContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.ByteArrayContentProvider <em>Byte Array Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.ByteArrayContentProvider
	 * @generated
	 */
	public Adapter createByteArrayContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.AbstractStringContentProvider <em>Abstract String Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.AbstractStringContentProvider
	 * @generated
	 */
	public Adapter createAbstractStringContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.StringContentProvider <em>String Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.StringContentProvider
	 * @generated
	 */
	public Adapter createStringContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.AbstractStringContents <em>Abstract String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.AbstractStringContents
	 * @generated
	 */
	public Adapter createAbstractStringContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.VerbatimStringContents <em>Verbatim String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.VerbatimStringContents
	 * @generated
	 */
	public Adapter createVerbatimStringContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.PropertyValueString <em>Property Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.PropertyValueString
	 * @generated
	 */
	public Adapter createPropertyValueStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.WrappingStringContentProvider <em>Wrapping String Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.WrappingStringContentProvider
	 * @generated
	 */
	public Adapter createWrappingStringContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.AbstractURLContentProvider <em>Abstract URL Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.AbstractURLContentProvider
	 * @generated
	 */
	public Adapter createAbstractURLContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.URLContentProvider <em>URL Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.URLContentProvider
	 * @generated
	 */
	public Adapter createURLContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.GitURLContentProvider <em>Git URL Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.GitURLContentProvider
	 * @generated
	 */
	public Adapter createGitURLContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.GitRepoRef <em>Git Repo Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.GitRepoRef
	 * @generated
	 */
	public Adapter createGitRepoRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.GitContentRef <em>Git Content Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.GitContentRef
	 * @generated
	 */
	public Adapter createGitContentRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.CachingContentProvider <em>Caching Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.CachingContentProvider
	 * @generated
	 */
	public Adapter createCachingContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.DotClasspathFileContentProvider <em>Dot Classpath File Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.DotClasspathFileContentProvider
	 * @generated
	 */
	public Adapter createDotClasspathFileContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.AbstractClasspathEntry <em>Abstract Classpath Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.AbstractClasspathEntry
	 * @generated
	 */
	public Adapter createAbstractClasspathEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.ClasspathEntry <em>Classpath Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.ClasspathEntry
	 * @generated
	 */
	public Adapter createClasspathEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.DotProjectFileContentProvider <em>Dot Project File Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.DotProjectFileContentProvider
	 * @generated
	 */
	public Adapter createDotProjectFileContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlStringContents <em>Xml String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlStringContents
	 * @generated
	 */
	public Adapter createXmlStringContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlContents <em>Xml Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlContents
	 * @generated
	 */
	public Adapter createXmlContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlElement <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlElement
	 * @generated
	 */
	public Adapter createXmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlPIElement <em>Xml PI Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlPIElement
	 * @generated
	 */
	public Adapter createXmlPIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlTagElement <em>Xml Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlTagElement
	 * @generated
	 */
	public Adapter createXmlTagElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlTag <em>Xml Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlTag
	 * @generated
	 */
	public Adapter createXmlTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.XmlAttribute <em>Xml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.XmlAttribute
	 * @generated
	 */
	public Adapter createXmlAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.emfs.EmfResourceStringContents <em>Emf Resource String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.emfs.EmfResourceStringContents
	 * @generated
	 */
	public Adapter createEmfResourceStringContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EmfsAdapterFactory
