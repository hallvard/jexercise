package no.hal.jex.jextest.validation;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.validation.UniqueClassNameValidator;

import com.google.inject.Inject;

public class UniqueClassNameExceptTestClassValidator extends UniqueClassNameValidator {
	
	@Inject
	UniqueClassNameExceptTestClassValidatorHelper validationHelper;
	
	protected void addIssue(JvmDeclaredType type, String fileName) {
		if (validationHelper.shouldAddIssue(type, fileName)) {
			super.addIssue(type, fileName);
		}
	}
}
