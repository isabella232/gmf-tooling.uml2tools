package org.eclipse.uml2.diagram.sequence.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.edit.parts.ActionExecutionLabelEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.ActionExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.CombinedFragmentInteractionOperatorEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.CombinedFragmentMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.GateEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionNameEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionOperandMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionUseMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionUseSignatureEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LayeredCombinedFragmentEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LayeredInteractionUseEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LayeredOperandEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LifelineEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LifelineNameEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.LifelineRefLabelEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.MountingLinkEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.StateInvariantEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.StateInvariantLabelEditPart;
import org.eclipse.uml2.diagram.sequence.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.sequence.view.factories.ActionExecutionLabelViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.ActionExecutionSpecificationViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.BehaviorExecutionSpecificationViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.CombinedFragmentInteractionOperatorViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.CombinedFragmentMountingRegionViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.GateViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.InteractionNameViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.InteractionOperandMountingRegionViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.InteractionUseMountingRegionViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.InteractionUseSignatureViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.InteractionViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.LayeredCombinedFragmentViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.LayeredInteractionUseViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.LayeredOperandViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.LifelineNameViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.LifelineRefLabelViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.LifelineViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.MessageViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.MountingLinkViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.StateInvariantLabelViewFactory;
import org.eclipse.uml2.diagram.sequence.view.factories.StateInvariantViewFactory;

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
				if (!PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case InteractionEditPart.VISUAL_ID:
				case GateEditPart.VISUAL_ID:
				case LayeredInteractionUseEditPart.VISUAL_ID:
				case LayeredCombinedFragmentEditPart.VISUAL_ID:
				case LayeredOperandEditPart.VISUAL_ID:
				case LifelineEditPart.VISUAL_ID:
				case ActionExecutionSpecificationEditPart.VISUAL_ID:
				case StateInvariantEditPart.VISUAL_ID:
				case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
				case InteractionUseMountingRegionEditPart.VISUAL_ID:
				case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
				case InteractionOperandMountingRegionEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case InteractionNameEditPart.VISUAL_ID:
					if (InteractionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InteractionUseSignatureEditPart.VISUAL_ID:
					if (LayeredInteractionUseEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CombinedFragmentInteractionOperatorEditPart.VISUAL_ID:
					if (LayeredCombinedFragmentEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LifelineNameEditPart.VISUAL_ID:
				case LifelineRefLabelEditPart.VISUAL_ID:
					if (LifelineEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActionExecutionLabelEditPart.VISUAL_ID:
					if (ActionExecutionSpecificationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StateInvariantLabelEditPart.VISUAL_ID:
					if (StateInvariantEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case InteractionEditPart.VISUAL_ID:
			return InteractionViewFactory.class;
		case InteractionNameEditPart.VISUAL_ID:
			return InteractionNameViewFactory.class;
		case GateEditPart.VISUAL_ID:
			return GateViewFactory.class;
		case LayeredInteractionUseEditPart.VISUAL_ID:
			return LayeredInteractionUseViewFactory.class;
		case InteractionUseSignatureEditPart.VISUAL_ID:
			return InteractionUseSignatureViewFactory.class;
		case LayeredCombinedFragmentEditPart.VISUAL_ID:
			return LayeredCombinedFragmentViewFactory.class;
		case CombinedFragmentInteractionOperatorEditPart.VISUAL_ID:
			return CombinedFragmentInteractionOperatorViewFactory.class;
		case LayeredOperandEditPart.VISUAL_ID:
			return LayeredOperandViewFactory.class;
		case LifelineEditPart.VISUAL_ID:
			return LifelineViewFactory.class;
		case LifelineNameEditPart.VISUAL_ID:
			return LifelineNameViewFactory.class;
		case LifelineRefLabelEditPart.VISUAL_ID:
			return LifelineRefLabelViewFactory.class;
		case ActionExecutionSpecificationEditPart.VISUAL_ID:
			return ActionExecutionSpecificationViewFactory.class;
		case ActionExecutionLabelEditPart.VISUAL_ID:
			return ActionExecutionLabelViewFactory.class;
		case StateInvariantEditPart.VISUAL_ID:
			return StateInvariantViewFactory.class;
		case StateInvariantLabelEditPart.VISUAL_ID:
			return StateInvariantLabelViewFactory.class;
		case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
			return BehaviorExecutionSpecificationViewFactory.class;
		case InteractionUseMountingRegionEditPart.VISUAL_ID:
			return InteractionUseMountingRegionViewFactory.class;
		case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
			return CombinedFragmentMountingRegionViewFactory.class;
		case InteractionOperandMountingRegionEditPart.VISUAL_ID:
			return InteractionOperandMountingRegionViewFactory.class;
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
		case MessageEditPart.VISUAL_ID:
			return MessageViewFactory.class;
		case MountingLinkEditPart.VISUAL_ID:
			return MountingLinkViewFactory.class;
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
