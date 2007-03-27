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
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public GeneralizationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
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
			return newEnd instanceof Classifier;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return newEnd instanceof Classifier;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		EObject link = getElementToEdit();
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {

			((Classifier) link.eContainer()).getGeneralizations().remove(link);
			((Classifier) newEnd).getGeneralizations().add((Generalization)link);
			return CommandResult.newOKCommandResult(link);
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {

			((Generalization) link).setGeneral((Classifier) newEnd);
			return CommandResult.newOKCommandResult(link);
		}
		return CommandResult.newErrorCommandResult("Unknown link reorient direction: " + reorientDirection);
	}
}
