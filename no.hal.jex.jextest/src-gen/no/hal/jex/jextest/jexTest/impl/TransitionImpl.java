/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionAction;
import no.hal.jex.jextest.jexTest.TransitionEffect;
import no.hal.jex.jextest.jexTest.TransitionSource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected TransitionSource source;

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
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<TransitionAction> actions;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected TransitionEffect effect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return JexTestPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionSource getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(TransitionSource newSource, NotificationChain msgs)
  {
    TransitionSource oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(TransitionSource newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionAction> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<TransitionAction>(TransitionAction.class, this, JexTestPackage.TRANSITION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionEffect getEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffect(TransitionEffect newEffect, NotificationChain msgs)
  {
    TransitionEffect oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION__EFFECT, oldEffect, newEffect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(TransitionEffect newEffect)
  {
    if (newEffect != effect)
    {
      NotificationChain msgs = null;
      if (effect != null)
        msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION__EFFECT, null, msgs);
      if (newEffect != null)
        msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION__EFFECT, null, msgs);
      msgs = basicSetEffect(newEffect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION__EFFECT, newEffect, newEffect));
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
      case JexTestPackage.TRANSITION__SOURCE:
        return basicSetSource(null, msgs);
      case JexTestPackage.TRANSITION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
      case JexTestPackage.TRANSITION__EFFECT:
        return basicSetEffect(null, msgs);
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
      case JexTestPackage.TRANSITION__SOURCE:
        return getSource();
      case JexTestPackage.TRANSITION__DESCRIPTION:
        return getDescription();
      case JexTestPackage.TRANSITION__ACTIONS:
        return getActions();
      case JexTestPackage.TRANSITION__EFFECT:
        return getEffect();
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
      case JexTestPackage.TRANSITION__SOURCE:
        setSource((TransitionSource)newValue);
        return;
      case JexTestPackage.TRANSITION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JexTestPackage.TRANSITION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends TransitionAction>)newValue);
        return;
      case JexTestPackage.TRANSITION__EFFECT:
        setEffect((TransitionEffect)newValue);
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
      case JexTestPackage.TRANSITION__SOURCE:
        setSource((TransitionSource)null);
        return;
      case JexTestPackage.TRANSITION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JexTestPackage.TRANSITION__ACTIONS:
        getActions().clear();
        return;
      case JexTestPackage.TRANSITION__EFFECT:
        setEffect((TransitionEffect)null);
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
      case JexTestPackage.TRANSITION__SOURCE:
        return source != null;
      case JexTestPackage.TRANSITION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JexTestPackage.TRANSITION__ACTIONS:
        return actions != null && !actions.isEmpty();
      case JexTestPackage.TRANSITION__EFFECT:
        return effect != null;
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
