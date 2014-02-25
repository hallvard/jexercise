package no.hal.jex.jextest.jvmmodel

import com.google.inject.Inject
import no.hal.jex.jextest.jexTest.Instance
import no.hal.jex.jextest.jexTest.JexTestCase
import no.hal.jex.jextest.jexTest.ObjectTest
import no.hal.jex.jextest.jexTest.PropertiesTestOwner
import no.hal.jex.jextest.jexTest.StateFunction
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.diagnostics.AbstractDiagnostic
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.EObjectDiagnosticImpl
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class Util {

	def <T> String relativeName(EObject eObject, Class<T> c) {
		var name = ""
   		var e = eObject
		while (e != null) {
			val child = e;
			e = e.eContainer
			var String childName = null
			val nameFeature = child.eClass.getEStructuralFeature("name")
			if (nameFeature != null) {
				childName = child.eGet(nameFeature) as String
			}
			if (childName == null) {
				val feature = child.eContainingFeature
				if (feature != null && e != null) {
					childName = feature.name + if (feature.many) (e.eGet(feature) as EList<?>).indexOf(child) else ""
				}
			}
			if (childName != null) {
				name = "_" + childName + name
			}
			if (c.isInstance(child)) {
				return name
			}
   		}
	}

   	def <T> ancestor(EObject eObject, Class<T> c) {
   		var e = eObject
		while (e != null) {
			if (c.isInstance(e)) {
				return e as T
			}
			e = e.eContainer
   		}
   		null
   	}	

	def isDefaultInstanceTest(EObject eObject) {
		eObject.ancestor(JexTestCase).instances.empty
	}

   	def defaultInstanceType(EObject eObject) {
		val testCase = eObject.ancestor(JexTestCase)
		testCase?.testedClass
   	}

	def defaultInstanceName(EObject eObject) {
		eObject.ancestor(JexTestCase).testedClass.simpleName.toFirstLower
	}
	
	def instanceName(EObject eObject) {
		val propertiesTestOwner = eObject.ancestor(PropertiesTestOwner)
		if (propertiesTestOwner instanceof StateFunction) {
			return XbaseScopeProvider.IT.toString
		} else if (propertiesTestOwner instanceof ObjectTest) {
			val instance = (propertiesTestOwner as ObjectTest).instance
			if (instance != null) {
				return instance.name
			}
		}
		val instances = eObject.ancestor(JexTestCase).instances
		if (instances.empty)
			defaultInstanceName(eObject)
		else if (instances.size == 1) {
			instances.head.name
		} else null
	}
	
   	def jvmType(Instance instance) {
   		instance.type ?: instance.defaultInstanceType
   	}
   	
	def jvmInstanceType(EObject eObject) {
		val propertiesTestOwner = eObject.ancestor(PropertiesTestOwner)
		if (propertiesTestOwner instanceof StateFunction) {
			val stateFunction = (propertiesTestOwner as StateFunction)
			return stateFunction.type ?: defaultInstanceType(eObject)
		} else if (propertiesTestOwner instanceof ObjectTest) {
			val instance = (propertiesTestOwner as ObjectTest).instance
			if (instance != null) {
				return instance.jvmType
			}
		}
		val instances = eObject.ancestor(JexTestCase).instances
		if (instances.empty)
			defaultInstanceType(eObject)
		else if (instances.size == 1) {
			instances.head.jvmType
		} else null
	}

	@Inject extension TypesFactory
	
	def toAnnotationStringValues(EObject context, JvmAnnotationReference annotation, String valueName, String... values) {
		val op = annotation.annotation.members.filter(JvmOperation).findFirst[simpleName == valueName]
		val annotationValue = createJvmStringAnnotationValue
		annotationValue.operation = op
		annotationValue.values += values
		annotation.values += annotationValue
	}
	
	def asSourceText(EList<? extends EObject> eObjects, String separator) {
		eObjects.join(separator)[asSourceText]
	}

	def asSourceText(EObject eObject) {
		NodeModelUtils.getTokenText(NodeModelUtils.getNode(eObject))
	}

	def quote(String s, String q) {
		s.replace(q, "\\" + q)
	}
	
	def appendMethodSignature(StringBuilder buffer, JvmExecutable op) {
		if (op instanceof JvmOperation) {
			appendSignatureType(buffer, (op as JvmOperation).returnType)
			buffer.append(" ")
		}
		buffer.append(op.simpleName)
		buffer.append("(")
		val size = buffer.length
		for (parameter : op.parameters) {
			if (buffer.length > size) {
				buffer.append(",")
			}
			appendSignatureType(buffer, parameter.parameterType)
		}
		buffer.append(")")
	}

	def appendSignatureType(StringBuilder buffer, JvmTypeReference type) {
		buffer.append(type.identifier)
	}
	
	def removeJavaLang(String s) {
		s.replace("java.lang.", "")
	}
	
	def getProblemObject(Resource.Diagnostic diagnostic, Resource resource) {
		if (diagnostic instanceof AbstractDiagnostic) {
			val uri = (diagnostic as AbstractDiagnostic).uriToProblem;
			return resource.getEObject(uri.fragment());
		} else if (diagnostic instanceof EObjectDiagnosticImpl) {
			return (diagnostic as EObjectDiagnosticImpl).problematicObject
		}
		null
	}
	
	def hasDiagnostic(EObject eObject) {
		val resource = eObject.eResource
		for (diagnostic : resource.errors) {
			var problemObject = getProblemObject(diagnostic, resource)
			while (problemObject != null) {
				if (problemObject == eObject) {
					return true;
				}
				problemObject = problemObject.eContainer
			}
		}
		false
	}
	
	def generateUnsupportedOperationException(EObject problem, ITreeAppendable appendable) {
		appendable.append("throw new UnsupportedOperationException(\"Test wouldn't compile, due to missing or erroneous code.\");");
	}
	
	// 
	
	@Inject extension JvmTypesBuilder
	def JvmTypeReference jvmType(XExpression expr, EObject context) {
		if (expr instanceof XAbstractFeatureCall) {
			val feature = (expr as XAbstractFeatureCall).feature
			switch (feature) {
				JvmOperation: feature.returnType
				JvmConstructor: feature.declaringType.newTypeRef
				JvmField: feature.type
				default: null
			}
		} else {
			null
		}
	}
}
