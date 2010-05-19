package org.eclipse.uml2.diagram.component.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper;
import org.eclipse.uml2.diagram.component.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Usage;

/**
 * @generated
 */
public class ComponentRequiredReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public ComponentRequiredReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof Classifier) {
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
	protected boolean canReorientSourceGen() {
		if (!(oldEnd instanceof Interface && newEnd instanceof Component)) {
			return false;
		}
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canExistComponentRequired_4007(getNewSource(), getOldTarget());
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Interface && newEnd instanceof Classifier)) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTargetGen() {
		if (!(oldEnd instanceof Interface && newEnd instanceof Interface)) {
			return false;
		}
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canExistComponentRequired_4007(getOldSource(), getNewTarget());
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Interface && newEnd instanceof Interface)) {
			return false;
		}
		return true;
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
	 * @generated NOT
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		Usage usage = findUsage(getGeneralizedOldSource(), getOldTarget());
		if (usage != null) {
			usage.getClients().remove(getGeneralizedOldSource());
			usage.getClients().add(getGeneralizedNewSource());
		}
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		Classifier component = getGeneralizedOldSource();
		Usage usage = findUsage(component, getOldTarget());
		if (usage != null) {
			usage.getSuppliers().remove(getOldTarget());
			usage.getSuppliers().add(getNewTarget());
		}

		RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(getOldTarget(), NotationPackage.eINSTANCE.getView_TargetEdges(), //
				RefreshComplementaryLinksHelper.PORT_AFTER_USAGE_TARGET_CHANGED);

		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Component getOldSource() {
		return (Component) referenceOwner;
	}

	/**
	 * @NOT generated
	 */
	protected Classifier getGeneralizedOldSource() {
		// this method should be used when trying to get old source.
		// Generated method causes ClassCastException(in reality source is any classifier)
		//and is left only so preserve generated code compilable
		return (Classifier) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Component getNewSource() {
		return (Component) newEnd;
	}

	/**
	 * @NOT generated
	 */
	protected Classifier getGeneralizedNewSource() {
		// this method should be used when trying to get new source.
		// Generated method causes ClassCastException(in reality source is any classifier)
		//and is left only so preserve generated code compilable
		return (Classifier) newEnd;
	}

	/**
	 * @generated
	 */
	protected Interface getOldTarget() {
		return (Interface) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Interface getNewTarget() {
		return (Interface) newEnd;
	}

	private Usage findUsage(Classifier component, Interface required) {
		for (Dependency next : component.getClientDependencies()) {
			if (next instanceof Usage && next.getSuppliers().contains(required)) {
				return (Usage) next;
			}
		}
		return null;
	}
}
