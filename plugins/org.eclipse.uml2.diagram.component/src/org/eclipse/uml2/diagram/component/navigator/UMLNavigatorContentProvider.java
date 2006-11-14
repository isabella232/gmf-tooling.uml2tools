package org.eclipse.uml2.diagram.component.navigator;

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

import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
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
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), PackageEditPart.MODEL_ID), file));
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
		case ComponentEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getComponent_2001ToComponent_3001Children(view, parentElement));
			result.addAll(getComponent_2001ToPort_3002Children(view, parentElement));
			result.addAll(getComponent_2001ToArtifact_3003Children(view, parentElement));
			result.addAll(getComponent_2001ToClass_3004Children(view, parentElement));
			result.addAll(getComponent_2001ToInterface_3005Children(view, parentElement));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getComponent_2001ToInterfaceRealization_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case Interface2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInterface_2003ToInterfaceRealization_4001InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2003ToPortProvided_4006InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2003ToPortRequired_4004InSource(view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Class2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getClass_2004ToPort_3002Children(view, parentElement));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getClass_2004ToInterfaceRealization_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case Component2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getComponent_3001ToComponent_3001Children(view, parentElement));
			result.addAll(getComponent_3001ToPort_3002Children(view, parentElement));
			result.addAll(getComponent_3001ToArtifact_3003Children(view, parentElement));
			result.addAll(getComponent_3001ToClass_3004Children(view, parentElement));
			result.addAll(getComponent_3001ToInterface_3005Children(view, parentElement));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getComponent_3001ToInterfaceRealization_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case PortEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPort_3002ToPortProvided_4006OutTarget(view, outgoinglinks));
			outgoinglinks.addChildren(getPort_3002ToPortRequired_4004OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case ClassEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getClass_3004ToPort_3002Children(view, parentElement));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getClass_3004ToInterfaceRealization_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		case InterfaceEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInterface_3005ToInterfaceRealization_4001InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_3005ToPortProvided_4006InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_3005ToPortRequired_4004InSource(view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case PackageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getPackage_1000ToComponent_2001Children(view, parentElement));
			result.addAll(getPackage_1000ToArtifact_2002Children(view, parentElement));
			result.addAll(getPackage_1000ToInterface_2003Children(view, parentElement));
			result.addAll(getPackage_1000ToClass_2004Children(view, parentElement));
			UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", parentElement);
			links.addChildren(getPackage_1000ToInterfaceRealization_4001Children(view, links));
			links.addChildren(getPackage_1000ToPortProvided_4006Children(view, links));
			links.addChildren(getPackage_1000ToPortRequired_4004Children(view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case InterfaceRealizationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getInterfaceRealization_4001ToInterface_2003OutTarget((Edge) view, target));
			target.addChildren(getInterfaceRealization_4001ToInterface_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getInterfaceRealization_4001ToComponent_2001InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4001ToClass_2004InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4001ToComponent_3001InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4001ToClass_3004InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getPortProvided_4006ToInterface_2003OutTarget((Edge) view, target));
			target.addChildren(getPortProvided_4006ToInterface_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getPortProvided_4006ToPort_3002InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getPortRequired_4004ToInterface_2003OutTarget((Edge) view, target));
			target.addChildren(getPortRequired_4004ToInterface_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getPortRequired_4004ToPort_3002InSource((Edge) view, source));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
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
	private Collection getPortRequired_4004ToInterface_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPortRequired_4004ToInterface_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPortRequired_4004ToInterface_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPortProvided_4006ToInterface_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPortProvided_4006ToInterface_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPortProvided_4006ToInterface_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToClass_2004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToClass_2004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToClass_2004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2003ToPortProvided_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2003ToPortProvided_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2003ToPortProvided_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4001ToClass_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4001ToClass_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4001ToClass_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToPortRequired_4004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToPortRequired_4004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToPortRequired_4004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToArtifact_2002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Artifact2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToArtifact_2002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToArtifact_2002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_3001ToComponent_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToComponent_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_3001ToComponent_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPortProvided_4006ToPort_3002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPortProvided_4006ToPort_3002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPortProvided_4006ToPort_3002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4001ToInterface_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4001ToInterface_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4001ToInterface_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_3001ToInterface_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToInterface_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_3001ToInterface_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToInterface_2003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToInterface_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToInterface_2003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_3001ToInterfaceRealization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToInterfaceRealization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_3001ToInterfaceRealization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3002ToPortProvided_4006OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3002ToPortProvided_4006OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3002ToPortProvided_4006OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3004ToPort_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3004ToPort_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3004ToPort_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4001ToClass_3004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4001ToClass_3004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4001ToClass_3004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2003ToInterfaceRealization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2003ToInterfaceRealization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2003ToInterfaceRealization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_3005ToInterfaceRealization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_3005ToInterfaceRealization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_3005ToInterfaceRealization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_2001ToArtifact_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToArtifact_3003ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToArtifact_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_2001ToArtifact_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_3001ToArtifact_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ArtifactEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToArtifact_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_3001ToArtifact_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3004ToInterfaceRealization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3004ToInterfaceRealization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3004ToInterfaceRealization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPortRequired_4004ToInterface_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPortRequired_4004ToInterface_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPortRequired_4004ToInterface_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPortProvided_4006ToInterface_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPortProvided_4006ToInterface_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPortProvided_4006ToInterface_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPortRequired_4004ToPort_3002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPortRequired_4004ToPort_3002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPortRequired_4004ToPort_3002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_3001ToPort_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToPort_3002ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToPort_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_3001ToPort_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2003ToPortRequired_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2003ToPortRequired_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2003ToPortRequired_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4001ToComponent_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4001ToComponent_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4001ToComponent_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_2001ToClass_3004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToClass_3004ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToClass_3004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_2001ToClass_3004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4001ToInterface_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Interface2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4001ToInterface_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4001ToInterface_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToInterfaceRealization_4001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToInterfaceRealization_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToInterfaceRealization_4001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4001ToComponent_3001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4001ToComponent_3001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4001ToComponent_3001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_3001ToClass_3004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_3001ToClass_3004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_3001ToClass_3004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3002ToPortRequired_4004OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3002ToPortRequired_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3002ToPortRequired_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_3005ToPortRequired_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortRequiredEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_3005ToPortRequired_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_3005ToPortRequired_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToComponent_2001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToComponent_2001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToComponent_2001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToPortProvided_4006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToPortProvided_4006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToPortProvided_4006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_2001ToComponent_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToComponent_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_2001ToComponent_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_2001ToInterfaceRealization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToInterfaceRealization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_2001ToInterfaceRealization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2004ToPort_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2004ToPort_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2004ToPort_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_2001ToPort_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToPort_3002ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToPort_3002ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToPort_3002ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToPort_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_2001ToPort_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getComponent_2001ToInterface_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Component2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ComponentContents2EditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToInterface_3005ChildrenLeaf(view));
		connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ComponentContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isComponent_2001ToInterface_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isComponent_2001ToInterface_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_3005ToPortProvided_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortProvidedEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_3005ToPortProvided_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_3005ToPortProvided_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2004ToInterfaceRealization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2004ToInterfaceRealization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2004ToInterfaceRealization_4001OutTargetLeaf(View view) {
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
		return PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

}
