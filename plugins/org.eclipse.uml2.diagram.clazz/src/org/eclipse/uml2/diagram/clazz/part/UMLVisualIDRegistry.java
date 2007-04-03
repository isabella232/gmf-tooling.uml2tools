package org.eclipse.uml2.diagram.clazz.part;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

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
import org.eclipse.uml2.diagram.clazz.edit.parts.Class4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassOperationsEditPart;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyName3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Enumeration2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.EnumerationOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Generalization2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetIsCoveringIsDisjointEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationSetNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecification2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InstanceSpecificationSlotsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceAttributesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceClassesEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceName2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceOperationsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation3EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation5EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation6EditPart;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.Property7EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationNameEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RedefinableTemplateSignatureEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.TemplateSignatureNode_signatureEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;

import org.eclipse.uml2.diagram.clazz.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.clazz.expressions.UMLOCLFactory;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = UMLDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UMLDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass) && isDiagramPackage_1000((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement, domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement, EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}

		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case Package2EditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return PackageNameEditPart.VISUAL_ID;
			}
			if (PackagePackagesEditPart.VISUAL_ID == nodeVisualID) {
				return PackagePackagesEditPart.VISUAL_ID;
			}
			if (PackageClassifiersEditPart.VISUAL_ID == nodeVisualID) {
				return PackageClassifiersEditPart.VISUAL_ID;
			}
			if (PackageOtherEditPart.VISUAL_ID == nodeVisualID) {
				return PackageOtherEditPart.VISUAL_ID;
			}
			return getUnrecognizedPackage_2002ChildNodeID(domainElement, semanticHint);
		case Class2EditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return ClassNameEditPart.VISUAL_ID;
			}
			if (ClassAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return ClassAttributesEditPart.VISUAL_ID;
			}
			if (ClassOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return ClassOperationsEditPart.VISUAL_ID;
			}
			if (ClassClassesEditPart.VISUAL_ID == nodeVisualID) {
				return ClassClassesEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PortEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePort_3025((Port) domainElement))) {
				return PortEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRedefinableTemplateSignature_3027((RedefinableTemplateSignature) domainElement))) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			return getUnrecognizedClass_2001ChildNodeID(domainElement, semanticHint);
		case AssociationClass2EditPart.VISUAL_ID:
			if (AssociationClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return AssociationClassNameEditPart.VISUAL_ID;
			}
			if (AssociationClassAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return AssociationClassAttributesEditPart.VISUAL_ID;
			}
			if (AssociationClassOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return AssociationClassOperationsEditPart.VISUAL_ID;
			}
			if (AssociationClassClassesEditPart.VISUAL_ID == nodeVisualID) {
				return AssociationClassClassesEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRedefinableTemplateSignature_3027((RedefinableTemplateSignature) domainElement))) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClass_2007ChildNodeID(domainElement, semanticHint);
		case DataType2EditPart.VISUAL_ID:
			if (DataTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return DataTypeNameEditPart.VISUAL_ID;
			}
			if (DataTypeAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return DataTypeAttributesEditPart.VISUAL_ID;
			}
			if (DataTypeOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return DataTypeOperationsEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRedefinableTemplateSignature_3027((RedefinableTemplateSignature) domainElement))) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			return getUnrecognizedDataType_2004ChildNodeID(domainElement, semanticHint);
		case PrimitiveType2EditPart.VISUAL_ID:
			if (PrimitiveTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return PrimitiveTypeNameEditPart.VISUAL_ID;
			}
			if (PrimitiveTypeAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return PrimitiveTypeAttributesEditPart.VISUAL_ID;
			}
			if (PrimitiveTypeOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return PrimitiveTypeOperationsEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRedefinableTemplateSignature_3027((RedefinableTemplateSignature) domainElement))) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			return getUnrecognizedPrimitiveType_2005ChildNodeID(domainElement, semanticHint);
		case Enumeration2EditPart.VISUAL_ID:
			if (EnumerationNameEditPart.VISUAL_ID == nodeVisualID) {
				return EnumerationNameEditPart.VISUAL_ID;
			}
			if (EnumerationLiteralsEditPart.VISUAL_ID == nodeVisualID) {
				return EnumerationLiteralsEditPart.VISUAL_ID;
			}
			if (EnumerationAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return EnumerationAttributesEditPart.VISUAL_ID;
			}
			if (EnumerationOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return EnumerationOperationsEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRedefinableTemplateSignature_3027((RedefinableTemplateSignature) domainElement))) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumeration_2003ChildNodeID(domainElement, semanticHint);
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedInterface_2010ChildNodeID(domainElement, semanticHint);
		case ConstraintEditPart.VISUAL_ID:
			if (ConstraintNameEditPart.VISUAL_ID == nodeVisualID) {
				return ConstraintNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedConstraint_2006ChildNodeID(domainElement, semanticHint);
		case InstanceSpecification2EditPart.VISUAL_ID:
			if (InstanceSpecificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return InstanceSpecificationNameEditPart.VISUAL_ID;
			}
			if (InstanceSpecificationSlotsEditPart.VISUAL_ID == nodeVisualID) {
				return InstanceSpecificationSlotsEditPart.VISUAL_ID;
			}
			return getUnrecognizedInstanceSpecification_2008ChildNodeID(domainElement, semanticHint);
		case DependencyEditPart.VISUAL_ID:
			if (DependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return DependencyNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedDependency_2009ChildNodeID(domainElement, semanticHint);
		case GeneralizationSetEditPart.VISUAL_ID:
			if (GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID == nodeVisualID) {
				return GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID;
			}
			if (GeneralizationSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return GeneralizationSetNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedGeneralizationSet_2012ChildNodeID(domainElement, semanticHint);
		case Interface2EditPart.VISUAL_ID:
			if (InterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceName2EditPart.VISUAL_ID;
			}
			if (InterfaceAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceAttributesEditPart.VISUAL_ID;
			}
			if (InterfaceOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceOperationsEditPart.VISUAL_ID;
			}
			if (InterfaceClassesEditPart.VISUAL_ID == nodeVisualID) {
				return InterfaceClassesEditPart.VISUAL_ID;
			}
			return getUnrecognizedInterface_2013ChildNodeID(domainElement, semanticHint);
		case Package3EditPart.VISUAL_ID:
			return getUnrecognizedPackage_3006ChildNodeID(domainElement, semanticHint);
		case ClassEditPart.VISUAL_ID:
			return getUnrecognizedClass_3007ChildNodeID(domainElement, semanticHint);
		case DataTypeEditPart.VISUAL_ID:
			return getUnrecognizedDataType_3008ChildNodeID(domainElement, semanticHint);
		case PrimitiveTypeEditPart.VISUAL_ID:
			return getUnrecognizedPrimitiveType_3009ChildNodeID(domainElement, semanticHint);
		case EnumerationEditPart.VISUAL_ID:
			return getUnrecognizedEnumeration_3011ChildNodeID(domainElement, semanticHint);
		case AssociationClassEditPart.VISUAL_ID:
			return getUnrecognizedAssociationClass_3012ChildNodeID(domainElement, semanticHint);
		case InstanceSpecificationEditPart.VISUAL_ID:
			return getUnrecognizedInstanceSpecification_3013ChildNodeID(domainElement, semanticHint);
		case PropertyEditPart.VISUAL_ID:
			return getUnrecognizedProperty_3001ChildNodeID(domainElement, semanticHint);
		case OperationEditPart.VISUAL_ID:
			return getUnrecognizedOperation_3002ChildNodeID(domainElement, semanticHint);
		case Class3EditPart.VISUAL_ID:
			return getUnrecognizedClass_3003ChildNodeID(domainElement, semanticHint);
		case PortEditPart.VISUAL_ID:
			if (PortNameEditPart.VISUAL_ID == nodeVisualID) {
				return PortNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedPort_3025ChildNodeID(domainElement, semanticHint);
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			if (TemplateSignatureNode_signatureEditPart.VISUAL_ID == nodeVisualID) {
				return TemplateSignatureNode_signatureEditPart.VISUAL_ID;
			}
			return getUnrecognizedRedefinableTemplateSignature_3027ChildNodeID(domainElement, semanticHint);
		case Property2EditPart.VISUAL_ID:
			return getUnrecognizedProperty_3019ChildNodeID(domainElement, semanticHint);
		case Operation2EditPart.VISUAL_ID:
			return getUnrecognizedOperation_3020ChildNodeID(domainElement, semanticHint);
		case Property3EditPart.VISUAL_ID:
			return getUnrecognizedProperty_3014ChildNodeID(domainElement, semanticHint);
		case Operation3EditPart.VISUAL_ID:
			return getUnrecognizedOperation_3015ChildNodeID(domainElement, semanticHint);
		case Property4EditPart.VISUAL_ID:
			return getUnrecognizedProperty_3021ChildNodeID(domainElement, semanticHint);
		case Operation4EditPart.VISUAL_ID:
			return getUnrecognizedOperation_3022ChildNodeID(domainElement, semanticHint);
		case EnumerationLiteralEditPart.VISUAL_ID:
			return getUnrecognizedEnumerationLiteral_3016ChildNodeID(domainElement, semanticHint);
		case Property5EditPart.VISUAL_ID:
			return getUnrecognizedProperty_3023ChildNodeID(domainElement, semanticHint);
		case Operation5EditPart.VISUAL_ID:
			return getUnrecognizedOperation_3024ChildNodeID(domainElement, semanticHint);
		case SlotEditPart.VISUAL_ID:
			return getUnrecognizedSlot_3017ChildNodeID(domainElement, semanticHint);
		case Property6EditPart.VISUAL_ID:
			return getUnrecognizedProperty_3028ChildNodeID(domainElement, semanticHint);
		case Operation6EditPart.VISUAL_ID:
			return getUnrecognizedOperation_3029ChildNodeID(domainElement, semanticHint);
		case Class4EditPart.VISUAL_ID:
			return getUnrecognizedClass_3030ChildNodeID(domainElement, semanticHint);
		case PackagePackagesEditPart.VISUAL_ID:
			if ((semanticHint == null || Package3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePackage_3006((Package) domainElement))) {
				return Package3EditPart.VISUAL_ID;
			}
			return getUnrecognizedPackagePackages_7010ChildNodeID(domainElement, semanticHint);
		case PackageClassifiersEditPart.VISUAL_ID:
			if ((semanticHint == null || ClassEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_3007((Class) domainElement))) {
				return ClassEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataTypeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDataType_3008((DataType) domainElement))) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PrimitiveTypeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePrimitiveType_3009((PrimitiveType) domainElement))) {
				return PrimitiveTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EnumerationEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEnumeration_3011((Enumeration) domainElement))) {
				return EnumerationEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AssociationClassEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAssociationClass_3012((AssociationClass) domainElement))) {
				return AssociationClassEditPart.VISUAL_ID;
			}
			return getUnrecognizedPackageClassifiers_7011ChildNodeID(domainElement, semanticHint);
		case PackageOtherEditPart.VISUAL_ID:
			if ((semanticHint == null || InstanceSpecificationEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInstanceSpecification_3013((InstanceSpecification) domainElement))) {
				return InstanceSpecificationEditPart.VISUAL_ID;
			}
			return getUnrecognizedPackageOther_7012ChildNodeID(domainElement, semanticHint);
		case ClassAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || PropertyEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeProperty_3001((Property) domainElement))) {
				return PropertyEditPart.VISUAL_ID;
			}
			return getUnrecognizedClassAttributes_7001ChildNodeID(domainElement, semanticHint);
		case ClassOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || OperationEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_3002((Operation) domainElement))) {
				return OperationEditPart.VISUAL_ID;
			}
			return getUnrecognizedClassOperations_7002ChildNodeID(domainElement, semanticHint);
		case ClassClassesEditPart.VISUAL_ID:
			if ((semanticHint == null || Class3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_3003((Class) domainElement))) {
				return Class3EditPart.VISUAL_ID;
			}
			return getUnrecognizedClassClasses_7003ChildNodeID(domainElement, semanticHint);
		case AssociationClassAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeProperty_3019((Property) domainElement))) {
				return Property2EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClassAttributes_7024ChildNodeID(domainElement, semanticHint);
		case AssociationClassOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_3020((Operation) domainElement))) {
				return Operation2EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClassOperations_7025ChildNodeID(domainElement, semanticHint);
		case AssociationClassClassesEditPart.VISUAL_ID:
			if ((semanticHint == null || Class3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_3003((Class) domainElement))) {
				return Class3EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClassClasses_7026ChildNodeID(domainElement, semanticHint);
		case DataTypeAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeProperty_3014((Property) domainElement))) {
				return Property3EditPart.VISUAL_ID;
			}
			return getUnrecognizedDataTypeAttributes_7017ChildNodeID(domainElement, semanticHint);
		case DataTypeOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_3015((Operation) domainElement))) {
				return Operation3EditPart.VISUAL_ID;
			}
			return getUnrecognizedDataTypeOperations_7018ChildNodeID(domainElement, semanticHint);
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeProperty_3021((Property) domainElement))) {
				return Property4EditPart.VISUAL_ID;
			}
			return getUnrecognizedPrimitiveTypeAttributes_7020ChildNodeID(domainElement, semanticHint);
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_3022((Operation) domainElement))) {
				return Operation4EditPart.VISUAL_ID;
			}
			return getUnrecognizedPrimitiveTypeOperations_7021ChildNodeID(domainElement, semanticHint);
		case EnumerationLiteralsEditPart.VISUAL_ID:
			if ((semanticHint == null || EnumerationLiteralEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEnumerationLiteral_3016((EnumerationLiteral) domainElement))) {
				return EnumerationLiteralEditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumerationLiterals_7013ChildNodeID(domainElement, semanticHint);
		case EnumerationAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeProperty_3023((Property) domainElement))) {
				return Property5EditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumerationAttributes_7014ChildNodeID(domainElement, semanticHint);
		case EnumerationOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_3024((Operation) domainElement))) {
				return Operation5EditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumerationOperations_7015ChildNodeID(domainElement, semanticHint);
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			if ((semanticHint == null || SlotEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getSlot().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeSlot_3017((Slot) domainElement))) {
				return SlotEditPart.VISUAL_ID;
			}
			return getUnrecognizedInstanceSpecificationSlots_7028ChildNodeID(domainElement, semanticHint);
		case InterfaceAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeProperty_3028((Property) domainElement))) {
				return Property6EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterfaceAttributes_7029ChildNodeID(domainElement, semanticHint);
		case InterfaceOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOperation_3029((Operation) domainElement))) {
				return Operation6EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterfaceOperations_7030ChildNodeID(domainElement, semanticHint);
		case InterfaceClassesEditPart.VISUAL_ID:
			if ((semanticHint == null || Class4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_3030((Class) domainElement))) {
				return Class4EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterfaceClasses_7031ChildNodeID(domainElement, semanticHint);
		case PackageEditPart.VISUAL_ID:
			if ((semanticHint == null || Package2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePackage_2002((Package) domainElement))) {
				return Package2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Class2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeClass_2001((Class) domainElement))) {
				return Class2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AssociationClass2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAssociationClass_2007((AssociationClass) domainElement))) {
				return AssociationClass2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataType2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDataType_2004((DataType) domainElement))) {
				return DataType2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PrimitiveType2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePrimitiveType_2005((PrimitiveType) domainElement))) {
				return PrimitiveType2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Enumeration2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeEnumeration_2003((Enumeration) domainElement))) {
				return Enumeration2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InterfaceEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInterface_2010((Interface) domainElement))) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ConstraintEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeConstraint_2006((Constraint) domainElement))) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InstanceSpecification2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInstanceSpecification_2008((InstanceSpecification) domainElement))) {
				return InstanceSpecification2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DependencyEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDependency_2009((Dependency) domainElement))) {
				return DependencyEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || GeneralizationSetEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getGeneralizationSet().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeGeneralizationSet_2012((GeneralizationSet) domainElement))) {
				return GeneralizationSetEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Interface2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInterface_2013((Interface) domainElement))) {
				return Interface2EditPart.VISUAL_ID;
			}
			return getUnrecognizedPackage_1000ChildNodeID(domainElement, semanticHint);
		case Dependency2EditPart.VISUAL_ID:
			if (DependencyName2EditPart.VISUAL_ID == nodeVisualID) {
				return DependencyName2EditPart.VISUAL_ID;
			}
			if (DependencyName3EditPart.VISUAL_ID == nodeVisualID) {
				return DependencyName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedDependency_4002LinkLabelID(semanticHint);
		case Property7EditPart.VISUAL_ID:
			if (PropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return PropertyNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedProperty_4003LinkLabelID(semanticHint);
		case AssociationEditPart.VISUAL_ID:
			if (AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return AssociationNameEditPart.VISUAL_ID;
			}
			if (AssociationName2EditPart.VISUAL_ID == nodeVisualID) {
				return AssociationName2EditPart.VISUAL_ID;
			}
			if (AssociationName3EditPart.VISUAL_ID == nodeVisualID) {
				return AssociationName3EditPart.VISUAL_ID;
			}
			if (AssociationName4EditPart.VISUAL_ID == nodeVisualID) {
				return AssociationName4EditPart.VISUAL_ID;
			}
			if (AssociationName5EditPart.VISUAL_ID == nodeVisualID) {
				return AssociationName5EditPart.VISUAL_ID;
			}
			if (AssociationName6EditPart.VISUAL_ID == nodeVisualID) {
				return AssociationName6EditPart.VISUAL_ID;
			}
			if (AssociationName7EditPart.VISUAL_ID == nodeVisualID) {
				return AssociationName7EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociation_4005LinkLabelID(semanticHint);
		case RealizationEditPart.VISUAL_ID:
			if (RealizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return RealizationNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedRealization_4010LinkLabelID(semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassGeneralization_4001((Generalization) domainElement))) {
			return GeneralizationEditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassDependency_4002((Dependency) domainElement))) {
			return Dependency2EditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassProperty_4003((Property) domainElement))) {
			return Property7EditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassAssociation_4005((Association) domainElement))) {
			return AssociationEditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getInterfaceRealization().isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassInterfaceRealization_4008((InterfaceRealization) domainElement))) {
			return InterfaceRealizationEditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getRealization().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassRealization_4010((Realization) domainElement))) {
			return RealizationEditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassGeneralization_4011((Generalization) domainElement))) {
			return Generalization2EditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getUsage().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassUsage_4013((Usage) domainElement))) {
			return UsageEditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramPackage_1000(Package element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePackage_2002(Package element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeClass_2001(Class element) {
		return Class_2001.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAssociationClass_2007(AssociationClass element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDataType_2004(DataType element) {
		return DataType_2004.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePrimitiveType_2005(PrimitiveType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEnumeration_2003(Enumeration element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInterface_2010(Interface element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeConstraint_2006(Constraint element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInstanceSpecification_2008(InstanceSpecification element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDependency_2009(Dependency element) {
		return Dependency_2009.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeGeneralizationSet_2012(GeneralizationSet element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInterface_2013(Interface element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePackage_3006(Package element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeClass_3007(Class element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDataType_3008(DataType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePrimitiveType_3009(PrimitiveType element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEnumeration_3011(Enumeration element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAssociationClass_3012(AssociationClass element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInstanceSpecification_3013(InstanceSpecification element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeProperty_3001(Property element) {
		return Property_3001.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOperation_3002(Operation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeClass_3003(Class element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePort_3025(Port element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRedefinableTemplateSignature_3027(RedefinableTemplateSignature element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeProperty_3019(Property element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOperation_3020(Operation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeProperty_3014(Property element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOperation_3015(Operation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeProperty_3021(Property element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOperation_3022(Operation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeEnumerationLiteral_3016(EnumerationLiteral element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeProperty_3023(Property element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOperation_3024(Operation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeSlot_3017(Slot element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeProperty_3028(Property element) {
		return Property_3028.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOperation_3029(Operation element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeClass_3030(Class element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackage_2002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClass_2001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAssociationClass_2007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDataType_2004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPrimitiveType_2005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEnumeration_2003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterface_2010ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedConstraint_2006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInstanceSpecification_2008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDependency_2009ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedGeneralizationSet_2012ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterface_2013ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackage_3006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClass_3007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDataType_3008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPrimitiveType_3009ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEnumeration_3011ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAssociationClass_3012ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInstanceSpecification_3013ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_3001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOperation_3002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClass_3003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPort_3025ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRedefinableTemplateSignature_3027ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_3019ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOperation_3020ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_3014ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOperation_3015ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_3021ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOperation_3022ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEnumerationLiteral_3016ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_3023ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOperation_3024ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedSlot_3017ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_3028ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOperation_3029ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClass_3030ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackagePackages_7010ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackageClassifiers_7011ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackageOther_7012ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClassAttributes_7001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClassOperations_7002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedClassClasses_7003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAssociationClassAttributes_7024ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAssociationClassOperations_7025ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAssociationClassClasses_7026ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDataTypeAttributes_7017ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDataTypeOperations_7018ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPrimitiveTypeAttributes_7020ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPrimitiveTypeOperations_7021ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEnumerationLiterals_7013ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEnumerationAttributes_7014ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedEnumerationOperations_7015ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInstanceSpecificationSlots_7028ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterfaceAttributes_7029ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterfaceOperations_7030ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInterfaceClasses_7031ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackage_1000ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDependency_4002LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedProperty_4003LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAssociation_4005LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRealization_4010LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassGeneralization_4001(Generalization element) {
		return Generalization_4001.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassDependency_4002(Dependency element) {
		return Dependency_4002.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassProperty_4003(Property element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassAssociation_4005(Association element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassInterfaceRealization_4008(InterfaceRealization element) {
		return InterfaceRealization_4008.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassRealization_4010(Realization element) {
		return Realization_4010.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassGeneralization_4011(Generalization element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassUsage_4013(Usage element) {
		return Usage_4013.matches(element);
	}

	/**
	 * @generated
	 */
	private static final Matcher Property_3001 = new Matcher(UMLOCLFactory.getExpression("not oclIsKindOf(uml::Port)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getProperty()));

	/**
	 * @generated
	 */
	private static final Matcher Property_3028 = new Matcher(UMLOCLFactory.getExpression("not oclIsKindOf(uml::Port)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getProperty()));

	/**
	 * @generated
	 */
	private static final Matcher Class_2001 = new Matcher(UMLOCLFactory.getExpression("not oclIsKindOf(uml::AssociationClass) and not oclIsKindOf(uml::StateMachine)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getClass_()));

	/**
	 * @generated
	 */
	private static final Matcher DataType_2004 = new Matcher(UMLOCLFactory.getExpression("not oclIsKindOf(uml::PrimitiveType) and not oclIsKindOf(uml::Enumeration)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getDataType()));

	/**
	 * @generated
	 */
	private static final Matcher Dependency_2009 = new Matcher(UMLOCLFactory.getExpression("self.supplier->size() > 1 or self.client->size() > 1", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getDependency()));

	/**
	 * @generated
	 */
	private static final Matcher Generalization_4001 = new Matcher(UMLOCLFactory.getExpression("self.generalizationSet ->size() = 0", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getGeneralization()));

	/**
	 * @generated
	 */
	private static final Matcher Dependency_4002 = new Matcher(
			UMLOCLFactory
					.getExpression(
							"(self.oclIsTypeOf(uml::Dependency) or self.oclIsTypeOf(uml::Abstraction) or self.oclIsTypeOf(uml::Substitution) or self.oclIsTypeOf(uml::Usage)) and self.supplier->size() = 1 and self.client->size() = 1 and self.supplier->forAll(e|not e.oclIsKindOf(uml::Interface))", //$NON-NLS-1$
							UMLPackage.eINSTANCE.getDependency()));

	/**
	 * @generated
	 */
	private static final Matcher InterfaceRealization_4008 = new Matcher(UMLOCLFactory.getExpression("self.supplier->forAll(e|e.oclIsKindOf(uml::Interface))", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getInterfaceRealization()));

	/**
	 * @generated
	 */
	private static final Matcher Realization_4010 = new Matcher(UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::Realization)", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getRealization()));

	/**
	 * @generated
	 */
	private static final Matcher Usage_4013 = new Matcher(UMLOCLFactory.getExpression("self.supplier->forAll(e|e.oclIsKindOf(uml::Interface))", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getUsage()));

	/**
	 * @generated	
	 */
	static class Matcher {

		/**
		 * @generated	
		 */
		private UMLAbstractExpression condition;

		/**
		 * @generated	
		 */
		Matcher(UMLAbstractExpression conditionExpression) {
			this.condition = conditionExpression;
		}

		/**
		 * @generated	
		 */
		boolean matches(EObject object) {
			Object result = condition.evaluate(object);
			return result instanceof Boolean && ((Boolean) result).booleanValue();
		}
	}// Matcher
}
