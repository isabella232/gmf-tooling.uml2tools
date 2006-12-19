package org.eclipse.uml2.diagram.profile.navigator;

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

import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImport2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ExtensionEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile3EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileContentsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileProfileLabelsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Stereotype2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeAttributesEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeConstraintsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeEditPart;

import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;

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
			result.addAll(createNavigatorItems(selectViewsByType(resource.getContents(), ProfileEditPart.MODEL_ID), file));
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
		case StereotypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getStereotype_2001ToProperty_3001Children(view, parentElement));
			result.addAll(getStereotype_2001ToConstraint_3008Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getStereotype_2001ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getStereotype_2001ToGeneralization_4001OutTarget(view, outgoinglinks));
			outgoinglinks.addChildren(getStereotype_2001ToExtension_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Profile2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getProfile_2002ToStereotype_3003Children(view, parentElement));
			return result.toArray();
		}
		case EnumerationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getEnumeration_2003ToEnumerationLiteral_3005Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getEnumeration_2003ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getEnumeration_2003ToGeneralization_4001OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case ElementImportEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getElementImport_2006ToExtension_4002InSource(view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case Profile3EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getProfile_2007ToElementImport_3009Children(view, parentElement));
			return result.toArray();
		}
		case Stereotype2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getStereotype_3003ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getStereotype_3003ToGeneralization_4001OutTarget(view, outgoinglinks));
			outgoinglinks.addChildren(getStereotype_3003ToExtension_4002OutTarget(view, outgoinglinks));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case ElementImport2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getElementImport_3009ToExtension_4002InSource(view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case ProfileEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getProfile_1000ToStereotype_2001Children(view, parentElement));
			result.addAll(getProfile_1000ToProfile_2002Children(view, parentElement));
			result.addAll(getProfile_1000ToEnumeration_2003Children(view, parentElement));
			result.addAll(getProfile_1000ToElementImport_2006Children(view, parentElement));
			result.addAll(getProfile_1000ToProfile_2007Children(view, parentElement));
			UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", parentElement);
			links.addChildren(getProfile_1000ToGeneralization_4001Children(view, links));
			links.addChildren(getProfile_1000ToExtension_4002Children(view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case GeneralizationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getGeneralization_4001ToStereotype_2001OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToStereotype_3003OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getGeneralization_4001ToStereotype_2001InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToEnumeration_2003InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToStereotype_3003InSource((Edge) view, source));
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!target.isEmpty()) {
				result.add(target);
			}
			return result.toArray();
		}
		case ExtensionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getExtension_4002ToElementImport_2006OutTarget((Edge) view, target));
			target.addChildren(getExtension_4002ToElementImport_3009OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getExtension_4002ToStereotype_2001InSource((Edge) view, source));
			source.addChildren(getExtension_4002ToStereotype_3003InSource((Edge) view, source));
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
	private Collection getStereotype_3003ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_3003ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_3003ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToProfile_2002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Profile2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToProfile_2002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToProfile_2002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToExtension_4002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ExtensionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToExtension_4002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToExtension_4002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToEnumeration_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToEnumeration_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToEnumeration_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_2001ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_2001ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_2001ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToProfile_2007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Profile3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToProfile_2007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToProfile_2007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_2001ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_2001ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_2001ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToStereotype_2001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToStereotype_2001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToStereotype_2001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToEnumerationLiteral_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(EnumerationLiteralsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToEnumerationLiteral_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToEnumerationLiteral_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToElementImport_2006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ElementImportEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToElementImport_2006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToElementImport_2006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getElementImport_3009ToExtension_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ExtensionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isElementImport_3009ToExtension_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isElementImport_3009ToExtension_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getExtension_4002ToElementImport_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ElementImport2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isExtension_4002ToElementImport_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isExtension_4002ToElementImport_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getElementImport_2006ToExtension_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ExtensionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isElementImport_2006ToExtension_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isElementImport_2006ToExtension_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_2007ToElementImport_3009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ProfileProfileLabelsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ElementImport2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_2007ToElementImport_3009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_2007ToElementImport_3009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getExtension_4002ToStereotype_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isExtension_4002ToStereotype_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isExtension_4002ToStereotype_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_3003ToExtension_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ExtensionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_3003ToExtension_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_3003ToExtension_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToStereotype_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Stereotype2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToStereotype_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToStereotype_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToEnumeration_2003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToEnumeration_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToEnumeration_2003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToStereotype_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToStereotype_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToStereotype_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToStereotype_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(StereotypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToStereotype_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToStereotype_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_1000ToGeneralization_4001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_1000ToGeneralization_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_1000ToGeneralization_4001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_3003ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_3003ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_3003ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_2001ToProperty_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StereotypeAttributesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_2001ToProperty_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_2001ToProperty_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getExtension_4002ToStereotype_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Stereotype2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isExtension_4002ToStereotype_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isExtension_4002ToStereotype_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getExtension_4002ToElementImport_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ElementImportEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isExtension_4002ToElementImport_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isExtension_4002ToElementImport_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_2001ToConstraint_3008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(StereotypeConstraintsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_2001ToConstraint_3008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_2001ToConstraint_3008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getProfile_2002ToStereotype_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ProfileContentsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Stereotype2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProfile_2002ToStereotype_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProfile_2002ToStereotype_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getStereotype_2001ToExtension_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ExtensionEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isStereotype_2001ToExtension_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isStereotype_2001ToExtension_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToStereotype_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Stereotype2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToStereotype_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToStereotype_3003OutTargetLeaf(Edge edge) {
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
		return ProfileEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(view));
	}

}
