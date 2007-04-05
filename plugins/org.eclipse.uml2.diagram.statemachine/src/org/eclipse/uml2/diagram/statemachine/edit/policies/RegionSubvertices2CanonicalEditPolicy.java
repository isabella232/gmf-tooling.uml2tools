package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.statemachine.edit.parts.FinalStateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate4EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate5EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate6EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate7EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.Pseudostate8EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PseudostateEditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State2EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.State3EditPart;
import org.eclipse.uml2.diagram.statemachine.edit.parts.StateEditPart;

import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.Region;

/**
 * @generated
 */
public class RegionSubvertices2CanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		List result = new LinkedList();
		EObject modelObject = ((View) getHost().getModel()).getElement();
		View viewObject = (View) getHost().getModel();
		EObject nextValue;
		int nodeVID;
		for (Iterator values = ((Region) modelObject).getSubvertices().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			switch (nodeVID) {
			case StateEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case State2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case State3EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case FinalStateEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case PseudostateEditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate2EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate3EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate4EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate5EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate6EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate7EditPart.VISUAL_ID: {
				result.add(nextValue);
				break;
			}
			case Pseudostate8EditPart.VISUAL_ID: {
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
		case StateEditPart.VISUAL_ID:
		case State2EditPart.VISUAL_ID:
		case State3EditPart.VISUAL_ID:
		case FinalStateEditPart.VISUAL_ID:
		case PseudostateEditPart.VISUAL_ID:
		case Pseudostate2EditPart.VISUAL_ID:
		case Pseudostate3EditPart.VISUAL_ID:
		case Pseudostate4EditPart.VISUAL_ID:
		case Pseudostate5EditPart.VISUAL_ID:
		case Pseudostate6EditPart.VISUAL_ID:
		case Pseudostate7EditPart.VISUAL_ID:
		case Pseudostate8EditPart.VISUAL_ID:
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
