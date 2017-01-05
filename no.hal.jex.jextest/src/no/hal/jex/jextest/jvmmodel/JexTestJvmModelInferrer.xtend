package no.hal.jex.jextest.jvmmodel

import com.google.inject.Inject
import no.hal.jex.jextest.jexTest.Instance
import no.hal.jex.jextest.jexTest.JexTestCase
import no.hal.jex.jextest.jexTest.JexTestSequence
import no.hal.jex.jextest.jexTest.Parameter
import no.hal.jex.jextest.jexTest.PropertiesTest
import no.hal.jex.jextest.jexTest.State
import no.hal.jex.jextest.jexTest.StateFunction
import no.hal.jex.jextest.jexTest.StateTestContext
import no.hal.jex.jextest.jexTest.TestedClass
import no.hal.jex.jextest.jexTest.TestedConstructor
import no.hal.jex.jextest.jexTest.TestedMethod
import no.hal.jex.jextest.jexTest.Transition
import no.hal.jex.jextest.jexTest.TransitionAction
import no.hal.jex.jextest.jexTest.TransitionEffect
import no.hal.jex.jextest.jexTest.TransitionExceptionEffect
import no.hal.jex.jextest.jexTest.TransitionExpressionAction
import no.hal.jex.jextest.jexTest.TransitionTargetEffect
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XUnaryOperation
import org.eclipse.xtext.xbase.compiler.TypeReferenceSerializer
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping
import no.hal.jex.jextest.jexTest.JexTestSuite
import no.hal.jex.jextest.jexTest.Method
import no.hal.jex.jextest.jexTest.TestMemberContext

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class JexTestJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	@Inject extension TypeReferenceSerializer
	@Inject extension XbaseCompiler
	@Inject extension IJvmModelAssociator
	@Inject extension OperatorMapping
	@Inject extension Util
	@Inject extension TestAnnotationsSupport

	def dispatch void infer(JexTestSuite testSuite, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for (testCase : testSuite.testCases) {
			if (testCase != null) {
				testCase.inferTestCase(acceptor)
			}
		}
		val jvmClass = testSuite.toClass(testSuite.suiteClassName)
		if (jvmClass == null) {
			return
		}
		jvmClass.superTypes += typeRef("junit.framework.TestCase")
		acceptor.accept(jvmClass) [
			jvmClass.members += testSuite.toMethod("suite", typeRef("junit.framework.Test")) [
				static = true
				visibility = JvmVisibility.PUBLIC
				body = [
					append('''
					junit.framework.TestSuite suite = new junit.framework.TestSuite("«testSuite.suiteClassName»");
						«FOR testCase : testSuite.testCases»
							suite.addTestSuite(«testCase.testCaseClassName».class);
						«ENDFOR»
					return suite;
					''')
				]
			]
			for (instance : testSuite.instances) {
				jvmClass.members += instance.toField(instance.name, instance.jvmType) [
					visibility = JvmVisibility.DEFAULT
					static = true
					initializer = instance.expr
				]
			}
			for (stateFunction : testSuite.stateFunctions) {
				inferStateFunctionMethods(stateFunction, jvmClass, true)
			}
			for (method : testSuite.methods) {
				inferMethod(jvmClass, method, true)
			}
		]
	}

	def inferMethod(JvmGenericType jvmClass, Method method, boolean isSuite) {
		val methodName = getMethodName(QualifiedName.create(method.name))?.toString ?: method.name
		if (methodName != null) {
			jvmClass.members += method.toMethod(methodName, method.returnType) [
				visibility = if (isSuite) JvmVisibility.DEFAULT else JvmVisibility.PRIVATE
				static = isSuite
				initParameters(method.parameters.parameters)
				body = method.body
			]
		}
	}

	def testCaseClassName(JexTestCase testCase) {
		(testCase.testedClassName ?: testCase.testedClassName) + "Test"
	}

	def dispatch void infer(JexTestCase testCase, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		inferTestCase(testCase, acceptor)
	}

	def JvmGenericType inferTestCase(JexTestCase testCase, IJvmDeclaredTypeAcceptor acceptor) {
		val jvmClass = testCase.toClass(testCase.testCaseClassName.prependPackageName(testCase))
		jvmClass.superTypes += typeRef("junit.framework.TestCase")
		
		for (testedClass : testCase.testedClasses) {
			inferTestedClass(testedClass, acceptor)
		}
		acceptor.accept(jvmClass)[
			
			val jexerciseTestCaseAnnotation = annotationRef("no.hal.jex.runtime.JExercise")
			testCase.generateTestClassAnntations(jexerciseTestCaseAnnotation)
			annotations += jexerciseTestCaseAnnotation
			
			val testSuite = ancestor(testCase, JexTestSuite)
			if (testSuite != null) {
				for (instance : testSuite.instances) {
					jvmClass.members += instance.toField(instance.name, instance.jvmType) [
						visibility = JvmVisibility.PRIVATE
						initializer = [
							append(testSuite.suiteClassName + '.' + instance.name)
						]
					]
				}
				for (stateFunction : testSuite.stateFunctions) {
					inferStateFunctionMethods(stateFunction, jvmClass, false)
				}
			}
			
			if (testCase.defaultInstanceTest) {
				jvmClass.members += testCase.toField(defaultInstanceName(testCase), testCase.testedJvmTypeRef) [
					visibility = JvmVisibility.PRIVATE
				]
			} else {
				for (instance : testCase.instances) {
					val type = instance.jvmType
					jvmClass.members += instance.toField(instance.name, type) [
						visibility = JvmVisibility.PRIVATE
					]
					members += inferTestInstanceInitMethod("_init_" + instance.name, instance)
				}
			}

			jvmClass.members += testCase.toMethod("setUp", typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				annotations += annotationRef(Override)
				body = [
					generateSetUpMethodBody(testCase, it)
				]
			]
						
			for (method : testCase.methods) {
				inferMethod(jvmClass, method, false)
			}

			for (stateFunction : testCase.stateFunctions) {
				inferStateFunctionMethods(stateFunction, jvmClass, false)
			}
			// create the test methods first
			val testMethods = <Pair<JexTestSequence, JvmOperation>>newArrayList
			for (sequence : testCase.testSequences) {
				if (sequence.name != null) {
					val testMethod = sequence.toMethod("test" + sequence.name.toFirstUpper, typeRef(void)) [
						visibility = JvmVisibility.PUBLIC
						body = [
							for (instance : sequence.instances) {
								generateLocalInstance(instance, it)
							}
							for (transition : sequence.transitions) {
								generateTransition(transition, it)
							}
						]
					]
					testMethods += sequence -> testMethod
					members += testMethod
				}
			}
			members += testMethods.map[value]
			// add other methods
			for (sequence : testCase.testSequences) {
				for (instance : sequence.instances) {
					members += inferTestInstanceInitMethod("_init_" + instance.relativeName(JexTestSequence), instance)
				}
				for (transition : sequence.transitions) {
					if (transition.source != null && transition.source.state != null) {
						sequence.inferStateTestMethods(transition.source.state, jvmClass)
					}
					for (action : transition.actions.filter(TransitionExpressionAction)) {
						members += sequence.inferActionMethod(action)
						if (action.times != null) {
							members += sequence.inferTestHelperMethod("_transition_exprAction_times_", action, action.times, null)
						}
					}
					if (transition.effects.head instanceof TransitionTargetEffect) {
						val targetEffect = transition.effects.head as TransitionTargetEffect
						if (targetEffect.state != null) {
							sequence.inferStateTestMethods(targetEffect.state, jvmClass)
						}
					}
				}
			}
			// add annotations
			for (sequenceMethod : testMethods) {
				val jexerciseTestMethodAnnotation = annotationRef("no.hal.jex.runtime.JExercise")
				sequenceMethod.key.generateTestMethodAnntations(jexerciseTestMethodAnnotation)
				sequenceMethod.value.annotations += jexerciseTestMethodAnnotation
			}

			// add a main method that starts the standalone version of JExercise
			members += testCase.toMethod("main", typeRef(void)) [
				visibility = JvmVisibility.PUBLIC
				static = true
				parameters += testCase.toParameter("args", typeRef(String).addArrayTypeDimension)
				body = [
					append('''no.hal.jex.standalone.JexStandalone.main(«jvmClass.simpleName».class);''')
				]
			]
		]
		jvmClass
	}
	
	def inferTestedClass(TestedClass testedClass, IJvmDeclaredTypeAcceptor acceptor) {
		val jvmTestedClass = testedClass.toClass(testedClass.name.prependPackageName(testedClass)) [
			interface = testedClass.interface
			abstract = testedClass.abstract
			superTypes += testedClass.superClass.cloneWithProxies
			for (superInterface : testedClass.superInterfaces) {
				superTypes += superInterface.cloneWithProxies
			}
		]
		for (op : testedClass.methods) {
			val jvmMethod =
				if (op instanceof TestedConstructor) {
					op.toConstructor() [
					]
				} else if (op instanceof TestedMethod) {
					op.toMethod(op.name, op.returnType) [
						abstract = (op.abstract || jvmTestedClass.interface)
					]
				}
			jvmMethod.visibility = JvmVisibility.PUBLIC
			initParameters(jvmMethod, op.parameters.parameters)
			jvmTestedClass.members += jvmMethod
		}
		acceptor.accept(jvmTestedClass)
	}
	
	private boolean checkDiagnosticInCompiler = true

	def inferTestInstanceInitMethod(String name, Instance instance) {
		val method = instance.toMethod(name, instance.jvmType) [
			visibility = JvmVisibility.PRIVATE
		]
		if (instance.expr == null) {
			method.body = [
				it.append("return new ")
				instance.jvmType.serialize(instance, it)
				it.append("();").newLine
			]
		} else if (checkDiagnosticInCompiler) {
			method.body = instance.expr
		} else {
			method.body = [
				if (instance.expr.hasDiagnostic) {
					generateUnsupportedOperationException(instance.expr, it)
				} else {
					instance.expr.toJavaExpression(it)
					it.append("return ")
					instance.expr.toJavaExpression(it)
					it.append(";").newLine
				}
			]
		}
		method
	}

	def initParameters(JvmExecutable op, Iterable<Parameter> parameters) {
		var paramNum = 1
		for (parameter : parameters) {
			val formalParameter = parameter.toParameter(parameter.name ?: ("arg" + paramNum), parameter.type)
			if (parameter.vararg) {
				formalParameter.parameterType = formalParameter.parameterType.addArrayTypeDimension
				op.varArgs = true
			}
			op.parameters += formalParameter
			paramNum++
		}
	}

	def generateSetUpMethodBody(JexTestCase testCase, ITreeAppendable appendable) {
		if (testCase.defaultInstanceTest) {
			appendable.append('''«defaultInstanceName(testCase)» = new ''')
			testCase.defaultInstanceType.serialize(testCase, appendable)
			appendable.append("();").newLine
		} else {
			for (instance : testCase.instances) {
				appendable.append('''«instance.name» = _init_«instance.name»();''').newLine
			}
		}
	}

	def inferStateFunctionMethods(StateFunction stateFunction, JvmGenericType jvmClass, boolean isSuite) {
		val testMemberContext = stateFunction.ancestor(TestMemberContext)
		if (stateFunction.name != null && (stateFunction.type != null || testMemberContext instanceof JexTestCase)) {
			jvmClass.members += stateFunction.toMethod(stateFunction.name, typeRef(void)) [
				visibility = if (isSuite) JvmVisibility.DEFAULT else JvmVisibility.PRIVATE
				static = isSuite
				parameters += stateFunction.toParameter("it", stateFunction.type ?: (testMemberContext as JexTestCase).testedJvmTypeRef)
				initParameters(stateFunction.parameters)
				val method = it
				body = [
					if ((! isSuite) && testMemberContext instanceof JexTestSuite) {
						generateSuiteMethodCall(testMemberContext as JexTestSuite, method, it)
					} else {
						generateTestHelperMethodCall("_test_", (stateFunction.test as PropertiesTest), it)
					}
				]
			]
			if (stateFunction.test != null) {
				(stateFunction.test as PropertiesTest).inferPropertiesTestMethods(jvmClass)
			}
		}
	}

	 

	def void inferStateTestMethods(StateTestContext stateTestContext, State state, JvmGenericType jvmClass) {
		jvmClass.members += stateTestContext.inferTestHelperMethod("_test_", state) [
			val appendable = it
			for (objectTest : state.objectTests) {
				generateTestHelperMethodCall("_test_", objectTest.test, appendable)
			}
		]
		for (objectTest : state.objectTests) {
			(objectTest.test as PropertiesTest).inferPropertiesTestMethods(jvmClass)
		}
	}

	def JvmOperation inferActionMethod(StateTestContext stateTestContext, TransitionExpressionAction action) {
		val method = inferTestHelperMethod(stateTestContext, "_transition_exprAction_" + action.relativeName(JexTestSequence), typeRef(void), action) // context.newTypeRef(void)
		action.expr.associateLogicalContainer(method)
		method.body = [
			generateAssertCall(action, action.expr, it, true)
		]
		method
	}

	def inferTestHelperMethod(StateTestContext innerStateTestContext, String name, JvmTypeReference type, EObject context) {
		context.toMethod(name, type) [
			visibility = JvmVisibility.PRIVATE
			static = ancestor(innerStateTestContext, TestMemberContext) instanceof JexTestSuite
			val instanceType = jvmInstanceType(context)
			if (instanceType != null) {
				parameters += context.toParameter("it", instanceType)
			}
			var stateTestContext = innerStateTestContext
			if (stateTestContext instanceof StateFunction) {
				initParameters(stateTestContext.parameters)
				stateTestContext = stateTestContext.ancestor(StateTestContext)
			}
			if (stateTestContext instanceof JexTestSequence) {
				for (instance : stateTestContext.instances) {
					parameters += instance.toParameter(instance.name, jvmType(instance))
				}
			}
		]
	}

	def inferTestHelperMethod(StateTestContext stateTestContext, String prefix, EObject context, XExpression expr, (ITreeAppendable)=>void generator) {
		val method = inferTestHelperMethod(stateTestContext, prefix + context.relativeName(JexTestSequence), null, context) // context.newTypeRef(void)
		if (expr != null) {
			if (generator != null) {
				expr.associateLogicalContainer(method)
				method.body = generator
			} else {
				method.body = expr
			}
		}
		method
	}

	def inferTestHelperMethod(StateTestContext stateTestContext, String prefix, EObject context, (ITreeAppendable)=>void initializer) {
		val method = inferTestHelperMethod(stateTestContext, prefix + context.relativeName(JexTestSequence), typeRef(void), context)
		method.body = [
			initializer.apply(it)
		]
		method
	}

	def generateTestHelperMethodCall(String prefix, EObject eObject, ITreeAppendable appendable, boolean asStatement, boolean newline) {
		appendable.append('''«prefix»«eObject.relativeName(StateTestContext)»(''')
		val instanceName = instanceName(eObject)
		var separator = ""
		if (instanceName != null) {
			appendable.append(instanceName)
			separator = ", "
		}		
		var stateTestContext = eObject.ancestor(StateTestContext)
		if (stateTestContext instanceof StateFunction) {
			appendable.append(stateTestContext.parameters.join(separator, ", ", "")[name])
			stateTestContext = stateTestContext.ancestor(StateTestContext)
		}
		if (stateTestContext instanceof JexTestSequence) {
			appendable.append(stateTestContext.instances.join(separator, ", ", "")[name])
		}
		appendable.append(")")
		if (asStatement) {
			appendable.append(";")
		}
		if (newline) {
			appendable.newLine
		}
	}

	def generateSuiteMethodCall(JexTestSuite testSuite, JvmExecutable op, ITreeAppendable appendable) {
		val suiteMethodName = testSuite.suiteClassName + '.' + op.simpleName
		appendable.append(op.parameters.join(suiteMethodName + '(', ',', ');') [name])
	}

	def generateTestHelperMethodCall(String prefix, EObject eObject, ITreeAppendable appendable) {
		generateTestHelperMethodCall(prefix, eObject, appendable, true, true)
	}

	def generateLocalInstance(Instance instance, ITreeAppendable appendable) {
		val instanceType = jvmType(instance)
		serialize(instanceType, instance, appendable)
		appendable.append(''' «instance.name» = _init_«instance.relativeName(JexTestSequence)»();''')
		appendable.newLine
	}

	def generateStateTesterCall(State state, State stateRef, ITreeAppendable appendable) {
		var theState = state
		if (theState == null) {
			theState = stateRef
		}
		if (theState != null) {
			generateTestHelperMethodCall("_test_", theState, appendable)
		}
	}

	def generateTransition(Transition transition, ITreeAppendable appendable) {
		if (transition.source != null) {
			generateStateTesterCall(transition.source.state, transition.source.stateRef, appendable)
		}
		generateTransitionActionsEffect(transition.effects.head, transition, appendable)
	}

	def dispatch void generateTransitionActionsEffect(TransitionEffect effect, Transition transition, ITreeAppendable appendable) {
		for (action : transition.actions) {
			generateTransitionAction(action, transition, appendable)
		}
	}
	def dispatch void generateTransitionActionsEffect(TransitionExceptionEffect effect, Transition transition, ITreeAppendable appendable) {
		if (transition.effects.head instanceof TransitionExceptionEffect) {
			appendable.append("try {").increaseIndentation.newLine
		}
		_generateTransitionActionsEffect(effect as TransitionEffect, transition, appendable)
		if (transition.effects.head instanceof TransitionExceptionEffect) {
			val exceptionClass = (transition.effects.head as TransitionExceptionEffect).exceptionClass
			val exceptionClassName = exceptionClass.qualifiedName.removeJavaLang
			val message = '''«exceptionClassName» should be thrown after «transition.actions.asSourceText(', ')»'''
			appendable.append('''fail("«message.quote("\"")»");''')
			appendable.decreaseIndentation.newLine.append("}")
			var exceptionVar = appendable.declareSyntheticVariable(transition, "e")
			appendable.append(''' catch (Exception «exceptionVar») {''').increaseIndentation.newLine
			appendable.append('''assertTrue("«message.quote("\"")»", «exceptionVar» instanceof «exceptionClassName»);''')
			appendable.decreaseIndentation.newLine.append("}").newLine
		}
	}
	def dispatch void generateTransitionActionsEffect(TransitionTargetEffect effect, Transition transition, ITreeAppendable appendable) {
		_generateTransitionActionsEffect(effect as TransitionEffect, transition, appendable)
		generateStateTesterCall(effect.state, effect.stateRef, appendable)
	}

	def dispatch void generateTransitionAction(TransitionAction action, Transition transition, ITreeAppendable appendable) {
	}

	def dispatch void generateTransitionAction(TransitionExpressionAction action, Transition transition, ITreeAppendable appendable) {
		var String timesVar = if (action.times != null) appendable.declareSyntheticVariable(action.times, "times")
		if (timesVar != null) {
			appendable.append('''for (int «timesVar» = ''')
			generateTestHelperMethodCall("_transition_exprAction_times_", action, appendable, false, false)
			appendable.append('''; «timesVar» > 0; «timesVar»--) {''').increaseIndentation.newLine
		}
		generateTestHelperMethodCall("_transition_exprAction_", action, appendable, true, false)
		if (timesVar != null) {
			appendable.decreaseIndentation.newLine.append("}")
		}
		appendable.newLine
	}

	def void inferPropertiesTestMethods(PropertiesTest pt, JvmGenericType jvmClass) {
		val JvmTypeReference returnType = typeRef(void)
//		if (pt.stateFunctionCall != null) {
//			val stateFunctionCallMethod = inferTestHelperMethod(pt.ancestor(StateTestContext), "_test_" + pt.stateFunctionCall.relativeName(StateTestContext), returnType, (pt.stateFunctionCall as EObject))
//			pt.stateFunctionCall.associateLogicalContainer(stateFunctionCallMethod)
//			stateFunctionCallMethod.body = [
//				generateStateFunctionCall(pt.stateFunctionCall as StateFunctionCall, it)
//			]
//			jvmClass.members += stateFunctionCallMethod
//		}
		val propertiesMethod = inferTestHelperMethod(pt.ancestor(StateTestContext), "_test_" + pt.relativeName(StateTestContext), returnType, (pt as EObject))
		pt.associateLogicalContainer(propertiesMethod)
		propertiesMethod.body = [
//			if (pt.stateFunctionCall != null) {
//				generateTestHelperMethodCall("_test_", pt.stateFunctionCall, it)
//			}
			for (expr : pt.expressions) {
				generateAssertCall(pt, expr, it, false)
			}
		]
		jvmClass.members += propertiesMethod
	}

//	def void generateStateFunctionCall(StateFunctionCall sfc, ITreeAppendable appendable) {
//		for (expr : sfc.expressions) {
//			expr.toJavaStatement(appendable, true)
//		}
//		appendable.append('''test«sfc.stateFunction.name.toFirstUpper»(«XbaseScopeProvider.IT»''')
//		for (expr : sfc.expressions) {
//			appendable.append(", ")
//			expr.toJavaExpression(appendable)
//		}
//		appendable.append(");").newLine
//	} 

	def void generateAssertCall(EObject owner, XExpression expr, ITreeAppendable appendable, boolean explicitBoolean) {
		var exprs = #[expr]
		var String assertMethodName = null
		val type = expr.jvmType(owner) ?: typeRef(void)
		val isVoid = (type.qualifiedName == "void")
		val isLogical = type.qualifiedName == "boolean"
		val isOperator = (expr instanceof XUnaryOperation || expr instanceof XBinaryOperation)
		if ((! explicitBoolean) || (isOperator && isLogical)) {
			assertMethodName = if (isLogical) "assertTrue" else if (! isVoid) "assertNotNull"
			if (expr instanceof XBinaryOperation && (expr as XBinaryOperation).feature instanceof JvmOperation) {
				val binOp = (expr as XBinaryOperation)
				val feature = binOp.feature as JvmOperation
				val typeName = feature.declaringType.qualifiedName
				if (typeName.startsWith("org.eclipse.xtext.xbase.lib.") && typeName.endsWith("Extensions")) {
					switch (feature.simpleName) {
						case "operator_equals": {
							assertMethodName = "assertEquals"
							exprs = #[binOp.rightOperand, binOp.leftOperand]
						}
						case "operator_tripleEquals": {
							assertMethodName = "assertEquals"
							exprs = #[binOp.rightOperand, binOp.leftOperand]
						}
					}
				}
			}
		}
		try {
			if (assertMethodName == null) {
				appendable.append("try {").increaseIndentation.newLine
			}
			for (subExpr : exprs) {
				subExpr.toJavaStatement(appendable, subExpr != expr || (assertMethodName != null))
			}
			appendable.newLine
			var message = '''«expr.asSourceText» failed'''
			if (! (owner instanceof TransitionAction)) {
				val transition = expr.ancestor(Transition)
				if (transition != null && (! transition.actions.empty)) {
					message = message + " after " + transition.actions.asSourceText(' ,')
				}
			}
			if (assertMethodName != null) {
				appendable.append('''«assertMethodName»("«message.quote("\"")»"''')
				for (subExpr : exprs) {
					appendable.append(", ")
					subExpr.toJavaExpression(appendable)
				}
				appendable.append(");").newLine
			} else {
				val errorVar = appendable.declareSyntheticVariable(owner, "error")
				appendable.append('''} catch (junit.framework.AssertionFailedError «errorVar») {''').newLine
				appendable.append('''fail("«message.quote("\"")»: " + «errorVar».getMessage());''').decreaseIndentation.newLine
				appendable.append("}").newLine
			}
		} catch (RuntimeException re) {
			generateUnsupportedOperationException(owner, appendable)
		}
	}
}
