package org.eclipse.uml2.diagram.clazz.navigator;

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
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

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
				case Package2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Class2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case AssociationClass2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case DataType2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PrimitiveType2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Enumeration2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InterfaceEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case ConstraintEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InstanceSpecification2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(SlotEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case DependencyEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Package3EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case ClassEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case DataTypeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PrimitiveTypeEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case EnumerationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case AssociationClassEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case InstanceSpecificationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PropertyEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case OperationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Class3EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PortEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Property2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Operation2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Property3EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Operation3EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Property4EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Operation4EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case EnumerationLiteralEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Property5EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case Operation5EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case LiteralStringEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), false, incominglinks));
					UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), true, outgoinglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), false, incominglinks));
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), false, incominglinks));
					outgoinglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), true, outgoinglinks));
					if (!outgoinglinks.isEmpty()) {
						result.add(outgoinglinks);
					}
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case SlotEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					incominglinks.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), false, incominglinks));
					if (!incominglinks.isEmpty()) {
						result.add(incominglinks);
					}
					return result.toArray();
				}
				case PackageEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), navigatorItem));
					result.addAll(getChildByType(navigatorItem.getView().getChildren(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), navigatorItem));
					UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID), links));
					links.addChildren(getViewByType(navigatorItem.getView().getDiagram().getEdges(), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID), links));
					if (!links.isEmpty()) {
						result.add(links);
					}
					return result.toArray();
				}
				case GeneralizationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case Dependency2EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case Property6EditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case ConstraintConstrainedElementEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(SlotEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case AssociationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case DependencySupplierEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case DependencyClientEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case InterfaceRealizationEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), false, source));
					if (!target.isEmpty()) {
						result.add(target);
					}
					if (!source.isEmpty()) {
						result.add(source);
					}
					return result.toArray();
				}
				case UsageEditPart.VISUAL_ID: {
					Collection result = new ArrayList();
					UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), true, target));
					target.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), true, target));
					UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", PackageEditPart.MODEL_ID, navigatorItem);
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID), false, source));
					source.addChildren(getConnectedViews(navigatorItem.getView(), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID), false, source));
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
