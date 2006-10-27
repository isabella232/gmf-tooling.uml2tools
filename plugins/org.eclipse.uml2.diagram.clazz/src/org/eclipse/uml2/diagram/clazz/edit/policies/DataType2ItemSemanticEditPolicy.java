package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;

/**
 * @generated
 */
public class DataType2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

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
		if (UMLElementTypes.Usage_4009 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingUsage4009Command(req) : getCreateCompleteIncomingUsage4009Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingGeneralization4001Command(CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingGeneralization4001Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Classifier)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Classifier element = (Classifier) req.getSource();
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getClassifier_Generalization());
		}
		return getMSLWrapper(new CreateIncomingGeneralization4001Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingGeneralization4001Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingGeneralization4001Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getClassifier();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Generalization newElement = (Generalization) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setGeneral((Classifier) getTarget());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingDependency4002Command(CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency4002Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof NamedElement)) {
			return UnexecutableCommand.INSTANCE;
		}
		final org.eclipse.uml2.uml.Package element = (org.eclipse.uml2.uml.Package) getRelationshipContainer(req.getSource(), UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new CreateIncomingDependency4002Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingDependency4002Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingDependency4002Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getPackage();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Dependency newElement = (Dependency) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.getSuppliers().add((NamedElement) getTarget());
				newElement.getClients().add((NamedElement) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingProperty4003Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Association)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Association element = (Association) req.getSource();
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getAssociation_OwnedEnd());
		}
		return getMSLWrapper(new CreateIncomingProperty4003Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingProperty4003Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingProperty4003Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getAssociation();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Property newElement = (Property) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setType((Type) getTarget());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingConstraint_ConstrainedElement4004Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Constraint)) {
			return UnexecutableCommand.INSTANCE;
		}
		Constraint element = (Constraint) req.getSource();
		if (element.getConstrainedElements().contains(req.getTarget())) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getConstraint_ConstrainedElement(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingAssociation4005Command(CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingAssociation4005Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Type)) {
			return UnexecutableCommand.INSTANCE;
		}
		final org.eclipse.uml2.uml.Package element = (org.eclipse.uml2.uml.Package) getRelationshipContainer(req.getSource(), UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new CreateIncomingAssociation4005Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated NOT
	 */
	private static class CreateIncomingAssociation4005Command extends CreateAssociationCommand {

		/**
		 * @generated
		 */
		public CreateIncomingAssociation4005Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getPackage();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated NOT
		 */
		protected EObject doDefaultElementCreation() {
			return super.doDefaultElementCreation();
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency_Supplier4006Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Dependency)) {
			return UnexecutableCommand.INSTANCE;
		}
		Dependency element = (Dependency) req.getSource();
		if (element.getSuppliers().contains(req.getTarget())) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getDependency_Supplier(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingDependency_Client4007Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Dependency)) {
			return UnexecutableCommand.INSTANCE;
		}
		Dependency element = (Dependency) req.getSource();
		if (element.getClients().contains(req.getTarget())) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getDependency_Client(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingUsage4009Command(CreateRelationshipRequest req) {
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.Usage_4009.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingUsage4009Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof NamedElement)) {
			return UnexecutableCommand.INSTANCE;
		}
		final org.eclipse.uml2.uml.Package element = (org.eclipse.uml2.uml.Package) getRelationshipContainer(req.getSource(), UMLPackage.eINSTANCE.getPackage(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.Usage_4009.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
		}
		return getMSLWrapper(new CreateIncomingUsage4009Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingUsage4009Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingUsage4009Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getPackage();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Usage newElement = (Usage) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.getSuppliers().add((NamedElement) getTarget());
				newElement.getClients().add((NamedElement) getSource());
			}
			return newElement;
		}
	}
}
