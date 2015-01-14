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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl#getPack <em>Pack</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSuiteImpl#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JexTestSuiteImpl extends MinimalEObjectImpl.Container implements JexTestSuite
{
  /**
   * The default value of the '{@link #getPack() <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPack()
   * @generated
   * @ordered
   */
  protected static final String PACK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPack() <em>Pack</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPack()
   * @generated
   * @ordered
   */
  protected String pack = PACK_EDEFAULT;

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
  public String getPack()
  {
    return pack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPack(String newPack)
  {
    String oldPack = pack;
    pack = newPack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_SUITE__PACK, oldPack, pack));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION, oldImportSection, newImportSection);
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
        msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION, null, msgs);
      if (newImportSection != null)
        msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION, null, msgs);
      msgs = basicSetImportSection(newImportSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION, newImportSection, newImportSection));
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
      case JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION:
        return basicSetImportSection(null, msgs);
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
      case JexTestPackage.JEX_TEST_SUITE__PACK:
        return getPack();
      case JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION:
        return getImportSection();
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
      case JexTestPackage.JEX_TEST_SUITE__PACK:
        setPack((String)newValue);
        return;
      case JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION:
        setImportSection((XImportSection)newValue);
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
      case JexTestPackage.JEX_TEST_SUITE__PACK:
        setPack(PACK_EDEFAULT);
        return;
      case JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION:
        setImportSection((XImportSection)null);
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
      case JexTestPackage.JEX_TEST_SUITE__PACK:
        return PACK_EDEFAULT == null ? pack != null : !PACK_EDEFAULT.equals(pack);
      case JexTestPackage.JEX_TEST_SUITE__IMPORT_SECTION:
        return importSection != null;
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
    result.append(" (pack: ");
    result.append(pack);
    result.append(')');
    return result.toString();
  }

} //JexTestSuiteImpl
