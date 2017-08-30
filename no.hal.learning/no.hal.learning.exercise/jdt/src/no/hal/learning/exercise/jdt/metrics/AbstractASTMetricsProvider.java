package no.hal.learning.exercise.jdt.metrics;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;

import no.hal.learning.exercise.jdt.Activator;
import no.hal.learning.fv.FeatureValued;

public abstract class AbstractASTMetricsProvider extends AbstractMetricsProvider {

	private ASTParser parser;

	@Override
	public FeatureValued computeMetrics(String source) {
		if (parser == null) {
			parser = createParser(source, null);
		}
		ASTNode ast = parser.createAST(new NullProgressMonitor());
		return computeMetricsUsingAST(ast);
	}

	protected static ASTParser createParser(String source, ICompilationUnit cu) {
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		if (cu != null) {
			parser.setSource(cu);
		} else {
			parser.setSource(source.toCharArray());
		}
		parser.setStatementsRecovery(true);
		parser.setResolveBindings(true);
		return parser;
	}
	
	protected abstract FeatureValued computeMetricsUsingAST(ASTNode ast);

	//

	public static void addASTMetrics(ICompilationUnit cu, EMap<String, FeatureValued> featuresMap) {
		addASTMetrics(getFileContents((IFile) cu.getResource()), cu, featuresMap);
	}

	public static void addASTMetrics(String source, ICompilationUnit cu, EMap<String, FeatureValued> featuresMap) {
		ASTNode ast = null;
		for (String metricsName : Activator.getInstance().getMetricsProviderNames()) {
			FeatureValued metricsFeatures = null;
			IMetricsProvider metricsProvider = Activator.getInstance().getMetricsProvider(metricsName);
			if (ast == null && (metricsProvider instanceof AbstractASTMetricsProvider || source == null)) {
				ast = createParser(source, cu).createAST(new NullProgressMonitor());
			}
			if (metricsProvider instanceof AbstractASTMetricsProvider) {
				metricsFeatures = ((AbstractASTMetricsProvider) metricsProvider).computeMetricsUsingAST(ast);
			}
			if (metricsFeatures == null) {
				if (source == null) {
					source = ast.toString();
				}
				metricsFeatures = metricsProvider.computeMetrics(source);
			}
			if (metricsFeatures != null) {
				featuresMap.put(metricsName, metricsFeatures);
			}
		}
	}

	public static boolean isIn(ASTNode node, Class<? extends ASTNode> astClass) {
		while (node != null) {
			if (astClass.isInstance(node)) {
				return true;
			}
			node = node.getParent();
		}
		return false;
	}
	
	public static boolean hasModifiers(BodyDeclaration declaration, int... modifiers) {
		for (int i = 0; i < modifiers.length; i++) {
			if ((declaration.getModifiers() & modifiers[i]) == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isMainMethod(BodyDeclaration declaration) {
		if (hasModifiers(declaration, Modifier.PUBLIC, Modifier.STATIC)) {
			if (declaration instanceof MethodDeclaration) {
				MethodDeclaration methodDeclaration = (MethodDeclaration) declaration;
				if ("main".equals(methodDeclaration.getName().getIdentifier())) {
					if (isType(methodDeclaration.getReturnType2(), PrimitiveType.VOID)) {
						List<?> parameters = methodDeclaration.parameters();
						if (parameters.size() == 1) {
							SingleVariableDeclaration param = (SingleVariableDeclaration) parameters.get(0);
							Type type = param.getType();
							if (type.isArrayType()) {
								ArrayType arrayType = (ArrayType) type;
								if (arrayType.getDimensions() == 1 && isJavaLangType(arrayType.getElementType(), "String")) {
									return true;							
								}
							} else if (param.getExtraDimensions() == 1 && isJavaLangType(type, "String")) {
								return true;							
							}
						}
					}
				}
			}
		}
		return false;
	}

	public static boolean isType(Type type, PrimitiveType.Code primitiveType) {
		if (type.isPrimitiveType()) {
			if (((PrimitiveType) type).getPrimitiveTypeCode() == primitiveType) {
				return true;							
			}
		}
		return false;
	}

	public static boolean isJavaLangType(Type type, String expectedName) {
		if (type.isSimpleType()) {
			String typeName = ((SimpleType) type).getName().getFullyQualifiedName();
			if (typeName.equals(expectedName) || typeName.equals("java.lang." + expectedName)) {
				return true;							
			}
		}
		return false;
	}

}
