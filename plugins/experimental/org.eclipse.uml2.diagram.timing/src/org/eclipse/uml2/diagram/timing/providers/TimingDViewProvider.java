package org.eclipse.uml2.diagram.timing.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameContainerEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DFrameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DIntervalDurationEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DIntervalEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DTickEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineDisplayNameEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.view.factories.DBlockDisplayNameViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DBlockViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DFrameContainerViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DFrameDisplayNameViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DFrameViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DIntervalDurationViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DIntervalViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DMessageDisplayNameViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DMessageViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DSegmentEndViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DSegmentMiddlePointViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DSegmentStartViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DSegmentViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DStateSwitchViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DTickViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DValueLineDisplayNameViewFactory;
import org.eclipse.uml2.diagram.timing.view.factories.DValueLineViewFactory;

/**
 * @generated
 */

public class TimingDViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (DFrameContainerEditPart.MODEL_ID.equals(diagramKind) && TimingDVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return DFrameContainerViewFactory.class;
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
			visualID = TimingDVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = TimingDVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!TimingDElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && !TimingDVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
					return null; // visual id for node EClass should match visual id from element type, or at least be substitutable for it
				}
			} else {
				// Element type is not specified. Domain element should be present.
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!DFrameContainerEditPart.MODEL_ID.equals(TimingDVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case DFrameEditPart.VISUAL_ID:
				case DBlockEditPart.VISUAL_ID:
				case DValueLineEditPart.VISUAL_ID:
				case DSegmentEditPart.VISUAL_ID:
				case DSegmentMiddlePointEditPart.VISUAL_ID:
				case DSegmentStartEditPart.VISUAL_ID:
				case DSegmentEndEditPart.VISUAL_ID:
				case DTickEditPart.VISUAL_ID:
					if (domainElement == null || visualID != TimingDVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case DFrameDisplayNameEditPart.VISUAL_ID:
					if (DFrameEditPart.VISUAL_ID != TimingDVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DBlockDisplayNameEditPart.VISUAL_ID:
					if (DBlockEditPart.VISUAL_ID != TimingDVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DValueLineDisplayNameEditPart.VISUAL_ID:
					if (DValueLineEditPart.VISUAL_ID != TimingDVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DMessageDisplayNameEditPart.VISUAL_ID:
					if (DMessageEditPart.VISUAL_ID != TimingDVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DIntervalDurationEditPart.VISUAL_ID:
					if (DIntervalEditPart.VISUAL_ID != TimingDVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		if (containerView == null || !TimingDVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case DFrameEditPart.VISUAL_ID:
			return DFrameViewFactory.class;
		case DFrameDisplayNameEditPart.VISUAL_ID:
			return DFrameDisplayNameViewFactory.class;
		case DBlockEditPart.VISUAL_ID:
			return DBlockViewFactory.class;
		case DBlockDisplayNameEditPart.VISUAL_ID:
			return DBlockDisplayNameViewFactory.class;
		case DValueLineEditPart.VISUAL_ID:
			return DValueLineViewFactory.class;
		case DValueLineDisplayNameEditPart.VISUAL_ID:
			return DValueLineDisplayNameViewFactory.class;
		case DSegmentEditPart.VISUAL_ID:
			return DSegmentViewFactory.class;
		case DSegmentMiddlePointEditPart.VISUAL_ID:
			return DSegmentMiddlePointViewFactory.class;
		case DSegmentStartEditPart.VISUAL_ID:
			return DSegmentStartViewFactory.class;
		case DSegmentEndEditPart.VISUAL_ID:
			return DSegmentEndViewFactory.class;
		case DTickEditPart.VISUAL_ID:
			return DTickViewFactory.class;
		case DMessageDisplayNameEditPart.VISUAL_ID:
			return DMessageDisplayNameViewFactory.class;
		case DIntervalDurationEditPart.VISUAL_ID:
			return DIntervalDurationViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!TimingDElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = TimingDVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != TimingDVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case DStateSwitchEditPart.VISUAL_ID:
			return DStateSwitchViewFactory.class;
		case DMessageEditPart.VISUAL_ID:
			return DMessageViewFactory.class;
		case DIntervalEditPart.VISUAL_ID:
			return DIntervalViewFactory.class;
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
