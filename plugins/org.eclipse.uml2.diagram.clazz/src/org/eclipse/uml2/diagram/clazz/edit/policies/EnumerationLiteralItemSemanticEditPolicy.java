package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.RealizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.UsageTypeLinkCreateCommand;

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
public class EnumerationLiteralItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.Dependency_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingDependency4002Command(req) : getCreateCompleteIncomingDependency4002Command(req);
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4004 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingConstraint_ConstrainedElement4004Command(req);
		}
		if (UMLElementTypes.DependencySupplier_4006 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependency_Supplier4006Command(req);
		}
		if (UMLElementTypes.DependencyClient_4007 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependency_Client4007Command(req);
		}
		if (UMLElementTypes.Realization_4010 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingRealization4010Command(req) : getCreateCompleteIncomingRealization4010Command(req);
		}
		if (UMLElementTypes.Usage_4013 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingUsage4013Command(req) : getCreateCompleteIncomingUsage4013Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingDependency4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof NamedElement || (targetEObject != null && false == targetEObject instanceof NamedElement)) {
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
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency4002Command(CreateRelationshipRequest req) {
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
	protected Command getCreateCompleteIncomingConstraint_ConstrainedElement4004Command(CreateRelationshipRequest req) {
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
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getConstraint_ConstrainedElement(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency_Supplier4006Command(CreateRelationshipRequest req) {
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
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getDependency_Supplier(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency_Client4007Command(CreateRelationshipRequest req) {
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
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getDependency_Client(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingRealization4010Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof NamedElement || (targetEObject != null && false == targetEObject instanceof NamedElement)) {
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
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingRealization4010Command(CreateRelationshipRequest req) {
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
	protected Command getCreateStartOutgoingUsage4013Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof NamedElement || (targetEObject != null && false == targetEObject instanceof NamedElement)) {
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
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingUsage4013Command(CreateRelationshipRequest req) {
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
}
