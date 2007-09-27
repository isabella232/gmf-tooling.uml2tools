package org.eclipse.uml2.diagram.deploy.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.deploy.edit.commands.ArtifactCreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.Device2CreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.ExecutionEnvironment2CreateCommand;
import org.eclipse.uml2.diagram.deploy.edit.commands.Node2CreateCommand;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class DeviceDevicecontents2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Device_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getNode_NestedNode());
			}
			return getGEFWrapper(new Device2CreateCommand(req));
		}
		if (UMLElementTypes.Artifact_3002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getClass_NestedClassifier());
			}
			return getGEFWrapper(new ArtifactCreateCommand(req));
		}
		if (UMLElementTypes.ExecutionEnvironment_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getNode_NestedNode());
			}
			return getGEFWrapper(new ExecutionEnvironment2CreateCommand(req));
		}
		if (UMLElementTypes.Node_3007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getNode_NestedNode());
			}
			return getGEFWrapper(new Node2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
