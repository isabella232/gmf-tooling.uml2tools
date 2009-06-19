package org.eclipse.uml2.diagram.csd.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.csd.edit.commands.Operation2CreateCommand;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;

/**
 * @generated
 */
public class InterfaceOperationsItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InterfaceOperationsItemSemanticEditPolicy() {
		super(UMLElementTypes.Interface_2014);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Operation_3019 == req.getElementType()) {
			return getGEFWrapper(new Operation2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
