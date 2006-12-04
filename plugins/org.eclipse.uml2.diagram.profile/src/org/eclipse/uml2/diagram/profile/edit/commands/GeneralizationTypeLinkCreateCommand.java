package org.eclipse.uml2.diagram.profile.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class GeneralizationTypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private Classifier mySource;

	/**
	 * @generated
	 */
	private Classifier myTarget;

	/**
	 * @generated
	 */
	public GeneralizationTypeLinkCreateCommand(CreateRelationshipRequest req, Classifier source, Classifier target) {
		super(req);
		super.setElementToEdit(source);
		mySource = source;
		myTarget = target;
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
		return UMLPackage.eINSTANCE.getClassifier();
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
		Generalization newElement = (Generalization) super.doDefaultElementCreation();
		if (newElement != null) {
			newElement.setGeneral(myTarget);
		}
		return newElement;
	}

}
