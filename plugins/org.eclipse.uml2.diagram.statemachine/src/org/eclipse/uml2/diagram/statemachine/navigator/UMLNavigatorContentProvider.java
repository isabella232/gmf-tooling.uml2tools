package org.eclipse.uml2.diagram.statemachine.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
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
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReference2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
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
import org.eclipse.uml2.diagram.statemachine.edit.parts.State3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart;
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
	public void init(ICommonContentExtensionSite aConfig) {
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

			org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = resourceSet.getResource(fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), StateMachineEditPart.MODEL_ID), file, false));
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

		case StateMachineEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StateMachine2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case StateMachine2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case RegionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubverticesEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case StateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(RegionSubvertices2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case State3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Region2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConnectionPointReferenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConnectionPointReference2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ConnectionPointReferenceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ConnectionPointReference2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case FinalStateEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Pseudostate9EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
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
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TransitionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			Collection connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConnectionPointReferenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConnectionPointReference2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(State2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(State3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConnectionPointReferenceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConnectionPointReference2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(FinalStateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PseudostateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate6EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate7EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate8EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate9EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Pseudostate10EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
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
	private Collection getLinksSourceByType(Collection edges, String type) {
		Collection result = new ArrayList();
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
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
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
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
	private boolean isOwnView(View view) {
		return StateMachineEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent, boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result.add(new UMLNavigatorItem((View) it.next(), parent, isLeafs));
		}
		return result;
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

}
