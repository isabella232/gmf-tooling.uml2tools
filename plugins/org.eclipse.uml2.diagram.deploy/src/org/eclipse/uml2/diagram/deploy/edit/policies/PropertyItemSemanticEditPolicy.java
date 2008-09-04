package org.eclipse.uml2.diagram.deploy.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.deploy.edit.commands.DependencyCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DependencyReorientCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DeploymentCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DeploymentReorientCommand;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentEditPart;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;

/**
 * @generated
 */
public class PropertyItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PropertyItemSemanticEditPolicy() {
		super(UMLElementTypes.Property_3003);
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
