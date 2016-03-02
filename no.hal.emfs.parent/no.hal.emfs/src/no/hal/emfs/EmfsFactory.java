/**
 */
package no.hal.emfs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.EmfsPackage
 * @generated
 */
public interface EmfsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfsFactory eINSTANCE = no.hal.emfs.impl.EmfsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	EmfsResource createEmfsResource();

	/**
	 * Returns a new object of class '<em>Tags Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags Owner</em>'.
	 * @generated
	 */
	TagsOwner createTagsOwner();

	/**
	 * Returns a new object of class '<em>Property Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Owner</em>'.
	 * @generated
	 */
	PropertyOwner createPropertyOwner();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	EmfsContainer createEmfsContainer();

	/**
	 * Returns a new object of class '<em>Resources Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources Ref</em>'.
	 * @generated
	 */
	EmfsResourcesRef createEmfsResourcesRef();

	/**
	 * Returns a new object of class '<em>Git Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git Content Provider</em>'.
	 * @generated
	 */
	GitContentProvider createGitContentProvider();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	EmfsFile createEmfsFile();

	/**
	 * Returns a new object of class '<em>Byte Array Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Byte Array Content Provider</em>'.
	 * @generated
	 */
	ByteArrayContentProvider createByteArrayContentProvider();

	/**
	 * Returns a new object of class '<em>String Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Content Provider</em>'.
	 * @generated
	 */
	StringContentProvider createStringContentProvider();

	/**
	 * Returns a new object of class '<em>Verbatim String Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verbatim String Contents</em>'.
	 * @generated
	 */
	VerbatimStringContents createVerbatimStringContents();

	/**
	 * Returns a new object of class '<em>Property Value String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value String</em>'.
	 * @generated
	 */
	PropertyValueString createPropertyValueString();

	/**
	 * Returns a new object of class '<em>Wrapping String Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wrapping String Content Provider</em>'.
	 * @generated
	 */
	WrappingStringContentProvider createWrappingStringContentProvider();

	/**
	 * Returns a new object of class '<em>URL Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Content Provider</em>'.
	 * @generated
	 */
	URLContentProvider createURLContentProvider();

	/**
	 * Returns a new object of class '<em>Git URL Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git URL Content Provider</em>'.
	 * @generated
	 */
	GitURLContentProvider createGitURLContentProvider();

	/**
	 * Returns a new object of class '<em>Git Repo Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git Repo Ref</em>'.
	 * @generated
	 */
	GitRepoRef createGitRepoRef();

	/**
	 * Returns a new object of class '<em>Git Content Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git Content Ref</em>'.
	 * @generated
	 */
	GitContentRef createGitContentRef();

	/**
	 * Returns a new object of class '<em>Caching Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caching Content Provider</em>'.
	 * @generated
	 */
	CachingContentProvider createCachingContentProvider();

	/**
	 * Returns a new object of class '<em>Dot Classpath File Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Classpath File Content Provider</em>'.
	 * @generated
	 */
	DotClasspathFileContentProvider createDotClasspathFileContentProvider();

	/**
	 * Returns a new object of class '<em>Classpath Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classpath Entry</em>'.
	 * @generated
	 */
	ClasspathEntry createClasspathEntry();

	/**
	 * Returns a new object of class '<em>Dot Project File Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dot Project File Content Provider</em>'.
	 * @generated
	 */
	DotProjectFileContentProvider createDotProjectFileContentProvider();

	/**
	 * Returns a new object of class '<em>Xml String Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml String Contents</em>'.
	 * @generated
	 */
	XmlStringContents createXmlStringContents();

	/**
	 * Returns a new object of class '<em>Xml Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Contents</em>'.
	 * @generated
	 */
	XmlContents createXmlContents();

	/**
	 * Returns a new object of class '<em>Xml PI Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml PI Element</em>'.
	 * @generated
	 */
	XmlPIElement createXmlPIElement();

	/**
	 * Returns a new object of class '<em>Xml Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Tag Element</em>'.
	 * @generated
	 */
	XmlTagElement createXmlTagElement();

	/**
	 * Returns a new object of class '<em>Xml Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Tag</em>'.
	 * @generated
	 */
	XmlTag createXmlTag();

	/**
	 * Returns a new object of class '<em>Xml Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Attribute</em>'.
	 * @generated
	 */
	XmlAttribute createXmlAttribute();

	/**
	 * Returns a new object of class '<em>Emf Resource String Contents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emf Resource String Contents</em>'.
	 * @generated
	 */
	EmfResourceStringContents createEmfResourceStringContents();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmfsPackage getEmfsPackage();

} //EmfsFactory
