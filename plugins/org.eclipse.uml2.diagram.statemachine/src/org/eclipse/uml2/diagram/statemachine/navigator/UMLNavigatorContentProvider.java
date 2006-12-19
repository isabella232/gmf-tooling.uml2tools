package org.eclipse.uml2.diagram.statemachine.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Region2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubvertices2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;

import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class UMLNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	public void dispose() {
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) GMFEditingDomainFactory.INSTANCE.createEditingDomain();
			editingDomain.setResourceToReadOnlyMap(new HashMap() {

				public Object get(Object key) {
					if (!containsKey(key)) {
						put(key, Boolean.TRUE);
					}
					return super.get(key);
				}
			});
			ResourceSet resourceSet = editingDomain.getResourceSet();

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);

			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), StateMachineEditPart.MODEL_ID), file));
			return result.toArray();
		}

		if (parentElement instanceof UMLNavigatorGroup) {
			UMLNavigatorGroup group = (UMLNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof UMLNavigatorItem) {
			UMLNavigatorItem navigatorItem = (UMLNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case RegionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getRegion_2001ToState_3001Children(view, parentElement));
			result.addAll(getRegion_2001ToState_3012Children(view, parentElement));
			result.addAll(getRegion_2001ToFinalState_3003Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3004Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3005Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3006Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3007Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3008Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3009Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3010Children(view, parentElement));
			result.addAll(getRegion_2001ToPseudostate_3011Children(view, parentElement));
			return result.toArray();
		}
		case Pseudostate9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_2002ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_2002ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate10EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_2003ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_2003ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case StateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getState_3001ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getState_3001ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case State2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getState_3012ToRegion_3002Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getState_3012ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getState_3012ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Region2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getRegion_3002ToState_3001Children(view, parentElement));
			result.addAll(getRegion_3002ToState_3012Children(view, parentElement));
			result.addAll(getRegion_3002ToFinalState_3003Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3004Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3005Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3006Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3007Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3008Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3009Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3010Children(view, parentElement));
			result.addAll(getRegion_3002ToPseudostate_3011Children(view, parentElement));
			return result.toArray();
		}
		case FinalStateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getFinalState_3003ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getFinalState_3003ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case PseudostateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3004ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3004ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3005ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3005ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3006ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3006ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate4EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3007ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3007ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate5EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3008ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3008ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate6EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3009ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3009ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate7EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3010ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3010ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Pseudostate8EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPseudostate_3011ToTransition_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPseudostate_3011ToTransition_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case StateMachineEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getStateMachine_1000ToRegion_2001Children(view, parentElement));
			result.addAll(getStateMachine_1000ToPseudostate_2002Children(view, parentElement));
			result.addAll(getStateMachine_1000ToPseudostate_2003Children(view, parentElement));
			UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", parentElement);
			links.addChildren(getStateMachine_1000ToTransition_4001Children(view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case TransitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getTransition_4001ToPseudostate_2002OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_2003OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToState_3001OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToState_3012OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToFinalState_3003OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3004OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3005OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3006OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3007OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3008OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3009OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3010OutTarget((Edge) view, target));
			target.addChildren(getTransition_4001ToPseudostate_3011OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getTransition_4001ToPseudostate_2002InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_2003InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToState_3001InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToState_3012InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToFinalState_3003InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3004InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3005InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3006InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3007InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3008InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3009InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3010InSource((Edge) view, source));
			source.addChildren(getTransition_4001ToPseudostate_3011InSource((Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToState_3001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToState_3001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToState_3001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getFinalState_3003ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFinalState_3003ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFinalState_3003ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3008ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3006ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3006ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3006ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToState_3012Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToState_3012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToState_3012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStateMachine_1000ToTransition_4001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStateMachine_1000ToTransition_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStateMachine_1000ToTransition_4001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_2002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_2002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_2002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_2002ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_2002ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_2002ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3005ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3005ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3005ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3008ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3008ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3008ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getState_3012ToRegion_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isState_3012ToRegion_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isState_3012ToRegion_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToState_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToState_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToState_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getState_3012ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isState_3012ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isState_3012ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getState_3001ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isState_3001ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isState_3001ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToFinalState_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToFinalState_3003ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToFinalState_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToFinalState_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3011ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3011ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3011ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToState_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToState_3001ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToState_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToState_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3007ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3009ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3009ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3009ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3004ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getFinalState_3003ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isFinalState_3003ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isFinalState_3003ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToState_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToState_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToState_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3009ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3007ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3007ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3007ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_2003ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_2003ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_2003ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3004ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3004ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3004ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3010ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3010ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3010ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3011Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3011ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3011ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getState_3001ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isState_3001ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isState_3001ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToState_3012Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToState_3012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToState_3012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3008ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3008ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3008ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToFinalState_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToFinalState_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToFinalState_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3005ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3009ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3009ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3009ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getState_3012ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isState_3012ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isState_3012ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3007ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3007ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3007ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToState_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToState_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToState_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3010Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3010ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3010ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToState_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToState_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToState_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3011Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3011ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3005ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3005ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3005ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToFinalState_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToFinalState_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToFinalState_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStateMachine_1000ToPseudostate_2003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStateMachine_1000ToPseudostate_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStateMachine_1000ToPseudostate_2003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStateMachine_1000ToPseudostate_2002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStateMachine_1000ToPseudostate_2002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStateMachine_1000ToPseudostate_2002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3004ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3004ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3004ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3010Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3010ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3011ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3011ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3011ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStateMachine_1000ToRegion_2001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStateMachine_1000ToRegion_2001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStateMachine_1000ToRegion_2001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3006ToTransition_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3006ToTransition_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3006ToTransition_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_2001ToPseudostate_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3006ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_2001ToPseudostate_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_2001ToPseudostate_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getRegion_3002ToPseudostate_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isRegion_3002ToPseudostate_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isRegion_3002ToPseudostate_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_2002ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_2002ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_2002ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_3010ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_3010ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_3010ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPseudostate_2003ToTransition_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPseudostate_2003ToTransition_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPseudostate_2003ToTransition_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToPseudostate_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToPseudostate_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToPseudostate_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getTransition_4001ToFinalState_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isTransition_4001ToFinalState_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isTransition_4001ToFinalState_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getTarget();
			if (type.equals(nextEdgeSource.getType()) && !isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, String type) {
		Collection result = new ArrayList();
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, String type) {
		Collection result = new ArrayList();
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent) {
		Collection result = new ArrayList();
		createNavigatorItems(views, parent, result, false);
		return result;
	}

	/**
	 * @generated
	 */
	private void createNavigatorItems(Collection views, Object parent, Collection result, boolean isLeafs) {
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new UMLNavigatorItem((View) it.next(), parent, isLeafs));
		}
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return StateMachineEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

}
