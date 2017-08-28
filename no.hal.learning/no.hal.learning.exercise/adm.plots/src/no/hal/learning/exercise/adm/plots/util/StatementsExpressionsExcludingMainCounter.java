package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.Statement;

public class StatementsExpressionsExcludingMainCounter extends TokenCountCodeMetric {

	@Override
	protected boolean acceptDeclaration(BodyDeclaration declaration) {
		if (isMainMethod(declaration)) {
			return false;
		}
		return true;
	}

	@Override
	protected int countTokens(ASTNode node) {
		if (node instanceof Statement || node instanceof Expression) {
			return 1;
		}
		return 0;
	}
}
