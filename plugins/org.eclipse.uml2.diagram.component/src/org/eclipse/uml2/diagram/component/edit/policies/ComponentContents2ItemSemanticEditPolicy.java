package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.component.edit.commands.ArtifactCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.ClassCreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.Component2CreateCommand;
import org.eclipse.uml2.diagram.component.edit.commands.InterfaceCreateCommand;

import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ComponentContents2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Component_3001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new Component2CreateCommand(req));
		}
		if (UMLElementTypes.Artifact_3003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new ArtifactCreateCommand(req));
		}
		if (UMLElementTypes.Class_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new ClassCreateCommand(req));
		}
		if (UMLElementTypes.Interface_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new InterfaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
