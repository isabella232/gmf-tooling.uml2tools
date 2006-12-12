package org.eclipse.uml2.diagram.profile.edit.policies;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.profile.edit.commands.ElementImport2CreateCommand;

import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ProfileProfileLabelsItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.ElementImport_3009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getNamespace_ElementImport());
			}
			return getMSLWrapper(new ElementImport2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
