package org.eclipse.uml2.diagram.component.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

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
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = UMLVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
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
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		if (UMLElementTypes.PortProvided_4006.equals(elementType)) {
			return PortProvidedViewFactory.class;
		}
		if (UMLElementTypes.PortRequired_4004.equals(elementType)) {
			return PortRequiredViewFactory.class;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(semanticElement, semanticType);
		switch (linkVID) {
		case InterfaceRealizationEditPart.VISUAL_ID:
			return InterfaceRealizationViewFactory.class;
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter, containerView, semanticHint);
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

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
