/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.StateFunction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestedClass <em>Tested Class</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestClassName <em>Test Class Name</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getStateFunctions <em>State Functions</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getTestSequences <em>Test Sequences</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestCaseImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JexTestCaseImpl extends MinimalEObjectImpl.Container implements JexTestCase
{
  /**
   * The cached value of the '{@link #getTestedClass() <em>Tested Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestedClass()
   * @generated
   * @ordered
   */
  protected JvmParameterizedTypeReference testedClass;

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
   * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportSection()
   * @generated
   * @ordered
   */
  protected XImportSection importSection;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<Instance> instances;

  /**
   * The cached value of the '{@link #getStateFunctions() <em>State Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateFunctions()
   * @generated
   * @ordered
   */
  protected EList<StateFunction> stateFunctions;

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
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

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
  public JvmParameterizedTypeReference getTestedClass()
  {
    return testedClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestedClass(JvmParameterizedTypeReference newTestedClass, NotificationChain msgs)
  {
    JvmParameterizedTypeReference oldTestedClass = testedClass;
    testedClass = newTestedClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__TESTED_CLASS, oldTestedClass, newTestedClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestedClass(JvmParameterizedTypeReference newTestedClass)
  {
    if (newTestedClass != testedClass)
    {
      NotificationChain msgs = null;
      if (testedClass != null)
        msgs = ((InternalEObject)testedClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_CASE__TESTED_CLASS, null, msgs);
      if (newTestedClass != null)
        msgs = ((InternalEObject)newTestedClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_CASE__TESTED_CLASS, null, msgs);
      msgs = basicSetTestedClass(newTestedClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__TESTED_CLASS, newTestedClass, newTestedClass));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION, oldImportSection, newImportSection);
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
        msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION, null, msgs);
      if (newImportSection != null)
        msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION, null, msgs);
      msgs = basicSetImportSection(newImportSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION, newImportSection, newImportSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, JexTestPackage.JEX_TEST_CASE__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateFunction> getStateFunctions()
  {
    if (stateFunctions == null)
    {
      stateFunctions = new EObjectContainmentEList<StateFunction>(StateFunction.class, this, JexTestPackage.JEX_TEST_CASE__STATE_FUNCTIONS);
    }
    return stateFunctions;
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
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, JexTestPackage.JEX_TEST_CASE__METHODS);
    }
    return methods;
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS:
        return basicSetTestedClass(null, msgs);
      case JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION:
        return basicSetImportSection(null, msgs);
      case JexTestPackage.JEX_TEST_CASE__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case JexTestPackage.JEX_TEST_CASE__STATE_FUNCTIONS:
        return ((InternalEList<?>)getStateFunctions()).basicRemove(otherEnd, msgs);
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        return ((InternalEList<?>)getTestSequences()).basicRemove(otherEnd, msgs);
      case JexTestPackage.JEX_TEST_CASE__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS:
        return getTestedClass();
      case JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME:
        return getTestClassName();
      case JexTestPackage.JEX_TEST_CASE__DESCRIPTION:
        return getDescription();
      case JexTestPackage.JEX_TEST_CASE__URL:
        return getUrl();
      case JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION:
        return getImportSection();
      case JexTestPackage.JEX_TEST_CASE__INSTANCES:
        return getInstances();
      case JexTestPackage.JEX_TEST_CASE__STATE_FUNCTIONS:
        return getStateFunctions();
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        return getTestSequences();
      case JexTestPackage.JEX_TEST_CASE__METHODS:
        return getMethods();
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS:
        setTestedClass((JvmParameterizedTypeReference)newValue);
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
      case JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION:
        setImportSection((XImportSection)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__STATE_FUNCTIONS:
        getStateFunctions().clear();
        getStateFunctions().addAll((Collection<? extends StateFunction>)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        getTestSequences().clear();
        getTestSequences().addAll((Collection<? extends JexTestSequence>)newValue);
        return;
      case JexTestPackage.JEX_TEST_CASE__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS:
        setTestedClass((JvmParameterizedTypeReference)null);
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
      case JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION:
        setImportSection((XImportSection)null);
        return;
      case JexTestPackage.JEX_TEST_CASE__INSTANCES:
        getInstances().clear();
        return;
      case JexTestPackage.JEX_TEST_CASE__STATE_FUNCTIONS:
        getStateFunctions().clear();
        return;
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        getTestSequences().clear();
        return;
      case JexTestPackage.JEX_TEST_CASE__METHODS:
        getMethods().clear();
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
      case JexTestPackage.JEX_TEST_CASE__TESTED_CLASS:
        return testedClass != null;
      case JexTestPackage.JEX_TEST_CASE__TEST_CLASS_NAME:
        return TEST_CLASS_NAME_EDEFAULT == null ? testClassName != null : !TEST_CLASS_NAME_EDEFAULT.equals(testClassName);
      case JexTestPackage.JEX_TEST_CASE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JexTestPackage.JEX_TEST_CASE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case JexTestPackage.JEX_TEST_CASE__IMPORT_SECTION:
        return importSection != null;
      case JexTestPackage.JEX_TEST_CASE__INSTANCES:
        return instances != null && !instances.isEmpty();
      case JexTestPackage.JEX_TEST_CASE__STATE_FUNCTIONS:
        return stateFunctions != null && !stateFunctions.isEmpty();
      case JexTestPackage.JEX_TEST_CASE__TEST_SEQUENCES:
        return testSequences != null && !testSequences.isEmpty();
      case JexTestPackage.JEX_TEST_CASE__METHODS:
        return methods != null && !methods.isEmpty();
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
