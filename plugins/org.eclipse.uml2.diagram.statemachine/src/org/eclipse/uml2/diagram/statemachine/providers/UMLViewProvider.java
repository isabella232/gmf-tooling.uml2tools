package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeStateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeState_InternalActivitiesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.CompositeState_InternalTransitionsEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.DeepHistoryPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.DoActivityEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryActivityEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryConnectionPointReferenceEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryConnectionPointReferenceNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryPointPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.EntryPointPseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitActivityEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitConnectionPointReferenceEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitConnectionPointReferenceNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitPointPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ExitPointPseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ForkPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.InitialPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.InternalTransitionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.JoinPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.JunctionPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ShallowHistoryPseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleStateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SimpleState_InternalActivitiesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine_RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine_RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State_RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State_RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineStateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineStateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineState_InternalActivitiesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.SubmachineState_InternalTransitionsEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TerminatePseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ChoicePseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.statemachine.view.factories.CompositeStateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.CompositeStateStereotypeViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.CompositeStateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.CompositeState_InternalActivitiesViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.CompositeState_InternalTransitionsViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.DeepHistoryPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.DoActivityViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.EntryActivityViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.EntryConnectionPointReferenceNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.EntryConnectionPointReferenceViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.EntryPointPseudostateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.EntryPointPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ExitActivityViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ExitConnectionPointReferenceNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ExitConnectionPointReferenceViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ExitPointPseudostateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ExitPointPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.FinalStateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ForkPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.InitialPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.InternalTransitionViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.JoinPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.JunctionPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ShallowHistoryPseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SimpleStateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SimpleStateStereotypeViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SimpleStateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SimpleState_InternalActivitiesViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachineNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachineStereotypeViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachineViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachine_RegionSubverticesViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachine_RegionViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.State_RegionSubverticesViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.State_RegionViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SubmachineStateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SubmachineStateStereotypeViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SubmachineStateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SubmachineState_InternalActivitiesViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.SubmachineState_InternalTransitionsViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.TerminatePseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.TransitionNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.TransitionViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ChoicePseudostateViewFactory;

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
				case StateMachineEditPart.VISUAL_ID:
				case StateMachine_RegionEditPart.VISUAL_ID:
				case SimpleStateEditPart.VISUAL_ID:
				case EntryActivityEditPart.VISUAL_ID:
				case ExitActivityEditPart.VISUAL_ID:
				case DoActivityEditPart.VISUAL_ID:
				case CompositeStateEditPart.VISUAL_ID:
				case State_RegionEditPart.VISUAL_ID:
				case SubmachineStateEditPart.VISUAL_ID:
				case EntryConnectionPointReferenceEditPart.VISUAL_ID:
				case ExitConnectionPointReferenceEditPart.VISUAL_ID:
				case InternalTransitionEditPart.VISUAL_ID:
				case FinalStateEditPart.VISUAL_ID:
				case InitialPseudostateEditPart.VISUAL_ID:
				case ShallowHistoryPseudostateEditPart.VISUAL_ID:
				case DeepHistoryPseudostateEditPart.VISUAL_ID:
				case ForkPseudostateEditPart.VISUAL_ID:
				case JoinPseudostateEditPart.VISUAL_ID:
				case JunctionPseudostateEditPart.VISUAL_ID:
				case ChoicePseudostateEditPart.VISUAL_ID:
				case TerminatePseudostateEditPart.VISUAL_ID:
				case EntryPointPseudostateEditPart.VISUAL_ID:
				case ExitPointPseudostateEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case StateMachineNameEditPart.VISUAL_ID:
				case StateMachineStereotypeEditPart.VISUAL_ID:
					if (StateMachineEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StateMachine_RegionSubverticesEditPart.VISUAL_ID:
					if (StateMachine_RegionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SimpleStateNameEditPart.VISUAL_ID:
				case SimpleStateStereotypeEditPart.VISUAL_ID:
				case SimpleState_InternalActivitiesEditPart.VISUAL_ID:
					if (SimpleStateEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CompositeStateNameEditPart.VISUAL_ID:
				case CompositeStateStereotypeEditPart.VISUAL_ID:
				case CompositeState_InternalActivitiesEditPart.VISUAL_ID:
				case CompositeState_InternalTransitionsEditPart.VISUAL_ID:
					if (CompositeStateEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case State_RegionSubverticesEditPart.VISUAL_ID:
					if (State_RegionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SubmachineStateNameEditPart.VISUAL_ID:
				case SubmachineStateStereotypeEditPart.VISUAL_ID:
				case SubmachineState_InternalActivitiesEditPart.VISUAL_ID:
				case SubmachineState_InternalTransitionsEditPart.VISUAL_ID:
					if (SubmachineStateEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EntryConnectionPointReferenceNameEditPart.VISUAL_ID:
					if (EntryConnectionPointReferenceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExitConnectionPointReferenceNameEditPart.VISUAL_ID:
					if (ExitConnectionPointReferenceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case EntryPointPseudostateNameEditPart.VISUAL_ID:
					if (EntryPointPseudostateEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExitPointPseudostateNameEditPart.VISUAL_ID:
					if (ExitPointPseudostateEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case TransitionNameEditPart.VISUAL_ID:
					if (TransitionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case StateMachineEditPart.VISUAL_ID:
			return StateMachineViewFactory.class;
		case StateMachineNameEditPart.VISUAL_ID:
			return StateMachineNameViewFactory.class;
		case StateMachineStereotypeEditPart.VISUAL_ID:
			return StateMachineStereotypeViewFactory.class;
		case StateMachine_RegionEditPart.VISUAL_ID:
			return StateMachine_RegionViewFactory.class;
		case SimpleStateEditPart.VISUAL_ID:
			return SimpleStateViewFactory.class;
		case SimpleStateNameEditPart.VISUAL_ID:
			return SimpleStateNameViewFactory.class;
		case SimpleStateStereotypeEditPart.VISUAL_ID:
			return SimpleStateStereotypeViewFactory.class;
		case EntryActivityEditPart.VISUAL_ID:
			return EntryActivityViewFactory.class;
		case ExitActivityEditPart.VISUAL_ID:
			return ExitActivityViewFactory.class;
		case DoActivityEditPart.VISUAL_ID:
			return DoActivityViewFactory.class;
		case CompositeStateEditPart.VISUAL_ID:
			return CompositeStateViewFactory.class;
		case CompositeStateNameEditPart.VISUAL_ID:
			return CompositeStateNameViewFactory.class;
		case CompositeStateStereotypeEditPart.VISUAL_ID:
			return CompositeStateStereotypeViewFactory.class;
		case State_RegionEditPart.VISUAL_ID:
			return State_RegionViewFactory.class;
		case SubmachineStateEditPart.VISUAL_ID:
			return SubmachineStateViewFactory.class;
		case SubmachineStateNameEditPart.VISUAL_ID:
			return SubmachineStateNameViewFactory.class;
		case SubmachineStateStereotypeEditPart.VISUAL_ID:
			return SubmachineStateStereotypeViewFactory.class;
		case EntryConnectionPointReferenceEditPart.VISUAL_ID:
			return EntryConnectionPointReferenceViewFactory.class;
		case EntryConnectionPointReferenceNameEditPart.VISUAL_ID:
			return EntryConnectionPointReferenceNameViewFactory.class;
		case ExitConnectionPointReferenceEditPart.VISUAL_ID:
			return ExitConnectionPointReferenceViewFactory.class;
		case ExitConnectionPointReferenceNameEditPart.VISUAL_ID:
			return ExitConnectionPointReferenceNameViewFactory.class;
		case InternalTransitionEditPart.VISUAL_ID:
			return InternalTransitionViewFactory.class;
		case FinalStateEditPart.VISUAL_ID:
			return FinalStateViewFactory.class;
		case InitialPseudostateEditPart.VISUAL_ID:
			return InitialPseudostateViewFactory.class;
		case ShallowHistoryPseudostateEditPart.VISUAL_ID:
			return ShallowHistoryPseudostateViewFactory.class;
		case DeepHistoryPseudostateEditPart.VISUAL_ID:
			return DeepHistoryPseudostateViewFactory.class;
		case ForkPseudostateEditPart.VISUAL_ID:
			return ForkPseudostateViewFactory.class;
		case JoinPseudostateEditPart.VISUAL_ID:
			return JoinPseudostateViewFactory.class;
		case JunctionPseudostateEditPart.VISUAL_ID:
			return JunctionPseudostateViewFactory.class;
		case ChoicePseudostateEditPart.VISUAL_ID:
			return ChoicePseudostateViewFactory.class;
		case TerminatePseudostateEditPart.VISUAL_ID:
			return TerminatePseudostateViewFactory.class;
		case EntryPointPseudostateEditPart.VISUAL_ID:
			return EntryPointPseudostateViewFactory.class;
		case EntryPointPseudostateNameEditPart.VISUAL_ID:
			return EntryPointPseudostateNameViewFactory.class;
		case ExitPointPseudostateEditPart.VISUAL_ID:
			return ExitPointPseudostateViewFactory.class;
		case ExitPointPseudostateNameEditPart.VISUAL_ID:
			return ExitPointPseudostateNameViewFactory.class;
		case StateMachine_RegionSubverticesEditPart.VISUAL_ID:
			return StateMachine_RegionSubverticesViewFactory.class;
		case SimpleState_InternalActivitiesEditPart.VISUAL_ID:
			return SimpleState_InternalActivitiesViewFactory.class;
		case CompositeState_InternalActivitiesEditPart.VISUAL_ID:
			return CompositeState_InternalActivitiesViewFactory.class;
		case CompositeState_InternalTransitionsEditPart.VISUAL_ID:
			return CompositeState_InternalTransitionsViewFactory.class;
		case State_RegionSubverticesEditPart.VISUAL_ID:
			return State_RegionSubverticesViewFactory.class;
		case SubmachineState_InternalActivitiesEditPart.VISUAL_ID:
			return SubmachineState_InternalActivitiesViewFactory.class;
		case SubmachineState_InternalTransitionsEditPart.VISUAL_ID:
			return SubmachineState_InternalTransitionsViewFactory.class;
		case TransitionNameEditPart.VISUAL_ID:
			return TransitionNameViewFactory.class;
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
		case TransitionEditPart.VISUAL_ID:
			return TransitionViewFactory.class;
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
