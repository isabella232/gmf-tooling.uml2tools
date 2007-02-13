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

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.uml2.diagram.clazz.edit.commands.AssociationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.Class4CreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.GeneralizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.InterfaceRealizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.Operation6CreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.Property6CreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.PropertyTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.RealizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.UsageTypeLinkCreateCommand;

import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Interface2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

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
		if (UMLElementTypes.Generalization_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingGeneralization4001Command(req) : getCreateCompleteIncomingGeneralization4001Command(req);
		}
		if (UMLElementTypes.Dependency_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingDependency4002Command(req) : getCreateCompleteIncomingDependency4002Command(req);
		}
		if (UMLElementTypes.Property_4003 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingProperty4003Command(req);
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4004 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingConstraint_ConstrainedElement4004Command(req);
		}
		if (UMLElementTypes.Association_4005 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingAssociation4005Command(req) : getCreateCompleteIncomingAssociation4005Command(req);
		}
		if (UMLElementTypes.DependencySupplier_4006 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependency_Supplier4006Command(req);
		}
		if (UMLElementTypes.DependencyClient_4007 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependency_Client4007Command(req);
		}
		if (UMLElementTypes.InterfaceRealization_4008 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingInterfaceRealization4008Command(req);
		}
		if (UMLElementTypes.Realization_4010 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingRealization4010Command(req) : getCreateCompleteIncomingRealization4010Command(req);
		}
		if (UMLElementTypes.Generalization_4011 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingGeneralization4011Command(req) : null;
		}
		if (UMLElementTypes.GeneralizationGeneral_4012 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingGeneralization_General4012Command(req);
		}
		if (UMLElementTypes.Usage_4013 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingUsage4013Command(req) : getCreateCompleteIncomingUsage4013Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingGeneralization4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Classifier || (targetEObject != null && false == targetEObject instanceof Classifier)) {
			return UnexecutableCommand.INSTANCE;
		}
		Classifier source = (Classifier) sourceEObject;
		Classifier target = (Classifier) targetEObject;

		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralization_4001(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingGeneralization4001Command(CreateRelationshipRequest req) {
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
	protected Command getCreateCompleteIncomingProperty4003Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Association || false == targetEObject instanceof Type) {
			return UnexecutableCommand.INSTANCE;
		}
		Association source = (Association) sourceEObject;
		Type target = (Type) targetEObject;

		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateProperty_4003(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getAssociation_OwnedEnd());
		}
		return getMSLWrapper(new PropertyTypeLinkCreateCommand(req, source, target));
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
	protected Command getCreateStartOutgoingAssociation4005Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Type || (targetEObject != null && false == targetEObject instanceof Type)) {
			return UnexecutableCommand.INSTANCE;
		}
		Type source = (Type) sourceEObject;
		Type target = (Type) targetEObject;

		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateAssociation_4005(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingAssociation4005Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Type || false == targetEObject instanceof Type) {
			return UnexecutableCommand.INSTANCE;
		}
		Type source = (Type) sourceEObject;
		Type target = (Type) targetEObject;

		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateAssociation_4005(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new AssociationTypeLinkCreateCommand(req, container, source, target));
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
	protected Command getCreateCompleteIncomingInterfaceRealization4008Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof BehavioredClassifier || false == targetEObject instanceof Interface) {
			return UnexecutableCommand.INSTANCE;
		}
		BehavioredClassifier source = (BehavioredClassifier) sourceEObject;
		Interface target = (Interface) targetEObject;

		BehavioredClassifier container = (BehavioredClassifier) getRelationshipContainer(source, UMLPackage.eINSTANCE.getBehavioredClassifier(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateInterfaceRealization_4008(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization());
		}
		return getMSLWrapper(new InterfaceRealizationTypeLinkCreateCommand(req, container, source, target));
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
	protected Command getCreateStartOutgoingGeneralization4011Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Classifier || (targetEObject != null && false == targetEObject instanceof GeneralizationSet)) {
			return UnexecutableCommand.INSTANCE;
		}
		Classifier source = (Classifier) sourceEObject;
		GeneralizationSet target = (GeneralizationSet) targetEObject;

		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralization_4011(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingGeneralization_General4012Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Generalization || false == targetEObject instanceof Classifier) {
			return UnexecutableCommand.INSTANCE;
		}
		Generalization source = (Generalization) sourceEObject;
		Classifier target = (Classifier) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralizationGeneral_4012(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getGeneralization_General(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
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
