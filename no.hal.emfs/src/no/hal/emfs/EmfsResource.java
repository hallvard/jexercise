/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.EmfsResource#isWriteable <em>Writeable</em>}</li>
 *   <li>{@link no.hal.emfs.EmfsResource#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.emfs.EmfsResource#getContainer <em>Container</em>}</li>
 *   <li>{@link no.hal.emfs.EmfsResource#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link no.hal.emfs.EmfsResource#getContainerPath <em>Container Path</em>}</li>
 *   <li>{@link no.hal.emfs.EmfsResource#getFullName <em>Full Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getEmfsResource()
 * @model
 * @generated
 */
public interface EmfsResource extends TagsOwner, PropertyOwner {
	/**
	 * Returns the value of the '<em><b>Writeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeable</em>' attribute.
	 * @see #setWriteable(boolean)
	 * @see no.hal.emfs.EmfsPackage#getEmfsResource_Writeable()
	 * @model
	 * @generated
	 */
	boolean isWriteable();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfsResource#isWriteable <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeable</em>' attribute.
	 * @see #isWriteable()
	 * @generated
	 */
	void setWriteable(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.emfs.EmfsPackage#getEmfsResource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfsResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.emfs.EmfsContainer#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(EmfsContainer)
	 * @see no.hal.emfs.EmfsPackage#getEmfsResource_Container()
	 * @see no.hal.emfs.EmfsContainer#getResources
	 * @model opposite="resources" transient="false"
	 * @generated
	 */
	EmfsContainer getContainer();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfsResource#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(EmfsContainer value);

	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see no.hal.emfs.EmfsPackage#getEmfsResource_FullPath()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getFullPath();

	/**
	 * Returns the value of the '<em><b>Container Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Path</em>' attribute.
	 * @see no.hal.emfs.EmfsPackage#getEmfsResource_ContainerPath()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getContainerPath();

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see no.hal.emfs.EmfsPackage#getEmfsResource_FullName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getFullName();

} // EmfsResource
