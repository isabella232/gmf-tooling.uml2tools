package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.edit.commands.InterfaceRealizationCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.InterfaceRealizationReorientCommand;
import org.eclipse.uml2.diagram.component.edit.commands.PortProvidedCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.PortProvidedReorientCommand;
import org.eclipse.uml2.diagram.component.edit.commands.PortRequiredCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.PortRequiredReorientCommand;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

/**
 * @generated
 */
public class Interface2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
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
		if (UMLElementTypes.InterfaceRealization_4001 == req.getElementType()) {
			return null;
		}
		if (UMLElementTypes.PortProvided_4006 == req.getElementType()) {
			return null;
		}
		if (UMLElementTypes.PortRequired_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.InterfaceRealization_4001 == req.getElementType()) {
			return getGEFWrapper(new InterfaceRealizationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.PortProvided_4006 == req.getElementType()) {
			return getGEFWrapper(new PortProvidedCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.PortRequired_4004 == req.getElementType()) {
			return getGEFWrapper(new PortRequiredCreateCommand(req, req.getSource(), req.getTarget()));
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
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getGEFWrapper(new InterfaceRealizationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case PortProvidedEditPart.VISUAL_ID:
			return getGEFWrapper(new PortProvidedReorientCommand(req));
		case PortRequiredEditPart.VISUAL_ID:
			return getGEFWrapper(new PortRequiredReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
