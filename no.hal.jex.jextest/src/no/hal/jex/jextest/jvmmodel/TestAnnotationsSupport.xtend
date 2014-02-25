package no.hal.jex.jextest.jvmmodel

import com.google.inject.Inject
import java.util.Collection
import no.hal.jex.jextest.jexTest.Instance
import no.hal.jex.jextest.jexTest.JexTestCase
import no.hal.jex.jextest.jexTest.JexTestSequence
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XConstructorCall
import no.hal.jex.jextest.jexTest.TransitionExpressionAction
import org.eclipse.xtext.xbase.XExpression

class TestAnnotationsSupport {

	@Inject extension Util

	def generateTestClassAnntations(JexTestCase testCase, JvmAnnotationReference jexerciseAnnotation) {
		val descriptionBuffer = new StringBuilder()
		descriptionBuffer.addDescription(testCase.description, "h3")
		descriptionBuffer.append('''Tests «testCase.testedClass.identifier»''')
		if (testCase.url != null) {
			descriptionBuffer.append('''<p>(see <a href="«testCase.url»">«testCase.url»</a>)</p>''')
		}
		testCase.toAnnotationStringValues(jexerciseAnnotation, "description", descriptionBuffer.toString)
	}

	def generateTestMethodAnntations(JexTestSequence sequence, JvmAnnotationReference jexerciseAnnotation) {
		val testsBuffer = new StringBuilder()
		val testCase = sequence.ancestor(JexTestCase)
		val testedClass = testCase.testedClass.type
		val testedMembers = <JvmExecutable>newArrayList
		if (testCase.instances.empty) {
			addDefaultConstructor(testedClass, testedMembers)
		} else {
			for (instance : testCase.instances) {
				instance.collectUsedMembers(testedClass, testedMembers)
			}
		}
		for (instance : sequence.instances) {
			instance.collectUsedMembers(testedClass, testedMembers)
		}
		for (transition : sequence.transitions) {
			for (action : transition.actions) {
				var XExpression expr = null
				if (action instanceof TransitionExpressionAction) {
					expr = (action as TransitionExpressionAction).expr;
				}
				if (expr != null) {
					expr.collectUsedMembers(testedClass, testedMembers)
				}
			}
		}
		val size = testsBuffer.length
		for (op : testedMembers) {
			if (testsBuffer.length > size) {
				testsBuffer.append(";")
			}
			testsBuffer.appendMethodSignature(op)
		}
		val descriptionBuffer = new StringBuilder()
		descriptionBuffer.addDescription(sequence.description, "h3")
		val transitionExpressions = sequence.transitions.filter[! actions.empty]
		descriptionBuffer.append('''Tests 
		«IF transitionExpressions.empty»
			initialization
		«ELSE»
			the following sequence:
			<ul>
			«FOR transition : transitionExpressions»
				<li>«IF transition.description != null»«transition.description»: «ENDIF»«transition.actions.asSourceText(', ')»</li>
			«ENDFOR»
			</ul>
		«ENDIF»''')
		if (testsBuffer.length > 0) {
			sequence.toAnnotationStringValues(jexerciseAnnotation, "tests", testsBuffer.toString.removeJavaLang)
		}
		sequence.toAnnotationStringValues(jexerciseAnnotation, "description", descriptionBuffer.toString)
	}

	def void addDescription(StringBuilder buffer, String description, String... tags) {
		if (description != null) {
			val tagList = newArrayList(tags)			
			for (tag : tagList) {
				buffer.append("<" + tag + ">")
			}
			buffer.append(description)
			tagList.reverse
			for (tag : tagList) {
				buffer.append("</" + tag + ">")
			}
		}
	}

	private def void addDefaultConstructor(JvmType type, Collection<JvmExecutable> testedMembers) {
		if (type instanceof JvmGenericType) {
			for (member : (type as JvmGenericType).members) {
				if (member instanceof JvmConstructor && (member as JvmExecutable).parameters.empty) {
					addUsedMember(member as JvmExecutable, type, testedMembers)
					return
				}
			}
		}
	}

	private def void collectUsedMembers(Instance instance, JvmType type, Collection<JvmExecutable> testedMembers) {
		if (instance.expr != null) {
			instance.expr.collectUsedMembers(type, testedMembers)
		} else {
			addDefaultConstructor(type, testedMembers)
		}
	}
	
	private def void collectUsedMembers(EObject expr, JvmType type, Collection<JvmExecutable> executables) {
		expr.collectUsedMember(type, executables)
		val allContents = expr.eAllContents
		while (allContents.hasNext) {
			allContents.next.collectUsedMember(type, executables)
		}
	}
	
	private def void collectUsedMember(EObject expr, JvmType type, Collection<JvmExecutable> executables) {
		var JvmExecutable op = null
		if (expr instanceof XAbstractFeatureCall) {
			val featureCall = expr as XAbstractFeatureCall
			if (featureCall.feature instanceof JvmExecutable) {
				op = featureCall.feature as JvmExecutable
			}
		} else if (expr instanceof XConstructorCall) {
			val constructorCall = expr as XConstructorCall
			op = constructorCall.constructor
		}
		addUsedMember(op, type, executables)
	}

	private def void addUsedMember(JvmExecutable op, JvmType type, Collection<JvmExecutable> testedMembers) {
		if (op != null && op.declaringType == type && (! testedMembers.contains(op))) {
			testedMembers += op
		}
	}
}
