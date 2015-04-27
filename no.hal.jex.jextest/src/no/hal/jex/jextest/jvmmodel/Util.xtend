package no.hal.jex.jextest.jvmmodel

import com.google.inject.Inject
import java.util.Collection
import no.hal.jex.jextest.jexTest.Instance
import no.hal.jex.jextest.jexTest.JexTestCase
import no.hal.jex.jextest.jexTest.JexTestSuite
import no.hal.jex.jextest.jexTest.JvmOperationRef
import no.hal.jex.jextest.jexTest.ObjectTest
import no.hal.jex.jextest.jexTest.PropertiesTestOwner
import no.hal.jex.jextest.jexTest.StateFunction
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmExecutable
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.diagnostics.AbstractDiagnostic
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
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

	def prependPackageName (String name, EObject context) {
		if (name.lastIndexOf('.') < 0) {
			val packOwner = ancestor(context, JexTestSuite)
			if (packOwner != null && name.lastIndexOf('.') < 0) {
				val pos = packOwner.suiteClassName.lastIndexOf('.')
				if (pos >= 0) {
					return packOwner.suiteClassName.substring(0, pos + 1) + name  
				}
			}
		}
		name  
	}

	def testedClassName(JexTestCase testCase) {
		testCase.testedClassRef ?.qualifiedName ?: testCase.testedClasses.head.name
	}

	// 
	
	@Inject extension JvmTypesBuilder

	def JvmTypeReference jvmType(XExpression expr, EObject context) {
		if (expr instanceof XAbstractFeatureCall) {
			val feature = expr.feature
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

	@Inject extension IJvmModelAssociations

	def testedJvmTypeRef(JexTestCase testCase) {
		testCase.testedClassRef ?: {
			val testedClass = testCase.testedClasses.head;
			(getJvmElements(testedClass).head as JvmType).newTypeRef
		}
	}
	
	def isDefaultInstanceTest(EObject eObject) {
		eObject.ancestor(JexTestCase).instances.empty
	}

   	def defaultInstanceType(EObject eObject) {
		val testCase = eObject.ancestor(JexTestCase)
		testCase?.testedJvmTypeRef
   	}

	def defaultInstanceName(EObject eObject) {
		eObject.ancestor(JexTestCase).testedJvmTypeRef.simpleName.toFirstLower
	}
	
	def instanceName(EObject eObject) {
		val propertiesTestOwner = eObject.ancestor(PropertiesTestOwner)
		if (propertiesTestOwner instanceof StateFunction) {
			return "it"
		} else if (propertiesTestOwner instanceof ObjectTest) {
			val instance = propertiesTestOwner.instance
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
			return propertiesTestOwner.type ?: defaultInstanceType(eObject)
		} else if (propertiesTestOwner instanceof ObjectTest) {
			val instance = propertiesTestOwner.instance
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
			if (op.returnType != null) {
				appendSignatureType(buffer, op.returnType)
				buffer.append(" ")
			}
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
			val uri = diagnostic.uriToProblem;
			return resource.getEObject(uri.fragment());
//		} else if (diagnostic instanceof EObjectDiagnosticImpl) {
//			return (diagnostic as EObjectDiagnosticImpl).problematicObject
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
	
	def resolveOperatorRefs(Collection<JvmOperationRef> refs) {
		refs.map[resolveOperatorRef]
	}

	def resolveOperatorRef(JvmOperationRef opRef) {
		val opOwner = defaultInstanceType(opRef)
		(opOwner.type as JvmDeclaredType).members.filter(JvmOperation).findFirst[
			simpleName == opRef.methodName && matchParameterTypes(parameters, opRef.parameterTypes)
		]
	}

	def matchParameterTypes(Collection<JvmFormalParameter> formalParameters, Collection<JvmParameterizedTypeReference> parameterTypes) {
		if (formalParameters.size != parameterTypes.size) {
			return false
		}
		val it1 = formalParameters.iterator
		val it2 = parameterTypes.iterator
		while (it1.hasNext && it2.hasNext) {
			if (it1.next.parameterType.identifier != it2.next.identifier) {
				return false
			}
		}
		true
	}
}
