package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPostconditionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPostconditionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPreconditionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPreconditionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ConstraintItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConstraintItemSemanticEditPolicy() {
		super(UMLElementTypes.Constraint_2027);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
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
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (UMLVisualIDRegistry.getVisualID(node)) {
			case ConstraintPreconditionEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (UMLVisualIDRegistry.getVisualID(cnode)) {
					case LiteralStringEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return null;
		}
		if (UMLElementTypes.ActionLocalPostcondition_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return getGEFWrapper(new ActionLocalPreconditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ActionLocalPostcondition_4006 == req.getElementType()) {
			return getGEFWrapper(new ActionLocalPostconditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @see #181478
	 * @generated NOT
	 */
	protected Command getCreateCompleteIncomingActionLocalPrecondition_4003Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Action || false == targetEObject instanceof Constraint) {
			return UnexecutableCommand.INSTANCE;
		}
		Action source = (Action) sourceEObject;
		Constraint target = (Constraint) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateActionLocalPrecondition_4003(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(sourceEObject, UMLPackage.eINSTANCE.getAction_LocalPrecondition(), target);
		return getMSLWrapper(new SetValueCommand(setReq) {

			//force removal from resource
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

				SetRequest requestImpl = (SetRequest) getRequest();
				EObject requestTarget = (EObject) requestImpl.getValue();
				if (requestTarget.eResource() != null) {
					requestTarget.eResource().getContents().remove(requestTarget);
				}
				return super.doExecuteWithResult(monitor, info);
			}
		});
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionLocalPreconditionReorientCommand(req));
		case ActionLocalPostconditionEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionLocalPostconditionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
