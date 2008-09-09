package org.eclipse.uml2.diagram.timing.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.TimingDBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DInterval;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;

/**
 * @generated
 */

public class DIntervalReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public DIntervalReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DInterval) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof DTick && newEnd instanceof DTick)) {
			return false;
		}
		DTick target = getLink().getToTick();
		if (!(getLink().eContainer() instanceof DFrame)) {
			return false;
		}
		DFrame container = (DFrame) getLink().eContainer();
		return TimingDBaseItemSemanticEditPolicy.LinkConstraints.canExistDInterval_4003(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DTick && newEnd instanceof DTick)) {
			return false;
		}
		DTick source = getLink().getFromTick();
		if (!(getLink().eContainer() instanceof DFrame)) {
			return false;
		}
		DFrame container = (DFrame) getLink().eContainer();
		return TimingDBaseItemSemanticEditPolicy.LinkConstraints.canExistDInterval_4003(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFromTick(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setToTick(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected DInterval getLink() {
		return (DInterval) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected DTick getOldSource() {
		return (DTick) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DTick getNewSource() {
		return (DTick) newEnd;
	}

	/**
	 * @generated
	 */
	protected DTick getOldTarget() {
		return (DTick) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DTick getNewTarget() {
		return (DTick) newEnd;
	}
}
