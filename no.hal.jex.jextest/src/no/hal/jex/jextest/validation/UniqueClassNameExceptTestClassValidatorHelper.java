package no.hal.jex.jextest.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.inject.Inject;

import no.hal.jex.jextest.jexTest.TestedClass;

public class UniqueClassNameExceptTestClassValidatorHelper {
	
	@Inject IJvmModelAssociations associations;
	
	public boolean shouldAddIssue(JvmDeclaredType type, String fileName) {
		EObject sourceElement = associations.getPrimarySourceElement(type);
//		System.out.println(associations.getSourceElements(type));
		return ! (sourceElement instanceof TestedClass);
	}
}
