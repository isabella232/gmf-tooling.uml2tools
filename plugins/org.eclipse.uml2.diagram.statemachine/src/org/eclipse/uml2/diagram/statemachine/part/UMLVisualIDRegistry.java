package org.eclipse.uml2.diagram.statemachine.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
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
import org.eclipse.uml2.diagram.statemachine.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.statemachine.expressions.UMLOCLFactory;
import org.eclipse.uml2.uml.StateMachine;
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
	private static final UMLAbstractExpression State_3001_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isSimple", UMLPackage.eINSTANCE.getState());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression State_3012_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isComposite", UMLPackage.eINSTANCE.getState());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression State_3016_Constraint = UMLOCLFactory.getExpression("self.oclIsTypeOf(uml::State) and self.isSubmachineState", UMLPackage.eINSTANCE.getState());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ConnectionPointReference_3017_Constraint = UMLOCLFactory.getExpression(
			"entry->notEmpty() implies entry->forAll(e | e.kind =  PseudostateKind::entryPoint)", UMLPackage.eINSTANCE.getConnectionPointReference());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ConnectionPointReference_3018_Constraint = UMLOCLFactory.getExpression(
			"exit->notEmpty() implies exit->forAll(e | e.kind =  PseudostateKind::exitPoint)", UMLPackage.eINSTANCE.getConnectionPointReference());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3004_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::initial", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3005_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::shallowHistory", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3006_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::deepHistory", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3007_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::fork", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3008_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::join", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3009_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::junction", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3010_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::choice", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3011_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::terminate", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3014_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::entryPoint", UMLPackage.eINSTANCE.getPseudostate());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pseudostate_3015_Constraint = UMLOCLFactory.getExpression("self.kind = PseudostateKind::exitPoint", UMLPackage.eINSTANCE.getPseudostate());

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
		if (UMLPackage.eINSTANCE.getStateMachine().isSuperTypeOf(domainElementMetaclass) && isDiagram((StateMachine) domainElement)) {
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
		String containerModelID = org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (StateMachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = 1000;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry.getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case StateMachine2EditPart.VISUAL_ID:
			if (StateMachineNameEditPart.VISUAL_ID == nodeVisualID) {
				return StateMachineNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || RegionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElementMetaclass)) {
				return RegionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate9EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3014_Constraint, domainElement))) {
				return Pseudostate9EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate10EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3015_Constraint, domainElement))) {
				return Pseudostate10EditPart.VISUAL_ID;
			}
			return getUnrecognizedStateMachine_2004ChildNodeID(domainElement, semanticHint);
		case RegionEditPart.VISUAL_ID:
			if (RegionSubverticesEditPart.VISUAL_ID == nodeVisualID) {
				return RegionSubverticesEditPart.VISUAL_ID;
			}
			return getUnrecognizedRegion_3013ChildNodeID(domainElement, semanticHint);
		case StateEditPart.VISUAL_ID:
			if (StateNameEditPart.VISUAL_ID == nodeVisualID) {
				return StateNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedState_3001ChildNodeID(domainElement, semanticHint);
		case State2EditPart.VISUAL_ID:
			if (StateName3EditPart.VISUAL_ID == nodeVisualID) {
				return StateName3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Region2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElementMetaclass)) {
				return Region2EditPart.VISUAL_ID;
			}
			return getUnrecognizedState_3012ChildNodeID(domainElement, semanticHint);
		case Region2EditPart.VISUAL_ID:
			if (RegionSubvertices2EditPart.VISUAL_ID == nodeVisualID) {
				return RegionSubvertices2EditPart.VISUAL_ID;
			}
			return getUnrecognizedRegion_3002ChildNodeID(domainElement, semanticHint);
		case State3EditPart.VISUAL_ID:
			if (StateName2EditPart.VISUAL_ID == nodeVisualID) {
				return StateName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Region2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getRegion().isSuperTypeOf(domainElementMetaclass)) {
				return Region2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ConnectionPointReferenceEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getConnectionPointReference().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(ConnectionPointReference_3017_Constraint, domainElement))) {
				return ConnectionPointReferenceEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ConnectionPointReference2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getConnectionPointReference().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(ConnectionPointReference_3018_Constraint, domainElement))) {
				return ConnectionPointReference2EditPart.VISUAL_ID;
			}
			return getUnrecognizedState_3016ChildNodeID(domainElement, semanticHint);
		case ConnectionPointReferenceEditPart.VISUAL_ID:
			if (ConnectionPointReferenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return ConnectionPointReferenceNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedConnectionPointReference_3017ChildNodeID(domainElement, semanticHint);
		case ConnectionPointReference2EditPart.VISUAL_ID:
			if (ConnectionPointReferenceName2EditPart.VISUAL_ID == nodeVisualID) {
				return ConnectionPointReferenceName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedConnectionPointReference_3018ChildNodeID(domainElement, semanticHint);
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
		case Pseudostate9EditPart.VISUAL_ID:
			if (PseudostateNameEditPart.VISUAL_ID == nodeVisualID) {
				return PseudostateNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedPseudostate_3014ChildNodeID(domainElement, semanticHint);
		case Pseudostate10EditPart.VISUAL_ID:
			if (PseudostateName2EditPart.VISUAL_ID == nodeVisualID) {
				return PseudostateName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedPseudostate_3015ChildNodeID(domainElement, semanticHint);
		case RegionSubverticesEditPart.VISUAL_ID:
			if ((semanticHint == null || StateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(State_3001_Constraint, domainElement))) {
				return StateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || State2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(State_3012_Constraint, domainElement))) {
				return State2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || State3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(State_3016_Constraint, domainElement))) {
				return State3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FinalStateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElementMetaclass)) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PseudostateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3004_Constraint, domainElement))) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3005_Constraint, domainElement))) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3006_Constraint, domainElement))) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3007_Constraint, domainElement))) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3008_Constraint, domainElement))) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3009_Constraint, domainElement))) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate7EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3010_Constraint, domainElement))) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate8EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3011_Constraint, domainElement))) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			return getUnrecognizedRegionSubvertices_7004ChildNodeID(domainElement, semanticHint);
		case RegionSubvertices2EditPart.VISUAL_ID:
			if ((semanticHint == null || StateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(State_3001_Constraint, domainElement))) {
				return StateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || State2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(State_3012_Constraint, domainElement))) {
				return State2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || State3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getState().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(State_3016_Constraint, domainElement))) {
				return State3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FinalStateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFinalState().isSuperTypeOf(domainElementMetaclass)) {
				return FinalStateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PseudostateEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3004_Constraint, domainElement))) {
				return PseudostateEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3005_Constraint, domainElement))) {
				return Pseudostate2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3006_Constraint, domainElement))) {
				return Pseudostate3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3007_Constraint, domainElement))) {
				return Pseudostate4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3008_Constraint, domainElement))) {
				return Pseudostate5EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate6EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3009_Constraint, domainElement))) {
				return Pseudostate6EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate7EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3010_Constraint, domainElement))) {
				return Pseudostate7EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pseudostate8EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPseudostate().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || evaluate(Pseudostate_3011_Constraint, domainElement))) {
				return Pseudostate8EditPart.VISUAL_ID;
			}
			return getUnrecognizedRegionSubvertices_7003ChildNodeID(domainElement, semanticHint);
		case StateMachineEditPart.VISUAL_ID:
			// We want to additionally show the Canvas Semantical Element in the auxiliary 
			// org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachine2EditPart (that serves as a pure visual container for children). 
			// To do this, we modified CanonicalEditPolicy to add the Canvas semantic Element into the children 
			// list. The only remaining part is to return correct VID for this special case.

			if (containerView instanceof Diagram && domainElement != null && domainElement.equals(containerView.getElement())) {
				return StateMachine2EditPart.VISUAL_ID;
			}
			// Diagram header is already processed above
			return getUnrecognizedStateMachine_1000ChildNodeID(domainElement, semanticHint);
		}
		return getUnrecognizedNodeID(containerView, domainElement);
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
		if (UMLPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElementMetaclass)) {
			return TransitionEditPart.VISUAL_ID;
		}
		return getUnrecognizedLinkWithClassID(domainElement);
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(StateMachine element) {
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
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedNodeID(View containerView, EObject domainElement) {
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
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedStateMachine_2004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedRegion_3013ChildNodeID(EObject domainElement, String semanticHint) {
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
	private static int getUnrecognizedState_3016ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedConnectionPointReference_3017ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedConnectionPointReference_3018ChildNodeID(EObject domainElement, String semanticHint) {
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
	private static int getUnrecognizedPseudostate_3014ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedPseudostate_3015ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static int getUnrecognizedRegionSubvertices_7004ChildNodeID(EObject domainElement, String semanticHint) {
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
	 * @generated
	 */
	private static boolean evaluate(UMLAbstractExpression expression, Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
