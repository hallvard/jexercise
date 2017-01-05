/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.ParameterList;
import no.hal.jex.jextest.jexTest.TransitionCallbackEffect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Callback Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl#getCallbackClass <em>Callback Class</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.TransitionCallbackEffectImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionCallbackEffectImpl extends TransitionEffect2Impl implements TransitionCallbackEffect
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
   * The cached value of the '{@link #getCallbackClass() <em>Callback Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallbackClass()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference callbackClass;

  /**
   * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected static final String METHOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected String methodName = METHOD_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected XBlockExpression arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionCallbackEffectImpl()
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
    return JexTestPackage.Literals.TRANSITION_CALLBACK_EFFECT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, JexTestPackage.TRANSITION_CALLBACK_EFFECT__INSTANCE, oldInstance, instance));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__INSTANCE, oldInstance, instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getCallbackClass()
  {
    return callbackClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCallbackClass(JvmParameterizedTypeReference newCallbackClass, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldCallbackClass = callbackClass;
    callbackClass = newCallbackClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS, oldCallbackClass, newCallbackClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallbackClass(JvmParameterizedTypeReference newCallbackClass)
  {
    if (newCallbackClass != callbackClass)
    {
      NotificationChain msgs = null;
      if (callbackClass != null)
        msgs = ((InternalEObject)callbackClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS, null, msgs);
      if (newCallbackClass != null)
        msgs = ((InternalEObject)newCallbackClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS, null, msgs);
      msgs = basicSetCallbackClass(newCallbackClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS, newCallbackClass, newCallbackClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(String newMethodName)
  {
    String oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__METHOD_NAME, oldMethodName, methodName));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS, oldParameters, newParameters);
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
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XBlockExpression getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(XBlockExpression newArguments, NotificationChain msgs)
  {
    XBlockExpression oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(XBlockExpression newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS, newArguments, newArguments));
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
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS:
        return basicSetCallbackClass(null, msgs);
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS:
        return basicSetParameters(null, msgs);
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS:
        return basicSetArguments(null, msgs);
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
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__INSTANCE:
        if (resolve) return getInstance();
        return basicGetInstance();
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS:
        return getCallbackClass();
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__METHOD_NAME:
        return getMethodName();
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS:
        return getParameters();
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS:
        return getArguments();
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
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__INSTANCE:
        setInstance((Instance)newValue);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS:
        setCallbackClass((JvmParameterizedTypeReference)newValue);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__METHOD_NAME:
        setMethodName((String)newValue);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS:
        setParameters((ParameterList)newValue);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS:
        setArguments((XBlockExpression)newValue);
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
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__INSTANCE:
        setInstance((Instance)null);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS:
        setCallbackClass((JvmParameterizedTypeReference)null);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__METHOD_NAME:
        setMethodName(METHOD_NAME_EDEFAULT);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS:
        setParameters((ParameterList)null);
        return;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS:
        setArguments((XBlockExpression)null);
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
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__INSTANCE:
        return instance != null;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS:
        return callbackClass != null;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__METHOD_NAME:
        return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__PARAMETERS:
        return parameters != null;
      case JexTestPackage.TRANSITION_CALLBACK_EFFECT__ARGUMENTS:
        return arguments != null;
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
    result.append(" (methodName: ");
    result.append(methodName);
    result.append(')');
    return result.toString();
  }

} //TransitionCallbackEffectImpl
