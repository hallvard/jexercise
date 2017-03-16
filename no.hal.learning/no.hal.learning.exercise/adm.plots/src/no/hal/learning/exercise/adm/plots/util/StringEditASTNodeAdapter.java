package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;

import no.hal.learning.exercise.AbstractStringEditEvent;

public class StringEditASTNodeAdapter extends StringEditAdapter<ASTNode> {

	public StringEditASTNodeAdapter() {
		super(ASTNode.class);
	}

	@Override
	public ASTNode getStringEditAdapter(AbstractStringEditEvent editEvent) {
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setSource(editEvent.getString().toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		return parser.createAST(null);
	}
}
