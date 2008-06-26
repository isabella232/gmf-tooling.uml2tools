package org.eclipse.uml2.diagram.csd.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationInstanceEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationInstanceSourceEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationInstanceTargetEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName4EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName5EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName6EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationName7EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClass_contentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassQualifiedNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationContentsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUse2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUseName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName4EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName5EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName6EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorName7EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintConstrainedElementEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationSlotsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Port2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Port3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortIsBehavior2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortIsBehaviorEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortName3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyName2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationInstanceSourceViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationInstanceTargetViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationInstanceViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationName2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationName3ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationName4ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationName5ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationName6ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationName7ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.AssociationViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Class2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Class3ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassAttributesViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassClass_contentsViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassClassesViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassName2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassOperationsViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassQualifiedNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ClassViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.CollaborationContentsViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.CollaborationNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.CollaborationUse2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.CollaborationUseName2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.CollaborationViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorName2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorName3ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorName4ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorName5ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorName6ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorName7ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConnectorViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConstraintConstrainedElementViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConstraintNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ConstraintViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.DependencyNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.DependencyViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ElementImportViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.InstanceSpecificationNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.InstanceSpecificationSlotsViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.InstanceSpecificationViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.InterfaceNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.InterfaceRealizationViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.InterfaceViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.OperationViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Package2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PackageImportsViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PackageNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ParameterNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.ParameterViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Port2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Port3ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortIsBehavior2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortIsBehaviorViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortName2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortName3ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortProvidedViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortRequiredViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PortViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Property2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.Property3ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PropertyName2ViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PropertyNameViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.PropertyViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.SlotViewFactory;
import org.eclipse.uml2.diagram.csd.view.factories.UsageViewFactory;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (PackageEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return PackageViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
					return null; // visual id for node EClass should match visual id from element type, or at least be substitutable for it
				}
			} else {
				// Element type is not specified. Domain element should be present.
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case ClassEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && Class3EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case Class3EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && ClassEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case CollaborationEditPart.VISUAL_ID:
				case Package2EditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
				case InstanceSpecificationEditPart.VISUAL_ID:
				case ConstraintEditPart.VISUAL_ID:
				case CollaborationUse2EditPart.VISUAL_ID:
				case PropertyEditPart.VISUAL_ID:
				case ParameterEditPart.VISUAL_ID:
				case Property2EditPart.VISUAL_ID:
				case OperationEditPart.VISUAL_ID:
				case Class2EditPart.VISUAL_ID:
				case PortEditPart.VISUAL_ID:
				case ElementImportEditPart.VISUAL_ID:
				case Property3EditPart.VISUAL_ID:
				case Port2EditPart.VISUAL_ID:
				case Port3EditPart.VISUAL_ID:
				case SlotEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case CollaborationNameEditPart.VISUAL_ID:
				case CollaborationContentsEditPart.VISUAL_ID:
					if (CollaborationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassNameEditPart.VISUAL_ID:
				case ClassQualifiedNameEditPart.VISUAL_ID:
				case ClassAttributesEditPart.VISUAL_ID:
				case ClassOperationsEditPart.VISUAL_ID:
				case ClassClassesEditPart.VISUAL_ID:
					if (ClassEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackageImportsEditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassName2EditPart.VISUAL_ID:
				case ClassClass_contentsEditPart.VISUAL_ID:
					if (Class3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:
					if (InterfaceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InstanceSpecificationNameEditPart.VISUAL_ID:
				case InstanceSpecificationSlotsEditPart.VISUAL_ID:
					if (InstanceSpecificationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConstraintNameEditPart.VISUAL_ID:
					if (ConstraintEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CollaborationUseName2EditPart.VISUAL_ID:
					if (CollaborationUse2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PropertyNameEditPart.VISUAL_ID:
					if (PropertyEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ParameterNameEditPart.VISUAL_ID:
					if (ParameterEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortNameEditPart.VISUAL_ID:
				case PortIsBehaviorEditPart.VISUAL_ID:
					if (PortEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PropertyName2EditPart.VISUAL_ID:
					if (Property3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortName2EditPart.VISUAL_ID:
					if (Port2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortName3EditPart.VISUAL_ID:
				case PortIsBehavior2EditPart.VISUAL_ID:
					if (Port3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConnectorNameEditPart.VISUAL_ID:
				case ConnectorName2EditPart.VISUAL_ID:
				case ConnectorName3EditPart.VISUAL_ID:
				case ConnectorName4EditPart.VISUAL_ID:
				case ConnectorName5EditPart.VISUAL_ID:
				case ConnectorName6EditPart.VISUAL_ID:
				case ConnectorName7EditPart.VISUAL_ID:
					if (ConnectorEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyNameEditPart.VISUAL_ID:
					if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationNameEditPart.VISUAL_ID:
				case AssociationName2EditPart.VISUAL_ID:
				case AssociationName3EditPart.VISUAL_ID:
				case AssociationName4EditPart.VISUAL_ID:
				case AssociationName5EditPart.VISUAL_ID:
				case AssociationName6EditPart.VISUAL_ID:
				case AssociationName7EditPart.VISUAL_ID:
					if (AssociationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AssociationInstanceSourceEditPart.VISUAL_ID:
				case AssociationInstanceTargetEditPart.VISUAL_ID:
					if (AssociationInstanceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null || !UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case CollaborationEditPart.VISUAL_ID:
			return CollaborationViewFactory.class;
		case CollaborationNameEditPart.VISUAL_ID:
			return CollaborationNameViewFactory.class;
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case ClassQualifiedNameEditPart.VISUAL_ID:
			return ClassQualifiedNameViewFactory.class;
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case Class3EditPart.VISUAL_ID:
			return Class3ViewFactory.class;
		case ClassName2EditPart.VISUAL_ID:
			return ClassName2ViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case InstanceSpecificationEditPart.VISUAL_ID:
			return InstanceSpecificationViewFactory.class;
		case InstanceSpecificationNameEditPart.VISUAL_ID:
			return InstanceSpecificationNameViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case ConstraintNameEditPart.VISUAL_ID:
			return ConstraintNameViewFactory.class;
		case CollaborationUse2EditPart.VISUAL_ID:
			return CollaborationUse2ViewFactory.class;
		case CollaborationUseName2EditPart.VISUAL_ID:
			return CollaborationUseName2ViewFactory.class;
		case PropertyEditPart.VISUAL_ID:
			return PropertyViewFactory.class;
		case PropertyNameEditPart.VISUAL_ID:
			return PropertyNameViewFactory.class;
		case ParameterEditPart.VISUAL_ID:
			return ParameterViewFactory.class;
		case ParameterNameEditPart.VISUAL_ID:
			return ParameterNameViewFactory.class;
		case Property2EditPart.VISUAL_ID:
			return Property2ViewFactory.class;
		case OperationEditPart.VISUAL_ID:
			return OperationViewFactory.class;
		case Class2EditPart.VISUAL_ID:
			return Class2ViewFactory.class;
		case PortEditPart.VISUAL_ID:
			return PortViewFactory.class;
		case PortNameEditPart.VISUAL_ID:
			return PortNameViewFactory.class;
		case PortIsBehaviorEditPart.VISUAL_ID:
			return PortIsBehaviorViewFactory.class;
		case ElementImportEditPart.VISUAL_ID:
			return ElementImportViewFactory.class;
		case Property3EditPart.VISUAL_ID:
			return Property3ViewFactory.class;
		case PropertyName2EditPart.VISUAL_ID:
			return PropertyName2ViewFactory.class;
		case Port2EditPart.VISUAL_ID:
			return Port2ViewFactory.class;
		case PortName2EditPart.VISUAL_ID:
			return PortName2ViewFactory.class;
		case Port3EditPart.VISUAL_ID:
			return Port3ViewFactory.class;
		case PortName3EditPart.VISUAL_ID:
			return PortName3ViewFactory.class;
		case PortIsBehavior2EditPart.VISUAL_ID:
			return PortIsBehavior2ViewFactory.class;
		case SlotEditPart.VISUAL_ID:
			return SlotViewFactory.class;
		case CollaborationContentsEditPart.VISUAL_ID:
			return CollaborationContentsViewFactory.class;
		case ClassAttributesEditPart.VISUAL_ID:
			return ClassAttributesViewFactory.class;
		case ClassOperationsEditPart.VISUAL_ID:
			return ClassOperationsViewFactory.class;
		case ClassClassesEditPart.VISUAL_ID:
			return ClassClassesViewFactory.class;
		case PackageImportsEditPart.VISUAL_ID:
			return PackageImportsViewFactory.class;
		case ClassClass_contentsEditPart.VISUAL_ID:
			return ClassClass_contentsViewFactory.class;
		case InstanceSpecificationSlotsEditPart.VISUAL_ID:
			return InstanceSpecificationSlotsViewFactory.class;
		case ConnectorNameEditPart.VISUAL_ID:
			return ConnectorNameViewFactory.class;
		case ConnectorName2EditPart.VISUAL_ID:
			return ConnectorName2ViewFactory.class;
		case ConnectorName3EditPart.VISUAL_ID:
			return ConnectorName3ViewFactory.class;
		case ConnectorName4EditPart.VISUAL_ID:
			return ConnectorName4ViewFactory.class;
		case ConnectorName5EditPart.VISUAL_ID:
			return ConnectorName5ViewFactory.class;
		case ConnectorName6EditPart.VISUAL_ID:
			return ConnectorName6ViewFactory.class;
		case ConnectorName7EditPart.VISUAL_ID:
			return ConnectorName7ViewFactory.class;
		case DependencyNameEditPart.VISUAL_ID:
			return DependencyNameViewFactory.class;
		case AssociationNameEditPart.VISUAL_ID:
			return AssociationNameViewFactory.class;
		case AssociationName2EditPart.VISUAL_ID:
			return AssociationName2ViewFactory.class;
		case AssociationName3EditPart.VISUAL_ID:
			return AssociationName3ViewFactory.class;
		case AssociationName4EditPart.VISUAL_ID:
			return AssociationName4ViewFactory.class;
		case AssociationName5EditPart.VISUAL_ID:
			return AssociationName5ViewFactory.class;
		case AssociationName6EditPart.VISUAL_ID:
			return AssociationName6ViewFactory.class;
		case AssociationName7EditPart.VISUAL_ID:
			return AssociationName7ViewFactory.class;
		case AssociationInstanceSourceEditPart.VISUAL_ID:
			return AssociationInstanceSourceViewFactory.class;
		case AssociationInstanceTargetEditPart.VISUAL_ID:
			return AssociationInstanceTargetViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case ConnectorEditPart.VISUAL_ID:
			return ConnectorViewFactory.class;
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
		case InterfaceRealizationEditPart.VISUAL_ID:
			return InterfaceRealizationViewFactory.class;
		case UsageEditPart.VISUAL_ID:
			return UsageViewFactory.class;
		case PortProvidedEditPart.VISUAL_ID:
			return PortProvidedViewFactory.class;
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
		case ConstraintConstrainedElementEditPart.VISUAL_ID:
			return ConstraintConstrainedElementViewFactory.class;
		case PortRequiredEditPart.VISUAL_ID:
			return PortRequiredViewFactory.class;
		case AssociationInstanceEditPart.VISUAL_ID:
			return AssociationInstanceViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

}
