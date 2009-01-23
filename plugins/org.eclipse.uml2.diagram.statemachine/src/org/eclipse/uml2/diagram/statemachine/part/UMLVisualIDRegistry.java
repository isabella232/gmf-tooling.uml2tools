package org.eclipse.uml2.diagram.statemachine.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Behavior2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Behavior3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.BehaviorEditPart;
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
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateCompositeState_InternalActivities2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateCompositeState_InternalActivitiesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateCompositeState_InternalTransitions2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateCompositeState_InternalTransitionsEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateName3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateNameEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateSimpleState_InternalActivitiesEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateStereotype2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateStereotype3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateStereotypeEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Transition2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.TransitionNameEditPart;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLOCLFactory;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.State;
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
	private static final String DEBUG_KEY = "org.eclipse.uml2.diagram.statemachine/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static UMLAbstractExpression State_3001_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Behavior_3019_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Behavior_3020_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Behavior_3021_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression State_3012_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression State_3016_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ConnectionPointReference_3017_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ConnectionPointReference_3018_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3004_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3005_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3006_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3007_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3008_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3009_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3010_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3011_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Transition_3022_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3014_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pseudostate_3015_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Transition_4001_Constraint;

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
		return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getVisualID(view.getType());
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
			return StateMachineEditPart.VISUAL_ID;
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
		String containerModelID = org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StateMachineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case StateMachine2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return RegionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3014((Pseudostate) domainElement)) {
				return Pseudostate9EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3015((Pseudostate) domainElement)) {
				return Pseudostate10EditPart.VISUAL_ID;
			}
			break;
		case State2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return Region2EditPart.VISUAL_ID;
			}
			break;
		case State3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return Region2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConnectionPointReference().isSuperTypeOf(domainElement.eClass()) && isConnectionPointReference_3017((ConnectionPointReference) domainElement)) {
				return ConnectionPointReferenceEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConnectionPointReference().isSuperTypeOf(domainElement.eClass()) && isConnectionPointReference_3018((ConnectionPointReference) domainElement)) {
				return ConnectionPointReference2EditPart.VISUAL_ID;
			}
			break;
		case RegionSubverticesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3001((State) domainElement)) {
				return StateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3012((State) domainElement)) {
				return State2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3016((State) domainElement)) {
				return State3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3004((Pseudostate) domainElement)) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3005((Pseudostate) domainElement)) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3006((Pseudostate) domainElement)) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3007((Pseudostate) domainElement)) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3008((Pseudostate) domainElement)) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3009((Pseudostate) domainElement)) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3010((Pseudostate) domainElement)) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3011((Pseudostate) domainElement)) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			break;
		case StateSimpleState_InternalActivitiesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3019((Behavior) domainElement)) {
				return BehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3020((Behavior) domainElement)) {
				return Behavior2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3021((Behavior) domainElement)) {
				return Behavior3EditPart.VISUAL_ID;
			}
			break;
		case StateCompositeState_InternalActivitiesEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3019((Behavior) domainElement)) {
				return BehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3020((Behavior) domainElement)) {
				return Behavior2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3021((Behavior) domainElement)) {
				return Behavior3EditPart.VISUAL_ID;
			}
			break;
		case StateCompositeState_InternalTransitionsEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass()) && isTransition_3022((Transition) domainElement)) {
				return Transition2EditPart.VISUAL_ID;
			}
			break;
		case RegionSubvertices2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3001((State) domainElement)) {
				return StateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3012((State) domainElement)) {
				return State2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3016((State) domainElement)) {
				return State3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3004((Pseudostate) domainElement)) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3005((Pseudostate) domainElement)) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3006((Pseudostate) domainElement)) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3007((Pseudostate) domainElement)) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3008((Pseudostate) domainElement)) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3009((Pseudostate) domainElement)) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3010((Pseudostate) domainElement)) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3011((Pseudostate) domainElement)) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			break;
		case StateCompositeState_InternalActivities2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3019((Behavior) domainElement)) {
				return BehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3020((Behavior) domainElement)) {
				return Behavior2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3021((Behavior) domainElement)) {
				return Behavior3EditPart.VISUAL_ID;
			}
			break;
		case StateCompositeState_InternalTransitions2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass()) && isTransition_3022((Transition) domainElement)) {
				return Transition2EditPart.VISUAL_ID;
			}
			break;
		case StateMachineEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
				return StateMachine2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = StateMachineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case StateMachine2EditPart.VISUAL_ID:
			if (StateMachineNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateMachineStereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RegionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegionEditPart.VISUAL_ID:
			if (RegionSubverticesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateEditPart.VISUAL_ID:
			if (StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStereotypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateSimpleState_InternalActivitiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case State2EditPart.VISUAL_ID:
			if (StateName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStereotype3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateCompositeState_InternalActivitiesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateCompositeState_InternalTransitionsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Region2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Region2EditPart.VISUAL_ID:
			if (RegionSubvertices2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case State3EditPart.VISUAL_ID:
			if (StateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateStereotype2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateCompositeState_InternalActivities2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StateCompositeState_InternalTransitions2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Region2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionPointReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionPointReference2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionPointReferenceEditPart.VISUAL_ID:
			if (ConnectionPointReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionPointReference2EditPart.VISUAL_ID:
			if (ConnectionPointReferenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pseudostate9EditPart.VISUAL_ID:
			if (PseudostateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pseudostate10EditPart.VISUAL_ID:
			if (PseudostateName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegionSubverticesEditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PseudostateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateSimpleState_InternalActivitiesEditPart.VISUAL_ID:
			if (BehaviorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Behavior2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Behavior3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateCompositeState_InternalActivitiesEditPart.VISUAL_ID:
			if (BehaviorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Behavior2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Behavior3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateCompositeState_InternalTransitionsEditPart.VISUAL_ID:
			if (Transition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RegionSubvertices2EditPart.VISUAL_ID:
			if (StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (State3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalStateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PseudostateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pseudostate8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateCompositeState_InternalActivities2EditPart.VISUAL_ID:
			if (BehaviorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Behavior2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Behavior3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateCompositeState_InternalTransitions2EditPart.VISUAL_ID:
			if (Transition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StateMachineEditPart.VISUAL_ID:
			if (StateMachine2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (TransitionNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass()) && isTransition_4001((Transition) domainElement)) {
			return TransitionEditPart.VISUAL_ID;
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
	private static boolean isState_3001(State domainElement) {
		if (State_3001_Constraint == null) { // lazy initialization
			State_3001_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isSimple and (not self.isSubmachineState)", UMLPackage.eINSTANCE.getState()); //$NON-NLS-1$
		}
		Object result = State_3001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isBehavior_3019(Behavior domainElement) {
		if (Behavior_3019_Constraint == null) { // lazy initialization
			Behavior_3019_Constraint = UMLOCLFactory.getExpression("self.owner.oclIsTypeOf(uml::State) and self.owner.oclAsType(uml::State).entry = self", UMLPackage.eINSTANCE.getBehavior()); //$NON-NLS-1$
		}
		Object result = Behavior_3019_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isBehavior_3020(Behavior domainElement) {
		if (Behavior_3020_Constraint == null) { // lazy initialization
			Behavior_3020_Constraint = UMLOCLFactory.getExpression("self.owner.oclIsTypeOf(uml::State) and self.owner.oclAsType(uml::State).exit = self", UMLPackage.eINSTANCE.getBehavior()); //$NON-NLS-1$
		}
		Object result = Behavior_3020_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isBehavior_3021(Behavior domainElement) {
		if (Behavior_3021_Constraint == null) { // lazy initialization
			Behavior_3021_Constraint = UMLOCLFactory.getExpression("self.owner.oclIsTypeOf(uml::State) and self.owner.oclAsType(uml::State).doActivity = self", UMLPackage.eINSTANCE.getBehavior()); //$NON-NLS-1$
		}
		Object result = Behavior_3021_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isState_3012(State domainElement) {
		if (State_3012_Constraint == null) { // lazy initialization
			State_3012_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isComposite and (not self.isSubmachineState)", UMLPackage.eINSTANCE.getState()); //$NON-NLS-1$
		}
		Object result = State_3012_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isState_3016(State domainElement) {
		if (State_3016_Constraint == null) { // lazy initialization
			State_3016_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isSubmachineState", UMLPackage.eINSTANCE.getState()); //$NON-NLS-1$
		}
		Object result = State_3016_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnectionPointReference_3017(ConnectionPointReference domainElement) {
		if (ConnectionPointReference_3017_Constraint == null) { // lazy initialization
			ConnectionPointReference_3017_Constraint = UMLOCLFactory.getExpression(
					"entry->notEmpty() implies entry->forAll(e | e.kind =  PseudostateKind::entryPoint)", UMLPackage.eINSTANCE.getConnectionPointReference()); //$NON-NLS-1$
		}
		Object result = ConnectionPointReference_3017_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConnectionPointReference_3018(ConnectionPointReference domainElement) {
		if (ConnectionPointReference_3018_Constraint == null) { // lazy initialization
			ConnectionPointReference_3018_Constraint = UMLOCLFactory.getExpression(
					"exit->notEmpty() implies exit->forAll(e | e.kind =  PseudostateKind::exitPoint)", UMLPackage.eINSTANCE.getConnectionPointReference()); //$NON-NLS-1$
		}
		Object result = ConnectionPointReference_3018_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3004(Pseudostate domainElement) {
		if (Pseudostate_3004_Constraint == null) { // lazy initialization
			Pseudostate_3004_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::initial", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3004_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3005(Pseudostate domainElement) {
		if (Pseudostate_3005_Constraint == null) { // lazy initialization
			Pseudostate_3005_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::shallowHistory", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3006(Pseudostate domainElement) {
		if (Pseudostate_3006_Constraint == null) { // lazy initialization
			Pseudostate_3006_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::deepHistory", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3007(Pseudostate domainElement) {
		if (Pseudostate_3007_Constraint == null) { // lazy initialization
			Pseudostate_3007_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::fork", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3007_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3008(Pseudostate domainElement) {
		if (Pseudostate_3008_Constraint == null) { // lazy initialization
			Pseudostate_3008_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::join", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3008_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3009(Pseudostate domainElement) {
		if (Pseudostate_3009_Constraint == null) { // lazy initialization
			Pseudostate_3009_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::junction", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3009_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3010(Pseudostate domainElement) {
		if (Pseudostate_3010_Constraint == null) { // lazy initialization
			Pseudostate_3010_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::choice", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3010_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3011(Pseudostate domainElement) {
		if (Pseudostate_3011_Constraint == null) { // lazy initialization
			Pseudostate_3011_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::terminate", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3011_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTransition_3022(Transition domainElement) {
		if (Transition_3022_Constraint == null) { // lazy initialization
			Transition_3022_Constraint = UMLOCLFactory.getExpression("self.kind = TransitionKind::internal", UMLPackage.eINSTANCE.getTransition()); //$NON-NLS-1$
		}
		Object result = Transition_3022_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3014(Pseudostate domainElement) {
		if (Pseudostate_3014_Constraint == null) { // lazy initialization
			Pseudostate_3014_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::entryPoint", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3014_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPseudostate_3015(Pseudostate domainElement) {
		if (Pseudostate_3015_Constraint == null) { // lazy initialization
			Pseudostate_3015_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::exitPoint", UMLPackage.eINSTANCE.getPseudostate()); //$NON-NLS-1$
		}
		Object result = Pseudostate_3015_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTransition_4001(Transition domainElement) {
		if (Transition_4001_Constraint == null) { // lazy initialization
			Transition_4001_Constraint = UMLOCLFactory.getExpression("not (self.kind = TransitionKind::internal)", UMLPackage.eINSTANCE.getTransition()); //$NON-NLS-1$
		}
		Object result = Transition_4001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
		if (containerView == null) {
			return false;
		}
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

	/**
	 * @generated
	 */
	public static int getChildDescriptorVisualID(UMLNodeDescriptor container, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		switch (container.getVisualID()) {
		case StateMachine2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return RegionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3014((Pseudostate) domainElement)) {
				return Pseudostate9EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3015((Pseudostate) domainElement)) {
				return Pseudostate10EditPart.VISUAL_ID;
			}
			break;
		case RegionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3001((State) domainElement)) {
				return StateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3012((State) domainElement)) {
				return State2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3016((State) domainElement)) {
				return State3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3004((Pseudostate) domainElement)) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3005((Pseudostate) domainElement)) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3006((Pseudostate) domainElement)) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3007((Pseudostate) domainElement)) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3008((Pseudostate) domainElement)) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3009((Pseudostate) domainElement)) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3010((Pseudostate) domainElement)) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3011((Pseudostate) domainElement)) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			break;
		case StateEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3019((Behavior) domainElement)) {
				return BehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3020((Behavior) domainElement)) {
				return Behavior2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3021((Behavior) domainElement)) {
				return Behavior3EditPart.VISUAL_ID;
			}
			break;
		case State2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return Region2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3019((Behavior) domainElement)) {
				return BehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3020((Behavior) domainElement)) {
				return Behavior2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3021((Behavior) domainElement)) {
				return Behavior3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass()) && isTransition_3022((Transition) domainElement)) {
				return Transition2EditPart.VISUAL_ID;
			}
			break;
		case Region2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3001((State) domainElement)) {
				return StateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3012((State) domainElement)) {
				return State2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass()) && isState_3016((State) domainElement)) {
				return State3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElement.eClass())) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3004((Pseudostate) domainElement)) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3005((Pseudostate) domainElement)) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3006((Pseudostate) domainElement)) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3007((Pseudostate) domainElement)) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3008((Pseudostate) domainElement)) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3009((Pseudostate) domainElement)) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3010((Pseudostate) domainElement)) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElement.eClass()) && isPseudostate_3011((Pseudostate) domainElement)) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			break;
		case State3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElement.eClass())) {
				return Region2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConnectionPointReference().isSuperTypeOf(domainElement.eClass()) && isConnectionPointReference_3017((ConnectionPointReference) domainElement)) {
				return ConnectionPointReferenceEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConnectionPointReference().isSuperTypeOf(domainElement.eClass()) && isConnectionPointReference_3018((ConnectionPointReference) domainElement)) {
				return ConnectionPointReference2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3019((Behavior) domainElement)) {
				return BehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3020((Behavior) domainElement)) {
				return Behavior2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getBehavior().isSuperTypeOf(domainElement.eClass()) && isBehavior_3021((Behavior) domainElement)) {
				return Behavior3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass()) && isTransition_3022((Transition) domainElement)) {
				return Transition2EditPart.VISUAL_ID;
			}
			break;
		case StateMachineEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElement.eClass())) {
				return StateMachine2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	protected static boolean canSubstitute(int visualId, int substituteCandidate) {
		if (visualId == substituteCandidate) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate || canSubstitute(basic, candidate);
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case RegionSubverticesEditPart.VISUAL_ID:
		case StateSimpleState_InternalActivitiesEditPart.VISUAL_ID:
		case StateCompositeState_InternalActivitiesEditPart.VISUAL_ID:
		case StateCompositeState_InternalTransitionsEditPart.VISUAL_ID:
		case RegionSubvertices2EditPart.VISUAL_ID:
		case StateCompositeState_InternalActivities2EditPart.VISUAL_ID:
		case StateCompositeState_InternalTransitions2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case RegionEditPart.VISUAL_ID:
		case StateEditPart.VISUAL_ID:
		case BehaviorEditPart.VISUAL_ID:
		case Behavior2EditPart.VISUAL_ID:
		case Behavior3EditPart.VISUAL_ID:
		case Region2EditPart.VISUAL_ID:
		case ConnectionPointReferenceEditPart.VISUAL_ID:
		case ConnectionPointReference2EditPart.VISUAL_ID:
		case Transition2EditPart.VISUAL_ID:
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
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final IVisualIDRegistry TYPED_ADAPTER = new IVisualIDRegistry() {

		/**
		 * @generated
		 */
		public String getModelID(View view) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		public int getVisualID(View view) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		public boolean isCompartmentVisualID(int visualID) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isShortcutDescendant(View view) {
			return org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.isShortcutDescendant(view);
		}

	};

	/**
	 * @generated
	 */
	public static boolean isShortcutDescendant(View view) {
		View diagram = view.getDiagram();
		while (view != diagram && view != null) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return true;
			}
			view = (View) view.eContainer();
		}
		return false;
	}

}
