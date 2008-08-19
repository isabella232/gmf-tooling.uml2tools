package org.eclipse.uml2.diagram.deploy.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.deploy.edit.commands.CommunicationPathCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.CommunicationPathReorientCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DependencyCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DependencyReorientCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DeploymentCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.DeploymentReorientCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.ManifestationCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.ManifestationReorientCommand;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationEditPart;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;

/**
 * @generated
 */
public class Artifact3ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Artifact3ItemSemanticEditPolicy() {
		super(UMLElementTypes.Artifact_3006);
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

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.Deployment_4001 == req.getElementType()) {
			return getGEFWrapper(new DeploymentCreateCommand(req, req.getTarget(), req.getSource()));
		}
		if (UMLElementTypes.Manifestation_4002 == req.getElementType()) {
			return getGEFWrapper(new ManifestationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.CommunicationPath_4004 == req.getElementType()) {
			return getGEFWrapper(new CommunicationPathCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Dependency_4005 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.Deployment_4001 == req.getElementType()) {
			return getGEFWrapper(new DeploymentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Manifestation_4002 == req.getElementType()) {
			return getGEFWrapper(new ManifestationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.CommunicationPath_4004 == req.getElementType()) {
			return getGEFWrapper(new CommunicationPathCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.Dependency_4005 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DeploymentEditPart.VISUAL_ID:
			return getGEFWrapper(new DeploymentReorientCommand(req));
		case ManifestationEditPart.VISUAL_ID:
			return getGEFWrapper(new ManifestationReorientCommand(req));
		case CommunicationPathEditPart.VISUAL_ID:
			return getGEFWrapper(new CommunicationPathReorientCommand(req));
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
