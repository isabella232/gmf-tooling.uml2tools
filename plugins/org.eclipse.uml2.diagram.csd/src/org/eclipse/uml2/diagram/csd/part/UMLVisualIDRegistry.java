package org.eclipse.uml2.diagram.csd.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName4EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName5EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName6EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName7EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClass_contentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassQualifiedNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationContentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUse2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUseName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName4EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName5EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName6EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName7EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationSlotsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.SlotNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.csd.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.csd.expressions.UMLOCLFactory;
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
	private static final UMLAbstractExpression Class_2006_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::AssociationClass) and not oclIsKindOf(uml::StateMachine)",
			UMLPackage.eINSTANCE.getClass_());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Class_2007_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::AssociationClass) and not oclIsKindOf(uml::StateMachine)",
			UMLPackage.eINSTANCE.getClass_());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_3007_Constraint = UMLOCLFactory.getExpression("not self.oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_3008_Constraint = UMLOCLFactory.getExpression("not oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_3014_Constraint = UMLOCLFactory.getExpression("not self.oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Dependency_4006_Constraint = UMLOCLFactory.getExpression("not self.oclIsKindOf(uml::Usage) and not self.oclIsKindOf(uml::InterfaceRealization)",
			UMLPackage.eINSTANCE.getDependency());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression InterfaceRealization_4007_Constraint = UMLOCLFactory.getExpression("self.supplier->forAll(e|e.oclIsKindOf(uml::Interface))", UMLPackage.eINSTANCE
			.getInterfaceRealization());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Usage_4008_Constraint = UMLOCLFactory.getExpression("self.supplier->forAll(e|e.oclIsKindOf(uml::Interface))", UMLPackage.eINSTANCE.getUsage());

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
		return org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry.getVisualID(view.getType());
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
		String containerModelID = org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CollaborationEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case ClassEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getPort().isSuperTypeOf(domainElement.eClass())) {
				return PortEditPart.VISUAL_ID;
			}
			break;
		case Package2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass())) {
				return ElementImportEditPart.VISUAL_ID;
			}
			break;
		case CollaborationContentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getCollaborationUse().isSuperTypeOf(domainElement.eClass())) {
				return CollaborationUse2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3007_Constraint, domainElement)) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case ClassAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3008_Constraint, domainElement)) {
				return Property2EditPart.VISUAL_ID;
			}
			break;
		case ClassOperationsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case ClassClassesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass())) {
				return Class2EditPart.VISUAL_ID;
			}
			break;
		case ClassClass_contentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3014_Constraint, domainElement)) {
				return Property3EditPart.VISUAL_ID;
			}
			break;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getSlot().isSuperTypeOf(domainElement.eClass())) {
				return SlotEditPart.VISUAL_ID;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			// We want to additionally show the Canvas Semantical Element in the auxiliary 
			// org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart (that serves as a pure visual container for children). 
			// To do this, we modified CanonicalEditPolicy to add the Canvas semantic Element into the children 
			// list. The only remaining part is to return correct VID for this special case.

			if (containerView instanceof Diagram && domainElement != null && domainElement.equals(containerView.getElement())) {
				return Package2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCollaboration().isSuperTypeOf(domainElement.eClass())) {
				return CollaborationEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass()) && evaluate(Class_2006_Constraint, domainElement)) {
				return ClassEditPart.VISUAL_ID;
			}
			// Diagram header is already processed above
			if (UMLPackage.eINSTANCE.getClass_().isSuperTypeOf(domainElement.eClass()) && evaluate(Class_2007_Constraint, domainElement)) {
				return Class3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInterface().isSuperTypeOf(domainElement.eClass())) {
				return InterfaceEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInstanceSpecification().isSuperTypeOf(domainElement.eClass())) {
				return InstanceSpecificationEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CollaborationEditPart.VISUAL_ID:
			if (CollaborationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CollaborationContentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassEditPart.VISUAL_ID:
			if (ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassQualifiedNameEditPart.VISUAL_ID == nodeVisualID) {
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
			break;
		case Package2EditPart.VISUAL_ID:
			if (PackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PackageImportsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Class3EditPart.VISUAL_ID:
			if (ClassName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassClass_contentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InterfaceEditPart.VISUAL_ID:
			if (InterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecificationEditPart.VISUAL_ID:
			if (InstanceSpecificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecificationSlotsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintEditPart.VISUAL_ID:
			if (ConstraintNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborationUse2EditPart.VISUAL_ID:
			if (CollaborationUseName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (PropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterEditPart.VISUAL_ID:
			if (ParameterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PortEditPart.VISUAL_ID:
			if (PortNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Property3EditPart.VISUAL_ID:
			if (PropertyName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CollaborationContentsEditPart.VISUAL_ID:
			if (CollaborationUse2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassAttributesEditPart.VISUAL_ID:
			if (Property2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassOperationsEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClassesEditPart.VISUAL_ID:
			if (Class2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassClass_contentsEditPart.VISUAL_ID:
			if (Property3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			if (SlotEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (CollaborationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Package2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Class3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstanceSpecificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DependencyEditPart.VISUAL_ID:
			if (DependencyNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (UMLPackage.eINSTANCE.getConnector().isSuperTypeOf(domainElement.eClass())) {
			return ConnectorEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getDependency().isSuperTypeOf(domainElement.eClass()) && evaluate(Dependency_4006_Constraint, domainElement)) {
			return DependencyEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getInterfaceRealization().isSuperTypeOf(domainElement.eClass()) && evaluate(InterfaceRealization_4007_Constraint, domainElement)) {
			return InterfaceRealizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getUsage().isSuperTypeOf(domainElement.eClass()) && evaluate(Usage_4008_Constraint, domainElement)) {
			return UsageEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getAssociation().isSuperTypeOf(domainElement.eClass())) {
			return AssociationEditPart.VISUAL_ID;
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

}
