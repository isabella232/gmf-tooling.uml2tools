package org.eclipse.uml2.diagram.profile.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.profile.edit.commands.ExtensionCreateCommand;
import org.eclipse.uml2.diagram.profile.edit.commands.ExtensionReorientCommand;
import org.eclipse.uml2.diagram.profile.edit.parts.ExtensionEditPart;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class ElementImport2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElementImport2ItemSemanticEditPolicy() {
		super(UMLElementTypes.ElementImport_3009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

}
