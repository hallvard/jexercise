package no.hal.learning.exercise.jdt.ecore;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.ChildListPropertyDescriptor;
import org.eclipse.jdt.core.dom.ChildPropertyDescriptor;
import org.eclipse.jdt.core.dom.IDocElement;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberRef;
import org.eclipse.jdt.core.dom.MethodRef;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimplePropertyDescriptor;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;

public class EcoreGenerator {

	private Collection<Class<?>> getASTClasses() {
		int nodeType = 0;
		Collection<Class<?>> classes = null;
		while (true) {
			Class<?> nodeClass = null;
			try {
				nodeClass = ASTNode.nodeClassForType(nodeType);
			} catch (Exception e) {
			}
			if (nodeClass != null) {
				if (classes == null) {
					classes = new ArrayList<Class<?>>(100);
				}
				classes.add(nodeClass);
			} else if (classes != null) {
				break;
			}
			nodeType++;
		}
		// these are subclasses of IExtendedModifier.class
		classes.add(Modifier.class);
		classes.add(MarkerAnnotation.class);
		classes.add(NormalAnnotation.class);
		classes.add(SingleMemberAnnotation.class);
		// these are subclasses of IDocElement.class
		classes.add(MemberRef.class);
		classes.add(MethodRef.class);
		classes.add(TagElement.class);
		classes.add(TextElement.class);
		return classes;
	}
	
	private EPackage ePackage;

	public void generate(String name) {
		initEPackage(name);
		initEDataTypes();
		generateEClasses();
		generateFeatures();
	}

	protected void initEPackage(String name) {
		ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName(name);
		ePackage.setNsPrefix(name);
		ePackage.setNsURI(ASTNode.class.getName());
	}

	protected void initEDataTypes() {
		ePackage.getEClassifiers().add(createEDataType("EPrimitiveTypeCode", PrimitiveType.Code.class));
		ePackage.getEClassifiers().add(createEDataType("EModifierKeyword", Modifier.ModifierKeyword.class));
		ePackage.getEClassifiers().add(createEDataType("EAssignmentOperator", Assignment.Operator.class));
		ePackage.getEClassifiers().add(createEDataType("EPrefixExpressionOperator", PrefixExpression.Operator.class));
		ePackage.getEClassifiers().add(createEDataType("EInfixExpressionOperator", InfixExpression.Operator.class));
		ePackage.getEClassifiers().add(createEDataType("EPostfixExpressionOperator", PostfixExpression.Operator.class));
	}

	private Map<EClass, Class<?>> classMap = new HashMap<EClass, Class<?>>();
	private Map<Class<?>, EClass> eClassMap = new HashMap<Class<?>, EClass>();
	private Map<Class<?>, Collection<Class<?>>> interfaceMap = new HashMap<Class<?>, Collection<Class<?>>>();
	
	protected void generateEClasses() {
		interfaceMap.put(IExtendedModifier.class, Arrays.<Class<?>>asList(Modifier.class, MarkerAnnotation.class, NormalAnnotation.class, SingleMemberAnnotation.class));
		interfaceMap.put(IDocElement.class, Arrays.<Class<?>>asList(MemberRef.class, MethodRef.class, Name.class, TagElement.class, TextElement.class));
		Collection<Class<?>> astClasses = getASTClasses();
		for (Class<?> interfaceClass : interfaceMap.keySet()) {
			astClasses.add(interfaceClass);
			astClasses.addAll(interfaceMap.get(interfaceClass));
		}
		for (Class<?> astClass : astClasses) {
			generateEClass(astClass);
		}
	}

	protected EClass generateEClass(Class<?> astClass) {
		EClass eClass = eClassMap.get(astClass);
		boolean eClassExists = eClass != null;
		if (! eClassExists) {
			eClass = createASTEClass(astClass);
			ePackage.getEClassifiers().add(eClass);
			classMap.put(eClass, astClass);
			eClassMap.put(astClass, eClass);
			if (astClass != ASTNode.class) {
				Class<?> superclass = astClass.getSuperclass();
				EClass superEClass = generateEClass(superclass);
				superEClass.getESuperTypes().add(eClass);				
			}
		}
		return eClass;
	}

	protected void generateFeatures() {
		Class<?>[] propertyDescriptorsParameterTypes = new Class[]{Integer.TYPE};
		Object[] propertyDescriptorsArguments = new Object[]{AST.JLS8};
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			Class<?> astClass = classMap.get(eClassifier);
			if (astClass != null) {
				try {
					Method m = astClass.getMethod("propertyDescriptors", propertyDescriptorsParameterTypes);
					if (m != null) {
						Collection<StructuralPropertyDescriptor> propertyDescriptors = (Collection<StructuralPropertyDescriptor>) m.invoke(null, propertyDescriptorsArguments);
						addPropertyFeatures((EClass) eClassifier, propertyDescriptors);
					}
				} catch (Exception e) {
				}
			}
		}
	}

	protected EDataType createEDataType(String name, Class<?> valueType) {
		EDataType operatorEDataType = EcoreFactory.eINSTANCE.createEDataType();
		operatorEDataType.setName(name);
		operatorEDataType.setInstanceClass(valueType);
		return operatorEDataType;
	}

	private void addPropertyFeatures(EClass eClass, Collection<StructuralPropertyDescriptor> propertyDescriptors) {
		System.out.println(eClass.getName() + " features");
		for (StructuralPropertyDescriptor propertyDescriptor : propertyDescriptors) {
			EStructuralFeature feature = createEStructuralFeature(propertyDescriptor);
			if (feature != null) {
				System.out.println("  " + feature.getName() + ": " + feature.getEType().getName());
				eClass.getEStructuralFeatures().add(feature);
			}
		}
	}

	protected EStructuralFeature createEStructuralFeature(StructuralPropertyDescriptor propertyDescriptor) {
		EStructuralFeature feature = null;
		Class<?> featureType = null;
		if (propertyDescriptor.isSimpleProperty()) {
			EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
			featureType = ((SimplePropertyDescriptor) propertyDescriptor).getValueType();
			attribute.setEType(getEDataType(featureType, EcorePackage.eINSTANCE.getEClassifiers(), ePackage.getEClassifiers()));
			feature = attribute;
		} else {
			if (propertyDescriptor.isChildProperty()) {
				featureType = ((ChildPropertyDescriptor) propertyDescriptor).getChildType();
			} else {
				featureType = ((ChildListPropertyDescriptor) propertyDescriptor).getElementType();
			}
			EClass eType = eClassMap.get(featureType);
			if (eType != null) {
				EReference reference = EcoreFactory.eINSTANCE.createEReference();
				reference.setEType(eType);
				reference.setUpperBound(propertyDescriptor.isChildProperty() ? 1 : -1);
				feature = reference;
			} else {
				EAttribute attribute = EcoreFactory.eINSTANCE.createEAttribute();
				attribute.setEType(getEDataType(featureType, EcorePackage.eINSTANCE.getEClassifiers(), ePackage.getEClassifiers()));
				feature = attribute;
			}
		}
		if (feature != null) {
			feature.setName(propertyDescriptor.getId());
			if (feature.getEType() == null) {
				System.err.println("No EType for " + featureType + " (" + propertyDescriptor + ")");
			}
		}
		return feature;
	}
	
	private EDataType getEDataType(Class<?> valueType, EList<EClassifier>... eClassifierLists) {
		for (int i = 0; i < eClassifierLists.length; i++) {
			for (EClassifier valueEDataType : eClassifierLists[i]) {
				if (valueEDataType.getInstanceClass() == valueType && valueEDataType instanceof EDataType) {
					return (EDataType) valueEDataType;
				}
			}
		}
		return null;
	}

	protected EClass createASTEClass(Class<?> astClass) {
		String qName = astClass.getName(), simpleName = qName.substring(qName.lastIndexOf('.') + 1);
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(simpleName);
		return eClass;
	}
	
	public static void main(String[] args) {
		EcoreGenerator ecoreGenerator = new EcoreGenerator();
		ecoreGenerator.generate("ast");
		Resource resource = new EcoreResourceFactoryImpl().createResource(URI.createFileURI("/Users/hal/java/git/jexercise/no.hal.learning/no.hal.learning.exercise/jdt/src/no/hal/learning/exercise/jdt/ecore/ast.ecore"));
		resource.getContents().add(ecoreGenerator.ePackage);
		try {
			resource.save(null);
		} catch (IOException e) {
		}		
	}
}
