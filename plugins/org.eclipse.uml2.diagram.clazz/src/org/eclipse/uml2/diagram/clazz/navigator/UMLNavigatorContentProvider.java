package org.eclipse.uml2.diagram.clazz.navigator;

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

import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintCompartmentEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationSlotsEditPart;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageOtherEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackagePackagesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeOperationsEditPart;
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
		case Package2EditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getPackage_2002ToPackage_3006Children(view, parentElement));
			result.addAll(getPackage_2002ToClass_3007Children(view, parentElement));
			result.addAll(getPackage_2002ToDataType_3008Children(view, parentElement));
			result.addAll(getPackage_2002ToPrimitiveType_3009Children(view, parentElement));
			result.addAll(getPackage_2002ToEnumeration_3011Children(view, parentElement));
			result.addAll(getPackage_2002ToAssociationClass_3012Children(view, parentElement));
			result.addAll(getPackage_2002ToInstanceSpecification_3013Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPackage_2002ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPackage_2002ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPackage_2002ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getPackage_2002ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getPackage_2002ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getPackage_2002ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getPackage_2002ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getClass_2001ToProperty_3001Children(view, parentElement));
			result.addAll(getClass_2001ToOperation_3002Children(view, parentElement));
			result.addAll(getClass_2001ToClass_3003Children(view, parentElement));
			result.addAll(getClass_2001ToPort_3025Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getClass_2001ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getClass_2001ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_2001ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_2001ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_2001ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getClass_2001ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getClass_2001ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_2001ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_2001ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getClass_2001ToDependencyClient_4007InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_2001ToInterfaceRealization_4008OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_2001ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_2001ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getAssociationClass_2007ToProperty_3019Children(view, parentElement));
			result.addAll(getAssociationClass_2007ToOperation_3020Children(view, parentElement));
			result.addAll(getAssociationClass_2007ToClass_3003Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAssociationClass_2007ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAssociationClass_2007ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_2007ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_2007ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_2007ToProperty_4003InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_2007ToProperty_4003OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_2007ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getAssociationClass_2007ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_2007ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_2007ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getAssociationClass_2007ToDependencyClient_4007InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_2007ToInterfaceRealization_4008OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_2007ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_2007ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getDataType_2004ToProperty_3014Children(view, parentElement));
			result.addAll(getDataType_2004ToOperation_3015Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDataType_2004ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDataType_2004ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataType_2004ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataType_2004ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataType_2004ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_2004ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_2004ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataType_2004ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataType_2004ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_2004ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_2004ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataType_2004ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getPrimitiveType_2005ToProperty_3021Children(view, parentElement));
			result.addAll(getPrimitiveType_2005ToOperation_3022Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPrimitiveType_2005ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPrimitiveType_2005ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getPrimitiveType_2005ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getPrimitiveType_2005ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_2005ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getPrimitiveType_2005ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getEnumeration_2003ToEnumerationLiteral_3016Children(view, parentElement));
			result.addAll(getEnumeration_2003ToProperty_3023Children(view, parentElement));
			result.addAll(getEnumeration_2003ToOperation_3024Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getEnumeration_2003ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getEnumeration_2003ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumeration_2003ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumeration_2003ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumeration_2003ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_2003ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_2003ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumeration_2003ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumeration_2003ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_2003ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_2003ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumeration_2003ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInterface_2010ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInterface_2010ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInterface_2010ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getInterface_2010ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInterface_2010ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2010ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2010ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getInterface_2010ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInterface_2010ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2010ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2010ToInterfaceRealization_4008InSource(view, incominglinks));
			incominglinks.addChildren(getInterface_2010ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getInterface_2010ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getConstraint_2006ToLiteralString_3005Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getConstraint_2006ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getConstraint_2006ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getConstraint_2006ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			outgoinglinks.addChildren(getConstraint_2006ToConstraintConstrainedElement_4004OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getConstraint_2006ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getConstraint_2006ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getConstraint_2006ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getConstraint_2006ToUsage_4009OutTarget(view, outgoinglinks));
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
			result.addAll(getInstanceSpecification_2008ToSlot_3017Children(view, parentElement));
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInstanceSpecification_2008ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInstanceSpecification_2008ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInstanceSpecification_2008ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getInstanceSpecification_2008ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getInstanceSpecification_2008ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getInstanceSpecification_2008ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getInstanceSpecification_2008ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDependency_2009ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDependency_2009ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDependency_2009ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getDependency_2009ToDependencySupplier_4006InSource(view, incominglinks));
			outgoinglinks.addChildren(getDependency_2009ToDependencySupplier_4006OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDependency_2009ToDependencyClient_4007InSource(view, incominglinks));
			outgoinglinks.addChildren(getDependency_2009ToDependencyClient_4007OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDependency_2009ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getDependency_2009ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPackage_3006ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPackage_3006ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPackage_3006ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getPackage_3006ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getPackage_3006ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getPackage_3006ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getPackage_3006ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getClass_3007ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getClass_3007ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3007ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3007ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3007ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getClass_3007ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getClass_3007ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3007ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3007ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getClass_3007ToDependencyClient_4007InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3007ToInterfaceRealization_4008OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3007ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3007ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getDataType_3008ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getDataType_3008ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataType_3008ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataType_3008ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataType_3008ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_3008ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_3008ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataType_3008ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getDataType_3008ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_3008ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getDataType_3008ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getDataType_3008ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPrimitiveType_3009ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPrimitiveType_3009ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getPrimitiveType_3009ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getPrimitiveType_3009ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getPrimitiveType_3009ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getPrimitiveType_3009ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getEnumeration_3011ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getEnumeration_3011ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumeration_3011ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumeration_3011ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumeration_3011ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_3011ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_3011ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumeration_3011ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumeration_3011ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_3011ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getEnumeration_3011ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumeration_3011ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getAssociationClass_3012ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getAssociationClass_3012ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_3012ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_3012ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_3012ToProperty_4003InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_3012ToProperty_4003OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_3012ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getAssociationClass_3012ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_3012ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_3012ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getAssociationClass_3012ToDependencyClient_4007InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_3012ToInterfaceRealization_4008OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getAssociationClass_3012ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getAssociationClass_3012ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getInstanceSpecification_3013ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getInstanceSpecification_3013ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getInstanceSpecification_3013ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getInstanceSpecification_3013ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getInstanceSpecification_3013ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getInstanceSpecification_3013ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getInstanceSpecification_3013ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getProperty_3001ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getProperty_3001ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getProperty_3001ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3001ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3001ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3001ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getProperty_3001ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOperation_3002ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOperation_3002ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOperation_3002ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3002ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3002ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3002ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getOperation_3002ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getClass_3003ToGeneralization_4001InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getClass_3003ToGeneralization_4001OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3003ToDependency_4002InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3003ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3003ToProperty_4003InSource(view, incominglinks));
			incominglinks.addChildren(getClass_3003ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getClass_3003ToAssociation_4005InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3003ToAssociation_4005OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3003ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getClass_3003ToDependencyClient_4007InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3003ToInterfaceRealization_4008OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getClass_3003ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getClass_3003ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getPort_3025ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getPort_3025ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getPort_3025ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getPort_3025ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getPort_3025ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getPort_3025ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getPort_3025ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getProperty_3019ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getProperty_3019ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getProperty_3019ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3019ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3019ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3019ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getProperty_3019ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOperation_3020ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOperation_3020ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOperation_3020ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3020ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3020ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3020ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getOperation_3020ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getProperty_3014ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getProperty_3014ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getProperty_3014ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3014ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3014ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3014ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getProperty_3014ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOperation_3015ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOperation_3015ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOperation_3015ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3015ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3015ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3015ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getOperation_3015ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getProperty_3021ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getProperty_3021ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getProperty_3021ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3021ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3021ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3021ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getProperty_3021ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOperation_3022ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOperation_3022ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOperation_3022ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3022ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3022ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3022ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getOperation_3022ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getEnumerationLiteral_3016ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getEnumerationLiteral_3016ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getEnumerationLiteral_3016ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getEnumerationLiteral_3016ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getEnumerationLiteral_3016ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getEnumerationLiteral_3016ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getEnumerationLiteral_3016ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getProperty_3023ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getProperty_3023ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getProperty_3023ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3023ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3023ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getProperty_3023ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getProperty_3023ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getOperation_3024ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getOperation_3024ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getOperation_3024ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3024ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3024ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getOperation_3024ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getOperation_3024ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getLiteralString_3005ToDependency_4002InSource(view, incominglinks));
			UMLNavigatorGroup outgoinglinks = new UMLNavigatorGroup("outgoing links", "icons/outgoingLinksNavigatorGroup.gif", parentElement);
			outgoinglinks.addChildren(getLiteralString_3005ToDependency_4002OutTarget(view, outgoinglinks));
			incominglinks.addChildren(getLiteralString_3005ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			incominglinks.addChildren(getLiteralString_3005ToDependencySupplier_4006InSource(view, incominglinks));
			incominglinks.addChildren(getLiteralString_3005ToDependencyClient_4007InSource(view, incominglinks));
			incominglinks.addChildren(getLiteralString_3005ToUsage_4009InSource(view, incominglinks));
			outgoinglinks.addChildren(getLiteralString_3005ToUsage_4009OutTarget(view, outgoinglinks));
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
			UMLNavigatorGroup incominglinks = new UMLNavigatorGroup("incoming links", "icons/incomingLinksNavigatorGroup.gif", parentElement);
			incominglinks.addChildren(getSlot_3017ToConstraintConstrainedElement_4004InSource(view, incominglinks));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}
		case PackageEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			result.addAll(getPackage_1000ToPackage_2002Children(view, parentElement));
			result.addAll(getPackage_1000ToClass_2001Children(view, parentElement));
			result.addAll(getPackage_1000ToAssociationClass_2007Children(view, parentElement));
			result.addAll(getPackage_1000ToDataType_2004Children(view, parentElement));
			result.addAll(getPackage_1000ToPrimitiveType_2005Children(view, parentElement));
			result.addAll(getPackage_1000ToEnumeration_2003Children(view, parentElement));
			result.addAll(getPackage_1000ToInterface_2010Children(view, parentElement));
			result.addAll(getPackage_1000ToConstraint_2006Children(view, parentElement));
			result.addAll(getPackage_1000ToInstanceSpecification_2008Children(view, parentElement));
			result.addAll(getPackage_1000ToDependency_2009Children(view, parentElement));
			UMLNavigatorGroup links = new UMLNavigatorGroup("links", "icons/linksNavigatorGroup.gif", parentElement);
			links.addChildren(getPackage_1000ToGeneralization_4001Children(view, links));
			links.addChildren(getPackage_1000ToDependency_4002Children(view, links));
			links.addChildren(getPackage_1000ToProperty_4003Children(view, links));
			links.addChildren(getPackage_1000ToConstraintConstrainedElement_4004Children(view, links));
			links.addChildren(getPackage_1000ToAssociation_4005Children(view, links));
			links.addChildren(getPackage_1000ToDependencySupplier_4006Children(view, links));
			links.addChildren(getPackage_1000ToDependencyClient_4007Children(view, links));
			links.addChildren(getPackage_1000ToInterfaceRealization_4008Children(view, links));
			links.addChildren(getPackage_1000ToUsage_4009Children(view, links));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}
		case GeneralizationEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getGeneralization_4001ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getGeneralization_4001ToClass_3003OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getGeneralization_4001ToClass_2001InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToAssociationClass_2007InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToDataType_2004InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToPrimitiveType_2005InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToEnumeration_2003InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToInterface_2010InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToClass_3007InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToDataType_3008InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToPrimitiveType_3009InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToEnumeration_3011InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToAssociationClass_3012InSource((Edge) view, source));
			source.addChildren(getGeneralization_4001ToClass_3003InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getDependency_4002ToPackage_2002OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToConstraint_2006OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToInstanceSpecification_2008OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToDependency_2009OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToPackage_3006OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToInstanceSpecification_3013OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToProperty_3001OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToOperation_3002OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToClass_3003OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToPort_3025OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToProperty_3019OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToOperation_3020OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToProperty_3014OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToOperation_3015OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToProperty_3021OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToOperation_3022OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToEnumerationLiteral_3016OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToProperty_3023OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToOperation_3024OutTarget((Edge) view, target));
			target.addChildren(getDependency_4002ToLiteralString_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getDependency_4002ToPackage_2002InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToClass_2001InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToAssociationClass_2007InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToDataType_2004InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToPrimitiveType_2005InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToEnumeration_2003InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToInterface_2010InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToConstraint_2006InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToInstanceSpecification_2008InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToDependency_2009InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToPackage_3006InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToClass_3007InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToDataType_3008InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToPrimitiveType_3009InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToEnumeration_3011InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToAssociationClass_3012InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToInstanceSpecification_3013InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToProperty_3001InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToOperation_3002InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToClass_3003InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToPort_3025InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToProperty_3019InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToOperation_3020InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToProperty_3014InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToOperation_3015InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToProperty_3021InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToOperation_3022InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToEnumerationLiteral_3016InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToProperty_3023InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToOperation_3024InSource((Edge) view, source));
			source.addChildren(getDependency_4002ToLiteralString_3005InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getProperty_4003ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getProperty_4003ToClass_3003OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getProperty_4003ToAssociationClass_2007InSource((Edge) view, source));
			source.addChildren(getProperty_4003ToAssociationClass_3012InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getConstraintConstrainedElement_4004ToPackage_2002OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToConstraint_2006OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToInstanceSpecification_2008OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToDependency_2009OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToPackage_3006OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToInstanceSpecification_3013OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToProperty_3001OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToOperation_3002OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToClass_3003OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToPort_3025OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToProperty_3019OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToOperation_3020OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToProperty_3014OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToOperation_3015OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToProperty_3021OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToOperation_3022OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToEnumerationLiteral_3016OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToProperty_3023OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToOperation_3024OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToLiteralString_3005OutTarget((Edge) view, target));
			target.addChildren(getConstraintConstrainedElement_4004ToSlot_3017OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getConstraintConstrainedElement_4004ToConstraint_2006InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getAssociation_4005ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getAssociation_4005ToClass_3003OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getAssociation_4005ToClass_2001InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToAssociationClass_2007InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToDataType_2004InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToPrimitiveType_2005InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToEnumeration_2003InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToInterface_2010InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToClass_3007InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToDataType_3008InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToPrimitiveType_3009InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToEnumeration_3011InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToAssociationClass_3012InSource((Edge) view, source));
			source.addChildren(getAssociation_4005ToClass_3003InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getDependencySupplier_4006ToPackage_2002OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToConstraint_2006OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToInstanceSpecification_2008OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToDependency_2009OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToPackage_3006OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToInstanceSpecification_3013OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToProperty_3001OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToOperation_3002OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToClass_3003OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToPort_3025OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToProperty_3019OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToOperation_3020OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToProperty_3014OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToOperation_3015OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToProperty_3021OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToOperation_3022OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToEnumerationLiteral_3016OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToProperty_3023OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToOperation_3024OutTarget((Edge) view, target));
			target.addChildren(getDependencySupplier_4006ToLiteralString_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getDependencySupplier_4006ToDependency_2009InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getDependencyClient_4007ToPackage_2002OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToConstraint_2006OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToInstanceSpecification_2008OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToDependency_2009OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToPackage_3006OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToInstanceSpecification_3013OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToProperty_3001OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToOperation_3002OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToClass_3003OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToPort_3025OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToProperty_3019OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToOperation_3020OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToProperty_3014OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToOperation_3015OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToProperty_3021OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToOperation_3022OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToEnumerationLiteral_3016OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToProperty_3023OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToOperation_3024OutTarget((Edge) view, target));
			target.addChildren(getDependencyClient_4007ToLiteralString_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getDependencyClient_4007ToDependency_2009InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getInterfaceRealization_4008ToInterface_2010OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getInterfaceRealization_4008ToClass_2001InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4008ToAssociationClass_2007InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4008ToClass_3007InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4008ToAssociationClass_3012InSource((Edge) view, source));
			source.addChildren(getInterfaceRealization_4008ToClass_3003InSource((Edge) view, source));
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
			UMLNavigatorGroup target = new UMLNavigatorGroup("target", "icons/linkTargetNavigatorGroup.gif", parentElement);
			target.addChildren(getUsage_4009ToPackage_2002OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToClass_2001OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToAssociationClass_2007OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToDataType_2004OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToPrimitiveType_2005OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToEnumeration_2003OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToInterface_2010OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToConstraint_2006OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToInstanceSpecification_2008OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToDependency_2009OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToPackage_3006OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToClass_3007OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToDataType_3008OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToPrimitiveType_3009OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToEnumeration_3011OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToAssociationClass_3012OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToInstanceSpecification_3013OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToProperty_3001OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToOperation_3002OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToClass_3003OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToPort_3025OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToProperty_3019OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToOperation_3020OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToProperty_3014OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToOperation_3015OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToProperty_3021OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToOperation_3022OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToEnumerationLiteral_3016OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToProperty_3023OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToOperation_3024OutTarget((Edge) view, target));
			target.addChildren(getUsage_4009ToLiteralString_3005OutTarget((Edge) view, target));
			UMLNavigatorGroup source = new UMLNavigatorGroup("source", "icons/linkSourceNavigatorGroup.gif", parentElement);
			source.addChildren(getUsage_4009ToPackage_2002InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToClass_2001InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToAssociationClass_2007InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToDataType_2004InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToPrimitiveType_2005InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToEnumeration_2003InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToInterface_2010InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToConstraint_2006InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToInstanceSpecification_2008InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToDependency_2009InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToPackage_3006InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToClass_3007InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToDataType_3008InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToPrimitiveType_3009InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToEnumeration_3011InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToAssociationClass_3012InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToInstanceSpecification_3013InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToProperty_3001InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToOperation_3002InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToClass_3003InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToPort_3025InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToProperty_3019InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToOperation_3020InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToProperty_3014InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToOperation_3015InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToProperty_3021InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToOperation_3022InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToEnumerationLiteral_3016InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToProperty_3023InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToOperation_3024InSource((Edge) view, source));
			source.addChildren(getUsage_4009ToLiteralString_3005InSource((Edge) view, source));
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
	private Collection getUsage_4009ToInterface_2010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToInterface_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToInterface_2010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPrimitiveType_2005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPrimitiveType_2005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPrimitiveType_2005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToInstanceSpecification_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToInstanceSpecification_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToInstanceSpecification_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToConstraint_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToConstraint_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToConstraint_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToClass_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationClassClassesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToClass_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToClass_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToEnumeration_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToEnumeration_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToEnumeration_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToInterface_2010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToInterface_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToInterface_2010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToProperty_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToProperty_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToProperty_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToAssociationClass_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToAssociationClass_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToAssociationClass_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToOperation_3022Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PrimitiveTypeOperationsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToOperation_3022ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToOperation_3022ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPackage_2002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPackage_2002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPackage_2002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToOperation_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToOperation_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToOperation_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToProperty_3019Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationClassAttributesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToProperty_3019ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToProperty_3019ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToConstraint_2006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToConstraint_2006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToConstraint_2006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToDependencySupplier_4006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToDependencySupplier_4006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToDependencySupplier_4006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPackage_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPackage_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPackage_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPackage_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPackage_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPackage_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPort_3025InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPort_3025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPort_3025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToAssociationClass_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToAssociationClass_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToAssociationClass_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToDependencyClient_4007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToDependencyClient_4007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToDependencyClient_4007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToEnumerationLiteral_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToEnumerationLiteral_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToEnumerationLiteral_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToPackage_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToPackage_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToPackage_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToClass_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToClass_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToClass_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToProperty_4003OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToProperty_4003OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToProperty_4003OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToConstraint_2006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToConstraint_2006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToConstraint_2006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToClass_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToClass_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToClass_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToOperation_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToOperation_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToOperation_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToPrimitiveType_2005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToPrimitiveType_2005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToPrimitiveType_2005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPort_3025InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPort_3025InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPort_3025InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToProperty_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToProperty_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToProperty_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToProperty_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToProperty_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToProperty_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToSlot_3017Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InstanceSpecificationSlotsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(SlotEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToSlot_3017ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToSlot_3017ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToDataType_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToDataType_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToDataType_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPort_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPort_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPort_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToPackage_2002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToPackage_2002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToPackage_2002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToAssociationClass_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToAssociationClass_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToAssociationClass_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToEnumeration_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToEnumeration_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToEnumeration_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToProperty_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToProperty_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToProperty_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToClass_3003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ClassClassesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToClass_3003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToClass_3003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToPackage_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToPackage_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToPackage_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToDataType_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToDataType_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToDataType_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToEnumeration_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToEnumeration_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToEnumeration_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToInstanceSpecification_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToInstanceSpecification_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToInstanceSpecification_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToDataType_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToDataType_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToDataType_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToAssociationClass_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToAssociationClass_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToAssociationClass_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToOperation_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToOperation_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToOperation_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToOperation_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToOperation_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToOperation_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3019InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3019InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3019InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToInstanceSpecification_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToInstanceSpecification_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToInstanceSpecification_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToClass_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToClass_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToClass_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToConstraintConstrainedElement_4004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToConstraintConstrainedElement_4004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToConstraintConstrainedElement_4004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToProperty_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToProperty_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToProperty_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToEnumerationLiteral_3016InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToEnumerationLiteral_3016InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToEnumerationLiteral_3016InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToOperation_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToOperation_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToOperation_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToConstraint_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToConstraint_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToConstraint_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToOperation_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToOperation_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToOperation_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToSlot_3017OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(SlotEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToSlot_3017OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToSlot_3017OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToOperation_3024Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(EnumerationOperationsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToOperation_3024ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToOperation_3024ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3024InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToInterface_2010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToInterface_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToInterface_2010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToPackage_3006Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackagePackagesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToPackage_3006ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToPackage_3006ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToPort_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToPort_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToPort_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToEnumerationLiteral_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToEnumerationLiteral_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToEnumerationLiteral_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToProperty_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToProperty_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToProperty_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToProperty_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToProperty_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToProperty_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3024InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3024InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3024InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToClass_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToClass_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToClass_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToOperation_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToOperation_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToOperation_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPrimitiveType_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPrimitiveType_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPrimitiveType_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPackage_2002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPackage_2002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPackage_2002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3021InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3021InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3021InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4008ToClass_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4008ToClass_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4008ToClass_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToDependencySupplier_4006OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToDependencySupplier_4006OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToDependencySupplier_4006OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToOperation_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToOperation_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToOperation_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3021ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3022InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3022InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3022InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToDependency_2009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToDependency_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToDependency_2009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4008ToAssociationClass_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4008ToAssociationClass_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4008ToAssociationClass_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToLiteralString_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToLiteralString_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToLiteralString_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToPort_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToPort_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToPort_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToOperation_3020Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationClassOperationsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToOperation_3020ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToOperation_3020ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToDependency_2009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToDependency_2009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToDependency_2009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToConstraintConstrainedElement_4004OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToConstraintConstrainedElement_4004OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToConstraintConstrainedElement_4004OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getSlot_3017ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isSlot_3017ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isSlot_3017ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToPort_3025Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToPort_3025ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToPort_3025ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToAssociationClass_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToAssociationClass_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToAssociationClass_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToClass_2001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToClass_2001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToClass_2001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToLiteralString_3005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintCompartmentEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToLiteralString_3005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToLiteralString_3005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3015OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3015OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3015OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToEnumeration_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToEnumeration_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToEnumeration_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPackage_3006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPackage_3006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPackage_3006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToEnumeration_2003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToEnumeration_2003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToEnumeration_2003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToPort_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToPort_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToPort_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToInstanceSpecification_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToInstanceSpecification_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToInstanceSpecification_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPort_3025OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PortEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPort_3025OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPort_3025OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToEnumerationLiteral_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToEnumerationLiteral_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToEnumerationLiteral_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPrimitiveType_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPrimitiveType_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPrimitiveType_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToDependency_2009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToDependency_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToDependency_2009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToInstanceSpecification_3013InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToInstanceSpecification_3013InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToInstanceSpecification_3013InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4008ToAssociationClass_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4008ToAssociationClass_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4008ToAssociationClass_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToEnumeration_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToEnumeration_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToEnumeration_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPackage_3006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPackage_3006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPackage_3006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3014InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3014InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3014InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToProperty_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToProperty_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToProperty_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToInstanceSpecification_2008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToInstanceSpecification_2008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToInstanceSpecification_2008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToPrimitiveType_2005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToPrimitiveType_2005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToPrimitiveType_2005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToAssociationClass_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToAssociationClass_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToAssociationClass_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToProperty_3001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ClassAttributesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToProperty_3001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToProperty_3001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToInterface_2010InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToInterface_2010InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToInterface_2010InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToProperty_4003Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToProperty_4003ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToProperty_4003ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToPrimitiveType_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToPrimitiveType_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToPrimitiveType_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToEnumeration_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToEnumeration_2003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToEnumeration_2003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3021ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToPackage_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToPackage_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToPackage_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToPrimitiveType_3009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToPrimitiveType_3009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToPrimitiveType_3009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToDependency_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToDependency_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToDependency_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3023InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3023InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3023InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4008ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4008ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4008ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3023ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3023ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3023ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToInstanceSpecification_3013InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToInstanceSpecification_3013InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToInstanceSpecification_3013InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToAssociationClass_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToAssociationClass_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToAssociationClass_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToDataType_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToDataType_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToDataType_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToClass_3007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToClass_3007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToClass_3007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToEnumerationLiteral_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToEnumerationLiteral_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToEnumerationLiteral_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToInstanceSpecification_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToInstanceSpecification_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToInstanceSpecification_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToInstanceSpecification_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToInstanceSpecification_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToInstanceSpecification_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToConstraint_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToConstraint_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToConstraint_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToInstanceSpecification_3013Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackageOtherEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToInstanceSpecification_3013ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToInstanceSpecification_3013ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToEnumerationLiteral_3016Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(EnumerationLiteralsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToEnumerationLiteral_3016ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToEnumerationLiteral_3016ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
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
	private Collection getConstraintConstrainedElement_4004ToOperation_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToOperation_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToOperation_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToConstraint_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToConstraint_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToConstraint_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToProperty_3023Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(EnumerationAttributesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToProperty_3023ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToProperty_3023ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToOperation_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToOperation_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToOperation_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3015InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3015InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3015InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4008ToClass_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4008ToClass_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4008ToClass_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToClass_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToClass_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToClass_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToLiteralString_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToLiteralString_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToLiteralString_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToAssociation_4005OutTargetLeaf(View view) {
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
	private Collection getProperty_3021ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3021ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToEnumeration_2003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
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
	private Collection getDataType_3008ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3023InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3023InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3023InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToPackage_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToPackage_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToPackage_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToOperation_3015Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DataTypeOperationsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToOperation_3015ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToOperation_3015ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToEnumerationLiteral_3016OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToEnumerationLiteral_3016OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToEnumerationLiteral_3016OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToLiteralString_3005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToLiteralString_3005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToLiteralString_3005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraint_2006ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraint_2006ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraint_2006ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToEnumeration_3011InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToEnumeration_3011InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToEnumeration_3011InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToDataType_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToDataType_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToDataType_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToDependencyClient_4007OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToDependencyClient_4007OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToDependencyClient_4007OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3020InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3020InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3020InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToInterfaceRealization_4008OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToInterfaceRealization_4008OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToInterfaceRealization_4008OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToEnumerationLiteral_3016InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationLiteralEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToEnumerationLiteral_3016InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToEnumerationLiteral_3016InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterfaceRealization_4008ToClass_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterfaceRealization_4008ToClass_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterfaceRealization_4008ToClass_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToOperation_3002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ClassOperationsEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToOperation_3002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToOperation_3002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToDependency_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToDependency_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToDependency_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToAssociationClass_2007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToAssociationClass_2007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToAssociationClass_2007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_3013ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_3013ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_3013ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToAssociationClass_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToAssociationClass_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToAssociationClass_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
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
	private Collection getConstraintConstrainedElement_4004ToDependency_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToDependency_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToDependency_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToPackage_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToPackage_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToPackage_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToUsage_4009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToUsage_4009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToUsage_4009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToProperty_3014Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DataTypeAttributesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToProperty_3014ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToProperty_3014ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToInstanceSpecification_2008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToInstanceSpecification_2008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToInstanceSpecification_2008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3020OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3020OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3020OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToInstanceSpecification_2008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToInstanceSpecification_2008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToInstanceSpecification_2008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToPrimitiveType_2005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToPrimitiveType_2005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToPrimitiveType_2005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3019ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3019ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3019ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPackage_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPackage_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPackage_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToDataType_2004Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToDataType_2004ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToDataType_2004ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToInstanceSpecification_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToInstanceSpecification_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToInstanceSpecification_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToLiteralString_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToLiteralString_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToLiteralString_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToPrimitiveType_3009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToPrimitiveType_3009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToPrimitiveType_3009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToClass_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToClass_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToClass_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToDataType_2004InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToDataType_2004InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToDataType_2004InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToPrimitiveType_3009Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(PrimitiveTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToPrimitiveType_3009ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToPrimitiveType_3009ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToOperation_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToOperation_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToOperation_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToPackage_2002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToPackage_2002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToPackage_2002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToDependency_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToDependency_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToDependency_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToInstanceSpecification_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToInstanceSpecification_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToInstanceSpecification_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToInstanceSpecification_3013OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecificationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToInstanceSpecification_3013OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToInstanceSpecification_3013OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToDependency_2009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToDependency_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToDependency_2009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToConstraint_2006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToConstraint_2006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToConstraint_2006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToClass_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToClass_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToClass_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToClass_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToClass_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToClass_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToInterfaceRealization_4008InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToInterfaceRealization_4008InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToInterfaceRealization_4008InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToInterfaceRealization_4008OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToInterfaceRealization_4008OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToInterfaceRealization_4008OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3024OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3024OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3024OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToClass_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToClass_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToClass_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToOperation_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToOperation_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToOperation_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToClass_3007InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToClass_3007InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToClass_3007InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToInterfaceRealization_4008OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToInterfaceRealization_4008OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToInterfaceRealization_4008OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToProperty_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToProperty_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToProperty_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToInterfaceRealization_4008OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToInterfaceRealization_4008OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToInterfaceRealization_4008OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getGeneralization_4001ToDataType_2004OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isGeneralization_4001ToDataType_2004OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isGeneralization_4001ToDataType_2004OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getLiteralString_3005ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isLiteralString_3005ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isLiteralString_3005ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToInterface_2010Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToInterface_2010ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToInterface_2010ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToInterfaceRealization_4008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToInterfaceRealization_4008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToInterfaceRealization_4008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3024ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3024ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3024ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3020InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3020InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3020InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_2004ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_2004ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_2004ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToOperation_3002InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToOperation_3002InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToOperation_3002InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToAssociation_4005Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToAssociation_4005ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToAssociation_4005ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToLiteralString_3005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToLiteralString_3005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToLiteralString_3005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToProperty_3021OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToProperty_3021OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToProperty_3021OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencySupplier_4006ToProperty_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencySupplier_4006ToProperty_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencySupplier_4006ToProperty_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToProperty_4003InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToProperty_4003InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToProperty_4003InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToProperty_3001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToProperty_3001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToProperty_3001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3015InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3015InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3015InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToClass_3003InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToClass_3003InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToClass_3003InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3021ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToGeneralization_4001Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToGeneralization_4001ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToGeneralization_4001ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToOperation_3002OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(OperationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToOperation_3002OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToOperation_3002OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToProperty_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToProperty_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToProperty_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToDependency_2009InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToDependency_2009InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToDependency_2009InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToEnumeration_3011OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToEnumeration_3011OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToEnumeration_3011OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToDependency_4002Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getDiagramLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToDependency_4002ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToDependency_4002ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_3009ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_3009ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_3009ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToInstanceSpecification_2008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InstanceSpecification2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToInstanceSpecification_2008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToInstanceSpecification_2008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToOperation_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToOperation_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToOperation_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToConstraint_2006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToConstraint_2006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToConstraint_2006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToAssociationClass_3012Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToAssociationClass_3012ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToAssociationClass_3012ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3015ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3015ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3015ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3014InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3014InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3014InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToDataType_3008Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToDataType_3008ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToDataType_3008ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToDataType_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToDataType_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToDataType_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToClass_2001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToClass_2001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToClass_2001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3014OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3014OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3014OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToAssociation_4005OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToAssociation_4005OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToAssociation_4005OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_3006ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_3006ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_3006ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPrimitiveType_2005ToProperty_3021Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PrimitiveTypeAttributesEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPrimitiveType_2005ToProperty_3021ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPrimitiveType_2005ToProperty_3021ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3003ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3003ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3003ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3020ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3020ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3020ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInstanceSpecification_2008ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInstanceSpecification_2008ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInstanceSpecification_2008ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3021ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToDataType_3008InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToDataType_3008InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToDataType_3008InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToPrimitiveType_2005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToPrimitiveType_2005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToPrimitiveType_2005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToProperty_3019OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToProperty_3019OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToProperty_3019OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToDependency_2009OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DependencyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToDependency_2009OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToDependency_2009OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3001ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3001ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3001ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToDependencySupplier_4006InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencySupplierEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToDependencySupplier_4006InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToDependencySupplier_4006InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToLiteralString_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToLiteralString_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToLiteralString_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToDataType_3008OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(DataTypeEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToDataType_3008OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToDataType_3008OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToEnumeration_2003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Enumeration2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToEnumeration_2003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToEnumeration_2003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3022InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3022InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3022InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToPackage_3006OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Package3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToPackage_3006OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToPackage_3006OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3002ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3002ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3002ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_3012ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_3012ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_3012ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToProperty_4003OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Property6EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToProperty_4003OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToProperty_4003OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_4003ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_4003ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_4003ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumerationLiteral_3016ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumerationLiteral_3016ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumerationLiteral_3016ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToOperation_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToOperation_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToOperation_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getOperation_3022ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isOperation_3022ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOperation_3022ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToInterface_2010OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(InterfaceEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToInterface_2010OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToInterface_2010OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3021InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3021InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3021InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToAssociationClass_3012OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToAssociationClass_3012OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToAssociationClass_3012OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_2003ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_2003ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_2003ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToPrimitiveType_2005InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PrimitiveType2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToPrimitiveType_2005InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToPrimitiveType_2005InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToProperty_3019InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToProperty_3019InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToProperty_3019InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPort_3025ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPort_3025ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPort_3025ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3021ToConstraintConstrainedElement_4004InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(ConstraintConstrainedElementEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3021ToConstraintConstrainedElement_4004InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3021ToConstraintConstrainedElement_4004InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getConstraintConstrainedElement_4004ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isConstraintConstrainedElement_4004ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isConstraintConstrainedElement_4004ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_1000ToAssociationClass_2007Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_1000ToAssociationClass_2007ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_1000ToAssociationClass_2007ChildrenLeaf(View view) {
		return false;
	}

	/**
	 * @generated
	 */
	private Collection getInterface_2010ToUsage_4009InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isInterface_2010ToUsage_4009InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isInterface_2010ToUsage_4009InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToLiteralString_3005OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(LiteralStringEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToLiteralString_3005OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToLiteralString_3005OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_2009ToDependency_4002InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_2009ToDependency_4002InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_2009ToDependency_4002InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToAssociationClass_3012InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToAssociationClass_3012InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToAssociationClass_3012InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToClass_3003OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class3EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToClass_3003OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToClass_3003OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToOperation_3022OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Operation4EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToOperation_3022OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToOperation_3022OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToConstraint_2006InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ConstraintEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToConstraint_2006InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToConstraint_2006InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDataType_3008ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDataType_3008ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDataType_3008ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToClass_2001OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Class2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToClass_2001OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToClass_2001OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_3007ToAssociation_4005InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(AssociationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_3007ToAssociation_4005InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_3007ToAssociation_4005InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependencyClient_4007ToProperty_3023OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(Property5EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependencyClient_4007ToProperty_3023OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependencyClient_4007ToProperty_3023OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToDependency_4002OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(Dependency2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToDependency_4002OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToDependency_4002OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getProperty_3014ToUsage_4009OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(UsageEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isProperty_3014ToUsage_4009OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isProperty_3014ToUsage_4009OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociation_4005ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociation_4005ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociation_4005ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getEnumeration_3011ToGeneralization_4001OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isEnumeration_3011ToGeneralization_4001OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isEnumeration_3011ToGeneralization_4001OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToInterfaceRealization_4008OutTarget(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getOutgoingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(InterfaceRealizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToInterfaceRealization_4008OutTargetLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToInterfaceRealization_4008OutTargetLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getClass_2001ToDependencyClient_4007InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(DependencyClientEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isClass_2001ToDependencyClient_4007InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isClass_2001ToDependencyClient_4007InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToClass_3007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(ClassEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToClass_3007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToClass_3007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getDependency_4002ToAssociationClass_2007OutTarget(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksTargetByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(AssociationClass2EditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isDependency_4002ToAssociationClass_2007OutTargetLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isDependency_4002ToAssociationClass_2007OutTargetLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getUsage_4009ToProperty_3001InSource(Edge edge, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getLinksSourceByType(Collections.singleton(edge), UMLVisualIDRegistry.getType(PropertyEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isUsage_4009ToProperty_3001InSourceLeaf(edge));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isUsage_4009ToProperty_3001InSourceLeaf(Edge edge) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getAssociationClass_2007ToGeneralization_4001InSource(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getIncomingLinksByType(Collections.singleton(view), UMLVisualIDRegistry.getType(GeneralizationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isAssociationClass_2007ToGeneralization_4001InSourceLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isAssociationClass_2007ToGeneralization_4001InSourceLeaf(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	private Collection getPackage_2002ToEnumeration_3011Children(View view, Object parent) {
		Collection result = new ArrayList();
		Collection connectedViews = getChildrenByType(Collections.singleton(view), UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
		connectedViews = getChildrenByType(connectedViews, UMLVisualIDRegistry.getType(EnumerationEditPart.VISUAL_ID));
		createNavigatorItems(connectedViews, parent, result, isPackage_2002ToEnumeration_3011ChildrenLeaf(view));
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isPackage_2002ToEnumeration_3011ChildrenLeaf(View view) {
		return false;
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
