package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.clazz.edit.parts.Class4EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Operation6EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property6EditPart;

import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.Interface;

/**
 * @generated
 */
public class Interface2CanonicalEditPolicy extends CanonicalEditPolicy {

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
		for (Iterator values = ((Interface) modelObject).getOwnedAttributes().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Property6EditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((Interface) modelObject).getOwnedOperations().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Operation6EditPart.VISUAL_ID == nodeVID) {
				result.add(nextValue);
			}
		}
		for (Iterator values = ((Interface) modelObject).getNestedClassifiers().iterator(); values.hasNext();) {
			nextValue = (EObject) values.next();
			nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
			if (Class4EditPart.VISUAL_ID == nodeVID) {
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
