/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.EmfsResourcesRef#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getEmfsResourcesRef()
 * @model
 * @generated
 */
public interface EmfsResourcesRef extends EmfsContainerContentProvider {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link no.hal.emfs.EmfsResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see no.hal.emfs.EmfsPackage#getEmfsResourcesRef_Resources()
	 * @model
	 * @generated
	 */
	EList<EmfsResource> getResources();

} // EmfsResourcesRef
