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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.emfs.EmfsPackage
 * @generated
 */
public class EmfsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmfsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsSwitch() {
		if (modelPackage == null) {
			modelPackage = EmfsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EmfsPackage.EMFS_RESOURCE: {
				EmfsResource emfsResource = (EmfsResource)theEObject;
				T result = caseEmfsResource(emfsResource);
				if (result == null) result = caseTagsOwner(emfsResource);
				if (result == null) result = casePropertyOwner(emfsResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.TAGS_OWNER: {
				TagsOwner tagsOwner = (TagsOwner)theEObject;
				T result = caseTagsOwner(tagsOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.PROPERTY_OWNER: {
				PropertyOwner propertyOwner = (PropertyOwner)theEObject;
				T result = casePropertyOwner(propertyOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.EMFS_CONTAINER: {
				EmfsContainer emfsContainer = (EmfsContainer)theEObject;
				T result = caseEmfsContainer(emfsContainer);
				if (result == null) result = caseEmfsResource(emfsContainer);
				if (result == null) result = caseTagsOwner(emfsContainer);
				if (result == null) result = casePropertyOwner(emfsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.EMFS_CONTAINER_CONTENT_PROVIDER: {
				EmfsContainerContentProvider emfsContainerContentProvider = (EmfsContainerContentProvider)theEObject;
				T result = caseEmfsContainerContentProvider(emfsContainerContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.EMFS_RESOURCES_REF: {
				EmfsResourcesRef emfsResourcesRef = (EmfsResourcesRef)theEObject;
				T result = caseEmfsResourcesRef(emfsResourcesRef);
				if (result == null) result = caseEmfsContainerContentProvider(emfsResourcesRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.GIT_CONTENT_PROVIDER: {
				GitContentProvider gitContentProvider = (GitContentProvider)theEObject;
				T result = caseGitContentProvider(gitContentProvider);
				if (result == null) result = caseEmfsContainerContentProvider(gitContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.EMFS_FILE: {
				EmfsFile emfsFile = (EmfsFile)theEObject;
				T result = caseEmfsFile(emfsFile);
				if (result == null) result = caseEmfsResource(emfsFile);
				if (result == null) result = caseEmfsFileContentProvider(emfsFile);
				if (result == null) result = caseTagsOwner(emfsFile);
				if (result == null) result = casePropertyOwner(emfsFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.EMFS_FILE_CONTENT_PROVIDER: {
				EmfsFileContentProvider emfsFileContentProvider = (EmfsFileContentProvider)theEObject;
				T result = caseEmfsFileContentProvider(emfsFileContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.ABSTRACT_BYTES_CONTENT_PROVIDER: {
				AbstractBytesContentProvider abstractBytesContentProvider = (AbstractBytesContentProvider)theEObject;
				T result = caseAbstractBytesContentProvider(abstractBytesContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(abstractBytesContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.BYTE_ARRAY_CONTENT_PROVIDER: {
				ByteArrayContentProvider byteArrayContentProvider = (ByteArrayContentProvider)theEObject;
				T result = caseByteArrayContentProvider(byteArrayContentProvider);
				if (result == null) result = caseAbstractBytesContentProvider(byteArrayContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(byteArrayContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER: {
				AbstractStringContentProvider abstractStringContentProvider = (AbstractStringContentProvider)theEObject;
				T result = caseAbstractStringContentProvider(abstractStringContentProvider);
				if (result == null) result = caseAbstractBytesContentProvider(abstractStringContentProvider);
				if (result == null) result = caseAbstractStringContents(abstractStringContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(abstractStringContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.STRING_CONTENT_PROVIDER: {
				StringContentProvider stringContentProvider = (StringContentProvider)theEObject;
				T result = caseStringContentProvider(stringContentProvider);
				if (result == null) result = caseAbstractStringContentProvider(stringContentProvider);
				if (result == null) result = caseAbstractBytesContentProvider(stringContentProvider);
				if (result == null) result = caseAbstractStringContents(stringContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(stringContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.ABSTRACT_STRING_CONTENTS: {
				AbstractStringContents abstractStringContents = (AbstractStringContents)theEObject;
				T result = caseAbstractStringContents(abstractStringContents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.VERBATIM_STRING_CONTENTS: {
				VerbatimStringContents verbatimStringContents = (VerbatimStringContents)theEObject;
				T result = caseVerbatimStringContents(verbatimStringContents);
				if (result == null) result = caseAbstractStringContents(verbatimStringContents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.PROPERTY_VALUE_STRING: {
				PropertyValueString propertyValueString = (PropertyValueString)theEObject;
				T result = casePropertyValueString(propertyValueString);
				if (result == null) result = caseAbstractStringContents(propertyValueString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER: {
				WrappingStringContentProvider wrappingStringContentProvider = (WrappingStringContentProvider)theEObject;
				T result = caseWrappingStringContentProvider(wrappingStringContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(wrappingStringContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER: {
				AbstractURLContentProvider abstractURLContentProvider = (AbstractURLContentProvider)theEObject;
				T result = caseAbstractURLContentProvider(abstractURLContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(abstractURLContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.URL_CONTENT_PROVIDER: {
				URLContentProvider urlContentProvider = (URLContentProvider)theEObject;
				T result = caseURLContentProvider(urlContentProvider);
				if (result == null) result = caseAbstractURLContentProvider(urlContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(urlContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER: {
				GitURLContentProvider gitURLContentProvider = (GitURLContentProvider)theEObject;
				T result = caseGitURLContentProvider(gitURLContentProvider);
				if (result == null) result = caseAbstractURLContentProvider(gitURLContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(gitURLContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.GIT_REPO_REF: {
				GitRepoRef gitRepoRef = (GitRepoRef)theEObject;
				T result = caseGitRepoRef(gitRepoRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.GIT_CONTENT_REF: {
				GitContentRef gitContentRef = (GitContentRef)theEObject;
				T result = caseGitContentRef(gitContentRef);
				if (result == null) result = caseGitRepoRef(gitContentRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.CACHING_CONTENT_PROVIDER: {
				CachingContentProvider cachingContentProvider = (CachingContentProvider)theEObject;
				T result = caseCachingContentProvider(cachingContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(cachingContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER: {
				DotClasspathFileContentProvider dotClasspathFileContentProvider = (DotClasspathFileContentProvider)theEObject;
				T result = caseDotClasspathFileContentProvider(dotClasspathFileContentProvider);
				if (result == null) result = caseAbstractStringContentProvider(dotClasspathFileContentProvider);
				if (result == null) result = caseAbstractBytesContentProvider(dotClasspathFileContentProvider);
				if (result == null) result = caseAbstractStringContents(dotClasspathFileContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(dotClasspathFileContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.ABSTRACT_CLASSPATH_ENTRY: {
				AbstractClasspathEntry abstractClasspathEntry = (AbstractClasspathEntry)theEObject;
				T result = caseAbstractClasspathEntry(abstractClasspathEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.CLASSPATH_ENTRY: {
				ClasspathEntry classpathEntry = (ClasspathEntry)theEObject;
				T result = caseClasspathEntry(classpathEntry);
				if (result == null) result = caseAbstractClasspathEntry(classpathEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfsPackage.DOT_PROJECT_FILE_CONTENT_PROVIDER: {
				DotProjectFileContentProvider dotProjectFileContentProvider = (DotProjectFileContentProvider)theEObject;
				T result = caseDotProjectFileContentProvider(dotProjectFileContentProvider);
				if (result == null) result = caseAbstractStringContentProvider(dotProjectFileContentProvider);
				if (result == null) result = caseAbstractBytesContentProvider(dotProjectFileContentProvider);
				if (result == null) result = caseAbstractStringContents(dotProjectFileContentProvider);
				if (result == null) result = caseEmfsFileContentProvider(dotProjectFileContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsResource(EmfsResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsOwner(TagsOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOwner(PropertyOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsContainer(EmfsContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsContainerContentProvider(EmfsContainerContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsResourcesRef(EmfsResourcesRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitContentProvider(GitContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsFile(EmfsFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfsFileContentProvider(EmfsFileContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Bytes Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Bytes Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBytesContentProvider(AbstractBytesContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Byte Array Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Byte Array Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseByteArrayContentProvider(ByteArrayContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract String Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract String Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStringContentProvider(AbstractStringContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringContentProvider(StringContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract String Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract String Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStringContents(AbstractStringContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbatim String Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbatim String Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerbatimStringContents(VerbatimStringContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Value String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Value String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyValueString(PropertyValueString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wrapping String Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wrapping String Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrappingStringContentProvider(WrappingStringContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract URL Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract URL Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractURLContentProvider(AbstractURLContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLContentProvider(URLContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git URL Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git URL Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitURLContentProvider(GitURLContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git Repo Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git Repo Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitRepoRef(GitRepoRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git Content Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git Content Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitContentRef(GitContentRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caching Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caching Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCachingContentProvider(CachingContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot Classpath File Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Classpath File Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotClasspathFileContentProvider(DotClasspathFileContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Classpath Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Classpath Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClasspathEntry(AbstractClasspathEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classpath Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classpath Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasspathEntry(ClasspathEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot Project File Content Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Project File Content Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotProjectFileContentProvider(DotProjectFileContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EmfsSwitch
