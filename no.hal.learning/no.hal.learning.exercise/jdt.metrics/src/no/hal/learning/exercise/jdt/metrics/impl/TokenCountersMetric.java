package no.hal.learning.exercise.jdt.metrics.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;

import no.hal.learning.exercise.jdt.metrics.AbstractASTMetricsProvider;
import no.hal.learning.fv.FeatureList;

public class TokenCountersMetric extends AbstractASTMetricsProvider {

	private boolean excludingMain = true;

	public boolean isExcludingMain() {
		return excludingMain;
	}
	
	public void setExcludingMain(boolean excludingMain) {
		this.excludingMain = excludingMain;
	}

	//
	
	private boolean counting = false;
	private Map<String, Integer> counters = null;
	
	protected String getNodeKey(Class<?> nodeClass) {
		return nodeClass.getSimpleName();
	}
	protected String getNodeKey(ASTNode node) {
		return getNodeKey(node.getClass());
	}
	
	protected void count(ASTNode node) {
		count(getNodeKey(node), getTokenCount(node));			
	}
	
	protected int getTokenCount(ASTNode node) {
		return 1;
	}
	
	protected void count(String key, int increment) {
		if (isCounting()) {
			Map<String, Integer> map = this.counters;
			Integer current = map.get(key);
			map.put(key, current != null ? current + increment : increment);
		}
	}
	protected void count(String key) {
		count(key, 1);
	}

	protected boolean isCounting() {
		return counting;
	}
	
	protected void setCounting(boolean counting) {
		this.counting = counting;
	}
	
	private boolean countingOperators = true;
	
	public boolean isCountingOperators() {
		return countingOperators;
	}
	
	public void setCountingOperators(boolean countingOperators) {
		this.countingOperators = countingOperators;
	}

	protected class TokenVisitor extends ASTVisitor {
		@Override
		public void preVisit(ASTNode node) {
			if (node instanceof BodyDeclaration) {
				setCounting(acceptDeclaration((BodyDeclaration) node));
			}
		}
		@Override
		public void postVisit(ASTNode node) {
			if (node instanceof BodyDeclaration) {
				setCounting(false);
			} else if (shouldCount(node)) {
				count(node);
			}
		}

		@Override
		public boolean visit(PrefixExpression expr) {
			if (isCountingOperators() && shouldCount(expr)) {
				count(getNodeKey(expr) + "." + expr.getOperator());
			}
			return true;
		}
		@Override
		public boolean visit(InfixExpression expr) {
			if (isCountingOperators() && shouldCount(expr)) {
				count(getNodeKey(expr) + "." + expr.getOperator());
			}
			return true;
		}
		@Override
		public boolean visit(PostfixExpression expr) {
			if (isCountingOperators() && shouldCount(expr)) {
				count(getNodeKey(expr) + "." + expr.getOperator());
			}
			return true;
		}
	}
	protected ASTVisitor createASTVisitor() {
		return new TokenVisitor();
	}

	private List<Class<? extends ASTNode>> excludeClasses = new ArrayList<Class<? extends ASTNode>>();
	
	public void excludeClass(Class<? extends ASTNode> astClass) {
		excludeClasses.add(astClass);
	}
	
	protected boolean shouldCount(ASTNode node) {
		return isCounting() && accept(node);
	}
	
	protected boolean accept(ASTNode node) {
		for (Class<? extends ASTNode> astClass : excludeClasses) {
			if (AbstractASTMetricsProvider.isIn(node, astClass)) {
				return false;
			}
		}
		return true;
	}
	
	protected boolean acceptDeclaration(BodyDeclaration declaration) {
		if (isExcludingMain() && AbstractASTMetricsProvider.isMainMethod(declaration)) {
			return false;
		}
		return true;
	}

	@Override
	protected FeatureList computeMetricsUsingAST(ASTNode ast) {
		if (this.counters == null) {
			this.counters = new HashMap<String, Integer>();
		} else {
			this.counters.clear();
		}
		ast.accept(createASTVisitor());
		return createFeatureList(counters);
	}

	private FeatureList createFeatureList(Map<String, Integer> counters) {
		FeatureList fv = createFeatureList("tokens");
		for (Map.Entry<String, Integer> counter : counters.entrySet()) {
			fv.getFeatures().put(counter.getKey(), counter.getValue().doubleValue());
		}
		return fv;
	}
}
