/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Expression Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionExpressionActionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionExpressionActionImpl#getTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionExpressionActionImpl extends TransitionActionImpl implements TransitionExpressionAction
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected XExpression expr;

  /**
   * The cached value of the '{@link #getTimes() <em>Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected XExpression times;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionExpressionActionImpl()
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
    return JexTestPackage.Literals.TRANSITION_EXPRESSION_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(XExpression newExpr, NotificationChain msgs)
  {
    XExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(XExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getTimes()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimes(XExpression newTimes, NotificationChain msgs)
  {
    XExpression oldTimes = times;
    times = newTimes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES, oldTimes, newTimes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimes(XExpression newTimes)
  {
    if (newTimes != times)
    {
      NotificationChain msgs = null;
      if (times != null)
        msgs = ((InternalEObject)times).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES, null, msgs);
      if (newTimes != null)
        msgs = ((InternalEObject)newTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES, null, msgs);
      msgs = basicSetTimes(newTimes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES, newTimes, newTimes));
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
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR:
        return basicSetExpr(null, msgs);
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES:
        return basicSetTimes(null, msgs);
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
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR:
        return getExpr();
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES:
        return getTimes();
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
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR:
        setExpr((XExpression)newValue);
        return;
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES:
        setTimes((XExpression)newValue);
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
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR:
        setExpr((XExpression)null);
        return;
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES:
        setTimes((XExpression)null);
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
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__EXPR:
        return expr != null;
      case JexTestPackage.TRANSITION_EXPRESSION_ACTION__TIMES:
        return times != null;
    }
    return super.eIsSet(featureID);
  }

} //TransitionExpressionActionImpl
