package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.activity.edit.parts.InputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinEditPart;

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.StructuralFeatureAction;
import org.eclipse.uml2.uml.WriteStructuralFeatureAction;

/**
 * @generated
 */
public class AddStructuralFeatureValueAction2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		nextValue = ((AddStructuralFeatureValueAction) modelObject).getInsertAt();
		nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (InputPinEditPart.VISUAL_ID == nodeVID) {
			result.add(nextValue);
		}
		nextValue = ((WriteStructuralFeatureAction) modelObject).getValue();
		nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (InputPin2EditPart.VISUAL_ID == nodeVID) {
			result.add(nextValue);
		}
		nextValue = ((StructuralFeatureAction) modelObject).getObject();
		nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (InputPin3EditPart.VISUAL_ID == nodeVID) {
			result.add(nextValue);
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
