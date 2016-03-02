/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.EmfsContainer#getResources <em>Resources</em>}</li>
 *   <li>{@link no.hal.emfs.EmfsContainer#getContentProvider <em>Content Provider</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getEmfsContainer()
 * @model
 * @generated
 */
public interface EmfsContainer extends EmfsResource {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.emfs.EmfsResource}.
	 * It is bidirectional and its opposite is '{@link no.hal.emfs.EmfsResource#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see no.hal.emfs.EmfsPackage#getEmfsContainer_Resources()
	 * @see no.hal.emfs.EmfsResource#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<EmfsResource> getResources();

	/**
	 * Returns the value of the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Provider</em>' containment reference.
	 * @see #setContentProvider(EmfsContainerContentProvider)
	 * @see no.hal.emfs.EmfsPackage#getEmfsContainer_ContentProvider()
	 * @model containment="true"
	 * @generated
	 */
	EmfsContainerContentProvider getContentProvider();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfsContainer#getContentProvider <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Provider</em>' containment reference.
	 * @see #getContentProvider()
	 * @generated
	 */
	void setContentProvider(EmfsContainerContentProvider value);

} // EmfsContainer
