package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.component.edit.commands.ArtifactCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.AssemblyConnectorCircleCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.ClassCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.Component2CreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.InterfaceCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.PropertyCreateCommand;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ComponentContentsItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Component_3001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getGEFWrapper(new Component2CreateCommand(req));
		}
		if (UMLElementTypes.Artifact_3003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getGEFWrapper(new ArtifactCreateCommand(req));
		}
		if (UMLElementTypes.Class_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getGEFWrapper(new ClassCreateCommand(req));
		}
		if (UMLElementTypes.Interface_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getGEFWrapper(new InterfaceCreateCommand(req));
		}
		if (UMLElementTypes.Property_3006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredClassifier_OwnedAttribute());
			}
			return getGEFWrapper(new PropertyCreateCommand(req));
		}
		if (UMLElementTypes.Connector_3015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredClassifier_OwnedConnector());
			}
			return getGEFWrapper(new AssemblyConnectorCircleCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
