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
import org.eclipse.uml2.diagram.clazz.edit.commands.AssociationReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.AssociationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.ConstraintConstrainedElementReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyClientReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencySupplierReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.DependencyTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.Generalization2ReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.GeneralizationGeneralReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.GeneralizationReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.GeneralizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.InterfaceRealizationReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.InterfaceRealizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.PropertyReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.PropertyTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.RealizationReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.RealizationTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.UsageReorientCommand;
import org.eclipse.uml2.diagram.clazz.edit.commands.UsageTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.clazz.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Dependency2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencyClientEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.DependencySupplierEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Generalization2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.GeneralizationGeneralEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.Property7EditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.RealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
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
		CompoundCommand cc = new CompoundCommand();
		Collection allEdges = new ArrayList();
		View view = (View) getHost().getModel();
		allEdges.addAll(view.getSourceEdges());
		allEdges.addAll(view.getTargetEdges());
		for (Iterator it = allEdges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			EditPart nextEditPart = (EditPart) getHost().getViewer().getEditPartRegistry().get(nextEdge);
			EditCommandRequestWrapper editCommandRequest = new EditCommandRequestWrapper(new DestroyElementRequest(((Interface2EditPart) getHost()).getEditingDomain(), req.isConfirmationRequired()),
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
		if (UMLElementTypes.Dependency_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingDependency_4002Command(req) : getCreateCompleteIncomingDependency_4002Command(req);
		}
		if (UMLElementTypes.Property_4003 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingProperty_4003Command(req);
		}
		if (UMLElementTypes.ConstraintConstrainedElement_4004 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingConstraintConstrainedElement_4004Command(req);
		}
		if (UMLElementTypes.Association_4005 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingAssociation_4005Command(req) : getCreateCompleteIncomingAssociation_4005Command(req);
		}
		if (UMLElementTypes.DependencySupplier_4006 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependencySupplier_4006Command(req);
		}
		if (UMLElementTypes.DependencyClient_4007 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingDependencyClient_4007Command(req);
		}
		if (UMLElementTypes.InterfaceRealization_4008 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingInterfaceRealization_4008Command(req);
		}
		if (UMLElementTypes.Realization_4010 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingRealization_4010Command(req) : getCreateCompleteIncomingRealization_4010Command(req);
		}
		if (UMLElementTypes.Generalization_4011 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingGeneralization_4011Command(req) : null;
		}
		if (UMLElementTypes.GeneralizationGeneral_4012 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingGeneralizationGeneral_4012Command(req);
		}
		if (UMLElementTypes.Usage_4013 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingUsage_4013Command(req) : getCreateCompleteIncomingUsage_4013Command(req);
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
	protected Command getCreateCompleteIncomingProperty_4003Command(CreateRelationshipRequest req) {
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
	protected Command getCreateStartOutgoingAssociation_4005Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof Type) {
			return UnexecutableCommand.INSTANCE;
		}
		Type source = (Type) sourceEObject;
		Package container = (Package) getRelationshipContainer(source, UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateAssociation_4005(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingAssociation_4005Command(CreateRelationshipRequest req) {
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
	protected Command getCreateCompleteIncomingInterfaceRealization_4008Command(CreateRelationshipRequest req) {
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
	protected Command getCreateStartOutgoingGeneralization_4011Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof Classifier) {
			return UnexecutableCommand.INSTANCE;
		}
		Classifier source = (Classifier) sourceEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateGeneralization_4011(source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingGeneralizationGeneral_4012Command(CreateRelationshipRequest req) {
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
		SetRequest setReq = new SetRequest(sourceEObject, UMLPackage.eINSTANCE.getGeneralization_General(), target);
		return getMSLWrapper(new SetValueCommand(setReq));
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
		case GeneralizationEditPart.VISUAL_ID:
			return getMSLWrapper(new GeneralizationReorientCommand(req));
		case Dependency2EditPart.VISUAL_ID:
			return getMSLWrapper(new DependencyReorientCommand(req));
		case Property7EditPart.VISUAL_ID:
			return getMSLWrapper(new PropertyReorientCommand(req));
		case AssociationEditPart.VISUAL_ID:
			return getMSLWrapper(new AssociationReorientCommand(req));
		case InterfaceRealizationEditPart.VISUAL_ID:
			return getMSLWrapper(new InterfaceRealizationReorientCommand(req));
		case RealizationEditPart.VISUAL_ID:
			return getMSLWrapper(new RealizationReorientCommand(req));
		case Generalization2EditPart.VISUAL_ID:
			return getMSLWrapper(new Generalization2ReorientCommand(req));
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
		case GeneralizationGeneralEditPart.VISUAL_ID:
			return getMSLWrapper(new GeneralizationGeneralReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
