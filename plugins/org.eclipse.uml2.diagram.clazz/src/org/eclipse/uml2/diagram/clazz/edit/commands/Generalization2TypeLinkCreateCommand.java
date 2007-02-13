package org.eclipse.uml2.diagram.clazz.edit.commands;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Generalization2TypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private Classifier mySource;

	/**
	 * @generated
	 */
	private GeneralizationSet myTarget;

	/**
	 * @generated
	 */
	public Generalization2TypeLinkCreateCommand(CreateRelationshipRequest req, Classifier source, GeneralizationSet target) {
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
	protected EObject doDefaultElementCreationGen() {
		Generalization newElement = (Generalization) super.doDefaultElementCreation();
		if (newElement != null) {
			newElement.getGeneralizationSets().add(myTarget);
		}
		return newElement;
	}

	/**
	 * @generated NOT
	 */
	protected EObject doDefaultElementCreation() {
		Generalization newElement = (Generalization) doDefaultElementCreationGen();
		if (newElement != null) {
			newElement.setGeneral(getGeneralClassifier());
		}
		return newElement;
	}

	private Classifier getGeneralClassifier() {
		List<Generalization> generalisations = myTarget.getGeneralizations();
		return generalisations.isEmpty() ? null : generalisations.get(0).getGeneral();

	}

}
