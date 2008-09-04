package org.eclipse.uml2.diagram.usecase.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.usecase.edit.commands.ConstraintConstrainedElementCreateCommand;
import org.eclipse.uml2.diagram.usecase.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.uml2.diagram.usecase.edit.commands.DependencyCreateCommand;
import org.eclipse.uml2.diagram.usecase.edit.commands.DependencyReorientCommand;
import org.eclipse.uml2.diagram.usecase.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.usecase.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;

/**
 * @generated
 */
public class ExtensionPoint2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExtensionPoint2ItemSemanticEditPolicy() {
		super(UMLElementTypes.ExtensionPoint_3003);
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
