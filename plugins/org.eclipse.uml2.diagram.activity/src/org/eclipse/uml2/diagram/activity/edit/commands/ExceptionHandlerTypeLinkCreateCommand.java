package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ExceptionHandlerTypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private ExecutableNode myContainer;

	/**
	 * @generated
	 */
	private ExecutableNode mySource;

	/**
	 * @generated
	 */
	private ExecutableNode myTarget;

	/**
	 * @generated
	 */
	public ExceptionHandlerTypeLinkCreateCommand(CreateRelationshipRequest req, ExecutableNode container, ExecutableNode source, ExecutableNode target) {
		super(req);
		super.setElementToEdit(container);
		myContainer = container;
		mySource = source;
		myTarget = target;
	}

	/**
	 * @generated
	 */
	public ExecutableNode getContainer() {
		return myContainer;
	}

	/**
	 * @generated
	 */
	public EObject getSource() {
		return mySource;
	}

	/**
	 * @generated
	 */
	public EObject getTarget() {
		return myTarget;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getExecutableNode();
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ExceptionHandler newElement = (ExceptionHandler) super.doDefaultElementCreation();
		if (newElement != null) {
			newElement.setHandlerBody(myTarget);
			newElement.setProtectedNode(mySource);
		}
		return newElement;
	}

}
