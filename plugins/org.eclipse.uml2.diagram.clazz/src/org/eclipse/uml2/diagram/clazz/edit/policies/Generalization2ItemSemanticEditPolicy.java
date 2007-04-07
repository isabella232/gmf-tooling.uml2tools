package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;

import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.diagram.clazz.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.GeneralizationGeneralReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationGeneralEditPart;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Generalization2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ConstraintConstrainedElement_4004 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingConstraintConstrainedElement_4004Command(req);
		}
		if (UMLElementTypes.GeneralizationGeneral_4012 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingGeneralizationGeneral_4012Command(req) : null;
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingConstraintConstrainedElement_4004Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Constraint || false == targetEObject instanceof Element) {
			return UnexecutableCommand.INSTANCE;
		}
		Constraint source = (Constraint) sourceEObject;
		Element target = (Element) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateConstraintConstrainedElement_4004(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(sourceEObject, UMLPackage.eINSTANCE.getConstraint_ConstrainedElement(), target);
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingGeneralizationGeneral_4012Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof Generalization) {
			return UnexecutableCommand.INSTANCE;
		}
		Generalization source = (Generalization) sourceEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralizationGeneral_4012(source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getMSLWrapper(new ConstraintConstrainedElementReorientCommand(req));
		case GeneralizationGeneralEditPart.VISUAL_ID:
			return getMSLWrapper(new GeneralizationGeneralReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
