package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityContentPaneCompartment2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.StructuredActivityNode_3009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateStructuredActivityNode_3009Command(req));
		}
		if (UMLElementTypes.OpaqueAction_3011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateOpaqueAction_3011Command(req));
		}
		if (UMLElementTypes.AcceptEventAction_3012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateAcceptEventAction_3012Command(req));
		}
		if (UMLElementTypes.AcceptEventAction_3013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateAcceptEventAction_3013Command(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateActivityFinalNode_3014Command(req));
		}
		if (UMLElementTypes.DecisionNode_3015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateDecisionNode_3015Command(req));
		}
		if (UMLElementTypes.FlowFinalNode_3016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateFlowFinalNode_3016Command(req));
		}
		if (UMLElementTypes.Pin_3017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreatePin_3017Command(req));
		}
		if (UMLElementTypes.CreateObjectAction_3018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateCreateObjectAction_3018Command(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateCallBehaviorAction_3019Command(req));
		}
		if (UMLElementTypes.CallOperationAction_3020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateCallOperationAction_3020Command(req));
		}
		if (UMLElementTypes.ForkNode_3021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateForkNode_3021Command(req));
		}
		if (UMLElementTypes.JoinNode_3022 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateJoinNode_3022Command(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3023 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateAddStructuralFeatureValueAction_3023Command(req));
		}
		if (UMLElementTypes.DataStoreNode_3024 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateDataStoreNode_3024Command(req));
		}
		if (UMLElementTypes.CentralBufferNode_3025 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateCentralBufferNode_3025Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateStructuredActivityNode_3009Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateStructuredActivityNode_3009Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateOpaqueAction_3011Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateOpaqueAction_3011Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateAcceptEventAction_3012Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateAcceptEventAction_3012Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateAcceptEventAction_3013Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateAcceptEventAction_3013Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
			AcceptEventAction newElement = (AcceptEventAction) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.AcceptEventAction_3013.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateActivityFinalNode_3014Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateActivityFinalNode_3014Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateDecisionNode_3015Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateDecisionNode_3015Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateFlowFinalNode_3016Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateFlowFinalNode_3016Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreatePin_3017Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePin_3017Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateCreateObjectAction_3018Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCreateObjectAction_3018Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateCallBehaviorAction_3019Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCallBehaviorAction_3019Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateCallOperationAction_3020Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCallOperationAction_3020Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateForkNode_3021Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateForkNode_3021Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateJoinNode_3022Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateJoinNode_3022Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateAddStructuralFeatureValueAction_3023Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateAddStructuralFeatureValueAction_3023Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateDataStoreNode_3024Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateDataStoreNode_3024Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
	private static class CreateCentralBufferNode_3025Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCentralBufferNode_3025Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStructuredActivityNode();
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
}
