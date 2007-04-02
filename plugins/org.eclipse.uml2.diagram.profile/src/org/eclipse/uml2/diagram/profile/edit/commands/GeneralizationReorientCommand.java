package org.eclipse.uml2.diagram.profile.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;

/**
 * @generated
 */
public class GeneralizationReorientCommand extends EditElementCommand {

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
	public GeneralizationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof Generalization)) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return oldEnd instanceof Classifier && newEnd instanceof Classifier;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return oldEnd instanceof Classifier && newEnd instanceof Classifier;
		}
		return false;
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
	private CommandResult reorientSource() throws ExecutionException {
		Generalization link = (Generalization) getElementToEdit();
		Classifier oldSource = (Classifier) oldEnd;
		Classifier newSource = (Classifier) newEnd;

		oldSource.getGeneralizations().remove(link);
		newSource.getGeneralizations().add(link);
		return CommandResult.newOKCommandResult(link);
	}

	/**
	 * @generated
	 */
	private CommandResult reorientTarget() throws ExecutionException {
		Generalization link = (Generalization) getElementToEdit();
		Classifier oldTarget = (Classifier) oldEnd;
		Classifier newTarget = (Classifier) newEnd;

		link.setGeneral(newTarget);
		return CommandResult.newOKCommandResult(link);
	}
}
