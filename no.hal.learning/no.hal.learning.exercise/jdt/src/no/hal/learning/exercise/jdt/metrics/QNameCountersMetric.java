package no.hal.learning.exercise.jdt.metrics;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleName;

public class QNameCountersMetric extends TokenCountersMetric {
	
	public QNameCountersMetric() {
		setCountingOperators(false);
	}
	
	protected void count(ASTNode node) {
	}

	protected class QNameVisitor extends TokenVisitor {

		@Override
		public boolean visit(PrimitiveType node) {
			if (isCounting() && accept(node)) {
				count(node.getPrimitiveTypeCode().toString());
			}
			return super.visit(node);
		}

		@Override
		public boolean visit(SimpleName node) {
			if (isCounting() && accept(node)) {
				IBinding binding = node.resolveBinding();
				String name = getBindingName(binding);
				if (name != null && name.startsWith("java.")) {
					count(name);
				}
			}
			return super.visit(node);
		}
	}
	@Override
	protected ASTVisitor createASTVisitor() {
		return new QNameVisitor();
	}

	private String getBindingName(IBinding binding) {
		if (binding != null) {
			switch (binding.getKind()) {
			case IBinding.VARIABLE:
				return getBindingName(((IVariableBinding) binding).getDeclaringClass()) + "." + binding.getName(); 
			case IBinding.METHOD:
				return getBindingName(((IMethodBinding) binding).getDeclaringClass()) + "." + binding.getName() + "()";
			case IBinding.TYPE:
				return getBindingName((ITypeBinding) binding);
			default:
				break;
			}
		}
		return null;
	}
	private String getBindingName(ITypeBinding typeBinding) {
		String typeName = null;
		if (typeBinding != null) {
			typeName = typeBinding.getQualifiedName();
			int pos = typeName.indexOf('<');
			if (pos > 0) {
				typeName = typeName.substring(0, pos);
			}
		}
		return typeName;
	}
}
