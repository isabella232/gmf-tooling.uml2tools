package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate10CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate9CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.RegionCreateCommand;

import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StateMachineItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Region_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStateMachine_Region());
			}
			return getMSLWrapper(new RegionCreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStateMachine_ConnectionPoint());
			}
			return getMSLWrapper(new Pseudostate9CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStateMachine_ConnectionPoint());
			}
			return getMSLWrapper(new Pseudostate10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getMSLWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}
	}
}
