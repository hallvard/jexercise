/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.TestedClass;
import no.hal.jex.jextest.jexTest.TestedOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tested Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedClassImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestedClassImpl extends MinimalEObjectImpl.Container implements TestedClass
{
  /**
   * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected static final boolean INTERFACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected boolean interface_ = INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClass()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference superClass;

  /**
   * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperInterfaces()
   * @generated
   * @ordered
   */
  protected EList<JvmParameterizedTypeReference> superInterfaces;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<TestedOperation> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestedClassImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JexTestPackage.Literals.TESTED_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(boolean newInterface)
  {
    boolean oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_CLASS__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_CLASS__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getSuperClass()
  {
    return superClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperClass(JvmParameterizedTypeReference newSuperClass, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldSuperClass = superClass;
    superClass = newSuperClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_CLASS__SUPER_CLASS, oldSuperClass, newSuperClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperClass(JvmParameterizedTypeReference newSuperClass)
  {
    if (newSuperClass != superClass)
    {
      NotificationChain msgs = null;
      if (superClass != null)
        msgs = ((InternalEObject)superClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_CLASS__SUPER_CLASS, null, msgs);
      if (newSuperClass != null)
        msgs = ((InternalEObject)newSuperClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_CLASS__SUPER_CLASS, null, msgs);
      msgs = basicSetSuperClass(newSuperClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_CLASS__SUPER_CLASS, newSuperClass, newSuperClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmParameterizedTypeReference> getSuperInterfaces()
  {
    if (superInterfaces == null)
    {
      superInterfaces = new EObjectContainmentEList<JvmParameterizedTypeReference>(JvmParameterizedTypeReference.class, this, JexTestPackage.TESTED_CLASS__SUPER_INTERFACES);
    }
    return superInterfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TestedOperation> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<TestedOperation>(TestedOperation.class, this, JexTestPackage.TESTED_CLASS__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JexTestPackage.TESTED_CLASS__SUPER_CLASS:
        return basicSetSuperClass(null, msgs);
      case JexTestPackage.TESTED_CLASS__SUPER_INTERFACES:
        return ((InternalEList<?>)getSuperInterfaces()).basicRemove(otherEnd, msgs);
      case JexTestPackage.TESTED_CLASS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JexTestPackage.TESTED_CLASS__INTERFACE:
        return isInterface();
      case JexTestPackage.TESTED_CLASS__ABSTRACT:
        return isAbstract();
      case JexTestPackage.TESTED_CLASS__NAME:
        return getName();
      case JexTestPackage.TESTED_CLASS__SUPER_CLASS:
        return getSuperClass();
      case JexTestPackage.TESTED_CLASS__SUPER_INTERFACES:
        return getSuperInterfaces();
      case JexTestPackage.TESTED_CLASS__METHODS:
        return getMethods();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JexTestPackage.TESTED_CLASS__INTERFACE:
        setInterface((Boolean)newValue);
        return;
      case JexTestPackage.TESTED_CLASS__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case JexTestPackage.TESTED_CLASS__NAME:
        setName((String)newValue);
        return;
      case JexTestPackage.TESTED_CLASS__SUPER_CLASS:
        setSuperClass((JvmParameterizedTypeReference)newValue);
        return;
      case JexTestPackage.TESTED_CLASS__SUPER_INTERFACES:
        getSuperInterfaces().clear();
        getSuperInterfaces().addAll((Collection<? extends JvmParameterizedTypeReference>)newValue);
        return;
      case JexTestPackage.TESTED_CLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends TestedOperation>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JexTestPackage.TESTED_CLASS__INTERFACE:
        setInterface(INTERFACE_EDEFAULT);
        return;
      case JexTestPackage.TESTED_CLASS__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case JexTestPackage.TESTED_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JexTestPackage.TESTED_CLASS__SUPER_CLASS:
        setSuperClass((JvmParameterizedTypeReference)null);
        return;
      case JexTestPackage.TESTED_CLASS__SUPER_INTERFACES:
        getSuperInterfaces().clear();
        return;
      case JexTestPackage.TESTED_CLASS__METHODS:
        getMethods().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JexTestPackage.TESTED_CLASS__INTERFACE:
        return interface_ != INTERFACE_EDEFAULT;
      case JexTestPackage.TESTED_CLASS__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case JexTestPackage.TESTED_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JexTestPackage.TESTED_CLASS__SUPER_CLASS:
        return superClass != null;
      case JexTestPackage.TESTED_CLASS__SUPER_INTERFACES:
        return superInterfaces != null && !superInterfaces.isEmpty();
      case JexTestPackage.TESTED_CLASS__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (interface: ");
    result.append(interface_);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TestedClassImpl
