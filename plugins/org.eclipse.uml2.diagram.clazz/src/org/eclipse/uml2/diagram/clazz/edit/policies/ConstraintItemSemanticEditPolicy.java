package org.eclipse.uml2.diagram.clazz.edit.policies;

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
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyClientReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencySupplierReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.RealizationReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.RealizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.UsageReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.UsageTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ConstraintItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

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
			EditCommandRequestWrapper editCommandRequest = new EditCommandRequestWrapper(new DestroyElementRequest(((ConstraintEditPart) getHost()).getEditingDomain(), req.isConfirmationRequired()),
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
		if (UMLElementTypes.Dependency_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingDependency_4002Command(req) : getCreateCompleteIncomingDependency_4002Command(req);
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4004 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingConstraintConstrainedElement_4004Command(req) : getCreateCompleteIncomingConstraintConstrainedElement_4004Command(req);
		}
		if (UMLElementTypes.DependencySupplier_4006 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependencySupplier_4006Command(req);
		}
		if (UMLElementTypes.DependencyClient_4007 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependencyClient_4007Command(req);
		}
		if (UMLElementTypes.Realization_4010 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingRealization_4010Command(req) : getCreateCompleteIncomingRealization_4010Command(req);
		}
		if (UMLElementTypes.Usage_4013 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingUsage_4013Command(req) : getCreateCompleteIncomingUsage_4013Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingDependency_4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		NamedElement source = (NamedElement) sourceEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateDependency_4002(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency_4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof NamedElement || false == targetEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		NamedElement source = (NamedElement) sourceEObject;
		NamedElement target = (NamedElement) targetEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateDependency_4002(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new DependencyTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingConstraintConstrainedElement_4004Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof Constraint) {
			return UnexecutableCommand.INSTANCE;
		}
		Constraint source = (Constraint) sourceEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateConstraintConstrainedElement_4004(source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingConstraintConstrainedElement_4004Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Constraint || false == targetEObject instanceof Element) {
			return UnexecutableCommand.INSTANCE;
		}
		Constraint source = (Constraint) sourceEObject;
		Element target = (Element) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateConstraintConstrainedElement_4004(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(sourceEObject, UMLPackage.eINSTANCE.getConstraint_ConstrainedElement(), target);
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependencySupplier_4006Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Dependency || false == targetEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		Dependency source = (Dependency) sourceEObject;
		NamedElement target = (NamedElement) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateDependencySupplier_4006(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(sourceEObject, UMLPackage.eINSTANCE.getDependency_Supplier(), target);
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependencyClient_4007Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Dependency || false == targetEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		Dependency source = (Dependency) sourceEObject;
		NamedElement target = (NamedElement) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateDependencyClient_4007(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(sourceEObject, UMLPackage.eINSTANCE.getDependency_Client(), target);
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingRealization_4010Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		NamedElement source = (NamedElement) sourceEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateRealization_4010(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingRealization_4010Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof NamedElement || false == targetEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		NamedElement source = (NamedElement) sourceEObject;
		NamedElement target = (NamedElement) targetEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateRealization_4010(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new RealizationTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingUsage_4013Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		NamedElement source = (NamedElement) sourceEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateUsage_4013(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingUsage_4013Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof NamedElement || false == targetEObject instanceof NamedElement) {
			return UnexecutableCommand.INSTANCE;
		}
		NamedElement source = (NamedElement) sourceEObject;
		NamedElement target = (NamedElement) targetEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateUsage_4013(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new UsageTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case Dependency2EditPart.VISUAL_ID:
			return getMSLWrapper(new DependencyReorientCommand(req));
		case RealizationEditPart.VISUAL_ID:
			return getMSLWrapper(new RealizationReorientCommand(req));
		case UsageEditPart.VISUAL_ID:
			return getMSLWrapper(new UsageReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return getMSLWrapper(new ConstraintConstrainedElementReorientCommand(req));
		case DependencySupplierEditPart.VISUAL_ID:
			return getMSLWrapper(new DependencySupplierReorientCommand(req));
		case DependencyClientEditPart.VISUAL_ID:
			return getMSLWrapper(new DependencyClientReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
