package org.eclipse.uml2.diagram.csd.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.diagram.csd.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * @generated
 */
public class PortProvidedCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public PortProvidedCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && !(source instanceof Port)) {
			return false;
		}
		if (target != null && !(target instanceof Interface)) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreatePortProvided_4010(getSource(), getTarget());
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		Port port = getSource();
		Interface targetInterface = getTarget();
		if (port != null && targetInterface != null) {
			//we can not modify derived Port#getProvideds() directly,
			//so we will mimic the logic from the PortOperations#getProvideds()
			Type portType = port.getType();
			if (portType == null) {
				port.setType(targetInterface);
			} else if (portType instanceof Classifier) {
				//then it is new Realization for this classifier
				createRealization(port, targetInterface, (Classifier) portType);
			}
		}
		return CommandResult.newOKCommandResult();
	}

	/**
	 * @NOT-generated
	 */
	private void createRealization(Port port, Interface targetInterface, Classifier portType) {
		Package realizationContainer = null;
		for (EObject element = source; element != null; element = element.eContainer()) {
			if (element instanceof Package) {
				realizationContainer = (Package) element;
				break;
			}
		}
		if (realizationContainer == null) {
			return;
		}
		Realization realization = UMLFactory.eINSTANCE.createRealization();
		realizationContainer.getPackagedElements().add(realization);
		realization.getClients().add(portType);
		realization.getSuppliers().add(targetInterface);
	}

	/**
	 * @generated
	 */
	protected Port getSource() {
		return (Port) source;
	}

	/**
	 * @generated
	 */
	protected Interface getTarget() {
		return (Interface) target;
	}
}
