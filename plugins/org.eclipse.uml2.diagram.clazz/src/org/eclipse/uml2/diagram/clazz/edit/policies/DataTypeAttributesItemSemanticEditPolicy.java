package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.clazz.edit.commands.Property3CreateCommand;

import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class DataTypeAttributesItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Property_3014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getDataType_OwnedAttribute());
			}
			return getMSLWrapper(new Property3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
