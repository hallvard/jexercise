package no.hal.jex.jextest.ui.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.validation.ProjectAwareUniqueClassNameValidator;

import com.google.inject.Inject;

import no.hal.jex.jextest.jexTest.TestedClass;
import no.hal.jex.jextest.validation.UniqueClassNameExceptTestClassValidatorHelper;

public class ProjectAwareUniqueClassNameExceptTestClassValidator extends ProjectAwareUniqueClassNameValidator {
	
	@Inject
	UniqueClassNameExceptTestClassValidatorHelper validationHelper;
	
	protected void addIssue(JvmDeclaredType type, String fileName) {
		if (validationHelper.shouldAddIssue(type, fileName)) {
			super.addIssue(type, fileName);
		}
	}
}
