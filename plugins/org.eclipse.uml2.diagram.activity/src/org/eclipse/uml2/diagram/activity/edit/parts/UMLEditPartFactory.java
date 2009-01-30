package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.draw2d.RotatedImageCellEditorLocator;
import org.eclipse.uml2.diagram.common.draw2d.RotatedImageOfString;

/**
 * @generated
 */

public class UMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case ActivityStereotypeEditPart.VISUAL_ID:
				return new ActivityStereotypeEditPart(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case Constraint2EditPart.VISUAL_ID:
				return new Constraint2EditPart(view);

			case AcceptEventActionEditPart.VISUAL_ID:
				return new AcceptEventActionEditPart(view);

			case AcceptEventActionNameEditPart.VISUAL_ID:
				return new AcceptEventActionNameEditPart(view);

			case AcceptEventActionStereotypeEditPart.VISUAL_ID:
				return new AcceptEventActionStereotypeEditPart(view);

			case AcceptTimeEventActionEditPart.VISUAL_ID:
				return new AcceptTimeEventActionEditPart(view);

			case AcceptTimeEventActionNameEditPart.VISUAL_ID:
				return new AcceptTimeEventActionNameEditPart(view);

			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new ActivityFinalNodeEditPart(view);

			case DecisionNodeEditPart.VISUAL_ID:
				return new DecisionNodeEditPart(view);

			case MergeNodeEditPart.VISUAL_ID:
				return new MergeNodeEditPart(view);

			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);

			case DataStoreNodeEditPart.VISUAL_ID:
				return new DataStoreNodeEditPart(view);

			case DataStoreNodeNameEditPart.VISUAL_ID:
				return new DataStoreNodeNameEditPart(view);

			case DataStoreNodeInStateEditPart.VISUAL_ID:
				return new DataStoreNodeInStateEditPart(view);

			case DataStoreNodeOrderingEditPart.VISUAL_ID:
				return new DataStoreNodeOrderingEditPart(view);

			case DataStoreNodeStereotypeEditPart.VISUAL_ID:
				return new DataStoreNodeStereotypeEditPart(view);

			case CentralBufferNodeEditPart.VISUAL_ID:
				return new CentralBufferNodeEditPart(view);

			case CentralBufferNodeNameEditPart.VISUAL_ID:
				return new CentralBufferNodeNameEditPart(view);

			case CentralBufferNodeInStateEditPart.VISUAL_ID:
				return new CentralBufferNodeInStateEditPart(view);

			case CentralBufferNodeOrderingEditPart.VISUAL_ID:
				return new CentralBufferNodeOrderingEditPart(view);

			case CentralBufferNodeStereotypeEditPart.VISUAL_ID:
				return new CentralBufferNodeStereotypeEditPart(view);

			case OpaqueActionEditPart.VISUAL_ID:
				return new OpaqueActionEditPart(view);

			case OpaqueActionNameEditPart.VISUAL_ID:
				return new OpaqueActionNameEditPart(view);

			case OpaqueActionStereotypeEditPart.VISUAL_ID:
				return new OpaqueActionStereotypeEditPart(view);

			case OpaqueAction_OutputPinEditPart.VISUAL_ID:
				return new OpaqueAction_OutputPinEditPart(view);

			case OpaqueAction_OutputPinNameEditPart.VISUAL_ID:
				return new OpaqueAction_OutputPinNameEditPart(view);

			case OpaqueAction_OutputPinOrderingEditPart.VISUAL_ID:
				return new OpaqueAction_OutputPinOrderingEditPart(view);

			case FlowFinalNodeEditPart.VISUAL_ID:
				return new FlowFinalNodeEditPart(view);

			case ForkNodeEditPart.VISUAL_ID:
				return new ForkNodeEditPart(view);

			case JoinNodeEditPart.VISUAL_ID:
				return new JoinNodeEditPart(view);

			case PinEditPart.VISUAL_ID:
				return new PinEditPart(view);

			case PinNameEditPart.VISUAL_ID:
				return new PinNameEditPart(view);

			case PinInStateEditPart.VISUAL_ID:
				return new PinInStateEditPart(view);

			case PinOrderingEditPart.VISUAL_ID:
				return new PinOrderingEditPart(view);

			case PinStereotypeEditPart.VISUAL_ID:
				return new PinStereotypeEditPart(view);

			case CreateObjectActionEditPart.VISUAL_ID:
				return new CreateObjectActionEditPart(view);

			case CreateObjectActionNameEditPart.VISUAL_ID:
				return new CreateObjectActionNameEditPart(view);

			case CreateObjectActionStereotypeEditPart.VISUAL_ID:
				return new CreateObjectActionStereotypeEditPart(view);

			case CreateObjectAction_OutputPinEditPart.VISUAL_ID:
				return new CreateObjectAction_OutputPinEditPart(view);

			case CreateObjectAction_OutputPinNameEditPart.VISUAL_ID:
				return new CreateObjectAction_OutputPinNameEditPart(view);

			case CreateObjectAction_OutputPinOrderingEditPart.VISUAL_ID:
				return new CreateObjectAction_OutputPinOrderingEditPart(view);

			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionEditPart(view);

			case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionNameEditPart(view);

			case AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionStereotypeEditPart(view);

			case AddStructuralFeatureValueAction_insertAt_InputPinEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_insertAt_InputPinEditPart(view);

			case AddStructuralFeatureValueAction_insertAt_InputPinNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_insertAt_InputPinNameEditPart(view);

			case AddStructuralFeatureValueAction_insertAt_InputPinOrderingEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_insertAt_InputPinOrderingEditPart(view);

			case AddStructuralFeatureValueAction_value_InputPinEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_value_InputPinEditPart(view);

			case AddStructuralFeatureValueAction_value_InputPinNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_value_InputPinNameEditPart(view);

			case AddStructuralFeatureValueAction_value_InputPinOrderingEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_value_InputPinOrderingEditPart(view);

			case AddStructuralFeatureValueAction_object_InputPinEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_object_InputPinEditPart(view);

			case AddStructuralFeatureValueAction_object_InputPinNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_object_InputPinNameEditPart(view);

			case AddStructuralFeatureValueAction_object_InputPinOrderingEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction_object_InputPinOrderingEditPart(view);

			case CallBehaviorActionEditPart.VISUAL_ID:
				return new CallBehaviorActionEditPart(view);

			case CallBehaviorActionNameEditPart.VISUAL_ID:
				return new CallBehaviorActionNameEditPart(view);

			case CallBehaviorActionStereotypeEditPart.VISUAL_ID:
				return new CallBehaviorActionStereotypeEditPart(view);

			case CallAction_OutputPinEditPart.VISUAL_ID:
				return new CallAction_OutputPinEditPart(view);

			case CallAction_OutputPinNameEditPart.VISUAL_ID:
				return new CallAction_OutputPinNameEditPart(view);

			case CallAction_OutputPinOrderingEditPart.VISUAL_ID:
				return new CallAction_OutputPinOrderingEditPart(view);

			case CallAction_InputPinEditPart.VISUAL_ID:
				return new CallAction_InputPinEditPart(view);

			case CallAction_InputPinNameEditPart.VISUAL_ID:
				return new CallAction_InputPinNameEditPart(view);

			case CallAction_InputPinOrderingEditPart.VISUAL_ID:
				return new CallAction_InputPinOrderingEditPart(view);

			case CallOperationActionEditPart.VISUAL_ID:
				return new CallOperationActionEditPart(view);

			case CallOperationActionNameEditPart.VISUAL_ID:
				return new CallOperationActionNameEditPart(view);

			case CallOperationActionStereotypeEditPart.VISUAL_ID:
				return new CallOperationActionStereotypeEditPart(view);

			case CallOperationAction_InputPinEditPart.VISUAL_ID:
				return new CallOperationAction_InputPinEditPart(view);

			case CallOperationAction_InputPinNameEditPart.VISUAL_ID:
				return new CallOperationAction_InputPinNameEditPart(view);

			case CallOperationAction_InputPinOrderingEditPart.VISUAL_ID:
				return new CallOperationAction_InputPinOrderingEditPart(view);

			case StructuredActivityNodeEditPart.VISUAL_ID:
				return new StructuredActivityNodeEditPart(view);

			case StructuredActivityNodeNameEditPart.VISUAL_ID:
				return new StructuredActivityNodeNameEditPart(view);

			case StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
				return new StructuredActivityNodeStereotypeEditPart(view);

			case StructuredActivityNode2EditPart.VISUAL_ID:
				return new StructuredActivityNode2EditPart(view);

			case StructuredActivityNodeName2EditPart.VISUAL_ID:
				return new StructuredActivityNodeName2EditPart(view);

			case StructuredActivityNodeStereotype2EditPart.VISUAL_ID:
				return new StructuredActivityNodeStereotype2EditPart(view);

			case OpaqueAction2EditPart.VISUAL_ID:
				return new OpaqueAction2EditPart(view);

			case OpaqueActionName2EditPart.VISUAL_ID:
				return new OpaqueActionName2EditPart(view);

			case OpaqueActionStereotype2EditPart.VISUAL_ID:
				return new OpaqueActionStereotype2EditPart(view);

			case AcceptEventAction3EditPart.VISUAL_ID:
				return new AcceptEventAction3EditPart(view);

			case AcceptEventActionName2EditPart.VISUAL_ID:
				return new AcceptEventActionName2EditPart(view);

			case AcceptEventActionStereotype2EditPart.VISUAL_ID:
				return new AcceptEventActionStereotype2EditPart(view);

			case AcceptEventAction4EditPart.VISUAL_ID:
				return new AcceptEventAction4EditPart(view);

			case AcceptEventActionName4EditPart.VISUAL_ID:
				return new AcceptEventActionName4EditPart(view);

			case ActivityFinalNode2EditPart.VISUAL_ID:
				return new ActivityFinalNode2EditPart(view);

			case DecisionNode2EditPart.VISUAL_ID:
				return new DecisionNode2EditPart(view);

			case FlowFinalNode2EditPart.VISUAL_ID:
				return new FlowFinalNode2EditPart(view);

			case StructuredActivityNode_PinEditPart.VISUAL_ID:
				return new StructuredActivityNode_PinEditPart(view);

			case StructuredActivityNode_PinNameEditPart.VISUAL_ID:
				return new StructuredActivityNode_PinNameEditPart(view);

			case StructuredActivityNode_PinInStateEditPart.VISUAL_ID:
				return new StructuredActivityNode_PinInStateEditPart(view);

			case StructuredActivityNode_PinOrderingEditPart.VISUAL_ID:
				return new StructuredActivityNode_PinOrderingEditPart(view);

			case StructuredActivityNode_PinStereotypeEditPart.VISUAL_ID:
				return new StructuredActivityNode_PinStereotypeEditPart(view);

			case CreateObjectAction2EditPart.VISUAL_ID:
				return new CreateObjectAction2EditPart(view);

			case CreateObjectActionName2EditPart.VISUAL_ID:
				return new CreateObjectActionName2EditPart(view);

			case CreateObjectActionStereotype2EditPart.VISUAL_ID:
				return new CreateObjectActionStereotype2EditPart(view);

			case CallBehaviorAction2EditPart.VISUAL_ID:
				return new CallBehaviorAction2EditPart(view);

			case CallBehaviorActionName2EditPart.VISUAL_ID:
				return new CallBehaviorActionName2EditPart(view);

			case CallBehaviorActionStereotype2EditPart.VISUAL_ID:
				return new CallBehaviorActionStereotype2EditPart(view);

			case CallOperationAction2EditPart.VISUAL_ID:
				return new CallOperationAction2EditPart(view);

			case CallOperationActionName2EditPart.VISUAL_ID:
				return new CallOperationActionName2EditPart(view);

			case CallOperationActionStereotype2EditPart.VISUAL_ID:
				return new CallOperationActionStereotype2EditPart(view);

			case ForkNode2EditPart.VISUAL_ID:
				return new ForkNode2EditPart(view);

			case JoinNode2EditPart.VISUAL_ID:
				return new JoinNode2EditPart(view);

			case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction2EditPart(view);

			case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionName2EditPart(view);

			case AddStructuralFeatureValueActionStereotype2EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionStereotype2EditPart(view);

			case DataStoreNode2EditPart.VISUAL_ID:
				return new DataStoreNode2EditPart(view);

			case DataStoreNodeName2EditPart.VISUAL_ID:
				return new DataStoreNodeName2EditPart(view);

			case DataStoreNodeInState2EditPart.VISUAL_ID:
				return new DataStoreNodeInState2EditPart(view);

			case DataStoreNodeOrdering2EditPart.VISUAL_ID:
				return new DataStoreNodeOrdering2EditPart(view);

			case DataStoreNodeStereotype2EditPart.VISUAL_ID:
				return new DataStoreNodeStereotype2EditPart(view);

			case CentralBufferNode2EditPart.VISUAL_ID:
				return new CentralBufferNode2EditPart(view);

			case CentralBufferNodeName2EditPart.VISUAL_ID:
				return new CentralBufferNodeName2EditPart(view);

			case CentralBufferNodeInState2EditPart.VISUAL_ID:
				return new CentralBufferNodeInState2EditPart(view);

			case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
				return new CentralBufferNodeOrdering2EditPart(view);

			case CentralBufferNodeStereotype2EditPart.VISUAL_ID:
				return new CentralBufferNodeStereotype2EditPart(view);

			case StructuredActivityNode_InputPinEditPart.VISUAL_ID:
				return new StructuredActivityNode_InputPinEditPart(view);

			case StructuredActivityNode_InputPinNameEditPart.VISUAL_ID:
				return new StructuredActivityNode_InputPinNameEditPart(view);

			case StructuredActivityNode_InputPinOrderingEditPart.VISUAL_ID:
				return new StructuredActivityNode_InputPinOrderingEditPart(view);

			case StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
				return new StructuredActivityNode_OutputPinEditPart(view);

			case StructuredActivityNode_OutputPinNameEditPart.VISUAL_ID:
				return new StructuredActivityNode_OutputPinNameEditPart(view);

			case StructuredActivityNode_OutputPinOrderingEditPart.VISUAL_ID:
				return new StructuredActivityNode_OutputPinOrderingEditPart(view);

			case OpaqueBehaviorEditPart.VISUAL_ID:
				return new OpaqueBehaviorEditPart(view);

			case OpaqueBehaviorNameEditPart.VISUAL_ID:
				return new OpaqueBehaviorNameEditPart(view);

			case ActivityParameterNodeEditPart.VISUAL_ID:
				return new ActivityParameterNodeEditPart(view);

			case ActivityParameterNodeNameEditPart.VISUAL_ID:
				return new ActivityParameterNodeNameEditPart(view);

			case ActivityParameterNodeStereotypeEditPart.VISUAL_ID:
				return new ActivityParameterNodeStereotypeEditPart(view);

			case SendSignalActionEditPart.VISUAL_ID:
				return new SendSignalActionEditPart(view);

			case SendSignalActionNameEditPart.VISUAL_ID:
				return new SendSignalActionNameEditPart(view);

			case SendSignalActionStereotypeEditPart.VISUAL_ID:
				return new SendSignalActionStereotypeEditPart(view);

			case ActivityPartitionEditPart.VISUAL_ID:
				return new ActivityPartitionEditPart(view);

			case ActivityPartitionNameEditPart.VISUAL_ID:
				return new ActivityPartitionNameEditPart(view);

			case ActivityPartition2EditPart.VISUAL_ID:
				return new ActivityPartition2EditPart(view);

			case ActivityPartitionName2EditPart.VISUAL_ID:
				return new ActivityPartitionName2EditPart(view);

			case AcceptEventAction5EditPart.VISUAL_ID:
				return new AcceptEventAction5EditPart(view);

			case AcceptEventActionName5EditPart.VISUAL_ID:
				return new AcceptEventActionName5EditPart(view);

			case AcceptEventActionStereotype5EditPart.VISUAL_ID:
				return new AcceptEventActionStereotype5EditPart(view);

			case AcceptEventAction6EditPart.VISUAL_ID:
				return new AcceptEventAction6EditPart(view);

			case AcceptEventActionName6EditPart.VISUAL_ID:
				return new AcceptEventActionName6EditPart(view);

			case ActivityFinalNode3EditPart.VISUAL_ID:
				return new ActivityFinalNode3EditPart(view);

			case DecisionNode3EditPart.VISUAL_ID:
				return new DecisionNode3EditPart(view);

			case MergeNode2EditPart.VISUAL_ID:
				return new MergeNode2EditPart(view);

			case InitialNode2EditPart.VISUAL_ID:
				return new InitialNode2EditPart(view);

			case DataStoreNode3EditPart.VISUAL_ID:
				return new DataStoreNode3EditPart(view);

			case DataStoreNodeName3EditPart.VISUAL_ID:
				return new DataStoreNodeName3EditPart(view);

			case DataStoreNodeInState3EditPart.VISUAL_ID:
				return new DataStoreNodeInState3EditPart(view);

			case DataStoreNodeOrdering3EditPart.VISUAL_ID:
				return new DataStoreNodeOrdering3EditPart(view);

			case DataStoreNodeStereotype3EditPart.VISUAL_ID:
				return new DataStoreNodeStereotype3EditPart(view);

			case CentralBufferNode3EditPart.VISUAL_ID:
				return new CentralBufferNode3EditPart(view);

			case CentralBufferNodeName3EditPart.VISUAL_ID:
				return new CentralBufferNodeName3EditPart(view);

			case CentralBufferNodeInState3EditPart.VISUAL_ID:
				return new CentralBufferNodeInState3EditPart(view);

			case CentralBufferNodeOrdering3EditPart.VISUAL_ID:
				return new CentralBufferNodeOrdering3EditPart(view);

			case CentralBufferNodeStereotype3EditPart.VISUAL_ID:
				return new CentralBufferNodeStereotype3EditPart(view);

			case OpaqueAction3EditPart.VISUAL_ID:
				return new OpaqueAction3EditPart(view);

			case OpaqueActionName3EditPart.VISUAL_ID:
				return new OpaqueActionName3EditPart(view);

			case OpaqueActionStereotype3EditPart.VISUAL_ID:
				return new OpaqueActionStereotype3EditPart(view);

			case FlowFinalNode3EditPart.VISUAL_ID:
				return new FlowFinalNode3EditPart(view);

			case ForkNode3EditPart.VISUAL_ID:
				return new ForkNode3EditPart(view);

			case JoinNode3EditPart.VISUAL_ID:
				return new JoinNode3EditPart(view);

			case ActivityPartition_PinEditPart.VISUAL_ID:
				return new ActivityPartition_PinEditPart(view);

			case ActivityPartition_PinNameEditPart.VISUAL_ID:
				return new ActivityPartition_PinNameEditPart(view);

			case ActivityPartition_PinInStateEditPart.VISUAL_ID:
				return new ActivityPartition_PinInStateEditPart(view);

			case ActivityPartition_PinOrderingEditPart.VISUAL_ID:
				return new ActivityPartition_PinOrderingEditPart(view);

			case ActivityPartition_PinStereotypeEditPart.VISUAL_ID:
				return new ActivityPartition_PinStereotypeEditPart(view);

			case CreateObjectAction3EditPart.VISUAL_ID:
				return new CreateObjectAction3EditPart(view);

			case CreateObjectActionName3EditPart.VISUAL_ID:
				return new CreateObjectActionName3EditPart(view);

			case CreateObjectActionStereotype3EditPart.VISUAL_ID:
				return new CreateObjectActionStereotype3EditPart(view);

			case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction3EditPart(view);

			case AddStructuralFeatureValueActionName3EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionName3EditPart(view);

			case AddStructuralFeatureValueActionStereotype3EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionStereotype3EditPart(view);

			case CallBehaviorAction3EditPart.VISUAL_ID:
				return new CallBehaviorAction3EditPart(view);

			case CallBehaviorActionName3EditPart.VISUAL_ID:
				return new CallBehaviorActionName3EditPart(view);

			case CallBehaviorActionStereotype3EditPart.VISUAL_ID:
				return new CallBehaviorActionStereotype3EditPart(view);

			case CallOperationAction3EditPart.VISUAL_ID:
				return new CallOperationAction3EditPart(view);

			case CallOperationActionName3EditPart.VISUAL_ID:
				return new CallOperationActionName3EditPart(view);

			case CallOperationActionStereotype3EditPart.VISUAL_ID:
				return new CallOperationActionStereotype3EditPart(view);

			case StructuredActivityNode3EditPart.VISUAL_ID:
				return new StructuredActivityNode3EditPart(view);

			case StructuredActivityNodeStereotype3EditPart.VISUAL_ID:
				return new StructuredActivityNodeStereotype3EditPart(view);

			case StructuredActivityNode4EditPart.VISUAL_ID:
				return new StructuredActivityNode4EditPart(view);

			case StructuredActivityNodeStereotype4EditPart.VISUAL_ID:
				return new StructuredActivityNodeStereotype4EditPart(view);

			case StructuredActivityNode_StructuredActivityNode_InputPinEditPart.VISUAL_ID:
				return new StructuredActivityNode_StructuredActivityNode_InputPinEditPart(view);

			case StructuredActivityNode_StructuredActivityNode_InputPinNameEditPart.VISUAL_ID:
				return new StructuredActivityNode_StructuredActivityNode_InputPinNameEditPart(view);

			case StructuredActivityNode_StructuredActivityNode_InputPinOrderingEditPart.VISUAL_ID:
				return new StructuredActivityNode_StructuredActivityNode_InputPinOrderingEditPart(view);

			case StructuredActivityNode_StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
				return new StructuredActivityNode_StructuredActivityNode_OutputPinEditPart(view);

			case StructuredActivityNode_StructuredActivityNode_OutputPinNameEditPart.VISUAL_ID:
				return new StructuredActivityNode_StructuredActivityNode_OutputPinNameEditPart(view);

			case StructuredActivityNode_StructuredActivityNode_OutputPinOrderingEditPart.VISUAL_ID:
				return new StructuredActivityNode_StructuredActivityNode_OutputPinOrderingEditPart(view);

			case SendSignalAction2EditPart.VISUAL_ID:
				return new SendSignalAction2EditPart(view);

			case SendSignalActionName2EditPart.VISUAL_ID:
				return new SendSignalActionName2EditPart(view);

			case SendSignalActionStereotype2EditPart.VISUAL_ID:
				return new SendSignalActionStereotype2EditPart(view);

			case LoopNode2EditPart.VISUAL_ID:
				return new LoopNode2EditPart(view);

			case LoopNodeStereotype2EditPart.VISUAL_ID:
				return new LoopNodeStereotype2EditPart(view);

			case ConditionalNode2EditPart.VISUAL_ID:
				return new ConditionalNode2EditPart(view);

			case ConditionalNodeStereotypeEditPart.VISUAL_ID:
				return new ConditionalNodeStereotypeEditPart(view);

			case ExpansionRegion2EditPart.VISUAL_ID:
				return new ExpansionRegion2EditPart(view);

			case ExpansionRegionMode2EditPart.VISUAL_ID:
				return new ExpansionRegionMode2EditPart(view);

			case ValueSpecificationActionEditPart.VISUAL_ID:
				return new ValueSpecificationActionEditPart(view);

			case ValueSpecificationActionNameEditPart.VISUAL_ID:
				return new ValueSpecificationActionNameEditPart(view);

			case ValueSpecificationActionStereotypeEditPart.VISUAL_ID:
				return new ValueSpecificationActionStereotypeEditPart(view);

			case OutputPin6EditPart.VISUAL_ID:
				return new OutputPin6EditPart(view);

			case OutputPinName6EditPart.VISUAL_ID:
				return new OutputPinName6EditPart(view);

			case OutputPinOrdering6EditPart.VISUAL_ID:
				return new OutputPinOrdering6EditPart(view);

			case LoopNodeEditPart.VISUAL_ID:
				return new LoopNodeEditPart(view);

			case LoopNodeNameEditPart.VISUAL_ID:
				return new LoopNodeNameEditPart(view);

			case LoopNodeStereotypeEditPart.VISUAL_ID:
				return new LoopNodeStereotypeEditPart(view);

			case ConditionalNodeEditPart.VISUAL_ID:
				return new ConditionalNodeEditPart(view);

			case ConditionalNodeNameEditPart.VISUAL_ID:
				return new ConditionalNodeNameEditPart(view);

			case ConditionalNodeStereotype2EditPart.VISUAL_ID:
				return new ConditionalNodeStereotype2EditPart(view);

			case ExpansionRegionEditPart.VISUAL_ID:
				return new ExpansionRegionEditPart(view);

			case ExpansionRegionModeEditPart.VISUAL_ID:
				return new ExpansionRegionModeEditPart(view);

			case ParameterSetEditPart.VISUAL_ID:
				return new ParameterSetEditPart(view);

			case ParameterEditPart.VISUAL_ID:
				return new ParameterEditPart(view);

			case ValueSpecificationAction2EditPart.VISUAL_ID:
				return new ValueSpecificationAction2EditPart(view);

			case ValueSpecificationActionName2EditPart.VISUAL_ID:
				return new ValueSpecificationActionName2EditPart(view);

			case ValueSpecificationActionStereotype2EditPart.VISUAL_ID:
				return new ValueSpecificationActionStereotype2EditPart(view);

			case LiteralStringEditPart.VISUAL_ID:
				return new LiteralStringEditPart(view);

			case LiteralString2EditPart.VISUAL_ID:
				return new LiteralString2EditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart(view);

			case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
				return new LoopNodeLoopNodeContentPaneCompartment2EditPart(view);

			case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
				return new ConditionalNodeConditionalNodeCompartment2EditPart(view);

			case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
				return new ExpansionRegionExpansionRegionNodeCompartment2EditPart(view);

			case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
				return new LoopNodeLoopNodeContentPaneCompartmentEditPart(view);

			case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
				return new ConditionalNodeConditionalNodeCompartmentEditPart(view);

			case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
				return new ExpansionRegionExpansionRegionNodeCompartmentEditPart(view);

			case ConstraintPreconditionEditPart.VISUAL_ID:
				return new ConstraintPreconditionEditPart(view);

			case ConstraintPostconditionEditPart.VISUAL_ID:
				return new ConstraintPostconditionEditPart(view);

			case ControlFlowEditPart.VISUAL_ID:
				return new ControlFlowEditPart(view);

			case ControlFlowNameEditPart.VISUAL_ID:
				return new ControlFlowNameEditPart(view);

			case ControlFlowName2EditPart.VISUAL_ID:
				return new ControlFlowName2EditPart(view);

			case ControlFlowName3EditPart.VISUAL_ID:
				return new ControlFlowName3EditPart(view);

			case ObjectFlowEditPart.VISUAL_ID:
				return new ObjectFlowEditPart(view);

			case ObjectFlowNameEditPart.VISUAL_ID:
				return new ObjectFlowNameEditPart(view);

			case ObjectFlowName2EditPart.VISUAL_ID:
				return new ObjectFlowName2EditPart(view);

			case ObjectFlowName3EditPart.VISUAL_ID:
				return new ObjectFlowName3EditPart(view);

			case ActionLocalPreconditionEditPart.VISUAL_ID:
				return new ActionLocalPreconditionEditPart(view);

			case ActionLocalPostconditionEditPart.VISUAL_ID:
				return new ActionLocalPostconditionEditPart(view);

			case ObjectNodeSelectionEditPart.VISUAL_ID:
				return new ObjectNodeSelectionEditPart(view);

			case ExceptionHandlerEditPart.VISUAL_ID:
				return new ExceptionHandlerEditPart(view);

			case ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID:
				return new ExceptionHandlerLink_fixed_iconEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel) {
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		} else if (source.getFigure() instanceof RotatedImageOfString) {
			return new RotatedImageCellEditorLocator((RotatedImageOfString) source.getFigure());
		} else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */

	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */

	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

}
