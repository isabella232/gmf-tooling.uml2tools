package org.eclipse.uml2.diagram.clazz.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IEditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.uml2.diagram.clazz.edit.helpers.UMLBaseEditHelper;

import org.eclipse.uml2.diagram.clazz.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.clazz.expressions.UMLOCLFactory;

import org.eclipse.uml2.diagram.clazz.part.Messages;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;

import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class UMLBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(UMLVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Object editHelperContext = completedRequest.getEditHelperContext();
		if (editHelperContext instanceof View || (editHelperContext instanceof IEditHelperContext && ((IEditHelperContext) editHelperContext).getEObject() instanceof View)) {
			// no semantic commands are provided for pure design elements
			return null;
		}
		if (editHelperContext == null) {
			editHelperContext = ViewUtil.resolveSemanticElement((View) getHost().getModel());
		}
		IElementType elementType = ElementTypeRegistry.getInstance().getElementType(editHelperContext);
		if (elementType == ElementTypeRegistry.getInstance().getType("org.eclipse.gmf.runtime.emf.type.core.default")) { //$NON-NLS-1$ 
			elementType = null;
		}
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		if (semanticCommand != null) {
			ICommand command = semanticCommand instanceof ICommandProxy ? ((ICommandProxy) semanticCommand).getICommand() : new CommandProxy(semanticCommand);
			completedRequest.setParameter(UMLBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		if (elementType != null) {
			ICommand command = elementType.getEditCommand(completedRequest);
			if (command != null) {
				if (!(command instanceof CompositeTransactionalCommand)) {
					TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
					command = new CompositeTransactionalCommand(editingDomain, command.getLabel()).compose(command);
				}
				semanticCommand = new ICommandProxy(command);
			}
		}
		boolean shouldProceed = true;
		if (completedRequest instanceof DestroyRequest) {
			shouldProceed = shouldProceed((DestroyRequest) completedRequest);
		}
		if (shouldProceed) {
			if (completedRequest instanceof DestroyRequest) {
				TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
				Command deleteViewCommand = new ICommandProxy(new DeleteCommand(editingDomain, (View) getHost().getModel()));
				semanticCommand = semanticCommand == null ? deleteViewCommand : semanticCommand.chain(deleteViewCommand);
			}
			return semanticCommand;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * @generated
	 */
	protected final Command getMSLWrapper(ICommand cmd) {
		// XXX deprecated: use getGEFWrapper() instead
		return getGEFWrapper(cmd);
	}

	/**
	 * @generated
	 */
	protected EObject getSemanticElement() {
		return ViewUtil.resolveSemanticElement((View) getHost().getModel());
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Creates command to destroy the link.
	 * 
	 * @generated
	 */
	protected Command getDestroyElementCommand(View view) {
		EditPart editPart = (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		DestroyElementRequest request = new DestroyElementRequest(getEditingDomain(), false);
		return editPart.getCommand(new EditCommandRequestWrapper(request, Collections.EMPTY_MAP));
	}

	/**
	 * Creates commands to destroy all host incoming and outgoing links.
	 * 
	 * @generated
	 */
	protected CompoundCommand getDestroyEdgesCommand() {
		CompoundCommand cmd = new CompoundCommand();
		View view = (View) getHost().getModel();
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			cmd.add(getDestroyElementCommand((Edge) it.next()));
		}
		return cmd;
	}

	/**
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(CompoundCommand command) {
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			return;
		}
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			command.add(getDestroyElementCommand(nextView));
		}
	}

	/**
	 * @generated 
	 */
	public static class LinkConstraints {

		/**
		 * @generated 
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated 
		 */
		private static final UMLAbstractExpression Dependency_4002_TargetExpression;

		/**
		 * @generated 
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getNamedElement());
			Dependency_4002_TargetExpression = UMLOCLFactory.getExpression("not self.oclIsKindOf(uml::Interface)\r\n", UMLPackage.eINSTANCE.getNamedElement(), env); //$NON-NLS-1$
		}

		/**
		 * @generated 
		 */
		private static final UMLAbstractExpression InterfaceRealization_4008_TargetExpression;

		/**
		 * @generated 
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getBehavioredClassifier());
			InterfaceRealization_4008_TargetExpression = UMLOCLFactory.getExpression("self.oclIsKindOf(uml::Interface)", UMLPackage.eINSTANCE.getInterface(), env); //$NON-NLS-1$
		}

		/**
		 * @generated 
		 */
		private static final UMLAbstractExpression Usage_4013_SourceExpression;

		/**
		 * @generated 
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getNamedElement());
			Usage_4013_SourceExpression = UMLOCLFactory.getExpression("self.oclIsKindOf(uml::Classifier)", UMLPackage.eINSTANCE.getNamedElement(), env); //$NON-NLS-1$
		}

		/**
		 * @generated 
		 */
		private static final UMLAbstractExpression Usage_4013_TargetExpression;

		/**
		 * @generated 
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getNamedElement());
			Usage_4013_TargetExpression = UMLOCLFactory.getExpression("self.oclIsKindOf(uml::Interface)", UMLPackage.eINSTANCE.getNamedElement(), env); //$NON-NLS-1$
		}

		/**
		 * @generated
		 */
		private static final UMLAbstractExpression TemplateBinding_4016_TargetExpression;

		/**
		 * @generated
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getTemplateableElement());
			TemplateBinding_4016_TargetExpression = UMLOCLFactory.getExpression("self.ownedTemplateSignature <> null", UMLPackage.eINSTANCE.getTemplateableElement(), env); //$NON-NLS-1$
		}

		/**
		 * @generated
		 */
		private static final UMLAbstractExpression PortProvided_4017_SourceExpression;

		/**
		 * @generated
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getInterface());
			PortProvided_4017_SourceExpression = UMLOCLFactory
					.getExpression(
							"self.oclIsKindOf(uml::Port) and (self.oclAsType(uml::Port).type.oclIsUndefined() or self.oclAsType(uml::Port).type.oclIsKindOf(uml::Classifier))", UMLPackage.eINSTANCE.getPort(), env); //$NON-NLS-1$
		}

		/**
		 * @generated
		 */
		private static final UMLAbstractExpression PortRequired_4018_SourceExpression;

		/**
		 * @generated
		 */
		static {
			Map env = new HashMap(3);
			env.put(OPPOSITE_END_VAR, UMLPackage.eINSTANCE.getInterface());
			PortRequired_4018_SourceExpression = UMLOCLFactory.getExpression("self.oclIsKindOf(uml::Port)", UMLPackage.eINSTANCE.getPort(), env); //$NON-NLS-1$
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateGeneralization_4001(Classifier source, Classifier target) {
			return canExistGeneralization_4001(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateDependency_4002(Package container, NamedElement source, NamedElement target) {
			return canExistDependency_4002(container, source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateProperty_4003(Association source, Type target) {
			return canExistProperty_4003(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateConstraintConstrainedElement_4004(Constraint source, Element target) {
			if (source != null) {
				if (source.getConstrainedElements().contains(target)) {
					return false;
				}
			}
			return canExistConstraintConstrainedElement_4004(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateAssociation_4005(Package container, Type source, Type target) {
			return canExistAssociation_4005(container, source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateDependencySupplier_4006(Dependency source, NamedElement target) {
			if (source != null) {
				if (source.getSuppliers().contains(target)) {
					return false;
				}
			}
			return canExistDependencySupplier_4006(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateDependencyClient_4007(Dependency source, NamedElement target) {
			if (source != null) {
				if (source.getClients().contains(target)) {
					return false;
				}
			}
			return canExistDependencyClient_4007(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateInterfaceRealization_4008(BehavioredClassifier container, BehavioredClassifier source, Interface target) {
			return canExistInterfaceRealization_4008(container, source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateRealization_4010(Package container, NamedElement source, NamedElement target) {
			return canExistRealization_4010(container, source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateGeneralization_4011(Classifier source, GeneralizationSet target) {
			return canExistGeneralization_4011(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateGeneralizationGeneral_4012(Generalization source, Classifier target) {
			if (source != null) {
				if (source.getGeneral() != null) {
					return false;
				}
			}
			return canExistGeneralizationGeneral_4012(source, target);
		}

		/**
		 * @generated 
		 */
		public static boolean canCreateUsage_4013(Package container, NamedElement source, NamedElement target) {
			return canExistUsage_4013(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateAssociationClass_4014(Package container, CollaborationUse source, CollaborationUse target) {
			return canExistAssociationClass_4014(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateSlot_4015(InstanceSpecification container, InstanceSpecification source, InstanceSpecification target) {
			return canExistSlot_4015(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateTemplateBinding_4016(TemplateableElement container, TemplateableElement source, TemplateableElement target) {
			return canExistTemplateBinding_4016(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePortProvided_4017(Port source, Interface target) {
			if (source != null) {
				if (source.getProvideds().contains(target)) {
					return false;
				}
			}
			return canExistPortProvided_4017(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreatePortRequired_4018(Port source, Interface target) {
			if (source != null) {
				if (source.getRequireds().contains(target)) {
					return false;
				}
			}
			return canExistPortRequired_4018(source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistGeneralization_4001(Classifier source, Classifier target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependency_4002(Package container, NamedElement source, NamedElement target) {
			if (!evaluate(Dependency_4002_TargetExpression, target, source, true)) {
				return false;
			}
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistProperty_4003(Association source, Type target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistConstraintConstrainedElement_4004(Constraint source, Element target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAssociation_4005(Package container, Type source, Type target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependencySupplier_4006(Dependency source, NamedElement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependencyClient_4007(Dependency source, NamedElement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistInterfaceRealization_4008(BehavioredClassifier container, BehavioredClassifier source, Interface target) {
			if (!evaluate(InterfaceRealization_4008_TargetExpression, target, source, true)) {
				return false;
			}
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistRealization_4010(Package container, NamedElement source, NamedElement target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistGeneralization_4011(Classifier source, GeneralizationSet target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistGeneralizationGeneral_4012(Generalization source, Classifier target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistUsage_4013(Package container, NamedElement source, NamedElement target) {
			if (!evaluate(Usage_4013_SourceExpression, source, target, false)) {
				return false;
			}
			if (!evaluate(Usage_4013_TargetExpression, target, source, true)) {
				return false;
			}
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistAssociationClass_4014(Package container, CollaborationUse source, CollaborationUse target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistSlot_4015(InstanceSpecification container, InstanceSpecification source, InstanceSpecification target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistTemplateBinding_4016(TemplateableElement container, TemplateableElement source, TemplateableElement target) {
			if (!evaluate(TemplateBinding_4016_TargetExpression, target, source, true)) {
				return false;
			}
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPortProvided_4017(Port source, Interface target) {
			if (!evaluate(PortProvided_4017_SourceExpression, source, target, false)) {
				return false;
			}
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistPortRequired_4018(Port source, Interface target) {
			if (!evaluate(PortRequired_4018_SourceExpression, source, target, false)) {
				return false;
			}
			return true;
		}

		/**
		 * @generated 
		 */
		private static boolean evaluate(UMLAbstractExpression constraint, Object sourceEnd, Object oppositeEnd, boolean clearEnv) {
			if (sourceEnd == null) {
				return true;
			}
			Map evalEnv = Collections.singletonMap(OPPOSITE_END_VAR, oppositeEnd);
			try {
				Object val = constraint.evaluate(sourceEnd, evalEnv);
				return (val instanceof Boolean) ? ((Boolean) val).booleanValue() : false;
			} catch (Exception e) {
				UMLDiagramEditorPlugin.getInstance().logError("Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}
	}

}