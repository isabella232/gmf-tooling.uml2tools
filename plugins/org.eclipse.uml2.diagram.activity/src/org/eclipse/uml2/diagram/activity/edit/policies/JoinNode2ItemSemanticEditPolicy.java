package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class JoinNode2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = new CompoundCommand();
		Collection allEdges = new ArrayList();
		View view = (View) getHost().getModel();
		allEdges.addAll(view.getSourceEdges());
		allEdges.addAll(view.getTargetEdges());
		for (Iterator it = allEdges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			EditPart nextEditPart = (EditPart) getHost().getViewer().getEditPartRegistry().get(nextEdge);
			EditCommandRequestWrapper editCommandRequest = new EditCommandRequestWrapper(new DestroyElementRequest(((JoinNode2EditPart) getHost()).getEditingDomain(), req.isConfirmationRequired()),
					Collections.EMPTY_MAP);
			cc.add(nextEditPart.getCommand(editCommandRequest));
		}
		cc.add(getMSLWrapper(new DestroyElementCommand(req)));
		return cc;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingControlFlow_4001Command(req) : getCreateCompleteIncomingControlFlow_4001Command(req);
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingObjectFlow_4002Command(req) : getCreateCompleteIncomingObjectFlow_4002Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingControlFlow_4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateControlFlow_4001(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingControlFlow_4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ActivityNode || false == targetEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		ActivityNode target = (ActivityNode) targetEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateControlFlow_4001(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Edge());
		}
		return getMSLWrapper(new ControlFlowTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingObjectFlow_4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateObjectFlow_4002(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingObjectFlow_4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ActivityNode || false == targetEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		ActivityNode target = (ActivityNode) targetEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateObjectFlow_4002(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Edge());
		}
		return getMSLWrapper(new ObjectFlowTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ControlFlowEditPart.VISUAL_ID:
			return getMSLWrapper(new ControlFlowReorientCommand(req));
		case ObjectFlowEditPart.VISUAL_ID:
			return getMSLWrapper(new ObjectFlowReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}
}
