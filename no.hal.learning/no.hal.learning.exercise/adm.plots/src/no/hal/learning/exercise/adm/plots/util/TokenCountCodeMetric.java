package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.PrimitiveType;

import no.hal.learning.exercise.AbstractStringEditEvent;

public class TokenCountCodeMetric extends LastCodeMetric {

	private boolean counting = false;
	
	@Override
	public int measure(AbstractStringEditEvent editEvent) {
		StringEditAdapter<ASTNode> adapter = (StringEditAdapter<ASTNode>) StringEditAdapterFactory.INSTANCE.adapt(editEvent, ASTNode.class);
		ASTNode astNode = adapter.getStringEditAdapter();
		final int tokenCounters[] = { 0 };
		astNode.accept(new ASTVisitor() {
			@Override
			public void preVisit(ASTNode node) {
				if (node instanceof BodyDeclaration) {
					counting = acceptDeclaration((BodyDeclaration) node);
				}
			}
			@Override
			public void postVisit(ASTNode node) {
				if (node instanceof BodyDeclaration) {
					counting = false;
				} else if (counting) {
					int tokenCount = countTokens(node);
					tokenCounters[0] += tokenCount;
				}
			}
		});
		return tokenCounters[0];
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
				String simpleName = methodDeclaration.getName().getIdentifier();
				if ("main".equals(simpleName)) {
					if (methodDeclaration.getReturnType2() instanceof PrimitiveType && ((PrimitiveType) methodDeclaration.getReturnType2()).getPrimitiveTypeCode() == PrimitiveType.VOID) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	protected boolean acceptDeclaration(BodyDeclaration declaration) {
		return true;
	}

	protected int countTokens(ASTNode node) {
		return 1;
	}
}
