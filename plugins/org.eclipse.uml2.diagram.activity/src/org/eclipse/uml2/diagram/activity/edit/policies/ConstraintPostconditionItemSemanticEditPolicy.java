package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.activity.edit.commands.LiteralString2CreateCommand;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ConstraintPostconditionItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.LiteralString_3051 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getConstraint_Specification());
			}
			return getMSLWrapper(new LiteralString2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
