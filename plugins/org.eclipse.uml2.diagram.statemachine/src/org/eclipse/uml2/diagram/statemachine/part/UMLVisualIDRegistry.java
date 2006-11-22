package org.eclipse.uml2.diagram.statemachine.part;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

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
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;

import org.eclipse.uml2.diagram.statemachine.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLOCLFactory;

import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
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
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (StateMachineEditPart.MODEL_ID.equals(view.getType())) {
				return StateMachineEditPart.VISUAL_ID;
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
		if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElementMetaclass) && isDiagramStateMachine_1000((StateMachine) domainElement)) {
			return StateMachineEditPart.VISUAL_ID;
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
		String containerModelID = getModelID(containerView);
		if (!StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StateMachineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case RegionEditPart.VISUAL_ID:
			if (RegionSubverticesEditPart.VISUAL_ID == nodeVisualID) {
				return RegionSubverticesEditPart.VISUAL_ID;
			}
			return getUnrecognizedRegion_2001ChildNodeID(domainElement, semanticHint);
		case Pseudostate9EditPart.VISUAL_ID:
			if (PseudostateNameEditPart.VISUAL_ID == nodeVisualID) {
				return PseudostateNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedPseudostate_2002ChildNodeID(domainElement, semanticHint);
		case Pseudostate10EditPart.VISUAL_ID:
			if (PseudostateName2EditPart.VISUAL_ID == nodeVisualID) {
				return PseudostateName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedPseudostate_2003ChildNodeID(domainElement, semanticHint);
		case StateEditPart.VISUAL_ID:
			if (StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return StateNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedState_3001ChildNodeID(domainElement, semanticHint);
		case State2EditPart.VISUAL_ID:
			if (StateName2EditPart.VISUAL_ID == nodeVisualID) {
				return StateName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Region2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRegion_3002((Region) domainElement))) {
				return Region2EditPart.VISUAL_ID;
			}
			return getUnrecognizedState_3012ChildNodeID(domainElement, semanticHint);
		case Region2EditPart.VISUAL_ID:
			if (RegionSubvertices2EditPart.VISUAL_ID == nodeVisualID) {
				return RegionSubvertices2EditPart.VISUAL_ID;
			}
			return getUnrecognizedRegion_3002ChildNodeID(domainElement, semanticHint);
		case FinalStateEditPart.VISUAL_ID:
			return getUnrecognizedFinalState_3003ChildNodeID(domainElement, semanticHint);
		case PseudostateEditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3004ChildNodeID(domainElement, semanticHint);
		case Pseudostate2EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3005ChildNodeID(domainElement, semanticHint);
		case Pseudostate3EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3006ChildNodeID(domainElement, semanticHint);
		case Pseudostate4EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3007ChildNodeID(domainElement, semanticHint);
		case Pseudostate5EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3008ChildNodeID(domainElement, semanticHint);
		case Pseudostate6EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3009ChildNodeID(domainElement, semanticHint);
		case Pseudostate7EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3010ChildNodeID(domainElement, semanticHint);
		case Pseudostate8EditPart.VISUAL_ID:
			return getUnrecognizedPseudostate_3011ChildNodeID(domainElement, semanticHint);
		case RegionSubverticesEditPart.VISUAL_ID:
			if ((semanticHint == null || StateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeState_3001((State) domainElement))) {
				return StateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || State2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeState_3012((State) domainElement))) {
				return State2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FinalStateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFinalState_3003((FinalState) domainElement))) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PseudostateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3004((Pseudostate) domainElement))) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3005((Pseudostate) domainElement))) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3006((Pseudostate) domainElement))) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3007((Pseudostate) domainElement))) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3008((Pseudostate) domainElement))) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3009((Pseudostate) domainElement))) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate7EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3010((Pseudostate) domainElement))) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate8EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3011((Pseudostate) domainElement))) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			return getUnrecognizedRegionSubvertices_7001ChildNodeID(domainElement, semanticHint);
		case RegionSubvertices2EditPart.VISUAL_ID:
			if ((semanticHint == null || StateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeState_3001((State) domainElement))) {
				return StateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || State2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeState_3012((State) domainElement))) {
				return State2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FinalStateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFinalState_3003((FinalState) domainElement))) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PseudostateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3004((Pseudostate) domainElement))) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3005((Pseudostate) domainElement))) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3006((Pseudostate) domainElement))) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3007((Pseudostate) domainElement))) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3008((Pseudostate) domainElement))) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3009((Pseudostate) domainElement))) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate7EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3010((Pseudostate) domainElement))) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate8EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_3011((Pseudostate) domainElement))) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			return getUnrecognizedRegionSubvertices_7003ChildNodeID(domainElement, semanticHint);
		case StateMachineEditPart.VISUAL_ID:
			if ((semanticHint == null || RegionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeRegion_2001((Region) domainElement))) {
				return RegionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate9EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_2002((Pseudostate) domainElement))) {
				return Pseudostate9EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate10EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePseudostate_2003((Pseudostate) domainElement))) {
				return Pseudostate10EditPart.VISUAL_ID;
			}
			return getUnrecognizedStateMachine_1000ChildNodeID(domainElement, semanticHint);
		}
		return -1;
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
		if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassTransition_4001((Transition) domainElement))) {
			return TransitionEditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramStateMachine_1000(StateMachine element) {
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
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRegion_2001(Region element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_2002(Pseudostate element) {
		return Pseudostate_2002.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_2003(Pseudostate element) {
		return Pseudostate_2003.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeState_3001(State element) {
		return State_3001.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeState_3012(State element) {
		return State_3012.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeRegion_3002(Region element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeFinalState_3003(FinalState element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3004(Pseudostate element) {
		return Pseudostate_3004.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3005(Pseudostate element) {
		return Pseudostate_3005.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3006(Pseudostate element) {
		return Pseudostate_3006.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3007(Pseudostate element) {
		return Pseudostate_3007.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3008(Pseudostate element) {
		return Pseudostate_3008.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3009(Pseudostate element) {
		return Pseudostate_3009.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3010(Pseudostate element) {
		return Pseudostate_3010.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePseudostate_3011(Pseudostate element) {
		return Pseudostate_3011.matches(element);
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRegion_2001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_2002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_2003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedState_3001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedState_3012ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRegion_3002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFinalState_3003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3009ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3010ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3011ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRegionSubvertices_7001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedRegionSubvertices_7003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedStateMachine_1000ChildNodeID(EObject domainElement, String semanticHint) {
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
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassTransition_4001(Transition element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static final Matcher State_3001 = new Matcher(UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isSimple", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getState()));

	/**
	 * @generated
	 */
	private static final Matcher State_3012 = new Matcher(UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isComposite", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getState()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3004 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::initial", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3005 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::shallowHistory", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3006 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::deepHistory", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3007 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::fork", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3008 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::join", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3009 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::junction", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3010 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::choice", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_3011 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::terminate", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_2002 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::entryPoint", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated
	 */
	private static final Matcher Pseudostate_2003 = new Matcher(UMLOCLFactory.getExpression("self.kind = PseudostateKind::exitPoint", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getPseudostate()));

	/**
	 * @generated	
	 */
	static class Matcher {

		/**
		 * @generated	
		 */
		private UMLAbstractExpression condition;

		/**
		 * @generated	
		 */
		Matcher(UMLAbstractExpression conditionExpression) {
			this.condition = conditionExpression;
		}

		/**
		 * @generated	
		 */
		boolean matches(EObject object) {
			Object result = condition.evaluate(object);
			return result instanceof Boolean && ((Boolean) result).booleanValue();
		}
	}// Matcher
}
