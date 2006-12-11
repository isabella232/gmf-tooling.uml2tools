package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.CreateObjectAction;

/**
 * @generated
 */
public class CreateObjectAction2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		nextValue = ((CreateObjectAction) modelObject).getResult();
		nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (OutputPin2EditPart.VISUAL_ID == nodeVID) {
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
