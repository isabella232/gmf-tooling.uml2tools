package org.eclipse.uml2.diagram.clazz.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.parts.*;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.ClassStereotypeEditPart;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.ElementImportEditPart;
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
import org.eclipse.uml2.diagram.clazz.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageName2EditPart;
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
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

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
	private static final UMLAbstractExpression Class_2001_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::AssociationClass) and not oclIsKindOf(uml::StateMachine)",
			UMLPackage.eINSTANCE.getClass_());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DataType_2004_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::PrimitiveType) and not oclIsKindOf(uml::Enumeration)", UMLPackage.eINSTANCE
			.getDataType());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Dependency_2009_Constraint = UMLOCLFactory.getExpression("self.supplier->size() > 1 or self.client->size() > 1", UMLPackage.eINSTANCE.getDependency());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_3001_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Slot_3017_Constraint = UMLOCLFactory.getExpression(
			"self.value->size() = 0 or not self.value->exists(v : ValueSpecification | v.oclIsKindOf(InstanceValue) and not v.oclAsType(InstanceValue).oclIsUndefined())", UMLPackage.eINSTANCE
					.getSlot());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_3028_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Class_3033_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::AssociationClass) and not oclIsKindOf(uml::StateMachine)",
			UMLPackage.eINSTANCE.getClass_());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DataType_3036_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::PrimitiveType) and not oclIsKindOf(uml::Enumeration)", UMLPackage.eINSTANCE
			.getDataType());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Generalization_4001_Constraint = UMLOCLFactory.getExpression("self.generalizationSet ->size() = 0", UMLPackage.eINSTANCE.getGeneralization());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Dependency_4002_Constraint = UMLOCLFactory
			.getExpression(
					"(self.oclIsTypeOf(uml::Dependency) or self.oclIsTypeOf(uml::Abstraction) or self.oclIsTypeOf(uml::Substitution) or self.oclIsTypeOf(uml::Usage)) and self.supplier->size() = 1 and self.client->size() = 1 and self.supplier->forAll(e|not e.oclIsKindOf(uml::Interface))",
					UMLPackage.eINSTANCE.getDependency());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_4003_Constraint = UMLOCLFactory.getExpression("self.association.oclIsTypeOf(uml::AssociationClass)", UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Association_4005_Constraint = UMLOCLFactory.getExpression("not self.oclIsTypeOf(uml::AssociationClass)", UMLPackage.eINSTANCE.getAssociation());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression InterfaceRealization_4008_Constraint = UMLOCLFactory.getExpression("self.supplier->forAll(e|e.oclIsKindOf(uml::Interface))", UMLPackage.eINSTANCE
			.getInterfaceRealization());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Realization_4010_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::Realization)", UMLPackage.eINSTANCE.getRealization());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Usage_4013_Constraint = UMLOCLFactory.getExpression("self.supplier->forAll(e|e.oclIsKindOf(uml::Interface))", UMLPackage.eINSTANCE.getUsage());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Slot_4015_Constraint = UMLOCLFactory.getExpression(
			"self.value->exists(v : ValueSpecification | v.oclIsKindOf(InstanceValue) and not v.oclAsType(InstanceValue).oclIsUndefined())", UMLPackage.eINSTANCE.getSlot());

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
		return org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getVisualID(view.getType());
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
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass()) && isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID) && !"UMLClass".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Class2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case AssociationClass2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case DataType2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveType2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case Enumeration2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case Class5EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case Enumeration3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case DataType3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case PrimitiveType3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElement.eClass())) {
				return RedefinableTemplateSignatureEditPart.VISUAL_ID;
			}
			break;
		case PackagePackagesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package3EditPart.VISUAL_ID;
			}
			break;
		case PackageClassifiersEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return ClassEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveTypeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElement.eClass())) {
				return AssociationClassEditPart.VISUAL_ID;
			}
			break;
		case PackageOtherEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElement.eClass())) {
				return InstanceSpecificationEditPart.VISUAL_ID;
			}
			break;
		case ClassAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3001_Constraint, domainElement)) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ClassOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case ClassClassesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return Class3EditPart.VISUAL_ID;
			}
			break;
		case AssociationClassAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property2EditPart.VISUAL_ID;
			}
			break;
		case AssociationClassOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation2EditPart.VISUAL_ID;
			}
			break;
		case AssociationClassClassesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return Class3EditPart.VISUAL_ID;
			}
			break;
		case DataTypeAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property3EditPart.VISUAL_ID;
			}
			break;
		case DataTypeOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation3EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property4EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation4EditPart.VISUAL_ID;
			}
			break;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationLiteralEditPart.VISUAL_ID;
			}
			break;
		case EnumerationAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property5EditPart.VISUAL_ID;
			}
			break;
		case EnumerationOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation5EditPart.VISUAL_ID;
			}
			break;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getSlot().isSuperTypeOf(domainElement.eClass()) && evaluate(Slot_3017_Constraint, domainElement)) {
				return SlotEditPart.VISUAL_ID;
			}
			break;
		case InterfaceAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3028_Constraint, domainElement)) {
				return Property6EditPart.VISUAL_ID;
			}
			break;
		case InterfaceOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation6EditPart.VISUAL_ID;
			}
			break;
		case InterfaceClassesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return Class4EditPart.VISUAL_ID;
			}
			break;
		case PackageImportsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass())) {
				return ElementImportEditPart.VISUAL_ID;
			}
			break;
		case PackageAsFrameContentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass()) && evaluate(Class_3033_Constraint, domainElement)) {
				return Class5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return Enumeration3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElement.eClass())) {
				return InstanceSpecification3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass()) && evaluate(DataType_3036_Constraint, domainElement)) {
				return DataType3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveType3EditPart.VISUAL_ID;
			}
			break;
		case PackageAsFrameContents2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass()) && evaluate(Class_3033_Constraint, domainElement)) {
				return Class5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return Enumeration3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElement.eClass())) {
				return InstanceSpecification3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass()) && evaluate(DataType_3036_Constraint, domainElement)) {
				return DataType3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveType3EditPart.VISUAL_ID;
			}
			break;
		case ClassAttributes2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3001_Constraint, domainElement)) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ClassOperations2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case ClassClasses2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return Class3EditPart.VISUAL_ID;
			}
			break;
		case EnumerationLiterals2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationLiteralEditPart.VISUAL_ID;
			}
			break;
		case EnumerationAttributes2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property5EditPart.VISUAL_ID;
			}
			break;
		case EnumerationOperations2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation5EditPart.VISUAL_ID;
			}
			break;
		case InstanceSpecificationSlots2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getSlot().isSuperTypeOf(domainElement.eClass()) && evaluate(Slot_3017_Constraint, domainElement)) {
				return SlotEditPart.VISUAL_ID;
			}
			break;
		case DataTypeAttributes2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property3EditPart.VISUAL_ID;
			}
			break;
		case DataTypeOperations2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation3EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveTypeAttributes2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass())) {
				return Property4EditPart.VISUAL_ID;
			}
			break;
		case PrimitiveTypeOperations2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return Operation4EditPart.VISUAL_ID;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			// We want to additionally show the Canvas Semantical Element in the auxiliary 
			// org.eclipse.uml2.diagram.clazz.edit.parts.Package4EditPart (that serves as a pure visual container for children). 
			// To do this, we modified CanonicalEditPolicy to add the Canvas semantic Element into the children 
			// list. The only remaining part is to return correct VID for this special case.

			if (containerView instanceof Diagram && domainElement != null && domainElement.equals(containerView.getElement())) {
				return Package4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass()) && evaluate(Class_2001_Constraint, domainElement)) {
				return Class2EditPart.VISUAL_ID;
			}
			// there is a group of nodes for single semantic element
			// the group for this element consists of 
			// org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart.VISUAL_ID
			// org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassRhombEditPart.VISUAL_ID
			// diagram updater is expected to return one node descriptor (and thus one instance of that semantic element) per node in group
			// we need to give other parts a chance to create their views
			if (UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElement.eClass()) && !hasViewChild(containerView, domainElement, AssociationClass2EditPart.VISUAL_ID)) {
				return AssociationClass2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass()) && evaluate(DataType_2004_Constraint, domainElement)) {
				return DataType2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElement.eClass())) {
				return PrimitiveType2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return Enumeration2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElement.eClass())) {
				return InstanceSpecification2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && evaluate(Dependency_2009_Constraint, domainElement)) {
				return DependencyEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getGeneralizationSet().isSuperTypeOf(domainElement.eClass())) {
				return GeneralizationSetEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return Interface2EditPart.VISUAL_ID;
			}
			// Diagram header is already processed above
			// there is a group of nodes for single semantic element
			// the group for this element consists of 
			// org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClassRhombEditPart.VISUAL_ID
			// org.eclipse.uml2.diagram.clazz.edit.parts.AssociationClass2EditPart.VISUAL_ID
			// diagram updater is expected to return one node descriptor (and thus one instance of that semantic element) per node in group
			// we need to give other parts a chance to create their views
			if (UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElement.eClass()) && !hasViewChild(containerView, domainElement, AssociationClassRhombEditPart.VISUAL_ID)) {
				return AssociationClassRhombEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass())) {
				return PackageAsFrameEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElement.eClass())) {
				return InstanceSpecification4EditPart.VISUAL_ID;
			}
			// "escape" for multi-views part : org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart.VISUAL_ID -- prevents from removing the whole group from diagram
			if (UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElement.eClass())) {
				return AssociationClass2EditPart.VISUAL_ID;
			}
			// "escape" for multi-views part : org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart.VISUAL_ID -- prevents from removing the whole group from diagram
			if (UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElement.eClass())) {
				return AssociationClassRhombEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID) && !"UMLClass".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Package2EditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackagePackagesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageClassifiersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageOtherEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Class2EditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassStereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClassesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationClass2EditPart.VISUAL_ID:
			if (AssociationClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationClassAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationClassOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationClassClassesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataType2EditPart.VISUAL_ID:
			if (DataTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveType2EditPart.VISUAL_ID:
			if (PrimitiveTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Enumeration2EditPart.VISUAL_ID:
			if (EnumerationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationLiteralsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintEditPart.VISUAL_ID:
			if (ConstraintNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecification2EditPart.VISUAL_ID:
			if (InstanceSpecificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecificationSlotsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyEditPart.VISUAL_ID:
			if (DependencyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GeneralizationSetEditPart.VISUAL_ID:
			if (GeneralizationSetIsCoveringIsDisjointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeneralizationSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Interface2EditPart.VISUAL_ID:
			if (InterfaceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceOperationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceClassesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package4EditPart.VISUAL_ID:
			if (PackageName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageImportsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageAsFrameEditPart.VISUAL_ID:
			if (PackageName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageAsFrameContentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecification4EditPart.VISUAL_ID:
			if (InstanceSpecificationName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecificationValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortEditPart.VISUAL_ID:
			if (PortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RedefinableTemplateSignatureEditPart.VISUAL_ID:
			if (TemplateSignatureNode_signatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Package6EditPart.VISUAL_ID:
			if (PackageName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageAsFrameContents2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Class5EditPart.VISUAL_ID:
			if (ClassName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassQualifiedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassAttributes2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassOperations2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClasses2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Enumeration3EditPart.VISUAL_ID:
			if (EnumerationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationLiterals2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationAttributes2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationOperations2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecification3EditPart.VISUAL_ID:
			if (InstanceSpecificationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecificationSlots2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataType3EditPart.VISUAL_ID:
			if (DataTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeAttributes2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeOperations2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveType3EditPart.VISUAL_ID:
			if (PrimitiveTypeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeAttributes2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeOperations2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackagePackagesEditPart.VISUAL_ID:
			if (Package3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageClassifiersEditPart.VISUAL_ID:
			if (ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageOtherEditPart.VISUAL_ID:
			if (InstanceSpecificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassAttributesEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClassesEditPart.VISUAL_ID:
			if (Class3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationClassAttributesEditPart.VISUAL_ID:
			if (Property2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationClassOperationsEditPart.VISUAL_ID:
			if (Operation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationClassClassesEditPart.VISUAL_ID:
			if (Class3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeAttributesEditPart.VISUAL_ID:
			if (Property3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeOperationsEditPart.VISUAL_ID:
			if (Operation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			if (Property4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			if (Operation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			if (EnumerationLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationAttributesEditPart.VISUAL_ID:
			if (Property5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationOperationsEditPart.VISUAL_ID:
			if (Operation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			if (SlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceAttributesEditPart.VISUAL_ID:
			if (Property6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceOperationsEditPart.VISUAL_ID:
			if (Operation6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceClassesEditPart.VISUAL_ID:
			if (Class4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageImportsEditPart.VISUAL_ID:
			if (ElementImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageAsFrameContentsEditPart.VISUAL_ID:
			if (Package6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Class5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Enumeration3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecification3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageAsFrameContents2EditPart.VISUAL_ID:
			if (Package6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Class5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Enumeration3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecification3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassAttributes2EditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassOperations2EditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClasses2EditPart.VISUAL_ID:
			if (Class3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationLiterals2EditPart.VISUAL_ID:
			if (EnumerationLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationAttributes2EditPart.VISUAL_ID:
			if (Property5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationOperations2EditPart.VISUAL_ID:
			if (Operation5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecificationSlots2EditPart.VISUAL_ID:
			if (SlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeAttributes2EditPart.VISUAL_ID:
			if (Property3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataTypeOperations2EditPart.VISUAL_ID:
			if (Operation3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveTypeAttributes2EditPart.VISUAL_ID:
			if (Property4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimitiveTypeOperations2EditPart.VISUAL_ID:
			if (Operation4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Class2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationClass2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimitiveType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Enumeration2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecification2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DependencyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GeneralizationSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Interface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Package4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationClassRhombEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageAsFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecification4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Dependency2EditPart.VISUAL_ID:
			if (DependencyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DependencyName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property7EditPart.VISUAL_ID:
			if (PropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationEditPart.VISUAL_ID:
			if (AssociationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RealizationEditPart.VISUAL_ID:
			if (RealizationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssociationInstanceEditPart.VISUAL_ID:
			if (AssociationInstanceSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AssociationInstanceTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateBindingEditPart.VISUAL_ID:
			if (TemplateBinding_BindLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateParameterSubstitutionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass()) && evaluate(Generalization_4001_Constraint, domainElement)) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && evaluate(Dependency_4002_Constraint, domainElement)) {
			return Dependency2EditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_4003_Constraint, domainElement)) {
			return Property7EditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass()) && evaluate(Association_4005_Constraint, domainElement)) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getInterfaceRealization().isSuperTypeOf(domainElement.eClass()) && evaluate(InterfaceRealization_4008_Constraint, domainElement)) {
			return InterfaceRealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getRealization().isSuperTypeOf(domainElement.eClass()) && evaluate(Realization_4010_Constraint, domainElement)) {
			return RealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return Generalization2EditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getUsage().isSuperTypeOf(domainElement.eClass()) && evaluate(Usage_4013_Constraint, domainElement)) {
			return UsageEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElement.eClass())) {
			return AssociationClassConnectorEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getSlot().isSuperTypeOf(domainElement.eClass()) && evaluate(Slot_4015_Constraint, domainElement)) {
			return AssociationInstanceEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getTemplateBinding().isSuperTypeOf(domainElement.eClass())) {
			return TemplateBindingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean evaluate(UMLAbstractExpression expression, Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
		if (domainElement == null) {
			return false;
		}
		for (Object next : containerView.getChildren()) {
			View nextView = (View) next;
			if (domainElement.equals(nextView.getElement()) && getType(visualId).equals(nextView.getType())) {
				return true;
			}
		}
		return false;
	}

}
