package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class RegionSubverticesItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.State_3001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreateState_3001Command(req));
		}
		if (UMLElementTypes.FinalState_3003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreateFinalState_3003Command(req));
		}
		if (UMLElementTypes.Pseudostate_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3004Command(req));
		}
		if (UMLElementTypes.Pseudostate_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3005Command(req));
		}
		if (UMLElementTypes.Pseudostate_3006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3006Command(req));
		}
		if (UMLElementTypes.Pseudostate_3007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3007Command(req));
		}
		if (UMLElementTypes.Pseudostate_3008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3008Command(req));
		}
		if (UMLElementTypes.Pseudostate_3009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3009Command(req));
		}
		if (UMLElementTypes.Pseudostate_3010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3010Command(req));
		}
		if (UMLElementTypes.Pseudostate_3011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getRegion_Subvertex());
			}
			return getMSLWrapper(new CreatePseudostate_3011Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateState_3001Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateState_3001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			State newElement = (State) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.State_3001.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateFinalState_3003Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateFinalState_3003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3004Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3004Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3004.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3005Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3005Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3005.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3006Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3006Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3006.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3007Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3007Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3007.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3008Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3008Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3008.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3009Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3009Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3009.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3010Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3010Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3010.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreatePseudostate_3011Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePseudostate_3011Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getRegion();
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
			Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Pseudostate_3011.init(newElement);
			}
			return newElement;
		}
	}

}
