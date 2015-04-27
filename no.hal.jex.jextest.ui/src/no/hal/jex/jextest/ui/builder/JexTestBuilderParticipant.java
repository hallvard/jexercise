package no.hal.jex.jextest.ui.builder;

import no.hal.jex.jextest.jvmmodel.Util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.xbase.XExpression;

import com.google.inject.Inject;

public class JexTestBuilderParticipant extends BuilderParticipant {

	@Inject
	private Util util;

	@Override
	protected boolean shouldGenerate(Resource resource, IBuildContext context) {
		if (super.shouldGenerate(resource, context)) {
			return true;
		}
		// some linking errors are ok
		for (Diagnostic diagnostic : resource.getErrors()) {
			EObject problemObject = util.getProblemObject(diagnostic, resource);
			if (! (problemObject instanceof XExpression)) {
				return false;
			}
		}
		return true;
	}
}
