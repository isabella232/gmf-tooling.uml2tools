package org.eclipse.uml2.diagram.statemachine.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
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

import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

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
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = UMLVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
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
		case TransitionEditPart.VISUAL_ID:
			return TransitionViewFactory.class;
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
