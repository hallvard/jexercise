package no.hal.jex.jextest.jvmmodel;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

import com.google.inject.Inject;

public class JexTestCompiler extends XbaseCompiler {
	
	@Inject
	private Util util;

	public ITreeAppendable compile(XExpression expr, ITreeAppendable parentAppendable, @Nullable JvmTypeReference expectedReturnType, @Nullable Set<JvmTypeReference> declaredExceptions) {
		if (util.hasDiagnostic(expr)) {
			parentAppendable.newLine();
			util.generateUnsupportedOperationException(expr, parentAppendable);
		} else {
			try {
				return super.compile(expr, parentAppendable, expectedReturnType, declaredExceptions);
			} catch (RuntimeException re) {
				util.generateUnsupportedOperationException(expr, parentAppendable);
			}
		}
		return parentAppendable;
	}
}
