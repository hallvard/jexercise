package no.hal.emfs.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import no.hal.emfs.xtext.services.XemfsGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractXemfsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XemfsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EmfsContainer_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_EmfsRoot_EmfsKeyword_1_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XemfsGrammarAccess) access;
		match_EmfsContainer_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getEmfsContainerAccess().getSemicolonKeyword_5());
		match_EmfsRoot_EmfsKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getEmfsRootAccess().getEmfsKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_EmfsContainer_SemicolonKeyword_5_q.equals(syntax))
				emit_EmfsContainer_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EmfsRoot_EmfsKeyword_1_0_q.equals(syntax))
				emit_EmfsRoot_EmfsKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_EmfsContainer_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'emfs'?
	 */
	protected void emit_EmfsRoot_EmfsKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
