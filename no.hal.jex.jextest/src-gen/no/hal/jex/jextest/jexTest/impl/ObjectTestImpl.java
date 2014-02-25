/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.ObjectTest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.ObjectTestImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTestImpl extends PropertiesTestOwnerImpl implements ObjectTest
{
  /**
   * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance()
   * @generated
   * @ordered
   */
  protected Instance instance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectTestImpl()
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
    return JexTestPackage.Literals.OBJECT_TEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance getInstance()
  {
    if (instance != null && instance.eIsProxy())
    {
      InternalEObject oldInstance = (InternalEObject)instance;
      instance = (Instance)eResolveProxy(oldInstance);
      if (instance != oldInstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JexTestPackage.OBJECT_TEST__INSTANCE, oldInstance, instance));
      }
    }
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance basicGetInstance()
  {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(Instance newInstance)
  {
    Instance oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.OBJECT_TEST__INSTANCE, oldInstance, instance));
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
      case JexTestPackage.OBJECT_TEST__INSTANCE:
        if (resolve) return getInstance();
        return basicGetInstance();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JexTestPackage.OBJECT_TEST__INSTANCE:
        setInstance((Instance)newValue);
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
      case JexTestPackage.OBJECT_TEST__INSTANCE:
        setInstance((Instance)null);
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
      case JexTestPackage.OBJECT_TEST__INSTANCE:
        return instance != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectTestImpl
