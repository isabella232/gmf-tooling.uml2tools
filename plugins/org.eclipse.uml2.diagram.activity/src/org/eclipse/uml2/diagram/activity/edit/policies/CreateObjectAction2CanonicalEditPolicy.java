package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegion2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin7EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterSetEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class CreateObjectAction2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = UMLDiagramUpdater.getCreateObjectAction_3018SemanticChildren(viewObject).iterator(); it.hasNext();) {
			result.add(((IUpdaterNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = UMLVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
		case ConstraintEditPart.VISUAL_ID:
		case Constraint2EditPart.VISUAL_ID:
		case AcceptEventActionEditPart.VISUAL_ID:
		case AcceptTimeEventActionEditPart.VISUAL_ID:
		case ActivityFinalNodeEditPart.VISUAL_ID:
		case DecisionNodeEditPart.VISUAL_ID:
		case MergeNodeEditPart.VISUAL_ID:
		case InitialNodeEditPart.VISUAL_ID:
		case DataStoreNodeEditPart.VISUAL_ID:
		case CentralBufferNodeEditPart.VISUAL_ID:
		case OpaqueActionEditPart.VISUAL_ID:
		case OutputPinEditPart.VISUAL_ID:
		case FlowFinalNodeEditPart.VISUAL_ID:
		case ForkNodeEditPart.VISUAL_ID:
		case JoinNodeEditPart.VISUAL_ID:
		case PinEditPart.VISUAL_ID:
		case CreateObjectActionEditPart.VISUAL_ID:
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
		case InputPinEditPart.VISUAL_ID:
		case InputPin2EditPart.VISUAL_ID:
		case InputPin3EditPart.VISUAL_ID:
		case CallBehaviorActionEditPart.VISUAL_ID:
		case OutputPin3EditPart.VISUAL_ID:
		case InputPin4EditPart.VISUAL_ID:
		case CallOperationActionEditPart.VISUAL_ID:
		case InputPin5EditPart.VISUAL_ID:
		case StructuredActivityNodeEditPart.VISUAL_ID:
		case StructuredActivityNode2EditPart.VISUAL_ID:
		case OpaqueAction2EditPart.VISUAL_ID:
		case AcceptEventAction3EditPart.VISUAL_ID:
		case AcceptEventAction4EditPart.VISUAL_ID:
		case ActivityFinalNode2EditPart.VISUAL_ID:
		case DecisionNode2EditPart.VISUAL_ID:
		case FlowFinalNode2EditPart.VISUAL_ID:
		case Pin2EditPart.VISUAL_ID:
		case CreateObjectAction2EditPart.VISUAL_ID:
		case CallBehaviorAction2EditPart.VISUAL_ID:
		case CallOperationAction2EditPart.VISUAL_ID:
		case ForkNode2EditPart.VISUAL_ID:
		case JoinNode2EditPart.VISUAL_ID:
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
		case DataStoreNode2EditPart.VISUAL_ID:
		case CentralBufferNode2EditPart.VISUAL_ID:
		case InputPin6EditPart.VISUAL_ID:
		case OutputPin4EditPart.VISUAL_ID:
		case OpaqueBehaviorEditPart.VISUAL_ID:
		case ActivityParameterNodeEditPart.VISUAL_ID:
		case SendSignalActionEditPart.VISUAL_ID:
		case ActivityPartitionEditPart.VISUAL_ID:
		case ActivityPartition2EditPart.VISUAL_ID:
		case AcceptEventAction5EditPart.VISUAL_ID:
		case AcceptEventAction6EditPart.VISUAL_ID:
		case ActivityFinalNode3EditPart.VISUAL_ID:
		case DecisionNode3EditPart.VISUAL_ID:
		case MergeNode2EditPart.VISUAL_ID:
		case InitialNode2EditPart.VISUAL_ID:
		case DataStoreNode3EditPart.VISUAL_ID:
		case CentralBufferNode3EditPart.VISUAL_ID:
		case OpaqueAction3EditPart.VISUAL_ID:
		case FlowFinalNode3EditPart.VISUAL_ID:
		case ForkNode3EditPart.VISUAL_ID:
		case JoinNode3EditPart.VISUAL_ID:
		case Pin3EditPart.VISUAL_ID:
		case CreateObjectAction3EditPart.VISUAL_ID:
		case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
		case CallBehaviorAction3EditPart.VISUAL_ID:
		case CallOperationAction3EditPart.VISUAL_ID:
		case StructuredActivityNode3EditPart.VISUAL_ID:
		case StructuredActivityNode4EditPart.VISUAL_ID:
		case InputPin7EditPart.VISUAL_ID:
		case OutputPin5EditPart.VISUAL_ID:
		case SendSignalAction2EditPart.VISUAL_ID:
		case LoopNode2EditPart.VISUAL_ID:
		case ConditionalNode2EditPart.VISUAL_ID:
		case ExpansionRegion2EditPart.VISUAL_ID:
		case ValueSpecificationActionEditPart.VISUAL_ID:
		case OutputPin6EditPart.VISUAL_ID:
		case LoopNodeEditPart.VISUAL_ID:
		case ConditionalNodeEditPart.VISUAL_ID:
		case ExpansionRegionEditPart.VISUAL_ID:
		case ParameterSetEditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
		case ValueSpecificationAction2EditPart.VISUAL_ID:
		case LiteralStringEditPart.VISUAL_ID:
		case LiteralString2EditPart.VISUAL_ID:
			return true;
		case OutputPin2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE.getCreateObjectAction_Result());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	@Override
	protected String getFactoryHint(IAdaptable elementAdapter) {
		EObject domainModelElment = (EObject) elementAdapter.getAdapter(EObject.class);
		View containerView = ((IGraphicalEditPart) getHost()).getNotationView();
		int hint = UMLVisualIDRegistry.getNodeVisualID(containerView, domainModelElment);
		return (hint != -1) ? UMLVisualIDRegistry.getType(hint) : super.getFactoryHint(elementAdapter);
	}

}
