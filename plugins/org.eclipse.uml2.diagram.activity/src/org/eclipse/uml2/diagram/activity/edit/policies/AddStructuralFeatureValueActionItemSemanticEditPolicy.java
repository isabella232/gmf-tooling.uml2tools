package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class AddStructuralFeatureValueActionItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.InputPin_3003 == req.getElementType()) {
			AddStructuralFeatureValueAction container = (AddStructuralFeatureValueAction) (req.getContainer() instanceof View ? ((View) req.getContainer()).getElement() : req.getContainer());
			if (container.getInsertAt() != null) {
				return super.getCreateCommand(req);
			}
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction_InsertAt());
			}
			return getMSLWrapper(new CreateInputPin_3003Command(req));
		}
		if (UMLElementTypes.InputPin_3004 == req.getElementType()) {
			AddStructuralFeatureValueAction container = (AddStructuralFeatureValueAction) (req.getContainer() instanceof View ? ((View) req.getContainer()).getElement() : req.getContainer());
			if (container.getValue() != null) {
				return super.getCreateCommand(req);
			}
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getWriteStructuralFeatureAction_Value());
			}
			return getMSLWrapper(new CreateInputPin_3004Command(req));
		}
		if (UMLElementTypes.InputPin_3005 == req.getElementType()) {
			AddStructuralFeatureValueAction container = (AddStructuralFeatureValueAction) (req.getContainer() instanceof View ? ((View) req.getContainer()).getElement() : req.getContainer());
			if (container.getObject() != null) {
				return super.getCreateCommand(req);
			}
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuralFeatureAction_Object());
			}
			return getMSLWrapper(new CreateInputPin_3005Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateInputPin_3003Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateInputPin_3003Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction();
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
	private static class CreateInputPin_3004Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateInputPin_3004Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction();
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
	private static class CreateInputPin_3005Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateInputPin_3005Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction();
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
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingControlFlow4001Command(req) : getCreateCompleteIncomingControlFlow4001Command(req);
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingObjectFlow4002Command(req) : getCreateCompleteIncomingObjectFlow4002Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingControlFlow4001Command(CreateRelationshipRequest req) {
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.ControlFlow_4001.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingControlFlow4001Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof ActivityNode)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Activity element = (Activity) getRelationshipContainer(req.getSource(), UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.ControlFlow_4001.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Edge());
		}
		return getMSLWrapper(new CreateIncomingControlFlow4001Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingControlFlow4001Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingControlFlow4001Command(CreateRelationshipRequest req) {
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
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			ControlFlow newElement = (ControlFlow) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTarget((ActivityNode) getTarget());
				newElement.setSource((ActivityNode) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingObjectFlow4002Command(CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingObjectFlow4002Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof ActivityNode)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Activity element = (Activity) getRelationshipContainer(req.getSource(), UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Edge());
		}
		return getMSLWrapper(new CreateIncomingObjectFlow4002Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingObjectFlow4002Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingObjectFlow4002Command(CreateRelationshipRequest req) {
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
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			ObjectFlow newElement = (ObjectFlow) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTarget((ActivityNode) getTarget());
				newElement.setSource((ActivityNode) getSource());
			}
			return newElement;
		}
	}
}
