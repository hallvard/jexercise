package no.hal.emfs.ui.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.swt.dnd.DND;

import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.RelativePath;
import no.hal.emfs.sync.SyncFactory;

public class AddEmfsImportRuleCommand extends AbstractCommand implements DragAndDropFeedback {

	private final EList<ImportRule> rulesList;
	private final Collection<IResource> resources;
	
	public AddEmfsImportRuleCommand(ImportSpec importSpec, Collection<IResource> resources) {
		this.rulesList = importSpec.getRules();
		this.resources = new ArrayList<IResource>(resources);
	}

	public AddEmfsImportRuleCommand(ImportRule importRule, Collection<IResource> resources) {
		this.rulesList = importRule.getIncludes();
		this.resources = new ArrayList<IResource>(resources);
	}

	@Override
	protected boolean prepare() {
		return true;
	}
	
	private Collection<ImportRule> rules = null; 
	
	@Override
	public void execute() {
		if (rules != null) {
			rules = createRules(resources);
		}
		rulesList.addAll(rules);
	}

	public static List<ImportRule> createRules(Collection<IResource> resources) {
		List<ImportRule> rules = new ArrayList<ImportRule>();
		for (IResource resource : resources) {
			ImportRule rule = SyncFactory.eINSTANCE.createImportRule();
			RelativePath path = SyncFactory.eINSTANCE.createRelativePath();
			path.getSegments().add(resource.getFullPath().toString());
			rule.setPath(path);
			rules.add(rule);
		}
		return rules;
	}
	
	@Override
	public void undo() {
		rulesList.removeAll(rules);
	}

	@Override
	public void redo() {
		execute();
	}

	// DragAndDropFeedback

	@Override
	public boolean validate(Object owner, float location, int operations, int operation, Collection<?> collection) {
		return canExecute();
	}

	@Override
	public int getFeedback() {
		return DND.FEEDBACK_EXPAND;
	}

	@Override
	public int getOperation() {
		return DND.DROP_LINK;
	}
}
