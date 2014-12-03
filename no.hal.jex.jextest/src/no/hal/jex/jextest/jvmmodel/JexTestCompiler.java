package no.hal.jex.jextest.jvmmodel;

import java.util.Set;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

import com.google.inject.Inject;

public class JexTestCompiler extends XbaseCompiler {
	
	@Inject
	private Util util;

	@Override
	public ITreeAppendable compile(XExpression expr, ITreeAppendable parentAppendable, JvmTypeReference expectedReturnType, Set<JvmTypeReference> declaredExceptions) {
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
