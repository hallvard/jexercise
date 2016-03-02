/**
 */
package no.hal.emfs.impl;

import no.hal.emfs.*;
import no.hal.emfs.exporter.ExportSupport;
import no.hal.emfs.ByteArrayContentProvider;
import no.hal.emfs.CachingContentProvider;
import no.hal.emfs.ClasspathEntry;
import no.hal.emfs.ClasspathEntryKind;
import no.hal.emfs.DotClasspathFileContentProvider;
import no.hal.emfs.DotProjectFileContentProvider;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfsFactoryImpl extends EFactoryImpl implements EmfsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmfsFactory init() {
		try {
			EmfsFactory theEmfsFactory = (EmfsFactory)EPackage.Registry.INSTANCE.getEFactory(EmfsPackage.eNS_URI);
			if (theEmfsFactory != null) {
				return theEmfsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmfsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmfsPackage.EMFS_RESOURCE: return createEmfsResource();
			case EmfsPackage.TAGS_OWNER: return createTagsOwner();
			case EmfsPackage.PROPERTY_OWNER: return createPropertyOwner();
			case EmfsPackage.PROPERTY: return createProperty();
			case EmfsPackage.EMFS_CONTAINER: return createEmfsContainer();
			case EmfsPackage.EMFS_RESOURCES_REF: return createEmfsResourcesRef();
			case EmfsPackage.GIT_CONTENT_PROVIDER: return createGitContentProvider();
			case EmfsPackage.EMFS_FILE: return createEmfsFile();
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER: return createByteArrayContentProvider();
			case EmfsPackage.STRING_CONTENT_PROVIDER: return createStringContentProvider();
			case EmfsPackage.VERBATIM_STRING_CONTENTS: return createVerbatimStringContents();
			case EmfsPackage.PROPERTY_VALUE_STRING: return createPropertyValueString();
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER: return createWrappingStringContentProvider();
			case EmfsPackage.URL_CONTENT_PROVIDER: return createURLContentProvider();
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER: return createGitURLContentProvider();
			case EmfsPackage.GIT_REPO_REF: return createGitRepoRef();
			case EmfsPackage.GIT_CONTENT_REF: return createGitContentRef();
			case EmfsPackage.CACHING_CONTENT_PROVIDER: return createCachingContentProvider();
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER: return createDotClasspathFileContentProvider();
			case EmfsPackage.CLASSPATH_ENTRY: return createClasspathEntry();
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER: return createDotProjectFileContentProvider();
			case EmfsPackage.XML_STRING_CONTENTS: return createXmlStringContents();
			case EmfsPackage.XML_CONTENTS: return createXmlContents();
			case EmfsPackage.XML_PI_ELEMENT: return createXmlPIElement();
			case EmfsPackage.XML_TAG_ELEMENT: return createXmlTagElement();
			case EmfsPackage.XML_TAG: return createXmlTag();
			case EmfsPackage.XML_ATTRIBUTE: return createXmlAttribute();
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS: return createEmfResourceStringContents();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmfsPackage.CLASSPATH_ENTRY_KIND:
				return createClasspathEntryKindFromString(eDataType, initialValue);
			case EmfsPackage.EXPORT_SUPPORT:
				return createExportSupportFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmfsPackage.CLASSPATH_ENTRY_KIND:
				return convertClasspathEntryKindToString(eDataType, instanceValue);
			case EmfsPackage.EXPORT_SUPPORT:
				return convertExportSupportToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsResource createEmfsResource() {
		EmfsResourceImpl emfsResource = new EmfsResourceImpl();
		return emfsResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsOwner createTagsOwner() {
		TagsOwnerImpl tagsOwner = new TagsOwnerImpl();
		return tagsOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyOwner createPropertyOwner() {
		PropertyOwnerImpl propertyOwner = new PropertyOwnerImpl();
		return propertyOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsContainer createEmfsContainer() {
		EmfsContainerImpl emfsContainer = new EmfsContainerImpl();
		return emfsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsResourcesRef createEmfsResourcesRef() {
		EmfsResourcesRefImpl emfsResourcesRef = new EmfsResourcesRefImpl();
		return emfsResourcesRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitContentProvider createGitContentProvider() {
		GitContentProviderImpl gitContentProvider = new GitContentProviderImpl();
		return gitContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFile createEmfsFile() {
		EmfsFileImpl emfsFile = new EmfsFileImpl();
		return emfsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteArrayContentProvider createByteArrayContentProvider() {
		ByteArrayContentProviderImpl byteArrayContentProvider = new ByteArrayContentProviderImpl();
		return byteArrayContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringContentProvider createStringContentProvider() {
		StringContentProviderImpl stringContentProvider = new StringContentProviderImpl();
		return stringContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerbatimStringContents createVerbatimStringContents() {
		VerbatimStringContentsImpl verbatimStringContents = new VerbatimStringContentsImpl();
		return verbatimStringContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueString createPropertyValueString() {
		PropertyValueStringImpl propertyValueString = new PropertyValueStringImpl();
		return propertyValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrappingStringContentProvider createWrappingStringContentProvider() {
		WrappingStringContentProviderImpl wrappingStringContentProvider = new WrappingStringContentProviderImpl();
		return wrappingStringContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLContentProvider createURLContentProvider() {
		URLContentProviderImpl urlContentProvider = new URLContentProviderImpl();
		return urlContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitURLContentProvider createGitURLContentProvider() {
		GitURLContentProviderImpl gitURLContentProvider = new GitURLContentProviderImpl();
		return gitURLContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitRepoRef createGitRepoRef() {
		GitRepoRefImpl gitRepoRef = new GitRepoRefImpl();
		return gitRepoRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitContentRef createGitContentRef() {
		GitContentRefImpl gitContentRef = new GitContentRefImpl();
		return gitContentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CachingContentProvider createCachingContentProvider() {
		CachingContentProviderImpl cachingContentProvider = new CachingContentProviderImpl();
		return cachingContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotClasspathFileContentProvider createDotClasspathFileContentProvider() {
		DotClasspathFileContentProviderImpl dotClasspathFileContentProvider = new DotClasspathFileContentProviderImpl();
		return dotClasspathFileContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClasspathEntry createClasspathEntry() {
		ClasspathEntryImpl classpathEntry = new ClasspathEntryImpl();
		return classpathEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotProjectFileContentProvider createDotProjectFileContentProvider() {
		DotProjectFileContentProviderImpl dotProjectFileContentProvider = new DotProjectFileContentProviderImpl();
		return dotProjectFileContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlStringContents createXmlStringContents() {
		XmlStringContentsImpl xmlStringContents = new XmlStringContentsImpl();
		return xmlStringContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlContents createXmlContents() {
		XmlContentsImpl xmlContents = new XmlContentsImpl();
		return xmlContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPIElement createXmlPIElement() {
		XmlPIElementImpl xmlPIElement = new XmlPIElementImpl();
		return xmlPIElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTagElement createXmlTagElement() {
		XmlTagElementImpl xmlTagElement = new XmlTagElementImpl();
		return xmlTagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTag createXmlTag() {
		XmlTagImpl xmlTag = new XmlTagImpl();
		return xmlTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAttribute createXmlAttribute() {
		XmlAttributeImpl xmlAttribute = new XmlAttributeImpl();
		return xmlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfResourceStringContents createEmfResourceStringContents() {
		EmfResourceStringContentsImpl emfResourceStringContents = new EmfResourceStringContentsImpl();
		return emfResourceStringContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClasspathEntryKind createClasspathEntryKindFromString(EDataType eDataType, String initialValue) {
		ClasspathEntryKind result = ClasspathEntryKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClasspathEntryKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportSupport createExportSupportFromString(EDataType eDataType, String initialValue) {
		return (ExportSupport)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExportSupportToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsPackage getEmfsPackage() {
		return (EmfsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmfsPackage getPackage() {
		return EmfsPackage.eINSTANCE;
	}

} //EmfsFactoryImpl
