package org.eclipse.uml2.diagram.component.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.diagram.component.edit.policies.UMLBaseItemSemanticEditPolicy;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class PortRequiredCreateCommand extends EditElementCommand {

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
	public PortRequiredCreateCommand(CreateRelationshipRequest request, EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecuteGen() {
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
		return UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreatePortRequired_4004(getSource(), getTarget());
	}

	/**
	 * @generated NOT
	 */
	public boolean canExecute() {
		if (!canExecuteGen()) {
			return false;
		}
		if (getSource().getType() == null) {
			return false;
		}
		Type type = getSource().getType();
		if (false == type instanceof Classifier || (type instanceof Interface)) {
			return false;
		}
		boolean isReadOnly = ((AdapterFactoryEditingDomain) getEditingDomain()).isReadOnly(type.eResource());
		return !isReadOnly;
	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}
		if (getSource() != null && getTarget() != null && getSource().getType() != null) {
			Type type = getSource().getType();
			if (type instanceof Classifier && !(type instanceof Interface)) {
				Classifier classifier = (Classifier) type;
				classifier.createUsage(getTarget());
			}
		}
		return CommandResult.newOKCommandResult();
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
