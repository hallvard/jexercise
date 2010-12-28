/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Collection;

import no.hal.jex.AbstractRequirement;
import no.hal.jex.JavaElement;

import no.hal.jex.JexPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getText <em>Text</em>}</li>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getJavaElements <em>Java Elements</em>}</li>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link no.hal.jex.impl.AbstractRequirementImpl#getChildrenSatisfied <em>Children Satisfied</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractRequirementImpl extends EObjectImpl implements AbstractRequirement {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJavaElements() <em>Java Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaElement> javaElements;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractRequirement> requirements;

	/**
	 * The default value of the '{@link #getChildrenSatisfied() <em>Children Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHILDREN_SATISFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildrenSatisfied() <em>Children Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenSatisfied()
	 * @generated
	 * @ordered
	 */
	protected Boolean childrenSatisfied = CHILDREN_SATISFIED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.ABSTRACT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.ABSTRACT_REQUIREMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.ABSTRACT_REQUIREMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.ABSTRACT_REQUIREMENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList getJavaElements() {
		if (javaElements == null) {
			javaElements = new EObjectContainmentEList.Resolving(JavaElement.class, this, JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS);
		}
		return javaElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentWithInverseEList.Resolving(AbstractRequirement.class, this, JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS, JexPackage.ABSTRACT_REQUIREMENT__PARENT);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirement getParent() {
		if (eContainerFeatureID() != JexPackage.ABSTRACT_REQUIREMENT__PARENT) return null;
		return (AbstractRequirement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(AbstractRequirement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, JexPackage.ABSTRACT_REQUIREMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(AbstractRequirement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != JexPackage.ABSTRACT_REQUIREMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS, AbstractRequirement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.ABSTRACT_REQUIREMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getChildrenSatisfied() {
		return childrenSatisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenSatisfied(Boolean newChildrenSatisfied) {
		Boolean oldChildrenSatisfied = childrenSatisfied;
		childrenSatisfied = newChildrenSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED, oldChildrenSatisfied, childrenSatisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequirements()).basicAdd(otherEnd, msgs);
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AbstractRequirement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS:
				return ((InternalEList<?>)getJavaElements()).basicRemove(otherEnd, msgs);
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS, AbstractRequirement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.ABSTRACT_REQUIREMENT__TEXT:
				return getText();
			case JexPackage.ABSTRACT_REQUIREMENT__DESCRIPTION:
				return getDescription();
			case JexPackage.ABSTRACT_REQUIREMENT__COMMENT:
				return getComment();
			case JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS:
				return getJavaElements();
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
				return getRequirements();
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				return getParent();
			case JexPackage.ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED:
				return getChildrenSatisfied();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JexPackage.ABSTRACT_REQUIREMENT__TEXT:
				setText((String)newValue);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__COMMENT:
				setComment((String)newValue);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS:
				getJavaElements().clear();
				getJavaElements().addAll((Collection<? extends JavaElement>)newValue);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends AbstractRequirement>)newValue);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				setParent((AbstractRequirement)newValue);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED:
				setChildrenSatisfied((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JexPackage.ABSTRACT_REQUIREMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS:
				getJavaElements().clear();
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
				getRequirements().clear();
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				setParent((AbstractRequirement)null);
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED:
				setChildrenSatisfied(CHILDREN_SATISFIED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JexPackage.ABSTRACT_REQUIREMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case JexPackage.ABSTRACT_REQUIREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case JexPackage.ABSTRACT_REQUIREMENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS:
				return javaElements != null && !javaElements.isEmpty();
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case JexPackage.ABSTRACT_REQUIREMENT__PARENT:
				return getParent() != null;
			case JexPackage.ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED:
				return CHILDREN_SATISFIED_EDEFAULT == null ? childrenSatisfied != null : !CHILDREN_SATISFIED_EDEFAULT.equals(childrenSatisfied);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", description: ");
		result.append(description);
		result.append(", comment: ");
		result.append(comment);
		result.append(", childrenSatisfied: ");
		result.append(childrenSatisfied);
		result.append(')');
		return result.toString();
	}

	private boolean isDescriptionLocation(String s) {
		return s.startsWith("/") || s.endsWith("/") || s.endsWith(".html") || s.startsWith("#");
	}

	protected String getDefaultURIFragment() {
		return null;
	}
	
	public URI getDescriptionURI() {
		URI uri = null;
		AbstractRequirement req = getParent();
		if (req != null) {
			uri = ((AbstractRequirementImpl)req).getDescriptionURI();
		} else {
			uri = eResource().getURI();
		}
		String s = getDescription();
		if (s == null) {
			s = getDefaultURIFragment();
		}
		if (s == null) {
			return uri;
		} else if (! isDescriptionLocation(s)) {
			return null;
		} else if (uri == null || s.startsWith("/")) {
			uri = URI.createPlatformResourceURI(s);
		} else if (s.startsWith("#")) {
			uri = uri.appendFragment(s.substring(1));
		} else {
			uri = uri.trimSegments(1).appendSegment(s);
		}
		return uri;
	}
} //AbstractRequirementImpl
