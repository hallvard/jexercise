/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.jexTest.TestMemberContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Member Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl#getStateFunctions <em>State Functions</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestMemberContextImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestMemberContextImpl extends MinimalEObjectImpl.Container implements TestMemberContext
{
  /**
   * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportSection()
   * @generated
   * @ordered
   */
  protected XImportSection importSection;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<Instance> instances;

  /**
   * The cached value of the '{@link #getStateFunctions() <em>State Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateFunctions()
   * @generated
   * @ordered
   */
  protected EList<StateFunction> stateFunctions;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestMemberContextImpl()
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
    return JexTestPackage.Literals.TEST_MEMBER_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XImportSection getImportSection()
  {
    return importSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportSection(XImportSection newImportSection, NotificationChain msgs)
  {
    XImportSection oldImportSection = importSection;
    importSection = newImportSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION, oldImportSection, newImportSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportSection(XImportSection newImportSection)
  {
    if (newImportSection != importSection)
    {
      NotificationChain msgs = null;
      if (importSection != null)
        msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION, null, msgs);
      if (newImportSection != null)
        msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION, null, msgs);
      msgs = basicSetImportSection(newImportSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION, newImportSection, newImportSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, JexTestPackage.TEST_MEMBER_CONTEXT__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateFunction> getStateFunctions()
  {
    if (stateFunctions == null)
    {
      stateFunctions = new EObjectContainmentEList<StateFunction>(StateFunction.class, this, JexTestPackage.TEST_MEMBER_CONTEXT__STATE_FUNCTIONS);
    }
    return stateFunctions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, JexTestPackage.TEST_MEMBER_CONTEXT__METHODS);
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
      case JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION:
        return basicSetImportSection(null, msgs);
      case JexTestPackage.TEST_MEMBER_CONTEXT__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case JexTestPackage.TEST_MEMBER_CONTEXT__STATE_FUNCTIONS:
        return ((InternalEList<?>)getStateFunctions()).basicRemove(otherEnd, msgs);
      case JexTestPackage.TEST_MEMBER_CONTEXT__METHODS:
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
      case JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION:
        return getImportSection();
      case JexTestPackage.TEST_MEMBER_CONTEXT__INSTANCES:
        return getInstances();
      case JexTestPackage.TEST_MEMBER_CONTEXT__STATE_FUNCTIONS:
        return getStateFunctions();
      case JexTestPackage.TEST_MEMBER_CONTEXT__METHODS:
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
      case JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION:
        setImportSection((XImportSection)newValue);
        return;
      case JexTestPackage.TEST_MEMBER_CONTEXT__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
        return;
      case JexTestPackage.TEST_MEMBER_CONTEXT__STATE_FUNCTIONS:
        getStateFunctions().clear();
        getStateFunctions().addAll((Collection<? extends StateFunction>)newValue);
        return;
      case JexTestPackage.TEST_MEMBER_CONTEXT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
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
      case JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION:
        setImportSection((XImportSection)null);
        return;
      case JexTestPackage.TEST_MEMBER_CONTEXT__INSTANCES:
        getInstances().clear();
        return;
      case JexTestPackage.TEST_MEMBER_CONTEXT__STATE_FUNCTIONS:
        getStateFunctions().clear();
        return;
      case JexTestPackage.TEST_MEMBER_CONTEXT__METHODS:
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
      case JexTestPackage.TEST_MEMBER_CONTEXT__IMPORT_SECTION:
        return importSection != null;
      case JexTestPackage.TEST_MEMBER_CONTEXT__INSTANCES:
        return instances != null && !instances.isEmpty();
      case JexTestPackage.TEST_MEMBER_CONTEXT__STATE_FUNCTIONS:
        return stateFunctions != null && !stateFunctions.isEmpty();
      case JexTestPackage.TEST_MEMBER_CONTEXT__METHODS:
        return methods != null && !methods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TestMemberContextImpl
