/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.ParameterList;
import no.hal.jex.jextest.jexTest.TestedOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tested Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedOperationImpl#getPreExpression <em>Pre Expression</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TestedOperationImpl#getPostExpression <em>Post Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestedOperationImpl extends MinimalEObjectImpl.Container implements TestedOperation
{
  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected ParameterList parameters;

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
   * The cached value of the '{@link #getPreExpression() <em>Pre Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreExpression()
   * @generated
   * @ordered
   */
  protected XExpression preExpression;

  /**
   * The cached value of the '{@link #getPostExpression() <em>Post Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostExpression()
   * @generated
   * @ordered
   */
  protected XExpression postExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestedOperationImpl()
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
    return JexTestPackage.Literals.TESTED_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(ParameterList newParameters, NotificationChain msgs)
  {
    ParameterList oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(ParameterList newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_OPERATION__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_OPERATION__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__PARAMETERS, newParameters, newParameters));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPreExpression()
  {
    return preExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreExpression(XExpression newPreExpression, NotificationChain msgs)
  {
    XExpression oldPreExpression = preExpression;
    preExpression = newPreExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION, oldPreExpression, newPreExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreExpression(XExpression newPreExpression)
  {
    if (newPreExpression != preExpression)
    {
      NotificationChain msgs = null;
      if (preExpression != null)
        msgs = ((InternalEObject)preExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION, null, msgs);
      if (newPreExpression != null)
        msgs = ((InternalEObject)newPreExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION, null, msgs);
      msgs = basicSetPreExpression(newPreExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION, newPreExpression, newPreExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPostExpression()
  {
    return postExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostExpression(XExpression newPostExpression, NotificationChain msgs)
  {
    XExpression oldPostExpression = postExpression;
    postExpression = newPostExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__POST_EXPRESSION, oldPostExpression, newPostExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostExpression(XExpression newPostExpression)
  {
    if (newPostExpression != postExpression)
    {
      NotificationChain msgs = null;
      if (postExpression != null)
        msgs = ((InternalEObject)postExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_OPERATION__POST_EXPRESSION, null, msgs);
      if (newPostExpression != null)
        msgs = ((InternalEObject)newPostExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TESTED_OPERATION__POST_EXPRESSION, null, msgs);
      msgs = basicSetPostExpression(newPostExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TESTED_OPERATION__POST_EXPRESSION, newPostExpression, newPostExpression));
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
      case JexTestPackage.TESTED_OPERATION__PARAMETERS:
        return basicSetParameters(null, msgs);
      case JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION:
        return basicSetPreExpression(null, msgs);
      case JexTestPackage.TESTED_OPERATION__POST_EXPRESSION:
        return basicSetPostExpression(null, msgs);
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
      case JexTestPackage.TESTED_OPERATION__PARAMETERS:
        return getParameters();
      case JexTestPackage.TESTED_OPERATION__DESCRIPTION:
        return getDescription();
      case JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION:
        return getPreExpression();
      case JexTestPackage.TESTED_OPERATION__POST_EXPRESSION:
        return getPostExpression();
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
      case JexTestPackage.TESTED_OPERATION__PARAMETERS:
        setParameters((ParameterList)newValue);
        return;
      case JexTestPackage.TESTED_OPERATION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION:
        setPreExpression((XExpression)newValue);
        return;
      case JexTestPackage.TESTED_OPERATION__POST_EXPRESSION:
        setPostExpression((XExpression)newValue);
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
      case JexTestPackage.TESTED_OPERATION__PARAMETERS:
        setParameters((ParameterList)null);
        return;
      case JexTestPackage.TESTED_OPERATION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION:
        setPreExpression((XExpression)null);
        return;
      case JexTestPackage.TESTED_OPERATION__POST_EXPRESSION:
        setPostExpression((XExpression)null);
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
      case JexTestPackage.TESTED_OPERATION__PARAMETERS:
        return parameters != null;
      case JexTestPackage.TESTED_OPERATION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JexTestPackage.TESTED_OPERATION__PRE_EXPRESSION:
        return preExpression != null;
      case JexTestPackage.TESTED_OPERATION__POST_EXPRESSION:
        return postExpression != null;
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

} //TestedOperationImpl
