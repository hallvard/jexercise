/**
 */
package no.hal.emfs.impl;

import java.io.InputStream;
import java.io.OutputStream;
import no.hal.emfs.AbstractBytesContentProvider;
import no.hal.emfs.AbstractClasspathEntry;
import no.hal.emfs.AbstractStringContentProvider;
import no.hal.emfs.AbstractStringContents;
import no.hal.emfs.AbstractURLContentProvider;
import no.hal.emfs.ByteArrayContentProvider;
import no.hal.emfs.CachingContentProvider;
import no.hal.emfs.ClasspathEntry;
import no.hal.emfs.ClasspathEntryKind;
import no.hal.emfs.DotClasspathFileContentProvider;
import no.hal.emfs.DotProjectFileContentProvider;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.EmfsResourcesRef;
import no.hal.emfs.GitContentProvider;
import no.hal.emfs.GitContentRef;
import no.hal.emfs.GitRepoRef;
import no.hal.emfs.GitURLContentProvider;
import no.hal.emfs.Property;
import no.hal.emfs.PropertyOwner;
import no.hal.emfs.PropertyValueString;
import no.hal.emfs.StringContentProvider;
import no.hal.emfs.TagsOwner;
import no.hal.emfs.URLContentProvider;
import no.hal.emfs.VerbatimStringContents;
import no.hal.emfs.WrappingStringContentProvider;
import no.hal.emfs.util.ImportSupport;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfsPackageImpl extends EPackageImpl implements EmfsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsContainerContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsResourcesRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfsFileContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBytesContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteArrayContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStringContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStringContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbatimStringContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrappingStringContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractURLContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitURLContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitRepoRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitContentRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachingContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotClasspathFileContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClasspathEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classpathEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotProjectFileContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classpathEntryKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType importSupportEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eInputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eOutputStreamEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.emfs.EmfsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfsPackageImpl() {
		super(eNS_URI, EmfsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EmfsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfsPackage init() {
		if (isInited) return (EmfsPackage)EPackage.Registry.INSTANCE.getEPackage(EmfsPackage.eNS_URI);

		// Obtain or create and register package
		EmfsPackageImpl theEmfsPackage = (EmfsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmfsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmfsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEmfsPackage.createPackageContents();

		// Initialize created meta-data
		theEmfsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmfsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmfsPackage.eNS_URI, theEmfsPackage);
		return theEmfsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsResource() {
		return emfsResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmfsResource_Writeable() {
		return (EAttribute)emfsResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmfsResource_Name() {
		return (EAttribute)emfsResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsResource_Container() {
		return (EReference)emfsResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmfsResource_FullPath() {
		return (EAttribute)emfsResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmfsResource_ContainerPath() {
		return (EAttribute)emfsResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmfsResource_FullName() {
		return (EAttribute)emfsResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagsOwner() {
		return tagsOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsOwner_Tags() {
		return (EAttribute)tagsOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyOwner() {
		return propertyOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyOwner_Properties() {
		return (EReference)propertyOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsContainer() {
		return emfsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsContainer_Resources() {
		return (EReference)emfsContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsContainer_ContentProvider() {
		return (EReference)emfsContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsContainerContentProvider() {
		return emfsContainerContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsResourcesRef() {
		return emfsResourcesRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsResourcesRef_Resources() {
		return (EReference)emfsResourcesRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGitContentProvider() {
		return gitContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGitContentProvider_GitRef() {
		return (EReference)gitContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsFile() {
		return emfsFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsFile_ContentProvider() {
		return (EReference)emfsFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfsFileContentProvider() {
		return emfsFileContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmfsFileContentProvider_File() {
		return (EReference)emfsFileContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBytesContentProvider() {
		return abstractBytesContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByteArrayContentProvider() {
		return byteArrayContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByteArrayContentProvider_ByteContents() {
		return (EAttribute)byteArrayContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStringContentProvider() {
		return abstractStringContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringContentProvider() {
		return stringContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringContentProvider_StringContents() {
		return (EReference)stringContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStringContents() {
		return abstractStringContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerbatimStringContents() {
		return verbatimStringContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerbatimStringContents_StringContent() {
		return (EAttribute)verbatimStringContentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueString() {
		return propertyValueStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueString_PropertyName() {
		return (EAttribute)propertyValueStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyValueString_DefaultValue() {
		return (EAttribute)propertyValueStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrappingStringContentProvider() {
		return wrappingStringContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrappingStringContentProvider_Prefix() {
		return (EReference)wrappingStringContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrappingStringContentProvider_ContentProvider() {
		return (EReference)wrappingStringContentProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWrappingStringContentProvider_Suffix() {
		return (EReference)wrappingStringContentProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractURLContentProvider() {
		return abstractURLContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLContentProvider() {
		return urlContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLContentProvider_UrlString() {
		return (EAttribute)urlContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGitURLContentProvider() {
		return gitURLContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGitURLContentProvider_GitRef() {
		return (EReference)gitURLContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGitRepoRef() {
		return gitRepoRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitRepoRef_Host() {
		return (EAttribute)gitRepoRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitRepoRef_Owner() {
		return (EAttribute)gitRepoRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitRepoRef_Repo() {
		return (EAttribute)gitRepoRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitRepoRef_RemoteString() {
		return (EAttribute)gitRepoRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGitContentRef() {
		return gitContentRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitContentRef_Path() {
		return (EAttribute)gitContentRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGitContentRef_UrlString() {
		return (EAttribute)gitContentRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCachingContentProvider() {
		return cachingContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCachingContentProvider_ContentProvider() {
		return (EReference)cachingContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCachingContentProvider_Cache() {
		return (EAttribute)cachingContentProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotClasspathFileContentProvider() {
		return dotClasspathFileContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotClasspathFileContentProvider_Entries() {
		return (EReference)dotClasspathFileContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClasspathEntry() {
		return abstractClasspathEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClasspathEntry_Kind() {
		return (EAttribute)abstractClasspathEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClasspathEntry_Path() {
		return (EAttribute)abstractClasspathEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractClasspathEntry_Exported() {
		return (EAttribute)abstractClasspathEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClasspathEntry() {
		return classpathEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClasspathEntry_ExplicitKind() {
		return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClasspathEntry_ExplicitPath() {
		return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClasspathEntry_Major() {
		return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClasspathEntry_Minor() {
		return (EAttribute)classpathEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotProjectFileContentProvider() {
		return dotProjectFileContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotProjectFileContentProvider_Keys() {
		return (EAttribute)dotProjectFileContentProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotProjectFileContentProvider_LinkedResources() {
		return (EReference)dotProjectFileContentProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClasspathEntryKind() {
		return classpathEntryKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImportSupport() {
		return importSupportEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInputStream() {
		return eInputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEOutputStream() {
		return eOutputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFactory getEmfsFactory() {
		return (EmfsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		emfsResourceEClass = createEClass(EMFS_RESOURCE);
		createEAttribute(emfsResourceEClass, EMFS_RESOURCE__WRITEABLE);
		createEAttribute(emfsResourceEClass, EMFS_RESOURCE__NAME);
		createEReference(emfsResourceEClass, EMFS_RESOURCE__CONTAINER);
		createEAttribute(emfsResourceEClass, EMFS_RESOURCE__FULL_PATH);
		createEAttribute(emfsResourceEClass, EMFS_RESOURCE__CONTAINER_PATH);
		createEAttribute(emfsResourceEClass, EMFS_RESOURCE__FULL_NAME);

		tagsOwnerEClass = createEClass(TAGS_OWNER);
		createEAttribute(tagsOwnerEClass, TAGS_OWNER__TAGS);

		propertyOwnerEClass = createEClass(PROPERTY_OWNER);
		createEReference(propertyOwnerEClass, PROPERTY_OWNER__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		emfsContainerEClass = createEClass(EMFS_CONTAINER);
		createEReference(emfsContainerEClass, EMFS_CONTAINER__RESOURCES);
		createEReference(emfsContainerEClass, EMFS_CONTAINER__CONTENT_PROVIDER);

		emfsContainerContentProviderEClass = createEClass(EMFS_CONTAINER_CONTENT_PROVIDER);

		emfsResourcesRefEClass = createEClass(EMFS_RESOURCES_REF);
		createEReference(emfsResourcesRefEClass, EMFS_RESOURCES_REF__RESOURCES);

		gitContentProviderEClass = createEClass(GIT_CONTENT_PROVIDER);
		createEReference(gitContentProviderEClass, GIT_CONTENT_PROVIDER__GIT_REF);

		emfsFileEClass = createEClass(EMFS_FILE);
		createEReference(emfsFileEClass, EMFS_FILE__CONTENT_PROVIDER);

		emfsFileContentProviderEClass = createEClass(EMFS_FILE_CONTENT_PROVIDER);
		createEReference(emfsFileContentProviderEClass, EMFS_FILE_CONTENT_PROVIDER__FILE);

		abstractBytesContentProviderEClass = createEClass(ABSTRACT_BYTES_CONTENT_PROVIDER);

		byteArrayContentProviderEClass = createEClass(BYTE_ARRAY_CONTENT_PROVIDER);
		createEAttribute(byteArrayContentProviderEClass, BYTE_ARRAY_CONTENT_PROVIDER__BYTE_CONTENTS);

		abstractStringContentProviderEClass = createEClass(ABSTRACT_STRING_CONTENT_PROVIDER);

		stringContentProviderEClass = createEClass(STRING_CONTENT_PROVIDER);
		createEReference(stringContentProviderEClass, STRING_CONTENT_PROVIDER__STRING_CONTENTS);

		abstractStringContentsEClass = createEClass(ABSTRACT_STRING_CONTENTS);

		verbatimStringContentsEClass = createEClass(VERBATIM_STRING_CONTENTS);
		createEAttribute(verbatimStringContentsEClass, VERBATIM_STRING_CONTENTS__STRING_CONTENT);

		propertyValueStringEClass = createEClass(PROPERTY_VALUE_STRING);
		createEAttribute(propertyValueStringEClass, PROPERTY_VALUE_STRING__PROPERTY_NAME);
		createEAttribute(propertyValueStringEClass, PROPERTY_VALUE_STRING__DEFAULT_VALUE);

		wrappingStringContentProviderEClass = createEClass(WRAPPING_STRING_CONTENT_PROVIDER);
		createEReference(wrappingStringContentProviderEClass, WRAPPING_STRING_CONTENT_PROVIDER__PREFIX);
		createEReference(wrappingStringContentProviderEClass, WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER);
		createEReference(wrappingStringContentProviderEClass, WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX);

		abstractURLContentProviderEClass = createEClass(ABSTRACT_URL_CONTENT_PROVIDER);

		urlContentProviderEClass = createEClass(URL_CONTENT_PROVIDER);
		createEAttribute(urlContentProviderEClass, URL_CONTENT_PROVIDER__URL_STRING);

		gitURLContentProviderEClass = createEClass(GIT_URL_CONTENT_PROVIDER);
		createEReference(gitURLContentProviderEClass, GIT_URL_CONTENT_PROVIDER__GIT_REF);

		gitRepoRefEClass = createEClass(GIT_REPO_REF);
		createEAttribute(gitRepoRefEClass, GIT_REPO_REF__HOST);
		createEAttribute(gitRepoRefEClass, GIT_REPO_REF__OWNER);
		createEAttribute(gitRepoRefEClass, GIT_REPO_REF__REPO);
		createEAttribute(gitRepoRefEClass, GIT_REPO_REF__REMOTE_STRING);

		gitContentRefEClass = createEClass(GIT_CONTENT_REF);
		createEAttribute(gitContentRefEClass, GIT_CONTENT_REF__PATH);
		createEAttribute(gitContentRefEClass, GIT_CONTENT_REF__URL_STRING);

		cachingContentProviderEClass = createEClass(CACHING_CONTENT_PROVIDER);
		createEReference(cachingContentProviderEClass, CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER);
		createEAttribute(cachingContentProviderEClass, CACHING_CONTENT_PROVIDER__CACHE);

		dotClasspathFileContentProviderEClass = createEClass(DOT_CLASSPATH_FILE_CONTENT_PROVIDER);
		createEReference(dotClasspathFileContentProviderEClass, DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES);

		abstractClasspathEntryEClass = createEClass(ABSTRACT_CLASSPATH_ENTRY);
		createEAttribute(abstractClasspathEntryEClass, ABSTRACT_CLASSPATH_ENTRY__KIND);
		createEAttribute(abstractClasspathEntryEClass, ABSTRACT_CLASSPATH_ENTRY__PATH);
		createEAttribute(abstractClasspathEntryEClass, ABSTRACT_CLASSPATH_ENTRY__EXPORTED);

		classpathEntryEClass = createEClass(CLASSPATH_ENTRY);
		createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__EXPLICIT_KIND);
		createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__EXPLICIT_PATH);
		createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__MAJOR);
		createEAttribute(classpathEntryEClass, CLASSPATH_ENTRY__MINOR);

		dotProjectFileContentProviderEClass = createEClass(DOT_PROJECT_FILE_CONTENT_PROVIDER);
		createEAttribute(dotProjectFileContentProviderEClass, DOT_PROJECT_FILE_CONTENT_PROVIDER__KEYS);
		createEReference(dotProjectFileContentProviderEClass, DOT_PROJECT_FILE_CONTENT_PROVIDER__LINKED_RESOURCES);

		// Create enums
		classpathEntryKindEEnum = createEEnum(CLASSPATH_ENTRY_KIND);

		// Create data types
		importSupportEDataType = createEDataType(IMPORT_SUPPORT);
		eInputStreamEDataType = createEDataType(EINPUT_STREAM);
		eOutputStreamEDataType = createEDataType(EOUTPUT_STREAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		emfsResourceEClass.getESuperTypes().add(this.getTagsOwner());
		emfsResourceEClass.getESuperTypes().add(this.getPropertyOwner());
		emfsContainerEClass.getESuperTypes().add(this.getEmfsResource());
		emfsResourcesRefEClass.getESuperTypes().add(this.getEmfsContainerContentProvider());
		gitContentProviderEClass.getESuperTypes().add(this.getEmfsContainerContentProvider());
		emfsFileEClass.getESuperTypes().add(this.getEmfsResource());
		emfsFileEClass.getESuperTypes().add(this.getEmfsFileContentProvider());
		abstractBytesContentProviderEClass.getESuperTypes().add(this.getEmfsFileContentProvider());
		byteArrayContentProviderEClass.getESuperTypes().add(this.getAbstractBytesContentProvider());
		abstractStringContentProviderEClass.getESuperTypes().add(this.getAbstractBytesContentProvider());
		abstractStringContentProviderEClass.getESuperTypes().add(this.getAbstractStringContents());
		stringContentProviderEClass.getESuperTypes().add(this.getAbstractStringContentProvider());
		verbatimStringContentsEClass.getESuperTypes().add(this.getAbstractStringContents());
		propertyValueStringEClass.getESuperTypes().add(this.getAbstractStringContents());
		wrappingStringContentProviderEClass.getESuperTypes().add(this.getEmfsFileContentProvider());
		abstractURLContentProviderEClass.getESuperTypes().add(this.getEmfsFileContentProvider());
		urlContentProviderEClass.getESuperTypes().add(this.getAbstractURLContentProvider());
		gitURLContentProviderEClass.getESuperTypes().add(this.getAbstractURLContentProvider());
		gitContentRefEClass.getESuperTypes().add(this.getGitRepoRef());
		cachingContentProviderEClass.getESuperTypes().add(this.getEmfsFileContentProvider());
		dotClasspathFileContentProviderEClass.getESuperTypes().add(this.getAbstractStringContentProvider());
		classpathEntryEClass.getESuperTypes().add(this.getAbstractClasspathEntry());
		dotProjectFileContentProviderEClass.getESuperTypes().add(this.getAbstractStringContentProvider());

		// Initialize classes and features; add operations and parameters
		initEClass(emfsResourceEClass, EmfsResource.class, "EmfsResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmfsResource_Writeable(), ecorePackage.getEBoolean(), "writeable", null, 0, 1, EmfsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmfsResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, EmfsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmfsResource_Container(), this.getEmfsContainer(), this.getEmfsContainer_Resources(), "container", null, 0, 1, EmfsResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmfsResource_FullPath(), ecorePackage.getEString(), "fullPath", null, 0, 1, EmfsResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmfsResource_ContainerPath(), ecorePackage.getEString(), "containerPath", null, 0, 1, EmfsResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmfsResource_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, EmfsResource.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tagsOwnerEClass, TagsOwner.class, "TagsOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagsOwner_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, TagsOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyOwnerEClass, PropertyOwner.class, "PropertyOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyOwner_Properties(), this.getProperty(), null, "properties", null, 0, -1, PropertyOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfsContainerEClass, EmfsContainer.class, "EmfsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmfsContainer_Resources(), this.getEmfsResource(), this.getEmfsResource_Container(), "resources", null, 0, -1, EmfsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmfsContainer_ContentProvider(), this.getEmfsContainerContentProvider(), null, "contentProvider", null, 0, 1, EmfsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfsContainerContentProviderEClass, EmfsContainerContentProvider.class, "EmfsContainerContentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(emfsContainerContentProviderEClass, this.getEmfsResource(), "importContent", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImportSupport(), "importSupport", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(emfsResourcesRefEClass, EmfsResourcesRef.class, "EmfsResourcesRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmfsResourcesRef_Resources(), this.getEmfsResource(), null, "resources", null, 0, -1, EmfsResourcesRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitContentProviderEClass, GitContentProvider.class, "GitContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGitContentProvider_GitRef(), this.getGitContentRef(), null, "gitRef", null, 0, 1, GitContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfsFileEClass, EmfsFile.class, "EmfsFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmfsFile_ContentProvider(), this.getEmfsFileContentProvider(), this.getEmfsFileContentProvider_File(), "contentProvider", null, 0, 1, EmfsFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfsFileContentProviderEClass, EmfsFileContentProvider.class, "EmfsFileContentProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmfsFileContentProvider_File(), this.getEmfsFile(), this.getEmfsFile_ContentProvider(), "file", null, 0, 1, EmfsFileContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(emfsFileContentProviderEClass, this.getEInputStream(), "getInputStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(emfsFileContentProviderEClass, this.getEOutputStream(), "getOutputStream", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "options", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractBytesContentProviderEClass, AbstractBytesContentProvider.class, "AbstractBytesContentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractBytesContentProviderEClass, ecorePackage.getEByteArray(), "getByteContents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(abstractBytesContentProviderEClass, null, "setByteContents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "contents", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(byteArrayContentProviderEClass, ByteArrayContentProvider.class, "ByteArrayContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByteArrayContentProvider_ByteContents(), ecorePackage.getEByteArray(), "byteContents", null, 0, 1, ByteArrayContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStringContentProviderEClass, AbstractStringContentProvider.class, "AbstractStringContentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(abstractStringContentProviderEClass, null, "setStringContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "contents", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringContentProviderEClass, StringContentProvider.class, "StringContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringContentProvider_StringContents(), this.getAbstractStringContents(), null, "stringContents", null, 0, -1, StringContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStringContentsEClass, AbstractStringContents.class, "AbstractStringContents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractStringContentsEClass, ecorePackage.getEString(), "getStringContent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(verbatimStringContentsEClass, VerbatimStringContents.class, "VerbatimStringContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerbatimStringContents_StringContent(), ecorePackage.getEString(), "stringContent", null, 0, 1, VerbatimStringContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyValueStringEClass, PropertyValueString.class, "PropertyValueString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyValueString_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, PropertyValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyValueString_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, PropertyValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wrappingStringContentProviderEClass, WrappingStringContentProvider.class, "WrappingStringContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWrappingStringContentProvider_Prefix(), this.getAbstractStringContents(), null, "prefix", null, 0, 1, WrappingStringContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWrappingStringContentProvider_ContentProvider(), this.getEmfsFileContentProvider(), null, "contentProvider", null, 0, 1, WrappingStringContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWrappingStringContentProvider_Suffix(), this.getAbstractStringContents(), null, "suffix", null, 0, 1, WrappingStringContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractURLContentProviderEClass, AbstractURLContentProvider.class, "AbstractURLContentProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(abstractURLContentProviderEClass, ecorePackage.getEString(), "getUrlString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(urlContentProviderEClass, URLContentProvider.class, "URLContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLContentProvider_UrlString(), ecorePackage.getEString(), "urlString", null, 0, 1, URLContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitURLContentProviderEClass, GitURLContentProvider.class, "GitURLContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGitURLContentProvider_GitRef(), this.getGitContentRef(), null, "gitRef", null, 0, 1, GitURLContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitRepoRefEClass, GitRepoRef.class, "GitRepoRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitRepoRef_Host(), ecorePackage.getEString(), "host", null, 0, 1, GitRepoRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitRepoRef_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, GitRepoRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitRepoRef_Repo(), ecorePackage.getEString(), "repo", null, 0, 1, GitRepoRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitRepoRef_RemoteString(), ecorePackage.getEString(), "remoteString", null, 0, 1, GitRepoRef.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gitContentRefEClass, GitContentRef.class, "GitContentRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitContentRef_Path(), ecorePackage.getEString(), "path", null, 0, 1, GitContentRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGitContentRef_UrlString(), ecorePackage.getEString(), "urlString", null, 0, 1, GitContentRef.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cachingContentProviderEClass, CachingContentProvider.class, "CachingContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCachingContentProvider_ContentProvider(), this.getEmfsFileContentProvider(), null, "contentProvider", null, 0, 1, CachingContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCachingContentProvider_Cache(), ecorePackage.getEByteArray(), "cache", null, 0, 1, CachingContentProvider.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotClasspathFileContentProviderEClass, DotClasspathFileContentProvider.class, "DotClasspathFileContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotClasspathFileContentProvider_Entries(), this.getAbstractClasspathEntry(), null, "entries", null, 0, -1, DotClasspathFileContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractClasspathEntryEClass, AbstractClasspathEntry.class, "AbstractClasspathEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractClasspathEntry_Kind(), this.getClasspathEntryKind(), "kind", null, 0, 1, AbstractClasspathEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractClasspathEntry_Path(), ecorePackage.getEString(), "path", null, 0, 1, AbstractClasspathEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractClasspathEntry_Exported(), ecorePackage.getEBoolean(), "exported", null, 0, 1, AbstractClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classpathEntryEClass, ClasspathEntry.class, "ClasspathEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClasspathEntry_ExplicitKind(), this.getClasspathEntryKind(), "explicitKind", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClasspathEntry_ExplicitPath(), ecorePackage.getEString(), "explicitPath", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClasspathEntry_Major(), ecorePackage.getEInt(), "major", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClasspathEntry_Minor(), ecorePackage.getEInt(), "minor", null, 0, 1, ClasspathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotProjectFileContentProviderEClass, DotProjectFileContentProvider.class, "DotProjectFileContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDotProjectFileContentProvider_Keys(), ecorePackage.getEString(), "keys", null, 0, -1, DotProjectFileContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotProjectFileContentProvider_LinkedResources(), this.getEmfsResource(), null, "linkedResources", null, 0, -1, DotProjectFileContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classpathEntryKindEEnum, ClasspathEntryKind.class, "ClasspathEntryKind");
		addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.SRC);
		addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.OUTPUT);
		addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.LIB);
		addEEnumLiteral(classpathEntryKindEEnum, ClasspathEntryKind.CON);

		// Initialize data types
		initEDataType(importSupportEDataType, ImportSupport.class, "ImportSupport", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eInputStreamEDataType, InputStream.class, "EInputStream", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eOutputStreamEDataType, OutputStream.class, "EOutputStream", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// platform:/plugin/no.hal.emfs/model/emfs.ecore
		createEmfsAnnotations();
		// org.eclipse.core.resources.natures
		createOrgAnnotations();
		// org.eclipse.core.resources.builders
		createOrg_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>platform:/plugin/no.hal.emfs/model/emfs.ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmfsAnnotations() {
		String source = "platform:/plugin/no.hal.emfs/model/emfs.ecore";	
		addAnnotation
		  (getAbstractClasspathEntry_Path(), 
		   source, 
		   new String[] {
			 "java", "org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-${major}.${minor}",
			 "junit", "org.eclipse.jdt.junit.JUNIT_CONTAINER/${major}",
			 "plugins", "org.eclipse.pde.core.requiredPlugins"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.core.resources.natures</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.core.resources.natures";	
		addAnnotation
		  (dotProjectFileContentProviderEClass, 
		   source, 
		   new String[] {
			 "java", "org.eclipse.jdt.core.javanature",
			 "pde", "org.eclipse.pde.PluginNature"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.core.resources.builders</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_1Annotations() {
		String source = "org.eclipse.core.resources.builders";	
		addAnnotation
		  (dotProjectFileContentProviderEClass, 
		   source, 
		   new String[] {
			 "java", "org.eclipse.jdt.core.javabuilder",
			 "pde", "org.eclipse.pde.ManifestBuilder,org.eclipse.pde.SchemaBuilder"
		   });
	}

} //EmfsPackageImpl
