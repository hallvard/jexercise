/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.State;
import no.hal.jex.jextest.jexTest.TransitionTargetEffect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Target Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl#getState <em>State</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionTargetEffectImpl#getStateRef <em>State Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionTargetEffectImpl extends TransitionEffectImpl implements TransitionTargetEffect
{
  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state;

  /**
   * The cached value of the '{@link #getStateRef() <em>State Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateRef()
   * @generated
   * @ordered
   */
  protected State stateRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionTargetEffectImpl()
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
    return JexTestPackage.Literals.TRANSITION_TARGET_EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState(State newState, NotificationChain msgs)
  {
    State oldState = state;
    state = newState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_TARGET_EFFECT__STATE, oldState, newState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(State newState)
  {
    if (newState != state)
    {
      NotificationChain msgs = null;
      if (state != null)
        msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_TARGET_EFFECT__STATE, null, msgs);
      if (newState != null)
        msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_TARGET_EFFECT__STATE, null, msgs);
      msgs = basicSetState(newState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_TARGET_EFFECT__STATE, newState, newState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getStateRef()
  {
    if (stateRef != null && stateRef.eIsProxy())
    {
      InternalEObject oldStateRef = (InternalEObject)stateRef;
      stateRef = (State)eResolveProxy(oldStateRef);
      if (stateRef != oldStateRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JexTestPackage.TRANSITION_TARGET_EFFECT__STATE_REF, oldStateRef, stateRef));
      }
    }
    return stateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetStateRef()
  {
    return stateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateRef(State newStateRef)
  {
    State oldStateRef = stateRef;
    stateRef = newStateRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_TARGET_EFFECT__STATE_REF, oldStateRef, stateRef));
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
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE:
        return basicSetState(null, msgs);
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
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE:
        return getState();
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE_REF:
        if (resolve) return getStateRef();
        return basicGetStateRef();
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
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE:
        setState((State)newValue);
        return;
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE_REF:
        setStateRef((State)newValue);
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
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE:
        setState((State)null);
        return;
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE_REF:
        setStateRef((State)null);
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
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE:
        return state != null;
      case JexTestPackage.TRANSITION_TARGET_EFFECT__STATE_REF:
        return stateRef != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionTargetEffectImpl
