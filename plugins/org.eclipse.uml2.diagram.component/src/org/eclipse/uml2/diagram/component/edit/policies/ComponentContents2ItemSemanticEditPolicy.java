package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interface;
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
			return getMSLWrapper(new CreateComponent_3001Command(req));
		}
		if (UMLElementTypes.Artifact_3003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new CreateArtifact_3003Command(req));
		}
		if (UMLElementTypes.Class_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new CreateClass_3004Command(req));
		}
		if (UMLElementTypes.Interface_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getComponent_PackagedElement());
			}
			return getMSLWrapper(new CreateInterface_3005Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateComponent_3001Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateComponent_3001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getComponent();
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
			Component newElement = (Component) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Component_3001.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateArtifact_3003Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateArtifact_3003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getComponent();
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
			Artifact newElement = (Artifact) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Artifact_3003.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateClass_3004Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateClass_3004Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getComponent();
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
			org.eclipse.uml2.uml.Class newElement = (org.eclipse.uml2.uml.Class) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Class_3004.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateInterface_3005Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateInterface_3005Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getComponent();
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
			Interface newElement = (Interface) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Interface_3005.init(newElement);
			}
			return newElement;
		}
	}

}
