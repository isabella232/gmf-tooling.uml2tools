package org.eclipse.uml2.diagram.profile.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileNode_profileEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileProfileLabelsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.ReferencedMetaclassNode_classNameEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.Stereotype2EditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeAttributesEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeConstraintsEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.StereotypeNameEditPart;

import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;

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
import org.eclipse.uml2.diagram.profile.view.factories.ProfileNode_profileViewFactory;
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
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = UMLVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case StereotypeEditPart.VISUAL_ID:
			return StereotypeViewFactory.class;
		case StereotypeNameEditPart.VISUAL_ID:
			return StereotypeNameViewFactory.class;
		case Profile2EditPart.VISUAL_ID:
			return Profile2ViewFactory.class;
		case ProfileNode_profileEditPart.VISUAL_ID:
			return ProfileNode_profileViewFactory.class;
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
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
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
		case ExtensionEditPart.VISUAL_ID:
			return ExtensionViewFactory.class;
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
