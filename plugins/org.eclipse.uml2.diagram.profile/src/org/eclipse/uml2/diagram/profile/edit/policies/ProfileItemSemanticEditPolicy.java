package org.eclipse.uml2.diagram.profile.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ProfileItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Stereotype_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
			}
			return getMSLWrapper(new CreateStereotype_2001Command(req));
		}
		if (UMLElementTypes.Profile_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
			}
			return getMSLWrapper(new CreateProfile_2002Command(req));
		}
		if (UMLElementTypes.Enumeration_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getPackage_PackagedElement());
			}
			return getMSLWrapper(new CreateEnumeration_2003Command(req));
		}
		if (UMLElementTypes.ElementImport_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getNamespace_ElementImport());
			}
			return getMSLWrapper(new CreateElementImport_2006Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateStereotype_2001Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateStereotype_2001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getProfile();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Stereotype newElement = (Stereotype) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Stereotype_2001.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateProfile_2002Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateProfile_2002Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getProfile();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Profile newElement = (Profile) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Profile_2002.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateEnumeration_2003Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEnumeration_2003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getProfile();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			Enumeration newElement = (Enumeration) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Enumeration_2003.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateElementImport_2006Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateElementImport_2006Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getProfile();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			ElementImport newElement = (ElementImport) super.doDefaultElementCreation();
			if (newElement != null) {
				Profile container = (Profile) getElementToEdit();
				if (container != null) {
					Collection featureValues = container.getMetaclassReferences();
					featureValues.add(newElement);
				}
			}
			return newElement;
		}
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
