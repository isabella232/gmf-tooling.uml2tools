package org.eclipse.uml2.diagram.activity.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;

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
		Activity modelElement = (Activity) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getActivity_2026SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isActivity_2026DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3029SemanticChildren(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getOpaqueAction_3029SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isOpaqueAction_3029DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3042SemanticChildren(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getCreateObjectAction_3042SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isCreateObjectAction_3042DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3043SemanticChildren(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getAddStructuralFeatureValueAction_3043SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isAddStructuralFeatureValueAction_3043DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3044SemanticChildren(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getCallBehaviorAction_3044SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isCallBehaviorAction_3044DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3045SemanticChildren(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getCallOperationAction_3045SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isCallOperationAction_3045DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOpaqueAction_3011SemanticChildren(View view) {
		OpaqueAction modelElement = (OpaqueAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getOpaqueAction_3011SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isOpaqueAction_3011DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCreateObjectAction_3018SemanticChildren(View view) {
		CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getCreateObjectAction_3018SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isCreateObjectAction_3018DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallBehaviorAction_3019SemanticChildren(View view) {
		CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getCallBehaviorAction_3019SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isCallBehaviorAction_3019DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCallOperationAction_3020SemanticChildren(View view) {
		CallOperationAction modelElement = (CallOperationAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getCallOperationAction_3020SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isCallOperationAction_3020DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAddStructuralFeatureValueAction_3023SemanticChildren(View view) {
		AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getAddStructuralFeatureValueAction_3023SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isAddStructuralFeatureValueAction_3023DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActivitySubvertices_7010SemanticChildren(View view) {
		Activity modelElement = (Activity) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getActivitySubvertices_7010SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isActivitySubvertices_7010DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNodeStructuredActivityContentPaneCompartment_7008SemanticChildren(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getStructuredActivityNodeStructuredActivityContentPaneCompartment_7008SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isStructuredActivityNodeStructuredActivityContentPaneCompartment_7008DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStructuredActivityNodeStructuredActivityContentPaneCompartment_7002SemanticChildren(View view) {
		StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getStructuredActivityNodeStructuredActivityContentPaneCompartment_7002SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isStructuredActivityNodeStructuredActivityContentPaneCompartment_7002DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraintPrecondition_7013SemanticChildren(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getConstraintPrecondition_7013SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isConstraintPrecondition_7013DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConstraintPostcondition_7014SemanticChildren(View view) {
		Constraint modelElement = (Constraint) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getConstraintPostcondition_7014SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isConstraintPostcondition_7014DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPackage_1000SemanticChildren(View view) {
		Package modelElement = (Package) view.getElement();
		List result = new LinkedList();
		for (Iterator semanticIterator = getPackage_1000SemanticChildren(modelElement).iterator(); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			int visualID = UMLVisualIDRegistry.getNodeVisualID(view, nextElement);
			if (isPackage_1000DomainMetaChild(visualID)) {
				result.add(new UMLNodeDescriptor(nextElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static List getActivity_2026SemanticChildren(Activity modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getNodes());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getOpaqueAction_3029SemanticChildren(OpaqueAction modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getOutputValues());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getCreateObjectAction_3042SemanticChildren(CreateObjectAction modelElement) {
		List allValues = new LinkedList();
		allValues.add(modelElement.getResult());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getAddStructuralFeatureValueAction_3043SemanticChildren(AddStructuralFeatureValueAction modelElement) {
		List allValues = new LinkedList();
		allValues.add(modelElement.getInsertAt());
		allValues.add(modelElement.getValue());
		allValues.add(modelElement.getObject());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getCallBehaviorAction_3044SemanticChildren(CallBehaviorAction modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getResults());
		allValues.addAll(modelElement.getArguments());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getCallOperationAction_3045SemanticChildren(CallOperationAction modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getResults());
		allValues.addAll(modelElement.getArguments());
		allValues.add(modelElement.getTarget());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getOpaqueAction_3011SemanticChildren(OpaqueAction modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getOutputValues());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getCreateObjectAction_3018SemanticChildren(CreateObjectAction modelElement) {
		List allValues = new LinkedList();
		allValues.add(modelElement.getResult());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getCallBehaviorAction_3019SemanticChildren(CallBehaviorAction modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getResults());
		allValues.addAll(modelElement.getArguments());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getCallOperationAction_3020SemanticChildren(CallOperationAction modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getResults());
		allValues.addAll(modelElement.getArguments());
		allValues.add(modelElement.getTarget());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getAddStructuralFeatureValueAction_3023SemanticChildren(AddStructuralFeatureValueAction modelElement) {
		List allValues = new LinkedList();
		allValues.add(modelElement.getInsertAt());
		allValues.add(modelElement.getValue());
		allValues.add(modelElement.getObject());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getActivitySubvertices_7010SemanticChildren(Activity modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getNodes());
		allValues.addAll(modelElement.getGroups());
		allValues.addAll(modelElement.getOwnedBehaviors());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getStructuredActivityNodeStructuredActivityContentPaneCompartment_7008SemanticChildren(StructuredActivityNode modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getNodes());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getStructuredActivityNodeStructuredActivityContentPaneCompartment_7002SemanticChildren(StructuredActivityNode modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getNodes());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getConstraintPrecondition_7013SemanticChildren(Constraint modelElement) {
		List allValues = new LinkedList();
		allValues.add(modelElement.getSpecification());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getConstraintPostcondition_7014SemanticChildren(Constraint modelElement) {
		List allValues = new LinkedList();
		allValues.add(modelElement.getSpecification());
		return allValues;
	}

	/**
	 * @generated
	 */
	private static List getPackage_1000SemanticChildren(Package modelElement) {
		List allValues = new LinkedList();
		allValues.addAll(modelElement.getPackagedElements());
		Resource resource = modelElement.eResource();
		for (Iterator semanticIterator = getPhantomNodesIterator(resource); semanticIterator.hasNext();) {
			EObject nextElement = (EObject) semanticIterator.next();
			if (nextElement == modelElement) {
				continue;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(nextElement.eClass())) {
				allValues.add(nextElement);
				continue;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(nextElement.eClass())) {
				allValues.add(nextElement);
				continue;
			}
		}
		return allValues;
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
	public static boolean isActivity_2026DomainMetaChild(int visualID) {
		switch (visualID) {
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isOpaqueAction_3029DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPinEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isCreateObjectAction_3042DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPin2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isAddStructuralFeatureValueAction_3043DomainMetaChild(int visualID) {
		switch (visualID) {
		case InputPinEditPart.VISUAL_ID:
		case InputPin2EditPart.VISUAL_ID:
		case InputPin3EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isCallBehaviorAction_3044DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPin3EditPart.VISUAL_ID:
		case InputPin4EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isCallOperationAction_3045DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPin3EditPart.VISUAL_ID:
		case InputPin4EditPart.VISUAL_ID:
		case InputPin5EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isOpaqueAction_3011DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPinEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isCreateObjectAction_3018DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPin2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isCallBehaviorAction_3019DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPin3EditPart.VISUAL_ID:
		case InputPin4EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isCallOperationAction_3020DomainMetaChild(int visualID) {
		switch (visualID) {
		case OutputPin3EditPart.VISUAL_ID:
		case InputPin4EditPart.VISUAL_ID:
		case InputPin5EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isAddStructuralFeatureValueAction_3023DomainMetaChild(int visualID) {
		switch (visualID) {
		case InputPinEditPart.VISUAL_ID:
		case InputPin2EditPart.VISUAL_ID:
		case InputPin3EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isActivitySubvertices_7010DomainMetaChild(int visualID) {
		switch (visualID) {
		case AcceptEventActionEditPart.VISUAL_ID:
		case AcceptEventAction2EditPart.VISUAL_ID:
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
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
		case CallBehaviorActionEditPart.VISUAL_ID:
		case CallOperationActionEditPart.VISUAL_ID:
		case StructuredActivityNodeEditPart.VISUAL_ID:
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isStructuredActivityNodeStructuredActivityContentPaneCompartment_7008DomainMetaChild(int visualID) {
		switch (visualID) {
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
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isStructuredActivityNodeStructuredActivityContentPaneCompartment_7002DomainMetaChild(int visualID) {
		switch (visualID) {
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
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isConstraintPrecondition_7013DomainMetaChild(int visualID) {
		switch (visualID) {
		case LiteralStringEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isConstraintPostcondition_7014DomainMetaChild(int visualID) {
		switch (visualID) {
		case LiteralString2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isPackage_1000DomainMetaChild(int visualID) {
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
		case ConstraintEditPart.VISUAL_ID:
		case Constraint2EditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

}
