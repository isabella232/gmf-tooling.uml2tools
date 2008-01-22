package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.clazz.edit.commands.ExpressionCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.LiteralIntegerCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.LiteralStringCreateCommand;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InstanceSpecificationValueItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.LiteralString_3038 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getInstanceSpecification_Specification());
			}
			return getGEFWrapper(new LiteralStringCreateCommand(req));
		}
		if (UMLElementTypes.LiteralInteger_3039 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getInstanceSpecification_Specification());
			}
			return getGEFWrapper(new LiteralIntegerCreateCommand(req));
		}
		if (UMLElementTypes.Expression_3040 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getInstanceSpecification_Specification());
			}
			return getGEFWrapper(new ExpressionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
