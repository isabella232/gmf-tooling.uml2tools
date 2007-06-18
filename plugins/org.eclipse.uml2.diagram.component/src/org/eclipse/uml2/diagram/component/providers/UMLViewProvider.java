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
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				if (!UMLElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
					return null;
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null;
				}
				if (domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null;
				}
			} else {
				if (domainElement == null) {
					return null;
				}
				switch (visualID) {
				case PackageEditPart.VISUAL_ID:
				case ComponentEditPart.VISUAL_ID:
				case Artifact2EditPart.VISUAL_ID:
				case Interface2EditPart.VISUAL_ID:
				case Class2EditPart.VISUAL_ID:
				case Component2EditPart.VISUAL_ID:
				case PortEditPart.VISUAL_ID:
				case ArtifactEditPart.VISUAL_ID:
				case ClassEditPart.VISUAL_ID:
				case InterfaceEditPart.VISUAL_ID:
				case InterfaceRealizationEditPart.VISUAL_ID:
				case PortProvidedEditPart.VISUAL_ID:
				case PortRequiredEditPart.VISUAL_ID:
					if (visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null;
					}
					break;
				case ComponentName2EditPart.VISUAL_ID:
				case ComponentContentsEditPart.VISUAL_ID:
					if (ComponentEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case ArtifactName2EditPart.VISUAL_ID:

					if (Artifact2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InterfaceName2EditPart.VISUAL_ID:

					if (Interface2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case ClassName2EditPart.VISUAL_ID:

					if (Class2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case ComponentNameEditPart.VISUAL_ID:
				case ComponentContents2EditPart.VISUAL_ID:
					if (Component2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case PortNameEditPart.VISUAL_ID:

					if (PortEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case ArtifactNameEditPart.VISUAL_ID:

					if (ArtifactEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case ClassNameEditPart.VISUAL_ID:

					if (ClassEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InterfaceNameEditPart.VISUAL_ID:

					if (InterfaceEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				default:
					return null;
				}
			}
		}
		if (!UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
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
		if (elementType == null) {
			return null;
		}
		if (!UMLElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
			return null;
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null;
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null;
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null;
		}
		switch (visualID) {
		case InterfaceRealizationEditPart.VISUAL_ID:
			return InterfaceRealizationViewFactory.class;
		case PortProvidedEditPart.VISUAL_ID:
			return PortProvidedViewFactory.class;
		case PortRequiredEditPart.VISUAL_ID:
			return PortRequiredViewFactory.class;
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
