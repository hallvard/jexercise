package no.hal.learning.sharing.emfs;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import no.hal.emfs.sync.PortSpec;
import no.hal.learning.sharing.ui.views.util.TreeEObjectUIAdapter;

public class EmfsEObjectUIAdapter extends TreeEObjectUIAdapter<PortSpec<?>> {

	public EmfsEObjectUIAdapter(PortSpec<?> spec) {
		super(spec);
	}
	
	@Override
	public void updateModel() {
	}

	@Override
	public void updateView() {
		Collection<EObject> viewObjects = new ArrayList<EObject>();
//		viewObjects.add(eObject);
		viewObjects.addAll(eObject.getResources());
		viewObjects.addAll(eObject.getResourceRefs());
		setInput(viewObjects);
	}
}
