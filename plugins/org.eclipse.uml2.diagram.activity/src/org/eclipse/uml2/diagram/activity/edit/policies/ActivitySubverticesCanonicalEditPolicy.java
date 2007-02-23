package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioredClassifier;

/**
 * @generated
 */
public class ActivitySubverticesCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Activity) modelObject).getNodes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case AcceptEventActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AcceptEventAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ActivityFinalNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DecisionNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case MergeNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case InitialNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DataStoreNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CentralBufferNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case OpaqueActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case FlowFinalNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ForkNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case JoinNodeEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case PinEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CreateObjectActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CallBehaviorActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CallOperationActionEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		for (Iterator values = ((Activity) modelObject).getGroups().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (StructuredActivityNodeEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((BehavioredClassifier) modelObject).getOwnedBehaviors().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (OpaqueBehaviorEditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return view.isSetElement() && view.getElement() != null && view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

}
