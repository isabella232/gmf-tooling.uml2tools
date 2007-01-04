package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class DependencyTypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private Package myContainer;

	/**
	 * @generated
	 */
	private NamedElement mySource;

	/**
	 * @generated
	 */
	private NamedElement myTarget;

	/**
	 * @generated
	 */
	public DependencyTypeLinkCreateCommand(CreateRelationshipRequest req, Package container, NamedElement source, NamedElement target) {
		super(req);
		super.setElementToEdit(container);
		myContainer = container;
		mySource = source;
		myTarget = target;
	}

	/**
	 * @generated
	 */
	public Package getContainer() {
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
		return UMLPackage.eINSTANCE.getPackage();
	};

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
		Dependency newElement = (Dependency) super.doDefaultElementCreation();
		if (newElement != null) {
			newElement.getSuppliers().add(myTarget);
			newElement.getClients().add(mySource);
		}
		return newElement;
	}

}
