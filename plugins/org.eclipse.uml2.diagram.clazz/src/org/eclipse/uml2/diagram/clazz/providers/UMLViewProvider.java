package org.eclipse.uml2.diagram.clazz.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationName7EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintCompartmentEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DataTypeOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency_typeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationSlotsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceNameEditPart;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageOtherEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackagePackagesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveType2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PrimitiveTypeOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RedefinableTemplateSignatureEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.TemplateSignatureNode_signatureEditPart;

import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

import org.eclipse.uml2.diagram.clazz.view.factories.AssociationClass2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationClassAttributesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationClassClassesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationClassNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationClassOperationsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationClassViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationName2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationName3ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationName4ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationName5ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationName6ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationName7ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.AssociationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Class2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Class3ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ClassAttributesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ClassClassesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ClassNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ClassOperationsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ClassViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ConstraintCompartmentViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ConstraintConstrainedElementViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ConstraintNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.ConstraintViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DataType2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DataTypeAttributesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DataTypeNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DataTypeOperationsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DataTypeViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Dependency2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DependencyClientViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DependencyName2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DependencyNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DependencySupplierViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.DependencyViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Dependency_typeViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Enumeration2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.EnumerationAttributesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.EnumerationLiteralViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.EnumerationLiteralsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.EnumerationNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.EnumerationOperationsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.EnumerationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.GeneralizationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InstanceSpecification2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InstanceSpecificationNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InstanceSpecificationSlotsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InstanceSpecificationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InterfaceNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InterfaceRealizationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.InterfaceViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.LiteralStringViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Operation2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Operation3ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Operation4ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Operation5ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.OperationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Package2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Package3ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PackageClassifiersViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PackageNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PackageOtherViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PackagePackagesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PortNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PortViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PrimitiveType2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PrimitiveTypeAttributesViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PrimitiveTypeNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PrimitiveTypeOperationsViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PrimitiveTypeViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Property2ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Property3ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Property4ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Property5ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.Property6ViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PropertyNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.PropertyViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.RealizationNameViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.RealizationViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.RedefinableTemplateSignatureViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.SlotViewFactory;
import org.eclipse.uml2.diagram.clazz.view.factories.TemplateSignatureNode_signatureViewFactory;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (PackageEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return PackageViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = UMLVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case Class2EditPart.VISUAL_ID:
			return Class2ViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case AssociationClass2EditPart.VISUAL_ID:
			return AssociationClass2ViewFactory.class;
		case AssociationClassNameEditPart.VISUAL_ID:
			return AssociationClassNameViewFactory.class;
		case DataType2EditPart.VISUAL_ID:
			return DataType2ViewFactory.class;
		case DataTypeNameEditPart.VISUAL_ID:
			return DataTypeNameViewFactory.class;
		case PrimitiveType2EditPart.VISUAL_ID:
			return PrimitiveType2ViewFactory.class;
		case PrimitiveTypeNameEditPart.VISUAL_ID:
			return PrimitiveTypeNameViewFactory.class;
		case Enumeration2EditPart.VISUAL_ID:
			return Enumeration2ViewFactory.class;
		case EnumerationNameEditPart.VISUAL_ID:
			return EnumerationNameViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case ConstraintNameEditPart.VISUAL_ID:
			return ConstraintNameViewFactory.class;
		case InstanceSpecification2EditPart.VISUAL_ID:
			return InstanceSpecification2ViewFactory.class;
		case InstanceSpecificationNameEditPart.VISUAL_ID:
			return InstanceSpecificationNameViewFactory.class;
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
		case DependencyNameEditPart.VISUAL_ID:
			return DependencyNameViewFactory.class;
		case Package3EditPart.VISUAL_ID:
			return Package3ViewFactory.class;
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case DataTypeEditPart.VISUAL_ID:
			return DataTypeViewFactory.class;
		case PrimitiveTypeEditPart.VISUAL_ID:
			return PrimitiveTypeViewFactory.class;
		case EnumerationEditPart.VISUAL_ID:
			return EnumerationViewFactory.class;
		case AssociationClassEditPart.VISUAL_ID:
			return AssociationClassViewFactory.class;
		case InstanceSpecificationEditPart.VISUAL_ID:
			return InstanceSpecificationViewFactory.class;
		case PropertyEditPart.VISUAL_ID:
			return PropertyViewFactory.class;
		case OperationEditPart.VISUAL_ID:
			return OperationViewFactory.class;
		case Class3EditPart.VISUAL_ID:
			return Class3ViewFactory.class;
		case PortEditPart.VISUAL_ID:
			return PortViewFactory.class;
		case PortNameEditPart.VISUAL_ID:
			return PortNameViewFactory.class;
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			return RedefinableTemplateSignatureViewFactory.class;
		case TemplateSignatureNode_signatureEditPart.VISUAL_ID:
			return TemplateSignatureNode_signatureViewFactory.class;
		case Property2EditPart.VISUAL_ID:
			return Property2ViewFactory.class;
		case Operation2EditPart.VISUAL_ID:
			return Operation2ViewFactory.class;
		case Property3EditPart.VISUAL_ID:
			return Property3ViewFactory.class;
		case Operation3EditPart.VISUAL_ID:
			return Operation3ViewFactory.class;
		case Property4EditPart.VISUAL_ID:
			return Property4ViewFactory.class;
		case Operation4EditPart.VISUAL_ID:
			return Operation4ViewFactory.class;
		case EnumerationLiteralEditPart.VISUAL_ID:
			return EnumerationLiteralViewFactory.class;
		case Property5EditPart.VISUAL_ID:
			return Property5ViewFactory.class;
		case Operation5EditPart.VISUAL_ID:
			return Operation5ViewFactory.class;
		case LiteralStringEditPart.VISUAL_ID:
			return LiteralStringViewFactory.class;
		case SlotEditPart.VISUAL_ID:
			return SlotViewFactory.class;
		case PackagePackagesEditPart.VISUAL_ID:
			return PackagePackagesViewFactory.class;
		case PackageClassifiersEditPart.VISUAL_ID:
			return PackageClassifiersViewFactory.class;
		case PackageOtherEditPart.VISUAL_ID:
			return PackageOtherViewFactory.class;
		case ClassAttributesEditPart.VISUAL_ID:
			return ClassAttributesViewFactory.class;
		case ClassOperationsEditPart.VISUAL_ID:
			return ClassOperationsViewFactory.class;
		case ClassClassesEditPart.VISUAL_ID:
			return ClassClassesViewFactory.class;
		case AssociationClassAttributesEditPart.VISUAL_ID:
			return AssociationClassAttributesViewFactory.class;
		case AssociationClassOperationsEditPart.VISUAL_ID:
			return AssociationClassOperationsViewFactory.class;
		case AssociationClassClassesEditPart.VISUAL_ID:
			return AssociationClassClassesViewFactory.class;
		case DataTypeAttributesEditPart.VISUAL_ID:
			return DataTypeAttributesViewFactory.class;
		case DataTypeOperationsEditPart.VISUAL_ID:
			return DataTypeOperationsViewFactory.class;
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			return PrimitiveTypeAttributesViewFactory.class;
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			return PrimitiveTypeOperationsViewFactory.class;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			return EnumerationLiteralsViewFactory.class;
		case EnumerationAttributesEditPart.VISUAL_ID:
			return EnumerationAttributesViewFactory.class;
		case EnumerationOperationsEditPart.VISUAL_ID:
			return EnumerationOperationsViewFactory.class;
		case ConstraintCompartmentEditPart.VISUAL_ID:
			return ConstraintCompartmentViewFactory.class;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			return InstanceSpecificationSlotsViewFactory.class;
		case DependencyName2EditPart.VISUAL_ID:
			return DependencyName2ViewFactory.class;
		case Dependency_typeEditPart.VISUAL_ID:
			return Dependency_typeViewFactory.class;
		case PropertyNameEditPart.VISUAL_ID:
			return PropertyNameViewFactory.class;
		case AssociationNameEditPart.VISUAL_ID:
			return AssociationNameViewFactory.class;
		case AssociationName2EditPart.VISUAL_ID:
			return AssociationName2ViewFactory.class;
		case AssociationName3EditPart.VISUAL_ID:
			return AssociationName3ViewFactory.class;
		case AssociationName4EditPart.VISUAL_ID:
			return AssociationName4ViewFactory.class;
		case AssociationName5EditPart.VISUAL_ID:
			return AssociationName5ViewFactory.class;
		case AssociationName6EditPart.VISUAL_ID:
			return AssociationName6ViewFactory.class;
		case AssociationName7EditPart.VISUAL_ID:
			return AssociationName7ViewFactory.class;
		case RealizationNameEditPart.VISUAL_ID:
			return RealizationNameViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4004.equals(elementType)) {
			return ConstraintConstrainedElementViewFactory.class;
		}
		if (UMLElementTypes.DependencySupplier_4006.equals(elementType)) {
			return DependencySupplierViewFactory.class;
		}
		if (UMLElementTypes.DependencyClient_4007.equals(elementType)) {
			return DependencyClientViewFactory.class;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(semanticElement, semanticType);
		switch (linkVID) {
		case GeneralizationEditPart.VISUAL_ID:
			return GeneralizationViewFactory.class;
		case Dependency2EditPart.VISUAL_ID:
			return Dependency2ViewFactory.class;
		case Property6EditPart.VISUAL_ID:
			return Property6ViewFactory.class;
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
		case InterfaceRealizationEditPart.VISUAL_ID:
			return InterfaceRealizationViewFactory.class;
		case RealizationEditPart.VISUAL_ID:
			return RealizationViewFactory.class;
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter, containerView, semanticHint);
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
