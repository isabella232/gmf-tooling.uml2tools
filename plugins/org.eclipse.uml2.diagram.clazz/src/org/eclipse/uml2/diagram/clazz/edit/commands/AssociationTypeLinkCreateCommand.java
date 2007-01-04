package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class AssociationTypeLinkCreateCommand extends CreateRelationshipCommand {

	/**
	 * @generated
	 */
	private Package myContainer;

	/**
	 * @generated
	 */
	private Type mySource;

	/**
	 * @generated
	 */
	private Type myTarget;

	/**
	 * @generated
	 */
	public AssociationTypeLinkCreateCommand(CreateRelationshipRequest req, Package container, Type source, Type target) {
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

	protected EObject doDefaultElementCreation() {
		Type sourceType = (Type) getSource();
		Type targetType = (Type) getTarget();

		//due to association end conventiontions (see AssociationEndConvention) 
		//we need to have member end of type SourceType to be the first one created
		//thus, we are calling UML2 createAssociation() in opposite order
		Association result = targetType.createAssociation(//
				false, AggregationKind.NONE_LITERAL, "src", 1, 1, // 
				sourceType, false, AggregationKind.NONE_LITERAL, "dst", 1, 1);

		return result;
	}

}
