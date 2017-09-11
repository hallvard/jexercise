package no.hal.learning.exercise.jdt.metrics.impl;

import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.InfixExpression;

import no.hal.learning.fv.FeatureList;

public class ConditionalCountersMetric extends TokenCountersMetric {

	public ConditionalCountersMetric() {
		setCountingOperators(false);
	}
	
	@Override
	protected FeatureList computeMetricsUsingAST(ASTNode ast) {
		FeatureList fl = super.computeMetricsUsingAST(ast);
		double sum = 0.0;
		for (Map.Entry<String, Double> entry: fl.getFeatures()) {
			sum += entry.getValue();
		}
		fl.getFeatures().put("conditionalCount", sum);
		return fl;
	}

	private boolean includingCatchClauses = false;
	private boolean includingBreakContinue = false;
	
	public boolean isIncludingBreakContinue() {
		return includingBreakContinue;
	}
	public void setIncludingBreakContinue(boolean includingBreakContinue) {
		this.includingBreakContinue = includingBreakContinue;
	}
	
	public boolean isIncludingCatchClauses() {
		return includingCatchClauses;
	}
	public void setIncludingCatchClauses(boolean includingCatchClauses) {
		this.includingCatchClauses = includingCatchClauses;
	}

	@Override
	protected boolean accept(ASTNode node) {
		switch (node.getNodeType()) {
		case ASTNode.IF_STATEMENT:
		case ASTNode.WHILE_STATEMENT:
		case ASTNode.FOR_STATEMENT:
		case ASTNode.ENHANCED_FOR_STATEMENT:
		case ASTNode.CAST_EXPRESSION:
		case ASTNode.CONDITIONAL_EXPRESSION:
			return true;
		case ASTNode.BREAK_STATEMENT:
		case ASTNode.CONTINUE_STATEMENT:
			return isIncludingCatchClauses();
		case ASTNode.CATCH_CLAUSE:
			return isIncludingCatchClauses();
		case ASTNode.INFIX_EXPRESSION: {
			InfixExpression.Operator op = ((InfixExpression) node).getOperator();
			return op == InfixExpression.Operator.CONDITIONAL_OR || op == InfixExpression.Operator.CONDITIONAL_AND;
		}
		}
		return false;
	}
}
