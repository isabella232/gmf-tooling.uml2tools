package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.clazz.edit.commands.LiteralStringCreateCommand;

import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ConstraintCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.LiteralString_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getConstraint_Specification());
			}
			return getMSLWrapper(new LiteralStringCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
