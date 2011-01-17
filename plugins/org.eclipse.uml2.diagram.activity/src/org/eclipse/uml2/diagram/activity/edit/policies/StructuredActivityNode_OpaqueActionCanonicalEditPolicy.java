package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ValueSpecificationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction_insertAt_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction_object_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction_value_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallAction_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CommentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPostcondition_LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LocalPrecondition_LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterSetEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNode_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNode_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.activity.part.UMLNodeDescriptor;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class StructuredActivityNode_OpaqueActionCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<UMLNodeDescriptor> childDescriptors = UMLDiagramUpdater.getOpaqueAction_3011SemanticChildren(viewObject);
		for (UMLNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	protected boolean isOrphaned(Collection<EObject> semanticChildren, final View view) {
		return isMyDiagramElement(view) ? !semanticChildren.contains(view.getElement()) : isDefinitelyNotMyDiagramElement(view);
	}

	/**
	 * @generated
	 */
	private boolean isDefinitelyNotMyDiagramElement(View view) {
		int visualID = UMLVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
		case LocalPreconditionEditPart.VISUAL_ID:
		case LocalPostconditionEditPart.VISUAL_ID:
		case CommentEditPart.VISUAL_ID:
		case AcceptEventActionEditPart.VISUAL_ID:
		case AcceptTimeEventActionEditPart.VISUAL_ID:
		case ActivityFinalNodeEditPart.VISUAL_ID:
		case DecisionNodeEditPart.VISUAL_ID:
		case MergeNodeEditPart.VISUAL_ID:
		case InitialNodeEditPart.VISUAL_ID:
		case DataStoreNodeEditPart.VISUAL_ID:
		case CentralBufferNodeEditPart.VISUAL_ID:
		case OpaqueActionEditPart.VISUAL_ID:
		case FlowFinalNodeEditPart.VISUAL_ID:
		case ForkNodeEditPart.VISUAL_ID:
		case JoinNodeEditPart.VISUAL_ID:
		case PinEditPart.VISUAL_ID:
		case CreateObjectActionEditPart.VISUAL_ID:
		case CreateObjectAction_OutputPinEditPart.VISUAL_ID:
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
		case AddStructuralFeatureValueAction_insertAt_InputPinEditPart.VISUAL_ID:
		case AddStructuralFeatureValueAction_value_InputPinEditPart.VISUAL_ID:
		case AddStructuralFeatureValueAction_object_InputPinEditPart.VISUAL_ID:
		case CallBehaviorActionEditPart.VISUAL_ID:
		case CallAction_OutputPinEditPart.VISUAL_ID:
		case CallAction_InputPinEditPart.VISUAL_ID:
		case CallOperationActionEditPart.VISUAL_ID:
		case CallOperationAction_InputPinEditPart.VISUAL_ID:
		case StructuredActivityNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_OpaqueActionEditPart.VISUAL_ID:
		case StructuredActivityNode_AcceptEventActionEditPart.VISUAL_ID:
		case StructuredActivityNode_AcceptTimeEventActionEditPart.VISUAL_ID:
		case StructuredActivityNode_ActivityFinalNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_DecisionNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_FlowFinalNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_PinEditPart.VISUAL_ID:
		case StructuredActivityNode_CreateObjectActionEditPart.VISUAL_ID:
		case StructuredActivityNode_CallBehaviorActionEditPart.VISUAL_ID:
		case StructuredActivityNode_CallOperationActionEditPart.VISUAL_ID:
		case StructuredActivityNode_ForkNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_JoinNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
		case StructuredActivityNode_DataStoreNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_CentralBufferNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_InputPinEditPart.VISUAL_ID:
		case StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
		case StructuredActivityNode_ConditionalNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_InitialNodeEditPart.VISUAL_ID:
		case OpaqueBehaviorEditPart.VISUAL_ID:
		case ActivityParameterNodeEditPart.VISUAL_ID:
		case SendSignalActionEditPart.VISUAL_ID:
		case ActivityPartitionEditPart.VISUAL_ID:
		case ActivityPartition_ActivityPartitionEditPart.VISUAL_ID:
		case ActivityPartition_AcceptEventActionEditPart.VISUAL_ID:
		case ActivityPartition_AcceptTimeEventActionEditPart.VISUAL_ID:
		case ActivityPartition_ActivityFinalNodeEditPart.VISUAL_ID:
		case ActivityPartition_DecisionNodeEditPart.VISUAL_ID:
		case ActivityPartition_MergeNodeEditPart.VISUAL_ID:
		case ActivityPartition_InitialNodeEditPart.VISUAL_ID:
		case ActivityPartition_DataStoreNodeEditPart.VISUAL_ID:
		case ActivityPartition_CentralBufferNodeEditPart.VISUAL_ID:
		case ActivityPartition_OpaqueActionEditPart.VISUAL_ID:
		case ActivityPartition_FlowFinalNodeEditPart.VISUAL_ID:
		case ActivityPartition_ForkNodeEditPart.VISUAL_ID:
		case ActivityPartition_JoinNodeEditPart.VISUAL_ID:
		case ActivityPartition_PinEditPart.VISUAL_ID:
		case ActivityPartition_CreateObjectActionEditPart.VISUAL_ID:
		case ActivityPartition_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
		case ActivityPartition_CallBehaviorActionEditPart.VISUAL_ID:
		case ActivityPartition_CallOperationActionEditPart.VISUAL_ID:
		case ActivityPartition_StructuredActivityNodeEditPart.VISUAL_ID:
		case ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
		case StructuredActivityNode_StructuredActivityNode_InputPinEditPart.VISUAL_ID:
		case StructuredActivityNode_StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
		case ActivityPartition_SendSignalActionEditPart.VISUAL_ID:
		case ActivityPartition_LoopNodeEditPart.VISUAL_ID:
		case ActivityPartition_ConditionalNodeEditPart.VISUAL_ID:
		case ActivityPartition_ExpansionRegionEditPart.VISUAL_ID:
		case ActivityPartition_ValueSpecificationActionEditPart.VISUAL_ID:
		case ValueSpecificationAction_OutputPinEditPart.VISUAL_ID:
		case LoopNodeEditPart.VISUAL_ID:
		case ConditionalNodeEditPart.VISUAL_ID:
		case ExpansionRegionEditPart.VISUAL_ID:
		case ExpansionNodeEditPart.VISUAL_ID:
		case ParameterSetEditPart.VISUAL_ID:
		case ParameterEditPart.VISUAL_ID:
		case ValueSpecificationActionEditPart.VISUAL_ID:
		case LocalPrecondition_LiteralStringEditPart.VISUAL_ID:
		case LocalPostcondition_LiteralStringEditPart.VISUAL_ID:
			return true;

		}
		return false;
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = UMLVisualIDRegistry.getVisualID(view);
		return visualID == OpaqueAction_OutputPinEditPart.VISUAL_ID || visualID == OpaqueAction_InputPinEditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<UMLNodeDescriptor> childDescriptors = UMLDiagramUpdater.getOpaqueAction_3011SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<UMLNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator.hasNext();) {
			UMLNodeDescriptor next = descriptorsIterator.next();
			String hint = UMLVisualIDRegistry.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					//if (hint.equals(childView.getType())) {
					if (UMLVisualIDRegistry.checkNodeVisualID((View) (getHost().getModel()), semanticElement, next.getVisualID())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getLast());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(childDescriptors.size());
		for (UMLNodeDescriptor next : childDescriptors) {
			String hint = UMLVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(elementAdapter, Node.class, hint, ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}
		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE.getOpaqueAction_OutputValue());
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE.getOpaqueAction_InputValue());
		}
		return myFeaturesToSynchronize;
	}

}
