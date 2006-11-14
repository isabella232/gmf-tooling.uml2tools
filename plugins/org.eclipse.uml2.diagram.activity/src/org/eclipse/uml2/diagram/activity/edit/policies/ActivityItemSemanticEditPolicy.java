package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.AcceptEventAction_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateAcceptEventAction_2001Command(req));
		}
		if (UMLElementTypes.AcceptEventAction_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateAcceptEventAction_2002Command(req));
		}
		if (UMLElementTypes.ActivityFinalNode_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateActivityFinalNode_2003Command(req));
		}
		if (UMLElementTypes.DecisionNode_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateDecisionNode_2004Command(req));
		}
		if (UMLElementTypes.MergeNode_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateMergeNode_2005Command(req));
		}
		if (UMLElementTypes.InitialNode_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateInitialNode_2006Command(req));
		}
		if (UMLElementTypes.StructuredActivityNode_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Group());
			}
			return getMSLWrapper(new CreateStructuredActivityNode_2007Command(req));
		}
		if (UMLElementTypes.DataStoreNode_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateDataStoreNode_2008Command(req));
		}
		if (UMLElementTypes.CentralBufferNode_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateCentralBufferNode_2009Command(req));
		}
		if (UMLElementTypes.OpaqueAction_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateOpaqueAction_2010Command(req));
		}
		if (UMLElementTypes.FlowFinalNode_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateFlowFinalNode_2011Command(req));
		}
		if (UMLElementTypes.ForkNode_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateForkNode_2012Command(req));
		}
		if (UMLElementTypes.JoinNode_2013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateJoinNode_2013Command(req));
		}
		if (UMLElementTypes.Pin_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreatePin_2014Command(req));
		}
		if (UMLElementTypes.CreateObjectAction_2015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateCreateObjectAction_2015Command(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_2016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateAddStructuralFeatureValueAction_2016Command(req));
		}
		if (UMLElementTypes.CallBehaviorAction_2017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateCallBehaviorAction_2017Command(req));
		}
		if (UMLElementTypes.CallOperationAction_2018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateCallOperationAction_2018Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateAcceptEventAction_2001Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateAcceptEventAction_2001Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateAcceptEventAction_2002Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateAcceptEventAction_2002Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
				UMLElementTypes.Initializers.AcceptEventAction_2002.init(newElement);
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	private static class CreateActivityFinalNode_2003Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateActivityFinalNode_2003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateDecisionNode_2004Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateDecisionNode_2004Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateMergeNode_2005Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateMergeNode_2005Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateInitialNode_2006Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateInitialNode_2006Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateStructuredActivityNode_2007Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateStructuredActivityNode_2007Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateDataStoreNode_2008Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateDataStoreNode_2008Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateCentralBufferNode_2009Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCentralBufferNode_2009Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateOpaqueAction_2010Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateOpaqueAction_2010Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateFlowFinalNode_2011Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateFlowFinalNode_2011Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateForkNode_2012Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateForkNode_2012Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateJoinNode_2013Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateJoinNode_2013Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreatePin_2014Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreatePin_2014Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateCreateObjectAction_2015Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCreateObjectAction_2015Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateAddStructuralFeatureValueAction_2016Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateAddStructuralFeatureValueAction_2016Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateCallBehaviorAction_2017Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCallBehaviorAction_2017Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
	private static class CreateCallOperationAction_2018Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateCallOperationAction_2018Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getActivity();
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
