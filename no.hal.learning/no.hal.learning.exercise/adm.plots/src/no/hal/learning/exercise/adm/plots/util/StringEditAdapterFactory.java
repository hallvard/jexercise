package no.hal.learning.exercise.adm.plots.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.jdt.core.dom.ASTNode;

import difflib.Patch;

public class StringEditAdapterFactory extends AdapterFactoryImpl {
	
	public static StringEditAdapterFactory INSTANCE = new StringEditAdapterFactory();
	
	@Override
	public boolean isFactoryForType(Object type) {
		if (type == ASTNode.class || type == Patch.class) {
			return true;
		}
		return super.isFactoryForType(type);
	}

	@Override
	protected Adapter createAdapter(Notifier target, Object type) {
		if (type == ASTNode.class) {
			return new StringEditASTNodeAdapter();
		} else if (type == Patch.class) {
			return new StringEditPatchAdapter();
		}
		return null;
	}
}
