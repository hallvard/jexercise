/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.TransitionExceptionEffect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Exception Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionExceptionEffectImpl#getExceptionClass <em>Exception Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionExceptionEffectImpl extends TransitionEffectImpl implements TransitionExceptionEffect
{
  /**
   * The cached value of the '{@link #getExceptionClass() <em>Exception Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionClass()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference exceptionClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionExceptionEffectImpl()
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
    return JexTestPackage.Literals.TRANSITION_EXCEPTION_EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getExceptionClass()
  {
    return exceptionClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExceptionClass(JvmParameterizedTypeReference newExceptionClass, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldExceptionClass = exceptionClass;
    exceptionClass = newExceptionClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS, oldExceptionClass, newExceptionClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceptionClass(JvmParameterizedTypeReference newExceptionClass)
  {
    if (newExceptionClass != exceptionClass)
    {
      NotificationChain msgs = null;
      if (exceptionClass != null)
        msgs = ((InternalEObject)exceptionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS, null, msgs);
      if (newExceptionClass != null)
        msgs = ((InternalEObject)newExceptionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS, null, msgs);
      msgs = basicSetExceptionClass(newExceptionClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS, newExceptionClass, newExceptionClass));
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
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS:
        return basicSetExceptionClass(null, msgs);
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
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS:
        return getExceptionClass();
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
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS:
        setExceptionClass((JvmParameterizedTypeReference)newValue);
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
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS:
        setExceptionClass((JvmParameterizedTypeReference)null);
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
      case JexTestPackage.TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS:
        return exceptionClass != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionExceptionEffectImpl
