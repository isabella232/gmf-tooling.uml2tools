package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.core.commands.ExecutionException;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Constraint2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

			protected CommandResult doExecuteWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
				EObject eObject = getElementToDestroy();
				boolean removeFromResource = eObject.eContainer() == null;
				CommandResult result = super.doExecuteWithResult(progressMonitor, info);
				Resource resource = eObject.eResource();
				if (removeFromResource && resource != null) {
					resource.getContents().remove(eObject);
				}
				return result;
			}
		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingAction_LocalPrecondition4003Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingAction_LocalPrecondition4003Command(CreateRelationshipRequest req) {
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
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getAction_LocalPrecondition(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq) {

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
}
