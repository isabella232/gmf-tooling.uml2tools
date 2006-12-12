package org.eclipse.uml2.diagram.profile.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ExtensionTypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private Package myContainer;

	/**
	 * @generated
	 */
	private Stereotype mySource;

	/**
	 * @generated
	 */
	private ElementImport myTarget;

	/**
	 * @generated
	 */
	public ExtensionTypeLinkCreateCommand(CreateRelationshipRequest req, Package container, Stereotype source, ElementImport target) {
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
	 * @generated NOT
	 */
	protected EObject doDefaultElementCreation() {
		ElementImport elementImport = (ElementImport) getTarget();
		Class metaclass = (Class) elementImport.getImportedElement();
		Stereotype stereotype = (Stereotype) getSource();

		return stereotype.createExtension(metaclass, false);
	}
}
