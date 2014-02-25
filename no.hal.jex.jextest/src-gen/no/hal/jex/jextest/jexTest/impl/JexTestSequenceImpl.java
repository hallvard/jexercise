/**
 */
package no.hal.jex.jextest.jexTest.impl;

import java.util.Collection;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.Transition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSequenceImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.impl.JexTestSequenceImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JexTestSequenceImpl extends StateTestContextImpl implements JexTestSequence
{
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
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JexTestSequenceImpl()
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
    return JexTestPackage.Literals.JEX_TEST_SEQUENCE;
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
      instances = new EObjectContainmentEList<Instance>(Instance.class, this, JexTestPackage.JEX_TEST_SEQUENCE__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, JexTestPackage.JEX_TEST_SEQUENCE__TRANSITIONS);
    }
    return transitions;
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
      case JexTestPackage.JEX_TEST_SEQUENCE__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case JexTestPackage.JEX_TEST_SEQUENCE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case JexTestPackage.JEX_TEST_SEQUENCE__INSTANCES:
        return getInstances();
      case JexTestPackage.JEX_TEST_SEQUENCE__TRANSITIONS:
        return getTransitions();
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
      case JexTestPackage.JEX_TEST_SEQUENCE__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Instance>)newValue);
        return;
      case JexTestPackage.JEX_TEST_SEQUENCE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case JexTestPackage.JEX_TEST_SEQUENCE__INSTANCES:
        getInstances().clear();
        return;
      case JexTestPackage.JEX_TEST_SEQUENCE__TRANSITIONS:
        getTransitions().clear();
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
      case JexTestPackage.JEX_TEST_SEQUENCE__INSTANCES:
        return instances != null && !instances.isEmpty();
      case JexTestPackage.JEX_TEST_SEQUENCE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JexTestSequenceImpl
