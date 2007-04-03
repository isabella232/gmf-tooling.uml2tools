package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.StructuredActivityNode;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityContentPaneCompartment2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 *  
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((StructuredActivityNode) modelObject).getNodes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case StructuredActivityNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case OpaqueAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AcceptEventAction3EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AcceptEventAction4EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ActivityFinalNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DecisionNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case FlowFinalNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pin2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CreateObjectAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CallBehaviorAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CallOperationAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case ForkNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case JoinNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case AddStructuralFeatureValueAction2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case DataStoreNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case CentralBufferNode2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return view.isSetElement() && (view.getElement() == null || view.getElement().eIsProxy());
		}

		int nodeVID = UMLVisualIDRegistry.getVisualID(view);
		switch (nodeVID) {
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
	protected String getDefaultFactoryHint() {
		return null;
	}

}
