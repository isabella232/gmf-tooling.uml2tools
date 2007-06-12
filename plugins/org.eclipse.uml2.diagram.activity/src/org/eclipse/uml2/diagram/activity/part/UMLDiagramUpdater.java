package org.eclipse.uml2.diagram.activity.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivitySubverticesEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.SendSignalAction;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2026SemanticChildren(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3029SemanticChildren(view);
		case CreateObjectActionEditPart.VISUAL_ID:
			return getCreateObjectAction_3042SemanticChildren(view);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3043SemanticChildren(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3044SemanticChildren(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3045SemanticChildren(view);
		case OpaqueAction2EditPart.VISUAL_ID:
			return getOpaqueAction_3011SemanticChildren(view);
		case CreateObjectAction2EditPart.VISUAL_ID:
			return getCreateObjectAction_3018SemanticChildren(view);
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return getCallBehaviorAction_3019SemanticChildren(view);
		case CallOperationAction2EditPart.VISUAL_ID:
			return getCallOperationAction_3020SemanticChildren(view);
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3023SemanticChildren(view);
		case ActivitySubverticesEditPart.VISUAL_ID:
			return getActivitySubvertices_7010SemanticChildren(view);
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityContentPaneCompartment_7008SemanticChildren(view);
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
			return getStructuredActivityNodeStructuredActivityContentPaneCompartment_7002SemanticChildren(view);
		case ConstraintPreconditionEditPart.VISUAL_ID:
			return getConstraintPrecondition_7013SemanticChildren(view);
		case ConstraintPostconditionEditPart.VISUAL_ID:
			return getConstraintPostcondition_7014SemanticChildren(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2026SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActivityParameterNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3029SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOutputValues().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPinEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3042SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		{
			OutputPin childElement = modelElement.getResult();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPin2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3043SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		{
			InputPin childElement = modelElement.getInsertAt();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPinEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputPin childElement = modelElement.getValue();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputPin childElement = modelElement.getObject();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3044SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPin3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3045SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPin3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InputPin childElement = modelElement.getTarget();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin5EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3011SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOutputValues().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPinEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3018SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		{
			OutputPin childElement = modelElement.getResult();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPin2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3019SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPin3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3020SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResults().iterator(); it.hasNext();) {
			OutputPin childElement = (OutputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPin3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getArguments().iterator(); it.hasNext();) {
			InputPin childElement = (InputPin) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			InputPin childElement = modelElement.getTarget();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin5EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3023SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		{
			InputPin childElement = modelElement.getInsertAt();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPinEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputPin childElement = modelElement.getValue();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		{
			InputPin childElement = modelElement.getObject();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPin3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivitySubvertices_7010SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Activity modelElement = (Activity) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AcceptEventActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AcceptEventAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityFinalNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MergeNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InitialNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataStoreNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CentralBufferNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FlowFinalNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PinEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CreateObjectActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddStructuralFeatureValueActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallBehaviorActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallOperationActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SendSignalActionEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getGroups().iterator(); it.hasNext();) {
			ActivityGroup childElement = (ActivityGroup) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StructuredActivityNodeEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOwnedBehaviors().iterator(); it.hasNext();) {
			Behavior childElement = (Behavior) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OpaqueBehaviorEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNodeStructuredActivityContentPaneCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		StructuredActivityNode modelElement = (StructuredActivityNode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AcceptEventAction3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AcceptEventAction4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityFinalNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FlowFinalNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pin2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CreateObjectAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallBehaviorAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallOperationAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddStructuralFeatureValueAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataStoreNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CentralBufferNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNodeStructuredActivityContentPaneCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		StructuredActivityNode modelElement = (StructuredActivityNode) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			ActivityNode childElement = (ActivityNode) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StructuredActivityNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OpaqueAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AcceptEventAction3EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AcceptEventAction4EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ActivityFinalNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DecisionNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FlowFinalNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Pin2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CreateObjectAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallBehaviorAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CallOperationAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForkNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JoinNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AddStructuralFeatureValueAction2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataStoreNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CentralBufferNode2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraintPrecondition_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Constraint modelElement = (Constraint) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecification childElement = modelElement.getSpecification();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LiteralStringEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraintPostcondition_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Constraint modelElement = (Constraint) containerView.getElement();
		List result = new LinkedList();
		{
			ValueSpecification childElement = modelElement.getSpecification();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == LiteralString2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getPackagedElements().iterator(); it.hasNext();) {
			PackageableElement childElement = (PackageableElement) it.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActivityEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator.hasNext();) {
			EObject childElement = (EObject) semanticIterator.next();
			if (childElement == modelElement) {
				continue;
			}
			if (UMLVisualIDRegistry.getNodeVisualID(view, childElement) == ConstraintEditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, ConstraintEditPart.VISUAL_ID));
				continue;
			}
			if (UMLVisualIDRegistry.getNodeVisualID(view, childElement) == Constraint2EditPart.VISUAL_ID) {
				result.add(new UMLNodeDescriptor(childElement, Constraint2EditPart.VISUAL_ID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Iterator getPhantomNodesIterator(Resource resource) {
		return resource.getAllContents();
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2026ContainedLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2027ContainedLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_2028ContainedLinks(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3030ContainedLinks(view);
		case AcceptEventAction2EditPart.VISUAL_ID:
			return getAcceptEventAction_3031ContainedLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3032ContainedLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3033ContainedLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3034ContainedLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3035ContainedLinks(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3036ContainedLinks(view);
		case CentralBufferNodeEditPart.VISUAL_ID:
			return getCentralBufferNode_3037ContainedLinks(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3029ContainedLinks(view);
		case OutputPinEditPart.VISUAL_ID:
			return getOutputPin_3001ContainedLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3038ContainedLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3039ContainedLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3040ContainedLinks(view);
		case PinEditPart.VISUAL_ID:
			return getPin_3041ContainedLinks(view);
		case CreateObjectActionEditPart.VISUAL_ID:
			return getCreateObjectAction_3042ContainedLinks(view);
		case OutputPin2EditPart.VISUAL_ID:
			return getOutputPin_3002ContainedLinks(view);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3043ContainedLinks(view);
		case InputPinEditPart.VISUAL_ID:
			return getInputPin_3003ContainedLinks(view);
		case InputPin2EditPart.VISUAL_ID:
			return getInputPin_3004ContainedLinks(view);
		case InputPin3EditPart.VISUAL_ID:
			return getInputPin_3005ContainedLinks(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3044ContainedLinks(view);
		case OutputPin3EditPart.VISUAL_ID:
			return getOutputPin_3006ContainedLinks(view);
		case InputPin4EditPart.VISUAL_ID:
			return getInputPin_3007ContainedLinks(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3045ContainedLinks(view);
		case InputPin5EditPart.VISUAL_ID:
			return getInputPin_3008ContainedLinks(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3046ContainedLinks(view);
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3009ContainedLinks(view);
		case OpaqueAction2EditPart.VISUAL_ID:
			return getOpaqueAction_3011ContainedLinks(view);
		case AcceptEventAction3EditPart.VISUAL_ID:
			return getAcceptEventAction_3012ContainedLinks(view);
		case AcceptEventAction4EditPart.VISUAL_ID:
			return getAcceptEventAction_3013ContainedLinks(view);
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return getActivityFinalNode_3014ContainedLinks(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015ContainedLinks(view);
		case FlowFinalNode2EditPart.VISUAL_ID:
			return getFlowFinalNode_3016ContainedLinks(view);
		case Pin2EditPart.VISUAL_ID:
			return getPin_3017ContainedLinks(view);
		case CreateObjectAction2EditPart.VISUAL_ID:
			return getCreateObjectAction_3018ContainedLinks(view);
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return getCallBehaviorAction_3019ContainedLinks(view);
		case CallOperationAction2EditPart.VISUAL_ID:
			return getCallOperationAction_3020ContainedLinks(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3021ContainedLinks(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3022ContainedLinks(view);
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3023ContainedLinks(view);
		case DataStoreNode2EditPart.VISUAL_ID:
			return getDataStoreNode_3024ContainedLinks(view);
		case CentralBufferNode2EditPart.VISUAL_ID:
			return getCentralBufferNode_3025ContainedLinks(view);
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return getOpaqueBehavior_3047ContainedLinks(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3052ContainedLinks(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3053ContainedLinks(view);
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralString_3049ContainedLinks(view);
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralString_3051ContainedLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001ContainedLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002ContainedLinks(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2026IncomingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2027IncomingLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_2028IncomingLinks(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3030IncomingLinks(view);
		case AcceptEventAction2EditPart.VISUAL_ID:
			return getAcceptEventAction_3031IncomingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3032IncomingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3033IncomingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3034IncomingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3035IncomingLinks(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3036IncomingLinks(view);
		case CentralBufferNodeEditPart.VISUAL_ID:
			return getCentralBufferNode_3037IncomingLinks(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3029IncomingLinks(view);
		case OutputPinEditPart.VISUAL_ID:
			return getOutputPin_3001IncomingLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3038IncomingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3039IncomingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3040IncomingLinks(view);
		case PinEditPart.VISUAL_ID:
			return getPin_3041IncomingLinks(view);
		case CreateObjectActionEditPart.VISUAL_ID:
			return getCreateObjectAction_3042IncomingLinks(view);
		case OutputPin2EditPart.VISUAL_ID:
			return getOutputPin_3002IncomingLinks(view);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3043IncomingLinks(view);
		case InputPinEditPart.VISUAL_ID:
			return getInputPin_3003IncomingLinks(view);
		case InputPin2EditPart.VISUAL_ID:
			return getInputPin_3004IncomingLinks(view);
		case InputPin3EditPart.VISUAL_ID:
			return getInputPin_3005IncomingLinks(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3044IncomingLinks(view);
		case OutputPin3EditPart.VISUAL_ID:
			return getOutputPin_3006IncomingLinks(view);
		case InputPin4EditPart.VISUAL_ID:
			return getInputPin_3007IncomingLinks(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3045IncomingLinks(view);
		case InputPin5EditPart.VISUAL_ID:
			return getInputPin_3008IncomingLinks(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3046IncomingLinks(view);
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3009IncomingLinks(view);
		case OpaqueAction2EditPart.VISUAL_ID:
			return getOpaqueAction_3011IncomingLinks(view);
		case AcceptEventAction3EditPart.VISUAL_ID:
			return getAcceptEventAction_3012IncomingLinks(view);
		case AcceptEventAction4EditPart.VISUAL_ID:
			return getAcceptEventAction_3013IncomingLinks(view);
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return getActivityFinalNode_3014IncomingLinks(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015IncomingLinks(view);
		case FlowFinalNode2EditPart.VISUAL_ID:
			return getFlowFinalNode_3016IncomingLinks(view);
		case Pin2EditPart.VISUAL_ID:
			return getPin_3017IncomingLinks(view);
		case CreateObjectAction2EditPart.VISUAL_ID:
			return getCreateObjectAction_3018IncomingLinks(view);
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return getCallBehaviorAction_3019IncomingLinks(view);
		case CallOperationAction2EditPart.VISUAL_ID:
			return getCallOperationAction_3020IncomingLinks(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3021IncomingLinks(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3022IncomingLinks(view);
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3023IncomingLinks(view);
		case DataStoreNode2EditPart.VISUAL_ID:
			return getDataStoreNode_3024IncomingLinks(view);
		case CentralBufferNode2EditPart.VISUAL_ID:
			return getCentralBufferNode_3025IncomingLinks(view);
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return getOpaqueBehavior_3047IncomingLinks(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3052IncomingLinks(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3053IncomingLinks(view);
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralString_3049IncomingLinks(view);
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralString_3051IncomingLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001IncomingLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002IncomingLinks(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case ActivityEditPart.VISUAL_ID:
			return getActivity_2026OutgoingLinks(view);
		case ConstraintEditPart.VISUAL_ID:
			return getConstraint_2027OutgoingLinks(view);
		case Constraint2EditPart.VISUAL_ID:
			return getConstraint_2028OutgoingLinks(view);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getAcceptEventAction_3030OutgoingLinks(view);
		case AcceptEventAction2EditPart.VISUAL_ID:
			return getAcceptEventAction_3031OutgoingLinks(view);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getActivityFinalNode_3032OutgoingLinks(view);
		case DecisionNodeEditPart.VISUAL_ID:
			return getDecisionNode_3033OutgoingLinks(view);
		case MergeNodeEditPart.VISUAL_ID:
			return getMergeNode_3034OutgoingLinks(view);
		case InitialNodeEditPart.VISUAL_ID:
			return getInitialNode_3035OutgoingLinks(view);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getDataStoreNode_3036OutgoingLinks(view);
		case CentralBufferNodeEditPart.VISUAL_ID:
			return getCentralBufferNode_3037OutgoingLinks(view);
		case OpaqueActionEditPart.VISUAL_ID:
			return getOpaqueAction_3029OutgoingLinks(view);
		case OutputPinEditPart.VISUAL_ID:
			return getOutputPin_3001OutgoingLinks(view);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getFlowFinalNode_3038OutgoingLinks(view);
		case ForkNodeEditPart.VISUAL_ID:
			return getForkNode_3039OutgoingLinks(view);
		case JoinNodeEditPart.VISUAL_ID:
			return getJoinNode_3040OutgoingLinks(view);
		case PinEditPart.VISUAL_ID:
			return getPin_3041OutgoingLinks(view);
		case CreateObjectActionEditPart.VISUAL_ID:
			return getCreateObjectAction_3042OutgoingLinks(view);
		case OutputPin2EditPart.VISUAL_ID:
			return getOutputPin_3002OutgoingLinks(view);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3043OutgoingLinks(view);
		case InputPinEditPart.VISUAL_ID:
			return getInputPin_3003OutgoingLinks(view);
		case InputPin2EditPart.VISUAL_ID:
			return getInputPin_3004OutgoingLinks(view);
		case InputPin3EditPart.VISUAL_ID:
			return getInputPin_3005OutgoingLinks(view);
		case CallBehaviorActionEditPart.VISUAL_ID:
			return getCallBehaviorAction_3044OutgoingLinks(view);
		case OutputPin3EditPart.VISUAL_ID:
			return getOutputPin_3006OutgoingLinks(view);
		case InputPin4EditPart.VISUAL_ID:
			return getInputPin_3007OutgoingLinks(view);
		case CallOperationActionEditPart.VISUAL_ID:
			return getCallOperationAction_3045OutgoingLinks(view);
		case InputPin5EditPart.VISUAL_ID:
			return getInputPin_3008OutgoingLinks(view);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return getStructuredActivityNode_3046OutgoingLinks(view);
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return getStructuredActivityNode_3009OutgoingLinks(view);
		case OpaqueAction2EditPart.VISUAL_ID:
			return getOpaqueAction_3011OutgoingLinks(view);
		case AcceptEventAction3EditPart.VISUAL_ID:
			return getAcceptEventAction_3012OutgoingLinks(view);
		case AcceptEventAction4EditPart.VISUAL_ID:
			return getAcceptEventAction_3013OutgoingLinks(view);
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return getActivityFinalNode_3014OutgoingLinks(view);
		case DecisionNode2EditPart.VISUAL_ID:
			return getDecisionNode_3015OutgoingLinks(view);
		case FlowFinalNode2EditPart.VISUAL_ID:
			return getFlowFinalNode_3016OutgoingLinks(view);
		case Pin2EditPart.VISUAL_ID:
			return getPin_3017OutgoingLinks(view);
		case CreateObjectAction2EditPart.VISUAL_ID:
			return getCreateObjectAction_3018OutgoingLinks(view);
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return getCallBehaviorAction_3019OutgoingLinks(view);
		case CallOperationAction2EditPart.VISUAL_ID:
			return getCallOperationAction_3020OutgoingLinks(view);
		case ForkNode2EditPart.VISUAL_ID:
			return getForkNode_3021OutgoingLinks(view);
		case JoinNode2EditPart.VISUAL_ID:
			return getJoinNode_3022OutgoingLinks(view);
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return getAddStructuralFeatureValueAction_3023OutgoingLinks(view);
		case DataStoreNode2EditPart.VISUAL_ID:
			return getDataStoreNode_3024OutgoingLinks(view);
		case CentralBufferNode2EditPart.VISUAL_ID:
			return getCentralBufferNode_3025OutgoingLinks(view);
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return getOpaqueBehavior_3047OutgoingLinks(view);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return getActivityParameterNode_3052OutgoingLinks(view);
		case SendSignalActionEditPart.VISUAL_ID:
			return getSendSignalAction_3053OutgoingLinks(view);
		case LiteralStringEditPart.VISUAL_ID:
			return getLiteralString_3049OutgoingLinks(view);
		case LiteralString2EditPart.VISUAL_ID:
			return getLiteralString_3051OutgoingLinks(view);
		case ControlFlowEditPart.VISUAL_ID:
			return getControlFlow_4001OutgoingLinks(view);
		case ObjectFlowEditPart.VISUAL_ID:
			return getObjectFlow_4002OutgoingLinks(view);
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getExceptionHandler_4005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2026ContainedLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2027ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2028ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3030ContainedLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3031ContainedLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3032ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3033ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMergeNode_3034ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInitialNode_3035ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3036ContainedLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCentralBufferNode_3037ContainedLinks(View view) {
		CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3029ContainedLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3001ContainedLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3038ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3039ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3040ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPin_3041ContainedLinks(View view) {
		Pin modelElement = (Pin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3042ContainedLinks(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3002ContainedLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3043ContainedLinks(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3003ContainedLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3004ContainedLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3005ContainedLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3044ContainedLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3006ContainedLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3007ContainedLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3045ContainedLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3008ContainedLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3046ContainedLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3009ContainedLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3011ContainedLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3012ContainedLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3013ContainedLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPin_3017ContainedLinks(View view) {
		Pin modelElement = (Pin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3018ContainedLinks(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3019ContainedLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3020ContainedLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3021ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3023ContainedLinks(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3024ContainedLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCentralBufferNode_3025ContainedLinks(View view) {
		CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueBehavior_3047ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivityParameterNode_3052ContainedLinks(View view) {
		ActivityParameterNode modelElement = (ActivityParameterNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3053ContainedLinks(View view) {
		SendSignalAction modelElement = (SendSignalAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLiteralString_3049ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLiteralString_3051ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlFlow_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjectFlow_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionHandler_4005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2026IncomingLinks(View view) {
		Activity modelElement = (Activity) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2027IncomingLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2028IncomingLinks(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3030IncomingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3031IncomingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3032IncomingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3033IncomingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMergeNode_3034IncomingLinks(View view) {
		MergeNode modelElement = (MergeNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInitialNode_3035IncomingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3036IncomingLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCentralBufferNode_3037IncomingLinks(View view) {
		CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3029IncomingLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3001IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3038IncomingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3039IncomingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3040IncomingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPin_3041IncomingLinks(View view) {
		Pin modelElement = (Pin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3042IncomingLinks(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3002IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3043IncomingLinks(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3003IncomingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3004IncomingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3005IncomingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3044IncomingLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3006IncomingLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3007IncomingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3045IncomingLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3008IncomingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3046IncomingLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3009IncomingLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3011IncomingLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3012IncomingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3013IncomingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3014IncomingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3015IncomingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3016IncomingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPin_3017IncomingLinks(View view) {
		Pin modelElement = (Pin) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3018IncomingLinks(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3019IncomingLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3020IncomingLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3021IncomingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3022IncomingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3023IncomingLinks(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3024IncomingLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCentralBufferNode_3025IncomingLinks(View view) {
		CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueBehavior_3047IncomingLinks(View view) {
		OpaqueBehavior modelElement = (OpaqueBehavior) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityParameterNode_3052IncomingLinks(View view) {
		ActivityParameterNode modelElement = (ActivityParameterNode) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3053IncomingLinks(View view) {
		SendSignalAction modelElement = (SendSignalAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_ControlFlow_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ObjectFlow_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_ExceptionHandler_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLiteralString_3049IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLiteralString_3051IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlFlow_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjectFlow_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionHandler_4005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivity_2026OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2027OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getConstraint_2028OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3030OutgoingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3031OutgoingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3032OutgoingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3033OutgoingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMergeNode_3034OutgoingLinks(View view) {
		MergeNode modelElement = (MergeNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInitialNode_3035OutgoingLinks(View view) {
		InitialNode modelElement = (InitialNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3036OutgoingLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCentralBufferNode_3037OutgoingLinks(View view) {
		CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3029OutgoingLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3001OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3038OutgoingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3039OutgoingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3040OutgoingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPin_3041OutgoingLinks(View view) {
		Pin modelElement = (Pin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3042OutgoingLinks(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3002OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3043OutgoingLinks(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3003OutgoingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3004OutgoingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3005OutgoingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3044OutgoingLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOutputPin_3006OutgoingLinks(View view) {
		OutputPin modelElement = (OutputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3007OutgoingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3045OutgoingLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInputPin_3008OutgoingLinks(View view) {
		InputPin modelElement = (InputPin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3046OutgoingLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNode_3009OutgoingLinks(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3011OutgoingLinks(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3012OutgoingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAcceptEventAction_3013OutgoingLinks(View view) {
		AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivityFinalNode_3014OutgoingLinks(View view) {
		ActivityFinalNode modelElement = (ActivityFinalNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDecisionNode_3015OutgoingLinks(View view) {
		DecisionNode modelElement = (DecisionNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getFlowFinalNode_3016OutgoingLinks(View view) {
		FlowFinalNode modelElement = (FlowFinalNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPin_3017OutgoingLinks(View view) {
		Pin modelElement = (Pin) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3018OutgoingLinks(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3019OutgoingLinks(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3020OutgoingLinks(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkNode_3021OutgoingLinks(View view) {
		ForkNode modelElement = (ForkNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getJoinNode_3022OutgoingLinks(View view) {
		JoinNode modelElement = (JoinNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3023OutgoingLinks(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDataStoreNode_3024OutgoingLinks(View view) {
		DataStoreNode modelElement = (DataStoreNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCentralBufferNode_3025OutgoingLinks(View view) {
		CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueBehavior_3047OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActivityParameterNode_3052OutgoingLinks(View view) {
		ActivityParameterNode modelElement = (ActivityParameterNode) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSendSignalAction_3053OutgoingLinks(View view) {
		SendSignalAction modelElement = (SendSignalAction) view.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_ControlFlow_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ObjectFlow_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLiteralString_3049OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLiteralString_3051OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getControlFlow_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getObjectFlow_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExceptionHandler_4005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ControlFlow_4001(Activity container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEdges().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) linkObject;
			if (ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ControlFlow_4001, ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ObjectFlow_4002(Activity container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEdges().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) linkObject;
			if (ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ObjectFlow_4002, ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_ExceptionHandler_4005(ExecutableNode container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHandlers().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ExceptionHandler) {
				continue;
			}
			ExceptionHandler link = (ExceptionHandler) linkObject;
			if (ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExecutableNode dst = link.getHandlerBody();
			ExecutableNode src = link.getProtectedNode();
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ExceptionHandler_4005, ExceptionHandlerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ControlFlow_4001(ActivityNode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getActivityEdge_Target() || false == setting.getEObject() instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) setting.getEObject();
			if (ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.ControlFlow_4001, ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ObjectFlow_4002(ActivityNode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getActivityEdge_Target() || false == setting.getEObject() instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) setting.getEObject();
			if (ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode src = link.getSource();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.ObjectFlow_4002, ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Action_LocalPrecondition_4003(Constraint target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getAction_LocalPrecondition()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ActionLocalPrecondition_4003, ActionLocalPreconditionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_ObjectNode_Selection_4004(Behavior target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() == UMLPackage.eINSTANCE.getObjectNode_Selection()) {
				result.add(new UMLLinkDescriptor(setting.getEObject(), target, UMLElementTypes.ObjectNodeSelection_4004, ObjectNodeSelectionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_ExceptionHandler_4005(ExecutableNode target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it.next();
			if (setting.getEStructuralFeature() != UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody() || false == setting.getEObject() instanceof ExceptionHandler) {
				continue;
			}
			ExceptionHandler link = (ExceptionHandler) setting.getEObject();
			if (ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExecutableNode src = link.getProtectedNode();
			result.add(new UMLLinkDescriptor(src, target, link, UMLElementTypes.ExceptionHandler_4005, ExceptionHandlerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ControlFlow_4001(ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getEdges().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ControlFlow) {
				continue;
			}
			ControlFlow link = (ControlFlow) linkObject;
			if (ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ControlFlow_4001, ControlFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ObjectFlow_4002(ActivityNode source) {
		Activity container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof Activity) {
				container = (Activity) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getEdges().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ObjectFlow) {
				continue;
			}
			ObjectFlow link = (ObjectFlow) linkObject;
			if (ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ActivityNode dst = link.getTarget();
			ActivityNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ObjectFlow_4002, ObjectFlowEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Action_LocalPrecondition_4003(Action source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getLocalPreconditions().iterator(); destinations.hasNext();) {
			Constraint destination = (Constraint) destinations.next();
			result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.ActionLocalPrecondition_4003, ActionLocalPreconditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_ObjectNode_Selection_4004(ObjectNode source) {
		Collection result = new LinkedList();
		Behavior destination = source.getSelection();
		result.add(new UMLLinkDescriptor(source, destination, UMLElementTypes.ObjectNodeSelection_4004, ObjectNodeSelectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_ExceptionHandler_4005(ExecutableNode source) {
		ExecutableNode container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ExecutableNode) {
				container = (ExecutableNode) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getHandlers().iterator(); links.hasNext();) {
			Object linkObject = links.next();
			if (false == linkObject instanceof ExceptionHandler) {
				continue;
			}
			ExceptionHandler link = (ExceptionHandler) linkObject;
			if (ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			ExecutableNode dst = link.getHandlerBody();
			ExecutableNode src = link.getProtectedNode();
			if (src != source) {
				continue;
			}
			result.add(new UMLLinkDescriptor(src, dst, link, UMLElementTypes.ExceptionHandler_4005, ExceptionHandlerEditPart.VISUAL_ID));
		}
		return result;
	}

}
