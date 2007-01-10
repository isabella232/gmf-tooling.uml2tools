package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.Constraint;

/**
 * @generated
 */
public class ConstraintPreconditionCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		nextValue = ((Constraint) modelObject).getSpecification();
		nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (LiteralStringEditPart.VISUAL_ID == nodeVID) {
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
