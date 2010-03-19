package org.eclipse.uml2.diagram.common.async;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IDiagramUpdater;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;

public class SyncModelNode implements IAdaptable {

	private final SyncModelContext myContext;

	private View mySyncModelView;

	private List<SyncModelNode> myChildren;

	private SyncModelNode myParent;

	private View mySyncModelCompartment;

	private View myDiagramView;

	private boolean myIsAutoSynchronized;

	private boolean myIsChecked;

	public SyncModelNode(View syncModelRoot, View diagramRoot, SyncModelContext context) {
		this(syncModelRoot, (SyncModelNode) null, context);
		if (syncModelRoot == null) {
			throw new NullPointerException();
		}
		if (diagramRoot != null) {
			if (diagramRoot.getElement() == null) {
				throw new IllegalArgumentException("Diagram root should have an semantic element"); //$NON-NLS-1$
			}
			if (!diagramRoot.getElement().equals(syncModelRoot.getElement())) {
				throw new IllegalArgumentException("Diagram root element : " + diagramRoot.getElement() + ", while SyncModel root element: " + syncModelRoot.getElement()); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		initWithDiagramView(diagramRoot);
	}

	protected SyncModelNode(View syncModelView, SyncModelNode parent) {
		this(syncModelView, parent, parent.getContext());
	}

	private SyncModelNode(View syncModelView, SyncModelNode parent, SyncModelContext context) {
		mySyncModelView = syncModelView;
		myParent = parent;
		if (myParent != null) {
			myParent.addChild(this);
		}
		myContext = context;
	}

	public boolean isRoot() {
		return getParent() == null;
	}

	public void setChecked(boolean isChecked) {
		myIsChecked = isChecked;
	}

	public boolean isChecked() {
		return myIsChecked;
	}

	public View getSyncModelView() {
		return mySyncModelView;
	}

	public View getDiagramView() {
		return myDiagramView;
	}

	public boolean isKnownLeaf() {
		int visualID = getContext().getRegistry().getVisualID(mySyncModelView);
		return getContext().getRegistry().isSemanticLeafVisualID(visualID);
	}

	public boolean isInCompartment() {
		return mySyncModelCompartment != null;
	}

	public View getSyncModelCompartment() {
		return mySyncModelCompartment;
	}

	public boolean isAutoSynchronized() {
		return myIsAutoSynchronized;
	}

	public void setAutoSynchronized(boolean isAutoSynchronized) {
		myIsAutoSynchronized = isAutoSynchronized;
	}

	public List<SyncModelNode> getChildren() {
		if (myChildren == null) {
			myChildren = new LinkedList<SyncModelNode>();
			createSyncModelChildren();
			if (myChildren.isEmpty()) {
				myChildren = Collections.emptyList();
			}
		}
		return myChildren;
	}

	public SyncModelNode getParent() {
		return myParent;
	}

	private void setCompartment(View compartment) {
		mySyncModelCompartment = compartment;
	}

	public SyncModelContext getContext() {
		return myContext;
	}

	private IDiagramUpdater getUpdater() {
		return myContext.getUpdater();
	}

	private PreferencesHint getPreferencesHint() {
		return myContext.getPreferencesHint();
	}

	private void addChild(SyncModelNode child) {
		myChildren.add(child);
	}

	private void createSyncModelChildren() {
		myContext.runCommand(new Runnable() {

			public void run() {
				doCreateSyncModelChildren();
			}
		});
	}

	private void doCreateSyncModelChildren() {
		List<View> directChildren = createChildViews(mySyncModelView, myDiagramView);
		for (View nextDirect : directChildren) {
			SyncModelNode child = doCreateNodeView(nextDirect, this);
			View diagramCounterpart = findCounterpart(nextDirect, myDiagramView);
			child.initWithDiagramView(diagramCounterpart);
		}

		for (Object next : mySyncModelView.getChildren()) {
			View nextSyncCompartment = (View) next;
			if (isCompartment(nextSyncCompartment)) {
				View diagramCompartment = findCounterpart(nextSyncCompartment, myDiagramView);
				List<View> syncCompartmentChildren = createChildViews(nextSyncCompartment, diagramCompartment);
				for (View nextCompartmentChild : syncCompartmentChildren) {
					SyncModelNode nextResult = doCreateNodeView(nextCompartmentChild, this);
					nextResult.setCompartment(nextSyncCompartment);
					View diagramCounterpart = findCounterpart(nextCompartmentChild, diagramCompartment);
					nextResult.initWithDiagramView(diagramCounterpart);
				}
			}
		}
	}

	protected SyncModelNode doCreateNodeView(View syncModelView, SyncModelNode parent) {
		return new SyncModelNode(syncModelView, parent);
	}

	private boolean isCompartment(View view) {
		IVisualIDRegistry registry = getContext().getRegistry();
		int visualId = registry.getVisualID(view);
		return registry.isCompartmentVisualID(visualId);
	}

	private List<View> createChildViews(View syncModelParent, View diagramViewParent) {
		List<?> descriptors = getUpdater().getSemanticChildren(syncModelParent);
		List<View> result = new LinkedList<View>();
		for (Object next : descriptors) {
			IUpdaterNodeDescriptor nextDescriptor = (IUpdaterNodeDescriptor) next;
			EObject nextSemanticChild = nextDescriptor.getModelElement();

			View nextView = null;

			if (diagramViewParent != null) {
				List<?> children = diagramViewParent.getChildren();
				boolean found = false;
				for (Iterator<?> iter = children.iterator(); !found && iter.hasNext();) {
					View nextDiagramChild = (View) iter.next();
					if (nextDiagramChild.getElement() != null && //
							nextDiagramChild.getElement().equals(nextSemanticChild)) {
						nextView = ViewService.createNode(syncModelParent,//
								nextSemanticChild, nextDiagramChild.getType(), getPreferencesHint());
						found = true;
					}
				}
			}

			if (nextView == null) {
				nextView = ViewService.getInstance().createView(Node.class, // 
						new EObjectAdapter(nextSemanticChild), syncModelParent, null, //
						ViewUtil.APPEND, true, getPreferencesHint());
			}

			if (nextView != null) {
				result.add(nextView);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {
		if (adapter.equals(View.class)) {
			return mySyncModelView;
		}
		if (adapter.isInstance(this)) {
			return this;
		}
		return null;
	}

	public static View findCounterpart(View syncChild, View diagramParent) {
		if (diagramParent == null) {
			return null;
		}
		for (Object nextChild : diagramParent.getChildren()) {
			View nextDiagramChild = (View) nextChild;
			if (isCounterparts(syncChild, nextDiagramChild)) {
				return nextDiagramChild;
			}
		}
		return null;
	}

	public static boolean isCounterparts(View syncView, View diagramView) {
		if (syncView.getType() == null || diagramView.getType() == null) {
			return false;
		}
		if (!syncView.getType().equals(diagramView.getType())) {
			return false;
		}
		if (syncView.getElement() == null) {
			//compartment
			return diagramView.getElement() == null;
		}
		return syncView.getElement().equals(diagramView.getElement());
	}

	public void applyCanonicalStyle() {
		checkHasDiagramView();
		applyCanonicalStyle(getDiagramView());
	}

	private void applyCanonicalStyle(View view) {
		if (isKnownLeaf()) {
			return;
		}
		doApplyCanonicalStyle(view);

		for (Object nextChild : view.getChildren()) {
			View nextChildView = (View) nextChild;
			if (isCompartment(nextChildView)) {
				doApplyCanonicalStyle(nextChildView);
			}
		}
	}

	private void doApplyCanonicalStyle(View target) {
		ICanonicalHelper.IMPLEMENTATION.setAutoSynchronized(target, isAutoSynchronized());
	}

	protected void initWithDiagramView(View diagramView) {
		myDiagramView = diagramView;
		if (myDiagramView != null) {
			setChecked(true);
			myIsAutoSynchronized = ICanonicalHelper.IMPLEMENTATION.isAutoSynchronized(myDiagramView);
		} else {
			myIsAutoSynchronized = getContext().isDiagramInitialization();
			setChecked(getContext().isDiagramInitialization());
		}

		if (isKnownLeaf()) {
			myIsAutoSynchronized = false;
		}
	}

	private void checkHasDiagramView() {
		if (getDiagramView() == null) {
			throw new IllegalStateException("I am not associated with diagram view:" + getSyncModelView()); //$NON-NLS-1$
		}
	}

	/*package*/void associateWithDiagramView(View diagramView) {
		myDiagramView = diagramView;
	}

	/*package*/void setChosenSyncModelViewType(String type) {
		if (type == null || mySyncModelView.getType().equals(type)) {
			return;
		}

		myParent.setChildTypeHint(this, type);
	}

	private void forseChildrenRecreation() {
		myChildren = null;
		getChildren();
	}

	private void correctChildrenStatus(NodeInfo nodeInfo) {
		List<SyncModelNode> newChildren = getChildren();
		for (SyncModelNode newChild : newChildren) {
			boolean found = false;
			for (NodeInfo oldChild : nodeInfo.getChildren()) {
				if (newChild.getSyncModelView().getElement().equals(oldChild.getSemanticElement())) {
					newChild.setAutoSynchronized(oldChild.isAutoSynchronized());
					newChild.setChecked(oldChild.isChecked());
					newChild.correctChildrenStatus(oldChild);
					found = true;
				}
			}
			if (!found) {
				newChild.setAutoSynchronized(false);
				newChild.setChecked(false);
			}
		}
	}

	private void setChildTypeHint(final SyncModelNode childNode, final String type) {
		final NodeInfo nodeInfo = collectNodeInfo(childNode);
		final EObject semanticElement = childNode.getSyncModelView().getElement();
		ViewUtil.destroy(childNode.getSyncModelView());

		myContext.runCommand(new Runnable() {

			public void run() {
				try {
					childNode.mySyncModelView = ViewService.createNode(mySyncModelView, semanticElement, type, getPreferencesHint());
					childNode.forseChildrenRecreation();
					childNode.correctChildrenStatus(nodeInfo);
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		});
	}

	private NodeInfo collectNodeInfo(SyncModelNode node) {
		NodeInfo result = new NodeInfo(node.mySyncModelView.getElement(), node.isChecked(), node.isAutoSynchronized(), new LinkedList<NodeInfo>());
		for (SyncModelNode child : node.getChildren()) {
			NodeInfo childNodeInfo = collectNodeInfo(child);
			result.getChildren().add(childNodeInfo);
		}
		return result;
	}

	private static class NodeInfo {

		private final EObject mySemanticElement;

		private final boolean myIsChecked;

		private final boolean myIsAutoSynchronized;

		private final List<NodeInfo> myChildren;

		public NodeInfo(EObject mySemanticElement, boolean isChecked, boolean isAutoSynchronized, List<NodeInfo> myChildren) {
			super();
			this.mySemanticElement = mySemanticElement;
			this.myIsChecked = isChecked;
			this.myIsAutoSynchronized = isAutoSynchronized;
			this.myChildren = myChildren;
		}

		public EObject getSemanticElement() {
			return mySemanticElement;
		}

		public boolean isChecked() {
			return myIsChecked;
		}

		public boolean isAutoSynchronized() {
			return myIsAutoSynchronized;
		}

		public List<NodeInfo> getChildren() {
			return myChildren;
		}
	}
}
