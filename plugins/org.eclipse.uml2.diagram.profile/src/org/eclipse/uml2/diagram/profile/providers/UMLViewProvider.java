package org.eclipse.uml2.diagram.profile.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.profile.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ConstraintNameEditPart;
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
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.profile.view.factories.Constraint2ViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ConstraintConstrainedElementViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ConstraintNameViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ConstraintViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ElementImport2ViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ElementImportViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.EnumerationLiteralViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.EnumerationLiteralsViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.EnumerationNameViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.EnumerationViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ExtensionLink_requiredViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ExtensionViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.GeneralizationViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.Profile2ViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.Profile3ViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ProfileContentsViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ProfileName2ViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ProfileNameViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ProfileProfileLabelsViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ProfileViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.PropertyViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.ReferencedMetaclassNode_classNameViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.Stereotype2ViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.StereotypeAttributesViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.StereotypeConstraintsViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.StereotypeNameViewFactory;
import org.eclipse.uml2.diagram.profile.view.factories.StereotypeViewFactory;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (ProfileEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return ProfileViewFactory.class;
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
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && !UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
					return null; // visual id for node EClass should match visual id from element type, or at least be substitutable for it
				}
			} else {
				// Element type is not specified. Domain element should be present.
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!ProfileEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case StereotypeEditPart.VISUAL_ID:
				case Profile2EditPart.VISUAL_ID:
				case EnumerationEditPart.VISUAL_ID:
				case ElementImportEditPart.VISUAL_ID:
				case Profile3EditPart.VISUAL_ID:
				case Constraint2EditPart.VISUAL_ID:
				case PropertyEditPart.VISUAL_ID:
				case ConstraintEditPart.VISUAL_ID:
				case Stereotype2EditPart.VISUAL_ID:
				case EnumerationLiteralEditPart.VISUAL_ID:
				case ElementImport2EditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case StereotypeNameEditPart.VISUAL_ID:
				case StereotypeAttributesEditPart.VISUAL_ID:
				case StereotypeConstraintsEditPart.VISUAL_ID:
					if (StereotypeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ProfileNameEditPart.VISUAL_ID:
				case ProfileContentsEditPart.VISUAL_ID:
					if (Profile2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EnumerationNameEditPart.VISUAL_ID:
				case EnumerationLiteralsEditPart.VISUAL_ID:
					if (EnumerationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ReferencedMetaclassNode_classNameEditPart.VISUAL_ID:
					if (ElementImportEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ProfileName2EditPart.VISUAL_ID:
				case ProfileProfileLabelsEditPart.VISUAL_ID:
					if (Profile3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConstraintNameEditPart.VISUAL_ID:
					if (Constraint2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExtensionLink_requiredEditPart.VISUAL_ID:
					if (ExtensionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null || !UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case StereotypeEditPart.VISUAL_ID:
			return StereotypeViewFactory.class;
		case StereotypeNameEditPart.VISUAL_ID:
			return StereotypeNameViewFactory.class;
		case Profile2EditPart.VISUAL_ID:
			return Profile2ViewFactory.class;
		case ProfileNameEditPart.VISUAL_ID:
			return ProfileNameViewFactory.class;
		case EnumerationEditPart.VISUAL_ID:
			return EnumerationViewFactory.class;
		case EnumerationNameEditPart.VISUAL_ID:
			return EnumerationNameViewFactory.class;
		case ElementImportEditPart.VISUAL_ID:
			return ElementImportViewFactory.class;
		case ReferencedMetaclassNode_classNameEditPart.VISUAL_ID:
			return ReferencedMetaclassNode_classNameViewFactory.class;
		case Profile3EditPart.VISUAL_ID:
			return Profile3ViewFactory.class;
		case ProfileName2EditPart.VISUAL_ID:
			return ProfileName2ViewFactory.class;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint2ViewFactory.class;
		case ConstraintNameEditPart.VISUAL_ID:
			return ConstraintNameViewFactory.class;
		case PropertyEditPart.VISUAL_ID:
			return PropertyViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case Stereotype2EditPart.VISUAL_ID:
			return Stereotype2ViewFactory.class;
		case EnumerationLiteralEditPart.VISUAL_ID:
			return EnumerationLiteralViewFactory.class;
		case ElementImport2EditPart.VISUAL_ID:
			return ElementImport2ViewFactory.class;
		case StereotypeAttributesEditPart.VISUAL_ID:
			return StereotypeAttributesViewFactory.class;
		case StereotypeConstraintsEditPart.VISUAL_ID:
			return StereotypeConstraintsViewFactory.class;
		case ProfileContentsEditPart.VISUAL_ID:
			return ProfileContentsViewFactory.class;
		case EnumerationLiteralsEditPart.VISUAL_ID:
			return EnumerationLiteralsViewFactory.class;
		case ProfileProfileLabelsEditPart.VISUAL_ID:
			return ProfileProfileLabelsViewFactory.class;
		case ExtensionLink_requiredEditPart.VISUAL_ID:
			return ExtensionLink_requiredViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case GeneralizationEditPart.VISUAL_ID:
			return GeneralizationViewFactory.class;
		case ExtensionEditPart.VISUAL_ID:
			return ExtensionViewFactory.class;
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return ConstraintConstrainedElementViewFactory.class;
		}
		return null;
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

}
