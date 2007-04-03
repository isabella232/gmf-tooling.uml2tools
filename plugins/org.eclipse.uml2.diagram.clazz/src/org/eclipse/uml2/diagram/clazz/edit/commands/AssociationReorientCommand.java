package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class AssociationReorientCommand extends EditElementCommand {

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
	public AssociationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		return false;
	}

	/**
	 * @generated NOT 
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		throw new ExecutionException("#180694"); //$NON-NLS-1$
	}

	/**
	 * @generated NOT
	 */
	private CommandResult reorientSource() throws ExecutionException {
		throw new UnsupportedOperationException("#180694");
	}

	/**
	 * @generated NOT
	 */
	private CommandResult reorientTarget() throws ExecutionException {
		throw new UnsupportedOperationException("#180694");
	}
}
