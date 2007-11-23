package org.eclipse.uml2.diagram.profile.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImport2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationLiteralsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationNameEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ExtensionEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ExtensionLink_requiredEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Profile3EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileContentsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileName2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileNameEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileProfileLabelsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ReferencedMetaclassNode_classNameEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Stereotype2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeAttributesEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeConstraintsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeNameEditPart;
import org.eclipse.uml2.diagram.profile.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.profile.expressions.UMLOCLFactory;
import org.eclipse.uml2.uml.Profile;
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
	private static final UMLAbstractExpression Stereotype_2001_Constraint = UMLOCLFactory.getExpression(
			"generalization.general->forAll(e | e.oclIsKindOf(uml::Stereotype)) and\r\ngeneralization.specific->forAll(e | e.oclIsKindOf(uml::Stereotype))", UMLPackage.eINSTANCE.getStereotype());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ElementImport_2006_Constraint = UMLOCLFactory.getExpression(
			"self.importedElement.oclIsUndefined() or self.importedElement.oclAsType(uml::Class).isMetaclass()", UMLPackage.eINSTANCE.getElementImport());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Property_3001_Constraint = UMLOCLFactory.getExpression("self.association.oclIsUndefined() or not self.association.oclIsKindOf(uml::Extension)",
			UMLPackage.eINSTANCE.getProperty());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ElementImport_3009_Constraint = UMLOCLFactory.getExpression(
			"let imported : NamedElement = self.importedElement in \r\nimported.oclIsUndefined() or not imported.oclIsKindOf(Class) or not imported.oclAsType(Class).isMetaclass()\r\n",
			UMLPackage.eINSTANCE.getElementImport());

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProfileEditPart.MODEL_ID.equals(view.getType())) {
				return ProfileEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry.getVisualID(view.getType());
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
		if (UMLPackage.eINSTANCE.getProfile().isSuperTypeOf(domainElement.eClass()) && isDiagram((Profile) domainElement)) {
			return ProfileEditPart.VISUAL_ID;
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
		String containerModelID = org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!ProfileEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProfileEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProfileEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case StereotypeAttributesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getProperty().isSuperTypeOf(domainElement.eClass()) && evaluate(Property_3001_Constraint, domainElement)) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		case StereotypeConstraintsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass())) {
				return ConstraintEditPart.VISUAL_ID;
			}
			break;
		case ProfileContentsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStereotype().isSuperTypeOf(domainElement.eClass())) {
				return Stereotype2EditPart.VISUAL_ID;
			}
			break;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getEnumerationLiteral().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationLiteralEditPart.VISUAL_ID;
			}
			break;
		case ProfileProfileLabelsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass()) && evaluate(ElementImport_3009_Constraint, domainElement)) {
				return ElementImport2EditPart.VISUAL_ID;
			}
			break;
		case ProfileEditPart.VISUAL_ID:
			// We want to additionally show the Canvas Semantical Element in the auxiliary 
			// org.eclipse.uml2.diagram.profile.edit.parts.Profile3EditPart (that serves as a pure visual container for children). 
			// To do this, we modified CanonicalEditPolicy to add the Canvas semantic Element into the children 
			// list. The only remaining part is to return correct VID for this special case.

			if (containerView instanceof Diagram && domainElement != null && domainElement.equals(containerView.getElement())) {
				return Profile3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStereotype().isSuperTypeOf(domainElement.eClass()) && evaluate(Stereotype_2001_Constraint, domainElement)) {
				return StereotypeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getProfile().isSuperTypeOf(domainElement.eClass())) {
				return Profile2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getEnumeration().isSuperTypeOf(domainElement.eClass())) {
				return EnumerationEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getElementImport().isSuperTypeOf(domainElement.eClass()) && evaluate(ElementImport_2006_Constraint, domainElement)) {
				return ElementImportEditPart.VISUAL_ID;
			}
			// Diagram header is already processed above
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!ProfileEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProfileEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProfileEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case StereotypeEditPart.VISUAL_ID:
			if (StereotypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StereotypeAttributesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StereotypeConstraintsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Profile2EditPart.VISUAL_ID:
			if (ProfileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProfileContentsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationEditPart.VISUAL_ID:
			if (EnumerationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationLiteralsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementImportEditPart.VISUAL_ID:
			if (ReferencedMetaclassNode_classNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Profile3EditPart.VISUAL_ID:
			if (ProfileName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProfileProfileLabelsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StereotypeAttributesEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StereotypeConstraintsEditPart.VISUAL_ID:
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileContentsEditPart.VISUAL_ID:
			if (Stereotype2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			if (EnumerationLiteralEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileProfileLabelsEditPart.VISUAL_ID:
			if (ElementImport2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ProfileEditPart.VISUAL_ID:
			if (StereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Profile2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnumerationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementImportEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Profile3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtensionEditPart.VISUAL_ID:
			if (ExtensionLink_requiredEditPart.VISUAL_ID == nodeVisualID) {
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
		if (UMLPackage.eINSTANCE.getGeneralization().isSuperTypeOf(domainElement.eClass())) {
			return GeneralizationEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getExtension().isSuperTypeOf(domainElement.eClass())) {
			return ExtensionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Profile element) {
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
