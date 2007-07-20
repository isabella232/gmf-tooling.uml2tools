package org.eclipse.uml2.diagram.component.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContents2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentContentsEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceName2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortNameEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.component.view.factories.Artifact2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ArtifactViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Class2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ClassViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Component2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentContents2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentContentsViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentRequiredViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.ComponentViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.Interface2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceName2ViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceRealizationViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.InterfaceViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortNameViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortProvidedViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortRequiredViewFactory;
import org.eclipse.uml2.diagram.component.view.factories.PortViewFactory;

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
				if (domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null; // visual id for node EClass should match visual id from element type
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
				case ComponentEditPart.VISUAL_ID:
				case Artifact2EditPart.VISUAL_ID:
				case Interface2EditPart.VISUAL_ID:
				case Class2EditPart.VISUAL_ID:
				case Component2EditPart.VISUAL_ID:
				case PortEditPart.VISUAL_ID:
				case ArtifactEditPart.VISUAL_ID:
				case ClassEditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
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
					if (ArtifactEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case ClassEditPart.VISUAL_ID:
			return ClassViewFactory.class;
		case ClassNameEditPart.VISUAL_ID:
			return ClassNameViewFactory.class;
		case InterfaceEditPart.VISUAL_ID:
			return InterfaceViewFactory.class;
		case InterfaceNameEditPart.VISUAL_ID:
			return InterfaceNameViewFactory.class;
		case ComponentContentsEditPart.VISUAL_ID:
			return ComponentContentsViewFactory.class;
		case ComponentContents2EditPart.VISUAL_ID:
			return ComponentContents2ViewFactory.class;
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
