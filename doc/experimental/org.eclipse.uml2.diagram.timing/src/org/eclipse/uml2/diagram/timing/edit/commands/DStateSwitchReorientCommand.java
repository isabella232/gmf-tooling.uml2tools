package org.eclipse.uml2.diagram.timing.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.TimingDBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;

/**
 * @generated
 */

public class DStateSwitchReorientCommand extends EditElementCommand {

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
	public DStateSwitchReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DStateSwitch) {
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
		if (!(oldEnd instanceof DSegmentEnd && newEnd instanceof DSegmentEnd)) {
			return false;
		}
		DSegmentStart target = getLink().getToSegmentStart();
		if (!(getLink().eContainer() instanceof DBlock)) {
			return false;
		}
		DBlock container = (DBlock) getLink().eContainer();
		return TimingDBaseItemSemanticEditPolicy.LinkConstraints.canExistDStateSwitch_4001(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DSegmentStart && newEnd instanceof DSegmentStart)) {
			return false;
		}
		DSegmentEnd source = getLink().getFromSegmentEnd();
		if (!(getLink().eContainer() instanceof DBlock)) {
			return false;
		}
		DBlock container = (DBlock) getLink().eContainer();
		return TimingDBaseItemSemanticEditPolicy.LinkConstraints.canExistDStateSwitch_4001(container, source, getNewTarget());
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
		getLink().setFromSegmentEnd(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setToSegmentStart(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected DStateSwitch getLink() {
		return (DStateSwitch) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected DSegmentEnd getOldSource() {
		return (DSegmentEnd) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DSegmentEnd getNewSource() {
		return (DSegmentEnd) newEnd;
	}

	/**
	 * @generated
	 */
	protected DSegmentStart getOldTarget() {
		return (DSegmentStart) oldEnd;
	}

	/**
	 * @generated
	 */
	protected DSegmentStart getNewTarget() {
		return (DSegmentStart) newEnd;
	}
}
