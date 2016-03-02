/**
 */
package no.hal.emfs.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import no.hal.emfs.*;
import no.hal.emfs.exporter.ExportSupport;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
import no.hal.emfs.XmlAttribute;
import no.hal.emfs.XmlContents;
import no.hal.emfs.XmlElement;
import no.hal.emfs.XmlPIElement;
import no.hal.emfs.XmlStringContents;
import no.hal.emfs.XmlTag;
import no.hal.emfs.XmlTagElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.EmfsPackage
 * @generated
 */
public class EmfsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EmfsValidator INSTANCE = new EmfsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.emfs";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EmfsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EmfsPackage.EMFS_RESOURCE:
				return validateEmfsResource((EmfsResource)value, diagnostics, context);
			case EmfsPackage.TAGS_OWNER:
				return validateTagsOwner((TagsOwner)value, diagnostics, context);
			case EmfsPackage.PROPERTY_OWNER:
				return validatePropertyOwner((PropertyOwner)value, diagnostics, context);
			case EmfsPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case EmfsPackage.EMFS_CONTAINER:
				return validateEmfsContainer((EmfsContainer)value, diagnostics, context);
			case EmfsPackage.EMFS_CONTAINER_CONTENT_PROVIDER:
				return validateEmfsContainerContentProvider((EmfsContainerContentProvider)value, diagnostics, context);
			case EmfsPackage.EMFS_RESOURCES_REF:
				return validateEmfsResourcesRef((EmfsResourcesRef)value, diagnostics, context);
			case EmfsPackage.GIT_CONTENT_PROVIDER:
				return validateGitContentProvider((GitContentProvider)value, diagnostics, context);
			case EmfsPackage.EMFS_FILE:
				return validateEmfsFile((EmfsFile)value, diagnostics, context);
			case EmfsPackage.EMFS_FILE_CONTENT_PROVIDER:
				return validateEmfsFileContentProvider((EmfsFileContentProvider)value, diagnostics, context);
			case EmfsPackage.ABSTRACT_BYTES_CONTENT_PROVIDER:
				return validateAbstractBytesContentProvider((AbstractBytesContentProvider)value, diagnostics, context);
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER:
				return validateByteArrayContentProvider((ByteArrayContentProvider)value, diagnostics, context);
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER:
				return validateAbstractStringContentProvider((AbstractStringContentProvider)value, diagnostics, context);
			case EmfsPackage.STRING_CONTENT_PROVIDER:
				return validateStringContentProvider((StringContentProvider)value, diagnostics, context);
			case EmfsPackage.ABSTRACT_STRING_CONTENTS:
				return validateAbstractStringContents((AbstractStringContents)value, diagnostics, context);
			case EmfsPackage.VERBATIM_STRING_CONTENTS:
				return validateVerbatimStringContents((VerbatimStringContents)value, diagnostics, context);
			case EmfsPackage.PROPERTY_VALUE_STRING:
				return validatePropertyValueString((PropertyValueString)value, diagnostics, context);
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER:
				return validateWrappingStringContentProvider((WrappingStringContentProvider)value, diagnostics, context);
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER:
				return validateAbstractURLContentProvider((AbstractURLContentProvider)value, diagnostics, context);
			case EmfsPackage.URL_CONTENT_PROVIDER:
				return validateURLContentProvider((URLContentProvider)value, diagnostics, context);
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER:
				return validateGitURLContentProvider((GitURLContentProvider)value, diagnostics, context);
			case EmfsPackage.GIT_REPO_REF:
				return validateGitRepoRef((GitRepoRef)value, diagnostics, context);
			case EmfsPackage.GIT_CONTENT_REF:
				return validateGitContentRef((GitContentRef)value, diagnostics, context);
			case EmfsPackage.CACHING_CONTENT_PROVIDER:
				return validateCachingContentProvider((CachingContentProvider)value, diagnostics, context);
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER:
				return validateDotClasspathFileContentProvider((DotClasspathFileContentProvider)value, diagnostics, context);
			case EmfsPackage.ABSTRACT_CLASSPATH_ENTRY:
				return validateAbstractClasspathEntry((AbstractClasspathEntry)value, diagnostics, context);
			case EmfsPackage.CLASSPATH_ENTRY:
				return validateClasspathEntry((ClasspathEntry)value, diagnostics, context);
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER:
				return validateDotProjectFileContentProvider((DotProjectFileContentProvider)value, diagnostics, context);
			case EmfsPackage.XML_STRING_CONTENTS:
				return validateXmlStringContents((XmlStringContents)value, diagnostics, context);
			case EmfsPackage.XML_CONTENTS:
				return validateXmlContents((XmlContents)value, diagnostics, context);
			case EmfsPackage.XML_ELEMENT:
				return validateXmlElement((XmlElement)value, diagnostics, context);
			case EmfsPackage.XML_PI_ELEMENT:
				return validateXmlPIElement((XmlPIElement)value, diagnostics, context);
			case EmfsPackage.XML_TAG_ELEMENT:
				return validateXmlTagElement((XmlTagElement)value, diagnostics, context);
			case EmfsPackage.XML_TAG:
				return validateXmlTag((XmlTag)value, diagnostics, context);
			case EmfsPackage.XML_ATTRIBUTE:
				return validateXmlAttribute((XmlAttribute)value, diagnostics, context);
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS:
				return validateEmfResourceStringContents((EmfResourceStringContents)value, diagnostics, context);
			case EmfsPackage.CLASSPATH_ENTRY_KIND:
				return validateClasspathEntryKind((ClasspathEntryKind)value, diagnostics, context);
			case EmfsPackage.EXPORT_SUPPORT:
				return validateExportSupport((ExportSupport)value, diagnostics, context);
			case EmfsPackage.EINPUT_STREAM:
				return validateEInputStream((InputStream)value, diagnostics, context);
			case EmfsPackage.EOUTPUT_STREAM:
				return validateEOutputStream((OutputStream)value, diagnostics, context);
			case EmfsPackage.ESTRING_ACCUMULATOR:
				return validateEStringAccumulator((StringAccumulator<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfsResource(EmfsResource emfsResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfsResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagsOwner(TagsOwner tagsOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagsOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyOwner(PropertyOwner propertyOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyOwner, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfsContainer(EmfsContainer emfsContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfsContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfsContainerContentProvider(EmfsContainerContentProvider emfsContainerContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfsContainerContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfsResourcesRef(EmfsResourcesRef emfsResourcesRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfsResourcesRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGitContentProvider(GitContentProvider gitContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gitContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfsFile(EmfsFile emfsFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfsFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfsFileContentProvider(EmfsFileContentProvider emfsFileContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfsFileContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractBytesContentProvider(AbstractBytesContentProvider abstractBytesContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractBytesContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteArrayContentProvider(ByteArrayContentProvider byteArrayContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(byteArrayContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractStringContentProvider(AbstractStringContentProvider abstractStringContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractStringContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringContentProvider(StringContentProvider stringContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractStringContents(AbstractStringContents abstractStringContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractStringContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerbatimStringContents(VerbatimStringContents verbatimStringContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verbatimStringContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValueString(PropertyValueString propertyValueString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValueString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWrappingStringContentProvider(WrappingStringContentProvider wrappingStringContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wrappingStringContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractURLContentProvider(AbstractURLContentProvider abstractURLContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractURLContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURLContentProvider(URLContentProvider urlContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(urlContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGitURLContentProvider(GitURLContentProvider gitURLContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gitURLContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGitRepoRef(GitRepoRef gitRepoRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gitRepoRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGitContentRef(GitContentRef gitContentRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gitContentRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCachingContentProvider(CachingContentProvider cachingContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cachingContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDotClasspathFileContentProvider(DotClasspathFileContentProvider dotClasspathFileContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dotClasspathFileContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractClasspathEntry(AbstractClasspathEntry abstractClasspathEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractClasspathEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClasspathEntry(ClasspathEntry classpathEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classpathEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDotProjectFileContentProvider(DotProjectFileContentProvider dotProjectFileContentProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dotProjectFileContentProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlStringContents(XmlStringContents xmlStringContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlStringContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlContents(XmlContents xmlContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlElement(XmlElement xmlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlPIElement(XmlPIElement xmlPIElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlPIElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlTagElement(XmlTagElement xmlTagElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(xmlTagElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateXmlTagElement_MatchingEndTag(xmlTagElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MatchingEndTag constraint of '<em>Xml Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateXmlTagElement_MatchingEndTag(XmlTagElement xmlTagElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		String endTag = xmlTagElement.getEndTag();
		if (endTag != null && (! xmlTagElement.getStartTag().getName().equals(endTag))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MatchingEndTag", getObjectLabel(xmlTagElement, context) },
						 new Object[] { xmlTagElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlTag(XmlTag xmlTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlTag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlAttribute(XmlAttribute xmlAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmfResourceStringContents(EmfResourceStringContents emfResourceStringContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emfResourceStringContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClasspathEntryKind(ClasspathEntryKind classpathEntryKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExportSupport(ExportSupport exportSupport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInputStream(InputStream eInputStream, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEOutputStream(OutputStream eOutputStream, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEStringAccumulator(StringAccumulator<?> eStringAccumulator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EmfsValidator
