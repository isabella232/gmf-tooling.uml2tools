package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReference2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.ConnectionPointReferenceNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate10EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate9EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Region2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubvertices2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.RegionSubverticesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionNameEditPart;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.statemachine.view.factories.ConnectionPointReference2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ConnectionPointReferenceName2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ConnectionPointReferenceNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.ConnectionPointReferenceViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.FinalStateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate10ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate3ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate4ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate5ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate6ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate7ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate8ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Pseudostate9ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.PseudostateName2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.PseudostateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.PseudostateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.Region2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.RegionSubvertices2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.RegionSubverticesViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.RegionViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.State2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.State3ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachine2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachineNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateMachineViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateName2ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateName3ViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.StateViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.TransitionNameViewFactory;
import org.eclipse.uml2.diagram.statemachine.view.factories.TransitionViewFactory;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (StateMachineEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return StateMachineViewFactory.class;
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
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				if (!UMLElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
					return null;
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null;
				}
				if (domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null;
				}
			} else {
				switch (visualID) {
				case StateMachineEditPart.VISUAL_ID:
				case StateMachine2EditPart.VISUAL_ID:
				case RegionEditPart.VISUAL_ID:
				case StateEditPart.VISUAL_ID:
				case State2EditPart.VISUAL_ID:
				case Region2EditPart.VISUAL_ID:
				case State3EditPart.VISUAL_ID:
				case ConnectionPointReferenceEditPart.VISUAL_ID:
				case ConnectionPointReference2EditPart.VISUAL_ID:
				case FinalStateEditPart.VISUAL_ID:
				case PseudostateEditPart.VISUAL_ID:
				case Pseudostate2EditPart.VISUAL_ID:
				case Pseudostate3EditPart.VISUAL_ID:
				case Pseudostate4EditPart.VISUAL_ID:
				case Pseudostate5EditPart.VISUAL_ID:
				case Pseudostate6EditPart.VISUAL_ID:
				case Pseudostate7EditPart.VISUAL_ID:
				case Pseudostate8EditPart.VISUAL_ID:
				case Pseudostate9EditPart.VISUAL_ID:
				case Pseudostate10EditPart.VISUAL_ID:
				case TransitionEditPart.VISUAL_ID:
					return null;
				}
			}
		}
		if (!UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case StateMachine2EditPart.VISUAL_ID:
			return StateMachine2ViewFactory.class;
		case StateMachineNameEditPart.VISUAL_ID:
			return StateMachineNameViewFactory.class;
		case RegionEditPart.VISUAL_ID:
			return RegionViewFactory.class;
		case StateEditPart.VISUAL_ID:
			return StateViewFactory.class;
		case StateNameEditPart.VISUAL_ID:
			return StateNameViewFactory.class;
		case State2EditPart.VISUAL_ID:
			return State2ViewFactory.class;
		case StateName3EditPart.VISUAL_ID:
			return StateName3ViewFactory.class;
		case Region2EditPart.VISUAL_ID:
			return Region2ViewFactory.class;
		case State3EditPart.VISUAL_ID:
			return State3ViewFactory.class;
		case StateName2EditPart.VISUAL_ID:
			return StateName2ViewFactory.class;
		case ConnectionPointReferenceEditPart.VISUAL_ID:
			return ConnectionPointReferenceViewFactory.class;
		case ConnectionPointReferenceNameEditPart.VISUAL_ID:
			return ConnectionPointReferenceNameViewFactory.class;
		case ConnectionPointReference2EditPart.VISUAL_ID:
			return ConnectionPointReference2ViewFactory.class;
		case ConnectionPointReferenceName2EditPart.VISUAL_ID:
			return ConnectionPointReferenceName2ViewFactory.class;
		case FinalStateEditPart.VISUAL_ID:
			return FinalStateViewFactory.class;
		case PseudostateEditPart.VISUAL_ID:
			return PseudostateViewFactory.class;
		case Pseudostate2EditPart.VISUAL_ID:
			return Pseudostate2ViewFactory.class;
		case Pseudostate3EditPart.VISUAL_ID:
			return Pseudostate3ViewFactory.class;
		case Pseudostate4EditPart.VISUAL_ID:
			return Pseudostate4ViewFactory.class;
		case Pseudostate5EditPart.VISUAL_ID:
			return Pseudostate5ViewFactory.class;
		case Pseudostate6EditPart.VISUAL_ID:
			return Pseudostate6ViewFactory.class;
		case Pseudostate7EditPart.VISUAL_ID:
			return Pseudostate7ViewFactory.class;
		case Pseudostate8EditPart.VISUAL_ID:
			return Pseudostate8ViewFactory.class;
		case Pseudostate9EditPart.VISUAL_ID:
			return Pseudostate9ViewFactory.class;
		case PseudostateNameEditPart.VISUAL_ID:
			return PseudostateNameViewFactory.class;
		case Pseudostate10EditPart.VISUAL_ID:
			return Pseudostate10ViewFactory.class;
		case PseudostateName2EditPart.VISUAL_ID:
			return PseudostateName2ViewFactory.class;
		case RegionSubverticesEditPart.VISUAL_ID:
			return RegionSubverticesViewFactory.class;
		case RegionSubvertices2EditPart.VISUAL_ID:
			return RegionSubvertices2ViewFactory.class;
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
		if (elementType == null) {
			return null;
		}
		if (!UMLElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
			return null;
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null;
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null;
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null;
		}
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
