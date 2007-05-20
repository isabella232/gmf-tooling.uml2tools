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
	private static final UMLAbstractExpression Property_3028_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getProperty());

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
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass) && isDiagram((Package) domainElement)) {
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
		String containerModelID = org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = 1000;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry.getVisualID(semanticHint) : -1;
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
			if ((semanticHint == null || PortEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElementMetaclass)) {
				return PortEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)) {
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
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)) {
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
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)) {
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
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)) {
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
					&& UMLPackage.eINSTANCE.getRedefinableTemplateSignature().isSuperTypeOf(domainElementMetaclass)) {
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
			if ((semanticHint == null || Package3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass)) {
				return Package3EditPart.VISUAL_ID;
			}
			return getUnrecognizedPackagePackages_7010ChildNodeID(domainElement, semanticHint);
		case PackageClassifiersEditPart.VISUAL_ID:
			if ((semanticHint == null || ClassEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)) {
				return ClassEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataTypeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElementMetaclass)) {
				return DataTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PrimitiveTypeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElementMetaclass)) {
				return PrimitiveTypeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || EnumerationEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElementMetaclass)) {
				return EnumerationEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AssociationClassEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElementMetaclass)) {
				return AssociationClassEditPart.VISUAL_ID;
			}
			return getUnrecognizedPackageClassifiers_7011ChildNodeID(domainElement, semanticHint);
		case PackageOtherEditPart.VISUAL_ID:
			if ((semanticHint == null || InstanceSpecificationEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElementMetaclass)) {
				return InstanceSpecificationEditPart.VISUAL_ID;
			}
			return getUnrecognizedPackageOther_7012ChildNodeID(domainElement, semanticHint);
		case ClassAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || PropertyEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Property_3001_Constraint, domainElement))) {
				return PropertyEditPart.VISUAL_ID;
			}
			return getUnrecognizedClassAttributes_7001ChildNodeID(domainElement, semanticHint);
		case ClassOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || OperationEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)) {
				return OperationEditPart.VISUAL_ID;
			}
			return getUnrecognizedClassOperations_7002ChildNodeID(domainElement, semanticHint);
		case ClassClassesEditPart.VISUAL_ID:
			if ((semanticHint == null || Class3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)) {
				return Class3EditPart.VISUAL_ID;
			}
			return getUnrecognizedClassClasses_7003ChildNodeID(domainElement, semanticHint);
		case AssociationClassAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)) {
				return Property2EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClassAttributes_7024ChildNodeID(domainElement, semanticHint);
		case AssociationClassOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)) {
				return Operation2EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClassOperations_7025ChildNodeID(domainElement, semanticHint);
		case AssociationClassClassesEditPart.VISUAL_ID:
			if ((semanticHint == null || Class3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)) {
				return Class3EditPart.VISUAL_ID;
			}
			return getUnrecognizedAssociationClassClasses_7026ChildNodeID(domainElement, semanticHint);
		case DataTypeAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)) {
				return Property3EditPart.VISUAL_ID;
			}
			return getUnrecognizedDataTypeAttributes_7017ChildNodeID(domainElement, semanticHint);
		case DataTypeOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)) {
				return Operation3EditPart.VISUAL_ID;
			}
			return getUnrecognizedDataTypeOperations_7018ChildNodeID(domainElement, semanticHint);
		case PrimitiveTypeAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)) {
				return Property4EditPart.VISUAL_ID;
			}
			return getUnrecognizedPrimitiveTypeAttributes_7020ChildNodeID(domainElement, semanticHint);
		case PrimitiveTypeOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)) {
				return Operation4EditPart.VISUAL_ID;
			}
			return getUnrecognizedPrimitiveTypeOperations_7021ChildNodeID(domainElement, semanticHint);
		case EnumerationLiteralsEditPart.VISUAL_ID:
			if ((semanticHint == null || EnumerationLiteralEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElementMetaclass)) {
				return EnumerationLiteralEditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumerationLiterals_7013ChildNodeID(domainElement, semanticHint);
		case EnumerationAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)) {
				return Property5EditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumerationAttributes_7014ChildNodeID(domainElement, semanticHint);
		case EnumerationOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)) {
				return Operation5EditPart.VISUAL_ID;
			}
			return getUnrecognizedEnumerationOperations_7015ChildNodeID(domainElement, semanticHint);
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			if ((semanticHint == null || SlotEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getSlot().isSuperTypeOf(domainElementMetaclass)) {
				return SlotEditPart.VISUAL_ID;
			}
			return getUnrecognizedInstanceSpecificationSlots_7028ChildNodeID(domainElement, semanticHint);
		case InterfaceAttributesEditPart.VISUAL_ID:
			if ((semanticHint == null || Property6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Property_3028_Constraint, domainElement))) {
				return Property6EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterfaceAttributes_7029ChildNodeID(domainElement, semanticHint);
		case InterfaceOperationsEditPart.VISUAL_ID:
			if ((semanticHint == null || Operation6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElementMetaclass)) {
				return Operation6EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterfaceOperations_7030ChildNodeID(domainElement, semanticHint);
		case InterfaceClassesEditPart.VISUAL_ID:
			if ((semanticHint == null || Class4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)) {
				return Class4EditPart.VISUAL_ID;
			}
			return getUnrecognizedInterfaceClasses_7031ChildNodeID(domainElement, semanticHint);
		case PackageEditPart.VISUAL_ID:
			if ((semanticHint == null || Package2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass)) {
				return Package2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Class2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Class_2001_Constraint, domainElement))) {
				return Class2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AssociationClass2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAssociationClass().isSuperTypeOf(domainElementMetaclass)) {
				return AssociationClass2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataType2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(DataType_2004_Constraint, domainElement))) {
				return DataType2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PrimitiveType2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPrimitiveType().isSuperTypeOf(domainElementMetaclass)) {
				return PrimitiveType2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Enumeration2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElementMetaclass)) {
				return Enumeration2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InterfaceEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ConstraintEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElementMetaclass)) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InstanceSpecification2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElementMetaclass)) {
				return InstanceSpecification2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DependencyEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Dependency_2009_Constraint, domainElement))) {
				return DependencyEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || GeneralizationSetEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getGeneralizationSet().isSuperTypeOf(domainElementMetaclass)) {
				return GeneralizationSetEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Interface2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElementMetaclass)) {
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
		return getUnrecognizedNodeID(containerView, domainElement);
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
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || evaluate(Generalization_4001_Constraint, domainElement))) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || evaluate(Dependency_4002_Constraint, domainElement))) {
			return Dependency2EditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElementMetaclass)) {
			return Property7EditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElementMetaclass)) {
			return AssociationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getInterfaceRealization().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || evaluate(InterfaceRealization_4008_Constraint, domainElement))) {
			return InterfaceRealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getRealization().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || evaluate(Realization_4010_Constraint, domainElement))) {
			return RealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElementMetaclass)) {
			return Generalization2EditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getUsage().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || evaluate(Usage_4013_Constraint, domainElement))) {
			return UsageEditPart.VISUAL_ID;
		}
		return getUnrecognizedLinkWithClassID(domainElement);
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
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedNodeID(View containerView, EObject domainElement) {
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
	 * @generated
	 */
	private static boolean evaluate(UMLAbstractExpression expression, Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
