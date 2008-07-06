package org.eclipse.uml2.diagram.deploy.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Artifact3EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ArtifactFileNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.CommunicationPathNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DependencyNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentConfigurationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeploymentSpecificationPropertiesEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Device2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontents2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceDevicecontentsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.DeviceNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironment2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifacts2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentArtifactsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ExecutionEnvironmentNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.ManifestationNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Node2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeName2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.NodeNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageImportsEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PackageNameEditPart;
import org.eclipse.uml2.diagram.deploy.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.deploy.view.factories.Artifact2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.Artifact3ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ArtifactFileName2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ArtifactFileNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ArtifactViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.CommunicationPathNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.CommunicationPathViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DependencyNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DependencyViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeploymentConfigurationViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeploymentNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeploymentSpecificationNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeploymentSpecificationPropertiesViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeploymentSpecificationViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeploymentViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.Device2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeviceDevicecontents2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeviceDevicecontentsViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeviceName2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeviceNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.DeviceViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ElementImportViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ExecutionEnvironment2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ExecutionEnvironmentArtifacts2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ExecutionEnvironmentArtifactsViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ExecutionEnvironmentName2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ExecutionEnvironmentNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ExecutionEnvironmentViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ManifestationNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.ManifestationViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.Node2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.NodeName2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.NodeNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.NodeViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.Package2ViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.PackageImportsViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.PackageNameViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.deploy.view.factories.PropertyViewFactory;

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
				case Package2EditPart.VISUAL_ID:
				case DeviceEditPart.VISUAL_ID:
				case NodeEditPart.VISUAL_ID:
				case ExecutionEnvironmentEditPart.VISUAL_ID:
				case Artifact2EditPart.VISUAL_ID:
				case DeploymentSpecificationEditPart.VISUAL_ID:
				case ElementImportEditPart.VISUAL_ID:
				case Device2EditPart.VISUAL_ID:
				case ArtifactEditPart.VISUAL_ID:
				case ExecutionEnvironment2EditPart.VISUAL_ID:
				case Artifact3EditPart.VISUAL_ID:
				case Node2EditPart.VISUAL_ID:
				case PropertyEditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case PackageNameEditPart.VISUAL_ID:
				case PackageImportsEditPart.VISUAL_ID:
					if (Package2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DeviceNameEditPart.VISUAL_ID:
				case DeviceDevicecontentsEditPart.VISUAL_ID:
					if (DeviceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NodeNameEditPart.VISUAL_ID:
					if (NodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExecutionEnvironmentNameEditPart.VISUAL_ID:
				case ExecutionEnvironmentArtifactsEditPart.VISUAL_ID:
					if (ExecutionEnvironmentEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ArtifactFileNameEditPart.VISUAL_ID:
					if (Artifact2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DeploymentSpecificationNameEditPart.VISUAL_ID:
				case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
					if (DeploymentSpecificationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DeviceName2EditPart.VISUAL_ID:
				case DeviceDevicecontents2EditPart.VISUAL_ID:
					if (Device2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ArtifactFileName2EditPart.VISUAL_ID:
					if (ArtifactEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExecutionEnvironmentName2EditPart.VISUAL_ID:
				case ExecutionEnvironmentArtifacts2EditPart.VISUAL_ID:
					if (ExecutionEnvironment2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case NodeName2EditPart.VISUAL_ID:
					if (Node2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DeploymentNameEditPart.VISUAL_ID:
					if (DeploymentEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ManifestationNameEditPart.VISUAL_ID:
					if (ManifestationEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CommunicationPathNameEditPart.VISUAL_ID:
					if (CommunicationPathEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DependencyNameEditPart.VISUAL_ID:
					if (DependencyEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case Package2EditPart.VISUAL_ID:
			return Package2ViewFactory.class;
		case PackageNameEditPart.VISUAL_ID:
			return PackageNameViewFactory.class;
		case DeviceEditPart.VISUAL_ID:
			return DeviceViewFactory.class;
		case DeviceNameEditPart.VISUAL_ID:
			return DeviceNameViewFactory.class;
		case NodeEditPart.VISUAL_ID:
			return NodeViewFactory.class;
		case NodeNameEditPart.VISUAL_ID:
			return NodeNameViewFactory.class;
		case ExecutionEnvironmentEditPart.VISUAL_ID:
			return ExecutionEnvironmentViewFactory.class;
		case ExecutionEnvironmentNameEditPart.VISUAL_ID:
			return ExecutionEnvironmentNameViewFactory.class;
		case Artifact2EditPart.VISUAL_ID:
			return Artifact2ViewFactory.class;
		case ArtifactFileNameEditPart.VISUAL_ID:
			return ArtifactFileNameViewFactory.class;
		case DeploymentSpecificationEditPart.VISUAL_ID:
			return DeploymentSpecificationViewFactory.class;
		case DeploymentSpecificationNameEditPart.VISUAL_ID:
			return DeploymentSpecificationNameViewFactory.class;
		case ElementImportEditPart.VISUAL_ID:
			return ElementImportViewFactory.class;
		case Device2EditPart.VISUAL_ID:
			return Device2ViewFactory.class;
		case DeviceName2EditPart.VISUAL_ID:
			return DeviceName2ViewFactory.class;
		case ArtifactEditPart.VISUAL_ID:
			return ArtifactViewFactory.class;
		case ArtifactFileName2EditPart.VISUAL_ID:
			return ArtifactFileName2ViewFactory.class;
		case ExecutionEnvironment2EditPart.VISUAL_ID:
			return ExecutionEnvironment2ViewFactory.class;
		case ExecutionEnvironmentName2EditPart.VISUAL_ID:
			return ExecutionEnvironmentName2ViewFactory.class;
		case Artifact3EditPart.VISUAL_ID:
			return Artifact3ViewFactory.class;
		case Node2EditPart.VISUAL_ID:
			return Node2ViewFactory.class;
		case NodeName2EditPart.VISUAL_ID:
			return NodeName2ViewFactory.class;
		case PropertyEditPart.VISUAL_ID:
			return PropertyViewFactory.class;
		case PackageImportsEditPart.VISUAL_ID:
			return PackageImportsViewFactory.class;
		case DeviceDevicecontentsEditPart.VISUAL_ID:
			return DeviceDevicecontentsViewFactory.class;
		case DeviceDevicecontents2EditPart.VISUAL_ID:
			return DeviceDevicecontents2ViewFactory.class;
		case ExecutionEnvironmentArtifacts2EditPart.VISUAL_ID:
			return ExecutionEnvironmentArtifacts2ViewFactory.class;
		case ExecutionEnvironmentArtifactsEditPart.VISUAL_ID:
			return ExecutionEnvironmentArtifactsViewFactory.class;
		case DeploymentSpecificationPropertiesEditPart.VISUAL_ID:
			return DeploymentSpecificationPropertiesViewFactory.class;
		case DeploymentNameEditPart.VISUAL_ID:
			return DeploymentNameViewFactory.class;
		case ManifestationNameEditPart.VISUAL_ID:
			return ManifestationNameViewFactory.class;
		case CommunicationPathNameEditPart.VISUAL_ID:
			return CommunicationPathNameViewFactory.class;
		case DependencyNameEditPart.VISUAL_ID:
			return DependencyNameViewFactory.class;
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
		case DeploymentEditPart.VISUAL_ID:
			return DeploymentViewFactory.class;
		case ManifestationEditPart.VISUAL_ID:
			return ManifestationViewFactory.class;
		case DeploymentConfigurationEditPart.VISUAL_ID:
			return DeploymentConfigurationViewFactory.class;
		case CommunicationPathEditPart.VISUAL_ID:
			return CommunicationPathViewFactory.class;
		case DependencyEditPart.VISUAL_ID:
			return DependencyViewFactory.class;
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
