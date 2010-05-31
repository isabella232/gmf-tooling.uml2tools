package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.diagram.clazz.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;

/**
 * @generated
 */
public class InterfaceRealizationReorientCommand extends EditElementCommand {

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
	public InterfaceRealizationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof InterfaceRealization) {
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
		if (!(oldEnd instanceof BehavioredClassifier && newEnd instanceof BehavioredClassifier)) {
			return false;
		}
		Interface target = getLink().getContract();
		if (!(getLink().eContainer() instanceof BehavioredClassifier)) {
			return false;
		}
		BehavioredClassifier container = (BehavioredClassifier) getLink().eContainer();
		return UMLBaseItemSemanticEditPolicy.getLinkConstraints().canExistInterfaceRealization_4008(container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated NOT
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Classifier && newEnd instanceof Classifier)) {
			return false;
		}
		return true;
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
		InterfaceRealization link = getLink();
		EList<NamedElement> clients = link.getClients();
		clients.remove(getGeneralizedOldSource());
		clients.add(getGeneralizedNewSource());

		Package container = deduceContainer(getGeneralizedNewSource());
		container.getPackagedElements().add(link);

		RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(link, NotationPackage.eINSTANCE.getEdge_Source(),
				RefreshComplementaryLinksHelper.PORT_AFTER_INTERFACE_REALIZATION_SOURCE_CHANGED);

		return CommandResult.newOKCommandResult(link);
	}

	/**
	 * @NOT generated
	 */
	private static Package deduceContainer(EObject source) {
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof Package) {
				return (Package) element;
			}
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		InterfaceRealization link = getLink();
		Interface target = getNewTarget();
		link.setContract(target);
		EList<NamedElement> suppliers = link.getSuppliers();
		suppliers.clear();
		suppliers.add(target);

		RefreshComplementaryLinksHelper.getInstance().addNotificationDescription(link, NotationPackage.eINSTANCE.getEdge_Target(),
				RefreshComplementaryLinksHelper.PORT_AFTER_INTERFACE_REALIZATION_TARGET_CHANGED);

		return CommandResult.newOKCommandResult(link);
	}

	/**
	 * @generated
	 */
	protected InterfaceRealization getLink() {
		return (InterfaceRealization) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected BehavioredClassifier getOldSource() {
		return (BehavioredClassifier) oldEnd;
	}

	/**
	 * @generated NOT
	 */
	protected Classifier getGeneralizedOldSource() {
		//this method should be used when trying to get old source
		// getOldSource() was left to preserve generated code compilable
		return (Classifier) oldEnd;
	}

	/**
	 * @generated
	 */
	protected BehavioredClassifier getNewSource() {
		return (BehavioredClassifier) newEnd;
	}

	/**
	 * @generated NOT
	 */
	protected Classifier getGeneralizedNewSource() {
		//this method should be used when trying to get old source
		// getNewSource() was left to preserve generated code compilable
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
}
