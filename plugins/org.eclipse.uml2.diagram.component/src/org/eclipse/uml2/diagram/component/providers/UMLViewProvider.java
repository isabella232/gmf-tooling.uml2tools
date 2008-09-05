package org.eclipse.uml2.diagram.component.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactContents3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactName3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssemblyConnectorCircleEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssemblyConnectorEndRoleEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationName3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationName4EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationName5EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationName6EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationName7EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.AssociationNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassAttributesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassClassesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationClassStereotypeEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationInnerClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationOperationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassDiagramNotationPropertyEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassOperationsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package3EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageClassifiersEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackagePackagesEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortOnClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PropertyNameEditPart;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.component.view.factories.Artifact2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Artifact3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactContents2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactContents3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactContentsViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactName3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssemblyConnectorCircleViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssemblyConnectorEndRoleViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationName3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationName4ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationName5ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationName6ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationName7ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.AssociationViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Class2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Class3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassAttributesViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassClassesViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassDiagramNotationClassNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassDiagramNotationClassStereotypeViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassDiagramNotationClassViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassDiagramNotationInnerClassViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassDiagramNotationOperationViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassDiagramNotationPropertyViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassOperationsViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Component2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Component3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentContents2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentContentsViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentRequiredViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ConnectorViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.DependencyNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.DependencyViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ElementImportViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Interface2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceRealizationViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Package2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Package3ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Package4ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackageClassifiersViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackageImportsViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackageName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackageNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackagePackagesViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortOnClassViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortProvidedViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortRequiredViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PropertyNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PropertyViewFactory;

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
				if (domainElement != null && !UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
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
				case Class2EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && ClassDiagramNotationClassEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case ClassDiagramNotationClassEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && Class2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case ComponentEditPart.VISUAL_ID:
				case Artifact2EditPart.VISUAL_ID:
				case Interface2EditPart.VISUAL_ID:
				case Package2EditPart.VISUAL_ID:
				case Package3EditPart.VISUAL_ID:
				case Component2EditPart.VISUAL_ID:
				case PortEditPart.VISUAL_ID:
				case ArtifactEditPart.VISUAL_ID:
				case Artifact3EditPart.VISUAL_ID:
				case ClassEditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
				case PropertyEditPart.VISUAL_ID:
				case AssemblyConnectorCircleEditPart.VISUAL_ID:
				case ElementImportEditPart.VISUAL_ID:
				case Package4EditPart.VISUAL_ID:
				case Class3EditPart.VISUAL_ID:
				case Component3EditPart.VISUAL_ID:
				case ClassDiagramNotationPropertyEditPart.VISUAL_ID:
				case ClassDiagramNotationOperationEditPart.VISUAL_ID:
				case ClassDiagramNotationInnerClassEditPart.VISUAL_ID:
				case PortOnClassEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case ComponentName2EditPart.VISUAL_ID:
				case ComponentContentsEditPart.VISUAL_ID:
					if (ComponentEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ArtifactName2EditPart.VISUAL_ID:
				case ArtifactContents3EditPart.VISUAL_ID:
					if (Artifact2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceName2EditPart.VISUAL_ID:
					if (Interface2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassName2EditPart.VISUAL_ID:
					if (Class2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackageImportsEditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PackageName2EditPart.VISUAL_ID:
				case PackagePackagesEditPart.VISUAL_ID:
				case PackageClassifiersEditPart.VISUAL_ID:
					if (Package3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassDiagramNotationClassNameEditPart.VISUAL_ID:
				case ClassDiagramNotationClassStereotypeEditPart.VISUAL_ID:
				case ClassAttributesEditPart.VISUAL_ID:
				case ClassOperationsEditPart.VISUAL_ID:
				case ClassClassesEditPart.VISUAL_ID:
					if (ClassDiagramNotationClassEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ComponentNameEditPart.VISUAL_ID:
				case ComponentContents2EditPart.VISUAL_ID:
					if (Component2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortNameEditPart.VISUAL_ID:
					if (PortEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ArtifactNameEditPart.VISUAL_ID:
				case ArtifactContentsEditPart.VISUAL_ID:
					if (ArtifactEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ArtifactName3EditPart.VISUAL_ID:
				case ArtifactContents2EditPart.VISUAL_ID:
					if (Artifact3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ClassNameEditPart.VISUAL_ID:
					if (ClassEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:
					if (InterfaceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PropertyNameEditPart.VISUAL_ID:
					if (PropertyEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PortName2EditPart.VISUAL_ID:
					if (PortOnClassEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case ComponentEditPart.VISUAL_ID:
			return ComponentViewFactory.class;
		case ComponentName2EditPart.VISUAL_ID:
			return ComponentName2ViewFactory.class;
		case Artifact2EditPart.VISUAL_ID:
			return Artifact2ViewFactory.class;
		case ArtifactName2EditPart.VISUAL_ID:
			return ArtifactName2ViewFactory.class;
		case Interface2EditPart.VISUAL_ID:
			return Interface2ViewFactory.class;
		case InterfaceName2EditPart.VISUAL_ID:
			return InterfaceName2ViewFactory.class;
		case Class2EditPart.VISUAL_ID:
			return Class2ViewFactory.class;
		case ClassName2EditPart.VISUAL_ID:
			return ClassName2ViewFactory.class;
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case Package3EditPart.VISUAL_ID:
			return Package3ViewFactory.class;
		case PackageName2EditPart.VISUAL_ID:
			return PackageName2ViewFactory.class;
		case ClassDiagramNotationClassEditPart.VISUAL_ID:
			return ClassDiagramNotationClassViewFactory.class;
		case ClassDiagramNotationClassNameEditPart.VISUAL_ID:
			return ClassDiagramNotationClassNameViewFactory.class;
		case ClassDiagramNotationClassStereotypeEditPart.VISUAL_ID:
			return ClassDiagramNotationClassStereotypeViewFactory.class;
		case Component2EditPart.VISUAL_ID:
			return Component2ViewFactory.class;
		case ComponentNameEditPart.VISUAL_ID:
			return ComponentNameViewFactory.class;
		case PortEditPart.VISUAL_ID:
			return PortViewFactory.class;
		case PortNameEditPart.VISUAL_ID:
			return PortNameViewFactory.class;
		case ArtifactEditPart.VISUAL_ID:
			return ArtifactViewFactory.class;
		case ArtifactNameEditPart.VISUAL_ID:
			return ArtifactNameViewFactory.class;
		case Artifact3EditPart.VISUAL_ID:
			return Artifact3ViewFactory.class;
		case ArtifactName3EditPart.VISUAL_ID:
			return ArtifactName3ViewFactory.class;
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case PropertyEditPart.VISUAL_ID:
			return PropertyViewFactory.class;
		case PropertyNameEditPart.VISUAL_ID:
			return PropertyNameViewFactory.class;
		case AssemblyConnectorCircleEditPart.VISUAL_ID:
			return AssemblyConnectorCircleViewFactory.class;
		case ElementImportEditPart.VISUAL_ID:
			return ElementImportViewFactory.class;
		case Package4EditPart.VISUAL_ID:
			return Package4ViewFactory.class;
		case Class3EditPart.VISUAL_ID:
			return Class3ViewFactory.class;
		case Component3EditPart.VISUAL_ID:
			return Component3ViewFactory.class;
		case ClassDiagramNotationPropertyEditPart.VISUAL_ID:
			return ClassDiagramNotationPropertyViewFactory.class;
		case ClassDiagramNotationOperationEditPart.VISUAL_ID:
			return ClassDiagramNotationOperationViewFactory.class;
		case ClassDiagramNotationInnerClassEditPart.VISUAL_ID:
			return ClassDiagramNotationInnerClassViewFactory.class;
		case PortOnClassEditPart.VISUAL_ID:
			return PortOnClassViewFactory.class;
		case PortName2EditPart.VISUAL_ID:
			return PortName2ViewFactory.class;
		case ComponentContentsEditPart.VISUAL_ID:
			return ComponentContentsViewFactory.class;
		case ComponentContents2EditPart.VISUAL_ID:
			return ComponentContents2ViewFactory.class;
		case ArtifactContentsEditPart.VISUAL_ID:
			return ArtifactContentsViewFactory.class;
		case ArtifactContents2EditPart.VISUAL_ID:
			return ArtifactContents2ViewFactory.class;
		case ArtifactContents3EditPart.VISUAL_ID:
			return ArtifactContents3ViewFactory.class;
		case PackageImportsEditPart.VISUAL_ID:
			return PackageImportsViewFactory.class;
		case PackagePackagesEditPart.VISUAL_ID:
			return PackagePackagesViewFactory.class;
		case PackageClassifiersEditPart.VISUAL_ID:
			return PackageClassifiersViewFactory.class;
		case ClassAttributesEditPart.VISUAL_ID:
			return ClassAttributesViewFactory.class;
		case ClassOperationsEditPart.VISUAL_ID:
			return ClassOperationsViewFactory.class;
		case ClassClassesEditPart.VISUAL_ID:
			return ClassClassesViewFactory.class;
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
		case InterfaceRealizationEditPart.VISUAL_ID:
			return InterfaceRealizationViewFactory.class;
		case PortProvidedEditPart.VISUAL_ID:
			return PortProvidedViewFactory.class;
		case PortRequiredEditPart.VISUAL_ID:
			return PortRequiredViewFactory.class;
		case ComponentRequiredEditPart.VISUAL_ID:
			return ComponentRequiredViewFactory.class;
		case ConnectorEditPart.VISUAL_ID:
			return ConnectorViewFactory.class;
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
		case AssemblyConnectorEndRoleEditPart.VISUAL_ID:
			return AssemblyConnectorEndRoleViewFactory.class;
		case AssociationEditPart.VISUAL_ID:
			return AssociationViewFactory.class;
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
