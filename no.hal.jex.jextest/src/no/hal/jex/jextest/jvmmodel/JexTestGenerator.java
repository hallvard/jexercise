package no.hal.jex.jextest.jvmmodel;

import no.hal.jex.jextest.jexTest.TestedClass;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.inject.Inject;

public class JexTestGenerator extends JvmModelGenerator {

	@Inject
	private IJvmModelAssociations associations;
	
	@Override
	public void _internalDoGenerate(JvmDeclaredType type, IFileSystemAccess fsa) {
		if (! (associations.getPrimarySourceElement(type) instanceof TestedClass)) {
			super._internalDoGenerate(type, fsa);
		}
	}
}
