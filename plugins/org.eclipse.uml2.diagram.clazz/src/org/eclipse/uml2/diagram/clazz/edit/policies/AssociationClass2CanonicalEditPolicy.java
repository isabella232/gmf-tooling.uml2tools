package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.diagram.clazz.edit.parts.RedefinableTemplateSignatureEditPart;

import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

import org.eclipse.uml2.uml.TemplateableElement;

/**
 * @generated
 */
public class AssociationClass2CanonicalEditPolicy extends CanonicalEditPolicy {

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
		nextValue = ((TemplateableElement) modelObject).getOwnedTemplateSignature();
		nodeVID = UMLVisualIDRegistry.getNodeVisualID(viewObject, nextValue);
		if (RedefinableTemplateSignatureEditPart.VISUAL_ID == nodeVID) {
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
