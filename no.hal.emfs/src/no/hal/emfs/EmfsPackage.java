/**
 */
package no.hal.emfs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.emfs.EmfsFactory
 * @model kind="package"
 * @generated
 */
public interface EmfsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emfs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.emfs/model/emfs.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfsPackage eINSTANCE = no.hal.emfs.impl.EmfsPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.TagsOwnerImpl <em>Tags Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.TagsOwnerImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getTagsOwner()
	 * @generated
	 */
	int TAGS_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OWNER__TAGS = 0;

	/**
	 * The number of structural features of the '<em>Tags Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.PropertyOwnerImpl <em>Property Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.PropertyOwnerImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getPropertyOwner()
	 * @generated
	 */
	int PROPERTY_OWNER = 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.EmfsResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.EmfsResourceImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsResource()
	 * @generated
	 */
	int EMFS_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__TAGS = TAGS_OWNER__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__PROPERTIES = TAGS_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__WRITEABLE = TAGS_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__NAME = TAGS_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__CONTAINER = TAGS_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__FULL_PATH = TAGS_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Container Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__CONTAINER_PATH = TAGS_OWNER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE__FULL_NAME = TAGS_OWNER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCE_FEATURE_COUNT = TAGS_OWNER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Property Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.PropertyImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.EmfsContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.EmfsContainerImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsContainer()
	 * @generated
	 */
	int EMFS_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__TAGS = EMFS_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__PROPERTIES = EMFS_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__WRITEABLE = EMFS_RESOURCE__WRITEABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__NAME = EMFS_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__CONTAINER = EMFS_RESOURCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__FULL_PATH = EMFS_RESOURCE__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Container Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__CONTAINER_PATH = EMFS_RESOURCE__CONTAINER_PATH;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__FULL_NAME = EMFS_RESOURCE__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__RESOURCES = EMFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER__CONTENT_PROVIDER = EMFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER_FEATURE_COUNT = EMFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.EmfsContainerContentProviderImpl <em>Container Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.EmfsContainerContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsContainerContentProvider()
	 * @generated
	 */
	int EMFS_CONTAINER_CONTENT_PROVIDER = 5;

	/**
	 * The number of structural features of the '<em>Container Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_CONTAINER_CONTENT_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.EmfsResourcesRefImpl <em>Resources Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.EmfsResourcesRefImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsResourcesRef()
	 * @generated
	 */
	int EMFS_RESOURCES_REF = 6;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCES_REF__RESOURCES = EMFS_CONTAINER_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resources Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_RESOURCES_REF_FEATURE_COUNT = EMFS_CONTAINER_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.GitContentProviderImpl <em>Git Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.GitContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitContentProvider()
	 * @generated
	 */
	int GIT_CONTENT_PROVIDER = 7;

	/**
	 * The feature id for the '<em><b>Git Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_PROVIDER__GIT_REF = EMFS_CONTAINER_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Git Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_PROVIDER_FEATURE_COUNT = EMFS_CONTAINER_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.EmfsFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.EmfsFileImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsFile()
	 * @generated
	 */
	int EMFS_FILE = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__TAGS = EMFS_RESOURCE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__PROPERTIES = EMFS_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__WRITEABLE = EMFS_RESOURCE__WRITEABLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__NAME = EMFS_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__CONTAINER = EMFS_RESOURCE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__FULL_PATH = EMFS_RESOURCE__FULL_PATH;

	/**
	 * The feature id for the '<em><b>Container Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__CONTAINER_PATH = EMFS_RESOURCE__CONTAINER_PATH;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__FULL_NAME = EMFS_RESOURCE__FULL_NAME;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__FILE = EMFS_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE__CONTENT_PROVIDER = EMFS_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE_FEATURE_COUNT = EMFS_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.EmfsFileContentProvider <em>File Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.EmfsFileContentProvider
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsFileContentProvider()
	 * @generated
	 */
	int EMFS_FILE_CONTENT_PROVIDER = 9;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE_CONTENT_PROVIDER__FILE = 0;

	/**
	 * The number of structural features of the '<em>File Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.AbstractBytesContentProviderImpl <em>Abstract Bytes Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.AbstractBytesContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractBytesContentProvider()
	 * @generated
	 */
	int ABSTRACT_BYTES_CONTENT_PROVIDER = 10;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BYTES_CONTENT_PROVIDER__FILE = EMFS_FILE_CONTENT_PROVIDER__FILE;

	/**
	 * The number of structural features of the '<em>Abstract Bytes Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_BYTES_CONTENT_PROVIDER_FEATURE_COUNT = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.ByteArrayContentProviderImpl <em>Byte Array Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.ByteArrayContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getByteArrayContentProvider()
	 * @generated
	 */
	int BYTE_ARRAY_CONTENT_PROVIDER = 11;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ARRAY_CONTENT_PROVIDER__FILE = ABSTRACT_BYTES_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Byte Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS = ABSTRACT_BYTES_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Byte Array Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BYTE_ARRAY_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_BYTES_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.AbstractStringContentProviderImpl <em>Abstract String Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.AbstractStringContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractStringContentProvider()
	 * @generated
	 */
	int ABSTRACT_STRING_CONTENT_PROVIDER = 12;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_CONTENT_PROVIDER__FILE = ABSTRACT_BYTES_CONTENT_PROVIDER__FILE;

	/**
	 * The number of structural features of the '<em>Abstract String Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_BYTES_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.StringContentProviderImpl <em>String Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.StringContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getStringContentProvider()
	 * @generated
	 */
	int STRING_CONTENT_PROVIDER = 13;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONTENT_PROVIDER__FILE = ABSTRACT_STRING_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>String Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONTENT_PROVIDER__STRING_CONTENTS = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.AbstractStringContentsImpl <em>Abstract String Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.AbstractStringContentsImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractStringContents()
	 * @generated
	 */
	int ABSTRACT_STRING_CONTENTS = 14;

	/**
	 * The number of structural features of the '<em>Abstract String Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STRING_CONTENTS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.VerbatimStringContentsImpl <em>Verbatim String Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.VerbatimStringContentsImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getVerbatimStringContents()
	 * @generated
	 */
	int VERBATIM_STRING_CONTENTS = 15;

	/**
	 * The feature id for the '<em><b>String Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_STRING_CONTENTS__STRING_CONTENT = ABSTRACT_STRING_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verbatim String Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBATIM_STRING_CONTENTS_FEATURE_COUNT = ABSTRACT_STRING_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.PropertyValueStringImpl <em>Property Value String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.PropertyValueStringImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getPropertyValueString()
	 * @generated
	 */
	int PROPERTY_VALUE_STRING = 16;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_STRING__PROPERTY_NAME = ABSTRACT_STRING_CONTENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_STRING__DEFAULT_VALUE = ABSTRACT_STRING_CONTENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_STRING_FEATURE_COUNT = ABSTRACT_STRING_CONTENTS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.WrappingStringContentProviderImpl <em>Wrapping String Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.WrappingStringContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getWrappingStringContentProvider()
	 * @generated
	 */
	int WRAPPING_STRING_CONTENT_PROVIDER = 17;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_STRING_CONTENT_PROVIDER__FILE = EMFS_FILE_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_STRING_CONTENT_PROVIDER__PREFIX = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wrapping String Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_STRING_CONTENT_PROVIDER_FEATURE_COUNT = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.AbstractURLContentProviderImpl <em>Abstract URL Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.AbstractURLContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractURLContentProvider()
	 * @generated
	 */
	int ABSTRACT_URL_CONTENT_PROVIDER = 18;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_URL_CONTENT_PROVIDER__FILE = EMFS_FILE_CONTENT_PROVIDER__FILE;

	/**
	 * The number of structural features of the '<em>Abstract URL Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_URL_CONTENT_PROVIDER_FEATURE_COUNT = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.URLContentProviderImpl <em>URL Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.URLContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getURLContentProvider()
	 * @generated
	 */
	int URL_CONTENT_PROVIDER = 19;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_CONTENT_PROVIDER__FILE = ABSTRACT_URL_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_CONTENT_PROVIDER__URL_STRING = ABSTRACT_URL_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_URL_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.GitURLContentProviderImpl <em>Git URL Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.GitURLContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitURLContentProvider()
	 * @generated
	 */
	int GIT_URL_CONTENT_PROVIDER = 20;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_URL_CONTENT_PROVIDER__FILE = ABSTRACT_URL_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Git Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_URL_CONTENT_PROVIDER__GIT_REF = ABSTRACT_URL_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Git URL Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_URL_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_URL_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.GitRepoRefImpl <em>Git Repo Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.GitRepoRefImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitRepoRef()
	 * @generated
	 */
	int GIT_REPO_REF = 21;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_REF__HOST = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_REF__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_REF__REPO = 2;

	/**
	 * The feature id for the '<em><b>Remote String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_REF__REMOTE_STRING = 3;

	/**
	 * The number of structural features of the '<em>Git Repo Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_REPO_REF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.GitContentRefImpl <em>Git Content Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.GitContentRefImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitContentRef()
	 * @generated
	 */
	int GIT_CONTENT_REF = 22;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF__HOST = GIT_REPO_REF__HOST;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF__OWNER = GIT_REPO_REF__OWNER;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF__REPO = GIT_REPO_REF__REPO;

	/**
	 * The feature id for the '<em><b>Remote String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF__REMOTE_STRING = GIT_REPO_REF__REMOTE_STRING;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF__PATH = GIT_REPO_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF__URL_STRING = GIT_REPO_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Git Content Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_CONTENT_REF_FEATURE_COUNT = GIT_REPO_REF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.CachingContentProviderImpl <em>Caching Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.CachingContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getCachingContentProvider()
	 * @generated
	 */
	int CACHING_CONTENT_PROVIDER = 23;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING_CONTENT_PROVIDER__FILE = EMFS_FILE_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING_CONTENT_PROVIDER__CACHE = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Caching Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING_CONTENT_PROVIDER_FEATURE_COUNT = EMFS_FILE_CONTENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.DotClasspathFileContentProviderImpl <em>Dot Classpath File Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.DotClasspathFileContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getDotClasspathFileContentProvider()
	 * @generated
	 */
	int DOT_CLASSPATH_FILE_CONTENT_PROVIDER = 24;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CLASSPATH_FILE_CONTENT_PROVIDER__FILE = ABSTRACT_STRING_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dot Classpath File Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_CLASSPATH_FILE_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.AbstractClasspathEntryImpl <em>Abstract Classpath Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.AbstractClasspathEntryImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractClasspathEntry()
	 * @generated
	 */
	int ABSTRACT_CLASSPATH_ENTRY = 25;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASSPATH_ENTRY__KIND = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASSPATH_ENTRY__PATH = 1;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASSPATH_ENTRY__EXPORTED = 2;

	/**
	 * The number of structural features of the '<em>Abstract Classpath Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASSPATH_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.ClasspathEntryImpl <em>Classpath Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.ClasspathEntryImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getClasspathEntry()
	 * @generated
	 */
	int CLASSPATH_ENTRY = 26;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__KIND = ABSTRACT_CLASSPATH_ENTRY__KIND;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__PATH = ABSTRACT_CLASSPATH_ENTRY__PATH;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__EXPORTED = ABSTRACT_CLASSPATH_ENTRY__EXPORTED;

	/**
	 * The feature id for the '<em><b>Explicit Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__EXPLICIT_KIND = ABSTRACT_CLASSPATH_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__EXPLICIT_PATH = ABSTRACT_CLASSPATH_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__MAJOR = ABSTRACT_CLASSPATH_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY__MINOR = ABSTRACT_CLASSPATH_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classpath Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSPATH_ENTRY_FEATURE_COUNT = ABSTRACT_CLASSPATH_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link no.hal.emfs.impl.DotProjectFileContentProviderImpl <em>Dot Project File Content Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.impl.DotProjectFileContentProviderImpl
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getDotProjectFileContentProvider()
	 * @generated
	 */
	int DOT_PROJECT_FILE_CONTENT_PROVIDER = 27;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_PROJECT_FILE_CONTENT_PROVIDER__FILE = ABSTRACT_STRING_CONTENT_PROVIDER__FILE;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dot Project File Content Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_PROJECT_FILE_CONTENT_PROVIDER_FEATURE_COUNT = ABSTRACT_STRING_CONTENT_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.emfs.ClasspathEntryKind <em>Classpath Entry Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.ClasspathEntryKind
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getClasspathEntryKind()
	 * @generated
	 */
	int CLASSPATH_ENTRY_KIND = 28;

	/**
	 * The meta object id for the '<em>Import Support</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.emfs.util.ImportSupport
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getImportSupport()
	 * @generated
	 */
	int IMPORT_SUPPORT = 29;

	/**
	 * The meta object id for the '<em>EInput Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEInputStream()
	 * @generated
	 */
	int EINPUT_STREAM = 30;

	/**
	 * The meta object id for the '<em>EOutput Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see no.hal.emfs.impl.EmfsPackageImpl#getEOutputStream()
	 * @generated
	 */
	int EOUTPUT_STREAM = 31;


	/**
	 * Returns the meta object for class '{@link no.hal.emfs.EmfsResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see no.hal.emfs.EmfsResource
	 * @generated
	 */
	EClass getEmfsResource();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.EmfsResource#isWriteable <em>Writeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writeable</em>'.
	 * @see no.hal.emfs.EmfsResource#isWriteable()
	 * @see #getEmfsResource()
	 * @generated
	 */
	EAttribute getEmfsResource_Writeable();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.EmfsResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.emfs.EmfsResource#getName()
	 * @see #getEmfsResource()
	 * @generated
	 */
	EAttribute getEmfsResource_Name();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.emfs.EmfsResource#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see no.hal.emfs.EmfsResource#getContainer()
	 * @see #getEmfsResource()
	 * @generated
	 */
	EReference getEmfsResource_Container();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.EmfsResource#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see no.hal.emfs.EmfsResource#getFullPath()
	 * @see #getEmfsResource()
	 * @generated
	 */
	EAttribute getEmfsResource_FullPath();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.EmfsResource#getContainerPath <em>Container Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Path</em>'.
	 * @see no.hal.emfs.EmfsResource#getContainerPath()
	 * @see #getEmfsResource()
	 * @generated
	 */
	EAttribute getEmfsResource_ContainerPath();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.EmfsResource#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see no.hal.emfs.EmfsResource#getFullName()
	 * @see #getEmfsResource()
	 * @generated
	 */
	EAttribute getEmfsResource_FullName();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.TagsOwner <em>Tags Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags Owner</em>'.
	 * @see no.hal.emfs.TagsOwner
	 * @generated
	 */
	EClass getTagsOwner();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.emfs.TagsOwner#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see no.hal.emfs.TagsOwner#getTags()
	 * @see #getTagsOwner()
	 * @generated
	 */
	EAttribute getTagsOwner_Tags();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.PropertyOwner <em>Property Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Owner</em>'.
	 * @see no.hal.emfs.PropertyOwner
	 * @generated
	 */
	EClass getPropertyOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.PropertyOwner#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see no.hal.emfs.PropertyOwner#getProperties()
	 * @see #getPropertyOwner()
	 * @generated
	 */
	EReference getPropertyOwner_Properties();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see no.hal.emfs.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.emfs.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.emfs.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.EmfsContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see no.hal.emfs.EmfsContainer
	 * @generated
	 */
	EClass getEmfsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.EmfsContainer#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see no.hal.emfs.EmfsContainer#getResources()
	 * @see #getEmfsContainer()
	 * @generated
	 */
	EReference getEmfsContainer_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.EmfsContainer#getContentProvider <em>Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Provider</em>'.
	 * @see no.hal.emfs.EmfsContainer#getContentProvider()
	 * @see #getEmfsContainer()
	 * @generated
	 */
	EReference getEmfsContainer_ContentProvider();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.EmfsContainerContentProvider <em>Container Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Content Provider</em>'.
	 * @see no.hal.emfs.EmfsContainerContentProvider
	 * @generated
	 */
	EClass getEmfsContainerContentProvider();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.EmfsResourcesRef <em>Resources Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Ref</em>'.
	 * @see no.hal.emfs.EmfsResourcesRef
	 * @generated
	 */
	EClass getEmfsResourcesRef();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.emfs.EmfsResourcesRef#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see no.hal.emfs.EmfsResourcesRef#getResources()
	 * @see #getEmfsResourcesRef()
	 * @generated
	 */
	EReference getEmfsResourcesRef_Resources();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.GitContentProvider <em>Git Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Content Provider</em>'.
	 * @see no.hal.emfs.GitContentProvider
	 * @generated
	 */
	EClass getGitContentProvider();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.GitContentProvider#getGitRef <em>Git Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Git Ref</em>'.
	 * @see no.hal.emfs.GitContentProvider#getGitRef()
	 * @see #getGitContentProvider()
	 * @generated
	 */
	EReference getGitContentProvider_GitRef();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.EmfsFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see no.hal.emfs.EmfsFile
	 * @generated
	 */
	EClass getEmfsFile();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.EmfsFile#getContentProvider <em>Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Provider</em>'.
	 * @see no.hal.emfs.EmfsFile#getContentProvider()
	 * @see #getEmfsFile()
	 * @generated
	 */
	EReference getEmfsFile_ContentProvider();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.EmfsFileContentProvider <em>File Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content Provider</em>'.
	 * @see no.hal.emfs.EmfsFileContentProvider
	 * @generated
	 */
	EClass getEmfsFileContentProvider();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.emfs.EmfsFileContentProvider#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>File</em>'.
	 * @see no.hal.emfs.EmfsFileContentProvider#getFile()
	 * @see #getEmfsFileContentProvider()
	 * @generated
	 */
	EReference getEmfsFileContentProvider_File();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.AbstractBytesContentProvider <em>Abstract Bytes Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Bytes Content Provider</em>'.
	 * @see no.hal.emfs.AbstractBytesContentProvider
	 * @generated
	 */
	EClass getAbstractBytesContentProvider();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.ByteArrayContentProvider <em>Byte Array Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Byte Array Content Provider</em>'.
	 * @see no.hal.emfs.ByteArrayContentProvider
	 * @generated
	 */
	EClass getByteArrayContentProvider();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.ByteArrayContentProvider#getByteContents <em>Byte Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Contents</em>'.
	 * @see no.hal.emfs.ByteArrayContentProvider#getByteContents()
	 * @see #getByteArrayContentProvider()
	 * @generated
	 */
	EAttribute getByteArrayContentProvider_ByteContents();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.AbstractStringContentProvider <em>Abstract String Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract String Content Provider</em>'.
	 * @see no.hal.emfs.AbstractStringContentProvider
	 * @generated
	 */
	EClass getAbstractStringContentProvider();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.StringContentProvider <em>String Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Content Provider</em>'.
	 * @see no.hal.emfs.StringContentProvider
	 * @generated
	 */
	EClass getStringContentProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.StringContentProvider#getStringContents <em>String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String Contents</em>'.
	 * @see no.hal.emfs.StringContentProvider#getStringContents()
	 * @see #getStringContentProvider()
	 * @generated
	 */
	EReference getStringContentProvider_StringContents();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.AbstractStringContents <em>Abstract String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract String Contents</em>'.
	 * @see no.hal.emfs.AbstractStringContents
	 * @generated
	 */
	EClass getAbstractStringContents();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.VerbatimStringContents <em>Verbatim String Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbatim String Contents</em>'.
	 * @see no.hal.emfs.VerbatimStringContents
	 * @generated
	 */
	EClass getVerbatimStringContents();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.VerbatimStringContents#getStringContent <em>String Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Content</em>'.
	 * @see no.hal.emfs.VerbatimStringContents#getStringContent()
	 * @see #getVerbatimStringContents()
	 * @generated
	 */
	EAttribute getVerbatimStringContents_StringContent();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.PropertyValueString <em>Property Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value String</em>'.
	 * @see no.hal.emfs.PropertyValueString
	 * @generated
	 */
	EClass getPropertyValueString();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.PropertyValueString#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see no.hal.emfs.PropertyValueString#getPropertyName()
	 * @see #getPropertyValueString()
	 * @generated
	 */
	EAttribute getPropertyValueString_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.PropertyValueString#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see no.hal.emfs.PropertyValueString#getDefaultValue()
	 * @see #getPropertyValueString()
	 * @generated
	 */
	EAttribute getPropertyValueString_DefaultValue();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.WrappingStringContentProvider <em>Wrapping String Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapping String Content Provider</em>'.
	 * @see no.hal.emfs.WrappingStringContentProvider
	 * @generated
	 */
	EClass getWrappingStringContentProvider();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.WrappingStringContentProvider#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see no.hal.emfs.WrappingStringContentProvider#getPrefix()
	 * @see #getWrappingStringContentProvider()
	 * @generated
	 */
	EReference getWrappingStringContentProvider_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.WrappingStringContentProvider#getContentProvider <em>Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Provider</em>'.
	 * @see no.hal.emfs.WrappingStringContentProvider#getContentProvider()
	 * @see #getWrappingStringContentProvider()
	 * @generated
	 */
	EReference getWrappingStringContentProvider_ContentProvider();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.WrappingStringContentProvider#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suffix</em>'.
	 * @see no.hal.emfs.WrappingStringContentProvider#getSuffix()
	 * @see #getWrappingStringContentProvider()
	 * @generated
	 */
	EReference getWrappingStringContentProvider_Suffix();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.AbstractURLContentProvider <em>Abstract URL Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract URL Content Provider</em>'.
	 * @see no.hal.emfs.AbstractURLContentProvider
	 * @generated
	 */
	EClass getAbstractURLContentProvider();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.URLContentProvider <em>URL Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Content Provider</em>'.
	 * @see no.hal.emfs.URLContentProvider
	 * @generated
	 */
	EClass getURLContentProvider();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.URLContentProvider#getUrlString <em>Url String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url String</em>'.
	 * @see no.hal.emfs.URLContentProvider#getUrlString()
	 * @see #getURLContentProvider()
	 * @generated
	 */
	EAttribute getURLContentProvider_UrlString();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.GitURLContentProvider <em>Git URL Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git URL Content Provider</em>'.
	 * @see no.hal.emfs.GitURLContentProvider
	 * @generated
	 */
	EClass getGitURLContentProvider();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.GitURLContentProvider#getGitRef <em>Git Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Git Ref</em>'.
	 * @see no.hal.emfs.GitURLContentProvider#getGitRef()
	 * @see #getGitURLContentProvider()
	 * @generated
	 */
	EReference getGitURLContentProvider_GitRef();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.GitRepoRef <em>Git Repo Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Repo Ref</em>'.
	 * @see no.hal.emfs.GitRepoRef
	 * @generated
	 */
	EClass getGitRepoRef();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.GitRepoRef#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see no.hal.emfs.GitRepoRef#getHost()
	 * @see #getGitRepoRef()
	 * @generated
	 */
	EAttribute getGitRepoRef_Host();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.GitRepoRef#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see no.hal.emfs.GitRepoRef#getOwner()
	 * @see #getGitRepoRef()
	 * @generated
	 */
	EAttribute getGitRepoRef_Owner();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.GitRepoRef#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo</em>'.
	 * @see no.hal.emfs.GitRepoRef#getRepo()
	 * @see #getGitRepoRef()
	 * @generated
	 */
	EAttribute getGitRepoRef_Repo();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.GitRepoRef#getRemoteString <em>Remote String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote String</em>'.
	 * @see no.hal.emfs.GitRepoRef#getRemoteString()
	 * @see #getGitRepoRef()
	 * @generated
	 */
	EAttribute getGitRepoRef_RemoteString();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.GitContentRef <em>Git Content Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Content Ref</em>'.
	 * @see no.hal.emfs.GitContentRef
	 * @generated
	 */
	EClass getGitContentRef();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.GitContentRef#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see no.hal.emfs.GitContentRef#getPath()
	 * @see #getGitContentRef()
	 * @generated
	 */
	EAttribute getGitContentRef_Path();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.GitContentRef#getUrlString <em>Url String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url String</em>'.
	 * @see no.hal.emfs.GitContentRef#getUrlString()
	 * @see #getGitContentRef()
	 * @generated
	 */
	EAttribute getGitContentRef_UrlString();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.CachingContentProvider <em>Caching Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caching Content Provider</em>'.
	 * @see no.hal.emfs.CachingContentProvider
	 * @generated
	 */
	EClass getCachingContentProvider();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.emfs.CachingContentProvider#getContentProvider <em>Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Provider</em>'.
	 * @see no.hal.emfs.CachingContentProvider#getContentProvider()
	 * @see #getCachingContentProvider()
	 * @generated
	 */
	EReference getCachingContentProvider_ContentProvider();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.CachingContentProvider#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see no.hal.emfs.CachingContentProvider#getCache()
	 * @see #getCachingContentProvider()
	 * @generated
	 */
	EAttribute getCachingContentProvider_Cache();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.DotClasspathFileContentProvider <em>Dot Classpath File Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Classpath File Content Provider</em>'.
	 * @see no.hal.emfs.DotClasspathFileContentProvider
	 * @generated
	 */
	EClass getDotClasspathFileContentProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.emfs.DotClasspathFileContentProvider#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see no.hal.emfs.DotClasspathFileContentProvider#getEntries()
	 * @see #getDotClasspathFileContentProvider()
	 * @generated
	 */
	EReference getDotClasspathFileContentProvider_Entries();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.AbstractClasspathEntry <em>Abstract Classpath Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Classpath Entry</em>'.
	 * @see no.hal.emfs.AbstractClasspathEntry
	 * @generated
	 */
	EClass getAbstractClasspathEntry();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.AbstractClasspathEntry#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see no.hal.emfs.AbstractClasspathEntry#getKind()
	 * @see #getAbstractClasspathEntry()
	 * @generated
	 */
	EAttribute getAbstractClasspathEntry_Kind();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.AbstractClasspathEntry#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see no.hal.emfs.AbstractClasspathEntry#getPath()
	 * @see #getAbstractClasspathEntry()
	 * @generated
	 */
	EAttribute getAbstractClasspathEntry_Path();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.AbstractClasspathEntry#isExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exported</em>'.
	 * @see no.hal.emfs.AbstractClasspathEntry#isExported()
	 * @see #getAbstractClasspathEntry()
	 * @generated
	 */
	EAttribute getAbstractClasspathEntry_Exported();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.ClasspathEntry <em>Classpath Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classpath Entry</em>'.
	 * @see no.hal.emfs.ClasspathEntry
	 * @generated
	 */
	EClass getClasspathEntry();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.ClasspathEntry#getExplicitKind <em>Explicit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Kind</em>'.
	 * @see no.hal.emfs.ClasspathEntry#getExplicitKind()
	 * @see #getClasspathEntry()
	 * @generated
	 */
	EAttribute getClasspathEntry_ExplicitKind();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.ClasspathEntry#getExplicitPath <em>Explicit Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Path</em>'.
	 * @see no.hal.emfs.ClasspathEntry#getExplicitPath()
	 * @see #getClasspathEntry()
	 * @generated
	 */
	EAttribute getClasspathEntry_ExplicitPath();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.ClasspathEntry#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see no.hal.emfs.ClasspathEntry#getMajor()
	 * @see #getClasspathEntry()
	 * @generated
	 */
	EAttribute getClasspathEntry_Major();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.emfs.ClasspathEntry#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see no.hal.emfs.ClasspathEntry#getMinor()
	 * @see #getClasspathEntry()
	 * @generated
	 */
	EAttribute getClasspathEntry_Minor();

	/**
	 * Returns the meta object for class '{@link no.hal.emfs.DotProjectFileContentProvider <em>Dot Project File Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Project File Content Provider</em>'.
	 * @see no.hal.emfs.DotProjectFileContentProvider
	 * @generated
	 */
	EClass getDotProjectFileContentProvider();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.emfs.DotProjectFileContentProvider#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keys</em>'.
	 * @see no.hal.emfs.DotProjectFileContentProvider#getKeys()
	 * @see #getDotProjectFileContentProvider()
	 * @generated
	 */
	EAttribute getDotProjectFileContentProvider_Keys();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.emfs.DotProjectFileContentProvider#getLinkedResources <em>Linked Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Resources</em>'.
	 * @see no.hal.emfs.DotProjectFileContentProvider#getLinkedResources()
	 * @see #getDotProjectFileContentProvider()
	 * @generated
	 */
	EReference getDotProjectFileContentProvider_LinkedResources();

	/**
	 * Returns the meta object for enum '{@link no.hal.emfs.ClasspathEntryKind <em>Classpath Entry Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classpath Entry Kind</em>'.
	 * @see no.hal.emfs.ClasspathEntryKind
	 * @generated
	 */
	EEnum getClasspathEntryKind();

	/**
	 * Returns the meta object for data type '{@link no.hal.emfs.util.ImportSupport <em>Import Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Import Support</em>'.
	 * @see no.hal.emfs.util.ImportSupport
	 * @model instanceClass="no.hal.emfs.util.ImportSupport"
	 * @generated
	 */
	EDataType getImportSupport();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>EInput Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInput Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream" serializeable="false"
	 * @generated
	 */
	EDataType getEInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>EOutput Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EOutput Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream" serializeable="false"
	 * @generated
	 */
	EDataType getEOutputStream();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfsFactory getEmfsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.EmfsResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.EmfsResourceImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsResource()
		 * @generated
		 */
		EClass EMFS_RESOURCE = eINSTANCE.getEmfsResource();

		/**
		 * The meta object literal for the '<em><b>Writeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMFS_RESOURCE__WRITEABLE = eINSTANCE.getEmfsResource_Writeable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMFS_RESOURCE__NAME = eINSTANCE.getEmfsResource_Name();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_RESOURCE__CONTAINER = eINSTANCE.getEmfsResource_Container();

		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMFS_RESOURCE__FULL_PATH = eINSTANCE.getEmfsResource_FullPath();

		/**
		 * The meta object literal for the '<em><b>Container Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMFS_RESOURCE__CONTAINER_PATH = eINSTANCE.getEmfsResource_ContainerPath();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMFS_RESOURCE__FULL_NAME = eINSTANCE.getEmfsResource_FullName();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.TagsOwnerImpl <em>Tags Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.TagsOwnerImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getTagsOwner()
		 * @generated
		 */
		EClass TAGS_OWNER = eINSTANCE.getTagsOwner();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS_OWNER__TAGS = eINSTANCE.getTagsOwner_Tags();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.PropertyOwnerImpl <em>Property Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.PropertyOwnerImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getPropertyOwner()
		 * @generated
		 */
		EClass PROPERTY_OWNER = eINSTANCE.getPropertyOwner();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_OWNER__PROPERTIES = eINSTANCE.getPropertyOwner_Properties();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.PropertyImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.EmfsContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.EmfsContainerImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsContainer()
		 * @generated
		 */
		EClass EMFS_CONTAINER = eINSTANCE.getEmfsContainer();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_CONTAINER__RESOURCES = eINSTANCE.getEmfsContainer_Resources();

		/**
		 * The meta object literal for the '<em><b>Content Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_CONTAINER__CONTENT_PROVIDER = eINSTANCE.getEmfsContainer_ContentProvider();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.EmfsContainerContentProviderImpl <em>Container Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.EmfsContainerContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsContainerContentProvider()
		 * @generated
		 */
		EClass EMFS_CONTAINER_CONTENT_PROVIDER = eINSTANCE.getEmfsContainerContentProvider();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.EmfsResourcesRefImpl <em>Resources Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.EmfsResourcesRefImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsResourcesRef()
		 * @generated
		 */
		EClass EMFS_RESOURCES_REF = eINSTANCE.getEmfsResourcesRef();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_RESOURCES_REF__RESOURCES = eINSTANCE.getEmfsResourcesRef_Resources();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.GitContentProviderImpl <em>Git Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.GitContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitContentProvider()
		 * @generated
		 */
		EClass GIT_CONTENT_PROVIDER = eINSTANCE.getGitContentProvider();

		/**
		 * The meta object literal for the '<em><b>Git Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_CONTENT_PROVIDER__GIT_REF = eINSTANCE.getGitContentProvider_GitRef();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.EmfsFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.EmfsFileImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsFile()
		 * @generated
		 */
		EClass EMFS_FILE = eINSTANCE.getEmfsFile();

		/**
		 * The meta object literal for the '<em><b>Content Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_FILE__CONTENT_PROVIDER = eINSTANCE.getEmfsFile_ContentProvider();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.EmfsFileContentProvider <em>File Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.EmfsFileContentProvider
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEmfsFileContentProvider()
		 * @generated
		 */
		EClass EMFS_FILE_CONTENT_PROVIDER = eINSTANCE.getEmfsFileContentProvider();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMFS_FILE_CONTENT_PROVIDER__FILE = eINSTANCE.getEmfsFileContentProvider_File();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.AbstractBytesContentProviderImpl <em>Abstract Bytes Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.AbstractBytesContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractBytesContentProvider()
		 * @generated
		 */
		EClass ABSTRACT_BYTES_CONTENT_PROVIDER = eINSTANCE.getAbstractBytesContentProvider();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.ByteArrayContentProviderImpl <em>Byte Array Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.ByteArrayContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getByteArrayContentProvider()
		 * @generated
		 */
		EClass BYTE_ARRAY_CONTENT_PROVIDER = eINSTANCE.getByteArrayContentProvider();

		/**
		 * The meta object literal for the '<em><b>Byte Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS = eINSTANCE.getByteArrayContentProvider_ByteContents();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.AbstractStringContentProviderImpl <em>Abstract String Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.AbstractStringContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractStringContentProvider()
		 * @generated
		 */
		EClass ABSTRACT_STRING_CONTENT_PROVIDER = eINSTANCE.getAbstractStringContentProvider();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.StringContentProviderImpl <em>String Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.StringContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getStringContentProvider()
		 * @generated
		 */
		EClass STRING_CONTENT_PROVIDER = eINSTANCE.getStringContentProvider();

		/**
		 * The meta object literal for the '<em><b>String Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_CONTENT_PROVIDER__STRING_CONTENTS = eINSTANCE.getStringContentProvider_StringContents();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.AbstractStringContentsImpl <em>Abstract String Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.AbstractStringContentsImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractStringContents()
		 * @generated
		 */
		EClass ABSTRACT_STRING_CONTENTS = eINSTANCE.getAbstractStringContents();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.VerbatimStringContentsImpl <em>Verbatim String Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.VerbatimStringContentsImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getVerbatimStringContents()
		 * @generated
		 */
		EClass VERBATIM_STRING_CONTENTS = eINSTANCE.getVerbatimStringContents();

		/**
		 * The meta object literal for the '<em><b>String Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBATIM_STRING_CONTENTS__STRING_CONTENT = eINSTANCE.getVerbatimStringContents_StringContent();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.PropertyValueStringImpl <em>Property Value String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.PropertyValueStringImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getPropertyValueString()
		 * @generated
		 */
		EClass PROPERTY_VALUE_STRING = eINSTANCE.getPropertyValueString();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_STRING__PROPERTY_NAME = eINSTANCE.getPropertyValueString_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE_STRING__DEFAULT_VALUE = eINSTANCE.getPropertyValueString_DefaultValue();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.WrappingStringContentProviderImpl <em>Wrapping String Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.WrappingStringContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getWrappingStringContentProvider()
		 * @generated
		 */
		EClass WRAPPING_STRING_CONTENT_PROVIDER = eINSTANCE.getWrappingStringContentProvider();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRAPPING_STRING_CONTENT_PROVIDER__PREFIX = eINSTANCE.getWrappingStringContentProvider_Prefix();

		/**
		 * The meta object literal for the '<em><b>Content Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER = eINSTANCE.getWrappingStringContentProvider_ContentProvider();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX = eINSTANCE.getWrappingStringContentProvider_Suffix();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.AbstractURLContentProviderImpl <em>Abstract URL Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.AbstractURLContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractURLContentProvider()
		 * @generated
		 */
		EClass ABSTRACT_URL_CONTENT_PROVIDER = eINSTANCE.getAbstractURLContentProvider();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.URLContentProviderImpl <em>URL Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.URLContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getURLContentProvider()
		 * @generated
		 */
		EClass URL_CONTENT_PROVIDER = eINSTANCE.getURLContentProvider();

		/**
		 * The meta object literal for the '<em><b>Url String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_CONTENT_PROVIDER__URL_STRING = eINSTANCE.getURLContentProvider_UrlString();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.GitURLContentProviderImpl <em>Git URL Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.GitURLContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitURLContentProvider()
		 * @generated
		 */
		EClass GIT_URL_CONTENT_PROVIDER = eINSTANCE.getGitURLContentProvider();

		/**
		 * The meta object literal for the '<em><b>Git Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_URL_CONTENT_PROVIDER__GIT_REF = eINSTANCE.getGitURLContentProvider_GitRef();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.GitRepoRefImpl <em>Git Repo Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.GitRepoRefImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitRepoRef()
		 * @generated
		 */
		EClass GIT_REPO_REF = eINSTANCE.getGitRepoRef();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO_REF__HOST = eINSTANCE.getGitRepoRef_Host();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO_REF__OWNER = eINSTANCE.getGitRepoRef_Owner();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO_REF__REPO = eINSTANCE.getGitRepoRef_Repo();

		/**
		 * The meta object literal for the '<em><b>Remote String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_REPO_REF__REMOTE_STRING = eINSTANCE.getGitRepoRef_RemoteString();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.GitContentRefImpl <em>Git Content Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.GitContentRefImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getGitContentRef()
		 * @generated
		 */
		EClass GIT_CONTENT_REF = eINSTANCE.getGitContentRef();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_CONTENT_REF__PATH = eINSTANCE.getGitContentRef_Path();

		/**
		 * The meta object literal for the '<em><b>Url String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_CONTENT_REF__URL_STRING = eINSTANCE.getGitContentRef_UrlString();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.CachingContentProviderImpl <em>Caching Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.CachingContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getCachingContentProvider()
		 * @generated
		 */
		EClass CACHING_CONTENT_PROVIDER = eINSTANCE.getCachingContentProvider();

		/**
		 * The meta object literal for the '<em><b>Content Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER = eINSTANCE.getCachingContentProvider_ContentProvider();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHING_CONTENT_PROVIDER__CACHE = eINSTANCE.getCachingContentProvider_Cache();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.DotClasspathFileContentProviderImpl <em>Dot Classpath File Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.DotClasspathFileContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getDotClasspathFileContentProvider()
		 * @generated
		 */
		EClass DOT_CLASSPATH_FILE_CONTENT_PROVIDER = eINSTANCE.getDotClasspathFileContentProvider();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES = eINSTANCE.getDotClasspathFileContentProvider_Entries();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.AbstractClasspathEntryImpl <em>Abstract Classpath Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.AbstractClasspathEntryImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getAbstractClasspathEntry()
		 * @generated
		 */
		EClass ABSTRACT_CLASSPATH_ENTRY = eINSTANCE.getAbstractClasspathEntry();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLASSPATH_ENTRY__KIND = eINSTANCE.getAbstractClasspathEntry_Kind();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLASSPATH_ENTRY__PATH = eINSTANCE.getAbstractClasspathEntry_Path();

		/**
		 * The meta object literal for the '<em><b>Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CLASSPATH_ENTRY__EXPORTED = eINSTANCE.getAbstractClasspathEntry_Exported();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.ClasspathEntryImpl <em>Classpath Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.ClasspathEntryImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getClasspathEntry()
		 * @generated
		 */
		EClass CLASSPATH_ENTRY = eINSTANCE.getClasspathEntry();

		/**
		 * The meta object literal for the '<em><b>Explicit Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSPATH_ENTRY__EXPLICIT_KIND = eINSTANCE.getClasspathEntry_ExplicitKind();

		/**
		 * The meta object literal for the '<em><b>Explicit Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSPATH_ENTRY__EXPLICIT_PATH = eINSTANCE.getClasspathEntry_ExplicitPath();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSPATH_ENTRY__MAJOR = eINSTANCE.getClasspathEntry_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSPATH_ENTRY__MINOR = eINSTANCE.getClasspathEntry_Minor();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.impl.DotProjectFileContentProviderImpl <em>Dot Project File Content Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.impl.DotProjectFileContentProviderImpl
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getDotProjectFileContentProvider()
		 * @generated
		 */
		EClass DOT_PROJECT_FILE_CONTENT_PROVIDER = eINSTANCE.getDotProjectFileContentProvider();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS = eINSTANCE.getDotProjectFileContentProvider_Keys();

		/**
		 * The meta object literal for the '<em><b>Linked Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES = eINSTANCE.getDotProjectFileContentProvider_LinkedResources();

		/**
		 * The meta object literal for the '{@link no.hal.emfs.ClasspathEntryKind <em>Classpath Entry Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.ClasspathEntryKind
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getClasspathEntryKind()
		 * @generated
		 */
		EEnum CLASSPATH_ENTRY_KIND = eINSTANCE.getClasspathEntryKind();

		/**
		 * The meta object literal for the '<em>Import Support</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.emfs.util.ImportSupport
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getImportSupport()
		 * @generated
		 */
		EDataType IMPORT_SUPPORT = eINSTANCE.getImportSupport();

		/**
		 * The meta object literal for the '<em>EInput Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEInputStream()
		 * @generated
		 */
		EDataType EINPUT_STREAM = eINSTANCE.getEInputStream();

		/**
		 * The meta object literal for the '<em>EOutput Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see no.hal.emfs.impl.EmfsPackageImpl#getEOutputStream()
		 * @generated
		 */
		EDataType EOUTPUT_STREAM = eINSTANCE.getEOutputStream();

	}

} //EmfsPackage
