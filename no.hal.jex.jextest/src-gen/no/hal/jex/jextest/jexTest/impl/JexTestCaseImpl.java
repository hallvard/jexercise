/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.TestedClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestedClasses <em>Tested Classes</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestedClassRef <em>Tested Class Ref</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestClassName <em>Test Class Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestSequences <em>Test Sequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JexTestCaseImpl extends TestMemberContextImpl implements JexTestCase
{
  /**
   * The cached value of the '{@link #getTestedClasses() <em>Tested Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestedClasses()
   * @generated
   * @ordered
   */
  protected EList<TestedClass> testedClasses;

  /**
   * The cached value of the '{@link #getTestedClassRef() <em>Tested Class Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestedClassRef()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference testedClassRef;

  /**
   * The default value of the '{@link #getTestClassName() <em>Test Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestClassName()
   * @generated
   * @ordered
   */
  protected static final String TEST_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTestClassName() <em>Test Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestClassName()
   * @generated
   * @ordered
   */
  protected String testClassName = TEST_CLASS_NAME_EDEFAULT;

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
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getTestSequences() <em>Test Sequences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestSequences()
   * @generated
   * @ordered
   */
  protected EList<JexTestSequence> testSequences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JexTestCaseImpl()
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
    return JexTestPackage.Literals.JEX_TEST_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TestedClass> getTestedClasses()
  {
    if (testedClasses == null)
    {
      testedClasses = new EObjectContainmentEList<TestedClass>(TestedClass.class, this, JexTestPackage.JEX_TEST_CASE__TESTED_CLASSES);
    }
    return testedClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmParameterizedTypeReference getTestedClassRef()
  {
    return testedClassRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestedClassRef(JvmParameterizedTypeReference newTestedClassRef, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldTestedClassRef = testedClassRef;
    testedClassRef = newTestedClassRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF, oldTestedClassRef, newTestedClassRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestedClassRef(JvmParameterizedTypeReference newTestedClassRef)
  {
    if (newTestedClassRef != testedClassRef)
    {
      NotificationChain msgs = null;
      if (testedClassRef != null)
        msgs = ((InternalEObject)testedClassRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF, null, msgs);
      if (newTestedClassRef != null)
        msgs = ((InternalEObject)newTestedClassRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF, null, msgs);
      msgs = basicSetTestedClassRef(newTestedClassRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF, newTestedClassRef, newTestedClassRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTestClassName()
  {
    return testClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestClassName(String newTestClassName)
  {
    String oldTestClassName = testClassName;
    testClassName = newTestClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME, oldTestClassName, testClassName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JexTestSequence> getTestSequences()
  {
    if (testSequences == null)
    {
      testSequences = new EObjectContainmentEList<JexTestSequence>(JexTestSequence.class, this, JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES);
    }
    return testSequences;
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASSES:
        return ((InternalEList<?>)getTestedClasses()).basicRemove(otherEnd, msgs);
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF:
        return basicSetTestedClassRef(null, msgs);
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        return ((InternalEList<?>)getTestSequences()).basicRemove(otherEnd, msgs);
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASSES:
        return getTestedClasses();
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF:
        return getTestedClassRef();
      case JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME:
        return getTestClassName();
      case JexTestPackage.JEX_TEST_CASE__DESCRIPTION:
        return getDescription();
      case JexTestPackage.JEX_TEST_CASE__URL:
        return getUrl();
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        return getTestSequences();
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASSES:
        getTestedClasses().clear();
        getTestedClasses().addAll((Collection<? extends TestedClass>)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF:
        setTestedClassRef((JvmParameterizedTypeReference)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME:
        setTestClassName((String)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__URL:
        setUrl((String)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        getTestSequences().clear();
        getTestSequences().addAll((Collection<? extends JexTestSequence>)newValue);
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASSES:
        getTestedClasses().clear();
        return;
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF:
        setTestedClassRef((JvmParameterizedTypeReference)null);
        return;
      case JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME:
        setTestClassName(TEST_CLASS_NAME_EDEFAULT);
        return;
      case JexTestPackage.JEX_TEST_CASE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JexTestPackage.JEX_TEST_CASE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        getTestSequences().clear();
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASSES:
        return testedClasses != null && !testedClasses.isEmpty();
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS_REF:
        return testedClassRef != null;
      case JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME:
        return TEST_CLASS_NAME_EDEFAULT == null ? testClassName != null : !TEST_CLASS_NAME_EDEFAULT.equals(testClassName);
      case JexTestPackage.JEX_TEST_CASE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JexTestPackage.JEX_TEST_CASE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        return testSequences != null && !testSequences.isEmpty();
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
    result.append(" (testClassName: ");
    result.append(testClassName);
    result.append(", description: ");
    result.append(description);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //JexTestCaseImpl
