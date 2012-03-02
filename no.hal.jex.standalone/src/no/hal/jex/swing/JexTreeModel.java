package no.hal.jex.swing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import no.hal.jex.JexPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class JexTreeModel extends EContentAdapter implements TreeModel {

	private EObject root;
	
	private List<EStructuralFeature> childFeatures = new ArrayList<EStructuralFeature>();
	
	protected JexTreeModel(Collection<? extends EStructuralFeature> childFeatures) {
		this.childFeatures.addAll(childFeatures);
	}

	public JexTreeModel(EObject root) {
		this(Arrays.asList(
			JexPackage.eINSTANCE.getAbstractRequirement_Requirements()
//			, JexPackage.eINSTANCE.getAbstractRequirement_JavaElements()
//			, JexPackage.eINSTANCE.getJavaPack_Classes()
//			, JexPackage.eINSTANCE.getJavaClass_Members()
		));
		this.root = root;
		root.eAdapters().add(this);
	}
	
	public Object getRoot() {
		return root;
	}
	
	protected boolean isFeatureFor(EStructuralFeature feature, EObject eObject) {
		return feature.getEContainingClass().isInstance(eObject);
	}

	public Object getChild(Object parent, int pos) {
		if (parent instanceof EObject) {
			EObject eObject = (EObject) parent;
			for (EStructuralFeature feature : childFeatures) {
				if (isFeatureFor(feature, eObject)) {
					Object value = eObject.eGet(feature);
					if (value instanceof List<?>) {
						List<?> list = (List<?>) value;
						if (pos < list.size()) {
							return list.get(pos);
						} else {
							pos -= list.size();
						}
					} else if (value == null) {
						// do nothing
					} else if (pos == 0) {
						return value;
					} else {
						pos--;
					}
				}
			}
		}
		return null;
	}

	public int getChildCount(Object parent) {
		int count = 0;
		if (parent instanceof EObject) {
			EObject eObject = (EObject) parent;
			for (EStructuralFeature feature : childFeatures) {
				if (isFeatureFor(feature, eObject)) {
					Object value = eObject.eGet(feature);
					if (value instanceof List<?>) {
						count += ((List<?>) value).size();
					} else if (value != null) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public int getIndexOfChild(Object parent, Object child) {
		int count = 0;
		if (parent instanceof EObject) {
			EObject eObject = (EObject) parent;
			for (EStructuralFeature feature : childFeatures) {
				if (isFeatureFor(feature, eObject)) {
					Object value = eObject.eGet(feature);
					if (value instanceof List<?>) {
						List<?> list = (List<?>) value;
						int pos = list.indexOf(child);
						if (pos >= 0) {
							return count + pos;
						} else {
							count += list.size();
						}
					} else if (value == child) {
						return count;
					} else if (value != null) {
						count++;
					}
				}
			}
		}
		return -1;
	}

	public boolean isLeaf(Object parent) {
		if (parent instanceof EObject) {
			EObject eObject = (EObject) parent;
			for (EStructuralFeature feature : childFeatures) {
				if (isFeatureFor(feature, eObject)) {
					return false;
				}
			}
		}
		return true;
	}

	private List<TreeModelListener> treeModelListeners = new ArrayList<TreeModelListener>();
	
	public void addTreeModelListener(TreeModelListener treeModelListener) {
		treeModelListeners.add(treeModelListener);
	}

	public void removeTreeModelListener(TreeModelListener treeModelListener) {
		treeModelListeners.remove(treeModelListener);
	}

	//
	
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		Object source = notification.getNotifier();
		if (source instanceof EObject) {
			fireNodesChanged((EObject) source);
		}
	}

	protected void fireNodesChanged(EObject source) {
		List<EObject> treePath = new ArrayList<EObject>();
		while (source != null) {
			treePath.add((EObject) source);
			if (source == root) {
				break;
			}
			source = ((EObject) source).eContainer();
		}
		fireNodesChanged(new TreePath(treePath.toArray(new Object[treePath.size()])));
	}

	protected void fireNodesChanged(TreePath treePath) {
		TreeModelEvent treeModelEvent = new TreeModelEvent(this, treePath);
		for (TreeModelListener listener : treeModelListeners) {
			listener.treeNodesChanged(treeModelEvent);
		}
	}

	public void valueForPathChanged(TreePath treePath, Object newValue) {
	}
}
