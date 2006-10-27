package org.eclipse.uml2.diagram.component.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.Viewer;

import org.eclipse.ui.IMemento;

import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

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
		if (parentElement instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) parentElement;
			if (!PackageEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
				return EMPTY_ARRAY;
			}

			if (abstractNavigatorItem instanceof UMLNavigatorItem) {
				UMLNavigatorItem navigatorItem = (UMLNavigatorItem) abstractNavigatorItem;
				switch (navigatorItem.getVisualID()) {
				case ComponentEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					return result.toArray();
				}
				case Interface2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID), false, incominglinks));
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Class2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					return result.toArray();
				}
				case Component2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					return result.toArray();
				}
				case PortEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID), true, outgoinglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					return result.toArray();
				}
				case ClassEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					return result.toArray();
				}
				case InterfaceEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID), false, incominglinks));
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PackageEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Artifact2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID), links));
					if (!links.isEmpty()) {
						result.add(links);
					}
					return result.toArray();
				}
				case InterfaceRealizationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case PortProvidedEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case PortRequiredEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				}
			} else if (abstractNavigatorItem instanceof UMLNavigatorGroup) {
				UMLNavigatorGroup group = (UMLNavigatorGroup) parentElement;
				return group.getChildren();
			}
		} else if (parentElement instanceof IFile) {
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

			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString());
			Resource resource = resourceSet.getResource(fileURI, true);

			Collection result = new ArrayList();
			result.addAll(getViewByType(resource.getContents(), PackageEditPart.MODEL_ID, file));
			return result.toArray();
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem abstractNavigatorItem = (UMLAbstractNavigatorItem) element;
			if (!PackageEditPart.MODEL_ID.equals(abstractNavigatorItem.getModelID())) {
				return null;
			}
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
	private Collection getViewByType(Collection childViews, String type, Object parent) {
		Collection result = new ArrayList();
		for (Iterator it = childViews.iterator(); it.hasNext();) {
			Object next = it.next();
			if (false == next instanceof View) {
				continue;
			}
			View nextView = (View) next;
			if (type.equals(nextView.getType())) {
				result.add(new UMLNavigatorItem(nextView, parent));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildByType(Collection childViews, String type, Object parent) {
		Collection result = new ArrayList();
		List children = new ArrayList(childViews);
		for (int i = 0; i < children.size(); i++) {
			if (false == children.get(i) instanceof View) {
				continue;
			}
			View nextChild = (View) children.get(i);
			if (type.equals(nextChild.getType())) {
				result.add(new UMLNavigatorItem(nextChild, parent));
			} else if (!stopGettingChildren(nextChild, type)) {
				children.addAll(nextChild.getChildren());
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean stopGettingChildren(View child, String type) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getConnectedViews(View rootView, String type, boolean isOutTarget, Object parent) {
		Collection result = new ArrayList();
		List connectedViews = new ArrayList();
		connectedViews.add(rootView);
		Set visitedViews = new HashSet();
		for (int i = 0; i < connectedViews.size(); i++) {
			View nextView = (View) connectedViews.get(i);
			if (visitedViews.contains(nextView)) {
				continue;
			}
			visitedViews.add(nextView);
			if (type.equals(nextView.getType()) && nextView != rootView) {
				result.add(new UMLNavigatorItem(nextView, parent));
			} else {
				if (isOutTarget && !stopGettingOutTarget(nextView, rootView, type)) {
					connectedViews.addAll(nextView.getSourceEdges());
					if (nextView instanceof Edge) {
						connectedViews.add(((Edge) nextView).getTarget());
					}
				}
				if (!isOutTarget && !stopGettingInSource(nextView, rootView, type)) {
					connectedViews.addAll(nextView.getTargetEdges());
					if (nextView instanceof Edge) {
						connectedViews.add(((Edge) nextView).getSource());
					}
				}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean stopGettingInSource(View nextView, View rootView, String type) {
		return !isOneHopConnection(nextView, rootView);
	}

	/**
	 * @generated
	 */
	private boolean stopGettingOutTarget(View nextView, View rootView, String type) {
		return !isOneHopConnection(nextView, rootView);
	}

	/**
	 * @generated
	 */
	private boolean isOneHopConnection(View targetView, View sourceView) {
		if (sourceView == targetView) {
			return true;
		}
		if (sourceView instanceof Node) {
			return targetView instanceof Edge;
		}
		if (sourceView instanceof Edge) {
			return targetView instanceof Node;
		}
		return false;
	}

}
