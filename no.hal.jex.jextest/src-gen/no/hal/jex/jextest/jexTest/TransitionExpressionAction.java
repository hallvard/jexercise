/**
 */
package no.hal.jex.jextest.jexTest;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Expression Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction#getExpr <em>Expr</em>}</li>
 *   <li>{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction#getTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionExpressionAction()
 * @model
 * @generated
 */
public interface TransitionExpressionAction extends TransitionAction
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(XExpression)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionExpressionAction_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

  /**
   * Returns the value of the '<em><b>Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Times</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Times</em>' containment reference.
   * @see #setTimes(XExpression)
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#getTransitionExpressionAction_Times()
   * @model containment="true"
   * @generated
   */
  XExpression getTimes();

  /**
   * Sets the value of the '{@link no.hal.jex.jextest.jexTest.TransitionExpressionAction#getTimes <em>Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Times</em>' containment reference.
   * @see #getTimes()
   * @generated
   */
  void setTimes(XExpression value);

} // TransitionExpressionAction
