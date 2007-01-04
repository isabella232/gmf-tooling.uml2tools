package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InterfaceRealizationTypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private BehavioredClassifier myContainer;

	/**
	 * @generated
	 */
	private BehavioredClassifier mySource;

	/**
	 * @generated
	 */
	private Interface myTarget;

	/**
	 * @generated
	 */
	public InterfaceRealizationTypeLinkCreateCommand(CreateRelationshipRequest req, BehavioredClassifier container, BehavioredClassifier source, Interface target) {
		super(req);
		super.setElementToEdit(container);
		myContainer = container;
		mySource = source;
		myTarget = target;
	}

	/**
	 * @generated
	 */
	public BehavioredClassifier getContainer() {
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
		return UMLPackage.eINSTANCE.getBehavioredClassifier();
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
		InterfaceRealization newElement = (InterfaceRealization) super.doDefaultElementCreation();
		if (newElement != null) {
			newElement.setContract(myTarget);
			newElement.setImplementingClassifier(mySource);
		}
		return newElement;
	}

}
