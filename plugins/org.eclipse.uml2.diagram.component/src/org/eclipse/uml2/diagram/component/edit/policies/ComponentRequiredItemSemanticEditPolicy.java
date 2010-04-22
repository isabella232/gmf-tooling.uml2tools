package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * @generated
 */
public class ComponentRequiredItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentRequiredItemSemanticEditPolicy() {
		super(UMLElementTypes.ComponentRequired_4007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		Classifier component = (Classifier) req.getContainer();//It is really any classifier, not always component
		Interface requiredInterface = (Interface) req.getReferencedObject();

		Usage link = null;

		for (Relationship riLink : component.getRelationships(UMLPackage.eINSTANCE.getUsage())) {
			Usage usage = (Usage) riLink;
			if (usage.getClients().contains(component) && usage.getSuppliers().contains(requiredInterface)) {
				link = usage;
			}
		}

		if (link != null) {
			return getGEFWrapper(new DestroyElementCommand(new DestroyElementRequest(link, req.isConfirmationRequired())));
		} else {
			return null;
		}
	}
}
