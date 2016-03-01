/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSuite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl#getSuiteClassName <em>Suite Class Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JexTestSuiteImpl extends TestMemberContextImpl implements JexTestSuite
{
  /**
   * The default value of the '{@link #getSuiteClassName() <em>Suite Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuiteClassName()
   * @generated
   * @ordered
   */
  protected static final String SUITE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuiteClassName() <em>Suite Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuiteClassName()
   * @generated
   * @ordered
   */
  protected String suiteClassName = SUITE_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestCases()
   * @generated
   * @ordered
   */
  protected EList<JexTestCase> testCases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JexTestSuiteImpl()
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
    return JexTestPackage.Literals.JEX_TEST_SUITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuiteClassName()
  {
    return suiteClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuiteClassName(String newSuiteClassName)
  {
    String oldSuiteClassName = suiteClassName;
    suiteClassName = newSuiteClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_SUITE__SUITE_CLASS_NAME, oldSuiteClassName, suiteClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JexTestCase> getTestCases()
  {
    if (testCases == null)
    {
      testCases = new EObjectContainmentEList<JexTestCase>(JexTestCase.class, this, JexTestPackage.JEX_TEST_SUITE__TEST_CASES);
    }
    return testCases;
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
      case JexTestPackage.JEX_TEST_SUITE__TEST_CASES:
        return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
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
      case JexTestPackage.JEX_TEST_SUITE__SUITE_CLASS_NAME:
        return getSuiteClassName();
      case JexTestPackage.JEX_TEST_SUITE__TEST_CASES:
        return getTestCases();
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
      case JexTestPackage.JEX_TEST_SUITE__SUITE_CLASS_NAME:
        setSuiteClassName((String)newValue);
        return;
      case JexTestPackage.JEX_TEST_SUITE__TEST_CASES:
        getTestCases().clear();
        getTestCases().addAll((Collection<? extends JexTestCase>)newValue);
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
      case JexTestPackage.JEX_TEST_SUITE__SUITE_CLASS_NAME:
        setSuiteClassName(SUITE_CLASS_NAME_EDEFAULT);
        return;
      case JexTestPackage.JEX_TEST_SUITE__TEST_CASES:
        getTestCases().clear();
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
      case JexTestPackage.JEX_TEST_SUITE__SUITE_CLASS_NAME:
        return SUITE_CLASS_NAME_EDEFAULT == null ? suiteClassName != null : !SUITE_CLASS_NAME_EDEFAULT.equals(suiteClassName);
      case JexTestPackage.JEX_TEST_SUITE__TEST_CASES:
        return testCases != null && !testCases.isEmpty();
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
    result.append(" (suiteClassName: ");
    result.append(suiteClassName);
    result.append(')');
    return result.toString();
  }

} //JexTestSuiteImpl
