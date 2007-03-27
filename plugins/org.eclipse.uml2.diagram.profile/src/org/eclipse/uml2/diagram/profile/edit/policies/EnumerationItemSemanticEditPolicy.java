package org.eclipse.uml2.diagram.profile.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
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
import org.eclipse.uml2.diagram.profile.edit.commands.GeneralizationReorientCommand;
import org.eclipse.uml2.diagram.profile.edit.commands.GeneralizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.profile.edit.parts.EnumerationEditPart;
import org.eclipse.uml2.diagram.profile.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class EnumerationItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

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
			EditCommandRequestWrapper editCommandRequest = new EditCommandRequestWrapper(new DestroyElementRequest(((EnumerationEditPart) getHost()).getEditingDomain(), req.isConfirmationRequired()),
					Collections.EMPTY_MAP);
			cc.add(nextEditPart.getCommand(editCommandRequest));
		}
		cc.add(getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		}));
		return cc;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.Generalization_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingGeneralization_4001Command(req) : getCreateCompleteIncomingGeneralization_4001Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingGeneralization_4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof Classifier) {
			return UnexecutableCommand.INSTANCE;
		}
		Classifier source = (Classifier) sourceEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralization_4001(source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingGeneralization_4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Classifier || false == targetEObject instanceof Classifier) {
			return UnexecutableCommand.INSTANCE;
		}
		Classifier source = (Classifier) sourceEObject;
		Classifier target = (Classifier) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralization_4001(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getClassifier_Generalization());
		}
		return getMSLWrapper(new GeneralizationTypeLinkCreateCommand(req, source, target));
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GeneralizationEditPart.VISUAL_ID:
			return getMSLWrapper(new GeneralizationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}
}
