package no.hal.learning.exercise.jdt.ecore;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
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
		((EPackageImpl) ePackage).freeze();
	}

	protected void initEPackage(String name) {
		ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName(name);
		ePackage.setNsPrefix(name);
		ePackage.setNsURI("platform:/plugin/no.hal.learning.exercise.jdt.ecore/model/ast.ecore");
	}

	protected void initEDataTypes() {
		ePackage.getEClassifiers().add(createEDataType("EPrimitiveTypeCode", PrimitiveType.Code.class));
		ePackage.getEClassifiers().add(createEDataType("EModifierKeyword", Modifier.ModifierKeyword.class));
		ePackage.getEClassifiers().add(createEDataType("EAssignmentOperator", Assignment.Operator.class));
		ePackage.getEClassifiers().add(createEDataType("EPrefixExpressionOperator", PrefixExpression.Operator.class));
		ePackage.getEClassifiers().add(createEDataType("EInfixExpressionOperator", InfixExpression.Operator.class));
		ePackage.getEClassifiers().add(createEDataType("EPostfixExpressionOperator", PostfixExpression.Operator.class));
	}

	private Map<EClass, Class<?>> classMap;
	private Map<Class<?>, EClass> eClassMap;
	private Map<Class<?>, Collection<Class<?>>> interfaceMap;
	
	protected void generateEClasses() {
		classMap = new HashMap<EClass, Class<?>>();
		eClassMap = new HashMap<Class<?>, EClass>();
		interfaceMap = new HashMap<Class<?>, Collection<Class<?>>>();

		interfaceMap.put(IExtendedModifier.class, Arrays.<Class<?>>asList(Modifier.class, MarkerAnnotation.class, NormalAnnotation.class, SingleMemberAnnotation.class));
		interfaceMap.put(IDocElement.class, Arrays.<Class<?>>asList(MemberRef.class, MethodRef.class, Name.class, TagElement.class, TextElement.class));
		List<Class<?>> astClasses = new ArrayList<Class<?>>(getASTClasses());
		for (Class<?> interfaceClass : interfaceMap.keySet()) {
			astClasses.addAll(0, interfaceMap.get(interfaceClass));
			astClasses.add(0, interfaceClass);
		}
		for (Class<?> astClass : astClasses) {
			generateEClass(astClass);
		}
	}

	protected EClass generateEClass(Class<?> astClass) {
		EClass eClass = eClassMap.get(astClass);
		if (eClass == null) {
			eClass = createASTEClass(astClass);
			ePackage.getEClassifiers().add(eClass);
			classMap.put(eClass, astClass);
			eClassMap.put(astClass, eClass);
			Class<?> superClass = astClass.getSuperclass();
			if (superClass != null && superClass != Object.class) {
				EClass superEClass = generateEClass(superClass);
				eClass.getESuperTypes().add(superEClass);				
			}
			for (Class<?> interfaceClass : astClass.getInterfaces()) {
				EClass interfaceEClass = generateEClass(interfaceClass);
				eClass.getESuperTypes().add(interfaceEClass);				
			}
		}
		return eClass;
	}

	protected void generateFeatures() {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			Class<?> astClass = classMap.get(eClassifier);
			if (astClass != null) {
				System.out.println(eClassifier.getName() + " (" + ((EClass) eClassifier).getESuperTypes().size() + ") features");
				Collection<StructuralPropertyDescriptor> propertyDescriptors = getPropertyDescriptors(astClass);
				if (propertyDescriptors != null) {
					for (StructuralPropertyDescriptor propertyDescriptor : propertyDescriptors) {
						EStructuralFeature feature = createEStructuralFeature(propertyDescriptor);
						if (feature != null) {
							System.out.println("  " + feature.getName() + ": " + feature.getEType().getName());
							((EClass) eClassifier).getEStructuralFeatures().add(feature);
							if ("package".equals(feature.getName())) {
								System.out.println(feature.getEContainingClass());
								System.out.println(feature);
							}
						}
					}
				}
			}
		}
	}

	private Class<?>[] propertyDescriptorsParameterTypes = new Class[]{Integer.TYPE};
	private Object[] propertyDescriptorsArguments = new Object[]{AST.JLS8};

	private Collection<StructuralPropertyDescriptor> getPropertyDescriptors(Class<?> astClass) {
		try {
			Method m = astClass.getMethod("propertyDescriptors", propertyDescriptorsParameterTypes);
			if (m != null) {
				return (Collection<StructuralPropertyDescriptor>) m.invoke(null, propertyDescriptorsArguments);
			}
		} catch (Exception e) {
//			System.err.println(e);
		}
		return null;
	}
	
	protected EDataType createEDataType(String name, Class<?> valueType) {
		EDataType operatorEDataType = EcoreFactory.eINSTANCE.createEDataType();
		operatorEDataType.setName(name);
		operatorEDataType.setInstanceClass(valueType);
		return operatorEDataType;
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
				reference.setContainment(true);
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
	
	private Map<Object, EObject> eObjectMap;
	
	public EObject copyAST(ASTNode ast) {
		eObjectMap = new HashMap<Object, EObject>();
		ast.accept(new ASTVisitor() {
			@Override
			public void preVisit(ASTNode node) {
				super.preVisit(node);
				EObject eObject = EcoreUtil.create(eClassMap.get(node.getClass()));
				eObjectMap.put(node, eObject);
			}
		});
		ast.accept(new ASTVisitor() {
			@Override
			public void preVisit(ASTNode node) {
				super.preVisit(node);
				EObject eObject = eObjectMap.get(node);
				Collection<StructuralPropertyDescriptor> propertyDescriptors = getPropertyDescriptors(node.getClass());
				for (StructuralPropertyDescriptor propertyDescriptor : propertyDescriptors) {
					String propertyName = propertyDescriptor.getId();
					EStructuralFeature feature = eObject.eClass().getEStructuralFeature(propertyName);
					Object value = node.getStructuralProperty(propertyDescriptor);
					if (feature != null && value != null) {
						try {
							if (propertyDescriptor.isSimpleProperty()) {
								eObject.eSet(feature, value);
							} else if (propertyDescriptor.isChildProperty()) {
								eObject.eSet(feature, eObjectMap.get(value));
							} else if (propertyDescriptor.isChildListProperty()) {
								for (Object element : ((Iterable<?>) value)) {
									((EList<Object>) eObject.eGet(feature)).add(eObjectMap.get(element));							
								}
							}
						} catch (Exception e) {
							System.err.println(e);
						}
					}
				}
			}
		});
		return eObjectMap.get(ast);
	}
	
	public static void main(String[] args) {
		EcoreGenerator ecoreGenerator = new EcoreGenerator();
		ecoreGenerator.generate("ast");
		String folder = "/Users/hal/java/git/jexercise/no.hal.learning/no.hal.learning.exercise/jdt.ecore/model";
		save(new EcoreResourceFactoryImpl(), ecoreGenerator.ePackage, folder, "ast.ecore", null);

		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		String source =
"package main;"
+ "import java.util.*;"
+ "public class Main {"
+ 	"public static void main(String[] args) {"
+ "		System.out.println(\"Hello world\");"
+ "}"
+ "}";
		parser.setSource(source.toCharArray());
		parser.setStatementsRecovery(true);
		parser.setResolveBindings(false);

		ASTNode ast = parser.createAST(new NullProgressMonitor());
		EObject copy = ecoreGenerator.copyAST(ast);

		// OPTION_SCHEMA_LOCATION
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		save(new XMIResourceFactoryImpl(), copy, folder, "ast.xmi", options);
	}

	private static void save(Resource.Factory factory, EObject content, String folder, String filename, Map<?, ?> options) {
		Resource resource = factory.createResource(URI.createFileURI(folder + "/" + filename));
		resource.getContents().add(content);
		try {
			resource.save(options);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
